package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.common.stringformat.StringFormatUtil;

/* loaded from: C8j.class */
public abstract class C8j {
    public 4wE A00 = new 4wE();

    public Intent A01(Context context, String str) {
        if (this instanceof C1629Ao7) {
            11T.A0F(str, 1);
            Intent intent = null;
            if (11T.A0P(C1629Ao7.A00, 1, str)) {
                intent = 4YU.A09(C0A2.A03(str));
            }
            return intent;
        }
        try {
            5QO A02 = this.A00.A02(str.replaceAll("v\\d+\\.\\d+\\/", ""));
            if (A02 != null) {
                return ((DEW) A02.A01).ACo(context, A02.A00);
            }
            return null;
        } catch (5D6 unused) {
            return null;
        }
    }

    public void A02(DEW dew, String str) {
        try {
            this.A00.A03(str, dew);
        } catch (DBu e) {
            0fH.A0N(getClass(), "Invalid uri template: %s", e, new Object[]{str});
        }
    }

    public void A03(String str, String str2) {
        try {
            this.A00.A03(str, new RnN(str2));
        } catch (DBu e) {
            0fH.A0H(getClass(), StringFormatUtil.formatStrLocaleSafe("Invalid uri template: %s", str), e);
        }
    }
}
