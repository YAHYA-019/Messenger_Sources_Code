package X;

import android.content.Context;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import java.util.List;

/* loaded from: L6C.class */
public abstract class L6C {
    public static final LZo A00(ShippingAddress shippingAddress) {
        String A13;
        List A0L;
        String str = shippingAddress.A00;
        if (str != null && (A13 = 4YU.A13(str)) != null && !0CU.A0O(A13) && (A0L = 0CU.A0L(A13, new char[]{' '}, 0)) != null) {
            if (1BK.A1Y(A0L)) {
                A0L.get(0);
            }
            if (A0L.size() > 1) {
                A0L.get(1);
            }
        }
        return new LZo(shippingAddress.A08, shippingAddress.A09, shippingAddress.A01, shippingAddress.A07, shippingAddress.A02, shippingAddress.A06);
    }

    public static final ShippingAddress A01(MQH mqh, String str) {
        String str2 = str;
        11T.A0F(mqh, 0);
        if (str == null) {
            str2 = "";
        }
        return new ShippingAddress(null, null, str2, mqh.BCu(), mqh.BCv(), mqh.AVx(), mqh.AW0(), mqh.Ael(), mqh.BLL(), null, true, true, false, false, true);
    }

    public static final String A02(Context context, Qtn qtn) {
        int i;
        11T.A0F(context, 1);
        int ordinal = qtn.ordinal();
        if (ordinal == 1) {
            i = 2131956096;
        } else {
            if (ordinal != 2) {
                return "";
            }
            i = 2131956099;
        }
        return 1BK.A0u(context, i);
    }
}
