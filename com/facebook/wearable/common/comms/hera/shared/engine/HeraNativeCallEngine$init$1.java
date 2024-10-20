package com.facebook.wearable.common.comms.hera.shared.engine;

import X.0DP;
import X.0DR;

/* loaded from: HeraNativeCallEngine$init$1.class */
public final class HeraNativeCallEngine$init$1 extends 0DP {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HeraNativeCallEngine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeraNativeCallEngine$init$1(HeraNativeCallEngine heraNativeCallEngine, 0DR r303) {
        super(r303);
        this.this$0 = heraNativeCallEngine;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= (-1) << (-1);
        return HeraNativeCallEngine.init$suspendImpl(this.this$0, this);
    }
}
