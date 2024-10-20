package X;

import android.net.Uri;
import java.util.Collections;

/* renamed from: X.6aA, reason: invalid class name */
/* loaded from: 6aA.class */
public final class C6aA implements 6D7 {
    public long A00;
    public Uri A01;
    public java.util.Map A02;
    public final 6D7 A03;

    public C6aA(6D7 r302) {
        r302.getClass();
        this.A03 = r302;
        this.A01 = Uri.EMPTY;
        this.A02 = Collections.emptyMap();
    }

    public void A7c(5M9 r302) {
        r302.getClass();
        this.A03.A7c(r302);
    }

    public java.util.Map B7n() {
        return this.A03.B7n();
    }

    public Uri BIM() {
        return this.A03.BIM();
    }

    public long CVO(6DQ r302) {
        this.A01 = r302.A06;
        this.A02 = Collections.emptyMap();
        6D7 r0 = this.A03;
        long CVO = r0.CVO(r302);
        Uri BIM = r0.BIM();
        BIM.getClass();
        this.A01 = BIM;
        this.A02 = r0.B7n();
        return CVO;
    }

    public /* synthetic */ void cancel() {
    }

    public void close() {
        this.A03.close();
    }

    public int read(byte[] bArr, int i, int i2) {
        int read = this.A03.read(bArr, i, i2);
        if (read != -1) {
            this.A00 += read;
        }
        return read;
    }
}
