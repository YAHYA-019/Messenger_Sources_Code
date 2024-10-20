package X;

import com.facebook.graphql.enums.GraphQLAREffectMLModelAssetTypeSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: Eah.class */
public abstract class Eah {
    public static final java.util.Map A00 = AnonymousClass001.A0u();
    public static final java.util.Map A01 = AnonymousClass001.A0u();

    static {
        HashMap A0u = AnonymousClass001.A0u();
        Iterator it = GraphQLAREffectMLModelAssetTypeSet.A00.iterator();
        while (it.hasNext()) {
            String A0i = AnonymousClass001.A0i(it);
            String A0W = 0CV.A0W(A0i, "_", "");
            Locale locale = Locale.ROOT;
            String upperCase = A0W.toUpperCase(locale);
            11T.A0A(upperCase);
            A0u.put(upperCase, A0i);
            java.util.Map map = A01;
            String upperCase2 = A0i.toUpperCase(locale);
            11T.A0A(upperCase2);
            map.put(upperCase2, A0i);
        }
        for (HC6 hc6 : HC6.values()) {
            Object obj = A0u.get(AbJ.A1A(hc6.toString()));
            if (obj != null) {
                A00.put(obj, hc6);
            }
        }
    }
}
