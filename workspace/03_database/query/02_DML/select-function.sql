-- 회원 이름과 이메일을 결합해서 조회
SELECT name, email, CONCAT(name, ' (', email, ')') AS member_info
FROM MEMBER;

-- 각 회원의 이메일 바이트 크기 조회
SELECT email, LENGTH('hello'), LENGTH('안녕하세요'), LENGTH(email) AS email_length
FROM MEMBER;

-- 게시글 본문 중 '안녕하세요'가 있는 내용을 찾아서 Hi로 수정
SELECT content, REPLACE(content , '안녕하세요', 'Hi') AS replaced_content
FROM post
WHERE content LIKE '%안녕하세요%';

-- 게시글 본문의 첫 10글자만 미리보기로 가져오기(잘린 뒷부분은 ...으로 표시하세요.)
SELECT title, CONCAT(SUBSTR(title, 1, 10), '...') AS preview
FROM post;





















