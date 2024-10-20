package X;

/* renamed from: X.Jah, reason: case insensitive filesystem */
/* loaded from: Jah.class */
public final class C2825Jah extends KgJ {
    public boolean equals(Object obj) {
        boolean z = true;
        if (obj != this) {
            if (!(obj instanceof C2825Jah)) {
                return false;
            }
            KgJ kgJ = (KgJ) obj;
            if (11T.A0O(kgJ.A01, ((KgJ) this).A01) && 11T.A0O(kgJ.A00, ((KgJ) this).A00)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return 1BK.A03(((KgJ) this).A00, 1BL.A03(((KgJ) this).A01) * 31);
    }
}
