package X;

import android.util.SparseArray;
import java.util.ArrayList;

/* loaded from: F5j.class */
public final class F5j {
    public final EUm A02;
    public final EUn A03;
    public final SparseArray A01 = DKC.A0E();
    public final SparseArray A00 = DKC.A0E();

    public F5j(EUm eUm, EUn eUn) {
        this.A03 = eUn;
        this.A02 = eUm;
    }

    public static final FFD A00(F5j f5j, FyG fyG, int i) {
        String valueOf = String.valueOf(i);
        FFD ffd = FFD.A05;
        GJ1 gj1 = fyG.A02;
        11T.A0I(gj1, "null cannot be cast to non-null type com.facebook.bloks.messenger.hosting.host.MSGBloksHost");
        Fxn fxn = new Fxn(new Eh3(f5j, i), new Ebp(1Br.A09(((Fwk) gj1).A06)), fyG);
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(fxn);
        return new FFD(ffd, (Object) null, (Object) null, valueOf, A0s);
    }
}
