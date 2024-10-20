package X;

/* loaded from: L22.class */
public final class L22 {
    public long A00;
    public final MCv A01;

    public L22(MCv mCv) {
        AbstractC00481b7.A02(mCv);
        this.A01 = mCv;
    }

    public L22(MCv mCv, long j) {
        AbstractC00481b7.A02(mCv);
        this.A01 = mCv;
        this.A00 = j;
    }

    public final boolean A00(long j) {
        long j2 = this.A00;
        boolean z = true;
        if (j2 != 0 && JQx.A0O(j2) <= j) {
            z = false;
        }
        return z;
    }
}
