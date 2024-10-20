package com.facebook.kotlin.coroutines.startsensitive;

import X.04S;
import X.0DO;
import X.0DR;
import X.0Dt;
import X.AnonymousClass001;
import kotlin.jvm.functions.Function2;

/* loaded from: LaunchStartSensitiveFutureWrapper$launchWarmedFuture$2$1$1.class */
public final class LaunchStartSensitiveFutureWrapper$launchWarmedFuture$2$1$1 extends 0DO implements Function2 {
    public int label;

    public LaunchStartSensitiveFutureWrapper$launchWarmedFuture$2$1$1(0DR r302) {
        super(2, r302);
    }

    public final 0DR create(Object obj, 0DR r303) {
        return new LaunchStartSensitiveFutureWrapper$launchWarmedFuture$2$1$1(r303);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        0DR r0 = (0DR) obj2;
        if (r0 != null) {
            r0.getContext();
        }
        04S r02 = 04S.A00;
        0Dt.A00(r02);
        return r02;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0M();
        }
        0Dt.A00(obj);
        return 04S.A00;
    }
}
