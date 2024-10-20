package com.facebook.wearable.common.comms.hera.shared.engine;

import X.0DP;
import X.0DR;

/* loaded from: HeraNativeHostCallEngine$loadNativeLibraries$1.class */
public final class HeraNativeHostCallEngine$loadNativeLibraries$1 extends 0DP {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HeraNativeHostCallEngine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeraNativeHostCallEngine$loadNativeLibraries$1(HeraNativeHostCallEngine heraNativeHostCallEngine, 0DR r303) {
        super(r303);
        this.this$0 = heraNativeHostCallEngine;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= (-1) << (-1);
        return HeraNativeHostCallEngine.loadNativeLibraries$suspendImpl(this.this$0, (0DR) this);
    }
}
