package com.facebook.xapp.messaging.events.common.threadview;

import X.1Q5;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.List;

/* loaded from: OnUnreadMessageDetected.class */
public final class OnUnreadMessageDetected implements 1Q5 {
    public final ThreadKey A00;

    public OnUnreadMessageDetected(ThreadKey threadKey) {
        this.A00 = threadKey;
    }

    public String A3Z() {
        return "com.facebook.xapp.messaging.events.common.threadview.OnUnreadMessageDetected";
    }

    public List B1L() {
        return null;
    }
}
