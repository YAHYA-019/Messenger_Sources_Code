package com.facebook.messaging.bubbles.receiver;

import X.0fH;
import X.11T;
import X.1Bq;
import X.1Br;
import X.51V;
import X.5oO;
import X.C01p;
import X.C01q;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: BubblesBroadcastReceiver.class */
public final class BubblesBroadcastReceiver extends 51V {
    public final 1Br A00;

    public BubblesBroadcastReceiver() {
        super(new String[]{"ACTION_BUBBLE_DELETED"});
        this.A00 = 1Bq.A00(68467);
    }

    public void A09(Context context, Intent intent, C01q c01q, String str) {
        11T.A0F(intent, 1);
        Parcelable parcelableExtra = intent.getParcelableExtra("EXTRA_THREAD_KEY");
        C01p.A00(parcelableExtra);
        11T.A0A(parcelableExtra);
        ThreadKey threadKey = (ThreadKey) parcelableExtra;
        0fH.A0g(threadKey.A0u(), "BubblesBroadcastReceiver", "Bubble hosting %s was manually deleted by the user.");
        ((5oO) 1Br.A0B(this.A00)).A0A(threadKey);
    }
}
