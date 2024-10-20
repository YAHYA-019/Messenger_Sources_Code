package X;

/* loaded from: Ll7.class */
public final class Ll7 implements Runnable {
    public static final String __redex_internal_original_name = "FxMsgrFetaUserInfoHelper$clearFetaUserInfoFromDisk$1";
    public final /* synthetic */ MAT A00;

    public Ll7(MAT mat) {
        this.A00 = mat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MAT mat = this.A00;
        1Br.A0C(mat.A05);
        1Ql edit = 1BL.A0W().edit();
        edit.CfI(L7L.A00());
        edit.CfI(L7L.A01());
        edit.commit();
        GOp.A1G(mat.A02).submit(new Ll8(mat));
    }
}
