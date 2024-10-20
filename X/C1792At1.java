package X;

import java.util.List;

/* renamed from: X.At1, reason: case insensitive filesystem */
/* loaded from: At1.class */
public final class C1792At1 extends C04v implements DGp {
    public final AbU A00 = AbU.A05;
    public final List A01;

    public C1792At1(List list) {
        this.A01 = list;
    }

    @Override // X.DGp
    public List AgP() {
        return this.A01;
    }

    @Override // X.DGp
    public AbU AuN() {
        return this.A00;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1792At1) && 11T.A0O(this.A01, ((C1792At1) obj).A01));
    }

    public int hashCode() {
        return 1BL.A03(this.A01);
    }
}
