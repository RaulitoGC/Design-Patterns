package creational.abstractFatory.platform.mac;

import creational.abstractFatory.platform.Button;

public class MacButton implements Button {
    @Override
    public void onClick() {
        System.out.println("Click on mac button");
    }
}
