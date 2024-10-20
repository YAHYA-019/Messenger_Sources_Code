package com.android.billingclient.api;

import X.0FI;
import X.4YU;
import X.AbF;
import X.K75;
import X.KMP;
import X.L9F;
import X.LEC;
import X.MLk;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;

/* loaded from: ProxyBillingActivity.class */
public class ProxyBillingActivity extends Activity {
    public ResultReceiver A00;
    public ResultReceiver A01;
    public boolean A02;
    public boolean A03;

    private Intent A00() {
        Intent A0A = 4YU.A0A("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        A0A.setPackage(getApplicationContext().getPackageName());
        String action = A0A.getAction();
        L9F l9f = L9F.$redex_init_class;
        A0A.putExtra("BROADCAST_RECEIVER_LOGGING_PAYLOAD", L9F.A02(K75.A01(MLk.A00.getOrDefault(action, KMP.A01))).A0M());
        return A0A;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003a, code lost:
    
        if (r310 != null) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b3  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onActivityResult(int r302, int r303, android.content.Intent r304) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ProxyBillingActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        int i;
        PendingIntent pendingIntent;
        int i2;
        int A00 = 0FI.A00(-1052723710);
        super.onCreate(bundle);
        if (bundle == null) {
            LEC.A09("ProxyBillingActivity", "Launching Play Store billing flow");
            boolean hasExtra = getIntent().hasExtra("BUY_INTENT");
            Intent intent = getIntent();
            if (hasExtra) {
                pendingIntent = (PendingIntent) intent.getParcelableExtra("BUY_INTENT");
                if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                    this.A02 = true;
                    i2 = 110;
                }
                i2 = 100;
            } else {
                boolean hasExtra2 = intent.hasExtra("SUBS_MANAGEMENT_INTENT");
                Intent intent2 = getIntent();
                if (hasExtra2) {
                    pendingIntent = (PendingIntent) intent2.getParcelableExtra("SUBS_MANAGEMENT_INTENT");
                    this.A01 = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
                } else if (intent2.hasExtra("IN_APP_MESSAGE_INTENT")) {
                    pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
                    this.A00 = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
                    i2 = 101;
                } else {
                    pendingIntent = null;
                }
                i2 = 100;
            }
            try {
                this.A03 = true;
                startIntentSenderForResult(pendingIntent.getIntentSender(), i2, AbF.A05(), 0, 0, 0);
                i = 1476260409;
            } catch (IntentSender.SendIntentException e) {
                LEC.A0B("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e);
                ResultReceiver resultReceiver = this.A01;
                if (resultReceiver != null) {
                    resultReceiver.send(6, null);
                } else {
                    ResultReceiver resultReceiver2 = this.A00;
                    if (resultReceiver2 != null) {
                        resultReceiver2.send(0, null);
                    } else {
                        Intent A002 = A00();
                        if (this.A02) {
                            A002.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                        }
                        A002.putExtra("RESPONSE_CODE", 6);
                        A002.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                        sendBroadcast(A002);
                    }
                }
                this.A03 = false;
                finish();
                i = 2129764559;
            }
        } else {
            LEC.A09("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.A03 = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("result_receiver")) {
                this.A01 = (ResultReceiver) bundle.getParcelable("result_receiver");
            } else if (bundle.containsKey("in_app_message_result_receiver")) {
                this.A00 = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.A02 = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            i = 164295875;
        }
        0FI.A07(i, A00);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        int i;
        int A00 = 0FI.A00(-354970116);
        super.onDestroy();
        if (isFinishing() && this.A03) {
            Intent A002 = A00();
            A002.putExtra("RESPONSE_CODE", 1);
            A002.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            sendBroadcast(A002);
            i = -1791009161;
        } else {
            i = 447854104;
        }
        0FI.A07(i, A00);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.A01;
        if (resultReceiver != null) {
            bundle.putParcelable("result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.A00;
        if (resultReceiver2 != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver2);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.A03);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.A02);
    }
}
