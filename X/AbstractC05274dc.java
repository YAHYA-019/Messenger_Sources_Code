package X;

import com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImplKt;
import java.io.UnsupportedEncodingException;

/* renamed from: X.4dc, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4dc.class */
public abstract class AbstractC05274dc {
    public static boolean A00;
    public static final boolean A01 = true;
    public static final byte[] A03 = A01("RIFF");
    public static final byte[] A02 = A01("WEBP");
    public static final byte[] A06 = A01("VP8 ");
    public static final byte[] A04 = A01("VP8L");
    public static final byte[] A05 = A01("VP8X");

    public static boolean A00(byte[] bArr, int i, byte[] bArr2) {
        boolean z = false;
        if (bArr2 != null) {
            int length = bArr2.length;
            if (length + i <= bArr.length) {
                int i2 = 0;
                while (true) {
                    int i3 = i2;
                    if (i3 >= length) {
                        z = true;
                        break;
                    }
                    if (bArr[i3 + i] != bArr2[i3]) {
                        break;
                    }
                    i2 = i3 + 1;
                }
            }
        }
        return z;
    }

    public static byte[] A01(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e) {
            throw 1BK.A0s(1BJ.A00(HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_HEIGHT), e);
        }
    }
}
