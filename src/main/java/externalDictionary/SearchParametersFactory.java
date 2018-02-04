package externalDictionary;

public class SearchParametersFactory {
    public ExternalDictionary getDictionary(String parametersType) {
        if (parametersType == null) {
            return null;
        }
        if (parametersType.equalsIgnoreCase("PARAMETERSLOCALIZED")) {
            return new SearchParametersLocalized();
        } else if (parametersType.equalsIgnoreCase("PARAMETERSNOTLOCALIZED")) {
            return new SearchParametersNotLocalized();
        }
        return null;
    }
}