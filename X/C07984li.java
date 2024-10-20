package X;

import com.facebook.acra.util.StatFsUtil;
import com.facebook.common.stringformat.StringFormatUtil;
import java.text.DecimalFormat;

/* renamed from: X.4li, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4li.class */
public final class C07984li {
    public static DecimalFormat A04 = new DecimalFormat("##0.0");
    public long A00;
    public long A01;
    public long A02;
    public long A03;

    public static String A00(long j) {
        String format;
        String str;
        if (j < 1024) {
            return 0Pz.A0I(j, "B");
        }
        DecimalFormat decimalFormat = A04;
        double d = j;
        if (j < StatFsUtil.IN_MEGA_BYTE) {
            format = decimalFormat.format(d / 1024.0d);
            str = "%sKB";
        } else {
            format = decimalFormat.format(d / 1048576.0d);
            str = "%sMB";
        }
        return StringFormatUtil.formatStrLocaleSafe(str, format);
    }

    public String toString() {
        return StringFormatUtil.formatStrLocaleSafe("Wifi received: %s, Wifi sent: %s, Mobile received: %s, Mobile sent: %s, Total: %s", A00(this.A02), A00(this.A03), A00(this.A00), A00(this.A01), A00(this.A02 + this.A03 + this.A00 + this.A01));
    }
}
