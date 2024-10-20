package com.facebook.wearable.common.comms.hera.shared.connectivity;

import X.04S;
import X.11T;
import X.C00q;
import X.Kzi;
import kotlin.jvm.functions.Function1;

/* loaded from: DataXConnectionTransportProvider$start$channel$1$1.class */
public final class DataXConnectionTransportProvider$start$channel$1$1 extends C00q implements Function1 {
    public final /* synthetic */ DataXConnectionTransportProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataXConnectionTransportProvider$start$channel$1$1(DataXConnectionTransportProvider dataXConnectionTransportProvider) {
        super(1);
        this.this$0 = dataXConnectionTransportProvider;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Kzi) obj);
        return 04S.A00;
    }

    public final void invoke(Kzi kzi) {
        11T.A0F(kzi, 0);
        this.this$0.handleIncomingBuffer(kzi);
    }
}
