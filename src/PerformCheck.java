import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class PerformCheck {

	public static void main(String[] args) {
		
		try {
			String path="c:\\$MFT";
		    new File(path).mkdir();
			Files.write(Paths.get(path+"\\123"), "Test".getBytes(), StandardOpenOption.CREATE_NEW);
			Files.readAllBytes(Paths.get(path+"\\123"));
		} catch (IOException e) {
			 e.printStackTrace();
		}
	}

}
