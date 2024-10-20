package X;

/* renamed from: X.8pt, reason: invalid class name */
/* loaded from: 8pt.class */
public final class C8pt extends 2Yv {
    public ELJ A00;
    public ELK A01;
    public Object A02;
    public Throwable A03;

    public void A02(C2l4 c2l4) {
        ELK elk;
        Object[] objArr = c2l4.A01;
        int i = c2l4.A00;
        if (i != 0) {
            if (i == 1) {
                Throwable th = (Throwable) objArr[0];
                elk = ELK.A02;
                this.A03 = th;
            } else if (i != 2) {
                return;
            } else {
                elk = (ELK) objArr[0];
            }
            this.A01 = elk;
            return;
        }
        ELK elk2 = (ELK) objArr[0];
        Throwable th2 = (Throwable) objArr[1];
        ELJ elj = (ELJ) objArr[2];
        Object obj = objArr[3];
        this.A01 = elk2;
        this.A03 = th2;
        this.A00 = elj;
        this.A02 = obj;
    }
}
