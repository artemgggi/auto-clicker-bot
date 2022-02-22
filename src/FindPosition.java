import java.awt.*;

public class FindPosition {
    public static void main(String[] args) throws AWTException {
        Robot bot = new Robot();
        bot.delay(2000);
        System.out.println(MouseInfo.getPointerInfo().getLocation());
        System.out.println(bot.getPixelColor(688,720));
    }
}
