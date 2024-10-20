package com.facebook.xapp.messaging.events.common.threadview;

import X.1Q5;
import X.2Sh;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.List;

/* loaded from: OnThreadOpened.class */
public final class OnThreadOpened implements 1Q5 {
    public final ThreadKey A00;
    public final 2Sh A01;

    public OnThreadOpened(ThreadKey threadKey, 2Sh r303) {
        this.A00 = threadKey;
        this.A01 = r303;
    }

    public String A3Z() {
        return "com.facebook.xapp.messaging.events.common.threadview.OnThreadOpened";
    }

    public List B1L() {
        return null;
    }
}
