package creational.builder;

public class LoginBankLibrary implements Login {

    private String logo;
    private String color;
    private boolean enableSomething;
    private boolean showAds;
    private String title;
    private String subtitle;
    private String fullName;

    public LoginBankLibrary(LoginBuilder builder) {

    }

    public LoginBankLibrary(String logo, String color, boolean enableSomething, boolean showAds, String title, String subtitle, String fullName) {
        this.logo = logo;
        this.color = color;
        this.enableSomething = enableSomething;
        this.showAds = showAds;
        this.title = title;
        this.subtitle = subtitle;
        this.fullName = fullName;
    }

    @Override
    public void makeLogin() {
        System.out.println(" login in" + title + " bank");
    }
}
