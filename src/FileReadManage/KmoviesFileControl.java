package FileReadManage;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class KmoviesFileControl implements FileReadControl {
    Path path = Paths.get("kmovie.txt");
    public void readMoviesInfo() {
        try (Stream<String> lines = Files.lines(path)) {
            System.out.print("K-movie 대표 영화들은 다음과 같습니다.\n");
            lines.skip(1).takeWhile(line -> !line.startsWith("[해당 영화 정보]")).forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void readAllInfo() {
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
    public void readAll() {
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
