package X;

import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;

/* renamed from: X.7l5, reason: invalid class name */
/* loaded from: 7l5.class */
public abstract class C7l5 {
    public static Integer A00(String str) {
        Integer num;
        String str2;
        Integer[] A00 = 0S2.A00(3);
        int length = A00.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < length) {
                num = A00[i2];
                switch (num.intValue()) {
                    case 1:
                        str2 = "Rentals";
                        break;
                    case 2:
                        str2 = "Vehicles";
                        break;
                    default:
                        str2 = ServerW3CShippingAddressConstants.DEFAULT;
                        break;
                }
                if (!str2.equals(str)) {
                    i = i2 + 1;
                }
            } else {
                num = 0S2.A00;
            }
        }
        return num;
    }
}
