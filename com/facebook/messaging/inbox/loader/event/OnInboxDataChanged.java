package com.facebook.messaging.inbox.loader.event;

import X.2Sg;
import X.C0s8;
import com.facebook.xapp.messaging.events.common.data.OnDataChanged;
import java.util.List;

/* loaded from: OnInboxDataChanged.class */
public final class OnInboxDataChanged extends OnDataChanged {
    public static final List A01 = C0s8.A14("com.facebook.xapp.messaging.events.common.data.OnDataChanged");
    public final 2Sg A00;

    public OnInboxDataChanged(2Sg r302) {
        super(r302);
        this.A00 = r302;
    }

    @Override // com.facebook.xapp.messaging.events.common.data.OnDataChanged
    public String A3Z() {
        return "com.facebook.messaging.inbox.loader.event.OnInboxDataChanged";
    }

    @Override // com.facebook.xapp.messaging.events.common.data.OnDataChanged
    public List B1L() {
        return A01;
    }
}
