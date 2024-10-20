package X;

import android.os.Handler;
import java.util.TimerTask;

/* loaded from: AIK.class */
public final class AIK extends TimerTask {
    public static final String __redex_internal_original_name = "EarlyAccessCountdownXmaComponent$render$1$invoke$lambda$1$$inlined$timerTask$1";
    public final /* synthetic */ 1Br A00;
    public final /* synthetic */ C2k5 A01;
    public final /* synthetic */ 4NU A02;
    public final /* synthetic */ C2lh A03;
    public final /* synthetic */ 8gU A04;

    public AIK(1Br r302, C2k5 c2k5, 4NU r304, C2lh c2lh, 8gU r306) {
        this.A04 = r306;
        this.A01 = c2k5;
        this.A03 = c2lh;
        this.A00 = r302;
        this.A02 = r304;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        8gU r0 = this.A04;
        String A01 = 8gU.A01((C0dp) 1Br.A0B(this.A00), this.A01, r0);
        this.A03.A02(A01);
        if (A01 == null) {
            ((Handler) 1Bn.A0A(16430)).post(new S9o(this.A02));
        }
    }
}
