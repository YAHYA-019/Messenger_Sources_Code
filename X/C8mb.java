package X;

import android.content.res.Resources;
import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.montage.viewer.MontageViewerFragment;
import com.facebook.mig.scheme.schemes.BaseMigColorScheme;
import java.util.List;

/* renamed from: X.8mb, reason: invalid class name */
/* loaded from: 8mb.class */
public final class C8mb extends C1rj {
    public static final C06974ih A05;
    public int A00;
    public Uri A01;
    public MontageViewerFragment A02;
    public List A03;
    public List A04;

    static {
        C07004ik A0H = 7zR.A0H();
        A0H.A02 = 2132410449;
        A0H.A0A = null;
        A05 = 7zL.A0L(A0H);
    }

    public C8mb() {
        super("ViewMoreComponent");
    }

    public final Object[] A0k() {
        return new Object[]{Integer.valueOf(this.A00), this.A02, this.A01, this.A03, this.A04};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        String str;
        Resources A0E;
        int i;
        Object[] objArr;
        Uri uri = this.A01;
        int i2 = this.A00;
        List list = this.A03;
        List list2 = this.A04;
        boolean A1X = 1BL.A1X(r302, uri);
        1BK.A1K(list, 3, list2);
        BaseMigColorScheme baseMigColorScheme = (BaseMigColorScheme) 1Bi.A03(16815);
        if (list2.size() == A1X) {
            A0E = 4YU.A0E(r302);
            i = 2131967924;
            objArr = new Object[]{list2.get(0)};
        } else {
            if (list2.size() != 2) {
                if (list2.size() >= 3) {
                    int i3 = i2 - 2;
                    str = 4YU.A0E(r302).getQuantityString(2131820869, i3, 1BK.A1a(list2.get(0), list2.get(A1X ? 1 : 0), i3));
                } else {
                    str = "";
                }
                11T.A0D(str);
                C1rq A01 = C1rg.A01(r302, null, 0);
                5BH A012 = 5BG.A01(r302);
                A012.A0c();
                A012.A10(100.0f);
                A012.A0m(100.0f);
                A012.A2X(uri);
                A012.A2Z(A05);
                A012.A2b(CallerContext.A0B("AutoPlayComponentSpec"));
                2cM A0K = 7zN.A0K(A012, r302, A01);
                A0K.A10(100.0f);
                A0K.A0c();
                C1ro c1ro = C1ro.CENTER;
                A0K.A2g(c1ro);
                A0K.A2c();
                A0K.A1y(c1ro);
                A0K.A0R();
                2rS A00 = 2rR.A00(r302);
                A00.A2a(3);
                A00.A2b(baseMigColorScheme);
                A00.A2Z(56.0f);
                7zO.A1S(A00, (List) null, list);
                A0K.A2d(A00);
                2KD A013 = 2K3.A01(r302, 0);
                A013.A2r(2131960757);
                A013.A2b();
                A013.A17(12.0f);
                A013.A2x(baseMigColorScheme);
                A013.A2m();
                A0K.A2d(A013);
                2KD A13 = 7zM.A13(r302, str, 0);
                A13.A2X();
                A13.A16(20.0f);
                C1u7 c1u7 = C1u7.A09;
                A13.A2w(c1u7);
                A13.A2x(baseMigColorScheme);
                A13.A2l();
                A0K.A2d(A13);
                8Th A002 = C8nq.A00(r302);
                A002.A0s(176.0f);
                A002.A0U();
                4YU.A1N(A002, 2RH.A06);
                A002.A2X(2131960749);
                A002.A2Z(baseMigColorScheme);
                7zN.A1D(A002, r302, C8mb.class, "ViewMoreComponent", -1262713010);
                A0K.A2d(A002);
                2cM A0K2 = 7zN.A0K(A0K, r302, A01);
                A0K2.A10(100.0f);
                A0K2.A0c();
                A0K2.A0M();
                A0K2.A2h(C1rp.FLEX_END);
                A0K2.A0R();
                A0K2.A1A(14.0f);
                2KD A014 = 2K3.A01(r302, 0);
                A014.A2z(4YU.A0E(r302).getString(2131960750));
                A014.A2X();
                A014.A16(20.0f);
                A014.A2w(c1u7);
                A014.A2x(baseMigColorScheme);
                A014.A2n();
                A014.A0M();
                A0K2.A2d(A014);
                return 7zL.A0c(A0K2, A01);
            }
            A0E = 4YU.A0E(r302);
            i = 2131967925;
            objArr = new Object[]{list2.get(0), list2.get(A1X ? 1 : 0)};
        }
        str = A0E.getString(i, objArr);
        11T.A0D(str);
        C1rq A015 = C1rg.A01(r302, null, 0);
        5BH A0122 = 5BG.A01(r302);
        A0122.A0c();
        A0122.A10(100.0f);
        A0122.A0m(100.0f);
        A0122.A2X(uri);
        A0122.A2Z(A05);
        A0122.A2b(CallerContext.A0B("AutoPlayComponentSpec"));
        2cM A0K3 = 7zN.A0K(A0122, r302, A015);
        A0K3.A10(100.0f);
        A0K3.A0c();
        C1ro c1ro2 = C1ro.CENTER;
        A0K3.A2g(c1ro2);
        A0K3.A2c();
        A0K3.A1y(c1ro2);
        A0K3.A0R();
        2rS A003 = 2rR.A00(r302);
        A003.A2a(3);
        A003.A2b(baseMigColorScheme);
        A003.A2Z(56.0f);
        7zO.A1S(A003, (List) null, list);
        A0K3.A2d(A003);
        2KD A0132 = 2K3.A01(r302, 0);
        A0132.A2r(2131960757);
        A0132.A2b();
        A0132.A17(12.0f);
        A0132.A2x(baseMigColorScheme);
        A0132.A2m();
        A0K3.A2d(A0132);
        2KD A132 = 7zM.A13(r302, str, 0);
        A132.A2X();
        A132.A16(20.0f);
        C1u7 c1u72 = C1u7.A09;
        A132.A2w(c1u72);
        A132.A2x(baseMigColorScheme);
        A132.A2l();
        A0K3.A2d(A132);
        8Th A0022 = C8nq.A00(r302);
        A0022.A0s(176.0f);
        A0022.A0U();
        4YU.A1N(A0022, 2RH.A06);
        A0022.A2X(2131960749);
        A0022.A2Z(baseMigColorScheme);
        7zN.A1D(A0022, r302, C8mb.class, "ViewMoreComponent", -1262713010);
        A0K3.A2d(A0022);
        2cM A0K22 = 7zN.A0K(A0K3, r302, A015);
        A0K22.A10(100.0f);
        A0K22.A0c();
        A0K22.A0M();
        A0K22.A2h(C1rp.FLEX_END);
        A0K22.A0R();
        A0K22.A1A(14.0f);
        2KD A0142 = 2K3.A01(r302, 0);
        A0142.A2z(4YU.A0E(r302).getString(2131960750));
        A0142.A2X();
        A0142.A16(20.0f);
        A0142.A2w(c1u72);
        A0142.A2x(baseMigColorScheme);
        A0142.A2n();
        A0142.A0M();
        A0K22.A2d(A0142);
        return 7zL.A0c(A0K22, A015);
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -1262713010) {
            4YV.A1G(r302, obj, i);
            return null;
        }
        MontageViewerFragment montageViewerFragment = ((C8mb) r302.A00.A01).A02;
        if (montageViewerFragment == null) {
            return null;
        }
        EBv eBv = montageViewerFragment.A0O;
        eBv.A0Q(eBv.A0G() + 1, true);
        return null;
    }
}
