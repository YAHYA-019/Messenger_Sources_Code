package X;

import java.util.Arrays;
import java.util.HashMap;

/* loaded from: J7P.class */
public final class J7P extends HashMap {
    public final int A00;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Integer] */
    public J7P(int i) {
        HC7 hc7;
        Object asList;
        this.A00 = i;
        if (i != 0) {
            put(2, "BLUETOOTH");
            put(4YU.A0k(), "CELLULAR");
            put(AbG.A11(), "ETHERNET");
            put(4, "VPN");
            hc7 = 7zN.A0i();
            asList = "WIFI";
        } else {
            put(HC7.A0Z, Arrays.asList("arsegmentation"));
            put(HC7.A12, Arrays.asList("arsegmentation"));
            put(HC7.A0M, Arrays.asList("arservicesforexpressionfitting"));
            hc7 = HC7.A1F;
            asList = Arrays.asList("arservicesforruntimerigmapping");
        }
        put(hc7, asList);
    }
}
