package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: F6d.class */
public final class F6d {
    public String A00;
    public final Object A02 = AnonymousClass001.A0R();
    public List A01 = Collections.synchronizedList(AbF.A1F());
    public final java.util.Map A08 = DKD.A13();
    public final java.util.Map A06 = DKD.A13();
    public final java.util.Map A07 = DKD.A13();
    public final java.util.Map A05 = DKD.A13();
    public final java.util.Map A03 = DKD.A13();
    public final java.util.Map A04 = DKD.A13();

    public static void A00(StringBuilder sb, List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        synchronized (list) {
            Iterator it = list.iterator();
            sb.append(AnonymousClass001.A0i(it));
            while (it.hasNext()) {
                sb.append(" | ");
                sb.append(AnonymousClass001.A0i(it));
            }
        }
    }
}
