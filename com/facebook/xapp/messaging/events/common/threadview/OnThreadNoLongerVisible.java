package com.facebook.xapp.messaging.events.common.threadview;

import X.1Q5;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.List;

/* loaded from: OnThreadNoLongerVisible.class */
public final class OnThreadNoLongerVisible implements 1Q5 {
    public final ThreadKey A00;

    public OnThreadNoLongerVisible(ThreadKey threadKey) {
        this.A00 = threadKey;
    }

    public String A3Z() {
        return "com.facebook.xapp.messaging.events.common.threadview.OnThreadNoLongerVisible";
    }

    public List B1L() {
        return null;
    }
}
