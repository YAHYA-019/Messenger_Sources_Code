package X;

import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* loaded from: I8h.class */
public final class I8h {
    public static final Charset A04;
    public static final byte[] A06;
    public static final Hef[][] A0A;
    public static final HashMap A0B;
    public static final HashSet A0C;
    public static final Hef[] A0D;
    public static final Hef[] A0E;
    public static final Hef[] A0F;
    public static final HashMap[] A0G;
    public int A00;
    public ByteOrder A01;
    public final HashMap[] A02 = new HashMap[3];
    public final Set A03 = new HashSet(3);
    public static final byte[] A07 = {-1, -40, -1};
    public static final String[] A09 = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};
    public static final int[] A08 = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] A05 = {65, 83, 67, 73, 73, 0, 0, 0};

    /* JADX WARN: Type inference failed for: r0v61, types: [X.Hef[], X.Hef[][]] */
    static {
        Hef[] hefArr = {new Hef("Orientation", 274, 3), new Hef("SubIFDPointer", 330, 4), new Hef("ExifIFDPointer", 34665, 4)};
        A0F = hefArr;
        Hef[] hefArr2 = {new Hef("ExposureTime", 33434, 5), new Hef("PhotographicSensitivity", 34855, 3), new Hef("ShutterSpeedValue", 37377, 10), new Hef("ApertureValue", 37378, 5), new Hef("FocalLength", 37386, 5), new Hef("WhiteBalance", 41987, 3), new Hef("DigitalZoomRatio", 41988, 5), new Hef("FocalLengthIn35mmFilm", 41989, 3)};
        A0E = hefArr2;
        A0A = new Hef[]{hefArr, hefArr2, hefArr};
        A0D = new Hef[]{new Hef("SubIFDPointer", 330, 4), new Hef("ExifIFDPointer", 34665, 4)};
        A0G = new HashMap[3];
        A0C = AbF.A1E(Arrays.asList("DigitalZoomRatio", "ExposureTime"));
        A0B = AnonymousClass001.A0u();
        Charset forName = Charset.forName("US-ASCII");
        A04 = forName;
        A06 = "Exif����".getBytes(forName);
        int i = 0;
        while (true) {
            Hef[][] hefArr3 = A0A;
            if (i >= 3) {
                AnonymousClass001.A1A(Integer.valueOf(A0D[1].A00), A0B, 1);
                return;
            }
            HashMap[] hashMapArr = A0G;
            hashMapArr[i] = AnonymousClass001.A0u();
            for (Hef hef : hefArr3[i]) {
                hashMapArr[i].put(Integer.valueOf(hef.A00), hef);
            }
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x02c3, code lost:
    
        r304 = X.AnonymousClass001.A0G(X.0Pz.A0T("Invalid first Ifd offset: ", r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public I8h(java.io.InputStream r302) {
        /*
            Method dump skipped, instructions count: 833
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I8h.<init>(java.io.InputStream):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00fc, code lost:
    
        if (r313 == r308) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0309, code lost:
    
        if (r302.A00 != r0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0107, code lost:
    
        if (r313 == 7) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0275  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A00(X.Int r302, int r303) {
        /*
            Method dump skipped, instructions count: 789
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I8h.A00(X.Int, int):void");
    }

    public double A01(String str) {
        Throwable th;
        int i = 0;
        do {
            I8D i8d = (I8D) this.A02[i].get(str);
            if (i8d != null) {
                try {
                    Object A00 = I8D.A00(i8d, this.A01);
                    if (A00 == null) {
                        new NumberFormatException("NULL can't be converted to a double value");
                    } else {
                        if (A00 instanceof String) {
                            return Double.parseDouble((String) A00);
                        }
                        if (A00 instanceof long[]) {
                            if (((long[]) A00).length == 1) {
                                return r0[0];
                            }
                            new NumberFormatException("There are more than one component");
                        } else if (A00 instanceof int[]) {
                            if (((int[]) A00).length == 1) {
                                return r0[0];
                            }
                            new NumberFormatException("There are more than one component");
                        } else if (A00 instanceof double[]) {
                            double[] dArr = (double[]) A00;
                            if (dArr.length == 1) {
                                return dArr[0];
                            }
                            new NumberFormatException("There are more than one component");
                        } else if (A00 instanceof Hnu[]) {
                            Hnu[] hnuArr = (Hnu[]) A00;
                            if (hnuArr.length == 1) {
                                Hnu hnu = hnuArr[0];
                                return hnu.A01 / hnu.A00;
                            }
                            new NumberFormatException("There are more than one component");
                        } else {
                            new NumberFormatException("Couldn't find a double value");
                        }
                    }
                    throw th;
                } catch (NumberFormatException unused) {
                    return -1.0d;
                }
            }
            i++;
        } while (i < 3);
        return -1.0d;
    }

    public int A02(String str) {
        Throwable th;
        int i = 0;
        do {
            I8D i8d = (I8D) this.A02[i].get(str);
            if (i8d != null) {
                try {
                    Object A00 = I8D.A00(i8d, this.A01);
                    if (A00 == null) {
                        new NumberFormatException("NULL can't be converted to a integer value");
                    } else {
                        if (A00 instanceof String) {
                            return Integer.parseInt((String) A00);
                        }
                        if (A00 instanceof long[]) {
                            long[] jArr = (long[]) A00;
                            if (jArr.length == 1) {
                                return (int) jArr[0];
                            }
                            new NumberFormatException("There are more than one component");
                        } else if (A00 instanceof int[]) {
                            int[] iArr = (int[]) A00;
                            if (iArr.length == 1) {
                                return iArr[0];
                            }
                            new NumberFormatException("There are more than one component");
                        } else {
                            new NumberFormatException("Couldn't find a integer value");
                        }
                    }
                    throw th;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }
            i++;
        } while (i < 3);
        return -1;
    }
}
