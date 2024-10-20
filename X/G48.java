package X;

import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: G48.class */
public final class G48 implements Runnable {
    public static final String __redex_internal_original_name = "GameContextInfoFetcher$3";
    public final /* synthetic */ 1RM A00;
    public final /* synthetic */ Ewp A01;
    public final /* synthetic */ ListenableFuture A02;

    public G48(1RM r302, Ewp ewp, ListenableFuture listenableFuture) {
        this.A01 = ewp;
        this.A02 = listenableFuture;
        this.A00 = r302;
    }

    @Override // java.lang.Runnable
    public void run() {
        DKF.A0h(this.A01.A02).A04(this.A00, this.A02, "game_context_info_query");
    }
}
