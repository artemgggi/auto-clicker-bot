import java.awt.*;
import java.awt.event.InputEvent;

public class Clicker {
    public static void main(String[] args) {
        Robot bot = null;
        try {
            bot = new Robot();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //default cursor pos
        bot.mouseMove(653,929);
        bot.delay(3000);
        int mask = InputEvent.BUTTON1_DOWN_MASK;
        for (int i = 0; i < 4; i++) {
            bot.mouseMove(653,929);
            bot.mousePress(mask);
            bot.delay(500);
            bot.mouseRelease(mask);
            System.out.println("Delete button pressed");
            bot.delay(1000);
            bot.mouseMove(878, 582);
            //cursor pos
            System.out.println(MouseInfo.getPointerInfo().getLocation());
            bot.mousePress(mask);
            bot.delay(500);
            bot.mouseRelease(mask);
            System.out.println("Confirm button pressed");
            bot.delay(2000);
        }

        //select name field
        bot.mouseMove(513,264);
        bot.mousePress(mask);
        bot.delay(500);
        bot.mouseRelease(mask);
        bot.delay(1000);
        int maskRightClick = InputEvent.BUTTON3_DOWN_MASK;
        bot.mousePress(maskRightClick);
        bot.mouseRelease(maskRightClick);
        bot.delay(500);
        bot.mouseMove(599,395);
        bot.mousePress(mask);
        bot.delay(500);
        bot.mouseRelease(mask);
    }
}
