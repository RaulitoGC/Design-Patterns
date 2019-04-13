package structural.adapter.iphone;

public class IPhoneDevice implements UsbCRecharge {
    @Override
    public void connect() {
        System.out.println("Device connected by USB C");
    }

    @Override
    public void recharge() {
        System.out.println(" Device rechargin with usb C connection");
    }
}
