package X;

/* loaded from: Itm.class */
public final class Itm implements Runnable {
    public static final String __redex_internal_original_name = "FbHeroPlayerLogger$logReleaseAfterPlay$1";
    public final /* synthetic */ GPn A00;

    public Itm(GPn gPn) {
        this.A00 = gPn;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GPn gPn = this.A00;
        5Kt r0 = gPn.A0c;
        String str = gPn.A0b.A0k;
        HCJ hcj = HCJ.A0U;
        HCA hca = HCA.A15;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Video was released while playing. playerOrigin=");
        r0.A0q(hca, hcj, str, AnonymousClass001.A0a(gPn.A0G, A0k));
        gPn.A0e.A03(hca, hcj, str, AnonymousClass001.A0a(gPn.A0G, AnonymousClass001.A0n("Video was released while playing. playerOrigin=")));
    }
}
