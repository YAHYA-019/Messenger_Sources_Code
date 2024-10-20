package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.runtimepermissions.RequestPermissionsConfig;

/* loaded from: C29.class */
public final class C29 {
    public final /* synthetic */ C1599Amg A00;

    public C29(C1599Amg c1599Amg) {
        this.A00 = c1599Amg;
    }

    public void A00() {
        C1599Amg c1599Amg = this.A00;
        Context context = c1599Amg.A00;
        Fragment fragment = c1599Amg.A01;
        FbUserSession fbUserSession = c1599Amg.A02;
        1BK.A1M(context, fragment);
        11T.A0F(fbUserSession, 2);
        82O r0 = (82O) 1Bn.A0E(context, (1BY) null, 65570);
        C5iw c5iw = new C5iw();
        c5iw.A04 = context.getResources().getString(2131959957);
        c5iw.A00(context.getResources().getString(2131959956));
        c5iw.A00 = 2;
        c5iw.A06 = false;
        RequestPermissionsConfig requestPermissionsConfig = new RequestPermissionsConfig(c5iw);
        r0.A0U(fragment).AHQ(requestPermissionsConfig, new BHq(fbUserSession, fragment, 2), BYD.A00);
    }
}
