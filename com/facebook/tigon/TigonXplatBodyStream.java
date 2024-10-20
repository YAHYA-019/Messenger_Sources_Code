package com.facebook.tigon;

import X.11T;
import X.41Z;
import X.C0il;
import X.C41a;
import X.C4OC;
import com.facebook.jni.HybridData;
import com.facebook.tigon.iface.TigonErrorCode;
import java.nio.ByteBuffer;

/* loaded from: TigonXplatBodyStream.class */
public class TigonXplatBodyStream implements TigonBodyStream {
    public final HybridData mHybridData;

    static {
        C0il.A0B("tigonjni");
    }

    public TigonXplatBodyStream(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    private native void reportBodyLengthNative(int i);

    private native void reportErrorNativeByteBuffer(byte[] bArr, int i);

    private native int transferBytesArrayNative(byte[] bArr, int i);

    private native int transferBytesNative(ByteBuffer byteBuffer, int i);

    private native void writeEOMNative();

    @Override // com.facebook.tigon.TigonBodyStream
    public void reportBodyLength(int i) {
        reportBodyLengthNative(i);
    }

    @Override // com.facebook.tigon.TigonBodyStream
    public void reportError(TigonError tigonError) {
        41Z r0 = new 41Z();
        TigonErrorCode tigonErrorCode = tigonError.category;
        11T.A0F(tigonErrorCode, 1);
        C4OC.A00(r0, tigonErrorCode.value);
        String str = tigonError.errorDomain;
        C4OC c4oc = C41a.A00;
        c4oc.A02(r0, str);
        C4OC.A00(r0, tigonError.domainErrorCode);
        c4oc.A02(r0, tigonError.analyticsDetail);
        reportErrorNativeByteBuffer(r0.A01, r0.A00);
    }

    @Override // com.facebook.tigon.TigonBodyStream
    public int transferBytes(ByteBuffer byteBuffer, int i) {
        return transferBytesNative(byteBuffer, i);
    }

    @Override // com.facebook.tigon.TigonBodyStream
    public int transferBytes(byte[] bArr, int i) {
        return transferBytesArrayNative(bArr, i);
    }

    @Override // com.facebook.tigon.TigonBodyStream
    public void writeEOM() {
        writeEOMNative();
    }
}
