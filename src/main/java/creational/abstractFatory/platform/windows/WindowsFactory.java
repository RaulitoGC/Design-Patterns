package creational.abstractFatory.platform.windows;

import creational.abstractFatory.platform.AlertDialog;
import creational.abstractFatory.platform.Button;
import creational.abstractFatory.platform.PlatformFactory;

public class WindowsFactory implements PlatformFactory {

    @Override
    public Button getButton() {
        return new WindowsButton();
    }

    @Override
    public AlertDialog getAlertDialog() {
        return new WindowsAlertDialog();
    }
}
