package entity.Adapters;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by smasalykin on 09.03.2016.
 * Адаптер преобразования адреса из Domino-бороды в FN-формат
 */
public class AddresseeAdapter extends XmlAdapter<String,String> {
    private static final Pattern EMP_EXT_ID_PATTERN = Pattern.compile(
            ".*%([0-9a-f]{32})%[0-9a-f]+[\\s\\n]*$",
            Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.DOTALL
    );


    @Override
    public String unmarshal(String v) throws Exception {
        return extractEmployeeExternalId(v) ;
    }

    @Override
    public String marshal(String v) throws Exception {
        return null;
    }

    protected String extractEmployeeExternalId(String addressee) {
        final Matcher matcher = EMP_EXT_ID_PATTERN.matcher(addressee);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }
}
