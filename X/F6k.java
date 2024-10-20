package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;

/* loaded from: F6k.class */
public final class F6k {
    public Etw A00;
    public ThreadKey A01;
    public String A02;
    public 1BY A04;
    public final java.util.Map A07;
    public final F8q A0A;
    public final C00i A06 = 1BV.A01((1BY) null, 50209);
    public final C00i A09 = 1BV.A01((1BY) null, 147732);
    public final 1GU A05 = AbI.A0A();
    public boolean A03 = false;
    public final java.util.Map A08 = AnonymousClass001.A0u();

    public F6k(1BO r302) {
        HashMap A0u = AnonymousClass001.A0u();
        this.A07 = A0u;
        this.A02 = "PHOTO_AND_VIDEO";
        this.A04 = 7zL.A0Q(r302);
        this.A0A = (F8q) 1Hv.A02(AbI.A03((1BY) null), 99435);
        A0u.put("PHOTO_AND_VIDEO", "");
    }

    public static void A00(F6k f6k) {
        f6k.A00.A00((ImmutableList) f6k.A08.get(f6k.A02));
        f6k.A09.get();
        7zR.A1M(f6k.A0A, 2131967203);
        f6k.A03 = true;
    }
}
