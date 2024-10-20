package com.facebook.wearable.common.comms.hera.shared.p000native;

import X.04S;
import X.C00q;
import android.view.Surface;
import kotlin.jvm.functions.Function1;

/* loaded from: SgVcpVideoSource$previewViewSink$1.class */
public final class SgVcpVideoSource$previewViewSink$1 extends C00q implements Function1 {
    public final /* synthetic */ SgVcpVideoSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SgVcpVideoSource$previewViewSink$1(SgVcpVideoSource sgVcpVideoSource) {
        super(1);
        this.this$0 = sgVcpVideoSource;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Surface) obj);
        return 04S.A00;
    }

    public final void invoke(Surface surface) {
        this.this$0.setPreviewSurface(surface);
    }
}
