package com.facebook.tigon.nativeservice.authed;

import X.0Pz;
import X.0fH;
import X.1BK;
import X.1BO;
import X.1BQ;
import X.1BV;
import X.1BY;
import X.1Bn;
import X.1CO;
import X.1G1;
import X.1HH;
import X.1I7;
import X.1Wx;
import X.30X;
import X.C00i;
import X.C00j;
import X.C01s;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.common.dextricks.LogcatReader;
import com.facebook.inject.FbInjector;
import java.util.concurrent.Callable;

/* loaded from: NativeFBAuthedTigonServiceHolder.class */
public class NativeFBAuthedTigonServiceHolder extends NativeAuthedTigonServiceHolder {
    public Context A00;
    public 1BY A01;
    public final C00i A02;
    public final C00i A03;
    public final C00i A04;
    public final C00i A05;
    public final C00i A06;
    public final C00i A07;

    public NativeFBAuthedTigonServiceHolder(1BO r302, FbUserSession fbUserSession) {
        super((ViewerContext) 1Bn.A0E((Context) null, (1BY) null, 83431), (Callable) new 30X(0), (Callable) new 30X(1));
        this.A04 = new 1BQ(16695);
        this.A05 = new 1BQ(83426);
        this.A02 = new 1BQ(16511);
        this.A07 = new 1BV(this.A01, 16428);
        this.A03 = new 1BQ(16386);
        Context A00 = FbInjector.A00();
        this.A00 = A00;
        this.A06 = new 1HH(A00, 65731);
        this.A01 = new 1BY(r302);
        C00j.A05("NativeFBAuthedTigonServiceHolder.maybeLogSoftErrors", -713442752);
        try {
            C00i c00i = this.A03;
            if (((1CO) c00i.get()).AZk(2324148816959257764L)) {
                int Auy = (int) ((1CO) c00i.get()).Auy(18587282722330126L);
                ViewerContext viewerContext = this.mViewerContext;
                if (viewerContext != null) {
                    if (TextUtils.isEmpty(viewerContext.mAuthToken)) {
                        ((C01s) this.A02.get()).D0w("NativeFBTigonNullTokenException", 0Pz.A0v("Null auth token in Tigon init. VC id: ", this.mViewerContext.mUserId, ". ", A00(fbUserSession)), Auy);
                    }
                    String str = this.mViewerContext.mUserId;
                    if (str != null && !str.equals(((1G1) fbUserSession).A05)) {
                        1BK.A09(this.A02).D0w("NativeFBTigonUserIdMismatchException", 0Pz.A0v("The UserIds of the provided FbUserSession and the injected ViewerContext don't match. VC id: ", this.mViewerContext.mUserId, ". ", A00(fbUserSession)), Auy);
                    }
                    fbUserSession.BKF();
                    fbUserSession.BKF();
                    if (TextUtils.isEmpty(fbUserSession.BKF().mAuthToken)) {
                        ((C01s) this.A02.get()).D0w("NativeFBTigonNullTokenInSessionException", 0Pz.A0v("Null auth token in Session Tigon init. VC id: ", this.mViewerContext.mUserId, ". ", A00(fbUserSession)), Auy);
                    }
                } else {
                    1BK.A09(this.A02).D0w("NativeFBTigonNullViewerContext", 0Pz.A0W("Tigon got a null ViewerContext. ", A00(fbUserSession)), Auy);
                }
            }
            C00j.A01(-277925165);
        } catch (Throwable th) {
            C00j.A01(328854855);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00bf, code lost:
    
        if (r0.equals("No Auth Token") != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0103, code lost:
    
        if (r0.equals("No Auth Token") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0067, code lost:
    
        if (r0.equals("No Auth Token") != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String A00(com.facebook.auth.usersession.FbUserSession r302) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.tigon.nativeservice.authed.NativeFBAuthedTigonServiceHolder.A00(com.facebook.auth.usersession.FbUserSession):java.lang.String");
    }

    @Override // com.facebook.tigon.nativeservice.authed.NativeAuthedTigonServiceHolder
    public void broadcastInvalidToken(String str, String str2) {
        String A0W = 0Pz.A0W("Broadcasting invalid OAuth token authHeader=", str);
        0fH.A0n("NativeFBAuthedTigonServiceHolder", A0W);
        ((C01s) this.A02.get()).D0w("NativeFBAuthedTigonServiceHolder", A0W, LogcatReader.DEFAULT_WAIT_TIME);
        Intent intent = new Intent("ACTION_MQTT_NO_AUTH");
        intent.putExtra("SVR_RESULT", str2);
        ((1I7) this.A06.get()).CkS(intent);
        ((1Wx) this.A04.get()).A04(str2);
    }
}
