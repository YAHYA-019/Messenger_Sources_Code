package com.google.android.exoplayer2.util;

import X.0Pz;
import X.6Yl;
import X.6Zr;
import X.AnonymousClass001;
import X.KLu;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.acra.constants.ActionId;
import com.facebook.forker.Process;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: Util.class */
public abstract class Util {
    public static final int A00;
    public static final String A01;
    public static final String A02;
    public static final String A03;
    public static final String A04;
    public static final Pattern A05;
    public static final Pattern A06;
    public static final byte[] A07;
    public static final int[] A08;
    public static final int[] A09;
    public static final Pattern A0A;
    public static final Pattern A0B;

    static {
        int i = Build.VERSION.SDK_INT;
        A00 = i;
        String str = Build.DEVICE;
        A01 = str;
        String str2 = Build.MANUFACTURER;
        A03 = str2;
        String str3 = Build.MODEL;
        A04 = str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(i);
        A02 = sb.toString();
        A07 = new byte[0];
        A0B = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        A06 = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        A0A = Pattern.compile("%([A-Fa-f0-9]{2})");
        A05 = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        A08 = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        A09 = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, ActionId.MISSED_EVENT, ActionId.RTMP_CONNECTION_INTERCEPTED, ActionId.COMPONENTS_DATA_SOURCE_DID_END_UPDATES, ActionId.HEADER_DATA_LOADED, 108, ActionId.RTMP_PACKET_RECEIVED, 98, ActionId.ON_VIEW_CREATED_END, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, Process.SD_PIPE, Process.SD_STDOUT, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, ActionId.ACTIVITY_START, ActionId.POPULATE_CONSISTENCY_MEMORY_CACHE, ActionId.NOTIFY_SUBSCRIBERS, ActionId.APPLY_FINISHED_LIST, ActionId.MESSENGER_THREAD_LIST_LOADED, ActionId.APP_FIRST_VIEW_CONTROLLER, ActionId.APP_DID_FINISH_LAUNCHING, ActionId.APP_DID_ENTER_BACKGROUND, ActionId.ASYNC_ACTION_FAIL, 175, ActionId.DISPLAYED_ON_SCREEN, ActionId.ASNYC_FAILED, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, ActionId.VIDEO_REQUESTED_PLAYING, 172, ActionId.DISPLAYED, ActionId.ASYNC_FAIL, ActionId.ACTIVITY_RESUME, ActionId.MQTT_CONNECTED, ActionId.MESSENGER_QUEUE_CREATION, ActionId.APP_MAIN, ActionId.FILE_SYSTEM_FAIL, ActionId.FORMAT_ERROR, ActionId.WAIT_FOR_BLOCKERS, ActionId.APPLY_FINISHED_LIST_AGAIN, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, ActionId.NEW_START_FOUND, ActionId.ACTION_BAR_COMPLETE, 97, ActionId.DATA_LOAD_START, ActionId.RTMP_STREAM_PREPARED, ActionId.VIDEO_PLAYING, 125, ActionId.CARD_DATA_LOADED, ActionId.MQTT_DISCONNECTED, ActionId.PREV_ACTIVITY_PAUSE, ActionId.MQTT_CONNECTING, 128, ActionId.PRIVACY_VIOLATION, ActionId.END_START_ACTIVITY, ActionId.FUTURE_LISTENERS_COMPLETE, ActionId.SERVICE_ON_START_COMMAND, 177, 182, 191, 184, 173, ActionId.VIDEO_DISPLAYED, ActionId.ON_ATTACH_FRAGMENT, ActionId.VIEW_DID_APPEAR_BEGIN, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, ActionId.ABORTED, ActionId.RTMP_CONNECTION_RELEASE, ActionId.LEGACY_MARKER, 96, ActionId.RTMP_CONNECTION_CONNECTED, ActionId.CONTROLLER_INITIATED, ActionId.VIEW_WILL_APPEAR_BEGIN, ActionId.VIEW_DID_LOAD_BEGIN, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, ActionId.RTMP_CONNECTION_FAILED, ActionId.TIMEOUT, ActionId.VIDEO_SET_RENDERER_CONTEXT, 127, ActionId.QUERY_READY, ActionId.RTMP_CONNECTION_REQUESTED, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, ActionId.CONNECTIVITY_CHANGED, ActionId.OFFLINE, ActionId.ASYNC_ACTION_SUCCESS, 178, 181, 188, 187, 150, ActionId.BEGIN_START_ACTIVITY, ActionId.APPLY_OPTIMISTICS, ActionId.FAIL_FILE_TOO_LARGE, ActionId.MESSENGER_DELTA_REQUEST, ActionId.MESSENGER_THREAD_LIST_DISPLAYED, ActionId.APP_WILL_ENTER_FOREGROUND, ActionId.APP_DID_BECOME_ACTIVE, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, Process.SD_BLACK_HOLE, 244, 243};
    }

    public static int A00(int i) {
        int i2 = 12;
        if (i == 12) {
            return A00 >= 32 ? 743676 : 0;
        }
        switch (i) {
            case 1:
                i2 = 4;
                break;
            case 2:
                break;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return Process.SD_PIPE;
            case 7:
                return 1276;
            case 8:
                return 6396;
            default:
                return 0;
        }
        return i2;
    }

    public static int A01(int i) {
        if (i == 2 || i == 4) {
            return 6005;
        }
        if (i == 10) {
            return 6004;
        }
        if (i == 7) {
            return 6005;
        }
        if (i == 8) {
            return 6003;
        }
        switch (i) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    public static int A02(int i) {
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 2;
        }
        if (i == 24) {
            return 536870912;
        }
        int i2 = 805306368;
        if (i != 32) {
            i2 = 0;
        }
        return i2;
    }

    public static int A03(int i, int i2) {
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 268435456) {
                        if (i == 536870912) {
                            return i2 * 3;
                        }
                        if (i != 805306368) {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                i2 *= 4;
            }
            return i2;
        }
        return i2 * 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0050. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:42:0x011e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e4 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A04(android.net.Uri r301, java.lang.String r302) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.Util.A04(android.net.Uri, java.lang.String):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0054, code lost:
    
        if ("neg".equals(r0[r0 - 2]) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A05(java.lang.String r301) {
        /*
            r0 = 0
            r302 = r0
            r0 = r301
            if (r0 == 0) goto L71
            java.lang.String r0 = "_"
            r303 = r0
            r0 = -1
            r304 = r0
            r0 = r301
            r1 = r303
            r2 = r304
            java.lang.String[] r0 = r0.split(r1, r2)
            r305 = r0
            r0 = r305
            int r0 = r0.length
            r306 = r0
            r0 = 2
            r307 = r0
            r0 = r306
            r1 = r307
            if (r0 < r1) goto L71
            r0 = r306
            r1 = -1
            int r0 = r0 + r1
            r304 = r0
            r0 = r305
            r1 = r304
            r0 = r0[r1]
            r308 = r0
            r0 = 3
            r304 = r0
            r0 = r306
            r1 = r304
            if (r0 < r1) goto L57
            r0 = r306
            r1 = r307
            int r0 = r0 - r1
            r306 = r0
            r0 = r305
            r1 = r306
            r0 = r0[r1]
            r303 = r0
            java.lang.String r0 = "neg"
            r309 = r0
            r0 = r309
            r1 = r303
            boolean r0 = r0.equals(r1)
            r307 = r0
            r0 = 1
            r304 = r0
            r0 = r307
            if (r0 != 0) goto L5c
        L57:
            r0 = 0
            r304 = r0
            r0 = 0
            r309 = r0
        L5c:
            r0 = r308
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.NumberFormatException -> L73
            r0 = r308
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L73
            r302 = r0
            r0 = r304
            if (r0 == 0) goto L6f
            r0 = r302
            int r0 = -r0
            r302 = r0
        L6f:
            r0 = r302
            return r0
        L71:
            r0 = 0
            return r0
        L73:
            goto L6f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.Util.A05(java.lang.String):int");
    }

    public static int A06(long[] jArr, long j, boolean z) {
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            binarySearch ^= -1;
            return binarySearch;
        }
        do {
            binarySearch++;
            if (binarySearch >= jArr.length) {
                break;
            }
        } while (jArr[binarySearch] == j);
        if (z) {
            return binarySearch - 1;
        }
        return binarySearch;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A07(long[] r301, long r302, boolean r304) {
        /*
            r0 = r301
            r1 = r302
            int r0 = java.util.Arrays.binarySearch(r0, r1)
            r305 = r0
            r0 = r305
            if (r0 >= 0) goto L29
            r0 = r305
            r1 = 2
            int r0 = r0 + r1
            r306 = r0
            r0 = r306
            int r0 = -r0
            r307 = r0
        L17:
            r0 = r304
            if (r0 == 0) goto L26
            r0 = 0
            r306 = r0
            r0 = 0
            r1 = r307
            int r0 = java.lang.Math.max(r0, r1)
            r307 = r0
        L26:
            r0 = r307
            return r0
        L29:
            r0 = r305
            r1 = -1
            int r0 = r0 + r1
            r305 = r0
            r0 = r305
            if (r0 < 0) goto L48
            r0 = r301
            r1 = r305
            r0 = r0[r1]
            r308 = r0
            r0 = r308
            r1 = r302
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L48
            goto L29
        L48:
            r0 = r305
            r1 = 1
            int r0 = r0 + r1
            r307 = r0
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.Util.A07(long[], long, boolean):int");
    }

    public static long A08(float f, long j) {
        if (f != 1.0f) {
            j = Math.round(j * f);
        }
        return j;
    }

    public static long A09(float f, long j) {
        if (f != 1.0f) {
            j = Math.round(j / f);
        }
        return j;
    }

    public static long A0A(long j) {
        return j == -9223372036854775807L ? System.currentTimeMillis() : j + SystemClock.elapsedRealtime();
    }

    public static long A0B(long j) {
        if (j != -9223372036854775807L && j != Long.MIN_VALUE) {
            j *= 1000;
        }
        return j;
    }

    public static long A0C(long j) {
        if (j != -9223372036854775807L && j != Long.MIN_VALUE) {
            j /= 1000;
        }
        return j;
    }

    public static long A0D(long j, long j2) {
        return A0E(j, 1000000L, j2);
    }

    public static long A0E(long j, long j2, long j3) {
        if (j3 >= j2 && j3 % j2 == 0) {
            return j / (j3 / j2);
        }
        if (j3 < j2 && j2 % j3 == 0) {
            return j * (j2 / j3);
        }
        return (long) (j * (j2 / j3));
    }

    public static long A0F(String str) {
        Matcher matcher = A0B.matcher(str);
        if (!matcher.matches()) {
            throw KLu.A02(0Pz.A0W("Invalid date/time format: ", str), (Throwable) null);
        }
        int i = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
            if ("-".equals(matcher.group(11))) {
                i = -i;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal(0Pz.A0W("0.", matcher.group(8))).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        if (i != 0) {
            timeInMillis -= i * 60000;
        }
        return timeInMillis;
    }

    public static 6Yl A0G(int i, int i2, int i3) {
        6Zr r0 = new 6Zr();
        r0.A0U = "audio/raw";
        r0.A04 = i2;
        r0.A0E = i3;
        r0.A0A = i;
        return new 6Yl(r0);
    }

    public static String A0H(int i) {
        if (i == 0) {
            return "NO";
        }
        if (i == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    public static String A0I(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.charAt(i3) == '%') {
                i2++;
            }
        }
        if (i2 != 0) {
            int i4 = length - (i2 * 2);
            StringBuilder A0l = AnonymousClass001.A0l(i4);
            Matcher matcher = A0A.matcher(str);
            while (i2 > 0 && matcher.find()) {
                String group = matcher.group(1);
                group.getClass();
                char parseInt = (char) Integer.parseInt(group, 16);
                A0l.append((CharSequence) str, i, matcher.start());
                A0l.append(parseInt);
                i = matcher.end();
                i2--;
            }
            if (i < length) {
                A0l.append((CharSequence) str, i, length);
            }
            if (A0l.length() != i4) {
                return null;
            }
            str = A0l.toString();
        }
        return str;
    }

    public static void A0J(Handler handler, Runnable runnable) {
        if (handler.getLooper().getThread().isAlive()) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    public static void A0K(long[] jArr, long j) {
        int i = 0;
        if (j >= 1000000 && j % 1000000 == 0) {
            long j2 = j / 1000000;
            while (i < jArr.length) {
                jArr[i] = jArr[i] / j2;
                i++;
            }
            return;
        }
        if (j >= 1000000 || 1000000 % j != 0) {
            double d = 1000000.0d / j;
            while (i < jArr.length) {
                jArr[i] = (long) (jArr[i] * d);
                i++;
            }
            return;
        }
        long j3 = 1000000 / j;
        while (i < jArr.length) {
            jArr[i] = jArr[i] * j3;
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if (r301 == '?') goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0L(char r301) {
        /*
            r0 = 34
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L52
            r0 = 37
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L52
            r0 = 42
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L52
            r0 = 47
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L52
            r0 = 58
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L52
            r0 = 60
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L52
            r0 = 92
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L52
            r0 = 124(0x7c, float:1.74E-43)
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L52
            r0 = 62
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L52
            r0 = 63
            r303 = r0
            r0 = 0
            r302 = r0
            r0 = r301
            r1 = r303
            if (r0 != r1) goto L54
        L52:
            r0 = 1
            r302 = r0
        L54:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.Util.A0L(char):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if (r301 == 4) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0M(int r301) {
        /*
            r0 = 3
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L32
            r0 = 2
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L32
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L32
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L32
            r0 = 805306368(0x30000000, float:4.656613E-10)
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L32
            r0 = 4
            r303 = r0
            r0 = 0
            r302 = r0
            r0 = r301
            r1 = r303
            if (r0 != r1) goto L34
        L32:
            r0 = 1
            r302 = r0
        L34:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.Util.A0M(int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (r0.getCurrentModeType() != 4) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0N(android.content.Context r301) {
        /*
            r0 = r301
            android.content.Context r0 = r0.getApplicationContext()
            r302 = r0
            r0 = r302
            java.lang.String r1 = "uimode"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.app.UiModeManager r0 = (android.app.UiModeManager) r0
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L25
            r0 = r303
            int r0 = r0.getCurrentModeType()
            r304 = r0
            r0 = 4
            r305 = r0
            r0 = 1
            r306 = r0
            r0 = r304
            r1 = r305
            if (r0 == r1) goto L2a
        L25:
            r0 = 0
            r306 = r0
            r0 = 0
            r303 = r0
        L2a:
            r0 = r306
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.Util.A0N(android.content.Context):boolean");
    }

    public static boolean A0O(SQLiteDatabase sQLiteDatabase, String str) {
        boolean z = true;
        if (DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{str}) <= 0) {
            z = false;
        }
        return z;
    }

    public static boolean A0P(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        boolean z = false;
        if (obj2 == null) {
            z = true;
        }
        return z;
    }
}
