package com.facebook.messaging.business.bmcconsiderationgrowth.sellerprofile.plugins.pageproductsbutton;

import X.11T;
import X.1BL;
import X.1Br;
import X.1Lm;
import X.2Sh;
import X.DJX;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.user.model.User;

/* loaded from: ThreadSettingsPageProductsButton.class */
public final class ThreadSettingsPageProductsButton {
    public final Context A00;
    public final 1Br A01;
    public final DJX A02;
    public final User A03;
    public final FbUserSession A04;
    public final 2Sh A05;

    public ThreadSettingsPageProductsButton(Context context, FbUserSession fbUserSession, DJX djx, User user, 2Sh r306) {
        1BL.A1F(context, fbUserSession);
        11T.A0F(djx, 5);
        this.A00 = context;
        this.A04 = fbUserSession;
        this.A05 = r306;
        this.A02 = djx;
        this.A03 = user;
        this.A01 = 1Lm.A00(context, fbUserSession, 66472);
    }
}
