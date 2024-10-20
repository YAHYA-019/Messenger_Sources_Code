package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* loaded from: KW5.class */
public abstract class KW5 {
    public static final LinkedHashMap A00(C11424wg c11424wg) {
        LinkedHashMap linkedHashMap;
        List<8Lu> list = (List) c11424wg.A0E.A00;
        if (list.isEmpty()) {
            linkedHashMap = null;
        } else {
            linkedHashMap = new LinkedHashMap(4YV.A01(list));
            for (8Lu r0 : list) {
                String str = 1 - AnonymousClass001.A03(r0.A00) != 0 ? "PAYMENT_SAVE_AUTOFILL_BEHAVIOR" : "CONTACT_SAVE_AUTOFILL_BEHAVIOR";
                Locale locale = Locale.ROOT;
                linkedHashMap.put(4YU.A18(locale, str), 4YU.A18(locale, KVt.A00((Integer) r0.A01)));
            }
        }
        return linkedHashMap;
    }
}
