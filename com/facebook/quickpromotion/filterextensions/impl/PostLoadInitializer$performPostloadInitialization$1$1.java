package com.facebook.quickpromotion.filterextensions.impl;

import X.04S;
import X.0DO;
import X.0DQ;
import X.0DR;
import X.0Ds;
import X.0Dt;
import X.AJU;
import X.AnonymousClass001;
import X.C2a2;
import X.C44h;
import kotlin.jvm.functions.Function2;

/* loaded from: PostLoadInitializer$performPostloadInitialization$1$1.class */
public final class PostLoadInitializer$performPostloadInitialization$1$1 extends 0DO implements Function2 {
    public final /* synthetic */ C2a2 $job;
    public final /* synthetic */ long $timeOutInMs;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostLoadInitializer$performPostloadInitialization$1$1(0DR r302, C2a2 c2a2, long j) {
        super(2, r302);
        this.$timeOutInMs = j;
        this.$job = c2a2;
    }

    public final 0DR create(Object obj, 0DR r303) {
        return new PostLoadInitializer$performPostloadInitialization$1$1(r303, this.$job, this.$timeOutInMs);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0Ds r0 = 0Ds.A02;
        int i = this.label;
        if (i == 0) {
            0Dt.A00(obj);
            long j = this.$timeOutInMs;
            AJU aju = new AJU(this.$job, null, 20);
            this.label = 1;
            if (C44h.A00(this, aju, j) == r0) {
                return r0;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0M();
            }
            0Dt.A00(obj);
        }
        return 04S.A00;
    }
}
