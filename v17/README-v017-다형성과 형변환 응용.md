# 17 - 다형성과 형변환 응용

## 학습 목표

- 데이터 처리 클래스를 일반화하여 재사용성을 높이는 방법
- 다형적 변수를 활용해야 하는 이유
- 형변환이 필요한 이유
- 다형적 변수를 활용하여 다양한 타입의 데이터를 다룰 수 있다.
- 형변환을 이해하고 다룰 수 있다.

## 실습 소스 및 결과

- src/main/java/com/eomcs/lms/handler/MovieList.java 삭제
- src/main/java/com/eomcs/lms/handler/WordList.java 삭제
- src/main/java/com/eomcs/lms/handler/MemberList.java 삭제
- src/main/java/com/eomcs/lms/handler/ArrayList.java 추가
- src/main/java/com/eomcs/lms/handler/MovieHandler.java 변경
- src/main/java/com/eomcs/lms/handler/WordHandler.java 변경
- src/main/java/com/eomcs/lms/handler/MemberHandler.java 변경

## 실습

### 작업1) Movie, Word, Member 를 모두 다룰 수 있는 List 클래스를 만들라.

- ArrayList.java
    - MovieList, WordList, MemberList 클래스를 합쳐 한 클래스로 만든다.     
- MovieHandler.java
    - `ArrayList` 클래스를 사용하여 데이터를 처리한다.
- WordHandler.java
    - `ArrayList` 클래스를 사용하여 데이터를 처리한다.
- MemberHandler.java
    - `ArrayList` 클래스를 사용하여 데이터를 처리한다.
    
#### 실행 결과

`App` 클래스의 실행 결과는 이전 버전과 같다.
