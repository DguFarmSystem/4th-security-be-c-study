# 🌱 BE-C 팀 과제 리포지토리

## 📚 학습 목표

> IntelliJ 설치 + Git 사용법을 익히고, Spring Boot 프로젝트를 시작하는 방법을 배워봅니다!

---

## ✅ 사전 준비 체크리스트

- [ ] Java 17 설치 확인  
- [ ] IntelliJ 설치 확인

---

# 🗓️ 1일차 - IntelliJ 설치 & Git 연동

## 📝 과제 1 - 커밋하고 푸쉬하기

1. GitHub - IntelliJ 연동  
   🔗 참고 블로그: [GitHub 연동 방법](https://brunch.co.kr/@mystoryg/168)

2. 레포지토리 주소  
   📦 [4th-security-be-c-study](https://github.com/DguFarmSystem/4th-security-be-c-study)

3. IntelliJ에서 `Clone Repository` 선택 → 위 레포 클론

4. ⬇️ `README.md` 맨 아래 팀원 명단에 자기 이름 추가 후 커밋  
   ✏️ 커밋 메시지 예시: [docs] 과제 1 - Readme 수정하기 (김파머)

5. Git → Commit → Push

6. PR 생성  
✏️ PR 제목 예시: [docs] 과제 1 - Readme 수정하기 (김파머)


> ⚠️ `.gitignore`는 이번 과제에선 생략하지만, 실제 프로젝트에선 반드시 작성해야 합니다.  
> 민감한 정보(`application.yml` 등)가 외부에 노출되면 큰 문제가 될 수 있어요!

---

## 📌 과제 2 - 이슈 & 브랜치 실습

1. GitHub에서 이슈 생성  
✏️ 이슈 제목 예시: [docs] 과제 2 - 이슈 만들기 (김파머)

2. 이슈 번호 확인 후 브랜치 생성  
✏️ 브랜치명 예시: docs/#1-kfm


3. `README.md`에 **이름 / 학과 / 학번** 추가 후 커밋  
예:  김파머 / 컴퓨터공학과 / 2025111111


4. PR 생성 및 main 브랜치로 병합  
🔗 참고 블로그: [브랜치 생성부터 Merge까지](https://alwaysgame.tistory.com/entry/Github-Branch-%EC%83%9D%EC%84%B1-pull-request%EB%A1%9C-merge-%ED%95%B4%EB%B3%B4%EA%B8%B0)

---

# 🗓️ 2~3일차 - Spring Boot 시작하기

## 🚀 과제 3 - Spring Initializr로 프로젝트 만들기

1. [Spring Initializr](https://start.spring.io)에서 Spring Boot 프로젝트 생성 (의존성 포함)

2. 생성한 프로젝트를 레포지토리 폴더에 덮어쓰기

3. IntelliJ에서 프로젝트 로딩  
⏳ 처음엔 시간이 조금 걸릴 수 있어요!

4. 오류 발생 시 `Gradle refresh`  
(우측 상단의 새로고침 아이콘)

5. 간단한 컨트롤러 + HTML 작성 → `http://localhost:8080` 정상 동작 확인

---

# 🗓️ 4일차 - ERD 설계

## 🧩 과제 4 - ERD 설계

1. [ERD Cloud](https://www.erdcloud.com/) 가입 후 팀 ERD 생성

2. 다음 조건을 바탕으로 팀원들과 함께 설계 진행

### ERD 요구사항

- 회원은 닉네임, 프로필 사진, 가입일을 가진다.
- 회원은 게시글을 작성, 수정, 삭제할 수 있다.
- 게시글은 제목, 내용, 여러 장의 사진, 생성일, 수정일을 가진다.
- 회원은 게시글에 좋아요 및 댓글을 작성할 수 있다.
- 댓글은 내용, 생성일, 수정일을 가진다.
- 회원은 자신이 작성한 글 / 좋아요한 글을 모아볼 수 있다.

---

# 🗓️ 5~7일차 - MVC 패턴 & CRUD

## 💡 과제 5 - MVC 패턴 학습

1. Spring MVC 패턴 학습 (Controller → Service → Repository)

2. 학습 내용을 개인 블로그에 정리하고 아래에 링크 추가

📎 블로그 링크 예시:
- 김파머: [https://myblog.com/kpm-springmvc](https://myblog.com/kpm-springmvc)

---

## 🛠️ 과제 6 - DB 연동 및 게시판 CRUD 구현

1. MySQL 설치 및 설정

2. `application.yml` 또는 `application.properties`에 DB 연결 정보 작성

3. 게시판 기능 구현 (회원 기능 없이 아래만 개발)

- [x] 글 작성 (POST)
- [x] 전체 글 목록 조회 (GET)
- [x] 특정 글 상세 조회 (GET)
- [x] 글 수정 (PATCH / PUT)
- [x] 글 삭제 (DELETE)

4. Postman으로 API 테스트 진행  
🔗 참고 블로그: [Spring Boot 간단한 CRUD 게시판 구현](https://velog.io/@jiyoonee/Spring-boot-간단한-CRUD-게시판-구현하기)

---

## 👥 팀원 명단

- 김파머 / 컴퓨터공학과 / 2025111111  
- (팀원들은 여기에 계속 추가해주세요!)
- 박혜린 / 컴퓨터공학전공 / 2023112563
---

🎉 실습을 통해 Git, IntelliJ, Spring Boot, 그리고 협업의 기본기를 탄탄하게 익혀봅시다!  
필요한 건 **구글링 + 멘토에게 질문 + Discord 소통 + GPT** 로 해결해보세요 💪


