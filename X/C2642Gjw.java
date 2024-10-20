package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.Gjw, reason: case insensitive filesystem */
/* loaded from: Gjw.class */
public final class C2642Gjw extends C04v implements JDB {
    public final int A00 = 0;
    public final Object A01;

    public C2642Gjw(List list) {
        this.A01 = list;
    }

    public C2642Gjw(int[] iArr) {
        11T.A0F(iArr, 1);
        this.A01 = iArr;
    }

    public boolean equals(Object obj) {
        if (this.A00 == 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2642Gjw)) {
                return false;
            }
            C2642Gjw c2642Gjw = (C2642Gjw) obj;
            return c2642Gjw.A00 == 0 && 11T.A0O(this.A01, c2642Gjw.A01);
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2642Gjw)) {
            return false;
        }
        C2642Gjw c2642Gjw2 = (C2642Gjw) obj;
        if (c2642Gjw2.A00 == 1) {
            return Arrays.equals((int[]) this.A01, (int[]) c2642Gjw2.A01);
        }
        return false;
    }

    public int hashCode() {
        return this.A00 != 0 ? Arrays.hashCode((int[]) this.A01) : this.A01.hashCode();
    }

    public String toString() {
        if (this.A00 != 0) {
            return super.toString();
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CallAdminsViewState(callAdmins=");
        return AnonymousClass002.A0K(this.A01, A0k);
    }
}
