package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;

/* renamed from: X.089, reason: invalid class name */
/* loaded from: 089.class */
public final class AnonymousClass089 extends C07q {
    @Override // X.C07q
    public /* bridge */ /* synthetic */ Intent A00(Context context, Object obj) {
        Bundle bundleExtra;
        IntentSenderRequest intentSenderRequest = (IntentSenderRequest) obj;
        Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
        Intent intent2 = intentSenderRequest.A02;
        if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
            intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                intentSenderRequest = new IntentSenderRequest(null, intentSenderRequest.A03, intentSenderRequest.A00, intentSenderRequest.A01);
            }
        }
        intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
        if (06Z.A0O(2)) {
            AnonymousClass002.A0X(intent, "CreateIntent created the following intent: ", AnonymousClass001.A0k());
        }
        return intent;
    }

    @Override // X.C07q
    public /* bridge */ /* synthetic */ Object A02(Intent intent, int i) {
        return new ActivityResult(i, intent);
    }
}
