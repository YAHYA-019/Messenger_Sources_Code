package com.facebook.messaging.capability.thread.plugins.core.searchmedia;

import X.1BL;
import X.7Yv;
import X.C1v9;
import X.C1z1;
import com.facebook.user.model.User;

/* loaded from: SearchMediaCapabilityComputation.class */
public final class SearchMediaCapabilityComputation {
    public static final void A00(7Yv r301, User user, C1v9 c1v9) {
        1BL.A1F(c1v9, r301);
        if (user == null || (user.A02() == C1z1.NOT_BLOCKED && !r301.A00(user))) {
            c1v9.A00(15);
        }
    }
}
