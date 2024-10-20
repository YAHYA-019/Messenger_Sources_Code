package com.google.android.gms.analytics;

import X.0FI;
import X.AbstractC00481b7;
import X.AnonymousClass001;
import X.K6c;
import X.K6g;
import X.Kz3;
import X.L9t;
import X.LCw;
import X.Llr;
import X.Lq3;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.facebook.acra.asyncbroadcastreceiver.AsyncBroadcastReceiverObserver;

/* loaded from: CampaignTrackingReceiver.class */
public final class CampaignTrackingReceiver extends BroadcastReceiver {
    public static Boolean A00;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int i;
        int A01 = 0FI.A01(-920075324);
        L9t A012 = L9t.A01(context);
        K6g k6g = A012.A0C;
        L9t.A02(k6g);
        if (intent == null) {
            LCw.A0A(k6g, "CampaignTrackingReceiver received null intent", 5);
            i = 1054259635;
        } else {
            String stringExtra = intent.getStringExtra("referrer");
            String action = intent.getAction();
            k6g.A0D("CampaignTrackingReceiver received", action);
            if (!"com.android.vending.INSTALL_REFERRER".equals(action) || TextUtils.isEmpty(stringExtra)) {
                LCw.A0A(k6g, "CampaignTrackingReceiver received unexpected intent without referrer extra", 5);
                i = -299093981;
            } else {
                Number number = (Number) Kz3.A0T.A00;
                int intValue = number.intValue();
                int length = stringExtra.length();
                if (length > intValue) {
                    k6g.A0C(Integer.valueOf(length), number, "Campaign data exceed the maximum supported size and will be clipped. size, limit");
                    stringExtra = AnonymousClass001.A0c(stringExtra, intValue);
                }
                BroadcastReceiver.PendingResult goAsync = goAsync();
                AsyncBroadcastReceiverObserver.goAsync(this, goAsync);
                K6c k6c = A012.A06;
                L9t.A02(k6c);
                Llr llr = new Llr(goAsync);
                AbstractC00481b7.A06(stringExtra, "campaign param can't be empty");
                L9t.A00(k6c).A02.submit(new Lq3(k6c, llr, stringExtra));
                i = 1583887658;
            }
        }
        0FI.A0D(i, A01, intent);
    }
}
