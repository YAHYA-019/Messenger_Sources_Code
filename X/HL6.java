package X;

import android.graphics.ImageFormat;
import java.nio.ByteBuffer;

/* loaded from: HL6.class */
public abstract class HL6 {
    public static final RPC A00(RPC rpc) {
        Rlw[] rlwArr = rpc.A0C;
        int i = rpc.A01;
        if (i == 35 && rlwArr != null) {
            ByteBuffer byteBuffer = rlwArr[0].A02;
            ByteBuffer byteBuffer2 = rlwArr[2].A02;
            int remaining = byteBuffer.remaining();
            int remaining2 = byteBuffer2.remaining();
            byte[] bArr = new byte[remaining + remaining2];
            byteBuffer.get(bArr, 0, remaining);
            byteBuffer2.get(bArr, remaining, remaining2);
            return new RPC(rpc.A05, rpc.A06, rpc.A08, rpc.A07, bArr, rpc.A0B, rlwArr, 17, rpc.A03, rpc.A00, rpc.A02, rpc.A04, rpc.A09);
        }
        byte[] bArr2 = rpc.A0A;
        if (bArr2 == null) {
            if (rlwArr == null || rlwArr.length != 3) {
                bArr2 = null;
            } else {
                int i2 = rpc.A03;
                int i3 = rpc.A00;
                Rlw rlw = rlwArr[0];
                Rlw rlw2 = rlwArr[1];
                Rlw rlw3 = rlwArr[2];
                11T.A0D(rlw);
                11T.A0D(rlw2);
                11T.A0D(rlw3);
                Rlw rlw4 = rlw;
                ByteBuffer byteBuffer3 = rlw4.A02;
                Rlw rlw5 = rlw2;
                ByteBuffer byteBuffer4 = rlw5.A02;
                Rlw rlw6 = rlw3;
                ByteBuffer byteBuffer5 = rlw6.A02;
                int bitsPerPixel = ImageFormat.getBitsPerPixel(i);
                int i4 = bitsPerPixel / 8;
                int i5 = i2 * i3;
                bArr2 = new byte[(bitsPerPixel * i5) / 8];
                int i6 = rlw5.A01;
                byte[] bArr3 = new byte[i6];
                byte[] bArr4 = new byte[rlw6.A01];
                int i7 = i5 * i4;
                int i8 = i7 / 4;
                int i9 = 0;
                for (int i10 = 0; i10 < i3; i10++) {
                    int i11 = i4 * i2;
                    byteBuffer3.get(bArr2, i9, i11);
                    if (i3 - i10 != 1) {
                        byteBuffer3.position((byteBuffer3.position() + rlw4.A01) - i11);
                    }
                    i9 += i11;
                    int i12 = i3 / 2;
                    if (i10 < i12) {
                        int i13 = i12 - i10 == 1 ? ((i2 / 2) - rlw5.A00) + 1 : i6;
                        byteBuffer4.get(bArr3, 0, i13);
                        byteBuffer5.get(bArr4, 0, i13);
                        int i14 = i2 / 2;
                        for (int i15 = 0; i15 < i14; i15++) {
                            int i16 = (i10 * i2) / 2;
                            bArr2[i7 + i16 + i15] = bArr3[rlw5.A00 * i15];
                            bArr2[i7 + i8 + i16 + i15] = bArr4[rlw6.A00 * i15];
                        }
                    }
                }
            }
        }
        return new RPC(rpc.A05, rpc.A06, rpc.A08, rpc.A07, bArr2, rpc.A0B, rlwArr, i, rpc.A03, rpc.A00, rpc.A02, rpc.A04, rpc.A09);
    }
}
