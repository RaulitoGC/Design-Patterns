package creational.abstractFatory.platform.windows;

import creational.abstractFatory.platform.AlertDialog;

public class WindowsAlertDialog implements AlertDialog {
    @Override
    public void show() {
        System.out.println("Show linux alert dialog");
    }
}
