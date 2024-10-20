package X;

import android.content.Intent;
import android.os.Build;
import com.facebook.browser.iabcontext.IabCommonTrait;
import com.facebook.iabadscontext.IABAdsContext;
import com.facebook.iabadscontext.IABBwPayPalExtension;

/* loaded from: Kpc.class */
public final class Kpc {
    public static int A02;
    public static Kpc A03;
    public final IABBwPayPalExtension A00;
    public final IABAdsContext A01;

    public Kpc(Intent intent) {
        IabCommonTrait iabCommonTrait = (IabCommonTrait) (Build.VERSION.SDK_INT >= 33 ? intent.getParcelableExtra("EXTRA_IAB_CONTEXT", IabCommonTrait.class) : intent.getParcelableExtra("EXTRA_IAB_CONTEXT"));
        IABAdsContext iABAdsContext = (iabCommonTrait == null || !(iabCommonTrait instanceof IABAdsContext)) ? null : (IABAdsContext) iabCommonTrait;
        this.A01 = iABAdsContext;
        this.A00 = iABAdsContext != null ? iABAdsContext.A03 : null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
    
        if (X.1Br.A07(X.KaL.A00).AZk(2378183894999568651L) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A00() {
        /*
            r301 = this;
            r0 = r301
            com.facebook.iabadscontext.IABBwPayPalExtension r0 = r0.A00
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L27
            X.1Br r0 = X.KaL.A00
            r302 = r0
            r0 = r302
            X.2yD r0 = X.1Br.A07(r0)
            r303 = r0
            r0 = 2378183894999568651(0x210101a70001110b, double:1.0390727233712005E-149)
            r304 = r0
            r0 = r303
            r1 = r304
            boolean r0 = r0.AZk(r1)
            r306 = r0
            r0 = 1
            r307 = r0
            r0 = r306
            if (r0 != 0) goto L2c
        L27:
            r0 = 0
            r307 = r0
            r0 = 0
            r302 = r0
        L2c:
            r0 = r307
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Kpc.A00():boolean");
    }
}
