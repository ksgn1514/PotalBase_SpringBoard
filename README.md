# 위버스 주말반 포털 사이트
<br/>
<p align="center">
  <img  alt="7" src="http://www.weavus-group.com/assets/img/weavus%20CI.png">
</p>

## Description

위버스 주말반 스터디 그룹원간에 스터디 내용정리, 과제 제출등이 가능하도록 게시판기능을 바탕으로한 포털 사이트 프로젝트입니다.
Spring Boot의 게시판 프로젝트 스터디한 내용을 바탕으로 실무에 사용 가능하도록 로그인, 게시판, 근태관리등의 기능을 가진 포털 사이트를 구현하고 배포하여 개발역량과 팀 협업 능력을 키우는 것을 목표로 한다.

## Contributors
-
## Features

#### 로그인
1. 처음 접속 시 메인화면을 로그인으로 설정
2. 토큰을 이용하여 유저가 비로그인 시 마이페이지, 게시판 페이지 안보이게 설정
3. 로그인 시 userId, userPw가 일치하는지 체크
4. input에 userId, userPw 정보가 다 들어왔는지 확인
5. SNS로그인(깃허브/카카오톡) 기능
#### 회원가입
1. 아이디 및 비밀번호 글자 수 제한
2. 아이디 중복 체크
3. 학교 검색 및 학번 추가 기능
4. input에 정보가 다 들어왔는지 확인하고 회원가입 승인
5. SNS회원가입(깃허브/카카오톡) 기능
#### 게시판
1. 게시판 글 작성 기능(300자 이내)
2. 게시판 글 작성 시 익명 기능 및 작성시간 추가
3. 등록된 게시글 좋아요 및 댓글 기능 추가
4. 게시판 페이지네이션 기능 추가
5. 게시판 생성기능
#### 근태관리
1. 출퇴근 기록
2. 현장특성 저장 기능
3. 월별 조회 및 근무시간 계산 기능
4. 엑셀 출력기능


## 개발환경

### Language
- Java　11.0.19
- Javascript
  
### Framework
- springframework.boot version '2.7.13'
- Mybatis

  
### Database
- mariaDB
  
### Library
- thymeleaf
- hikariCP
- lombok




