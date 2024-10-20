package X;

import java.util.Collections;
import java.util.HashMap;

/* loaded from: L35.class */
public final class L35 {
    public final KT1 A00;
    public final java.util.Map A01;
    public final boolean A02;

    public L35(KT1 kt1, java.util.Map map, boolean z) {
        java.util.Map unmodifiableMap;
        this.A02 = z;
        this.A00 = kt1;
        if (map == null) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            HashMap A0u = AnonymousClass001.A0u();
            A0u.putAll(map);
            unmodifiableMap = Collections.unmodifiableMap(A0u);
        }
        this.A01 = unmodifiableMap;
    }

    public static L35 A00(KT1 kt1) {
        return new L35(kt1, null, true);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj != this) {
            if (!(obj instanceof L35)) {
                return false;
            }
            L35 l35 = (L35) obj;
            if (this.A02 == l35.A02 && this.A00.equals(l35.A00) && this.A01.equals(l35.A01)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return AnonymousClass002.A05(this.A00, AbstractC2326GOr.A03(AnonymousClass002.A00(this.A02 ? 1 : 0))) + this.A01.hashCode();
    }
}
