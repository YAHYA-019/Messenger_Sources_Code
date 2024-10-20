package com.facebook.xapp.messaging.datafetch.flow;

import X.04S;
import X.0DO;
import X.0DR;
import X.0Dt;
import X.AnonymousClass001;
import X.C07634kW;
import X.C0Bd;
import X.C82z;

/* loaded from: AdaptableFlow$flow$2.class */
public final class AdaptableFlow$flow$2 extends 0DO implements C0Bd {
    public int label;
    public final /* synthetic */ C07634kW this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdaptableFlow$flow$2(C07634kW c07634kW, 0DR r303) {
        super(3, r303);
        this.this$0 = c07634kW;
    }

    @Override // X.C0Bd
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return new AdaptableFlow$flow$2(this.this$0, (0DR) obj3).invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0M();
        }
        0Dt.A00(obj);
        C07634kW c07634kW = this.this$0;
        C07634kW.A00(c07634kW, "AdaptableFlow_onCompletion", new C82z(c07634kW, 4));
        return 04S.A00;
    }
}
