package com.facebook.xapp.messaging.events.common.threadview;

import X.1Q5;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.List;

/* loaded from: OnThreadVisible.class */
public final class OnThreadVisible implements 1Q5 {
    public final ThreadKey A00;

    public OnThreadVisible(ThreadKey threadKey) {
        this.A00 = threadKey;
    }

    public String A3Z() {
        return "com.facebook.xapp.messaging.events.common.threadview.OnThreadVisible";
    }

    public List B1L() {
        return null;
    }
}
