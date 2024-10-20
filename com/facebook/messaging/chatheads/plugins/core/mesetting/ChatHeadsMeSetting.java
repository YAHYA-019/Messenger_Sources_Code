package com.facebook.messaging.chatheads.plugins.core.mesetting;

import X.1Bi;
import X.4YT;
import X.AnonymousClass001;
import X.GOm;
import X.KqH;
import X.L8u;
import org.json.JSONObject;

/* loaded from: ChatHeadsMeSetting.class */
public final class ChatHeadsMeSetting {
    public static final void A00(boolean z, boolean z2, boolean z3) {
        KqH kqH = (KqH) 1Bi.A03(131290);
        String A00 = GOm.A00(362);
        JSONObject A12 = AnonymousClass001.A12();
        String valueOf = String.valueOf(z);
        if (valueOf != null) {
            A12.put("ch_current_enabled_value", valueOf);
        }
        String valueOf2 = String.valueOf(z2);
        if (valueOf2 != null) {
            A12.put("ch_new_enabled_value", valueOf2);
        }
        String valueOf3 = String.valueOf(z3);
        String A002 = 4YT.A00(421);
        if (valueOf3 != null) {
            A12.put(A002, valueOf3);
        }
        L8u.A01(kqH, "settings_toggle", A00, A12);
    }
}
