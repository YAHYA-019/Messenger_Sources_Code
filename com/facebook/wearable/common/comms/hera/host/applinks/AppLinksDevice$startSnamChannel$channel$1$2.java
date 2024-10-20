package com.facebook.wearable.common.comms.hera.host.applinks;

import X.04S;
import X.11T;
import X.C00q;
import X.Kzi;
import kotlin.jvm.functions.Function1;

/* loaded from: AppLinksDevice$startSnamChannel$channel$1$2.class */
public final class AppLinksDevice$startSnamChannel$channel$1$2 extends C00q implements Function1 {
    public final /* synthetic */ AppLinksDevice this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLinksDevice$startSnamChannel$channel$1$2(AppLinksDevice appLinksDevice) {
        super(1);
        this.this$0 = appLinksDevice;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Kzi) obj);
        return 04S.A00;
    }

    public final void invoke(Kzi kzi) {
        11T.A0F(kzi, 0);
        this.this$0.handleSnamResponse(kzi);
    }
}
