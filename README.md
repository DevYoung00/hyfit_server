
<h1 align="center">
  <br>
  <img src="https://github.com/hyfit/hyfit_server/assets/93467085/32824801-0dd8-4411-b65f-9bba19035006" alt="Markdownify" width="100">
  <br>
  Hyfit - Backend Repository
  <br>
</h1>
  <br>
    <br>
<p align="center">
 <img width="600" alt="스크린샷 2024-06-25 오후 4 45 39" src="https://github.com/hyfit/hyfit_server/assets/93467085/06eaa9bc-d62f-42ae-8ced-6cb6c9fa3e39">
</p>
<hr/>

### Environment
<p>
  <img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white">
  <img src="https://img.shields.io/badge/git-F05032?style=for-the-badge&logo=git&logoColor=white">
 <img src="https://img.shields.io/badge/IntelliJ-000000?style=for-the-badge&logo=IntelliJ%20IDEA&logoColor=blue">
</p>

### Stack
<p>
  <img src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=Spring%20Boot&logoColor=white">
  <img src="https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white">
  <img src="https://img.shields.io/badge/amazon%20EC2-FF9900?style=for-the-badge&logo=amazonec2&logoColor=white">
  <img src="https://img.shields.io/badge/amazon%20S3-569A31F?style=for-the-badge&logo=amazons3&logoColor=white">
   <img src="https://img.shields.io/badge/amazon%20RDS-527FFF?style=for-the-badge&logo=amazonrds&logoColor=white">
    <img src="https://img.shields.io/badge/redis-DC382D?style=for-the-badge&logo=redis&logoColor=white">
  <img src="https://img.shields.io/badge/socket.io-010101?style=for-the-badge&logo=socket.io&logoColor=white">
</p>

### Communication
<p>
  <img src="https://img.shields.io/badge/notion-000000?style=for-the-badge&logo=notion&logoColor=blue">
  <img src="https://img.shields.io/badge/discord-5865F2?style=for-the-badge&logo=discord&logoColor=white">
  <img src="https://img.shields.io/badge/kakaotalk-FFCD00?style=for-the-badge&logo=kakaotalk&logoColor=black">
</p>

### Screen 
| 함께 운동하기 (실외 운동)|
| :---: |
| <img width="350" alt="함께운동" src="https://github.com/user-attachments/assets/1bceed43-6aaf-4b01-99b5-8edb378d6f89"> |

| 실내 운동 | 회원 리포트 |
| :---: | :---: |
| <img width="350" alt="실내운동" src="https://github.com/hyfit/hyfit_server/assets/93467085/45d746c5-a3e8-4b9c-a7c1-cb661dc7daaa"> | <img width="350" alt="리포트" src="https://github.com/hyfit/hyfit_server/assets/93467085/b93cbac2-e6b5-4647-b718-731a6e6d6886"> |

| 목표 설정 | 커뮤니티 |
| :---: | :---: |
| <img width="350" alt="목표설정" src="https://github.com/hyfit/hyfit_server/assets/93467085/68e2aafb-2c79-4715-9c98-7ac65dde53aa"> | <img width="350" alt="커뮤니티" src="https://github.com/hyfit/hyfit_server/assets/93467085/8cb5b496-4623-4d86-bc80-cd7aca5f6aa7"> | 
<br/>
<hr>



## Repository Structure

