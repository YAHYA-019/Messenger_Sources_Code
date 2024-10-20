package X;

/* loaded from: Gqm.class */
public final class Gqm extends GS2 {
    public 1BY A00;
    public final JJm A01;

    public Gqm(1BO r302) {
        super("FullscreenInstructionPresenter");
        this.A01 = new IRX(this);
        this.A00 = 7zL.A0Q(r302);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, X.HbQ] */
    public static HbQ A00(Gqm gqm) {
        JDB jdb = ((GS2) gqm).A01;
        if (!AbM.A1a(jdb)) {
            return new HbQ();
        }
        IZb iZb = (IZb) AbM.A0r(jdb);
        ?? obj = new Object();
        iZb.getClass();
        ((HbQ) obj).A01 = iZb.A01;
        ((HbQ) obj).A00 = iZb.A00;
        return obj;
    }
}
