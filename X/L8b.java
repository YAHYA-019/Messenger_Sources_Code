package X;

import java.util.AbstractCollection;

/* loaded from: L8b.class */
public final class L8b {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final String A03;

    public L8b(Object obj, String str, int i, int i2) {
        this.A02 = obj;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = str;
        if (i > i2) {
            throw AnonymousClass001.A0L("Reversed range is not supported");
        }
    }

    public static void A00(L8b l8b, Object obj, AbstractCollection abstractCollection, int i, int i2) {
        if (L9U.A02(i, i2, l8b.A01, l8b.A00)) {
            abstractCollection.add(obj);
        }
    }

    public static void A01(Object obj, AbstractCollection abstractCollection, int i, int i2) {
        abstractCollection.add(new L8b(obj, "", i, i2));
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof L8b)) {
                return false;
            }
            L8b l8b = (L8b) obj;
            if (!11T.A0O(this.A02, l8b.A02) || this.A01 != l8b.A01 || this.A00 != l8b.A00 || !11T.A0O(this.A03, l8b.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zM.A05(this.A03, ((((AnonymousClass001.A02(this.A02) * 31) + this.A01) * 31) + this.A00) * 31);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Range(item=");
        A0k.append(this.A02);
        A0k.append(", start=");
        A0k.append(this.A01);
        A0k.append(", end=");
        A0k.append(this.A00);
        A0k.append(", tag=");
        return DKH.A0o(this.A03, A0k);
    }
}
