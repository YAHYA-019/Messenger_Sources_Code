package X;

import com.facebook.mqtt.service.ConnectionConfig;

/* renamed from: X.1nb, reason: invalid class name */
/* loaded from: 1nb.class */
public final class C1nb implements C1nX {
    public final /* synthetic */ 1nT A00;
    public final /* synthetic */ C1nX A01;

    public C1nb(1nT r302, C1nX c1nX) {
        this.A00 = r302;
        this.A01 = c1nX;
    }

    @Override // X.C1nX
    public void Bqo(ConnectionConfig connectionConfig, QpF qpF) {
        11T.A0F(qpF, 0);
        this.A01.Bqo(connectionConfig, qpF);
    }

    @Override // X.C1nX
    public boolean Bqu(1nY r302) {
        11T.A0F(r302, 0);
        1nY r0 = 1nY.A05;
        if (r302 == r0) {
            1nT.A03(this.A00, true);
        }
        if (!this.A00.A0D || r302 == r0) {
            return this.A01.Bqu(r302);
        }
        return false;
    }

    @Override // X.C1nX
    public void onMessageDropped(String str, byte[] bArr, long j) {
        this.A01.onMessageDropped(str, bArr, j);
    }
}
