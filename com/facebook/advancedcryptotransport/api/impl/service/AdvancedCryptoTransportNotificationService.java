package com.facebook.advancedcryptotransport.api.impl.service;

import X.05X;
import X.0FI;
import X.0Xe;
import X.0fH;
import X.11T;
import X.1BJ;
import X.1BK;
import X.1BL;
import X.1Bq;
import X.1Br;
import X.4YT;
import X.AKV;
import X.AbF;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C01w;
import X.C08o;
import X.C0A2;
import X.C10924uz;
import X.C1gy;
import X.HGJ;
import X.HGK;
import X.IoM;
import android.app.Application;
import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.ResultReceiver;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.acra.asyncbroadcastreceiver.AsyncBroadcastReceiverObserver;
import com.mapbox.mapboxsdk.location.LocationComponentOptions;

/* loaded from: AdvancedCryptoTransportNotificationService.class */
public final class AdvancedCryptoTransportNotificationService extends Service {
    public boolean A00;
    public ResultReceiver A01;
    public final Handler A02 = AnonymousClass001.A07();
    public final Runnable A04 = new IoM(this);
    public final 1Br A03 = 1Bq.A00(66427);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        int A04 = 0FI.A04(-936335602);
        0fH.A0l("AdvancedCryptoTransportNotificationService", "onDestroy()");
        Bundle A05 = 1BK.A05();
        A05.putString("reason", this.A00 ? PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT : "offline_marker");
        ResultReceiver resultReceiver = this.A01;
        if (resultReceiver != null) {
            resultReceiver.send(1, A05);
        }
        this.A02.removeCallbacks(this.A04);
        super.onDestroy();
        0FI.A0A(2043673068, A04);
        C01w.A00(this);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        int i3;
        int A01 = C08o.A01(this, 1669484103);
        int A04 = 0FI.A04(-1365185724);
        if (intent != null && intent.getExtras() != null) {
            String A00 = 4YT.A00(1231);
            if (intent.getStringExtra(A00) != null) {
                String A002 = 4YT.A00(1326);
                if (intent.getStringExtra(A002) != null) {
                    String A003 = 4YT.A00(1325);
                    if (intent.getStringExtra(A003) != null) {
                        String A004 = 4YT.A00(1324);
                        if (intent.getIntExtra(A004, -1) != -1 && intent.getParcelableExtra(AsyncBroadcastReceiverObserver.RECEIVER) != null) {
                            0fH.A0h(intent, "AdvancedCryptoTransportNotificationService", AnonymousClass000.A00(214));
                            String stringExtra = intent.getStringExtra(A00);
                            String A005 = 1BJ.A00(20);
                            11T.A0I(stringExtra, A005);
                            String stringExtra2 = intent.getStringExtra(4YT.A00(926));
                            String stringExtra3 = intent.getStringExtra(A002);
                            11T.A0I(stringExtra3, A005);
                            String stringExtra4 = intent.getStringExtra(A003);
                            11T.A0I(stringExtra4, A005);
                            int intExtra = intent.getIntExtra(A004, -1);
                            this.A01 = (ResultReceiver) intent.getParcelableExtra(AsyncBroadcastReceiverObserver.RECEIVER);
                            Application A006 = 0Xe.A00();
                            1BL.A11(1, stringExtra, stringExtra3, stringExtra4);
                            String packageName = A006.getPackageName();
                            Intent A05 = AbF.A05();
                            A05.setComponent(new ComponentName(packageName, stringExtra));
                            A05.setFlags(67174400);
                            A05.setData(C0A2.A03(4YT.A00(38)));
                            05X r0 = new 05X();
                            r0.A0C(A05);
                            PendingIntent A012 = r0.A01(A006, (int) System.currentTimeMillis(), 134217728);
                            C10924uz c10924uz = new C10924uz(A006, (String) null);
                            c10924uz.A03 = -1;
                            c10924uz.A0L(stringExtra3);
                            c10924uz.A0K(stringExtra4);
                            c10924uz.A0B(intExtra);
                            c10924uz.A0R = "service";
                            c10924uz.A0e = true;
                            c10924uz.A0C(0L);
                            if (stringExtra2 != null) {
                                c10924uz.A0S = stringExtra2;
                            }
                            if (A012 != null) {
                                c10924uz.A0D(A012);
                            }
                            Notification A07 = c10924uz.A07();
                            11T.A0A(A07);
                            boolean z = true;
                            try {
                                int i4 = Build.VERSION.SDK_INT;
                                if (i4 >= 34) {
                                    HGK.A00(A07, this);
                                } else if (i4 >= 29) {
                                    HGJ.A00(A07, this);
                                } else {
                                    C08o.A04(A07, this, 20030);
                                }
                            } catch (IllegalStateException e) {
                                0fH.A0s("AdvancedCryptoTransportNotificationService", (Build.VERSION.SDK_INT < 31 || !(e instanceof ForegroundServiceStartNotAllowedException)) ? "Failed to startForeground on onStartCommand(). Other Exception. No fallback." : "Failed to startForeground on onStartCommand(). No fallback.", e);
                                z = false;
                            }
                            C1gy c1gy = (C1gy) this.A03.get();
                            C1gy.A04(c1gy, new AKV(1, c1gy, z), 1);
                            Handler handler = this.A02;
                            Runnable runnable = this.A04;
                            handler.removeCallbacks(runnable);
                            handler.postDelayed(runnable, LocationComponentOptions.STALE_STATE_DELAY_MS);
                            0fH.A0n("AdvancedCryptoTransportNotificationService", "Notification service started.");
                            0FI.A0A(1332569585, A04);
                            i3 = -1872343244;
                            C08o.A03(i3, A01);
                            return 2;
                        }
                    }
                }
            }
        }
        0fH.A0k("AdvancedCryptoTransportNotificationService", "Null or invalid intent received");
        0FI.A0A(-53151223, A04);
        i3 = 611424794;
        C08o.A03(i3, A01);
        return 2;
    }
}
