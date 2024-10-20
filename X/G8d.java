package X;

import com.facebook.auth.usersession.FbUserSession;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: G8d.class */
public final class G8d extends TimerTask {
    public static final String __redex_internal_original_name = "QuicksilverMatchPlayerController$joinQueue$2$1$onSuccess$1";
    public final /* synthetic */ FJ0 A00;

    public G8d(FJ0 fj0) {
        this.A00 = fj0;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        FJ0 fj0 = this.A00;
        FbUserSession A0D = AbK.A0D(fj0.A0I.A00);
        if (fj0.A0D != null) {
            7zP.A0N(fj0.A0J).Ciz(new G2s(A0D, fj0));
            return;
        }
        Timer timer = fj0.A0F;
        if (timer != null) {
            timer.cancel();
        }
    }
}
