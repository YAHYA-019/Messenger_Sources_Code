package X;

import java.io.EOFException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.util.Arrays;

/* loaded from: Lix.class */
public class Lix implements Comparable, Serializable {
    public static final long serialVersionUID = 1;
    public transient int A00;
    public transient String A01;
    public final byte[] data;
    public static final char[] A03 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final Lix A02 = A04(new byte[0]);

    public Lix(byte[] bArr) {
        this.data = bArr;
    }

    public static int A00(char c) {
        char c2;
        if (c >= '0') {
            if (c <= '9') {
                return c - '0';
            }
            char c3 = 'a';
            if (c >= 'a') {
                c2 = 'f';
            } else {
                c3 = 'A';
                if (c >= 'A') {
                    c2 = 'F';
                }
            }
            if (c <= c2) {
                return (c - c3) + 10;
            }
        }
        throw AnonymousClass001.A0L(0Pz.A0J("Unexpected hex digit: ", c));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0103 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.Lix A01(java.lang.String r301) {
        /*
            Method dump skipped, instructions count: 596
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Lix.A01(java.lang.String):X.Lix");
    }

    public static Lix A02(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw 0Pz.A05("Unexpected hex string: ", str);
        }
        int i = length / 2;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= i) {
                return A04(bArr);
            }
            int i4 = i3 * 2;
            bArr[i3] = (byte) ((A00(str.charAt(i4)) << 4) + A00(str.charAt(i4 + 1)));
            i2 = i3 + 1;
        }
    }

    public static Lix A03(String str) {
        if (str == null) {
            throw AnonymousClass001.A0L("s == null");
        }
        Lix lix = new Lix(str.getBytes(Ky2.A00));
        lix.A01 = str;
        return lix;
    }

    public static Lix A04(byte... bArr) {
        if (bArr != null) {
            return new Lix((byte[]) bArr.clone());
        }
        throw AnonymousClass001.A0L("data == null");
    }

    private Lix A0A() {
        if (this instanceof MAV) {
            return new Lix(A0F()).A0A();
        }
        byte[] bArr = this.data;
        int length = bArr.length;
        if (64 > length) {
            throw 0Pz.A06("endIndex > length(", ")", length);
        }
        if (64 == length) {
            return this;
        }
        byte[] bArr2 = new byte[64];
        System.arraycopy(bArr, 0, bArr2, 0, 64);
        return new Lix(bArr2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00dd, code lost:
    
        r303 = r303 + r0;
        r304 = r304 + r0;
        r305 = r305 - r0;
        r311 = r311 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0E(byte[] r302, int r303, int r304, int r305) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Lix.A0E(byte[], int, int, int):boolean");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            throw 0Pz.A04("byteCount < 0: ", readInt);
        }
        byte[] bArr = new byte[readInt];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= readInt) {
                try {
                    Field declaredField = Lix.class.getDeclaredField("data");
                    declaredField.setAccessible(true);
                    declaredField.set(this, bArr);
                    return;
                } catch (IllegalAccessException unused) {
                    throw JQx.A0m();
                } catch (NoSuchFieldException unused2) {
                    throw JQx.A0m();
                }
            }
            int read = objectInputStream.read(bArr, i2, readInt - i2);
            if (read == -1) {
                throw new EOFException();
            }
            i = i2 + read;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }

    public byte A05(int i) {
        byte[] bArr;
        if (this instanceof MAV) {
            MAV mav = (MAV) this;
            int[] iArr = mav.A00;
            byte[][] bArr2 = mav.A01;
            int length = bArr2.length;
            Ky2.A00(iArr[length - 1], i, 1L);
            int binarySearch = Arrays.binarySearch(iArr, 0, length, i + 1);
            if (binarySearch < 0) {
                binarySearch ^= -1;
            }
            int i2 = binarySearch == 0 ? 0 : iArr[binarySearch - 1];
            int i3 = iArr[length + binarySearch];
            bArr = bArr2[binarySearch];
            i = (i - i2) + i3;
        } else {
            bArr = this.data;
        }
        return bArr[i];
    }

    public int A06() {
        if (!(this instanceof MAV)) {
            return this.data.length;
        }
        return ((MAV) this).A00[r0.A01.length - 1];
    }

    public String A07() {
        int i;
        byte[] bArr = this.data;
        byte[] bArr2 = KbS.A00;
        int length = bArr.length;
        byte[] bArr3 = new byte[((length + 2) / 3) * 4];
        int i2 = length % 3;
        int i3 = length - i2;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5 += 3) {
            int i6 = i4 + 1;
            bArr3[i4] = bArr2[(bArr[i5] & 255) >> 2];
            int i7 = i6 + 1;
            int i8 = (bArr[i5] & 3) << 4;
            int i9 = i5 + 1;
            bArr3[i6] = bArr2[i8 | ((bArr[i9] & 255) >> 4)];
            int i10 = i7 + 1;
            int i11 = (bArr[i9] & 15) << 2;
            int i12 = i5 + 2;
            bArr3[i7] = bArr2[i11 | ((bArr[i12] & 255) >> 6)];
            i4 = i10 + 1;
            bArr3[i10] = bArr2[bArr[i12] & 63];
        }
        try {
            if (i2 != 1) {
                if (i2 == 2) {
                    int i13 = i4 + 1;
                    bArr3[i4] = bArr2[(bArr[i3] & 255) >> 2];
                    int i14 = i13 + 1;
                    int i15 = (bArr[i3] & 3) << 4;
                    int i16 = i3 + 1;
                    bArr3[i13] = bArr2[((bArr[i16] & 255) >> 4) | i15];
                    i = i14 + 1;
                    bArr3[i14] = bArr2[(bArr[i16] & 15) << 2];
                }
                return new String(bArr3, "US-ASCII");
            }
            int i17 = i4 + 1;
            bArr3[i4] = bArr2[(bArr[i3] & 255) >> 2];
            int i18 = i17 + 1;
            bArr3[i17] = bArr2[(bArr[i3] & 3) << 4];
            i = i18 + 1;
            bArr3[i18] = 61;
            return new String(bArr3, "US-ASCII");
        } catch (UnsupportedEncodingException unused) {
            throw AnonymousClass001.A0J("US-ASCII");
        }
        bArr3[i] = 61;
    }

    public String A08() {
        if (this instanceof MAV) {
            return new Lix(A0F()).A08();
        }
        byte[] bArr = this.data;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = A03;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public String A09() {
        String str;
        if (this instanceof MAV) {
            str = new String(A0F(), Ky2.A00);
        } else {
            str = this.A01;
            if (str == null) {
                String str2 = new String(this.data, Ky2.A00);
                this.A01 = str2;
                return str2;
            }
        }
        return str;
    }

    public Lix A0B() {
        if (this instanceof MAV) {
            return new Lix(A0F()).A0B();
        }
        int i = 0;
        while (true) {
            int i2 = i;
            byte[] bArr = this.data;
            if (i2 >= bArr.length) {
                return this;
            }
            byte b = bArr[i2];
            if (b >= 65 && b <= 90) {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i2] = (byte) (b + 32);
                for (int i3 = i2 + 1; i3 < bArr2.length; i3++) {
                    byte b2 = bArr2[i3];
                    if (b2 >= 65 && b2 <= 90) {
                        bArr2[i3] = (byte) (b2 + 32);
                    }
                }
                return new Lix(bArr2);
            }
            i = i2 + 1;
        }
    }

    public void A0C(LwX lwX) {
        if (!(this instanceof MAV)) {
            byte[] bArr = this.data;
            lwX.A0I(bArr, bArr.length);
            return;
        }
        MAV mav = (MAV) this;
        byte[][] bArr2 = mav.A01;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i >= length) {
                lwX.A00 += i3;
                return;
            }
            int[] iArr = mav.A00;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            L8p l8p = new L8p(bArr2[i], i4, (i4 + i5) - i3);
            L8p l8p2 = lwX.A01;
            if (l8p2 == null) {
                l8p.A03 = l8p;
                l8p.A02 = l8p;
                lwX.A01 = l8p;
            } else {
                l8p2.A03.A03(l8p);
            }
            i++;
            i2 = i5;
        }
    }

    public boolean A0D(Lix lix, int i) {
        boolean A0E;
        if (this instanceof MAV) {
            MAV mav = (MAV) this;
            int i2 = 0;
            int i3 = 0;
            A0E = false;
            if (0 <= mav.A06() - i) {
                int[] iArr = mav.A00;
                byte[][] bArr = mav.A01;
                int length = bArr.length;
                int binarySearch = Arrays.binarySearch(iArr, 0, length, 1);
                if (binarySearch < 0) {
                    binarySearch ^= -1;
                }
                while (i > 0) {
                    int i4 = binarySearch == 0 ? 0 : iArr[binarySearch - 1];
                    int A0D = JQx.A0D((iArr[binarySearch] - i4) + i4, i2, i);
                    if (lix.A0E(bArr[binarySearch], i3, (i2 - i4) + iArr[length + binarySearch], A0D)) {
                        i2 += A0D;
                        i3 += A0D;
                        i -= A0D;
                        binarySearch++;
                    }
                }
                return true;
            }
        } else {
            A0E = lix.A0E(this.data, 0, 0, i);
        }
        return A0E;
    }

    public byte[] A0F() {
        byte[] bArr;
        if (this instanceof MAV) {
            MAV mav = (MAV) this;
            int[] iArr = mav.A00;
            byte[][] bArr2 = mav.A01;
            int length = bArr2.length;
            bArr = new byte[iArr[length - 1]];
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i >= length) {
                    break;
                }
                int i4 = iArr[length + i];
                int i5 = iArr[i];
                System.arraycopy(bArr2[i], i4, bArr, i3, i5 - i3);
                i++;
                i2 = i5;
            }
        } else {
            bArr = (byte[]) this.data.clone();
        }
        return bArr;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Lix lix = (Lix) obj;
        int A06 = A06();
        int A062 = lix.A06();
        int min = Math.min(A06, A062);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= min) {
                if (A06 == A062) {
                    return 0;
                }
                return A06 < A062 ? -1 : 1;
            }
            int A05 = A05(i2) & 255;
            int A052 = lix.A05(i2) & 255;
            if (A05 != A052) {
                return A05 < A052 ? -1 : 1;
            }
            i = i2 + 1;
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof Lix)) {
                return false;
            }
            Lix lix = (Lix) obj;
            int A06 = lix.A06();
            byte[] bArr = this.data;
            int length = bArr.length;
            if (A06 != length || !lix.A0E(bArr, 0, 0, length)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.A00;
        if (i == 0) {
            i = Arrays.hashCode(this.data);
            this.A00 = i;
        }
        return i;
    }

    public String toString() {
        String replace;
        StringBuilder A0k;
        if (this.data.length == 0) {
            return "[size=0]";
        }
        String A09 = A09();
        int length = A09.length();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            if (i2 == 64) {
                break;
            }
            int codePointAt = A09.codePointAt(i);
            if (Character.isISOControl(codePointAt)) {
                if (codePointAt != 10 && codePointAt != 13) {
                    length = -1;
                    break;
                }
                i2++;
                i += Character.charCount(codePointAt);
            } else {
                if (codePointAt == ((char) (-3))) {
                    length = -1;
                    break;
                }
                i2++;
                i += Character.charCount(codePointAt);
            }
        }
        i = length;
        if (i == -1) {
            int length2 = this.data.length;
            if (length2 <= 64) {
                A0k = AnonymousClass001.A0k();
                A0k.append("[hex=");
                replace = A08();
                A0k.append(replace);
                A0k.append("]");
            } else {
                A0k = AnonymousClass001.A0n("[size=");
                A0k.append(length2);
                A0k.append(" hex=");
                replace = A0A().A08();
                A0k.append(replace);
                A0k.append("…]");
            }
        } else {
            replace = A09.substring(0, i).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (i < length) {
                A0k = AnonymousClass001.A0n("[size=");
                A0k.append(this.data.length);
                A0k.append(" text=");
                A0k.append(replace);
                A0k.append("…]");
            } else {
                A0k = AnonymousClass001.A0k();
                A0k.append("[text=");
                A0k.append(replace);
                A0k.append("]");
            }
        }
        return A0k.toString();
    }
}
