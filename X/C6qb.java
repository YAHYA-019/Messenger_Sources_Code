package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import com.facebook.ui.emoji.model.Emoji;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Executor;

/* renamed from: X.6qb, reason: invalid class name */
/* loaded from: 6qb.class */
public final class C6qb {
    public final 1Br A01 = 1Bq.A00(16472);
    public final 1Br A00 = 1Bq.A00(65609);

    /* JADX WARN: Multi-variable type inference failed */
    public final 5OF A00(Context context, Emoji emoji, C6qa c6qa) {
        byte b;
        String format;
        11T.A0F(context, 0);
        String A07 = emoji.A07();
        2qJ r0 = 2qH.A01.A00;
        11T.A0A(r0);
        int hashCode = r0.A00.hashCode();
        if (C30j.A00(A07)) {
            String hexString = Integer.toHexString(hashCode);
            11T.A0D(A07);
            StringBuilder sb = new StringBuilder();
            int[] A06 = Emoji.A06();
            int A01 = Emoji.A01(A06, Emoji.A00(A07, A06), false);
            for (int i = 0; i < A01; i++) {
                if (i != 0) {
                    sb.append('_');
                }
                sb.append(Integer.toHexString(A06[i]));
            }
            Emoji.A01.Ccj(A06);
            String obj = sb.toString();
            11T.A0A(obj);
            11T.A0D(hexString);
            int i2 = Resources.getSystem().getDisplayMetrics().densityDpi;
            if (i2 > 480) {
                b = 4;
            } else if (i2 > 320) {
                b = 3;
            } else if (i2 > 240) {
                b = 2;
            } else {
                b = false;
                if (i2 > 160) {
                    b = true;
                }
            }
            short s = c6qa.mWwwSizeLkp[b == true ? 1 : 0];
            int i3 = s & 3;
            int i4 = s ^ i3;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i3);
            sb2.append('/');
            sb2.append(i4);
            sb2.append('/');
            sb2.append(obj);
            sb2.append(".png");
            String obj2 = sb2.toString();
            char[] charArray = obj2.toCharArray();
            11T.A0A(charArray);
            int i5 = 317426846;
            for (char c : charArray) {
                i5 = ((i5 << 5) - i5) + c;
            }
            String hexString2 = Integer.toHexString(i5 & 255);
            11T.A0A(hexString2);
            format = String.format(Locale.US, "%s/%s/%s/%s/%s", Arrays.copyOf(new Object[]{"https://www.facebook.com/images/mobileemoji", hexString, "emoji3", hexString2, obj2}, 5));
            11T.A0A(format);
        } else {
            format = null;
        }
        if (format == null) {
            return null;
        }
        5OF r02 = new 5OF((Paint) null, (2Ff) this.A00.A00.get(), (Executor) this.A01.A00.get(), 0);
        Resources resources = context.getResources();
        int i6 = c6qa.dp;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("remote_emoji_");
        sb3.append(emoji);
        String obj3 = sb3.toString();
        int ceil = (int) Math.ceil(i6 * (resources.getDisplayMetrics().densityDpi / 160.0f));
        r02.A06(format, ceil, ceil, obj3);
        return r02;
    }
}
