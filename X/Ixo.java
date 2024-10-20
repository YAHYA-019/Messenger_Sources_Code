package X;

/* loaded from: Ixo.class */
public final class Ixo implements Runnable {
    public static final String __redex_internal_original_name = "AndroidAudioProxy$setAudioOn$runnable$1";
    public final /* synthetic */ Gw0 A00;
    public final /* synthetic */ boolean A01;

    public Ixo(Gw0 gw0, boolean z) {
        this.A00 = gw0;
        this.A01 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Gw0 gw0 = this.A00;
        boolean z = gw0.A03;
        boolean z2 = this.A01;
        if (z != z2) {
            HgY hgY = gw0.A09;
            if (z2) {
                JOT jot = hgY.A01;
                jot.C1b();
                if (!hgY.A03.A03()) {
                    hgY.A02.ALc("AndroidAudioManager", "Failed to acquire audio focus.", AnonymousClass001.A1Z());
                }
                jot.D6a(HA4.A03);
            } else {
                JOT jot2 = hgY.A01;
                jot2.AF6(true, true);
                hgY.A03.A01();
                jot2.BmH();
            }
            Ixn ixn = new Ixn(gw0, z2);
            if (gw0.A00 != null) {
                ixn.run();
            } else {
                gw0.A0B.add(ixn);
            }
            gw0.A03 = z2;
        }
    }
}
