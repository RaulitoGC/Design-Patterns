package creational.builder;

public interface LoginBuilder {

    LoginBankLibrary build();

    LoginBuilder setLogo(String logo);

    LoginBuilder setColor(String color);

    LoginBuilder setEnableSomething(boolean enableSomething);

    LoginBuilder setShowAds(boolean showAds);

    LoginBuilder setTitle(String title);

    LoginBuilder setSubtitle(String subtitle);

    LoginBuilder setFullName(String fullName);

}
