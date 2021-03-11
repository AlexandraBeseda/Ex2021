
import java.io.FileReader;
import java.io.IOException;

public class FileReaderFileWriter1 {
    public static void main(String[] args) throws IOException {
        FileReader flr1=new FileReader("C://Users/User/Desktop/Test.txt");//нет команыд attend
        int c;//будем читать посимвольно файл
        while((c=flr1.read())!=-1){
            /*
            будет читать символы пока не закончатся, когда закончатся, ридер вернет значение -1
            как только выражение равно -1 у нас заканчиваются файлы и мы выходим из файла
             */
    System.out.print((char)c);//мы не будем переносить символы на следующую строку!
        }
    }
}

