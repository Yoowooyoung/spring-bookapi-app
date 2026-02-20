# 프로젝트 설명
[Spring] 도서 관리 API
목표 : Spring Boot로 기본적인 CRUD REST API 구현

# 프로젝트 버전
버전: JDK 17<br>
의존성(Dependencies): Spring Web, Spring Data JPA, H2 Database

# 프로젝트 구조
src/main/java/com/example/spring-bookapi-app/<br>
├── controller/<br>
│&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└── BookController.java<br>
├── service/<br>
│&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└── BookService/<br>
├── repository/<br>
│&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└── BookRepositoryIfs<br>
├── entity/<br>
│&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└── Book.java<br>
└── BookapiApplication.java<br>

# 시작 가이드
BookapiApplication 실행<br>

# 도메인
http://localhost:8080/api/books
