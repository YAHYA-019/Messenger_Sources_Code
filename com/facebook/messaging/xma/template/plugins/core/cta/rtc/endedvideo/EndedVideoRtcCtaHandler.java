package com.facebook.messaging.xma.template.plugins.core.cta.rtc.endedvideo;

import X.11T;
import X.6BK;
import X.BRY;
import android.view.View;
import com.facebook.messaging.model.messages.Message;

/* loaded from: EndedVideoRtcCtaHandler.class */
public final class EndedVideoRtcCtaHandler extends BRY {
    public String A00(boolean z) {
        return "admin_message";
    }

    public void A01(View view, 6BK r303, Message message, String str, String str2) {
        11T.A0F(str, 2);
        super.A01(view, r303, message, str, str2);
    }

    public boolean A02() {
        return true;
    }
}
