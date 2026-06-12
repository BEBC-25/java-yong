show databases;

-- board_db라는 이름의 데이터베이스 생성
CREATE DATABASE board_db;

-- 생성한 데이터베이스로 전환하여 이후 쿼리가 해당 데이터베이스를 대상으로 실행되도록 설정
USE board_db;

-- 필요 없는 board_db 데이터베이스 삭제 (삭제 시 내부의 모든 테이블과 데이터가 영구히 소멸되므로 주의 필요)
DROP DATABASE board_db;

-- 회원 테이블 삭제
drop table member;

-- 회원 테이블 생성
create table member (
    id int auto_increment primary key,
    email varchar(100) not null unique,
    password varchar(255) not null,
    name varchar(100) not null,
    created_at datetime default CURRENT_TIMESTAMP
);

-- 게시글 테이블 생성
create table post(
                     id int auto_increment primary key,
                     user_id int not null ,
                     title varchar(100)	not null,
                     content text not null,
                     created_at datetime default current_timestamp,
                     foreign KEY (user_id) references member(id) on delete CASCADE
);


insert into post (user_id, title, content) values
                                               (1,'안녕하세요.', '반가워요' ),
                                               (2,'질문 있어요.', 'DB는 어렵나요?'),
                                               (1,'두번째 게시글', '오늘 날씨가 좋네요'),
                                               (2,'MySQL 설치 오류가 났어요', '어떻게 할까요?'),
                                               (3,'자기소개', '안녕하세요. 용쌤입니다.')
;


-- 댓글 테이블 생성

create table reply (
                       id int auto_increment primary key,
                       post_id int not null,
                       user_id int not null,
                       content text not null,
                       created_at datetime default current_timestamp,
                       foreign key (post_id) references post(id) on delete cascade,
                       foreign key (user_id) references member(id) on delete cascade
);
