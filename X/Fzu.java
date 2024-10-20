package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.fbshorts.analytics.FbShortsInterruptionStateManager;

/* loaded from: Fzu.class */
public final class Fzu implements Runnable {
    public static final String __redex_internal_original_name = "FbShortsInterruptionStateManager$interruptionTimeout$1";
    public final /* synthetic */ FbShortsInterruptionStateManager A00;

    public Fzu(FbShortsInterruptionStateManager fbShortsInterruptionStateManager) {
        this.A00 = fbShortsInterruptionStateManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FbShortsInterruptionStateManager fbShortsInterruptionStateManager = this.A00;
        if (fbShortsInterruptionStateManager.A04.compareAndSet(true, false)) {
            if (0fH.A01.BTv(3)) {
                0fH.A0g(PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT, 1BJ.A00(743), "FAILED because %s, reset to NORMAL");
            }
            F6r f6r = (F6r) 1Br.A0B(fbShortsInterruptionStateManager.A00);
            C00i c00i = f6r.A05.A00;
            1BK.A0V(c00i).markerAnnotate(594094608, "fail_reason", PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT);
            F6r.A00(f6r);
            1BK.A0V(c00i).markerEnd(594094608, (short) 3);
            ((Ehg) 1Br.A0B(f6r.A03)).A01.incrementAndGet();
            F5P f5p = f6r.A01;
            long currentMonotonicTimestamp = 1BK.A0V(c00i).currentMonotonicTimestamp();
            f5p.A02.markerAnnotate(1012337920, f5p.A01, "fail_message", PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT);
            F5P.A00(f5p, currentMonotonicTimestamp, (short) 3);
            if (f6r.A06) {
                F97 f97 = f6r.A00;
                int i = f97.A01;
                int i2 = f97.A00;
                C0dp c0dp = f97.A02;
                if (c0dp == null) {
                    11T.A0L("clock");
                    throw 0Q8.createAndThrow();
                }
                f97.A02(i, i2, c0dp.now(), PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT);
            }
        }
    }
}
