package com.facebook.quickpromotion.filterextensions.impl;

import X.04S;
import X.0DO;
import X.0DR;
import X.0Ds;
import X.0Dt;
import X.4cZ;
import X.AbD;
import X.AnonymousClass001;
import X.C2a1;
import kotlin.jvm.functions.Function2;

/* loaded from: PostLoadInitializer$initializeFilter$2$2.class */
public final class PostLoadInitializer$initializeFilter$2$2 extends 0DO implements Function2 {
    public final /* synthetic */ AbD $completableDeferred;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostLoadInitializer$initializeFilter$2$2(0DR r302, AbD abD) {
        super(2, r302);
        this.$completableDeferred = abD;
    }

    public final 0DR create(Object obj, 0DR r303) {
        return new PostLoadInitializer$initializeFilter$2$2(r303, this.$completableDeferred);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new PostLoadInitializer$initializeFilter$2$2((0DR) obj2, this.$completableDeferred).invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0Ds r0 = 0Ds.A02;
        int i = this.label;
        if (i == 0) {
            0Dt.A00(obj);
            4cZ r02 = this.$completableDeferred;
            this.label = 1;
            if (((C2a1) r02).A0D(this) == r0) {
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
