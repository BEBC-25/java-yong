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

-- 이메일을 소문자/대문자로 조회
SELECT email, LOWER(email) AS email_lower, UPPER(email) AS email_upper
FROM MEMBER;

-- 이메일 앞뒤 공백 제거
SELECT email, TRIM(email)  AS trimmed_email
FROM MEMBER;


-- 현재 날짜와 시간을 조회
SELECT NOW() AS current_datetime;

-- 게시글 작성일을 "연 월 일 요일 시 분 초"형식으로 조회
SELECT id, title, created_at, DATE_FORMAT(created_at, '%Y년 %m월 %d일 %a %H시 %i분 %s초') AS write_date
FROM post;

-- 현재 날짜만 조회
SELECT CURDATE() AS curr_date;

-- 오늘 작성된 게시글만 조회
SELECT id, title, created_at
FROM post
WHERE created_at >= CURDATE();

-- 최근 7일 이내에 가입한 회원 조회
SELECT id, name, created_at, CURDATE(), DATE_SUB(CURDATE(), INTERVAL 7 DAY) AS before_7days
FROM MEMBER
WHERE created_at >= DATE_SUB(CURDATE(), INTERVAL 7 DAY);

-- 가입한 지 1개월이 지난 회원 조회
SELECT *, DATE_SUB(CURDATE(), INTERVAL 1 MONTH) AS before_1month
FROM MEMBER
WHERE created_at < DATE_SUB(CURDATE(), INTERVAL 1 MONTH);

-- 가입한 지 35일 12시간이 지난 회원 조회
SELECT *, DATE_SUB(CURDATE(), INTERVAL '35 12' DAY_HOUR) AS before_1month
FROM MEMBER
WHERE created_at < DATE_SUB(CURDATE(), INTERVAL '35 12' DAY_HOUR);

-- 각 회원의 가입 경과일수를 조회
SELECT name, created_at, DATEDIFF(CURDATE(), created_at) AS days_since_join
FROM MEMBER;






