package com.eomcs.lms.handler;

import java.util.Scanner;
import com.eomcs.lms.domain.Movie;

public class MovieHandler {

  static final int MOVIE_SIZE = 1000;
  static Movie[] movies = new Movie[MOVIE_SIZE];
  static int movieCount = 0;
  public static Scanner keyboard;


  public static void addMovie() {

    Movie movie = new Movie();

    System.out.print("번호? ");
    movie.no = keyboard.nextInt();

    keyboard.nextLine(); // nextInt() 후에 남아 있는 줄바꿈 기호를 제거한다.

    System.out.print("제목? ");
    movie.title = keyboard.nextLine();

    System.out.print("장르? ");
    movie.genre = keyboard.nextLine();

    System.out.print("주연? ");
    movie.star = keyboard.nextLine();

    System.out.println("평점? ");
    movie.myRating = keyboard.nextInt();
    keyboard.nextLine();

    // 수업 정보를 담고 있는 인스턴스의 주소를 나중에 사용할 수 있도록
    // 레퍼런스 배열에 보관해 둔다.

    movies[movieCount++] = movie;
    System.out.println("저장하였습니다.");
  }


  public static void listMovie() {

    for (int i = 0; i < movieCount; i++) {
      Movie m = movies[i];
      System.out.printf("%d. %s, %s, %s, %s\n",
          m.no, m.title,
          m.genre, m.star, m.myRating);
    }
  }
}