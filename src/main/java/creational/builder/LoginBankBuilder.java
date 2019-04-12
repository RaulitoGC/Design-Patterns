package creational.builder;

public class LoginBankBuilder implements LoginBuilder {

    private String logo;
    private String color;
    private boolean enableSomething;
    private boolean showAds;
    private String title;
    private String subtitle;
    private String fullName;

    @Override
    public LoginBankLibrary build() {
        return new LoginBankLibrary(logo, color, enableSomething, showAds, title, subtitle, fullName);
        //return new LoginBankLibrary(this);
    }

    @Override
    public LoginBuilder setLogo(String logo) {
        this.logo = logo;
        return this;
    }

    @Override
    public LoginBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public LoginBuilder setEnableSomething(boolean enableSomething) {
        this.enableSomething = enableSomething;
        return this;
    }

    @Override
    public LoginBuilder setShowAds(boolean showAds) {
        this.showAds = showAds;
        return this;
    }

    @Override
    public LoginBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    @Override
    public LoginBuilder setSubtitle(String subtitle) {
        this.subtitle = subtitle;
        return this;
    }

    @Override
    public LoginBuilder setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }
}
