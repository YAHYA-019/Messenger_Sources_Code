package com.facebook.messaging.analytics.ttrc.surface.search.event;

import X.C0s8;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.pre.event.PRELoggingEvent;
import java.util.List;

/* loaded from: OnSearchItemThreadKeyResolve.class */
public final class OnSearchItemThreadKeyResolve extends PRELoggingEvent {
    public static final List A02 = C0s8.A14("com.facebook.xapp.messaging.pre.event.PRELoggingEvent");
    public final OnSearchItemClicked A00;
    public final ThreadKey A01;

    public OnSearchItemThreadKeyResolve(OnSearchItemClicked onSearchItemClicked, ThreadKey threadKey) {
        super("search/item_click/thread_key_resolve");
        this.A00 = onSearchItemClicked;
        this.A01 = threadKey;
    }

    @Override // com.facebook.xapp.messaging.pre.event.PRELoggingEvent
    public String A3Z() {
        return "com.facebook.messaging.analytics.ttrc.surface.search.event.OnSearchItemThreadKeyResolve";
    }

    @Override // com.facebook.xapp.messaging.pre.event.PRELoggingEvent
    public List B1L() {
        return A02;
    }
}
