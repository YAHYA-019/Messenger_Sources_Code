package com.facebook.wearable.common.comms.hera.shared.engine;

import X.0DP;
import X.0DR;
import X.0Q8;

/* loaded from: HeraNativeClientCallEngine$init$1.class */
public final class HeraNativeClientCallEngine$init$1 extends 0DP {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HeraNativeClientCallEngine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeraNativeClientCallEngine$init$1(HeraNativeClientCallEngine heraNativeClientCallEngine, 0DR r303) {
        super(r303);
        this.this$0 = heraNativeClientCallEngine;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= (-1) << (-1);
        HeraNativeClientCallEngine.init$suspendImpl((HeraNativeClientCallEngine) null, (0DR) this);
        throw 0Q8.createAndThrow();
    }
}
