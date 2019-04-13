package structural.adapter;

import structural.adapter.android.AndroidDevice;
import structural.adapter.android.UsbRecharge;
import structural.adapter.iphone.IPhoneDevice;
import structural.adapter.iphone.UsbCRecharge;

public class Main {


    static void recharbyUsb(UsbRecharge device) {
        device.connect();
        device.recharge();
    }

    static void recharbyUsbC(UsbCRecharge device) {
        device.connect();
        device.recharge();
    }

    public static void main(String[] args) {

        AndroidDevice android = new AndroidDevice();
        IPhoneDevice iphone = new IPhoneDevice();

        recharbyUsb(android);
        recharbyUsbC(iphone);

        recharbyUsbC(new UsbToUsbCadapter(android));

    }
}
