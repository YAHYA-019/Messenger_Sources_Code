package com.facebook.orca.threadview.events;

import X.5Sh;
import X.C0s8;
import com.facebook.xapp.messaging.events.common.data.OnDataChanged;
import java.util.List;

/* loaded from: OnNewLoaderResult.class */
public final class OnNewLoaderResult extends OnDataChanged {
    public static final List A01 = C0s8.A14("com.facebook.xapp.messaging.events.common.data.OnDataChanged");
    public final 5Sh A00;

    public OnNewLoaderResult(5Sh r302) {
        super(r302);
        this.A00 = r302;
    }

    @Override // com.facebook.xapp.messaging.events.common.data.OnDataChanged
    public /* bridge */ /* synthetic */ Object A00() {
        return this.A00;
    }

    @Override // com.facebook.xapp.messaging.events.common.data.OnDataChanged
    public String A3Z() {
        return "com.facebook.orca.threadview.events.OnNewLoaderResult";
    }

    @Override // com.facebook.xapp.messaging.events.common.data.OnDataChanged
    public List B1L() {
        return A01;
    }
}
