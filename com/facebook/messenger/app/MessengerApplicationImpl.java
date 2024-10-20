package com.facebook.messenger.app;

import X.0Xo;
import X.0ZP;
import X.0fH;
import X.0tF;
import X.0uQ;
import X.11T;
import X.1BQ;
import X.1BV;
import X.1Bi;
import X.1Bn;
import X.1Bp;
import X.1Bt;
import X.1Fv;
import X.1QB;
import X.1Qc;
import X.1Qd;
import X.1YC;
import X.2Cz;
import X.7kF;
import X.C00f;
import X.C00g;
import X.C00i;
import X.C00k;
import X.C03833z7;
import X.C03843z8;
import X.C0kr;
import X.C0qy;
import X.C15j;
import X.C1Y6;
import android.content.Context;
import android.content.res.Resources;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContextable;

/* loaded from: MessengerApplicationImpl.class */
public class MessengerApplicationImpl extends C00f implements C00g, C15j, CallerContextable {
    public final 0Xo A00;
    public final C00i A06;
    public final MessengerApplication A07;
    public final C00i A03 = new 1BQ(16616);
    public final C00i A04 = new 1BQ(83426);
    public final C00i A01 = new 1BQ(67765);
    public final C00i A09 = new 1BQ(65837);
    public final C00i A08 = new 1BQ(65839);
    public final C00i A0A = new 1BQ(67196);
    public final C00i A05 = new 1BQ(16943);
    public final C00i A02 = new 1BQ(66355);

    /* JADX WARN: Multi-variable type inference failed */
    public MessengerApplicationImpl(MessengerApplication messengerApplication) {
        this.A07 = messengerApplication;
        this.A00 = messengerApplication.A04;
        this.A06 = new 1BV(messengerApplication, 65984);
        C0qy c0qy = C0kr.A00;
        11T.A0D(c0qy);
        C0qy.A07 = c0qy;
    }

    @Override // X.C00f
    public void A00() {
        0uQ A00 = 0ZP.A00().A00("MessengerApplicationImpl.onCreate");
        try {
            0Xo th = 0ZP.A00();
            0uQ A002 = th.A00("app_runOnApplicationInit");
            try {
                try {
                    0tF r0 = 0tF.A0O;
                    r0.getClass();
                    1BV r02 = new 1BV(16669);
                    1BQ r03 = new 1BQ(16485);
                    r0.A01 = r02;
                    r0.A00 = r03;
                    C00i c00i = this.A02;
                    r0.A02((C00k) c00i.get());
                    A002.close();
                    th = 0ZP.A00();
                    0uQ A003 = th.A00("app_waitForAppInitLock");
                    try {
                        ((1Bt) 1Bi.A03(66185)).A02();
                        A003.close();
                        A00.close();
                        1Bp r04 = (1Bp) c00i.get();
                        if (r04.A05.getAndSet(true)) {
                            return;
                        }
                        r04.A00 = 824316542;
                        1Bp.A00(r04);
                    } catch (Throwable th2) {
                        th = th2;
                        A003.close();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    A002.close();
                }
            } catch (Throwable th4) {
                7kF.A00(th, th4);
            }
        } catch (Throwable th5) {
            try {
                A00.close();
                throw th5;
            } catch (Throwable th6) {
                7kF.A00(th5, th6);
                throw th5;
            }
        }
    }

    @Override // X.C00f
    public void A01() {
        2Cz r0 = (2Cz) this.A05.get();
        0fH.A0A(2Cz.class, "onSystemLowMemory");
        2Cz.A00(r0, 15);
    }

    @Override // X.C00f
    public void A02(final int i) {
        final FbUserSession A04 = ((1Fv) 1Bi.A03(66351)).A04();
        Runnable runnable = new Runnable() { // from class: X.3z6
            public static final String __redex_internal_original_name = "MessengerApplicationImpl$$ExternalSyntheticLambda0";

            /* JADX WARN: Code restructure failed: missing block: B:53:0x041d, code lost:
            
                if (r0 != 10) goto L83;
             */
            /* JADX WARN: Code restructure failed: missing block: B:57:0x042d, code lost:
            
                if (r0 < 80) goto L88;
             */
            /* JADX WARN: Removed duplicated region for block: B:56:0x0426  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x05cb  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 1529
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.RunnableC03823z6.run():void");
            }
        };
        if (((1Qd) this.A08.get()).A06()) {
            1QB r0 = (1QB) 1Bn.A0A(65841);
            1Qc r02 = (1Qc) this.A09.get();
            r0.A01 = runnable;
            r0.A04("TrimMemory");
            r0.A03("ForUiThread");
            r0.A04 = String.valueOf(i);
            r02.A03(r0.A01(), "KeepExisting");
        } else {
            runnable.run();
        }
        C03843z8 c03843z8 = ((C03833z7) C1Y6.A00(this.A07, "com_facebook_messaging_app_plugins_interfaces_lowmemory_OnTrimMemorySpec", "All", new Object[0])).A00;
        int andIncrement = C1Y6.A04.getAndIncrement();
        1YC r03 = c03843z8.A00;
        r03.A08("com.facebook.messaging.app.plugins.interfaces.lowmemory.OnTrimMemorySpec", "messaging.app.lowmemory.OnTrimMemorySpec", "onTrimMemory", andIncrement);
        r03.A02((Exception) null, "messaging.app.lowmemory.OnTrimMemorySpec", "onTrimMemory", andIncrement);
    }

    @Override // X.C15j
    public Resources B10() {
        return (Resources) this.A0A.get();
    }

    @Override // X.C00g
    public Context getContext() {
        return this.A07;
    }
}
