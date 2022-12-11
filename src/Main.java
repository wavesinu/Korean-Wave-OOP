import FileReadManage.KdramaFileControl;
import FileReadManage.KmoviesFileControl;
import FileReadManage.KpopFileControl;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        enum Menu {
            KPOP, KMOVIES, KDRAMA, EXIT
        }

        System.out.println("한류 컨텐츠에 관한 정보를 출력하는 프로그램입니다.");
        while (true) {
            System.out.println("알고싶은 한류 컨텐츠 분야를 선택해주세요.");
            System.out.println("-------------------------------------------------------------------");
            System.out.println("|    1. " + Menu.KPOP + "    |    2." + Menu.KDRAMA + "    |    3." + Menu.KMOVIES + "    |    4." + Menu.EXIT + "    |");
            System.out.println("-------------------------------------------------------------------");

            System.out.print("Select Menu: ");
            Scanner sc = new Scanner(System.in);
            String userChoice = sc.nextLine();

            switch (userChoice) {
                case "1" -> {   // K-pop 관련 정보 출력
                    KpopFileControl kpopFileControl = new KpopFileControl();
                    System.out.println("K-pop에 관한 정보를 알고싶으시군요?");
                    System.out.println("원하시는 정보를 선택해주세요!");
                    System.out.println("1. 대표적인 K-pop 아티스트 정보    | 2. 해당 아티스트들의 대표곡    | 3. K-pop 빌보드 차트 기록    | 4. 메인메뉴로 돌아가기");
                    String infoChoice = sc.nextLine();

                    switch (infoChoice) {
                        case "1" -> {
                            kpopFileControl.readName();
                        }
                        case "2" -> {
                            kpopFileControl.readSongs();
                        }
                        case "3" -> {
                            kpopFileControl.readBillboard();
                        }
                        case "4" -> System.out.println("메인메뉴로 돌아갑니다.\n");

                    }
                }
                case "2" -> {   // K-Drama 관련 정보 출력
                    KdramaFileControl kdramaFileControl = new KdramaFileControl();
                    System.out.println("K-Drama에 관한 정보를 선택하셨습니다.");
                    System.out.println("원하시는 정보를 선택해주세요!");
                    System.out.println("1. 대표적인 K-Drama    |    2. K-Drama 관련 해외 수상 내역    | 4. 메인메뉴로 돌아가기");
                    String infoChoice = sc.nextLine();

                    switch (infoChoice) {
                        case "1":
                            System.out.println("해외에서 인기 있는 대표적인 K-Drama는 다음과 같습니다.");
                            kdramaFileControl.readAll();
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
                    KmoviesFileControl kmoviesFileControl = new KmoviesFileControl();
                    System.out.println("K-Movie에 관한 정보를 선택하셨습니다.");
                    System.out.println("원하시는 정보를 선택해주세요!");
                    System.out.println("1. K-Movie 배우 정보    | 2. K-Movie 영화 정보    | 3. K-Movie 관련 해외 수상 내역    | 4. 메인메뉴로 돌아가기");
                    String infoChoice = sc.nextLine();

                    switch (infoChoice) {
                        case "1" -> {
                            System.out.println("해외에서 인기 있는 대표적인 K-Movie 배우는 다음과 같습니다.");
                            kmoviesFileControl.readAll();
                        }
                        case "2" -> System.out.println("해당 배우들의 인기 영화 정보는 다음과 같습니다.");
                        case "3" -> System.out.println("K-Movie 관련 해외 수상 내역은 다음과 같습니다.");
                        case "4" -> System.out.println("메인메뉴로 돌아갑니다.\n");
                    }

                }
                case "4" -> {
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                }
                default -> System.out.println("잘못 입력하셨습니다.");

            }
        }
    }
}

