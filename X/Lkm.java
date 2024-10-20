package X;

/* loaded from: Lkm.class */
public final class Lkm implements Runnable {
    public static final String __redex_internal_original_name = "FxFbFetaUserInfoHelper$clearFetaUserInfoFromDisk$1";
    public final /* synthetic */ MAS A00;

    public Lkm(MAS mas) {
        this.A00 = mas;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MAS mas = this.A00;
        1Br.A0C(mas.A04);
        1Ql edit = 1BL.A0W().edit();
        edit.CfI(L7L.A00());
        edit.CfI(L7L.A01());
        edit.commit();
        GOp.A1G(mas.A01).submit(new Lkn(mas));
    }
}
