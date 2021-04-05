package saint.screenshot;

import java.io.File;
import java.io.IOException;

public class Screenshot {

    public static void TakeScreenshot(String filePath, String fileName) {
        try {
            Robot robot = new Robot();
            Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage screenFullImage = robot.createScreenCapture(screenRect);
            ImageIO.write(screenFullImage, "jpg", new File(filePath + fileName + ".jpg"));
        } catch (AWTException | IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}