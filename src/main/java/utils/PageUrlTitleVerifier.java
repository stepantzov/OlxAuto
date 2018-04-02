package utils;

public class PageUrlTitleVerifier implements UrlVerifier {

    private UrlVerifier expectedPageTitle = null;
    private UrlVerifier actualPageTitle = null;

    public PageUrlTitleVerifier(UrlVerifier expectedTitle, UrlVerifier actualUrl) {
        this.expectedPageTitle = expectedTitle;
        this.actualPageTitle = actualUrl;
    }

    @Override
    public String validateUrl() {
        if (expectedPageTitle.validateUrl() == actualPageTitle.validateUrl()) {
            return "page title is valid";
        }
        return "page title is invalid";
    }
}
