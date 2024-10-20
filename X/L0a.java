package X;

import android.content.Context;
import android.util.LruCache;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: L0a.class */
public final class L0a {
    public static final C03y A05 = new C03v(2);
    public final Context A00;
    public final int[] A03;
    public final int[] A04;
    public final LruCache A02 = new LruCache(16);
    public final LruCache A01 = new Q0R(this);

    /* JADX WARN: Multi-variable type inference failed */
    public L0a(Context context) {
        int[][] iArr;
        int[] iArr2;
        InputStream open;
        RuntimeException A0T;
        Context applicationContext = context.getApplicationContext();
        this.A00 = applicationContext;
        try {
            open = applicationContext.getResources().getAssets().open("igic.bin");
            try {
            } finally {
            }
        } catch (IOException unused) {
            iArr = null;
        }
        if (open.available() >= 4) {
            byte[] bArr = new byte[4];
            if (open.read(bArr, 0, 4) == 4) {
                ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, 4);
                int i = wrap.getChar();
                int i2 = wrap.getChar();
                int i3 = i * 4;
                int i4 = i2 * 2;
                byte[] bArr2 = new byte[Math.max(i3, i4)];
                if (open.read(bArr2, 0, i3) == i3) {
                    ByteBuffer wrap2 = ByteBuffer.wrap(bArr2, 0, i3);
                    int[] iArr3 = new int[i];
                    wrap2.asIntBuffer().get(iArr3);
                    if (open.read(bArr2, 0, i4) == i4) {
                        ByteBuffer wrap3 = ByteBuffer.wrap(bArr2, 0, i4);
                        char[] cArr = new char[i2];
                        wrap3.asCharBuffer().get(cArr);
                        int[] iArr4 = new int[i2 + 1];
                        int i5 = i3 + 4 + i4;
                        int i6 = 0;
                        while (true) {
                            int i7 = i6;
                            if (i7 >= i2) {
                                break;
                            }
                            char c = cArr[i7];
                            if ((c & 32768) != 0) {
                                iArr4[i7] = (c ^ 32768) | ((-1) << (-1));
                            } else {
                                iArr4[i7] = i5;
                                i5 += c;
                            }
                            i6 = i7 + 1;
                        }
                        iArr4[i2] = i5;
                        iArr = new int[]{iArr3, iArr4};
                        open.close();
                        if (iArr == null) {
                            iArr2 = new int[0];
                            this.A04 = iArr2;
                        } else {
                            this.A04 = iArr[0];
                            iArr2 = iArr[1];
                        }
                        this.A03 = iArr2;
                        return;
                    }
                    A0T = AnonymousClass001.A0T("Unable to read icon length data");
                } else {
                    A0T = AnonymousClass001.A0T("Unable to read hashes");
                }
            } else {
                A0T = AnonymousClass001.A0T("Unable to read icon counts");
            }
        } else {
            A0T = AnonymousClass001.A0T("Invalid icon file");
        }
        throw A0T;
    }
}
