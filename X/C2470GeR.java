package X;

import android.view.OrientationEventListener;
import com.facebook.auth.usersession.FbUserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.GeR, reason: case insensitive filesystem */
/* loaded from: GeR.class */
public final class C2470GeR extends C1q6 {
    public WeakReference A01;
    public final C00i A02;
    public OrientationEventListener A00 = null;
    public final HFY A03 = new Gps(this, 5);

    public C2470GeR(FbUserSession fbUserSession) {
        this.A02 = AbF.A0B(fbUserSession, (1BY) null, 115519);
    }
}
