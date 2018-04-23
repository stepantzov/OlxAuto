package utils;

public class UrlInterpreter {
    public static UrlVerifier verifyIfUrlLocaleCorrect(String expectedLocale, String actualUrl) {
        UrlVerifier expectedUrlLocale = new TerminalPageUrlPatternValidator(expectedLocale);
        UrlVerifier fullPageUrl = new TerminalPageUrlPatternValidator(actualUrl);

        return new PageUrlLocaleVerifiyer(expectedUrlLocale, fullPageUrl);
    }

    public static UrlVerifier verifyIfPageUrlPatternCorrect(String expectedPagePattern, String actualPageUrlPattern) {
        UrlVerifier expectedUrlPattern = new TerminalPageUrlPatternValidator(expectedPagePattern);
        UrlVerifier actualUrl = new TerminalPageUrlPatternValidator(actualPageUrlPattern);

        return new PageUrlPattenVerifier(expectedUrlPattern, expectedUrlPattern);
    }
}