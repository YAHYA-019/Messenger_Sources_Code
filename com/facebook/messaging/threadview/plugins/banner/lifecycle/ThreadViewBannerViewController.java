package com.facebook.messaging.threadview.plugins.banner.lifecycle;

import X.11T;
import X.2S4;
import X.63D;
import X.6Fz;
import X.6G3;
import X.6Kn;
import X.6Kp;
import X.6SW;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: ThreadViewBannerViewController.class */
public final class ThreadViewBannerViewController {
    public ThreadKey A00;
    public 6SW A01;
    public 6Kp A02;
    public final 2S4 A03;
    public final 63D A04;
    public final 6G3 A05;
    public final 6Fz A06;
    public final 6Kn A07;
    public final Context A08;

    public ThreadViewBannerViewController(Context context, 2S4 r303, 63D r304, 6G3 r305, 6Fz r306) {
        11T.A0F(r306, 1);
        11T.A0F(r305, 2);
        11T.A0F(r304, 3);
        11T.A0F(r303, 4);
        11T.A0F(context, 5);
        this.A06 = r306;
        this.A05 = r305;
        this.A04 = r304;
        this.A03 = r303;
        this.A08 = context;
        this.A07 = new 6Kn(this);
    }
}
