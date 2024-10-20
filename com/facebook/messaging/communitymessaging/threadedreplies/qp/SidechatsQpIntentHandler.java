package com.facebook.messaging.communitymessaging.threadedreplies.qp;

import X.0CW;
import X.1BJ;
import X.1BK;
import X.1Br;
import X.1De;
import X.7zN;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: SidechatsQpIntentHandler.class */
public final class SidechatsQpIntentHandler {
    public final 1Br A00;
    public final Context A01;
    public final 1De A02;

    public SidechatsQpIntentHandler(1De r302) {
        this.A02 = r302;
        Context context = (Context) 1De.A00(r302, 83719);
        this.A01 = context;
        this.A00 = 7zN.A0H(context);
    }

    public static final Bundle A00(Intent intent, SidechatsQpIntentHandler sidechatsQpIntentHandler) {
        String queryParameter;
        Long A0e;
        Uri data = intent.getData();
        Bundle bundle = null;
        if (data != null && (queryParameter = data.getQueryParameter("thread_id")) != null && (A0e = 0CW.A0e(queryParameter)) != null) {
            long longValue = A0e.longValue();
            1Br.A0C(sidechatsQpIntentHandler.A00);
            ThreadKey A03 = ThreadKey.A03(longValue);
            bundle = 1BK.A05();
            bundle.putBoolean(1BJ.A00(713), true);
            bundle.putParcelable("thread_key", A03);
        }
        return bundle;
    }
}
