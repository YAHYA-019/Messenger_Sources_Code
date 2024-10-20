package X;

import android.content.Context;
import android.net.Uri;

/* renamed from: X.6oo, reason: invalid class name */
/* loaded from: 6oo.class */
public final class C6oo {
    public final 1Br A00 = 1Bq.A00(16922);
    public final 1Br A01 = 1Bq.A00(49880);

    public static final Uri A00(Context context, C6oo c6oo, Integer num) {
        if (num == 0S2.A01) {
            num = 0S2.A00;
        }
        if (A01(context, c6oo, num) == null) {
            return null;
        }
        c6oo.A01.A00.get();
        return 2IA.A00(2132411373).A04().A05;
    }

    public static final GQl A01(Context context, C6oo c6oo, Integer num) {
        Integer num2;
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                C00i c00i = c6oo.A00.A00;
                2BQ r0 = (2BQ) c00i.get();
                if (intValue != 2) {
                    if (!r0.A03() || !((2BQ) c00i.get()).A04("zero_messaging_stickers_placeholder")) {
                        return null;
                    }
                    num2 = 0S2.A0j;
                } else {
                    if (!r0.A04("free_messenger_gif_placeholder")) {
                        return null;
                    }
                    num2 = 0S2.A0Y;
                }
            } else {
                if (!((2BQ) c6oo.A00.A00.get()).A04("free_messenger_video_placeholder")) {
                    return null;
                }
                num2 = 0S2.A0C;
            }
        } else {
            if (!((2BQ) c6oo.A00.A00.get()).A04("semi_free_messenger_placeholder")) {
                return null;
            }
            num2 = 0S2.A00;
        }
        return new GQl(context, num2);
    }
}
