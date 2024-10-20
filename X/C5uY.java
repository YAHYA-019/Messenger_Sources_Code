package X;

import com.facebook.common.stringformat.StringFormatUtil;

/* renamed from: X.5uY, reason: invalid class name */
/* loaded from: 5uY.class */
public final class C5uY extends C5fu {
    public final C5vw A00;
    public final C5vx A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final C5fx A05;

    public C5uY(C5vu c5vu) {
        super(c5vu);
        this.A05 = C5fw.A02;
        String str = c5vu.A02;
        if (str == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A02 = str;
        C5vx c5vx = c5vu.A01;
        if (c5vx == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A01 = c5vx;
        this.A00 = c5vu.A00;
        this.A03 = c5vu.A03;
        this.A04 = c5vu.A04;
    }

    @Override // X.C5fv
    public C5fx Ax3() {
        return this.A05;
    }

    @Override // X.C5fu
    public boolean equals(Object obj) {
        boolean z = true;
        if (obj != this) {
            if (!(obj instanceof C5uY)) {
                return false;
            }
            C5uY c5uY = (C5uY) obj;
            if (11T.A0O(this.A02, c5uY.A02) && this.A01 == c5uY.A01 && 11T.A0O(this.A00, c5uY.A00) && super.equals(obj)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    @Override // X.C5fu
    public int hashCode() {
        return 1BK.A03(this.A00, AnonymousClass002.A05(this.A01, AnonymousClass002.A07(this.A02, super.hashCode() * 31)));
    }

    @Override // X.C5fu
    public String toString() {
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("[AdminMessage text=%s super=%s]", this.A02, super.toString());
        11T.A0A(formatStrLocaleSafe);
        return formatStrLocaleSafe;
    }
}
