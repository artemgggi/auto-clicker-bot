import java.awt.*;

public class FindPosition {
    public static void main(String[] args) throws AWTException {
        Robot bot = new Robot();
        bot.delay(3000);
        System.out.println(MouseInfo.getPointerInfo().getLocation());
    }
}
