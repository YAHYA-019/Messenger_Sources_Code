package com.facebook.rti.orca;

import X.05L;
import X.09O;
import X.0Fv;
import X.0Fw;
import X.0IM;
import X.0Ir;
import X.0MH;
import X.0MY;
import X.0MZ;
import X.0Mf;
import X.0Oq;
import X.0Ot;
import X.0Ow;
import X.0fH;
import X.19Q;
import X.1Bi;
import X.1Bn;
import X.1EZ;
import X.1Fv;
import X.1H2;
import X.AnonymousClass023;
import X.C00i;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.util.TriState;
import com.facebook.inject.FbInjector;
import com.facebook.push.fbns.ipc.FbnsAIDLRequest;
import com.facebook.push.fbns.ipc.FbnsAIDLResult;
import com.facebook.rti.push.service.FbnsServiceDelegate;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: FbnsLiteInitializer.class */
public final class FbnsLiteInitializer {
    public int A00;
    public FbnsLiteBroadcastReceiver A01;
    public volatile boolean A09;
    public final 0Fv A06 = (0Fv) 1Bi.A03(28);
    public final Context A02 = FbInjector.A00();
    public final C00i A08 = 1Bi.A00(33032);
    public final C00i A03 = 1Bi.A00(16449);
    public final 0Ir A05 = (0Ir) 1Bi.A03(30);
    public final 0IM A04 = (0IM) 1Bi.A03(29);
    public final Runnable A07 = new 0MH(this);

    public static final String A00(FbUserSession fbUserSession) {
        if (fbUserSession.BTy()) {
            return null;
        }
        return fbUserSession.Aud();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v37, types: [android.content.BroadcastReceiver, com.facebook.rti.orca.FbnsLiteBroadcastReceiver] */
    public void A01(FbUserSession fbUserSession) {
        Context context;
        String A00;
        0fH.A0A(FbnsLiteInitializer.class, "updateQe");
        this.A09 = true;
        0Fv r0 = this.A06;
        if (!r0.A02() || A00(fbUserSession) == null) {
            return;
        }
        if (r0.A03() && (A00 = 0Fw.A00((context = this.A02))) != null) {
            0MZ.A03(context, (0MY) null, FbnsServiceDelegate.A04(A00), "FbnsSuspendSwitch", A00, "com.facebook.rti.intent.ACTION_FBNS_KILL_SWITCH_DISABLE_SERVICE", true);
        }
        if (!this.A05.A01(fbUserSession)) {
            A03(this);
            this.A09 = true;
            return;
        }
        if (r0.A04(fbUserSession)) {
            A03(this);
        } else {
            Context context2 = this.A02;
            19Q.A00(context2, true);
            if (this.A01 == null && context2.getApplicationInfo().targetSdkVersion >= 24) {
                this.A01 = new BroadcastReceiver();
                IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
                if (context2.getApplicationInfo().targetSdkVersion >= 26) {
                    intentFilter.addAction("android.intent.action.USER_PRESENT");
                }
                AnonymousClass023.A00(this.A01, context2, intentFilter);
            }
        }
        this.A09 = false;
    }

    public static void A03(FbnsLiteInitializer fbnsLiteInitializer) {
        Context context = fbnsLiteInitializer.A02;
        19Q.A00(context, false);
        FbnsLiteBroadcastReceiver fbnsLiteBroadcastReceiver = fbnsLiteInitializer.A01;
        if (fbnsLiteBroadcastReceiver != null) {
            05L.A02.A07(fbnsLiteBroadcastReceiver, context);
            fbnsLiteInitializer.A01 = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v82, types: [com.facebook.push.fbns.ipc.FbnsAIDLRequest, com.facebook.push.fbns.ipc.FbnsAIDLResult] */
    public static void A04(FbnsLiteInitializer fbnsLiteInitializer, boolean z) {
        Context context = fbnsLiteInitializer.A02;
        FbUserSession A02 = 1Fv.A02((1EZ) 1Bn.A0D(context, 16428));
        boolean A04 = fbnsLiteInitializer.A06.A04(A02);
        int i = 1;
        int i2 = 1;
        if (A04) {
            i = 101;
            i2 = 100;
        }
        Object A0A = 1Bn.A0A(83429);
        String A00 = A00(A02);
        Boolean valueOf = Boolean.valueOf(A04);
        boolean z2 = false;
        Boolean valueOf2 = Boolean.valueOf(z);
        C00i c00i = fbnsLiteInitializer.A08;
        0fH.A0R(FbnsLiteInitializer.class, "configureAnalytics usePreloadFbns: %b sameProcess: %b %s %s %s %d %d %d", new Object[]{valueOf, valueOf2, A00, ((1H2) c00i.get()).A02(), A0A.toString(), Integer.valueOf(fbnsLiteInitializer.A00), Integer.valueOf(i), Integer.valueOf(i2)});
        if (A0A == TriState.YES) {
            z2 = true;
        }
        String A022 = ((1H2) c00i.get()).A02();
        int i3 = fbnsLiteInitializer.A00;
        if (z2 || !(!09O.A00(context).A02)) {
            i = 10000;
        }
        Integer valueOf3 = Integer.valueOf(i);
        0fH.A0h(valueOf3, "FbnsClient", "configureAnalytics newHealthSampleRate: %d");
        Bundle bundle = new Bundle();
        if (z2) {
            0Mf.A01.A00(bundle, A00);
        } else {
            0Mf.A01.A00(bundle, "");
        }
        0Mf.A03.A00(bundle, A022);
        0Mf.A02.A00(bundle, Boolean.valueOf(z2));
        0Mf.A04.A00(bundle, Integer.valueOf(i3));
        0Mf.A08.A00(bundle, valueOf3);
        if (z) {
            0MZ.A01(context, bundle);
            return;
        }
        0Oq r0 = new 0Oq(context);
        int i4 = 0Ot.A08.mOperationType;
        ?? fbnsAIDLResult = new FbnsAIDLResult(bundle);
        fbnsAIDLResult.A00 = i4;
        r0.A05.submit((Callable) new 0Ow(new FbnsAIDLRequest[]{fbnsAIDLResult}[0], r0));
    }

    public void A05() {
        ((Executor) this.A03.get()).execute(this.A07);
    }
}
