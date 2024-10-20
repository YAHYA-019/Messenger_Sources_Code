package com.facebook.fdidlite;

import X.02C;
import X.0jU;
import X.0jW;
import X.11T;
import X.C01q;
import X.C0hq;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.HashMap;

/* loaded from: FDIDSyncLiteReceiver.class */
public final class FDIDSyncLiteReceiver extends C0hq {
    public void A02(Context context, Intent intent, C01q c01q) {
        String creatorPackage;
        long longValue;
        11T.A0G(context, 0, c01q);
        Bundle resultExtras = c01q.getResultExtras(true);
        11T.A0D(resultExtras);
        02C r0 = 0jU.A00;
        11T.A0F(resultExtras, 1);
        PendingIntent pendingIntent = (PendingIntent) resultExtras.getParcelable("auth");
        if (pendingIntent == null || (creatorPackage = pendingIntent.getCreatorPackage()) == null || !0jU.A00(context, creatorPackage)) {
            return;
        }
        HashMap A00 = 0jW.A00(context);
        String str = (String) A00.get("phone_id");
        if (A00.get("phone_id_ts") == null) {
            longValue = 0;
        } else {
            Number number = (Number) A00.get("phone_id_ts");
            11T.A0D(number);
            longValue = number.longValue();
        }
        String str2 = (String) A00.get("origin");
        Bundle bundle = new Bundle();
        bundle.putLong("timestamp", longValue);
        bundle.putString("origin", str2);
        if (str != null) {
            c01q.setResult(-1, str, bundle);
        } else {
            c01q.setResult(0, "FDIDSyncLiteReceiver", bundle);
        }
    }
}
