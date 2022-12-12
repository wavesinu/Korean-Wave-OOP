package FileReadManage;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class KmoviesFileControl implements FileReadControl {
    Path path = Paths.get("kmovie.txt");    // 데이터 파일 경로 지정
    public void readMoviesInfo() {
        try (Stream<String> lines = Files.lines(path)) {
            System.out.print("K-movie 대표 영화들은 다음과 같습니다.\n");
            lines.skip(1).takeWhile(line -> !line.startsWith("[해당 영화 정보]")).forEach(System.out::println);   // 영화 정보 키워드가 나오기 전까지의 내용을 읽어들임
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void readDetailInfo() {  // 영화 상세 정보를 불러오는 메서드
        String keyword = "[해당 영화 정보]";
        try {
            FileReader fr = new FileReader("kmovie.txt");
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
            File file = new File("kmovie.txt");
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
