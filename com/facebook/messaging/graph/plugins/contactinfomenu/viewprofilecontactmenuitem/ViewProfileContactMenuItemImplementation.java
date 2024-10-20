package com.facebook.messaging.graph.plugins.contactinfomenu.viewprofilecontactmenuitem;

import X.06Z;
import X.0S2;
import X.1BL;
import X.1Br;
import X.1Bu;
import X.7XU;
import X.C38;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.profile.logging.ContextualProfileLoggingData;
import com.google.common.collect.RegularImmutableMap;

/* loaded from: ViewProfileContactMenuItemImplementation.class */
public final class ViewProfileContactMenuItemImplementation {
    public final 1Br A00;
    public final Context A01;
    public final 06Z A02;
    public final C38 A03;
    public final User A04;

    public ViewProfileContactMenuItemImplementation(Context context, 06Z r303, C38 c38, User user) {
        1BL.A1H(context, user, r303);
        this.A01 = context;
        this.A04 = user;
        this.A02 = r303;
        this.A03 = c38;
        this.A00 = 1Bu.A01(context, 50218);
    }

    public final void A00() {
        ContextualProfileLoggingData contextualProfileLoggingData = new ContextualProfileLoggingData(null, RegularImmutableMap.A03, "contact_management_bottom_sheet_view_profile", "button", true);
        C38 c38 = this.A03;
        if (c38 != null) {
            c38.A00(0S2.A00);
        }
        ((7XU) 1Br.A0B(this.A00)).A04(this.A01, this.A02, (ThreadKey) null, this.A04, contextualProfileLoggingData);
    }
}
