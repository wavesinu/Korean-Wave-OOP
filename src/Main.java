import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("한류 컨텐츠에 관한 정보를 출력하는 프로그램입니다.");
        while (true) {
            System.out.println("알고싶은 한류 컨텐츠 분야를 선택해주세요.");
            System.out.println("------------------------------------------------------------------------------");
            System.out.println("|    1. K-pop    |    2. K-Drama    |    3. K-Movie    |    4. 프로그램 종료    |");
            System.out.println("------------------------------------------------------------------------------");

            System.out.print("Select Menu: ");
            Scanner sc = new Scanner(System.in);
            String userChoice = sc.nextLine();

            switch (userChoice) {
                case "1" -> {   // K-pop 관련 정보 출력
                    System.out.println("K-pop에 관한 정보를 알고싶으시군요?");
                    System.out.println("원하시는 정보를 선택해주세요!");
                    System.out.println("1. 대표적인 K-pop 아티스트 정보    | 2. K-pop 노래 정보    | 3. K-pop 관련 해외 수상 내역    | 4. 메인메뉴로 돌아가기");
                    String infoChoice = sc.nextLine();

                    switch (infoChoice) {
                        case "1":
                            System.out.println("해외에서 인기 있는 대표적인 K-pop 아티스트들은 다음과 같습니다.");
                            break;
                        case "2":
                            System.out.println("해당 아티스트들의 인기 노래 정보는 다음과 같습니다.");
                            break;
                        case "3":
                            System.out.println("K-pop 관련 해외 수상 내역은 다음과 같습니다.");
                            // K-pop 관련 해외 수상 내역 출력
                            break;
                        case "4":
                            System.out.println("메인메뉴로 돌아갑니다.\n");
                            break;
                    }
                }
                case "2" -> {   // K-Drama 관련 정보 출력
                    System.out.println("K-Drama에 관한 정보를 선택하셨습니다.");
                    System.out.println("원하시는 정보를 선택해주세요!");
                    System.out.println("1. 대표적인 K-Drama 정보    |    2. K-Drama 관련 해외 수상 내역    | 4. 메인메뉴로 돌아가기");
                    String infoChoice = sc.nextLine();

                    switch (infoChoice) {
                        case "1":
                            System.out.println("해외에서 인기 있는 대표적인 K-Drama는 다음과 같습니다.");
                            break;
                        case "2":
                            System.out.println("K-Drama 관련 해외 수상 내역은 다음과 같습니다.");
                            // K-Drama 관련 해외 수상 내역 출력
                            break;
                        case "3":
                            System.out.println("메인메뉴로 돌아갑니다.\n");
                            break;
                    }


                }
                case "3" -> {   // K-Movie 관련 정보 출력
                    System.out.println("K-Movie에 관한 정보를 선택하셨습니다.");
                    System.out.println("원하시는 정보를 선택해주세요!");
                    System.out.println("1. K-Movie 배우 정보    | 2. K-Movie 영화 정보    | 3. K-Movie 관련 해외 수상 내역    | 4. 메인메뉴로 돌아가기");
                    String infoChoice = sc.nextLine();

                }
                case "4" -> System.exit(0);
                default -> System.out.println("잘못 입력하셨습니다.");

            }
        }
    }
}

