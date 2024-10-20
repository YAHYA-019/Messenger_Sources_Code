package com.google.android.play.core.common;

import X.0FI;
import X.1BK;
import X.AbF;
import X.DKD;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;

/* loaded from: PlayCoreDialogWrapperActivity.class */
public class PlayCoreDialogWrapperActivity extends Activity {
    public ResultReceiver A00;

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        ResultReceiver resultReceiver;
        int i3;
        super.onActivityResult(i, i2, intent);
        if (i == 0 && (resultReceiver = this.A00) != null) {
            if (i2 == -1) {
                i3 = 1;
            } else if (i2 == 0) {
                i3 = 2;
            }
            resultReceiver.send(i3, 1BK.A05());
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        Intent intent;
        int i;
        int A00 = 0FI.A00(-924004523);
        int intExtra = getIntent().getIntExtra("window_flags", 0);
        if (intExtra != 0) {
            DKD.A0B(this).setSystemUiVisibility(intExtra);
            intent = AbF.A05();
            intent.putExtra("window_flags", intExtra);
        } else {
            intent = null;
        }
        super.onCreate(bundle);
        if (bundle == null) {
            this.A00 = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                ResultReceiver resultReceiver = this.A00;
                if (resultReceiver != null) {
                    resultReceiver.send(3, 1BK.A05());
                }
                finish();
                i = -255307588;
            } else {
                try {
                    startIntentSenderForResult(((PendingIntent) extras.get("confirmation_intent")).getIntentSender(), 0, intent, 0, 0, 0);
                    i = -1123026840;
                } catch (IntentSender.SendIntentException unused) {
                    ResultReceiver resultReceiver2 = this.A00;
                    if (resultReceiver2 != null) {
                        resultReceiver2.send(3, 1BK.A05());
                    }
                    finish();
                    i = -458680952;
                }
            }
        } else {
            this.A00 = (ResultReceiver) bundle.getParcelable("result_receiver");
            i = -1465725522;
        }
        0FI.A07(i, A00);
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("result_receiver", this.A00);
    }
}
