package com.facebook.tigon.nativeservice.authed;

import X.0Pz;
import X.0fH;
import X.1BJ;
import X.1BK;
import X.1BQ;
import X.1HH;
import X.1I7;
import X.1Wx;
import X.30N;
import X.4YU;
import X.C00i;
import android.content.Context;
import android.content.Intent;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.dextricks.LogcatReader;
import com.facebook.inject.FbInjector;
import java.util.concurrent.Callable;

/* loaded from: NativeFBAuthedWithUserSessionTigonServiceHolder.class */
public class NativeFBAuthedWithUserSessionTigonServiceHolder extends NativeAuthedTigonServiceHolder {
    public Context A00;
    public final C00i A01;
    public final C00i A02;
    public final C00i A03;

    public NativeFBAuthedWithUserSessionTigonServiceHolder(FbUserSession fbUserSession) {
        super(fbUserSession.BKF().mAuthToken, (Callable) new 30N(3), (Callable) new 30N(4));
        this.A01 = new 1BQ(16695);
        this.A03 = new 1BQ(16511);
        Context A00 = FbInjector.A00();
        this.A00 = A00;
        this.A02 = new 1HH(A00, 65731);
    }

    @Override // com.facebook.tigon.nativeservice.authed.NativeAuthedTigonServiceHolder
    public void broadcastInvalidToken(String str, String str2) {
        String A0W = 0Pz.A0W(1BJ.A00(250), str);
        0fH.A0n("NativeFBAuthedWithUserSessionTigonServiceHolder", A0W);
        1BK.A09(this.A03).D0w(1BJ.A00(818), A0W, LogcatReader.DEFAULT_WAIT_TIME);
        Intent A0A = 4YU.A0A("ACTION_MQTT_NO_AUTH");
        A0A.putExtra("SVR_RESULT", str2);
        ((1I7) this.A02.get()).CkS(A0A);
        ((1Wx) this.A01.get()).A04(str2);
    }
}
