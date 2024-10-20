package X;

/* renamed from: X.9tt, reason: invalid class name */
/* loaded from: 9tt.class */
public final class C9tt implements C5cv {
    public final /* synthetic */ 8Gf A00;

    public C9tt(8Gf r302) {
        this.A00 = r302;
    }

    @Override // X.C5cv
    public void CGE() {
        8Gf r0 = this.A00;
        if (r0.mDetached) {
            return;
        }
        9Zz r02 = r0.A0I;
        if (r02 == null) {
            11T.A0L("montageLoader");
            throw 0Q8.createAndThrow();
        }
        r02.A00();
    }
}
