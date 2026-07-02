package ch03;

import java.io.IOException;

// 4. 파일(output.txt) -> 파일(output-copy.txt)
public class FileToFile {
    void main(){
        try{
            // 표준 입력 장치로 부터 1byte 읽어온다.
            int readData = 0;

            while((readData = System.in.read()) != -1){
                // 표준 출력 장치로 1byte 출력한다.
                System.out.write(readData);
            }
        }catch(IOException e){
            System.err.println("입출력 예외 발생: " + e.getMessage());
        }
    }
}
