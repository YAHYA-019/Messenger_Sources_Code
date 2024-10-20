package X;

/* renamed from: X.4Qe, reason: invalid class name */
/* loaded from: 4Qe.class */
public final class C4Qe extends 3sX {
    public C4Nt A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public C4Qe A04;
    public final C4Qe A05;

    public C4Qe(C4Nt c4Nt, C4Qe c4Qe, int i, boolean z) {
        ((3sX) this).A01 = i;
        this.A05 = c4Qe;
        this.A00 = c4Nt;
        ((3sX) this).A00 = -1;
        this.A03 = z;
        this.A02 = false;
    }

    private void A00(StringBuilder sb) {
        char c;
        C4Qe c4Qe = this.A05;
        if (c4Qe != null) {
            c4Qe.A00(sb);
        }
        int i = ((3sX) this).A01;
        if (i == 2) {
            sb.append('{');
            String str = this.A01;
            char c2 = '?';
            if (str != null) {
                c2 = '\"';
                sb.append('\"');
                sb.append(str);
            }
            sb.append(c2);
            c = '}';
        } else {
            if (i != 1) {
                sb.append("/");
                return;
            }
            sb.append('[');
            int i2 = ((3sX) this).A00;
            if (i2 < 0) {
                i2 = 0;
            }
            sb.append(i2);
            c = ']';
        }
        sb.append(c);
    }

    public C42h A06() {
        if (!this.A03) {
            this.A03 = true;
            return ((3sX) this).A01 == 2 ? C42h.A06 : C42h.A05;
        }
        if (!this.A02 || ((3sX) this).A01 != 2) {
            return null;
        }
        this.A02 = false;
        return C42h.A03;
    }

    public C4Qe A07(C4Nt c4Nt, boolean z) {
        C4Qe c4Qe = this.A04;
        if (c4Qe == null) {
            C4Qe c4Qe2 = new C4Qe(c4Nt, this, 1, z);
            this.A04 = c4Qe2;
            return c4Qe2;
        }
        ((3sX) c4Qe).A01 = 1;
        c4Qe.A00 = c4Nt;
        ((3sX) c4Qe).A00 = -1;
        c4Qe.A01 = null;
        c4Qe.A03 = z;
        c4Qe.A02 = false;
        return c4Qe;
    }

    public C4Qe A08(C4Nt c4Nt, boolean z) {
        C4Qe c4Qe = this.A04;
        if (c4Qe == null) {
            C4Qe c4Qe2 = new C4Qe(c4Nt, this, 2, z);
            this.A04 = c4Qe2;
            return c4Qe2;
        }
        ((3sX) c4Qe).A01 = 2;
        c4Qe.A00 = c4Nt;
        ((3sX) c4Qe).A00 = -1;
        c4Qe.A01 = null;
        c4Qe.A03 = z;
        c4Qe.A02 = false;
        return c4Qe;
    }

    public void A09() {
        if (((3sX) this).A01 != 2) {
            ((3sX) this).A00++;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        A00(sb);
        return sb.toString();
    }
}
