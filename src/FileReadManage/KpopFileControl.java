package FileReadManage;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class KpopFileControl implements FileReadControl {
    Path path = Paths.get("kpop.txt");  // 데이터 파일 경로 지정

    public void readGroupName() {   // 그룹 이름을 불러오는 메서드
        try (Stream<String> lines = Files.lines(path)) {
            System.out.print("Kpop 대표가수들은 다음과 같습니다.\n");
            lines.skip(1).takeWhile(line -> !line.startsWith("[대표곡]")).forEach(System.out::println);    // 대표곡 키워드가 나오기 전까지의 내용을 불러옴
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void readSongs() {
        // "[대표곡]" 부터 "[빌보드 차트]"가 나타나기 전까지 읽기
        try (Stream<String> lines = Files.lines(path)) {
            System.out.print("각 그룹의 대표곡들은 다음과 같습니다.\n");
            lines.skip(4).takeWhile(line -> !line.startsWith("[빌보드 차트 기록]")).forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void readBillboard() {   // 빌보드 차트 기록을 불러오는 메서드
        String keyword = "[빌보드 차트 기록]";
        try {
            FileReader fr = new FileReader("kpop.txt");
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
        // 전체 파일 읽기
        try (Stream<String> lines = Files.lines(path)) {
            lines.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
