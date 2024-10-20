package X;

import android.net.Uri;
import com.facebook.proxygen.utils.RequestDefragmentingOutputStream;
import java.io.EOFException;

/* loaded from: Laf.class */
public final class Laf implements C6a5 {
    public final byte[] A00 = new byte[RequestDefragmentingOutputStream.BODY_BUFFER_SIZE];

    @Override // X.C6a5
    public void ATn(6Yl r302) {
    }

    @Override // X.C6a5
    public /* synthetic */ void Cj9(6aO r302, int i) {
        r302.A0Q(i);
    }

    @Override // X.C6a5
    public void CjA(6aO r302, int i, int i2) {
        r302.A0Q(i);
    }

    @Override // X.C6a5
    public int CjE(6D8 r302, int i, int i2, boolean z) {
        int read = r302.read(this.A00, 0, Math.min(RequestDefragmentingOutputStream.BODY_BUFFER_SIZE, i));
        if (read != -1) {
            return read;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // X.C6a5
    public void CjG(C6ao c6ao, int i, int i2, int i3, long j) {
    }

    @Override // X.C6a5
    public void D8Y(Uri uri) {
    }
}
