import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Clicker {
    public static void main(String[] args) {
        Robot r = null;
        try {
            r = new Robot();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //default cursor position
        assert r != null;
        r.mouseMove(653,929);
        r.delay(3000);
        int maskLeftClick = InputEvent.BUTTON1_DOWN_MASK;
        int maskRightClick = InputEvent.BUTTON3_DOWN_MASK;
        for (int i = 0; i < 4; i++) {
            r.mouseMove(653,929);
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
        r.mouseMove(513,264);
        r.mousePress(maskLeftClick);
        r.delay(500);
        r.mouseRelease(maskLeftClick);
        r.delay(1000);
        r.mousePress(maskRightClick);
        r.mouseRelease(maskRightClick);
        r.delay(500);
        r.mouseMove(599,395);
        r.mousePress(maskLeftClick);
        r.delay(500);
        r.mouseRelease(maskLeftClick);
        r.keyPress(KeyEvent.VK_BACK_SPACE);
        r.delay(500);
    }
}
