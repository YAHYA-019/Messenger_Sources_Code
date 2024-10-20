package X;

/* loaded from: Izy.class */
public final class Izy implements Runnable {
    public static final String __redex_internal_original_name = "FrescoControllerImpl$2";
    public final /* synthetic */ 4hO A00;
    public final /* synthetic */ C5bj A01;
    public final /* synthetic */ 4iC A02;

    public Izy(4hO r302, C5bj c5bj, 4iC r304) {
        this.A02 = r304;
        this.A01 = c5bj;
        this.A00 = r302;
    }

    @Override // java.lang.Runnable
    public void run() {
        C5bj c5bj = this.A01;
        if (c5bj.BQl()) {
            if (GOo.A1S()) {
                2D9.A02("FrescoControllerImpl#onAttach->fetchRunnable");
            }
            try {
                4iC r0 = this.A02;
                1OW A01 = 4iC.A01(c5bj, r0);
                A01.D3K(c5bj, r0.A01.A09);
                4hO r02 = this.A00;
                if (4hO.A00(r02) && r02.A01.AZk(36310718676075526L)) {
                    C5bi c5bi = (C5bi) c5bj;
                    1OW r03 = c5bi.A06;
                    if (r03 != null) {
                        r03.AGD();
                    }
                    c5bi.A06 = A01;
                }
            } finally {
                4YV.A14();
            }
        }
    }
}
