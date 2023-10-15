<h1 align="center">
  <br>
  <img src="https://github.com/hyfit/hyfit_server/assets/93467085/32824801-0dd8-4411-b65f-9bba19035006" alt="Markdownify" width="200">
  <br>
  Hyfit - Backend Repository
  <br>
</h1>

<h2>Environment</h2>
<p>
  <img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white">
  <img src="https://img.shields.io/badge/git-F05032?style=for-the-badge&logo=git&logoColor=white">
 <img src="https://img.shields.io/badge/IntelliJ-000000?style=for-the-badge&logo=IntelliJ%20IDEA&logoColor=blue">
</p>

<h2>Stack</h2>
<p>
  <img src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=Spring%20Boot&logoColor=white">
  <img src="https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white">
  <img src="https://img.shields.io/badge/amazon%20EC2-FF9900?style=for-the-badge&logo=amazonec2&logoColor=white">
  <img src="https://img.shields.io/badge/amazon%20S3-569A31F?style=for-the-badge&logo=amazons3&logoColor=white">
   <img src="https://img.shields.io/badge/amazon%20RDS-527FFF?style=for-the-badge&logo=amazonrds&logoColor=white">
    <img src="https://img.shields.io/badge/redis-DC382D?style=for-the-badge&logo=redis&logoColor=white">
  <img src="https://img.shields.io/badge/socket.io-010101?style=for-the-badge&logo=socket.io&logoColor=white">
</p>

<h2>Communication</h2>
<p>
  <img src="https://img.shields.io/badge/notion-000000?style=for-the-badge&logo=notion&logoColor=blue">
  <img src="https://img.shields.io/badge/discord-5865F2?style=for-the-badge&logo=discord&logoColor=white">
  <img src="https://img.shields.io/badge/kakaotalk-FFCD00?style=for-the-badge&logo=kakaotalk&logoColor=black">
</p>

![영상](https://github.com/hyfit/hyfit_android/assets/93467085/d878e60c-0221-4a0b-bc86-42fb30c7beef)
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

