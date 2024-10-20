package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.ipc.media.data.MimeType;

/* loaded from: C9h.class */
public abstract class C9h {
    public static String A00() {
        return StringFormatUtil.formatStrLocaleSafe("%s in (%s, %s)", "media_type", 7zN.A0i(), 3);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x002e. Please report as an issue. */
    public static String A01(BLe bLe) {
        Object[] objArr;
        String str;
        Object[] objArr2;
        Object[] objArr3;
        MimeType mimeType;
        switch (bLe.ordinal()) {
            case 0:
                objArr2 = new Object[]{"media_type", 1};
                return StringFormatUtil.formatStrLocaleSafe("%s = %s", objArr2);
            case 1:
            case 2:
                objArr2 = new Object[]{"media_type", 3};
                return StringFormatUtil.formatStrLocaleSafe("%s = %s", objArr2);
            case 3:
                objArr = new Object[]{"media_type", 3, "mime_type", MimeType.A09.toString()};
                str = "%s = %s AND %s NOT IN ('%s')";
                return StringFormatUtil.formatStrLocaleSafe(str, objArr);
            case 4:
            default:
                return A00();
            case 5:
            case 6:
                objArr = new Object[]{"media_type", 1, "mime_type", MimeType.A03.toString()};
                str = "(%s = %s AND %s != '%s')";
                return StringFormatUtil.formatStrLocaleSafe(str, objArr);
            case 7:
                objArr3 = new Object[4];
                objArr3[0] = A00();
                objArr3[1] = "mime_type";
                mimeType = MimeType.A03;
                objArr3[2] = mimeType.toString();
                objArr3[3] = MimeType.A0A.toString();
                return StringFormatUtil.formatStrLocaleSafe("%s AND %s NOT IN ('%s','%s')", objArr3);
            case 8:
                objArr = new Object[]{A00(), GOm.A00(6), 1, "mime_type", MimeType.A03.toString()};
                str = "%s AND %s = %s AND %s NOT IN ('%s')";
                return StringFormatUtil.formatStrLocaleSafe(str, objArr);
            case 9:
                objArr = new Object[]{A00(), "mime_type", MimeType.A03.toString()};
                str = "%s AND %s NOT IN ('%s')";
                return StringFormatUtil.formatStrLocaleSafe(str, objArr);
            case 10:
                objArr3 = new Object[4];
                objArr3[0] = A00();
                objArr3[1] = "mime_type";
                mimeType = MimeType.A01;
                objArr3[2] = mimeType.toString();
                objArr3[3] = MimeType.A0A.toString();
                return StringFormatUtil.formatStrLocaleSafe("%s AND %s NOT IN ('%s','%s')", objArr3);
            case 11:
                objArr = new Object[]{A00(), "mime_type", MimeType.A03.toString(), MimeType.A0A.toString(), MimeType.A01.toString(), MimeType.A08.toString()};
                str = "%s AND %s NOT IN ('%s','%s','%s','%s')";
                return StringFormatUtil.formatStrLocaleSafe(str, objArr);
        }
    }
}
