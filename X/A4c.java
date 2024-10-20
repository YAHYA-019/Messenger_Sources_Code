package X;

import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.sharedalbum.model.SharedAlbumArgs;

/* loaded from: A4c.class */
public final class A4c implements 7H9 {
    public final 06Z A00;
    public final ThreadKey A01;

    public A4c(06Z r302, ThreadKey threadKey) {
        this.A01 = threadKey;
        this.A00 = r302;
    }

    public void BLW(Context context, C5vw c5vw) {
        06Z r0;
        Number number;
        boolean A1W = 1BL.A1W(context, c5vw);
        if (c5vw instanceof 8NU) {
            8NU r02 = (8NU) c5vw;
            if (r02.A00 != A1W || (r0 = this.A00) == null || (number = (Number) r02.A02) == null) {
                return;
            }
            long longValue = number.longValue();
            C9Ow c9Ow = (C9Ow) 1Bn.A0A(68434);
            ThreadKey threadKey = this.A01;
            7zQ.A0j(c9Ow.A00).A08(threadKey, longValue);
            4YV.A11(c9Ow.A01).execute(new AGF(context, r0, new SharedAlbumArgs(threadKey, 0S2.A01, null, longValue)));
        }
    }
}
