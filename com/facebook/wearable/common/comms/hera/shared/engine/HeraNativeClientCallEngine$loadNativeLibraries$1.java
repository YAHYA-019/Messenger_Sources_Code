package com.facebook.wearable.common.comms.hera.shared.engine;

import X.0DP;
import X.0DR;

/* loaded from: HeraNativeClientCallEngine$loadNativeLibraries$1.class */
public final class HeraNativeClientCallEngine$loadNativeLibraries$1 extends 0DP {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HeraNativeClientCallEngine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeraNativeClientCallEngine$loadNativeLibraries$1(HeraNativeClientCallEngine heraNativeClientCallEngine, 0DR r303) {
        super(r303);
        this.this$0 = heraNativeClientCallEngine;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= (-1) << (-1);
        return HeraNativeClientCallEngine.loadNativeLibraries$suspendImpl((HeraNativeClientCallEngine) null, (0DR) this);
    }
}
