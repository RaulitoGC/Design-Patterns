package creational.abstractFatory.platform.mac;

import creational.abstractFatory.platform.AlertDialog;

public class MacAlertDialog implements AlertDialog {
    @Override
    public void show() {
        System.out.println("Show mac alert dialog");
    }
}
