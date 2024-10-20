package com.android.billingclient.api;

import X.0FI;
import X.11T;
import X.AnonymousClass088;
import X.LEC;
import X.LLO;
import X.LLP;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.activity.ComponentActivity;
import androidx.activity.result.IntentSenderRequest;

/* loaded from: ProxyBillingActivityV2.class */
public class ProxyBillingActivityV2 extends ComponentActivity {
    public ResultReceiver A00;
    public ResultReceiver A01;
    public AnonymousClass088 A02;
    public AnonymousClass088 A03;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.07q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.07q, java.lang.Object] */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = 0FI.A00(1286759594);
        super.onCreate(bundle);
        this.A02 = registerForActivityResult(new Object(), new LLO(this));
        this.A03 = registerForActivityResult(new Object(), new LLP(this));
        if (bundle == null) {
            LEC.A09("ProxyBillingActivityV2", "Launching Play Store billing dialog");
            boolean hasExtra = getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            Intent intent = getIntent();
            if (hasExtra) {
                PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
                this.A00 = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
                AnonymousClass088 anonymousClass088 = this.A02;
                11T.A0F(pendingIntent, 1);
                IntentSender intentSender = pendingIntent.getIntentSender();
                11T.A0A(intentSender);
                anonymousClass088.A02(new IntentSenderRequest(null, intentSender, 0, 0));
                i = -863450788;
            } else {
                if (intent.hasExtra("external_payment_dialog_pending_intent")) {
                    PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
                    this.A01 = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
                    AnonymousClass088 anonymousClass0882 = this.A03;
                    11T.A0F(pendingIntent2, 1);
                    IntentSender intentSender2 = pendingIntent2.getIntentSender();
                    11T.A0A(intentSender2);
                    anonymousClass0882.A02(new IntentSenderRequest(null, intentSender2, 0, 0));
                    i = -1290233678;
                }
                i = 1305111881;
            }
        } else if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
            this.A00 = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
            i = 963749339;
        } else {
            if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                this.A01 = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
                i = -2097673036;
            }
            i = 1305111881;
        }
        0FI.A07(i, A00);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.A00;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.A01;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
    }
}
