package creational.abstractFatory.platform.linux;

import creational.abstractFatory.platform.AlertDialog;

public class LinuxAlertDialog implements AlertDialog {
    @Override
    public void show() {
        System.out.println("Show linux alert dialog");
    }
}
