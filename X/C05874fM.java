package X;

import android.content.Context;
import android.os.Handler;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.4fM, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4fM.class */
public final class C05874fM {
    public long A00;
    public final 4fN A01;
    public final 1Br A02;
    public final FbUserSession A03;
    public final RunnableC06104fx A04;
    public final 1BP A05;
    public final 1De A06;
    public final AtomicBoolean A07;

    /* JADX WARN: Type inference failed for: r0v28, types: [X.4fx] */
    public C05874fM(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A06 = r303;
        this.A03 = fbUserSession;
        this.A05 = FbInjector.A00;
        1BY r0 = r303.A00;
        this.A01 = (4fN) 1Lo.A04((Context) null, fbUserSession, r0, 65800);
        Context context = FbInjector.A03;
        11T.A0F(context, 0);
        new AVJ(1Lm.A00(context, fbUserSession, 33187), 34).invoke(new AnonymousClass836(this, 0));
        this.A00 = TimeUnit.MINUTES.toMillis(10);
        this.A02 = 1Bu.A03(r0, 16430);
        this.A04 = new Runnable() { // from class: X.4fx
            public static final String __redex_internal_original_name = "SupervisionScreenTimePeriodicScheduler$uploadTask$1";

            @Override // java.lang.Runnable
            public void run() {
                C05874fM c05874fM = C05874fM.this;
                4fN.A00(c05874fM.A01, true);
                ((Handler) c05874fM.A02.A00.get()).postDelayed(this, c05874fM.A00);
            }
        };
        this.A07 = new AtomicBoolean(false);
    }

    public final void A00() {
        boolean compareAndSet = this.A07.compareAndSet(true, false);
        String A00 = 1BJ.A00(72);
        if (!compareAndSet) {
            0fH.A0j(A00, "Tried to cancel periodic upload task but task was not scheduled");
            return;
        }
        RunnableC06104fx runnableC06104fx = this.A04;
        0fH.A0j(A00, 0Pz.A0d("Task ", " cancelled", System.identityHashCode(runnableC06104fx)));
        ((Handler) this.A02.A00.get()).removeCallbacks(runnableC06104fx);
    }

    public final void A01() {
        if (this.A07.compareAndSet(false, true)) {
            RunnableC06104fx runnableC06104fx = this.A04;
            0fH.A0j(1BJ.A00(72), 0Pz.A0d("Task ", " scheduled", System.identityHashCode(runnableC06104fx)));
            ((Handler) this.A02.A00.get()).postDelayed(runnableC06104fx, this.A00);
        }
    }
}
