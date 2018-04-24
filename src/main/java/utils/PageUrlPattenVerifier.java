package utils;

public class PageUrlPattenVerifier implements UrlVerifier {
    private UrlVerifier expectedUrl = null;
    private UrlVerifier actualUrl = null;

    public PageUrlPattenVerifier(UrlVerifier expectedUrl, UrlVerifier actualUrl) {
        this.expectedUrl = expectedUrl;
        this.actualUrl = actualUrl;
    }

    @Override
    public String validateUrl() {
        if (actualUrl.validateUrl().contains(expectedUrl.validateUrl())) {
            return "url is valid";
        }
        return "url is invalid";
    }
}