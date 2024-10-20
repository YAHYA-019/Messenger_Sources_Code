package com.facebook.wearable.common.comms.hera.host;

import X.0DP;
import X.0DR;

/* loaded from: ExtensionsKt$dispatchTo$1.class */
public final class ExtensionsKt$dispatchTo$1 extends 0DP {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public ExtensionsKt$dispatchTo$1(0DR r302) {
        super(r302);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= (-1) << (-1);
        return ExtensionsKt.dispatchTo(null, null, this);
    }
}
