package design.pattern.struct.adaptor;

import java.util.HashMap;
import java.util.Map;

public class Adaptor implements Target {
    private final Adaptee adaptee;
    private final Map<String, Integer> typeMap;

    public Adaptor() {
        adaptee = new Adaptee();
        typeMap = new HashMap<>();
        typeMap.put("type-a", 1);
        typeMap.put("type-b", 2);
        typeMap.put("type-c", 3);

    }

    @Override
    public TargetResult request(String type) {
        if (!typeMap.containsKey(type)) {
            return null;
        }

        AdapteeResult result = adaptee.request(typeMap.get(type));
        if (result == null) {
            return null;
        }

        TargetResult tRes = new TargetResult();
        tRes.setName(result.getName());
        tRes.setType(type);
        tRes.setSource("adaptee");
        return tRes;
    }

    public static void main(String[] args) {
        Adaptor adaptor = new Adaptor();

        System.out.println(adaptor.request("type-a"));
        System.out.println(adaptor.request("type-b"));
        System.out.println(adaptor.request("type-c"));
        System.out.println(adaptor.request("type-d"));

    }
}
