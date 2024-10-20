package X;

import com.facebook.auth.usersession.FbUserSession;
import java.util.BitSet;

/* renamed from: X.Awd, reason: case insensitive filesystem */
/* loaded from: Awd.class */
public final class C1912Awd extends C1rs {
    public 1Iw A00;
    public C1987Ayg A01;
    public final BitSet A02;
    public final String[] A03;

    public C1912Awd(1Iw r302, C1987Ayg c1987Ayg) {
        super(c1987Ayg, r302, 0, 0);
        this.A03 = new String[]{"fbUserSession", "size"};
        BitSet A18 = 1BK.A18(2);
        this.A02 = A18;
        this.A01 = c1987Ayg;
        this.A00 = r302;
        A18.clear();
    }

    public static C1912Awd A06(FbUserSession fbUserSession, 1Iw r302) {
        C1912Awd c1912Awd = new C1912Awd(r302, new C1987Ayg());
        c1912Awd.A01.A00 = fbUserSession;
        c1912Awd.A02.set(0);
        return c1912Awd;
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A00(this.A02, this.A03);
        A0J();
        return this.A01;
    }

    public void A2W(2RK r302) {
        this.A01.A01 = r302;
        this.A02.set(1);
    }
}
