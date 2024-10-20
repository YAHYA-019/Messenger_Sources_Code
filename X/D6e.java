package X;

/* loaded from: D6e.class */
public final class D6e implements Runnable {
    public static final String __redex_internal_original_name = "BroadcastFlowSectionsLoader$loadMore$1";
    public final /* synthetic */ Bz2 A00;

    public D6e(Bz2 bz2) {
        this.A00 = bz2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bhu bhu;
        Bz2 bz2 = this.A00;
        if (bz2.A00 == null || !((C1j) 1Br.A0B(bz2.A06)).A00() || (bhu = bz2.A00) == null) {
            return;
        }
        bhu.A00.A00.D1u("BLENDED_SECTION");
    }
}
