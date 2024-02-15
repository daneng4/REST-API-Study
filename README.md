# RESTful-API-Study
> RESTful API 개발 및 학습 내용을 기록하기 위한 레포지토리 입니다.

IDE : IntelliJ <br>
Language : JAVA <br>
Environment : Spring Boot <br>

## 🤔 REST란?

REST (Representational State Transfer) 의 약자로 자원을 이름으로 구분해 해당 자원의 상태를 주고받는 모든 것을 의미.
<br>
즉, HTTP URI 를 통해 자원을 명시하고 HTTP Method를 통해 해당 자원에 대한 CRUD Operation을 적용하는 것을 의미한다.

### ✔️ CRUD Operation

CRUD는 대부분의 컴퓨터 소프트웨어가 가지는 기본적인 데이터 처리 기능으로 Create, Read, Update, Delete를 묶어서 일컫는 말이다.
<br>
REST에서 CRUD 동작 예시는 다음과 같다.

- Create -> 데이터 생성 (POST)
- Read -> 데이터 조회 (GET)
- Update -> 데이터 수정 (PUT, PATCH)
- Delete -> 데이터 삭제 (DELETE)

### ✔️ REST의 구성요소

- 자원(Resource) -> HTTP URI
- 자원에 대한 행위 -> HTTP Method
- 자원에 대한 행위의 내용(Representations) -> HTTP Message Pay Load

### ✔️ REST의 특징

- 서버-클라이언트 구조
- 무상태
- 캐시 처리 가능
- 계층화
- 인터페이스 일관성

## 😯 RESTful이란?

RESTful 이란 REST 원리를 따르는 시스템을 의미한다. <br>
하지만 REST를 사용했다 하여 모두 RESTful한 것은 아니며 REST API 설계 규칙을 올바르게 지킨 시스템을 <br>
RESTful 하다고 할 수 있다. <br>
만약 CRUD 기능을 전부 POST로 처리한다거나 URI 규칙을 올바르게 지키지 않은 API는 REST API를 사용했지만 <br>
RESTful 하지 못한 시스템이라고 할 수 있다.


## 😊 RESTful API란?

RESTful API란 위에서 서술한 REST의 원리를 따르는 API를 말한다. <br>
REST API를 올바르게 설계하기 위한 규칙들에 대해 알아보자

- URI는 동사보단 명사를, 대문자 보단 소문자를 사용한다.<br>
`Not RESTful : https://github.com/daneng4/Page1` <br>
`RESTful : https://github.com/daneng4/page1`

- URI의 마지막에 (/)를 포함하지 않는다. <br>
`Not RESTful : https://github.com/daneng4/page1/` <br>
`RESTful : https://github.com/daneng4/page1`

- 언더바 '_' 대신 하이픈을 사용한다. <br>
`Not RESTful : https://github.com/daneng4/main_page` <br>
`RESTful : https://github.com/daneng4/main-page`

- 파일 확장자는 URI에 포함하지 않는다. <br>
`Not RESTful : https://github.com/daneng4/img.jpg` <br>
`RESTful : GET https://github.com/daneng4/img  HTTP/1.1 Host: restapi.example.com Accept: img/jpg <-Accept 헤더를 사용하도록 한다.`

- 행위를 포함하지 않는다. <br>
  - 회원을 조회할 때 <br>
  `Not RESTful : /members/show/id_1` <br>
  `RESTful : GET /members/id_1`
  - 회원을 추가할 때 <br>
  `Not RESTful : /members/insert/id_10` <br>
  `RESTful : POST /members/id_10`





