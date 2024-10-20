package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mci.Execution;
import java.util.concurrent.TimeUnit;

/* loaded from: Hst.class */
public final class Hst {
    public 1BY A00;
    public final FbUserSession A01 = 1BL.A0F();
    public final C00i A07 = 1BQ.A02(66630);
    public final C00i A06 = 1BQ.A02(67480);
    public final C00i A03 = 1BQ.A02(67482);
    public final C00i A0A = 1BQ.A02(16446);
    public final C00i A04 = 1BQ.A02(115429);
    public final C00i A05 = 1BQ.A02(131179);
    public final C00i A02 = 1BQ.A02(67196);
    public final C1iw A0B = new JuR(this);
    public final C1iw A09 = new GtI(this);
    public final C1iw A08 = new GtJ(this);

    public Hst(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public void A00() {
        if (((HR5) 1Lo.A04((Context) null, this.A01, this.A00, 115431)).A00.getAndSet(true)) {
            return;
        }
        0fH.A0l("OdmlTaskPpmlInitializer", "Initializing PPML");
        C1iw c1iw = this.A0B;
        Execution.initialize();
        Execution.executePossiblySync(c1iw, null, 1);
    }

    public void A01(Integer num) {
        0fH.A0l("OdmlTaskPpmlInitializer", "Scheduling to load PyTorch native libraries.");
        C00i c00i = this.A0A;
        1Kd.A0D(c00i, Inf.A00(num, this, 4), ((1EC) c00i.get()).Cji(new J5U(this, 6), TimeUnit.MILLISECONDS, 0L));
    }
}
