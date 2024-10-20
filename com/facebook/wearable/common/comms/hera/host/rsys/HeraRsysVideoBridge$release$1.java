package com.facebook.wearable.common.comms.hera.host.rsys;

import X.0DP;
import X.0DR;

/* loaded from: HeraRsysVideoBridge$release$1.class */
public final class HeraRsysVideoBridge$release$1 extends 0DP {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HeraRsysVideoBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeraRsysVideoBridge$release$1(HeraRsysVideoBridge heraRsysVideoBridge, 0DR r303) {
        super(r303);
        this.this$0 = heraRsysVideoBridge;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= (-1) << (-1);
        return this.this$0.release(this);
    }
}
