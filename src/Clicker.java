import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;


public class Clicker {

    static int maskLeftClick = InputEvent.BUTTON1_DOWN_MASK;
    static int maskRightClick = InputEvent.BUTTON3_DOWN_MASK;
    public static Color purple = new Color(232, 255, 224);

    public static void main(String[] args) {
        Robot r = null;
        try {
            r = new Robot();
        } catch (Exception e) {
            e.printStackTrace();
        }
        assert r != null;
        r.mouseMove(653, 929);
        r.delay(2000);
        Color color = null;
        while (color != purple) {
            color = r.getPixelColor(100, 100);
            for (int i = 0; i < 49; i++) {
                r.mouseMove(653, 929);
                r.mousePress(maskLeftClick);
                r.delay(500);
                r.mouseRelease(maskLeftClick);
                System.out.println("Delete button pressed");
                r.delay(1000);
                r.mouseMove(878, 582);
                //cursor position
                //System.out.println(MouseInfo.getPointerInfo().getLocation());
                r.mousePress(maskLeftClick);
                r.delay(500);
                r.mouseRelease(maskLeftClick);
                System.out.println("Confirm button pressed");
                r.delay(2000);
            }
            //select name field
            r.mouseMove(513, 264);
            r.mousePress(maskLeftClick);
            r.delay(500);
            r.mouseRelease(maskLeftClick);
            r.delay(1000);
            r.mousePress(maskRightClick);
            r.mouseRelease(maskRightClick);
            r.delay(500);
            r.mouseMove(599, 395);
            r.mousePress(maskLeftClick);
            r.delay(500);
            r.mouseRelease(maskLeftClick);
            r.keyPress(KeyEvent.VK_BACK_SPACE);
            r.delay(500);
            //select number field
            r.mouseMove(535, 300);
            r.mousePress(maskLeftClick);
            r.delay(500);
            r.mouseRelease(maskLeftClick);
            r.delay(1000);
            r.mousePress(maskRightClick);
            r.mouseRelease(maskRightClick);
            r.delay(500);
            r.mouseMove(578, 437);
            r.mousePress(maskLeftClick);
            r.delay(500);
            r.mouseRelease(maskLeftClick);
            r.keyPress(KeyEvent.VK_BACK_SPACE);
            r.delay(500);
            //select date of birth
            r.mouseMove(439, 341);
            r.mousePress(maskLeftClick);
            r.delay(500);
            r.mouseRelease(maskLeftClick);
            r.delay(1000);
            r.mousePress(maskRightClick);
            r.mouseRelease(maskRightClick);
            r.delay(500);
            r.mouseMove(517, 467);
            r.mousePress(maskLeftClick);
            r.delay(500);
            r.mouseRelease(maskLeftClick);
            r.delay(500);
            r.keyPress(KeyEvent.VK_BACK_SPACE);
            r.delay(500);
            //select query button
            r.mouseMove(354, 926);
            r.delay(500);
            r.mousePress(maskLeftClick);
            r.delay(500);
            r.mouseRelease(maskLeftClick);
            r.mouseMove(961, 610);
            r.mousePress(maskLeftClick);
            r.mouseRelease(maskLeftClick);
            r.delay(500);
            r.keyPress(KeyEvent.VK_BACK_SPACE);
            r.delay(500);
            //select patient field
            r.mouseMove(363, 643);
            r.mousePress(maskLeftClick);
            r.mouseRelease(maskLeftClick);
            r.mouseMove(653, 929);
        }
    }
}
