package X;

import android.content.Context;

/* loaded from: Lcx.class */
public final class Lcx implements MGD {
    public final Kjb CkK(Context context, MIu mIu, String str) {
        Kjb kjb = new Kjb();
        kjb.A00 = mIu.DC5(context, str);
        int i = 1;
        int DCG = mIu.DCG(context, str, true);
        kjb.A01 = DCG;
        int i2 = kjb.A00;
        if (i2 == 0) {
            if (DCG == 0) {
                i = 0;
                kjb.A02 = i;
                return kjb;
            }
            i2 = 0;
        }
        if (DCG < i2) {
            i = -1;
        }
        kjb.A02 = i;
        return kjb;
    }
}
