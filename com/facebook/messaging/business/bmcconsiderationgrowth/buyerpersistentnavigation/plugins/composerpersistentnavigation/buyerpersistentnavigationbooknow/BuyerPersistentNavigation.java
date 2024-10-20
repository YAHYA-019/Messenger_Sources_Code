package com.facebook.messaging.business.bmcconsiderationgrowth.buyerpersistentnavigation.plugins.composerpersistentnavigation.buyerpersistentnavigationbooknow;

import X.1BL;
import X.1Br;
import X.1HG;
import X.6Qb;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: BuyerPersistentNavigationBookNowImplementation.class */
public final class BuyerPersistentNavigationBookNowImplementation {
    public boolean A00;
    public final Context A01;
    public final 1Br A02;
    public final 6Qb A03;
    public final FbUserSession A04;

    public BuyerPersistentNavigationBookNowImplementation(Context context, FbUserSession fbUserSession, 6Qb r304) {
        1BL.A1H(context, r304, fbUserSession);
        this.A01 = context;
        this.A03 = r304;
        this.A04 = fbUserSession;
        this.A02 = 1HG.A00(context, 67416);
    }
}
