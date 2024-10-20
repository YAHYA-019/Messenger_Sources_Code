package X;

import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;

/* loaded from: F2a.class */
public abstract class F2a {
    public static Integer A00(String str) {
        if (str.equals("ForceDarkMode")) {
            return 0S2.A00;
        }
        if (str.equals("ForceLightMode")) {
            return 0S2.A01;
        }
        if (str.equals(ServerW3CShippingAddressConstants.DEFAULT)) {
            return 0S2.A0C;
        }
        throw AnonymousClass001.A0L(str);
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "ForceLightMode";
            case 2:
                return ServerW3CShippingAddressConstants.DEFAULT;
            default:
                return "ForceDarkMode";
        }
    }
}
