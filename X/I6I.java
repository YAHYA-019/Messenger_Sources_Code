package X;

import com.facebook.acra.criticaldata.CriticalAppData;
import java.util.Arrays;

/* loaded from: I6I.class */
public abstract class I6I {
    public static final void A00(Exception exc, String str, String str2, Object... objArr) {
        F7u.A03.A00(CriticalAppData.DEVICE_ID, "retry", str, str2, exc, Arrays.copyOf(objArr, objArr.length));
    }

    public static final void A01(String str, String str2, Object... objArr) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        11T.A0F(copyOf, 4);
        F7u.A03.A00(CriticalAppData.DEVICE_ID, "retry", str, str2, null, Arrays.copyOf(copyOf, copyOf.length));
    }

    public static final void A02(String str, String str2, Object... objArr) {
        11T.A0F(str2, 2);
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        11T.A0F(copyOf, 4);
        F7u.A03.A00(CriticalAppData.DEVICE_ID, "player", str, str2, null, Arrays.copyOf(copyOf, copyOf.length));
    }
}
