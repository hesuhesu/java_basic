package IO;

import java.io.*;

public class IO_file {
    public static void main (String[] args) throws IOException  {

        // FileOutputStream
        // InputStream 과 마찬가지로 byte 단위로 데이터를 처리하는 클래스.
        FileOutputStream output = new FileOutputStream("C:\\Users\\hesuh\\Desktop\\out.txt");
        for(int i=1; i<11; i++) {
            String data = i+" 번째 줄입니다.\r\n";
            // \r\n은 줄바꿈. unix 에선 \n만 있으면 되지만, 윈도우에선 \r 을 추가해야 노트패드 에디터에서 줄바꿈이 제대로 표시됨.
            output.write(data.getBytes());
        }
        output.close(); // 왠만하면 닫아주자. 다시 사용 시 오류가 발생한다.

        // FileWriter
        // 문자열 형식으로 작성 가능. stream 보다 편하다.
        FileWriter fw = new FileWriter("C:\\Users\\hesuh\\Desktop\\out_2.txt");
        for(int i=1; i<11; i++) {
            String data = i+" 번째 줄입니다.\r\n";
            fw.write(data);
        }
        fw.close();

        // FileWriter 추가모드.
        // 두 번째 parameter 는 false 이다. true 일 경우 덮어쓰기가 아닌 값을 추가한다.
        FileWriter fw2 = new FileWriter("C:\\Users\\hesuh\\Desktop\\out_2.txt", true);
        for(int i=11; i<21; i++) {
            String data = i+" 번째 줄입니다?\r\n";
            fw2.write(data);
        }
        fw2.close();

        // PrintWriter
        // \r\n 대신 println 이 가능한 클래스.
        PrintWriter pw = new PrintWriter("C:\\Users\\hesuh\\Desktop\\out_3.txt");
        for(int i=1; i<11; i++) {
            String data = i+" 번째 줄입니다.";
            pw.println(data);
        }
        pw.close();

        // PrinterWrite 추가모드
        // PrintWriter를 사용할 경우에는 생성자의 파라미터로 파일명 대신 추가 모드로 열린 FileWriter의 객체를 전달해야 한다.
        PrintWriter pw2 = new PrintWriter(new FileWriter("C:\\Users\\hesuh\\Desktop\\out_3.txt", true));
        for(int i=11; i<21; i++) {
            String data = i+" 번째 줄입니다!";
            pw2.println(data);
        }
        pw2.close();

        // FileInputStream
        // 이 방법은 데이터의 길이를 모를 경우 불편함.
        byte[] b = new byte[1024];
        FileInputStream input = new FileInputStream("C:\\Users\\hesuh\\Desktop\\out_2.txt");
        input.read(b);

        System.out.println(new String(b));  // byte 배열을 문자열로 변경하여 출력
        // 출력 시 이상한 문자가 뜨는 걸 알 수 있는데, 이는 byte 배열에 남는 부분들이 존재하기 때문이다.
        input.close();

        // BufferedReader
        // 파일을 한 줄 단위로 읽어들인다.
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\hesuh\\Desktop\\out_3.txt"));
        while(true) {
            String line = br.readLine();
            if (line==null) break;  // 더 이상 읽을 라인이 없을 경우 while 문을 빠져나간다.
            // 읽을 라인이 없을 경우 null 을 반환함을 알 수 있다.
            System.out.println(line);
        }
        br.close();
    }
}
