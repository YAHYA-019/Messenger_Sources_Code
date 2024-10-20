package X;

import com.google.common.base.Preconditions;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayDeque;
import java.util.Arrays;

/* renamed from: X.4dj, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4dj.class */
public final class C05344dj extends AbstractC05354dk {
    public final File A00;

    public C05344dj(File file) {
        file.getClass();
        this.A00 = file;
    }

    public static byte[] A00(File file) {
        C05364dl c05364dl = new C05364dl(C05364dl.A03);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            c05364dl.A00(fileInputStream);
            long size = fileInputStream.getChannel().size();
            boolean z = false;
            if (size >= 0) {
                z = true;
            }
            Preconditions.checkArgument(z, "expectedSize (%s) must be non-negative", size);
            if (size > 2147483639) {
                throw new OutOfMemoryError(0Pz.A0I(size, " bytes is too large to fit in a byte array"));
            }
            int i = (int) size;
            byte[] bArr = new byte[i];
            int i2 = i;
            while (true) {
                int i3 = i2;
                if (i3 > 0) {
                    int i4 = i - i3;
                    int read = fileInputStream.read(bArr, i4, i3);
                    if (read == -1) {
                        bArr = Arrays.copyOf(bArr, i4);
                        break;
                    }
                    i2 = i3 - read;
                } else {
                    int read2 = fileInputStream.read();
                    if (read2 != -1) {
                        ArrayDeque arrayDeque = new ArrayDeque(22);
                        arrayDeque.add(bArr);
                        byte[] bArr2 = new byte[1];
                        bArr2[0] = (byte) read2;
                        arrayDeque.add(bArr2);
                        bArr = 1SB.A01(fileInputStream, arrayDeque, i + 1);
                    }
                }
            }
            c05364dl.close();
            return bArr;
        } catch (Throwable th) {
            try {
                c05364dl.A01(th);
                throw 0Q8.createAndThrow();
            } catch (Throwable th2) {
                c05364dl.close();
                throw th2;
            }
        }
    }

    public byte[] A03() {
        C05364dl c05364dl = new C05364dl(C05364dl.A03);
        try {
            FileInputStream fileInputStream = new FileInputStream(this.A00);
            c05364dl.A00(fileInputStream);
            long size = fileInputStream.getChannel().size();
            boolean z = false;
            if (size >= 0) {
                z = true;
            }
            Preconditions.checkArgument(z, "expectedSize (%s) must be non-negative", size);
            if (size > 2147483639) {
                throw new OutOfMemoryError(0Pz.A0I(size, " bytes is too large to fit in a byte array"));
            }
            int i = (int) size;
            byte[] bArr = new byte[i];
            int i2 = i;
            while (true) {
                int i3 = i2;
                if (i3 > 0) {
                    int i4 = i - i3;
                    int read = fileInputStream.read(bArr, i4, i3);
                    if (read == -1) {
                        bArr = Arrays.copyOf(bArr, i4);
                        break;
                    }
                    i2 = i3 - read;
                } else {
                    int read2 = fileInputStream.read();
                    if (read2 != -1) {
                        ArrayDeque arrayDeque = new ArrayDeque(22);
                        arrayDeque.add(bArr);
                        byte[] bArr2 = new byte[1];
                        bArr2[0] = (byte) read2;
                        arrayDeque.add(bArr2);
                        bArr = 1SB.A01(fileInputStream, arrayDeque, i + 1);
                    }
                }
            }
            c05364dl.close();
            return bArr;
        } catch (Throwable th) {
            try {
                c05364dl.A01(th);
                throw 0Q8.createAndThrow();
            } catch (Throwable th2) {
                c05364dl.close();
                throw th2;
            }
        }
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Files.asByteSource(");
        A0k.append(this.A00);
        return AnonymousClass001.A0d(")", A0k);
    }
}
