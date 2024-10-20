package X;

import java.nio.ByteBuffer;

/* renamed from: X.3Wp, reason: invalid class name */
/* loaded from: 3Wp.class */
public final class C3Wp implements 4dR {
    public 2EU A00;
    public final int A01;
    public final C01s A02;

    public C3Wp(C01s c01s, 2EU r303, int i) {
        int i2 = i;
        this.A02 = c01s;
        int i3 = 24;
        if (i == 0) {
            c01s.D0v("FbAdImageWithHeaderPooledByteBuffer", "This byte buffer should not be used for anything other than parsing image PooledByteBuffer with <fp></fp> fingerprint format.");
            i2 = 0;
        } else {
            2EU A07 = r303.A07();
            i3 = 24 >= i ? i : i3;
            String str = "";
            String str2 = str;
            boolean z = false;
            int i4 = 0;
            do {
                int i5 = i4 + i3;
                if (i5 > i2) {
                    break;
                }
                byte[] bArr = new byte[i3];
                ((4dR) A07.A09()).read(i4, bArr, 0, i3);
                String str3 = new String(bArr);
                if (i4 == 0 && !str3.contains("<fp>")) {
                    break;
                }
                String replace = str3.replace("<fp>", str);
                int indexOf = replace.indexOf(62);
                if (indexOf != -1) {
                    int length = replace.length();
                    replace = length > indexOf + 1 ? replace.substring(0, length - ((length - indexOf) - 1)) : replace;
                    z = true;
                }
                str2 = str2.concat(replace);
                i4 = i5;
            } while (!z);
            str = str2.replace("</fp>", str);
            if (!z || str == null) {
                this.A02.D0v("FbAdImageWithHeaderPooledByteBuffer", "This byte buffer should not be used for anything other than parsing image PooledByteBuffer with <fp></fp> fingerprint format.");
            }
            int length2 = "<fp>".length() + str.length() + "</fp>".length();
            i2 = i - length2;
            byte[] bArr2 = new byte[i2];
            ((4dR) A07.A09()).read(length2, bArr2, 0, i2);
            3eJ r0 = new 3eJ(i2);
            r0.write(0, bArr2, 0, i2);
            this.A00 = 2EU.A02(new 4dQ(2EU.A01(2EU.A05, new RnA(this), r0), i2));
            A07.close();
        }
        this.A01 = i2;
    }

    public static 4dQ A00(C3Wp c3Wp) {
        4dQ r0;
        synchronized (c3Wp) {
            if (c3Wp.A00 == null || (!2EU.A06(r0))) {
                throw new RuntimeException() { // from class: X.7ws
                };
            }
            r0 = (4dQ) c3Wp.A00.A09();
        }
        return r0;
    }

    public void close() {
        2EU.A04(this.A00);
        this.A00 = null;
    }

    public ByteBuffer getByteBuffer() {
        2EU r0 = this.A00;
        if (r0 == null) {
            return null;
        }
        return ((4dQ) r0.A09()).getByteBuffer();
    }

    public long getNativePtr() {
        return A00(this).getNativePtr();
    }

    public boolean isClosed() {
        return !2EU.A06(this.A00);
    }

    public byte read(int i) {
        return A00(this).read(i);
    }

    public int read(int i, byte[] bArr, int i2, int i3) {
        return A00(this).read(i, bArr, i2, i3);
    }

    public int size() {
        A00(this);
        return this.A01;
    }
}
