package X;

import android.content.Context;
import android.os.RemoteException;
import com.facebook.inject.FbInjector;
import com.facebook.omnistore.OmnistoreMqtt;

/* renamed from: X.1oB, reason: invalid class name */
/* loaded from: 1oB.class */
public final class C1oB implements OmnistoreMqtt.Publisher {
    public Context A00;
    public final C1oE A01;

    public C1oB() {
        Context A00 = FbInjector.A00();
        this.A00 = A00;
        this.A01 = (C1oE) 1Hv.A02(A00, 66156);
    }

    @Override // com.facebook.omnistore.OmnistoreMqtt.Publisher
    public void ensureConnection() {
    }

    @Override // com.facebook.omnistore.OmnistoreMqtt.Publisher
    public void publishMessage(String str, byte[] bArr, final OmnistoreMqtt.PublishCallback publishCallback) {
        final 2Ay CVT = this.A01.CVT();
        try {
            if (CVT.A03(new InterfaceC01073pn() { // from class: X.3ba
                @Override // X.InterfaceC01073pn
                public void BxV() {
                    CVT.A07();
                    publishCallback.onFailure();
                }

                @Override // X.InterfaceC01073pn
                public void COO(long j) {
                    CVT.A07();
                    publishCallback.onSuccess();
                }
            }, 0S2.A01, str, bArr) == -1) {
                CVT.A07();
                publishCallback.onFailure();
            }
        } catch (RemoteException unused) {
            CVT.A07();
            publishCallback.onFailure();
        }
    }
}
