package creational.abstractFatory.platform.linux;

import creational.abstractFatory.platform.Button;

public class LinuxButton implements Button {
    @Override
    public void onClick() {
        System.out.println("Click on linux button");
    }
}
