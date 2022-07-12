import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileReadWrite
{
public static void main(String[] args)
{
try
{
FileWriter writer = new FileWriter("MyFile.txt", true);
writer.write("Hello Welcome to JAVA PROGRAMMING LANGUAGE");
FileReader reader = new FileReader("MyFiles.txt");
int character;
while ((character = reader.read()) != -1)
{
System.out.print((char) character);
}
reader.close(); writer.write("\r\n"); writer.write("Good Bye!");
writer.close();
}
catch (IOException e)
{
e.printStackTrace();
}
}
}

