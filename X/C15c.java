package X;

import com.facebook.proxygen.utils.RequestDefragmentingOutputStream;
import org.tukaani.xz.LZMA2Options;
import org.tukaani.xz.lzma.LZMAEncoder;

/* renamed from: X.15c, reason: invalid class name */
/* loaded from: 15c.class */
public final class C15c implements 12F {
    public final LZMA2Options A00;
    public final byte[] A01;

    public C15c() {
    }

    public C15c(LZMA2Options lZMA2Options) {
        byte[] bArr = new byte[1];
        this.A01 = bArr;
        if (lZMA2Options.A04 == 0) {
            bArr[0] = 0;
        } else {
            bArr[0] = (byte) (LZMAEncoder.A00(Math.max(lZMA2Options.A01, RequestDefragmentingOutputStream.BODY_BUFFER_SIZE) - 1) - 23);
        }
        this.A00 = (LZMA2Options) lZMA2Options.clone();
    }
}
