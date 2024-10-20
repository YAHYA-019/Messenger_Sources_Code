package com.facebook.messaging.storagemanagement.mediamanager.activity;

import X.1BK;
import X.7zO;
import X.7zU;
import X.8GL;
import X.96V;
import X.C06c;
import android.os.Bundle;
import com.facebook.base.activity.FbFragmentActivity;

/* loaded from: MediaManagerActivity.class */
public final class MediaManagerActivity extends FbFragmentActivity {
    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        Long l;
        super.A2y(bundle);
        setContentView(2132542496);
        96V r304 = 96V.A02;
        Bundle A0H = 7zO.A0H(this);
        Long l2 = null;
        if (A0H != null) {
            96V parcelable = A0H.getParcelable("sort_order_key");
            if (parcelable != null) {
                r304 = parcelable;
            }
            l2 = Long.valueOf(A0H.getLong("size_threshold_key", 0L));
            l = Long.valueOf(A0H.getLong("thread_pk_key", -1));
        } else {
            l = null;
        }
        C06c A0D = 7zU.A0D(this);
        8GL r0 = new 8GL();
        Bundle A05 = 1BK.A05();
        A05.putSerializable("sort_order_key", r304);
        if (l2 != null) {
            A05.putLong("size_threshold_key", l2.longValue());
        }
        if (l != null) {
            A05.putLong("thread_pk_key", l.longValue());
        }
        r0.setArguments(A05);
        A0D.A0L(r0, 2131365505);
        A0D.A04();
    }
}
