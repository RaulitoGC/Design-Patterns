package structural.adapter;

import structural.adapter.android.UsbRecharge;
import structural.adapter.iphone.UsbCRecharge;

public class UsbToUsbCadapter implements UsbCRecharge {

    private UsbRecharge usbRecharge;

    public UsbToUsbCadapter(UsbRecharge usbRecharge) {
        this.usbRecharge = usbRecharge;
    }

    @Override
    public void connect() {
        System.out.println("Device connected by USB C");
    }

    @Override
    public void recharge() {
        usbRecharge.recharge();
    }
}
