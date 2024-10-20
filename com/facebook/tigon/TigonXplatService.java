package com.facebook.tigon;

import X.11T;
import X.1KR;
import X.1KU;
import X.3HA;
import X.3Hv;
import X.3K3;
import X.41Z;
import X.C0il;
import X.C21t;
import X.C41a;
import com.facebook.jni.HybridData;
import com.facebook.tigon.iface.TigonRequest;
import com.facebook.tigon.iface.TigonServiceHolder;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* loaded from: TigonXplatService.class */
public class TigonXplatService extends TigonServiceHolder implements C21t {
    public static final int DEFAULT_BUFFER_SIZE = 1024;
    public final 1KU mTigonRequestCounter;

    public TigonXplatService(HybridData hybridData, TigonErrorReporter tigonErrorReporter, 1KU r304) {
        super(hybridData);
        this.mTigonRequestCounter = r304;
        try {
            C0il.A0B("tigonjni");
        } catch (Throwable th) {
            if (tigonErrorReporter != null) {
                tigonErrorReporter.softReport("Tigon: TigonXplatService", th);
            }
            throw th;
        }
    }

    private native TigonXplatRequestToken sendRequestBodyBufferIntegerBuffer(TigonRequest tigonRequest, byte[] bArr, int i, TigonBodyProvider tigonBodyProvider, byte[] bArr2, int i2, TigonCallbacks tigonCallbacks, Executor executor);

    private native TigonXplatRequestToken sendRequestIntegerBuffer(TigonRequest tigonRequest, byte[] bArr, int i, ByteBuffer[] byteBufferArr, int i2, TigonCallbacks tigonCallbacks, Executor executor);

    @Override // X.C21t
    public boolean isAvailable() {
        HybridData hybridData = this.mHybridData;
        if (hybridData == null) {
            return false;
        }
        return hybridData.isValid();
    }

    public native boolean isObservable();

    public void onPreRequest(TigonRequest tigonRequest) {
    }

    @Override // X.C21u
    public native void releaseBodyBuffer(ByteBuffer byteBuffer);

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, X.41Z] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.41Z] */
    @Override // X.C21t
    public TigonRequestToken sendRequest(TigonRequest tigonRequest, TigonBodyProvider tigonBodyProvider, TigonCallbacks tigonCallbacks, Executor executor) {
        onPreRequest(tigonRequest);
        ?? obj = new Object();
        ((41Z) obj).A01 = new byte[1024];
        C41a.A00(obj, tigonRequest);
        1KR r0 = this.mTigonRequestCounter;
        if (r0 != null) {
            r0.A08.getAndIncrement();
        }
        ?? obj2 = new Object();
        ((41Z) obj2).A01 = new byte[1024];
        3K3 r310 = tigonBodyProvider.mInfo;
        if (r310 == null) {
            r310 = new 3K3();
            tigonBodyProvider.mInfo = r310;
        }
        3HA r02 = 3Hv.A00;
        11T.A0F(r02, 0);
        if (r310.A00.get(r02) != null) {
            obj2.A00((byte) 1);
            obj2.A00((byte) 1);
        }
        obj2.A00((byte) 0);
        return sendRequestBodyBufferIntegerBuffer(tigonRequest, ((41Z) obj).A01, ((41Z) obj).A00, tigonBodyProvider, ((41Z) obj2).A01, ((41Z) obj2).A00, tigonCallbacks, executor);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.41Z] */
    @Override // X.C21t
    public TigonRequestToken sendRequest(TigonRequest tigonRequest, ByteBuffer[] byteBufferArr, int i, TigonCallbacks tigonCallbacks, Executor executor) {
        onPreRequest(tigonRequest);
        ?? obj = new Object();
        ((41Z) obj).A01 = new byte[1024];
        C41a.A00(obj, tigonRequest);
        1KR r0 = this.mTigonRequestCounter;
        if (r0 != null) {
            r0.A08.getAndIncrement();
        }
        return sendRequestIntegerBuffer(tigonRequest, ((41Z) obj).A01, ((41Z) obj).A00, byteBufferArr, i, tigonCallbacks, executor);
    }
}
