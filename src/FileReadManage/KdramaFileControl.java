package FileReadManage;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class KdramaFileControl implements FileReadControl {
    Path path = Paths.get("kdrama.txt");    // 데이터 파일 경로 지정

    public void readDramaName() {   // 드라마 이름을 불러오는 메서드
        try (Stream<String> lines = Files.lines(path)) {
            System.out.print("Netflix 흥행 순위를 기준으로 선별하였으며, Kdrama 대표 작품들은 다음과 같습니다.\n");
            lines.skip(1).takeWhile(line -> !line.startsWith("[해당 드라마 정보]")).forEach(System.out::println);  // 드라마 정보 키워드가 나오기 전까지의 내용을 읽어들임
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void readDetailInfo() {  // 드라마 상세 정보를 불러오는 메서드
        String keyword = "[해당 드라마 정보]"; // 시작 키워드
        try {
            FileReader fr = new FileReader("kdrama.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;
            boolean found = false;

            while ((line = br.readLine()) != null) {
                if (!found && line.contains(keyword)) {
                    found = true;
                }
                if (found) {
                    System.out.println(line);
                }
            }
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void readAll() { // 데이터 파일의 내용을 전부 불러오는 함수
        try {
            File file = new File("kdrama.txt");
            FileReader file_reader = new FileReader(file);
            int cur;

            while ((cur = file_reader.read()) != -1) {
                System.out.print((char) cur);
            }
        } catch (FileNotFoundException e) {
            System.out.println("파일이 없습니다.");
        } catch (IOException e) {
            System.out.println("IO Exception");
        }
    }
}
