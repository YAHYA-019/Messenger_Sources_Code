package com.facebook.messaging.business.plugins.p2bdifferentiation.adminmessagecta;

import X.06Z;
import X.7zT;
import android.content.Context;
import com.facebook.messaging.model.messages.AdminMessageCta;

/* loaded from: P2BPrivacyDisclosureAdminMessageCta.class */
public final class P2BPrivacyDisclosureAdminMessageCta {
    public final Context A00;
    public final 06Z A01;
    public final AdminMessageCta A02;
    public final String A03;

    public P2BPrivacyDisclosureAdminMessageCta(Context context, 06Z r303, AdminMessageCta adminMessageCta, String str) {
        7zT.A1T(context, adminMessageCta, r303);
        this.A00 = context;
        this.A02 = adminMessageCta;
        this.A03 = str;
        this.A01 = r303;
    }
}
