package com.facebook.messaging.wearable.plugins.hera.ui;

import X.04S;
import X.0DO;
import X.0DR;
import X.0Ds;
import X.0Dt;
import X.1BK;
import X.AnonymousClass001;
import X.C44k;
import X.IaT;
import X.T5o;
import X.T65;
import kotlin.jvm.functions.Function2;

/* loaded from: ArciToggleButton$setDelayedCollapseJob$1.class */
public final class ArciToggleButton$setDelayedCollapseJob$1 extends 0DO implements Function2 {
    public int label;
    public final /* synthetic */ IaT this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArciToggleButton$setDelayedCollapseJob$1(IaT iaT, 0DR r303) {
        super(2, r303);
        this.this$0 = iaT;
    }

    public final 0DR create(Object obj, 0DR r303) {
        return new ArciToggleButton$setDelayedCollapseJob$1(this.this$0, r303);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ArciToggleButton$setDelayedCollapseJob$1(this.this$0, (0DR) obj2).invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0Ds r0 = 0Ds.A02;
        int i = this.label;
        if (i == 0) {
            0Dt.A00(obj);
            this.label = 1;
            if (C44k.A01(this, 3000L) == r0) {
                return r0;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0M();
            }
            0Dt.A00(obj);
        }
        T65 A00 = T65.A00(IaT.A00(this.this$0), (T5o) null, 1BK.A0d(), (Boolean) null, 30);
        if (A00 != null) {
            IaT iaT = this.this$0;
            IaT.A03(iaT, A00);
            IaT.A02(iaT);
        }
        return 04S.A00;
    }
}
