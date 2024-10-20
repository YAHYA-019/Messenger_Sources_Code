package com.facebook.timeline.componenthelper;

import X.11T;
import X.1BL;
import X.1Bn;
import X.2Go;
import X.AnonymousClass001;
import X.C15h;
import X.C4S3;
import X.G7B;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* loaded from: TimelineUriMapHelper.class */
public final class TimelineUriMapHelper extends C4S3 {
    public final C15h A00 = new G7B(13);

    @Override // X.C4S3
    public Intent A00(Context context, Intent intent) {
        boolean A1X = 1BL.A1X(context, intent);
        int intExtra = intent.getIntExtra("target_fragment", -1);
        String str = 1BL.A0E().A02;
        if (intExtra == 8) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                1Bn.A0A(147811);
                2Go.A00(str, extras.containsKey("com.facebook.katana.profile.id") ? String.valueOf(extras.getLong("com.facebook.katana.profile.id")) : str);
                intent.putExtra("parallel_fetch_started", A1X);
            }
            intent.putExtra("inflate_fragment_before_animation", A1X);
            intent.putExtra("title_bar_search_button_visible", false);
        } else {
            if (intExtra == 42) {
                intent.putExtra("com.facebook.katana.profile.id", str);
                return intent;
            }
            if (intExtra != 119) {
                return intent;
            }
        }
        intent.putExtra("extra_parent_activity", A1X);
        return intent;
    }

    @Override // X.C4S3
    public boolean A01() {
        Object obj = this.A00.get();
        11T.A0A(obj);
        return AnonymousClass001.A1V(obj);
    }
}
