package com.facebook.wearable.common.comms.hera.host.applinks;

import X.04S;
import X.0DO;
import X.0DR;
import X.0Ds;
import X.0Dt;
import X.2aI;
import X.AnonymousClass001;
import X.C44k;
import kotlin.jvm.functions.Function2;

/* loaded from: AppLinksDevice$teardownAndMaybeScheduleRetry$1.class */
public final class AppLinksDevice$teardownAndMaybeScheduleRetry$1 extends 0DO implements Function2 {
    public int label;
    public final /* synthetic */ AppLinksDevice this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLinksDevice$teardownAndMaybeScheduleRetry$1(AppLinksDevice appLinksDevice, 0DR r303) {
        super(2, r303);
        this.this$0 = appLinksDevice;
    }

    public final 0DR create(Object obj, 0DR r303) {
        return new AppLinksDevice$teardownAndMaybeScheduleRetry$1(this.this$0, r303);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(2aI r302, 0DR r303) {
        return new AppLinksDevice$teardownAndMaybeScheduleRetry$1(this.this$0, r303).invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0Ds r0 = 0Ds.A02;
        int i = this.label;
        if (i == 0) {
            0Dt.A00(obj);
            this.label = 1;
            if (C44k.A01(this, 500L) == r0) {
                return r0;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0M();
            }
            0Dt.A00(obj);
        }
        this.this$0.startConnection();
        return 04S.A00;
    }
}
