package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import java.util.BitSet;

/* loaded from: B09.class */
public final class B09 extends C1rj {
    public static final MigColorScheme A04 = LightColorScheme.A00();
    public DI7 A00;
    public MigColorScheme A01;
    public String A02;
    public boolean A03;

    public B09() {
        super("OmnipickerSearchHeader");
        this.A01 = A04;
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A02, this.A00, Boolean.valueOf(this.A03)};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C2cp c2cp;
        DI7 di7 = this.A00;
        String str = this.A02;
        boolean z = this.A03;
        MigColorScheme migColorScheme = this.A01;
        C1u2 A0R = 7zP.A0R();
        C1rq A01 = C1rg.A01(r302, null, 0);
        7zM.A1O(A01, migColorScheme);
        C1rq A012 = C1rg.A01(r302, null, 0);
        C2cq A00 = C2cp.A00(r302, 0);
        A00.A2a(7zO.A0F(C1u3.A0U, A0R, migColorScheme));
        A00.A0z(32.0f);
        A00.A0l(32.0f);
        A00.A24(C26z.LEFT, 12.0f);
        C26z c26z = C26z.RIGHT;
        A00.A24(c26z, 28.0f);
        A00.A12(14.0f);
        A012.A2e(A00);
        A012.A24(c26z, 6.0f);
        A012.A1G(2130971610);
        A012.A1J(2131957311);
        7zN.A1D(A012, r302, B09.class, "OmnipickerSearchHeader", 1280007661);
        7zL.A1J(A012);
        A01.A2f(A012.A00);
        C1845Aui c1845Aui = new C1845Aui(r302, new B0j());
        B0j b0j = c1845Aui.A01;
        b0j.A00 = di7;
        BitSet bitSet = c1845Aui.A02;
        bitSet.set(1);
        b0j.A02 = str;
        bitSet.set(0);
        c1845Aui.A0l(56.0f);
        c1845Aui.A0R();
        4YU.A1O(c1845Aui, 2RH.A03, c26z);
        b0j.A01 = migColorScheme;
        c1845Aui.A0E("omnipicker_search_bar_tag");
        c1845Aui.A2K("omnipicker_search_edittext");
        C1rs.A00(bitSet, c1845Aui.A03);
        c1845Aui.A0J();
        A01.A2f(b0j);
        if (z) {
            C2cq A002 = C2cp.A00(r302, 0);
            A002.A2a(7zO.A0F(C1u3.A1w, A0R, migColorScheme));
            A002.A1G(2130971610);
            2RH r0 = 2RH.A05;
            A002.A1D(4YU.A00(r0));
            7zO.A1M(A002, r0, c26z);
            7zN.A1D(A002, r302, B09.class, "OmnipickerSearchHeader", 601999788);
            A002.A1J(2131962476);
            c2cp = A002.A2W();
        } else {
            c2cp = null;
        }
        A01.A2f(c2cp);
        A01.A0l(56.0f);
        A01.A2b();
        return AbstractC02613vo.A00(A01.A00, r302, migColorScheme, 4);
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i == 601999788) {
            ((B09) r302.A00.A01).A00.BoA();
            return null;
        }
        if (i != 1280007661) {
            return null;
        }
        ((B09) r302.A00.A01).A00.C8X();
        return null;
    }
}
