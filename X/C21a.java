package X;

import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.21a, reason: invalid class name */
/* loaded from: 21a.class */
public abstract class C21a {
    public static final C00i A00 = new 1BQ(66776);

    public static ThreadKey A00(1F9 r301, Integer num, String str) {
        num.getClass();
        C1yg A002 = ((C1yf) A00.get()).A00(num.intValue());
        int ordinal = A002.ordinal();
        if (ordinal == 13) {
            1F9 r0 = 1F9.A0J;
            long parseLong = Long.parseLong(str);
            return r301 == r0 ? ThreadKey.A09(parseLong) : ThreadKey.A02(parseLong);
        }
        if (ordinal == 14) {
            return ThreadKey.A01(Long.parseLong(str));
        }
        if (ordinal == 17) {
            return ThreadKey.A03(Long.parseLong(str));
        }
        throw 1BL.A0h(A002, "Unsupported threadKey type: ", AnonymousClass001.A0k());
    }
}
