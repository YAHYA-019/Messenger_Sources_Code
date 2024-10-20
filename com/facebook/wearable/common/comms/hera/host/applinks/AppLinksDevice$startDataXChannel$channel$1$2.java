package com.facebook.wearable.common.comms.hera.host.applinks;

import X.04S;
import X.0Pz;
import X.0fH;
import X.11T;
import X.C00q;
import X.Kzi;
import X.MFk;
import com.facebook.wearable.common.comms.rtc.hera.intf.IManagedByteBufferPool;
import java.nio.ByteBuffer;
import kotlin.jvm.functions.Function1;

/* loaded from: AppLinksDevice$startDataXChannel$channel$1$2.class */
public final class AppLinksDevice$startDataXChannel$channel$1$2 extends C00q implements Function1 {
    public final /* synthetic */ AppLinksDevice this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLinksDevice$startDataXChannel$channel$1$2(AppLinksDevice appLinksDevice) {
        super(1);
        this.this$0 = appLinksDevice;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Kzi) obj);
        return 04S.A00;
    }

    public final void invoke(Kzi kzi) {
        IManagedByteBufferPool.IBuffer convertBuffer;
        String str;
        11T.A0F(kzi, 0);
        int i = kzi.A01;
        if (i == 0) {
            ByteBuffer byteBuffer = kzi.A00;
            if (byteBuffer == null) {
                return;
            }
            AppLinksDevice appLinksDevice = this.this$0;
            Integer num = appLinksDevice.remoteNodeId;
            if (num != null) {
                convertBuffer = appLinksDevice.convertBuffer(byteBuffer);
                if (convertBuffer != null) {
                    MFk mFk = appLinksDevice.inQueue;
                    ByteBuffer byteBuffer2 = kzi.A00;
                    mFk.send(0, convertBuffer, byteBuffer2 != null ? byteBuffer2.limit() : 0, num.intValue(), 0);
                    return;
                }
                return;
            }
            str = "Dropped message due to missing remoteNodeId";
        } else {
            if (i == 52986) {
                this.this$0.handleRegistrationResponse(kzi);
                return;
            }
            str = 0Pz.A0T("Unhandled message type: ", i);
        }
        0fH.A0k(AppLinksDevice.TAG, str);
    }
}