```bash
├── HELP.md
├── build.gradle
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── hyfit_server
│   │   │               ├── HyfitServerApplication.java
│   │   │               ├── config
│   │   │               │   ├── WebConfig.java
│   │   │               │   ├── email
│   │   │               │   │   └── EmailConfig.java
│   │   │               │   ├── querydsl
│   │   │               │   │   └── QuerydslConfig.java
│   │   │               │   ├── redis
│   │   │               │   │   └── RedisConfig.java
│   │   │               │   ├── response
│   │   │               │   │   ├── BaseException.java
│   │   │               │   │   ├── BaseResponse.java
│   │   │               │   │   └── BaseResponseStatus.java
│   │   │               │   ├── s3
│   │   │               │   │   └── S3Config.java
│   │   │               │   ├── security
│   │   │               │   │   ├── CustomUserDetails.java
│   │   │               │   │   ├── JwtAuthenticationFilter.java
│   │   │               │   │   ├── JwtTokenProvider.java
│   │   │               │   │   └── SecurityConfig.java
│   │   │               │   └── websocket
│   │   │               │       ├── StompHandler.java
│   │   │               │       └── WebSocketConfig.java
│   │   │               ├── controller
│   │   │               │   ├── email
│   │   │               │   │   └── EmailController.java
│   │   │               │   ├── exercise
│   │   │               │   │   └── ExerciseController.java
│   │   │               │   ├── exerciseWith
│   │   │               │   │   └── ExerciseWithController.java
│   │   │               │   ├── image
│   │   │               │   │   └── ImageController.java
│   │   │               │   ├── location
│   │   │               │   │   └── LocationController.java
│   │   │               │   ├── post
│   │   │               │   │   └── PostController.java
│   │   │               │   ├── user
│   │   │               │   │   ├── FollowController.java
│   │   │               │   │   ├── GoalController.java
│   │   │               │   │   └── UserController.java
│   │   │               │   └── websocket
│   │   │               │       └── NotificationController.java
│   │   │               ├── domain
│   │   │               │   ├── BaseTimeEntity.java
│   │   │               │   ├── exercise
│   │   │               │   │   ├── ExerciseEntity.java
│   │   │               │   │   ├── ExerciseRepository.java
│   │   │               │   │   ├── ExerciseWithEntity.java
│   │   │               │   │   └── ExerciseWithRepository.java
│   │   │               │   ├── image
│   │   │               │   │   ├── ImageEntity.java
│   │   │               │   │   └── ImageRepository.java
│   │   │               │   ├── listner
│   │   │               │   │   ├── Auditable.java
│   │   │               │   │   └── TimeEntityListener.java
│   │   │               │   ├── location
│   │   │               │   │   ├── LocationEntity.java
│   │   │               │   │   └── LocationRepository.java
│   │   │               │   ├── place
│   │   │               │   │   ├── PlaceEntity.java
│   │   │               │   │   └── PlaceRepository.java
│   │   │               │   ├── post
│   │   │               │   │   ├── PostCommentEntity.java
│   │   │               │   │   ├── PostCommentRepository.java
│   │   │               │   │   ├── PostCustomRepository.java
│   │   │               │   │   ├── PostCustomRepositoryImpl.java
│   │   │               │   │   ├── PostEntity.java
│   │   │               │   │   ├── PostLikeEntity.java
│   │   │               │   │   ├── PostLikeRepository.java
│   │   │               │   │   └── PostRepository.java
│   │   │               │   ├── user
│   │   │               │   │   ├── FollowEntity.java
│   │   │               │   │   ├── FollowRepository.java
│   │   │               │   │   ├── GoalEntity.java
│   │   │               │   │   ├── GoalRepository.java
│   │   │               │   │   ├── UserCustomRepository.java
│   │   │               │   │   ├── UserCustomRepositoryImpl.java
│   │   │               │   │   ├── UserEntity.java
│   │   │               │   │   ├── UserRepository.java
│   │   │               │   │   └── UserRole.java
│   │   │               │   └── websocket
│   │   │               │       ├── AcceptEntity.java
│   │   │               │       ├── QuitEntity.java
│   │   │               │       ├── RequestEntity.java
│   │   │               │       └── WorkoutEntity.java
│   │   │               ├── dto
│   │   │               │   ├── Goal
│   │   │               │   │   ├── GoalAddDto.java
│   │   │               │   │   ├── GoalDto.java
│   │   │               │   │   ├── PlaceDto.java
│   │   │               │   │   ├── PlaceImageDto.java
│   │   │               │   │   └── PlaceReq.java
│   │   │               │   ├── Image
│   │   │               │   │   ├── ImageDto.java
│   │   │               │   │   ├── ImagePlaceSaveDto.java
│   │   │               │   │   └── ImagePostSaveDto.java
│   │   │               │   ├── Post
│   │   │               │   │   ├── DeleteCommentReq.java
│   │   │               │   │   ├── GetOnePostRes.java
│   │   │               │   │   ├── MyPostDto.java
│   │   │               │   │   ├── PostCommentDto.java
│   │   │               │   │   ├── PostCommentListDto.java
│   │   │               │   │   ├── PostDto.java
│   │   │               │   │   ├── PostLikeDto.java
│   │   │               │   │   ├── PostLikeReq.java
│   │   │               │   │   ├── PostModifyDto.java
│   │   │               │   │   ├── PostPageReq.java
│   │   │               │   │   ├── PostPaginationDto.java
│   │   │               │   │   ├── PostProfileRes.java
│   │   │               │   │   ├── PostSaveDto.java
│   │   │               │   │   ├── PostSaveRes.java
│   │   │               │   │   ├── SaveCommentDto.java
│   │   │               │   │   └── SaveCommentReq.java
│   │   │               │   ├── exercise
│   │   │               │   │   ├── ExerciseDto.java
│   │   │               │   │   ├── ExerciseEndReq.java
│   │   │               │   │   ├── ExerciseStartReq.java
│   │   │               │   │   ├── ExerciseWithDto.java
│   │   │               │   │   ├── ExerciseWithReq.java
│   │   │               │   │   └── ExerciseWithStart.java
│   │   │               │   ├── follow
│   │   │               │   │   ├── FollowAddDto.java
│   │   │               │   │   └── FollowDto.java
│   │   │               │   ├── location
│   │   │               │   │   ├── LocationAltRedisReq.java
│   │   │               │   │   ├── LocationDto.java
│   │   │               │   │   ├── LocationExerciseSaveReq.java
│   │   │               │   │   ├── LocationPostSaveReq.java
│   │   │               │   │   ├── LocationRedisReq.java
│   │   │               │   │   └── LocationRedisRes.java
│   │   │               │   └── user
│   │   │               │       ├── UserDto.java
│   │   │               │       ├── UserForgetPwdDto.java
│   │   │               │       ├── UserJoinDto.java
│   │   │               │       ├── UserLoginDto.java
│   │   │               │       ├── UserPasswordDto.java
│   │   │               │       ├── UserProfileDto.java
│   │   │               │       ├── UserProfileImageSaveDto.java
│   │   │               │       └── UserUpdateDto.java
│   │   │               └── service
│   │   │                   ├── email
│   │   │                   │   ├── EmailService.java
│   │   │                   │   └── EmailServiceImpl.java
│   │   │                   ├── exercise
│   │   │                   │   └── ExerciseService.java
│   │   │                   ├── exerciseWith
│   │   │                   │   └── ExerciseWithService.java
│   │   │                   ├── image
│   │   │                   │   ├── ImageService.java
│   │   │                   │   └── S3Service.java
│   │   │                   ├── location
│   │   │                   │   └── LocationService.java
│   │   │                   ├── post
│   │   │                   │   └── PostService.java
│   │   │                   ├── redis
│   │   │                   │   └── RedisService.java
│   │   │                   ├── user
│   │   │                   │   ├── CustomUserDetailsService.java
│   │   │                   │   ├── FollowService.java
│   │   │                   │   ├── GoalService.java
│   │   │                   │   └── UserService.java
│   │   │                   └── websocket
│   │   │                       └── NotificationService.java
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── hyfit_server
│                       └── HyfitServerApplicationTests.java
└── untitled

```

