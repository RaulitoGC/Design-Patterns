package creational.abstractFatory;

import creational.abstractFatory.platform.PlatformFactory;
import creational.abstractFatory.platform.linux.LinuxFactory;
import creational.abstractFatory.platform.mac.MacFactory;
import creational.abstractFatory.platform.windows.WindowsFactory;

import java.util.NoSuchElementException;

public class PlatformFactoryProducer {


    public static PlatformFactory getPlatformFactory(PlatformType platformType) {
        PlatformFactory platformFactory = null;
        switch (platformType) {
            case WINDOWS:
                platformFactory = new WindowsFactory();
                break;
            case MAC:
                platformFactory = new MacFactory();
                break;
            case LINUX:
                platformFactory = new LinuxFactory();
                break;
            default:
                throw new NoSuchElementException();
        }
        return platformFactory;
    }

}
