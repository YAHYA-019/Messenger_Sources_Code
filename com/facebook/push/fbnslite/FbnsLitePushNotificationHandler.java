package com.facebook.push.fbnslite;

import X.0FI;
import X.0Kz;
import X.0L1;
import X.0Zi;
import X.0fH;
import X.11T;
import X.1BK;
import X.1BQ;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1EZ;
import X.1Fw;
import X.1OX;
import X.1OZ;
import X.1P5;
import X.4AW;
import X.4AX;
import X.4XN;
import X.4YV;
import X.4rH;
import X.5Zk;
import X.AnonymousClass002;
import X.C00i;
import X.C01443r5;
import X.C01s;
import X.C08o;
import X.C0k4;
import X.C1cx;
import X.C3r6;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.pushlite.model.PushInfraMetaData;
import com.facebook.rti.orca.FbnsLiteInitializer;
import java.util.Map;

/* loaded from: FbnsLitePushNotificationHandler.class */
public class FbnsLitePushNotificationHandler extends 0Kz {
    public final C01443r5 A00;
    public final C00i A01;
    public final 4AW A02;
    public final C3r6 A03;
    public final 4AX A04;
    public final 1OX A05;
    public final FbnsLiteInitializer A06;

    /* loaded from: FbnsLitePushNotificationHandler$FbnsLiteCallbackReceiver.class */
    public class FbnsLiteCallbackReceiver extends 0L1 {
        public static Boolean A02;
        public static Handler A03;
        public final C00i A00 = new 1BQ(49853);
        public final C00i A01 = new 1BQ(65901);

        public void onReceive(Context context, final Intent intent) {
            boolean z;
            int i;
            int A01 = 0FI.A01(1421831387);
            final FbUserSession A04 = 1Fw.A04((1EZ) 1Bn.A0E(context, (1BY) null, 16428));
            Boolean bool = A02;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                11T.A0F(context, 0);
                z = 0Zi.A01(context).A5h;
                A02 = Boolean.valueOf(z);
            }
            if (z) {
                Handler handler = A03;
                if (handler == null) {
                    Looper A09 = AnonymousClass002.A09("FbnsHandlerThread");
                    C0k4.A00(A09);
                    handler = new Handler(A09);
                    A03 = handler;
                }
                handler.post(new 4XN(context, intent, A04, this));
                i = -1544701079;
            } else {
                C1cx.A00(context);
                ((5Zk) this.A01.get()).A00(new Runnable() { // from class: X.5r7
                    public static final String __redex_internal_original_name = "FbnsLitePushNotificationHandler$FbnsLiteCallbackReceiver$$ExternalSyntheticLambda0";

                    /* JADX WARN: Code restructure failed: missing block: B:101:0x0207, code lost:
                    
                        if (X.0Fw.A02(r0) == false) goto L28;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:63:0x05b9, code lost:
                    
                        if (r0 == null) goto L91;
                     */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void run() {
                        /*
                            Method dump skipped, instructions count: 1684
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C5r7.run():void");
                    }
                });
                i = -1387305880;
            }
            0FI.A0D(i, A01, intent);
        }
    }

    public FbnsLitePushNotificationHandler(String str) {
        super(str);
        this.A00 = (C01443r5) 1Bi.A03(32798);
        this.A05 = (1OX) 1Bi.A03(16614);
        this.A04 = (4AX) 1Bi.A03(32933);
        this.A02 = (4AW) 1Bi.A03(32932);
        this.A06 = (FbnsLiteInitializer) 1Bi.A03(38);
        this.A03 = (C3r6) 1Bi.A03(65904);
        this.A01 = 1BQ.A01();
    }

    public C01s A00() {
        return 1BK.A09(this.A01);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A01(Intent intent) {
        String stringExtra = intent.getStringExtra("data");
        C0k4.A00(stringExtra);
        String stringExtra2 = intent.getStringExtra("extra_notification_sender");
        String stringExtra3 = intent.getStringExtra("extra_notification_id");
        PushInfraMetaData A01 = PushInfraMetaData.Companion.A01(intent);
        String stringExtra4 = intent.getStringExtra("job_id");
        FbUserSession A0C = 4YV.A0C(FbInjector.A00());
        C3r6 c3r6 = this.A03;
        4rH r0 = 4rH.A06;
        4YV.A1N(A0C, A01);
        c3r6.A01(this, A0C, r0, A01, null, stringExtra, stringExtra2, stringExtra3, stringExtra4);
    }

    public void A02(String str, String str2) {
        1P5 r0 = this.A02.A03;
        r0.A09(str, "");
        r0.A07();
    }

    public void A03(String str, String str2, Map map) {
        this.A00.A06("FBNS_LITE", str, str2, "", "", map);
    }

    public void A04(String str, boolean z, String str2) {
        0fH.A0g(str, "FbnsLitePushNotificationHandler", "FBNS Lite client registration succeed. Token=%s");
        int i = 2;
        if (z) {
            i = 3;
        }
        1OX r0 = this.A05;
        1OZ r02 = 1OZ.A03;
        r0.A00(r02).A0A(str, i);
        4AW r03 = this.A02;
        String valueOf = String.valueOf(i);
        1P5 r04 = r03.A03;
        r04.A09("SUCCESS", valueOf);
        0fH.A0j("FbnsLitePushNotificationHandler", "Start FB push server registration.");
        this.A04.A07(4YV.A0C(FbInjector.A00()), r03.A00, r02);
        0fH.A0j("FbnsLitePushNotificationHandler", "FB push server registration succeed");
        r04.A04();
        r04.A05();
        this.A06.A05();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate() {
        int A00 = C08o.A00(this, 2118260976);
        int A04 = 0FI.A04(1454525233);
        super/*android.app.IntentService*/.onCreate();
        0FI.A0A(1782579607, A04);
        C08o.A02(709846768, A00);
    }
}
