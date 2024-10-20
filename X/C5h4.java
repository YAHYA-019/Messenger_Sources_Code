package X;

import com.facebook.papaya.client.type.PapayaRestrictions;
import java.util.HashMap;

/* renamed from: X.5h4, reason: invalid class name */
/* loaded from: 5h4.class */
public final class C5h4 {
    public final java.util.Map A00 = new HashMap();

    public final PapayaRestrictions A00() {
        PapayaRestrictions papayaRestrictions = new PapayaRestrictions();
        papayaRestrictions.A00.putAll(this.A00);
        return papayaRestrictions;
    }

    public final void A01(C5h5 c5h5, long j) {
        this.A00.put(c5h5, Long.valueOf(j));
    }
}
