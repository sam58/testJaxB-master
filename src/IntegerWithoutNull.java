import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * Created by sam158 on 11.03.2016.
 */
public class IntegerWithoutNull extends XmlAdapter<String,Integer> {
    @Override
    public Integer unmarshal(String v) throws Exception {
        System.out.println("111 - "+v);
        if("".equals(v) || v==null ){
            return null;
        }else{
            return Integer.parseInt(v);
        }
    }

    @Override
    public String marshal(Integer v) throws Exception {
        return v.toString();
    }
}
