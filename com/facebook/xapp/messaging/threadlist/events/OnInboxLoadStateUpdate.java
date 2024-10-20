package com.facebook.xapp.messaging.threadlist.events;

import X.1Q5;
import java.util.List;

/* loaded from: OnInboxLoadStateUpdate.class */
public final class OnInboxLoadStateUpdate implements 1Q5 {
    public final String A00;
    public final String A01;
    public static final 1Q5 A04 = new OnInboxLoadStateUpdate("loading", null);
    public static final 1Q5 A03 = new OnInboxLoadStateUpdate("loaded", null);
    public static final 1Q5 A02 = new OnInboxLoadStateUpdate("empty", null);

    public OnInboxLoadStateUpdate(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public String A3Z() {
        return "com.facebook.xapp.messaging.threadlist.events.OnInboxLoadStateUpdate";
    }

    public List B1L() {
        return null;
    }
}
