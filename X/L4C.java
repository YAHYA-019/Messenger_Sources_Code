package X;

/* loaded from: L4C.class */
public final class L4C {
    public final boolean A00;
    public final boolean A01;
    public final KNo A02;

    public L4C() {
        this(KNo.A02, false, false);
    }

    public L4C(KNo kNo, boolean z, boolean z2) {
        this.A01 = z;
        this.A00 = z2;
        this.A02 = kNo;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof L4C)) {
                return false;
            }
            L4C l4c = (L4C) obj;
            if (this.A01 != l4c.A01 || this.A00 != l4c.A00 || this.A02 != l4c.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A02, ((AnonymousClass002.A00(this.A01 ? 1 : 0) * 31) + AnonymousClass002.A00(this.A00 ? 1 : 0)) * 31);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("LinkedAppConfig(enableFBPermissionService=");
        A0k.append(this.A01);
        A0k.append(", elevateLogLevel=");
        A0k.append(this.A00);
        A0k.append(AbE.A00(225));
        return AnonymousClass002.A0K(this.A02, A0k);
    }
}
