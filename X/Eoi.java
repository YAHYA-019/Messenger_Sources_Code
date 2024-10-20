package X;

import android.content.Context;
import android.view.GestureDetector;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;

/* loaded from: Eoi.class */
public final class Eoi {
    public double A00;
    public double A01;
    public double A02;
    public GestureDetector A03;
    public final C00i A04 = FbInjector.A00;

    public Eoi(Context context, FbUserSession fbUserSession) {
        F4I f4i = (F4I) 1Lo.A04(context, fbUserSession, (1BY) null, 99738);
        double A08 = ((C4s1) 1Bi.A03(49322)).A08();
        1Br r0 = f4i.A00;
        this.A01 = (A08 * (1.0d - 1Br.A06(r0).Ai7(37156380553969866L))) / 2.0d;
        this.A00 = r0.A08() - this.A01;
        this.A02 = r0.A06() * (1.0d - 1Br.A06(r0).Ai7(37156380553904329L));
        this.A03 = new GestureDetector(FbInjector.A03, (GestureDetector.OnGestureListener) new DOY(this, 0));
    }
}
