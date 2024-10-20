package X;

import android.content.Context;

/* loaded from: K5I.class */
public final class K5I extends KRW {
    public final Context A00;
    public final MGF A01;

    public K5I(Context context, MGF mgf) {
        this.A00 = context;
        this.A01 = mgf;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof KRW)) {
                return false;
            }
            K5I k5i = (K5I) ((KRW) obj);
            if (!this.A00.equals(k5i.A00) || !this.A01.equals(k5i.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((this.A00.hashCode() ^ 1000003) * 1000003) ^ this.A01.hashCode();
    }

    public final String toString() {
        return 0Pz.A0z("FlagsContext{context=", this.A00.toString(), ", hermeticFileOverrides=", this.A01.toString(), "}");
    }
}
