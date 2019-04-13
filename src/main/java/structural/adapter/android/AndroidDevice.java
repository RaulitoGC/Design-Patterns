package structural.adapter.android;

public class AndroidDevice implements UsbRecharge {

    @Override
    public void connect() {
        System.out.println("Device connected by USB");
    }

    @Override
    public void recharge() {
        System.out.println(" Device rechargin with usb connection");
    }
}
