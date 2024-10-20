package com.facebook.wearable.common.comms.hera.shared.p000native;

import X.04S;
import X.11T;
import X.C00q;
import java.nio.ByteBuffer;
import kotlin.jvm.functions.Function1;

/* loaded from: JavaTransportAdapter$onOutgoingBuffer$1.class */
public final class JavaTransportAdapter$onOutgoingBuffer$1 extends C00q implements Function1 {
    public final /* synthetic */ int $remoteNodeId;
    public final /* synthetic */ JavaTransportAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaTransportAdapter$onOutgoingBuffer$1(JavaTransportAdapter javaTransportAdapter, int i) {
        super(1);
        this.this$0 = javaTransportAdapter;
        this.$remoteNodeId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ByteBuffer) obj);
        return 04S.A00;
    }

    public final void invoke(ByteBuffer byteBuffer) {
        11T.A0F(byteBuffer, 0);
        this.this$0.transport.write(0, byteBuffer.remaining(), byteBuffer, this.$remoteNodeId);
    }
}
