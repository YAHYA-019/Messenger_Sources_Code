package X;

/* loaded from: Faa.class */
public final class Faa implements GOk {
    public static final String __redex_internal_original_name = "AuthOperations$AlohaSsoAuthOperation";
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final /* synthetic */ Fck A06;

    public Faa(Fck fck, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A06 = fck;
        this.A00 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A03 = str4;
        this.A01 = str5;
        this.A02 = str6;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        C15h c15h;
        Fhp fhp;
        Fck fck = this.A06;
        String A00 = FFU.A00(fck);
        String str = this.A00;
        c15h = fck.A0y;
        EqG eqG = new EqG(str, A00, this.A04, this.A05, this.A03, this.A01, 1BL.A1a(c15h), this.A02);
        1Rl A0Y = DKE.A0Y(fck);
        fhp = fck.A09;
        return DKF.A0m(fhp, A0Y, this, eqG);
    }
}
