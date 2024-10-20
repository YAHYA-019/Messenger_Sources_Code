package X;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: X.0jE, reason: invalid class name */
/* loaded from: 0jE.class */
public final class C0jE extends FilterInputStream {
    public int A00;
    public String A01;
    public final 0Gg A02;

    public C0jE(0Gg r302, InputStream inputStream) {
        super(inputStream);
        this.A02 = r302;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        String str = this.A01;
        if (str == null || this.A00 >= str.length()) {
            StringBuilder A0k = AnonymousClass001.A0k();
            int i = 0;
            while (i != -1 && A0k.length() < 5000) {
                i = super.read();
                if (i == -1) {
                    break;
                }
                A0k.append((char) i);
                if (i == 10) {
                    break;
                }
            }
            String obj = A0k.toString();
            this.A01 = obj;
            if (obj.length() == 0) {
                str = null;
            } else {
                this.A00 = 0;
                str = this.A02.A00(obj);
            }
            this.A01 = str;
        }
        if (str == null) {
            return -1;
        }
        int i2 = this.A00;
        this.A00 = i2 + 1;
        return str.charAt(i2);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int read;
        bArr.getClass();
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            i3 = 0;
        } else {
            int read2 = read();
            i3 = -1;
            if (read2 != -1) {
                bArr[i] = (byte) read2;
                int i5 = 1;
                while (true) {
                    i4 = i5;
                    if (i4 >= i2 || (read = read()) == -1) {
                        break;
                    }
                    bArr[i + i4] = (byte) read;
                    i5 = i4 + 1;
                }
                return i4;
            }
        }
        return i3;
    }
}
