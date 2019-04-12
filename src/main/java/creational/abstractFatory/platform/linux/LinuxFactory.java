package creational.abstractFatory.platform.linux;

import creational.abstractFatory.platform.AlertDialog;
import creational.abstractFatory.platform.Button;
import creational.abstractFatory.platform.PlatformFactory;

public class LinuxFactory implements PlatformFactory {


    @Override
    public Button getButton() {
        return new LinuxButton();
    }

    @Override
    public AlertDialog getAlertDialog() {
        return new LinuxAlertDialog();
    }
}
