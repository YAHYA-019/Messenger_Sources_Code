package X;

import android.app.Activity;
import android.content.IntentFilter;
import com.facebook.fbservice.ops.BlueServiceOperationFactory;
import java.util.Set;

/* renamed from: X.2yi, reason: invalid class name */
/* loaded from: 2yi.class */
public final class C2yi implements Runnable {
    public static final String __redex_internal_original_name = "AuthenticationHelper$onActivityCreate$1";
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ 1iZ A01;

    public C2yi(Activity activity, 1iZ r303) {
        this.A01 = r303;
        this.A00 = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.facebook.orca.login.AuthStateMachineMonitor.LOGOUT_COMPLETE");
        1iZ r0 = this.A01;
        Activity activity = this.A00;
        C2yj c2yj = new C2yj(activity, intentFilter, r0);
        Set set = 1iZ.A0T;
        r0.A04 = c2yj;
        c2yj.A00();
        C00i c00i = r0.A0D.A00;
        1PA A01 = 1P9.A01(1P9.A00(c00i), new 3cK(activity, r0, 0), "ACTION_MQTT_NO_AUTH");
        r0.A02 = A01;
        A01.A00();
        1PA A012 = 1P9.A01(1P9.A00(c00i), new 3cK(activity, r0, 1), BlueServiceOperationFactory.BLUESERVICE_NO_AUTH);
        r0.A00 = A012;
        A012.A00();
        1PA A013 = 1P9.A01(1P9.A00(c00i), new 3cK(activity, r0, 2), "TIGON_RESPONSE_NO_AUTH");
        r0.A03 = A013;
        A013.A00();
        1PA A014 = 1P9.A01(1P9.A00(c00i), new Frp(r0, 0), "com.facebook.auth.activity.DISMiSS_REAUTH_DIALOG");
        r0.A01 = A014;
        A014.A00();
    }
}
