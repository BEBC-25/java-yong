-- 가장 오래된 회원의 가입일
SELECT MIN(created_at) FROM MEMBER;

-- 회원 정보 조회
SELECT * FROM MEMBER;

-- 가장 오래전에 가입한 회원의 정보 조회(하드코딩)
SELECT * 
FROM MEMBER
WHERE created_at = '2025-05-10 12:13:45';

-- 가장 오래전에 가입한 회원의 정보 조회(서브쿼리 사용)
SELECT * 
FROM MEMBER
WHERE created_at = (SELECT MIN(created_at) FROM MEMBER);


-- 게시글을 하나라도 작성한 회원 id 추출
SELECT DISTINCT member_id FROM post WHERE member_id IS NOT NULL;

-- id가 1, 2인 회원 조회
SELECT * 
FROM MEMBER
WHERE id IN (1, 2);

-- 게시글을 하나라도 작성한 회원의 정보 조회























