/* 
Take a Screenshot. Simple, really?

Mauro Masciadro
Masciar®
 */

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class screenshot {
	public static void main(String[] args) throws IOException {
		try
			{
				Robot robot = new Robot();
				BufferedImage screen = robot.createScreenCapture(new Rectangle (Toolkit.getDefaultToolkit().getScreenSize()));
				File file = new File("C:\\screen.jpg");
				ImageIO.write(screen, "jpg", file);
			}
		catch (AWTException e)
			{
				e.printStackTrace();
			}
		}
}
