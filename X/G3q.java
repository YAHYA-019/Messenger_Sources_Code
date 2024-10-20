package X;

import android.os.Handler;

/* loaded from: G3q.class */
public final class G3q implements Runnable {
    public static final String __redex_internal_original_name = "CowatchAdCountdownComponentSpec$1";
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ 1Iw A01;
    public final /* synthetic */ GF2 A02;

    public G3q(Handler handler, 1Iw r303, GF2 gf2) {
        this.A02 = gf2;
        this.A00 = handler;
        this.A01 = r303;
    }

    @Override // java.lang.Runnable
    public void run() {
        int B6j = this.A02.B6j();
        if (B6j > 0) {
            this.A00.postDelayed(this, 500L);
        }
        1Iw r0 = this.A01;
        if (r0.A02 != null) {
            r0.A0G(7zS.A0N(Integer.valueOf(B6j)), "updateState:CowatchAdCountdownComponent.updateRemainingAdDurationMs");
        }
    }
}
