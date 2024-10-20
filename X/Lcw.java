package X;

import android.content.Context;

/* loaded from: Lcw.class */
public final class Lcw implements MGD {
    public final Kjb CkK(Context context, MIu mIu, String str) {
        Kjb kjb = new Kjb();
        int i = 1;
        int DCG = mIu.DCG(context, str, true);
        kjb.A01 = DCG;
        if (DCG == 0) {
            int DC5 = mIu.DC5(context, str);
            kjb.A00 = DC5;
            if (DC5 != 0) {
                i = -1;
            }
            return kjb;
        }
        kjb.A02 = i;
        return kjb;
    }
}
