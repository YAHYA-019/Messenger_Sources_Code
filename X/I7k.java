package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: I7k.class */
public final class I7k {
    public static final long A0B = GOq.A0G();
    public final Context A02;
    public final FbUserSession A03;
    public final GP5 A05;
    public final I27 A06;
    public final HpL A07;
    public final HuL A0A;
    public final C00i A04 = AbH.A0S();
    public boolean A01 = false;
    public boolean A00 = false;
    public final JLm A08 = GpZ.A00(this, 2);
    public final HG7 A09 = new Gpg(this, 0);

    public I7k(FbUserSession fbUserSession, Context context) {
        this.A03 = fbUserSession;
        this.A02 = context;
        this.A05 = (GP5) 1Bn.A0E(context, (1BY) null, 115390);
        this.A07 = (HpL) 1Bn.A0E(context, (1BY) null, 115256);
        this.A06 = (I27) 1Bn.A0E(context, (1BY) null, 114925);
        this.A0A = (HuL) 1Bn.A0E(context, (1BY) null, 114982);
    }

    public static 1G2 A00(boolean z) {
        if (!z) {
            return null;
        }
        if (1JF.A0B("") && 1JF.A0B("")) {
            return null;
        }
        "".length();
        return 1G3.A01(51K.A05, "");
    }
}
