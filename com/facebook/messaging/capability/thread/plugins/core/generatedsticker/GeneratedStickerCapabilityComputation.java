package com.facebook.messaging.capability.thread.plugins.core.generatedsticker;

import X.11T;
import X.C1v9;
import com.facebook.acra.constants.ActionId;
import com.facebook.user.model.User;

/* loaded from: GeneratedStickerCapabilityComputation.class */
public final class GeneratedStickerCapabilityComputation {
    public static final void A00(User user, C1v9 c1v9) {
        11T.A0F(c1v9, 0);
        if (user == null || !user.A1a) {
            return;
        }
        c1v9.A00(ActionId.PRIVACY_VIOLATION);
    }
}
