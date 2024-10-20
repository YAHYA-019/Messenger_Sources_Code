package X;

/* renamed from: X.1qe, reason: invalid class name */
/* loaded from: 1qe.class */
public final class C1qe {
    public final C1qf A00;
    public final C02A A01;
    public final boolean A02;

    public C1qe(C1qf c1qf, C02A c02a, boolean z) {
        11T.A0F(c02a, 1);
        this.A01 = c02a;
        this.A02 = z;
        this.A00 = c1qf;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C1qe)) {
                return false;
            }
            C1qe c1qe = (C1qe) obj;
            if (!11T.A0O(this.A01, c1qe.A01) || this.A02 != c1qe.A02 || !11T.A0O(this.A00, c1qe.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((1BL.A03(this.A01) + AnonymousClass002.A00(this.A02 ? 1 : 0)) * 31) + AnonymousClass001.A02(this.A00);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("LithoConfiguration(componentsConfig=");
        A0k.append(this.A01);
        A0k.append(", areTransitionsEnabled=");
        A0k.append(this.A02);
        A0k.append(", renderUnitIdGenerator=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
