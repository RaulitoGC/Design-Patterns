package creational.abstractFatory.platform.windows;

import creational.abstractFatory.platform.Button;

public class WindowsButton implements Button {
    @Override
    public void onClick() {
        System.out.println("Click on windows button");
    }
}
