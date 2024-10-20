package X;

import android.text.TextUtils;
import com.facebook.acra.constants.ActionId;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.6ac, reason: invalid class name */
/* loaded from: 6ac.class */
public abstract class C6ac {
    public static final ArrayList A00 = new ArrayList();
    public static final Pattern A01 = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static int A00(int i) {
        if (i == 2) {
            return 10;
        }
        if (i == 5) {
            return 11;
        }
        if (i == 29) {
            return 12;
        }
        if (i == 42) {
            return 16;
        }
        if (i == 22) {
            return 1073741824;
        }
        int i2 = 15;
        if (i != 23) {
            i2 = 0;
        }
        return i2;
    }

    public static int A01(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if ("audio".equals(A04(str))) {
            return 1;
        }
        if ("video".equals(A04(str))) {
            return 2;
        }
        if (A05(str)) {
            return 3;
        }
        if ("image".equals(A04(str))) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = A00;
        if (0 >= arrayList.size()) {
            return -1;
        }
        arrayList.get(0);
        throw AnonymousClass001.A0Q("mimeType");
    }

    public static String A02(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case ActionId.INTERRUPTED /* 96 */:
            case ActionId.NETWORK_FAILED /* 97 */:
            case ActionId.NETWORK_RESPONSE /* 98 */:
            case ActionId.EDGE_PROCESSING_BEGIN /* 99 */:
            case 100:
            case ActionId.ON_VIEW_CREATED_END /* 101 */:
                return "video/mpeg2";
            case ActionId.DATA_LOAD_START /* 102 */:
            case ActionId.LEGACY_MARKER /* 103 */:
            case ActionId.ACTION_BAR_COMPLETE /* 104 */:
                return "audio/mp4a-latm";
            case ActionId.ABORTED /* 105 */:
            case ActionId.RTMP_PACKET_RECEIVED /* 107 */:
                return "audio/mpeg";
            case ActionId.QUERY_READY /* 106 */:
                return "video/mpeg";
            default:
                switch (i) {
                    case ActionId.CONNECTIVITY_CHANGED /* 169 */:
                    case 172:
                        return "audio/vnd.dts";
                    case ActionId.VIDEO_DISPLAYED /* 170 */:
                    case ActionId.VIDEO_REQUESTED_PLAYING /* 171 */:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static String A03(String str) {
        boolean z;
        int i = 0;
        String str2 = null;
        if (str != null) {
            String lowerCase = Ascii.toLowerCase(str.trim());
            if (lowerCase.startsWith("avc1") || lowerCase.startsWith("avc3")) {
                return "video/avc";
            }
            if (lowerCase.startsWith("hev1") || lowerCase.startsWith("hvc1")) {
                return "video/hevc";
            }
            if (lowerCase.startsWith("dvav") || lowerCase.startsWith("dva1") || lowerCase.startsWith("dvhe") || lowerCase.startsWith("dvh1")) {
                return "video/dolby-vision";
            }
            if (lowerCase.startsWith("av01")) {
                str2 = "video/av01";
            } else {
                if (lowerCase.startsWith("vp9") || lowerCase.startsWith("vp09")) {
                    return "video/x-vnd.on2.vp9";
                }
                if (lowerCase.startsWith("vp8") || lowerCase.startsWith("vp08")) {
                    return "video/x-vnd.on2.vp8";
                }
                if (lowerCase.startsWith("mp4a")) {
                    if (!lowerCase.startsWith("mp4a.")) {
                        return "audio/mp4a-latm";
                    }
                    Matcher matcher = A01.matcher(lowerCase);
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        group.getClass();
                        String group2 = matcher.group(2);
                        try {
                            int parseInt = Integer.parseInt(group, 16);
                            if (group2 != null) {
                                Integer.parseInt(group2);
                            }
                            i = parseInt;
                            z = true;
                        } catch (NumberFormatException unused) {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    if (!z) {
                        return "audio/mp4a-latm";
                    }
                    str2 = A02(i);
                    if (str2 == null) {
                        return "audio/mp4a-latm";
                    }
                } else {
                    if (lowerCase.startsWith("mha1")) {
                        return "audio/mha1";
                    }
                    if (lowerCase.startsWith("mhm1")) {
                        return "audio/mhm1";
                    }
                    if (lowerCase.startsWith("ac-3") || lowerCase.startsWith("dac3")) {
                        return "audio/ac3";
                    }
                    if (lowerCase.startsWith("ec-3") || lowerCase.startsWith("dec3")) {
                        return "audio/eac3";
                    }
                    if (lowerCase.startsWith("ec+3")) {
                        return "audio/eac3-joc";
                    }
                    if (lowerCase.startsWith("ac-4") || lowerCase.startsWith("dac4")) {
                        return "audio/ac4";
                    }
                    if (lowerCase.startsWith("dtsc")) {
                        return "audio/vnd.dts";
                    }
                    if (lowerCase.startsWith("dtse")) {
                        return "audio/vnd.dts.hd;profile=lbr";
                    }
                    if (lowerCase.startsWith("dtsh") || lowerCase.startsWith("dtsl")) {
                        return "audio/vnd.dts.hd";
                    }
                    if (lowerCase.startsWith("dtsx")) {
                        return "audio/vnd.dts.uhd;profile=p2";
                    }
                    if (lowerCase.startsWith("opus")) {
                        return "audio/opus";
                    }
                    if (lowerCase.startsWith("vorbis")) {
                        return GOm.A00(18);
                    }
                    if (lowerCase.startsWith("flac")) {
                        return "audio/flac";
                    }
                    if (lowerCase.startsWith("stpp")) {
                        return "application/ttml+xml";
                    }
                    if (lowerCase.startsWith("wvtt")) {
                        return "text/vtt";
                    }
                    if (lowerCase.contains("cea708")) {
                        return "application/cea-708";
                    }
                    if (lowerCase.contains("eia608") || lowerCase.contains("cea608")) {
                        return "application/cea-608";
                    }
                    ArrayList arrayList = A00;
                    if (0 < arrayList.size()) {
                        arrayList.get(0);
                        throw AnonymousClass001.A0Q("codecPrefix");
                    }
                }
            }
        }
        return str2;
    }

    public static String A04(String str) {
        int indexOf;
        String str2 = null;
        if (str != null && (indexOf = str.indexOf(47)) != -1) {
            str2 = str.substring(0, indexOf);
        }
        return str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b2, code lost:
    
        if ("application/dvbsubs".equals(r301) != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A05(java.lang.String r301) {
        /*
            Method dump skipped, instructions count: 185
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6ac.A05(java.lang.String):boolean");
    }

    public static boolean A06(String str, String str2) {
        String str3;
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -2123537834:
                str3 = "audio/eac3-joc";
                break;
            case -432837260:
                str3 = "audio/mpeg-L1";
                break;
            case -432837259:
                str3 = JQw.A00(228);
                break;
            case -53558318:
                if (!str.equals("audio/mp4a-latm") || str2 == null) {
                    return false;
                }
                Matcher matcher = A01.matcher(str2);
                if (!matcher.matches()) {
                    return false;
                }
                String group = matcher.group(1);
                group.getClass();
                String group2 = matcher.group(2);
                int i = 0;
                try {
                    Integer.parseInt(group, 16);
                    if (group2 != null) {
                        i = Integer.parseInt(group2);
                    }
                    int A002 = A00(i);
                    return (A002 == 0 || A002 == 16) ? false : true;
                } catch (NumberFormatException unused) {
                    return false;
                }
            case 187078296:
                str3 = "audio/ac3";
                break;
            case 187094639:
                str3 = "audio/raw";
                break;
            case 1504578661:
                str3 = "audio/eac3";
                break;
            case 1504619009:
                str3 = "audio/flac";
                break;
            case 1504831518:
                str3 = "audio/mpeg";
                break;
            case 1903231877:
                str3 = "audio/g711-alaw";
                break;
            case 1903589369:
                str3 = "audio/g711-mlaw";
                break;
            default:
                return false;
        }
        return str.equals(str3);
    }
}
