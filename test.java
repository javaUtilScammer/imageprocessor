import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class test{
	public static void main(String args[])throws IOException{
		BufferedImage image = null;
		File f = null;

		try{
			f = new File("test.jpg");
			image = ImageIO.read(f);
		}
		catch(IOException e){
			System.out.println("Error: "+e);
		}

		try{
			f = new File("out.jpg");
			ImageIO.write(image, "jpg", f);
		}
		catch(IOException e){
			System.out.println("Error: "+e);
		}
	}
}