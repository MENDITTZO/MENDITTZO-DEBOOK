# 책론을박 :books:
![Group 19](https://github.com/user-attachments/assets/febad6e0-39f8-4d57-84ac-ea8a8d3cd522)

# :one: 프로젝트 개요
한강 작가의 노벨문학상 소식과 함께 독서의 바람이 불어오고 있습니다. 막 책을 읽기 시작한 호기심 많은 초보 독서가들, 오랜 시간 책 속에 빠져 살아온 독서가들 모두를 위한 플랫폼 '책론을박'을 소개합니다.


책론을박은 수많은 도서 목록을 제공하고, 자신이 읽은 책에 대한 소중한 감상을 공유하는 것에서 그치지 않고, 책으로부터 얻은 풍부한 영감을 나눌 수 있는 장소를 제공합니다.

## 🌐주요 기능

### :one: 카카오 API를 이용한 소셜 로그인
카카오 소셜 로그인을 통해 보다 편하게 서비스에 접근할 수 있습니다.
### :two: 엘라스틱 서치를 이용한 도서 검색
엘라스틱 서치를 이용해 보다 정확하고 빠른 도서 검색 결과를 얻을 수 있습니다.

![elastic](https://github.com/user-attachments/assets/2bc078b3-61e9-4681-b700-08f7d92dcb80)

### :three: WebSocket, STOMP와 Redis를 활용한 독서 토론방
실시간으로 생성과 참여가 가능한 독서 토론방을 이용할 수 있습니다.
![websocket](https://github.com/user-attachments/assets/9f4e3eaa-da2b-4aee-99cc-d460a73057d7)


### :four: Gemini AI를 이용한 도서 추천
책을 고르기 어려울 때 나의 취향에 맞는 책을 Gemini AI와의 대화를 통해 찾을 수 있습니다.

<hr>

### 1. 기술 스택

<img src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=Spring&logoColor=white"><img src="https://img.shields.io/badge/SpringBoot-6DB33F?style=for-the-badge&logo=Spring Boot&logoColor=white"><img src="https://img.shields.io/badge/Vue-4FC08D?style=for-the-badge&logo=Vue.js&logoColor=white"><img src="https://img.shields.io/badge/MariaDB-003545?style=for-the-badge&logo=MariaDB&logoColor=white"><img src="https://img.shields.io/badge/MongoDB-47A248?style=for-the-badge&logo=MongoDB&logoColor=white"><img src="https://img.shields.io/badge/Redis-FF4438?style=for-the-badge&logo=Redis&logoColor=white"><img src="https://img.shields.io/badge/Jenkins-D24939?style=for-the-badge&logo=Jenkins&logoColor=white"><img src="https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white"><img src="https://img.shields.io/badge/kubernetes-326CE5?style=for-the-badge&logo=kubernetes&logoColor=white"><img src="https://img.shields.io/badge/amazon s3-569A31?style=for-the-badge&logo=amazon s3&logoColor=white"><img src="https://img.shields.io/badge/elastic search-005571?style=for-the-badge&logo=elasticsearch&logoColor=white">

### 2. 프로젝트 아키텍처
![ARCHI](https://github.com/user-attachments/assets/dc17bd74-5d4a-4817-a258-8f86155cb4b8)

# :two: 개발 팀 소개
### 한화시스템 BEYOND SW캠프 10기 터치다운 ###

| [![](https://avatars.githubusercontent.com/u/77000498?v=4)](https://github.com/we4sley) | [![](https://avatars.githubusercontent.com/u/103301589?v=4)](https://github.com/kimjm9911) | [![](https://avatars.githubusercontent.com/u/174981455?v=4)](https://github.com/eunseo-76) | [![](https://avatars.githubusercontent.com/u/50124987?v=4)](https://github.com/JungUiJin) | [![](https://avatars.githubusercontent.com/u/58172997?v=4)](https://github.com/enking) | [![](https://avatars.githubusercontent.com/u/132972216?v=4)](https://github.com/HanDJ00)|
|:---:|:---:|:---:|:---:|:---:|:---:|
| 김영기 | 김지민 | 이은서 | 정의진 | 최두혁 | 한동주


# :three: 협업 전략
### 1. 브랜치 전략
![git-flow](https://github.com/user-attachments/assets/2d7e2ef4-df03-4c5f-8c78-316065100dde)
- **main**: 배포용 branch
- **develop**: 실질적 main branch
- **feature**: 각 기능을 개발하는 branch
- 브랜치명은 '태그/도메인/#이슈번호' 의 형식을 따른다.
  - 예) feat/user/#12
- 기능 단위로 브랜치를 생성하며, 커밋 단위는 가능한 작게 조절한다. 한 번에 여러 클래스를 커밋하지 않고, Pull Request에 너무 많은 커밋이 포함되지 않도록 한다.

### 2. Issue
- 이슈 템플릿을 활용하여 다른 사람이 알기 쉽게 이슈를 작성한다.
- 이슈 작성 후 발급된 #이슈번호를 이용해 브랜치를 생성한다.

![issue_template](https://github.com/user-attachments/assets/eed8bc02-ed2c-49d3-8262-c96478b21c5b)
![issue](https://github.com/user-attachments/assets/c5f1a66d-467d-404e-b26f-b37f3992a7f5)


### 3. Pull Request
- Pull Request의 제목은 '태그/도메인 개발 내용' 의 형식을 따른다.
- 예) feat/user 개발 내용

![pr_1](https://github.com/user-attachments/assets/8f3f4f03-5e50-4d26-8963-18ece4f3ebfa)
![pr_2](https://github.com/user-attachments/assets/fd1b75e4-9a81-49b4-b3d3-d1fd365b8ca4)
![pr_3](https://github.com/user-attachments/assets/fb8650a6-6183-4644-a971-3ca22412544d)

### 4. 커밋 메시지 컨벤션
- 태그<br/>
```feat```: 기능 개발<br/>
```fix```: 버그 수정<br/>
```docs```: 문서 작성 및 수정<br/>
```style```: 코드 리팩토링 등 내용상 변경이 없는 경우<br/>
```test```: 테스트 코드<br/>
```chore```: 자잘한 수정사항<br/><br/>
- 커밋 메시지는 '태그: #이슈번호 내용' 의 형식을 따른다.
- 예) docs: #43 ReadMe 수정

![commit](https://github.com/user-attachments/assets/f4261d3e-7bba-41b8-8b21-5ade721c9da5)

### 5. 네이밍 규칙
- **클래스명**: PascalCase
- **메소드명**, **필드명**: camelCase
```
public class User{

    public void fetchUserInfo(){

        private Long userId;
       private String userName;
    }
}
```
- DTO명: ~DTO 예) ```UserRequestDTO```
- 기타 모호한 단어는 도메인 정의서에 작성한다.

### 6. 기타 규칙
- 가독성을 위해 클래스 첫 줄은 띄어쓰고, 의미 없는 공백은 줄인다.
- 최대 tap depth = 2
- magic number 사용 자제, 상수화
- 커밋 전 정렬(```ctrl + alt + L```)
- 커밋 전 사용하지 않는 import문 삭제(```ctrl + alt + o```)



# :four: 프로젝트 설계 문서
## 1. DDD 설계
:point_right: [DDD 설계 보기 - Miro](https://miro.com/app/board/uXjVLNZH4nw=/)

![ddd](https://github.com/user-attachments/assets/e94bbdbf-27a6-42fc-92e5-aaa010af290a)

## 2. UI 설계
:point_right: [UI 설계 보기 - Figma](https://www.figma.com/design/A5tRWd8g8sqnmVyvuK297V/%EC%B1%85%EB%A1%A0%EC%9D%84%EB%B0%95?node-id=0-1&node-type=canvas&t=ebZHyucA5oZIpbFN-0)
![FIGMA_1](https://github.com/user-attachments/assets/f1563efa-e8a0-4c00-ac6a-a6f27afb752c)
![FIGMA_2](https://github.com/user-attachments/assets/451ccc11-2272-47f8-9c12-477f5f09c260)
![FIGMA_3](https://github.com/user-attachments/assets/2e538877-bb64-4623-be0b-d80f6259f901)
![FIGMA_4](https://github.com/user-attachments/assets/731fdec8-44fb-4fa7-ac2a-e6c2dc528ac8)

## 3. 요구사항 명세서
:point_right: [요구사항 명세서](https://docs.google.com/spreadsheets/d/1oddc-l1flUAqUNzAMt8jnrshAidp2dHnd1w2Sz5JxWA/edit?gid=1147247037#gid=1147247037)
![요구사항 명세서 이미지](./asset/image/요구사항%20명세서%20캡쳐본.PNG)

## 4. ERD
![ERD 이미지](./asset/image/ERD%20캡쳐본.PNG)

# :five: 기능 수행 테스트
 <details>
   <summary>메인 페이지</summary>
   <div markdown="1">
  
## 메인페이지
    
![메인페이지](https://github.com/user-attachments/assets/886826c7-d658-44c8-b651-ef91f94f3a39))   

- 메인 페이지 화면으로 로그인과 도서 검색을 할 수 있고 리뷰 많은 책 순위, 독서 토론방, 최근 도서 목록을 간단하게 볼 수 있으며 네비게이션을 통해 도서 목록, 도서 추천, 독서 토론방으로 이동할 수 있다.
    
</div>
</details>

 <details>
   <summary>도서 추천 챗봇</summary>
   <div markdown="1">
  
## 도서 추천 챗봇 응답 받아오기
    
![챗봇 응답](./asset/image/도서%20챗봇%20기능/도서%20추천%20챗봇%20응답%20불러오기%20gif.gif)   

- 채팅창에 사용자가 메시지를 입력해 챗봇에게 보내면 챗봇이 그 채팅에 대해 알맞은 답변을 응답하여 받아온 후 위의 채팅창에 그 내용이 나타난다.
    
## 도서 추천 챗봇 채팅 불러오기
    
![챗봇 채팅 불러오기](./asset/image/도서%20챗봇%20기능/도서%20추천%20챗봇%20채팅%20불러오기%20gif.gif)

- 사용자가 새롭게 페이지에 들어오더라도 이전에 챗봇과 나누던 채팅이 채팅창에 나타난다.
 
</div>
</details>

<details>
   <summary>엘라스틱 서치를 활용한 검색</summary>
   <div markdown="1">
  
## 엘라스틱 서치를 통해 미리 보기가 지원되는 도서 검색 기능
    
![일레스틱 서치를 이용한 검색](https://github.com/user-attachments/assets/49b06ba5-fe2d-4dd4-9ac0-8bb7fa275d73)  

- 사용자가 도서의 제목을 기준으로 검색이 가능하다.
    
</div>
</details>

 <details>
   <summary>채팅 기능을 이용한 독서토론방</summary>
   <div markdown="1">
  
## 채팅방 생성
    
![1_채팅방 생성](https://github.com/user-attachments/assets/b059ce43-7818-4a20-890c-825c10801e58)

- 채팅방 제목과 도서 ID, 최대 인원을 정해 채팅방을 생성한다.

## 채팅
    
![2_채팅](https://github.com/user-attachments/assets/a9912136-f461-44d9-9fbb-9f06da6ef7d2)

- 실시간으로 다수의 유저가 채팅을 진행한다.

## 채팅 내용 및 채팅방 나가기
    
![3_채팅 내용 및 채팅방 나가기](https://github.com/user-attachments/assets/5ee2285a-e50a-4de7-81f1-246e2141c37b)   

- 기존 채팅 내용이 저장되어 있고 채팅방을 나가면 현재 채팅방 인원이 줄어든다.
    
</div>
</details>

 <details>
   <summary>로그인 & 로그아웃</summary>
   <div markdown="1">

## 로그인 & 로그아웃

![로그인 & 로그아웃](https://github.com/user-attachments/assets/f3258c13-3b12-4a98-9c6e-1b2968d2c373)

- 사용자가 로그인 버튼을 누르면 서버로 로그인 url 요청을 보낸다.
- 서버는 카카오 인증 서버에게 로그인 url을 요청해 사용자에게 전달하고, 사용자가 로그인하면 카카오 인증 서버가 인가 코드를 서버에 전달한다.
- 서버는 인가 코드를 이용해 카카오 인증 서버로부터 필요한 정보를 얻고, DB에 사용자를 회원가입 또는 로그인 처리한다. 그리고 서버에서 생성한 서비스 자체 토큰을 함께 보낸다.
- 로그아웃 시 서버에서 토큰을 삭제한다. 

</div>
</details>

 <details>
   <summary>도서 목록</summary>
   <div markdown="1">

## 도서 목록 보기

![도서 목록 보기](https://github.com/user-attachments/assets/a973b471-9d87-49f8-97dd-863e5a8af69c)

- 메인 페이지 화면에서 도서 목록으로 이동해서 등록 된 도서들의 목록을 볼 수 있다.

## 도서 목록 페이지 이동

![도서 목록 페이지 이동](https://github.com/user-attachments/assets/e5865f1d-6448-4c75-863c-b1460bbf3730)

- 도서 목록 내에서 페이징바를 이용하여 페이지 이동을 할 수 있습니다.

</div>
</details>

 <details>
   <summary>도서 상세페이지</summary>
   <div markdown="1">

## 도서 상세페이지

![도서 상세페이지로 이동](https://github.com/user-attachments/assets/b0a8e37f-c79f-40c7-aef7-f002c499d3a3)

- 도서 목록에서 특정 도서 상세페이지로 이동할 수 있습니다.

</div>
</details>

 <details>
   <summary>리뷰</summary>
   <div markdown="1">

## 리뷰 작성

![리뷰 작성](https://github.com/user-attachments/assets/5365f213-1076-4e29-8d6d-90ad580db89c)

- 도서 상세페이지에서 리뷰를 작성할 수 있다.

## 리뷰 작성 취소

![리뷰 작성 취소](https://github.com/user-attachments/assets/cf51f634-4a8b-4476-8793-b1c975e2a406)

- 리뷰를 작성 중에 취소하여 도서 상세페이지로 이동할 수 있다.

## 리뷰 수정

![리뷰 수정](https://github.com/user-attachments/assets/29ee01bc-46ad-46c2-b484-26c6e4bc7feb)

- 리뷰를 수정 할 수 있다.

## 리뷰 정렬

![리뷰 정렬](https://github.com/user-attachments/assets/a3935c4d-cf0c-4415-a4be-4484ee952a02)

- 리뷰를 최신순이나 별점순으로 정렬할 수 있다.

## 리뷰 삭제

![리뷰 삭제](https://github.com/user-attachments/assets/1c597d87-8a17-4d02-98f4-c1a8a4ba252e)

- 리뷰를 삭제할 수 있다.

## 리뷰 신고

![리뷰 신고](https://github.com/user-attachments/assets/b72df4d2-cab5-4e68-990c-555eedbbe2c8)

- 리뷰를 신고 할 수 있고 신고 버튼을 잘못 클릭 했다면 취소할 수도 있다.

</div>
</details>

 <details>
   <summary>예시(여기에 필요한 제목 추가)</summary>
   <div markdown="1">
  
## 작성하고 싶은 기능 제목(예시)
    
![원하는 제목 지정(그냥 이름 지정하는 것이므로 따로 신경 안쓰고 편하게 지으세요)](외부 이미지 링크든 내부에 넣어둔 이미지든 여기에 이미지 링크를 남기시면 됩니다.)   

- 설명하고 싶은 내용 쓰기 여기까지 한세트 필요하면 복붙해서 더 쓰기
    
</div>
</details>

# CI/CD

🔗[k8s Menifests Manage Repository ](https://github.com/MENDITTZO/k8s.git)  

<details><summary>Webhook 설정</summary>
   
![webhook](https://github.com/user-attachments/assets/0f7af8d0-e8d0-4ff2-9a8d-ec59832f2818)

</details>


<details><summary>Jenkins Pipeline</summary>

```
pipeline {
    agent any

    tools {
        gradle 'gradle'   // Jenkins에서 설정된 Gradle 버전
        jdk 'openJDK17'   // Jenkins에서 설정된 JDK 버전
    }

    environment {
        DOCKERHUB_CREDENTIALS = credentials('DOCKERHUB_PASSWORD')
        GITHUB_URL = 'https://github.com/MENDITTZO/MENDITTZO-DEBOOK.git'  // GitHub URL 입력
        FRONTEND_IMAGE = 'debook_vue_project'  // 프론트엔드 Docker 이미지 경로
        BACKEND_IMAGE = 'debook_boot_project'    // 백엔드 Docker 이미지 경로
        MANIFESTS_GITHUB_URL = 'https://github.com/MENDITTZO/k8s.git' // k8s github 경로로
        GIT_USERNAME = 'junguijin'
        GIT_EMAIL = 'yealkki38@gmail.com'
    }

    stages {
        stage('Preparation') {
            steps {
                script {
                    if (isUnix()) {
                        sh 'docker --version'
                    } else {
                        bat 'docker --version'
                    }
                }
            }
        }
        stage('Source Build') {
            steps {
                git branch: 'main', url: "${env.GITHUB_URL}"
                
                script {
                    // 프론트엔드 빌드
                    dir('MENDITTZO-Frontend') {
                        if (isUnix()) {
                            sh 'npm install'
                            sh 'npm run build'
                        } else {
                            bat 'npm install'
                            bat 'npm run build'
                        }
                    }
                    
                    // 백엔드 빌드
                    dir('MENDITTZO-Backend') {
                        if (isUnix()) {
                            sh "chmod +x ./gradlew"
                            sh "./gradlew clean build -x test"
                        } else {
                            bat "gradlew.bat clean build -x test"
                        }
                    }
                }
            }
        }
        stage('Container Build and Push') {
            steps {
                script {
                    withCredentials([usernamePassword(credentialsId: 'DOCKERHUB_PASSWORD', usernameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASS')]) {
                        // 프론트엔드 Docker 이미지 빌드 및 푸시
                        dir('MENDITTZO-Frontend') {
                            if (isUnix()) {
                                sh "docker build --no-cache -t ${DOCKER_USER}/${FRONTEND_IMAGE}:latest ."
                                sh "docker login -u ${DOCKER_USER} -p ${DOCKER_PASS}"
                                sh "docker push ${DOCKER_USER}/${FRONTEND_IMAGE}:latest"
                            } else {
                                bat "docker build --no-cache -t ${DOCKER_USER}/${FRONTEND_IMAGE}:latest ."
                                bat "docker login -u %DOCKER_USER% -p %DOCKER_PASS%"
                                bat "docker push ${DOCKER_USER}/${FRONTEND_IMAGE}:latest"
                            }
                        }

                        // 백엔드 Docker 이미지 빌드 및 푸시
                        dir('MENDITTZO-Backend') {
                            if (isUnix()) {
                                sh "docker build -t ${DOCKER_USER}/${BACKEND_IMAGE}:latest ."
                                sh "docker login -u ${DOCKER_USER} -p ${DOCKER_PASS}"
                                sh "docker push ${DOCKER_USER}/${BACKEND_IMAGE}:latest"
                            } else {
                                bat "docker build -t ${DOCKER_USER}/${BACKEND_IMAGE}:latest ."
                                bat "docker login -u %DOCKER_USER% -p %DOCKER_PASS%"
                                bat "docker push ${DOCKER_USER}/${BACKEND_IMAGE}:latest"
                            }
                        }
                    }
                }
            }
        }
        
    }

    post {
        always {
            script {
                if (isUnix()) {
                    sh 'docker logout'
                } else {
                    bat 'docker logout'
                }
            }
        }
        success {
            echo 'Pipeline succeeded!'
        }
        failure {
            echo 'Pipeline failed!'
        }
    }
}

```

</details>

<details><summary>K8s 배포 상태(Argocd)</summary>
   
![argocd](https://github.com/user-attachments/assets/87eafd03-09b4-4795-906c-cd95336dbda4)

</details>

<details><summary>Nginx를 통한 80port 접속 확인</summary>

![ingress](https://github.com/user-attachments/assets/aa732584-bc72-4070-8248-b58e34954e55)

</details>

###

# :six: 회고
|   팀원   | 회고 내용 |
|:---:|-----------|
| 김영기 | 이번 데브옵스 프로젝트에서 채팅 기능 개발을 맡게 되어 WebSocket + STOMP + Redis를 모두 다루어보게 되었다. 세 가지 모두 처음이었고 프로젝트 기간이 짧았기 때문에 채팅 기능 개발에서 채팅방 관리나 간결한 코드 작성과 같은 디테일을 챙기지 못해서 아쉬웠다. 물론 좋았던 점도 있었다. 먼저, 기존에 경험했던 HTTP 통신에서 더 나아가 실시간 통신이 어떻게 진행되는지 그 과정을 경험해볼 수 있었다. 네트워크쪽 지식이 부족했던 나에게는 조금 더 의미있는 시간이었다. 또한 STOMP를 이용해 실시간 통신을 더 쉽게 만들어주고 Redis를 이용해 빠른 데이터 처리를 하여 다수의 사용자가 채팅을 할 수 있는 기능을 개발하면서 채팅과 실시간 통신의 전반적이 프로세스를 이해할 수 있었다. 더 나아가 SockJS를 이용한 브라우저에 상관없이 통신이 가능하게 확장을 해보고 싶고 채팅 기능의 디테일을 더 살려 기존의 기능을 더 디벨롭해봐야겠다. 이번 프로젝트에서는 CI/CD 또한 경험해볼 수 있었는데 Docker, Kubernetes, Jenkins를 이용하여 협업 툴인 github의 프로젝트를 자동 빌드 및 배포하는 과정을 경험해볼 수 있었다. CI/CD의 전반적인 과정을 잘 이해하지 못하고 진행한 거 같아서 최종 프로젝트에는 직접 해보면서 과정들을 몸으로 습득해보아야겠다. 새로운 팀원들과 진행했던 프로젝트인데 기간도 짧아서 너무 어수선한 프로젝트가 되었던 거 같은데 최종 프로젝트에서는 협업을 더욱 견고히 하여 더 짜임새 있는 프로젝트를 개발해보아야겠다. |
| 김지민 | 이번 프로젝트는 짧은 시간동안 프론트엔드와 백엔드를 같이 만들어야하고 거기다가 도커까지 연결하여 CI/CD까지 해야해서 처음 시작할 때는 막막하게 생각했다. 그리고 저번 프로젝트에서 해야하는 기능들을 제대로 다 하지 못하고 할 수 있는 부분까지만 했기 때문에 이번에는 잘 하고 싶은 생각을 갖고 있었기에 더 부담이 있었다. 하지만 저번에 했던 프로젝트가 경험이 되었던지 처음 프로젝트 했을 때보다는 수월하게 진행할 수 있어서 다행이었다. 이번에 맡은 부분은 도서 목록을 만들고 도서 목록에서 책을 선택하면 도서 상세페이지로 이동하게 만들고 도서 상세페이지 안에서 책 정보를 axios를 통해 백엔드에서 받아오고 도서 상세페이지 안의 등록된 리뷰 정보를 axios로 받아오고, 리뷰 생성, 수정, 삭제를 하는 부분을 맡았다. 특별히 다른 부분에 비해 어려운 부분은 없어서 저번보다는 처음 구성했던 피그마와 얼추 비슷하게 만들 수 있어서 다행이었다. 그리고 구상했던 기능들도 다 포함할 수 있어서 이번에는 저번보다 좀 더 발전된 모습을 보인 거 같아 안심했다. 모르는 부분은 인터넷도 찾아보고 팀원분들과 같이 의논하고 물어보면서 해결 할 수 있었고 팀원분들의 도움이 없었다면 이렇게까지 할 수는 없었을 거 같다. 도커 쪽은 수업을 들었지만 아직도 이해가 잘 안되어서 도움은 못 드렸지만 다른 부분에서 최선을 다하고자 했고 피그마에서 구상했던 사소한 컴포넌트나 CSS도 추가하는 등 열심히 했지만 메인페이지에서 리뷰많은 순으로 도서를 정렬하고자 하였지만 뭐가 문제인지 리뷰의 총 수를 못 받아와서 정렬을 못 했던 것이 아쉽다. 뭔가 좀 더 해보면 될 것같았지만 시간이 부족한 관계로 포기할 수밖에 없어서 마음에 남지만 다음에 다시 이와 비슷한 내용을 해볼 수 있으면 끝까지 해서 완성해보고 싶다. 그래도 필요한 기능들도 다 만들고 비록 리뷰 삭제를 하면 바로 리스트에서 없어지지 않지만 어느 정도 완성을 했기 때문에 프로젝트하면서 재밌게 할 수 있어서 좋았다. 다음에는 이번보다 더 잘 할 수 있도록 실력도 키우고 열심히 더 노력해서 완성도를 높여야겠다. |
| 이은서 | 이전 프로젝트에서 서비스 자체 회원가입, 로그인을 포함한 여러 기능을 구현했다. 회원가입/로그인은 다른 팀원들에게도 반드시 필요한 기능이기 때문에 중요도가 높은데, 단순히 이메일, 암호화 된 비밀번호를 DB에 저장하고 로그인 시 맞는지 매칭하는 수준이라 아쉬움이 남았다. 그래서 다음 기회가 생기면 좀 더 발전시키겠다고 다짐했다. 새로 만난 팀원들과 새 프로젝트를 하게 되었고, 나는 내가 회원가입 기능을 구현하겠다고 말했다. 일주일이 안되는 짧은 기간 안에 백엔드, 프론트엔드 개발을 마쳐야 했기 때문에, 한 번 해 본 서비스 자체 회원가입을 또 하기보다는 카카오 소셜 로그인을 도입하고, redis와 토큰을 사용하기로 했다. 서비스 자체 회원가입보다 조금 어려울 거라고 예상은 했지만 생각보다 더 까다로웠다. 카카오에서 제공하는 문서를 열심히 읽으며 엔드포인트마다 postman으로 테스트하면서 카카오 로그인의 흐름을 이해했다. 그리고 필요한 기능끼리 묶으면서 프론트엔드와 연결했다. 이 과정에서 서비스체 토큰을 생성하고, redis에 저장하고, api 요청마다 토큰을 함께 보내야 했는데, 복잡해서 시간을 많이 썼다. 하지만 덕분에 OAuth2와 토큰에 대해 배울 수 있었다. 그리고 카카오 인증 서버에서 보내주는 인가 코드를 백엔드와 프론트엔드 어느 쪽에서 처리해야할 지와 같은 문제를 고민하는 시간을 가질 수  자있었다. 그리고 이 프로젝트에서 다른 팀원의 제안으로 git을 더 많이 활용했다. 원격 레포지토리의 main 브랜치 아래에 develop 이라는 브랜치를 만들었고, 반드시 2명 이상의 Pull Request 승인을 받아야 develop에 병합할 수 있도록 설정했다. 이로 인해 다른 사람의 코드를 조금이라도 더 보게 되었고, 커밋과 병합 시 경각심을 가질 수 있었다. 프로젝트를 진행하면서 아쉬운 점이 있다면 리프레시 토큰을 적절하게 사용하지 못했다는 점과, 당장 서비스가 작동하게 하는 데에 급급해 쿼리 파라미터에 토큰을 넣는 등 보안에 신경을 쓰지 못했다는 것이다. 또한, 팀원들이 각자의 기능을 개발한 후 서로 맞춰보고 왜 문제가 생기는지 토의하는 시간이 너무 짧았다. 또 좋은 기회가 생긴다면 나의 팀원이 어떤 api를 개발하다가 어떤 문제가 있었고, 어떻게 해결했는지 시간을 내어 이야기 하고 싶다. |
| 정의진 | 이번 DevOps 프로젝트를 통해 지금까지 학습했던 백엔드와 프론트엔드 개발에서 시작하여, 프로젝트를 실제로 배포하는 과정까지 전반적으로 경험할 수 있었습니다. 직접 개발한 프론트엔드와 백엔드 프로젝트를 Docker 이미지로 변환하고, 협업 과정에서 사용한 GitRepository와 Jenkins를 Webhook으로 연동하여 개발 시 자동으로 빌드, 테스트, Docker Hub에 등록까지 이루어지는 CI/CD 환경을 구현하였습니다. 또한, Docker 이미지를 기반으로 작성된 Kubernetes 파일들을 GitHub 레포지토리로 관리하며, ArgoCD와 연계하여 배포 과정을 자동화하는 시스템을 구축하였습니다. 이러한 CI/CD 환경을 구현하며 프로젝트의 전체적인 흐름과 DevOps의 핵심 개념을 직접 체험할 수 있어 도움이 많이 되었던 프로젝트였습니다. 이번 경험을 바탕으로 얻은 경험을 최종프로젝트에 접목시켜 더욱 발전된 프로그램을 만들어보고 싶습니다. |
| 최두혁 | 이번 프로젝트는 지금까지 진행했던 프로젝트와 다르게 주어진 시간이 가장 짧았다. 짧은 시간동안 설계부터 배포까지 완성을 하는 내실 있는 구성을 요구하는 프로젝트였다. 내실있는 구성을 하는 중 어필 포인트로 여러가지를 잡게 되었는데 내가 하게 된 역할이 엘라스틱 서치라는 외부 라이브러리를 이용하는 작업이었다. 간단하게 정리하면 엘라스틱 서치는 기존 RDB의 조회보다 훨씬 빠르게 검색을 할 수 있는 장점이 있다. 그 부분을 활용해 많은 양의 정보를 빠르게 조회할 수 있는 기능과 더불어 실제 검색엔진에서 활용하듯 검색어를 완성해감에 따라 데이터의 조회를 빠르게 해와서 자동완성 기능까지 추가하게 되었다. 처음 기존 설계는 엘라스틱 서치하면 항상 따라오는 ELK(엘라스틱서치, 로그 스태시, 키바나의 줄임말)의 기능중 엘라스틱 서치와 로그 스태시를 연동해서 작업을 하고자 했다. 스프링에서 엘라스틱 서치에 요청을 하면 필요한 값을 찾아 리턴해주는 기본적인 구조에서 데이터를 인덱싱해주는 역할을 하는 것이 로그스태시였다. 하지만 디비 연동에 필요한 jar파일 인식이 로그스태시에서 안되어 스프링에서 인덱싱 후 작업을 진행하는 식으로 바꾸었다. 데이터 양도 많아 비동기처리를 하고, 거기에 나중에 팀원들과 코드를 합치면서 생각지도 못했던 CORS 설정까지 하게 되었다. 지금까지 나의 개발은 무에서 유를 만들어 나가는 것이었지만 이번 프로젝트때는 새롭게 만들어진 기술을 프로젝트에 적용을 하는 과정이 굉장히 색다른 경험이었고 즐거웠다. 추후에 팀원들과 외부 라이브러리 사용간 부딪힌 문제들을 공유하고 같이 성장하고 싶다는 생각이 들었다.  |
| 한동주 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | 이번 프로젝트에서는 도서를 추천해주는 챗봇을 구글의 Gemini API를 이용해 다뤄보기로 했습니다. 완전 처음 다뤄보는 기능이라 알아보며 공부도 해보고 처음에는 챗GPT API를 이용하려고 했다가 응답 토큰 수가 너무 적어 정상적인 이용이 어려울것 같아 토큰을 상대적으로 여유있게 제공해주는 구글의 Gemini API로 AI를 바꾸는 과정에서 시간이 소모되기도 하였습니다. 하지만 다루는 과정에서 API 호출에 대해 더 자세히 알게되었고, AI에게는 설정을 부여하여 내가 원하는 대답을 이끌어 낼 수 있는데, 이 설정을 부여하는 instructor를 다루는 방법에 대해 자세히 알게된 것 같습니다.  아쉬운점은 프런트 부분에서 챗봇이 제공한 책 제목에 하이퍼 링크를 걸어 그 책의 상세 정보로 이동할 수 있도록 하고싶었는데 그러지 못한점이 많이 아쉬웠습니다. 그리고 제가 깃허브등을 다루는 협업에 아직 적응하지 못해 미숙했었는데 이번 팀과 프로젝트를 하면서 협업 전략을 좀더 디테일하게 세우며 이를 적용하는 과정에서 많이 배우고 적응하게 되어 잘 다룰 수 있게 된 것 같습니다. |
