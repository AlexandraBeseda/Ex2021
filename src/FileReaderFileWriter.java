
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderFileWriter {
    public static void main(String[] args) throws IOException {// безопасность
        FileWriter fw1= new FileWriter("C://Users/User/Desktop/Test.txt",true);
        /*
        true-дописывать в конец файла новую информацию,false-перезаписать
         */
        String text="Это напечатано на русском языке, перезапись.";
        fw1.write(text);//основной метод
        fw1.append("\n");
        fw1.close();//необходимо всегда закрывать потоки



    }
}
