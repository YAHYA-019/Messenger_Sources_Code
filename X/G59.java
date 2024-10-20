package X;

import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: G59.class */
public final class G59 implements Runnable {
    public static final String __redex_internal_original_name = "GameInfoFetcher$loadGame$1";
    public final /* synthetic */ 1RM A00;
    public final /* synthetic */ F8P A01;
    public final /* synthetic */ ListenableFuture A02;
    public final /* synthetic */ boolean A03;

    public G59(1RM r302, F8P f8p, ListenableFuture listenableFuture, boolean z) {
        this.A01 = f8p;
        this.A02 = listenableFuture;
        this.A00 = r302;
        this.A03 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        F8P f8p = this.A01;
        AbI.A0o(f8p.A06).A04(this.A00, this.A02, "quicksilver_game_info_query");
        if (this.A03) {
            f8p.A02.get();
        }
    }
}
