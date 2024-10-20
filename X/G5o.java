package X;

import java.util.concurrent.Callable;

/* loaded from: G5o.class */
public final class G5o implements Runnable {
    public static final String __redex_internal_original_name = "InstantGamePaymentsQueryHelper$fetchCatalog$1";
    public final /* synthetic */ 1RM A00;
    public final /* synthetic */ EvG A01;
    public final /* synthetic */ Fpo A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ Callable A04;

    public G5o(1RM r302, EvG evG, Fpo fpo, String str, Callable callable) {
        this.A03 = str;
        this.A01 = evG;
        this.A04 = callable;
        this.A00 = r302;
        this.A02 = fpo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (AbI.A0o(this.A01.A02).A08(this.A00, 11T.A0O(this.A03, "SUBSCRIBABLE") ? "quicksilver_fetch_subscribable_catalog_query" : "quicksilver_fetch_catalog_query", this.A04)) {
            return;
        }
        this.A02.ARP();
    }
}
