package com.facebook.wearable.common.comms.hera.shared.connectivity;

import X.04S;
import X.7zO;
import X.AnonymousClass001;
import X.C00q;
import X.KLm;
import android.util.Log;
import kotlin.jvm.functions.Function1;

/* loaded from: DataXConnectionTransportProvider$start$channel$1$2.class */
public final class DataXConnectionTransportProvider$start$channel$1$2 extends C00q implements Function1 {
    public final /* synthetic */ DataXConnectionTransportProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataXConnectionTransportProvider$start$channel$1$2(DataXConnectionTransportProvider dataXConnectionTransportProvider) {
        super(1);
        this.this$0 = dataXConnectionTransportProvider;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((KLm) obj);
        return 04S.A00;
    }

    public final void invoke(KLm kLm) {
        StringBuilder A0x = 7zO.A0x(kLm, 0);
        A0x.append("onError: ");
        A0x.append(kLm.getMessage());
        A0x.append(' ');
        A0x.append(kLm.error);
        A0x.append(' ');
        Log.e(DataXConnectionTransportProvider.TAG, AnonymousClass001.A0a(kLm.getStackTrace(), A0x));
        this.this$0.onError.invoke(kLm);
    }
}
