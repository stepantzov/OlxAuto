package externalDictionary;

import java.util.ArrayList;
import java.util.List;


public class SearchParametersLocalized implements ExternalDictionary {
    @Override
    public List getSearchParameter() {
        List<String> items = DictionaryReader.fileReader();
        List<String> returnItems = new ArrayList<>();
        for (int i = 0; i < (items.toArray().length); i++) {
            if ((i % 2) != 0) {
                returnItems.add(items.get(i));
            }
        }
        return items;
    }
}