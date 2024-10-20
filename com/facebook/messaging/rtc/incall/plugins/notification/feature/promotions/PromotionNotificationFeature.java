package com.facebook.messaging.rtc.incall.plugins.notification.feature.promotions;

import X.1BL;
import X.1Br;
import X.1Lm;
import X.Gpg;
import X.HBr;
import X.HEt;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: PromotionNotificationFeature.class */
public final class PromotionNotificationFeature extends HEt {
    public int A00;
    public HBr A01;
    public final 1Br A02;
    public final Gpg A03;

    public PromotionNotificationFeature(Context context, FbUserSession fbUserSession) {
        1BL.A1F(context, fbUserSession);
        this.A02 = 1Lm.A00(context, fbUserSession, 67679);
        this.A01 = HBr.A0h;
        this.A03 = new Gpg(this, 7);
    }
}
