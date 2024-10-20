package X;

import com.facebook.common.dextricks.DexStore;
import com.facebook.common.dextricks.LogcatReader;
import com.mapbox.mapboxsdk.location.LocationComponentCompassEngine;

/* renamed from: X.42j, reason: invalid class name */
/* loaded from: 42j.class */
public final class C42j {
    public static final String A01 = String.valueOf(Long.MIN_VALUE).substring(1);
    public static final String A00 = String.valueOf(Long.MAX_VALUE);

    public static double A00(String str) {
        if ("2.2250738585072012e-308".equals(str)) {
            return Double.MIN_VALUE;
        }
        return Double.parseDouble(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00fc, code lost:
    
        if (r0 > 9) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A01(java.lang.String r301) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42j.A01(java.lang.String):int");
    }

    public static int A02(String str, int i) {
        if (str != null) {
            String trim = str.trim();
            int length = trim.length();
            if (length != 0) {
                int i2 = 0;
                char charAt = trim.charAt(0);
                if (charAt == '+') {
                    trim = trim.substring(1);
                    length = trim.length();
                } else if (charAt == '-') {
                    i2 = 1;
                }
                while (i2 < length) {
                    try {
                        char charAt2 = trim.charAt(i2);
                        if (charAt2 > '9' || charAt2 < '0') {
                            return (int) A00(trim);
                        }
                        i2++;
                    } catch (NumberFormatException unused) {
                        return i;
                    }
                }
                return Integer.parseInt(trim);
            }
        }
        return i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0011. Please report as an issue. */
    public static int A03(char[] cArr, int i, int i2) {
        int i3 = cArr[(i + i2) - 1] - '0';
        switch (i2) {
            case 2:
                return i3 + ((cArr[i] - '0') * 10);
            case 3:
                i3 += (cArr[i] - '0') * 100;
                i++;
                return i3 + ((cArr[i] - '0') * 10);
            case 4:
                i3 += (cArr[i] - '0') * 1000;
                i++;
                i3 += (cArr[i] - '0') * 100;
                i++;
                return i3 + ((cArr[i] - '0') * 10);
            case 5:
                i3 += (cArr[i] - '0') * LogcatReader.DEFAULT_WAIT_TIME;
                i++;
                i3 += (cArr[i] - '0') * 1000;
                i++;
                i3 += (cArr[i] - '0') * 100;
                i++;
                return i3 + ((cArr[i] - '0') * 10);
            case 6:
                i3 += (cArr[i] - '0') * LocationComponentCompassEngine.SENSOR_DELAY_MICROS;
                i++;
                i3 += (cArr[i] - '0') * LogcatReader.DEFAULT_WAIT_TIME;
                i++;
                i3 += (cArr[i] - '0') * 1000;
                i++;
                i3 += (cArr[i] - '0') * 100;
                i++;
                return i3 + ((cArr[i] - '0') * 10);
            case 7:
                i3 += (cArr[i] - '0') * DexStore.MS_IN_NS;
                i++;
                i3 += (cArr[i] - '0') * LocationComponentCompassEngine.SENSOR_DELAY_MICROS;
                i++;
                i3 += (cArr[i] - '0') * LogcatReader.DEFAULT_WAIT_TIME;
                i++;
                i3 += (cArr[i] - '0') * 1000;
                i++;
                i3 += (cArr[i] - '0') * 100;
                i++;
                return i3 + ((cArr[i] - '0') * 10);
            case 8:
                i3 += (cArr[i] - '0') * 10000000;
                i++;
                i3 += (cArr[i] - '0') * DexStore.MS_IN_NS;
                i++;
                i3 += (cArr[i] - '0') * LocationComponentCompassEngine.SENSOR_DELAY_MICROS;
                i++;
                i3 += (cArr[i] - '0') * LogcatReader.DEFAULT_WAIT_TIME;
                i++;
                i3 += (cArr[i] - '0') * 1000;
                i++;
                i3 += (cArr[i] - '0') * 100;
                i++;
                return i3 + ((cArr[i] - '0') * 10);
            case 9:
                i3 += (cArr[i] - '0') * 100000000;
                i++;
                i3 += (cArr[i] - '0') * 10000000;
                i++;
                i3 += (cArr[i] - '0') * DexStore.MS_IN_NS;
                i++;
                i3 += (cArr[i] - '0') * LocationComponentCompassEngine.SENSOR_DELAY_MICROS;
                i++;
                i3 += (cArr[i] - '0') * LogcatReader.DEFAULT_WAIT_TIME;
                i++;
                i3 += (cArr[i] - '0') * 1000;
                i++;
                i3 += (cArr[i] - '0') * 100;
                i++;
                return i3 + ((cArr[i] - '0') * 10);
            default:
                return i3;
        }
    }

    public static long A04(String str) {
        return str.length() <= 9 ? A01(str) : Long.parseLong(str);
    }

    public static long A05(String str, long j) {
        if (str != null) {
            String trim = str.trim();
            int length = trim.length();
            if (length != 0) {
                int i = 0;
                char charAt = trim.charAt(0);
                if (charAt == '+') {
                    trim = trim.substring(1);
                    length = trim.length();
                } else if (charAt == '-') {
                    i = 1;
                }
                while (i < length) {
                    try {
                        char charAt2 = trim.charAt(i);
                        if (charAt2 > '9' || charAt2 < '0') {
                            return (long) A00(trim);
                        }
                        i++;
                    } catch (NumberFormatException unused) {
                        return j;
                    }
                }
                return Long.parseLong(trim);
            }
        }
        return j;
    }

    public static long A06(char[] cArr, int i, int i2) {
        int i3 = i2 - 9;
        return (A03(cArr, i, i3) * 1000000000) + A03(cArr, i + i3, 9);
    }
}
