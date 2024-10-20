package com.facebook.xapp.messaging.events.common.data;

import X.1Q5;
import com.facebook.messaging.inbox.loader.event.OnInboxDataChanged;
import java.util.List;

/* loaded from: OnDataChanged.class */
public class OnDataChanged implements 1Q5 {
    public final Object A00;

    public OnDataChanged(Object obj) {
        this.A00 = obj;
    }

    public Object A00() {
        return this instanceof OnInboxDataChanged ? ((OnInboxDataChanged) this).A00 : this.A00;
    }

    public String A3Z() {
        return "com.facebook.xapp.messaging.events.common.data.OnDataChanged";
    }

    public List B1L() {
        return null;
    }
}
