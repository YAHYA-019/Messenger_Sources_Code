package X;

/* renamed from: X.29P, reason: invalid class name */
/* loaded from: 29P.class */
public final class C29P {
    public final C28s A00;
    public final 25G A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public C29P(C28s c28s, 25G r303, boolean z, boolean z2, boolean z3) {
        11T.A0F(r303, 1);
        this.A01 = r303;
        this.A00 = c28s;
        this.A04 = z;
        this.A02 = z2;
        this.A03 = z3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C29P)) {
                return false;
            }
            C29P c29p = (C29P) obj;
            if (!11T.A0O(this.A01, c29p.A01) || !11T.A0O(this.A00, c29p.A00) || this.A04 != c29p.A04 || this.A02 != c29p.A02 || this.A03 != c29p.A03) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((AnonymousClass002.A05(this.A00, 1BL.A03(this.A01)) + AnonymousClass002.A00(this.A04 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A02 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A03 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Model(renderUnit=");
        A0k.append(this.A01);
        A0k.append(", viewAttributes=");
        A0k.append(this.A00);
        A0k.append(", isRootHost=");
        A0k.append(this.A04);
        A0k.append(", cloneStateListAnimators=");
        A0k.append(this.A02);
        A0k.append(", isEventHandlerRedesignEnabled=");
        A0k.append(this.A03);
        return AnonymousClass001.A0g(A0k, ')');
    }
}
