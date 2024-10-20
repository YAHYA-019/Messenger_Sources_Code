package X;

/* loaded from: FuK.class */
public final class FuK implements 5Y3 {
    public final 5Y3 A02;
    public boolean A01 = false;
    public 5Y6 A00 = null;

    public FuK(5Y3 r302) {
        this.A02 = r302;
    }

    public /* bridge */ /* synthetic */ void CKJ(Object obj) {
        Ejv ejv = (Ejv) obj;
        if (ejv.A01) {
            5Y6 r0 = this.A00;
            if (r0 != null) {
                r0.A00();
                this.A00 = null;
            }
            if (this.A01) {
                return;
            }
            this.A01 = true;
            this.A02.CKJ(ejv.A00);
        }
    }
}
