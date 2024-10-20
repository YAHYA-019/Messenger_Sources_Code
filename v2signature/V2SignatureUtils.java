package v2signature;

import X.0Pz;
import X.AnonymousClass001;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: V2SignatureUtils.class */
public class V2SignatureUtils {

    /* loaded from: V2SignatureUtils$ZipSections.class */
    public class ZipSections {
        public final long A00;
        public final long A01;
        public final long A02;
        public final ByteBuffer A03;

        public ZipSections(ByteBuffer byteBuffer, long j, long j2, long j3) {
            this.A00 = j;
            this.A01 = j2;
            this.A02 = j3;
            this.A03 = byteBuffer;
        }
    }

    public static ByteBuffer A00(RandomAccessFile randomAccessFile, int i, long j) {
        long length = randomAccessFile.length();
        if (j < 0 || j >= length) {
            throw AnonymousClass001.A0L(AnonymousClass001.A0h(AnonymousClass001.A0n("offset: "), j));
        }
        if (i >= 0) {
            long j2 = i;
            if (j2 <= length) {
                if (j2 + j <= length) {
                    byte[] bArr = new byte[i];
                    randomAccessFile.seek(j);
                    randomAccessFile.read(bArr, 0, i);
                    return ByteBuffer.wrap(bArr);
                }
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("Exceed the boundary of file, offset : ");
                A0k.append(j);
                A0k.append(", length: ");
                A0k.append(i);
                A0k.append(", file size: ");
                throw AnonymousClass001.A0L(AnonymousClass001.A0h(A0k, length));
            }
        }
        throw 0Pz.A04("length: ", i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:
    
        if (r307 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static v2signature.V2SignatureUtils.ZipSections A01(java.io.RandomAccessFile r301) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v2signature.V2SignatureUtils.A01(java.io.RandomAccessFile):v2signature.V2SignatureUtils$ZipSections");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r306v0 */
    /* JADX WARN: Type inference failed for: r306v1 */
    /* JADX WARN: Type inference failed for: r306v2, types: [java.lang.Object, v2signature.ZipSection] */
    public static ZipSection A02(RandomAccessFile randomAccessFile, int i) {
        char c = (char) (-1);
        long length = randomAccessFile.length();
        ZipSection zipSection = 0;
        long j = 22;
        if (length >= j) {
            int min = ((int) Math.min(i, length - j)) + 22;
            long j2 = length - min;
            ByteBuffer A00 = A00(randomAccessFile, min, j2);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            A00.order(byteOrder);
            A04(A00);
            int capacity = A00.capacity();
            if (capacity >= 22) {
                int i2 = capacity - 22;
                int min2 = Math.min(i2, (int) c);
                int i3 = 0;
                while (true) {
                    if (i3 > min2) {
                        break;
                    }
                    int i4 = i2 - i3;
                    if (A00.getInt(i4) != 101010256 || (A00.getShort(i4 + 20) & c) != i3) {
                        i3++;
                    } else if (i4 != -1) {
                        A00.position(i4);
                        ByteBuffer slice = A00.slice();
                        slice.order(byteOrder);
                        zipSection = new Object();
                        zipSection.A01 = slice;
                        zipSection.A00 = j2 + i4;
                    }
                }
            }
        }
        return zipSection;
    }

    /* JADX WARN: Type inference failed for: r0v104, types: [java.lang.Object, v2signature.ZipSection] */
    public static ZipSection A03(RandomAccessFile randomAccessFile, ZipSections zipSections) {
        long j = zipSections.A00;
        long j2 = zipSections.A01 + j;
        long j3 = zipSections.A02;
        if (j2 != j3) {
            throw new Exception(0Pz.A0i("ZIP Central Directory is not immediately followed by End of Central Directory. CD end: ", ", EoCD start: ", j2, j3));
        }
        if (j < 32) {
            throw new Exception(AnonymousClass001.A0h(AnonymousClass001.A0n("APK too small for APK Signing Block. ZIP Central Directory offset: "), j));
        }
        ByteBuffer A00 = A00(randomAccessFile, 24, j - 24);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        A00.order(byteOrder);
        if (A00.getLong(8) != 2334950737559900225L || A00.getLong(16) != 3617552046287187010L) {
            throw new Exception("No APK Signing Block before ZIP Central Directory");
        }
        long j4 = A00.getLong(0);
        if (j4 < A00.capacity() || j4 > 2147483639) {
            throw new Exception(AnonymousClass001.A0h(AnonymousClass001.A0n("APK Signing Block size out of range: "), j4));
        }
        int i = (int) (8 + j4);
        long j5 = j - i;
        if (j5 < 0) {
            throw new Exception(AnonymousClass001.A0h(AnonymousClass001.A0n("APK Signing Block offset out of range: "), j5));
        }
        ByteBuffer A002 = A00(randomAccessFile, 8, j5);
        A002.order(byteOrder);
        long j6 = A002.getLong(0);
        if (j6 != j4) {
            throw new Exception(0Pz.A0i("APK Signing Block sizes in header and footer do not match: ", " vs ", j6, j4));
        }
        ByteBuffer A003 = A00(randomAccessFile, i, j5);
        ?? obj = new Object();
        obj.A01 = A003;
        obj.A00 = j5;
        return obj;
    }

    public static void A04(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw AnonymousClass001.A0L("ByteBuffer byte order must be little endian");
        }
    }

    public static boolean A05(String str) {
        try {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
                try {
                    try {
                        A06(A03(randomAccessFile, A01(randomAccessFile)), 1896449818);
                        try {
                            randomAccessFile.close();
                        } catch (IOException unused) {
                        }
                        return true;
                    } catch (Throwable th) {
                        th = th;
                        try {
                            randomAccessFile.close();
                            throw th;
                        } catch (IOException unused2) {
                            throw th;
                        }
                    }
                } catch (IOException | V2SignatureNotFoundException | V2TargetIDNotFoundException | ZipFormatException unused3) {
                    randomAccessFile.close();
                    return false;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException | V2SignatureNotFoundException | V2TargetIDNotFoundException | ZipFormatException unused4) {
            return false;
        }
    }

    public static byte[] A06(ZipSection zipSection, int i) {
        ByteBuffer byteBuffer = zipSection.A01;
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        byteBuffer.order(byteOrder);
        byteBuffer.position(8);
        byteBuffer.limit(byteBuffer.capacity() - 24);
        ByteBuffer slice = byteBuffer.slice();
        slice.order(byteOrder);
        int i2 = 0;
        while (slice.hasRemaining()) {
            i2++;
            if (slice.remaining() < 8) {
                break;
            }
            long j = slice.getLong();
            if (j < 4 || j > 2147483647L) {
                throw new Exception(0Pz.A0e("APK Signing Block entry #", " size out of range: ", i2, j));
            }
            int i3 = (int) j;
            int position = slice.position() + i3;
            if (i3 > slice.remaining()) {
                throw new Exception(0Pz.A0q("APK Signing Block entry #", " size out of range: ", ", available: ", i2, i3, slice.remaining()));
            }
            if (slice.getInt() == i) {
                slice.limit(Math.min((slice.position() + i3) - 4, slice.capacity()));
                ByteBuffer slice2 = slice.slice();
                int capacity = slice2.capacity();
                int i4 = 0;
                while (true) {
                    if (i4 >= slice2.capacity()) {
                        break;
                    }
                    if (slice2.get(i4) == 0) {
                        capacity = i4;
                        break;
                    }
                    i4++;
                }
                byte[] bArr = new byte[capacity];
                for (int i5 = 0; i5 < capacity; i5++) {
                    bArr[i5] = slice2.get(i5);
                }
                return bArr;
            }
            slice.position(position);
        }
        throw new Exception(0Pz.A0d("ID ", "not found", i));
    }
}
