package X;

/* loaded from: G49.class */
public final class G49 implements Runnable {
    public static final String __redex_internal_original_name = "GameSessionContextManager$2";
    public final /* synthetic */ FAX A00;
    public final /* synthetic */ EzW A01;
    public final /* synthetic */ String A02;

    public G49(FAX fax, EzW ezW, String str) {
        this.A00 = fax;
        this.A01 = ezW;
        this.A02 = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        EzW ezW = this.A01;
        Er6 er6 = ezW.A01;
        if (er6 != null) {
            FAX fax = this.A00;
            fax.A03 = er6;
            fax.A0H = AnonymousClass001.A1O(er6.A10 ? er6.A0t ^ true : 09K.A00(er6.A0N) ? 1 : 0);
        }
        FAX fax2 = this.A00;
        GJv gJv = fax2.A01;
        if (gJv != null) {
            gJv.C04(ezW, this.A02);
        }
        fax2.A0F = ezW.A0C;
    }
}
