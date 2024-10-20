package X;

/* loaded from: Il9.class */
public final class Il9 implements MIo, JQn {
    public final int A00;
    public final Object A01;

    public Il9(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.MIo
    public void BxV() {
    }

    @Override // X.MIo
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        if (this.A00 != 0) {
            11T.A0F(obj, 0);
            7zL.A1T(this.A01, obj);
            return;
        }
        JNg jNg = (JNg) obj;
        11T.A0F(jNg, 0);
        Hn2 hn2 = (Hn2) this.A01;
        JNg jNg2 = hn2.A00;
        if (jNg2 != null) {
            jNg = jNg2;
        }
        hn2.A00 = jNg;
    }
}
