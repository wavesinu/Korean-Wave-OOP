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
                    System.out.println("1. 대표적인 K-pop 아티스트 정보    | 2. 해당 아티스트들의 대표곡    | 3. K-pop 빌보드 차트 기록    | 4. 전체 정보 확인하기");
                    String infoChoice = sc.nextLine();

                    switch (infoChoice) {
                        case "1" -> {
                            kpopFileControl.readGroupName();
                        }
                        case "2" -> {
                            kpopFileControl.readSongs();
                        }
                        case "3" -> {
                            kpopFileControl.readBillboard();
                        }
                        case "4" -> {
                            kpopFileControl.readAll();
                        }

                    }
                }
                case "2" -> {   // K-Drama 관련 정보 출력
                    KdramaFileControl kdramaFileControl = new KdramaFileControl();
                    System.out.println("K-Drama에 관한 정보를 선택하셨습니다.");
                    System.out.println("원하시는 정보를 선택해주세요!");
                    System.out.println("1. 대표적인 K-Drama 작품    |    2. 해당 드라마 상세 정보    | 3. 메인메뉴로 돌아가기");
                    String infoChoice = sc.nextLine();

                    switch (infoChoice) {
                        case "1" -> {
                            kdramaFileControl.readDramaName();
                        }
                        case "2" -> {
                            kdramaFileControl.readDetailInfo();
                        }
                        case "3" -> {
                            System.out.println("메인메뉴로 돌아갑니다.");
                        }
                    }


                }
                case "3" -> {   // K-Movie 관련 정보 출력
                    KmoviesFileControl kmoviesFileControl = new KmoviesFileControl();
                    System.out.println("K-Movie에 관한 정보를 선택하셨습니다.");
                    System.out.println("원하시는 정보를 선택해주세요!");
                    System.out.println("1. 대표적인 K-Movie 작품    | 2. 해당 영화 상세 정보    |    3. 메인메뉴로 돌아가기");
                    String infoChoice = sc.nextLine();

                    switch (infoChoice) {
                        case "1" -> {
                            kmoviesFileControl.readMoviesInfo();
                        }
                        case "2" -> {
                            kmoviesFileControl.readDetailInfo();
                        }
                        case "3" -> {
                            System.out.println("메인메뉴로 돌아갑니다.");
                        }
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

