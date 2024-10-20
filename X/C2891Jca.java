package X;

/* renamed from: X.Jca, reason: case insensitive filesystem */
/* loaded from: Jca.class */
public final class C2891Jca extends LPR implements MNT, MNN {
    public MEO A00;
    public boolean A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.0CL] */
    public void C9l() {
        ?? obj = new Object();
        KUl.A00(this, new JR6(this, (Object) obj, 0));
        MEP mep = (MEP) ((0CL) obj).element;
        if (this.A01) {
            MEO meo = this.A00;
            if (meo != null) {
                meo.release();
            }
            this.A00 = mep != null ? mep.CXP() : null;
        }
    }
}
