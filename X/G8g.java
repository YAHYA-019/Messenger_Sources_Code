package X;

import com.facebook.auth.usersession.FbUserSession;
import java.util.TimerTask;

/* loaded from: G8g.class */
public final class G8g extends TimerTask {
    public static final String __redex_internal_original_name = "QuicksilverMatchPlayerController$intializeMatchFoundViewV2$3";
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ RTN A01;
    public final /* synthetic */ FJ0 A02;

    public G8g(FbUserSession fbUserSession, RTN rtn, FJ0 fj0) {
        this.A02 = fj0;
        this.A00 = fbUserSession;
        this.A01 = rtn;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        FJ0 fj0 = this.A02;
        7zP.A0N(fj0.A0J).Ciz(new G4E(this.A00, this.A01, fj0));
    }
}
