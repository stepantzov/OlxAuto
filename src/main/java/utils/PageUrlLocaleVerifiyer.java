package utils;

public class PageUrlLocaleVerifiyer implements UrlVerifier {
    private UrlVerifier expectedLocale = null;
    private UrlVerifier actualUrl = null;

    public PageUrlLocaleVerifiyer(UrlVerifier expectedLocale, UrlVerifier actualUrl) {
        this.actualUrl = actualUrl;
        this.expectedLocale = expectedLocale;
    }

    @Override
    public String validateUrl() {
        if (actualUrl.validateUrl().contains(expectedLocale.validateUrl())) {
            return "url locale is valid";
        }
        return "url locale is invalid";
    }
}