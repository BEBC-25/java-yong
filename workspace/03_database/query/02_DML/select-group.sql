-- 각 회원별로 작성한 게시글 개수를 조회
SELECT member_id, COUNT(*)
FROM post
GROUP BY member_id;

-- 각 게시글 별로 댓글수 조회 (댓글 수로 내림차순 정렬)
SELECT post_id, COUNT(*) AS reply_count
FROM reply
GROUP BY post_id
ORDER BY reply_count DESC;

-- 회원별로 작성한 게시글의 수, 총 조회수 조회 (게시글 오름차순, 조회수 내림차순 정렬)
SELECT member_id, COUNT(*) AS post_count, SUM(view_count) AS total_views
FROM post
GROUP BY member_id
ORDER BY post_count, total_views DESC;

-- 가입 연도별 회원수 조회
SELECT DATE_FORMAT(created_at, '%Y') AS join_year, COUNT(*) join_count
FROM MEMBER
GROUP BY DATE_FORMAT(created_at, '%Y');






























