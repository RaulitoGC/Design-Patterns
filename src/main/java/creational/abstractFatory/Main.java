package creational.abstractFatory;

import creational.abstractFatory.platform.AlertDialog;
import creational.abstractFatory.platform.Button;
import creational.abstractFatory.platform.windows.WindowsButton;
import creational.abstractFatory.platform.windows.WindowsFactory;

public class Main {

    public static void main(String[] args) {

        Button button  = PlatformFactoryProducer.getPlatformFactory(PlatformType.LINUX).getButton();
        button.onClick();

        AlertDialog alertDialog =  PlatformFactoryProducer.getPlatformFactory(PlatformType.LINUX).getAlertDialog();
        alertDialog.show();
    }
}
