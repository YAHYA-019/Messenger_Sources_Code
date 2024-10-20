package com.facebook.wearable.common.comms.hera.shared.connectivity;

import X.04S;
import X.0Q8;
import X.11T;
import X.1BK;
import X.C00m;
import X.C00q;
import kotlin.jvm.functions.Function2;

/* loaded from: DataXConnectionTransportProvider$start$channel$1$3.class */
public final class DataXConnectionTransportProvider$start$channel$1$3 extends C00q implements C00m {
    public final /* synthetic */ DataXConnectionTransportProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataXConnectionTransportProvider$start$channel$1$3(DataXConnectionTransportProvider dataXConnectionTransportProvider) {
        super(0);
        this.this$0 = dataXConnectionTransportProvider;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        m10258invoke();
        return 04S.A00;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m10258invoke() {
        DataXConnectionTransportProvider dataXConnectionTransportProvider = this.this$0;
        Integer num = dataXConnectionTransportProvider.remoteNodeId;
        if (num != null) {
            Function2 function2 = dataXConnectionTransportProvider.onRemoteAvailability;
            if (function2 == null) {
                11T.A0L("onRemoteAvailability");
                throw 0Q8.createAndThrow();
            }
            function2.invoke(num, 1BK.A0d());
        }
    }
}
