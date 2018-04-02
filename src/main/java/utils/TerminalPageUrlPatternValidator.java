package utils;

import org.apache.commons.validator.routines.UrlValidator;

public class TerminalPageUrlPatternValidator implements UrlVerifier {

    String url;

    public TerminalPageUrlPatternValidator(String url) {
        this.url = url;
    }

    @Override
    public String validateUrl() {
        UrlValidator urlValidator = new UrlValidator();

        if (urlValidator.isValid(url)) {
            return "valid";
        }
        return "invalid";
    }
}