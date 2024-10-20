package X;

/* loaded from: Dpl.class */
public final class Dpl extends FAG {
    public static final 16Y A04;
    public static final 16Y A05;
    public F7f A00;
    public boolean A01;
    public final Evr A02;
    public final 2BQ A03;

    static {
        16J r0 = new 16J();
        r0.A05(new String[]{"sms"});
        A04 = new C0gt(r0.A00(), "android.intent.action.VIEW");
        16J r02 = new 16J();
        r02.A05(new String[]{"tel"});
        A05 = new C0gt(r02.A00(), "android.intent.action.DIAL");
    }

    public Dpl() {
        F7f f7f = (F7f) 1Bn.A0A(98829);
        Evr A0X = DKG.A0X();
        2BQ r0 = (2BQ) 1Bi.A03(16964);
        this.A00 = f7f;
        this.A02 = A0X;
        this.A01 = false;
        this.A03 = r0;
    }
}
