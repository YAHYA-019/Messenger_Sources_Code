package com.facebook.messaging.business.bmcconsiderationgrowth.buyerpersistentnavigation.plugins.composerpersistentnavigation.buyerpersistentnavigationcatalog;

import X.1BL;
import X.1Br;
import X.1HG;
import X.6Qb;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: BuyerPersistentNavigationCatalogImplementation.class */
public final class BuyerPersistentNavigationCatalogImplementation {
    public boolean A00;
    public final Context A01;
    public final FbUserSession A02;
    public final 1Br A03;
    public final 6Qb A04;

    public BuyerPersistentNavigationCatalogImplementation(Context context, FbUserSession fbUserSession, 6Qb r304) {
        1BL.A1H(context, r304, fbUserSession);
        this.A01 = context;
        this.A04 = r304;
        this.A02 = fbUserSession;
        this.A03 = 1HG.A00(context, 67416);
    }
}
