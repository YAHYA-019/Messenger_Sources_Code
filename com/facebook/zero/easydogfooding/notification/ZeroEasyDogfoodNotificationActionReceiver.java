package com.facebook.zero.easydogfooding.notification;

import X.0FI;
import X.0S2;
import X.11T;
import X.1Br;
import X.1G2;
import X.1Ky;
import X.1Ql;
import X.3bQ;
import X.AnonymousClass001;
import X.AnonymousClass304;
import X.C09h;
import X.C0f1;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: ZeroEasyDogfoodNotificationActionReceiver.class */
public final class ZeroEasyDogfoodNotificationActionReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int i;
        Integer num;
        String str;
        int A01 = 0FI.A01(-300568538);
        11T.A0H(context, intent);
        if (C09h.A03().A04(context, intent, this)) {
            String action = intent.getAction();
            if (action != null) {
                try {
                    if (action.equals("OFF")) {
                        num = 0S2.A00;
                    } else if (action.equals("ZERO_BALANCE")) {
                        num = 0S2.A01;
                    } else {
                        if (!action.equals("PAID_BALANCE")) {
                            throw AnonymousClass001.A0L(action);
                        }
                        num = 0S2.A0C;
                    }
                    1Ql A08 = 1Br.A08(AnonymousClass304.A00);
                    1G2 r0 = (1G2) ((1Ky) 1Br.A0B(AnonymousClass304.A03)).A0J.getValue();
                    switch (num.intValue()) {
                        case 1:
                            str = "ZERO_BALANCE";
                            break;
                        case 2:
                            str = "PAID_BALANCE";
                            break;
                        default:
                            str = "OFF";
                            break;
                    }
                    A08.CaL(r0, str);
                    A08.commitImmediately();
                    3bQ.A04.A01();
                } catch (IllegalArgumentException unused) {
                }
                i = -887511545;
            }
            3bQ.A00 = false;
            ((NotificationManager) C0f1.A00().getSystemService(NotificationManager.class)).cancel(1909066919);
            i = -887511545;
        } else {
            i = -765817605;
        }
        0FI.A0D(i, A01, intent);
    }
}
