package com.facebook.xapp.messaging.events.common.threadview;

import X.1Q5;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.List;

/* loaded from: OnThreadClosed.class */
public final class OnThreadClosed implements 1Q5 {
    public final ThreadKey A00;

    public OnThreadClosed(ThreadKey threadKey) {
        this.A00 = threadKey;
    }

    public String A3Z() {
        return "com.facebook.xapp.messaging.events.common.threadview.OnThreadClosed";
    }

    public List B1L() {
        return null;
    }
}
