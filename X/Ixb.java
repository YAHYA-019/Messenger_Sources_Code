package X;

/* loaded from: Ixb.class */
public final /* synthetic */ class Ixb implements Runnable {
    public static final String __redex_internal_original_name = "Camera1Device$$ExternalSyntheticLambda2";
    public final /* synthetic */ JLJ A00;
    public final /* synthetic */ I49 A01;

    public /* synthetic */ Ixb(JLJ jlj, I49 i49) {
        this.A01 = i49;
        this.A00 = jlj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I49 i49 = this.A01;
        JLJ jlj = this.A00;
        byte[] bArr = (byte[]) i49.A01(I49.A0X);
        if (bArr == null || bArr.length == 0) {
            jlj.BwP(AnonymousClass001.A0T("Photo taking returned no jpeg data!"));
            return;
        }
        jlj.CBZ(i49);
        I8m A00 = I8m.A00();
        I8m.A01(A00, 0, A00.A05);
    }
}
