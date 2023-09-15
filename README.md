# hello-board

#### 게시글
- POST
  - `/api/post`
  - Body : title, content
- GET
  - `/api/get`
- GET
  - `/api/info?id={}`
  - Param : id
- DELETE
    - `/api/delete?id={}`
    - Param : id
- PUT
    - `/api/update`
    - Body : id, title, content

#### 좋아요
- POST
    - `/api/like`
    - Body : boardId

#### 댓글
- POST
    - `/api/post/comment?boardId={}`
    - Param : boardId (현재 게시글 id)
    - Body : content, authorName
- GET
    - `/api/get/comment?boardId={}`
    - Param : boardId (현재 게시글 id)
