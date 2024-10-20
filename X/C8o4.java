package X;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.stickers.model.Sticker;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import com.mapbox.mapboxsdk.R;
import java.util.EnumMap;

/* renamed from: X.8o4, reason: invalid class name */
/* loaded from: 8o4.class */
public final class C8o4 extends C1rj {
    public static final CallerContext A0E = CallerContext.A0B("StickerComponent");
    public int A00;
    public Uri A01;
    public View A02;
    public Fragment A03;
    public AnonymousClass959 A04;
    public 1Im A05;
    public C6wd A06;
    public Sticker A07;
    public 6tM A08;
    public 96J A09;
    public C6qq A0A;
    public 96D A0B;
    public boolean A0C;
    public boolean A0D;

    public C8o4() {
        super("StickerComponent");
    }

    public static final void A00(1Iw r301, Sticker sticker, 96J r303) {
        1Im r0;
        11T.A0H(r301, sticker);
        11T.A0F(r303, 3);
        1LI r02 = r301.A02;
        if (r02 == null || (r0 = ((C8o4) r02).A05) == null) {
            return;
        }
        7zR.A1E(r0, new 7BB(sticker, r303));
    }

    public final Object[] A0k() {
        return new Object[]{this.A08, this.A04, this.A03, Integer.valueOf(this.A00), this.A01, Boolean.valueOf(this.A0C), this.A07, this.A06, this.A0A, this.A09, Boolean.valueOf(this.A0D), this.A0B, this.A02};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        Sticker sticker = this.A07;
        Uri uri = this.A01;
        boolean z = this.A0C;
        96D r0 = this.A0B;
        C6qq c6qq = this.A0A;
        1BK.A1M(r302, sticker);
        if (c6qq == null) {
            c6qq = (C6qq) 7zO.A0o(r302, 66077);
        }
        Resources A0E2 = 4YU.A0E(r302);
        C5bb c5bb = new C5bb(7zL.A01(A0E2, 2132279332), 0);
        c5bb.CmI(r302.A0E.A04(2132214614), 7zL.A01(A0E2, 2132279351));
        String str = sticker.A0G;
        return c6qq.AJv(c5bb, uri, A0E, r302, 1LI.A06(r302, C8o4.class, "StickerComponent"), 1LI.A09(r302, C8o4.class, "StickerComponent", 71235917), 1LI.A07(r302, C8o4.class, "StickerComponent"), 1LI.A09(r302, C8o4.class, "StickerComponent", -129045829), sticker, r0, (str == null || str.length() == 0) ? r302.A0D(2131957339) : 7zN.A0u(r302, str, 2131966383), 4YT.A00(773), R.dimen.mapbox_eight_dp, 2132279398, z);
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        return 4YV.A0M(c1qp);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        boolean z;
        1Im r0;
        1Im r02;
        switch (r302.A01) {
            case -1351902487:
                1Iv r03 = r302.A00;
                1Is r04 = r03.A01;
                1Iw r05 = r03.A00;
                C8o4 c8o4 = (C8o4) r04;
                A00(r05, c8o4.A07, c8o4.A09);
                return null;
            case -1336101728:
                z = false;
                return Boolean.valueOf(z);
            case -1048037474:
                1LI.A0J(r302, obj);
                return null;
            case -129045829:
                1Iv r06 = r302.A00;
                1Is r07 = r06.A01;
                1Iw r08 = r06.A00;
                C8o4 c8o42 = (C8o4) r07;
                Sticker sticker = c8o42.A07;
                int i = c8o42.A00;
                96J r09 = c8o42.A09;
                11T.A0H(r08, sticker);
                11T.A0F(r09, 3);
                1LI r010 = r08.A02;
                if (r010 == null || (r02 = ((C8o4) r010).A05) == null) {
                    return null;
                }
                7zR.A1E(r02, new 7C9(sticker, r09, i));
                return null;
            case 71235917:
                1Iv r011 = r302.A00;
                1Is r012 = r011.A01;
                1Iw r013 = r011.A00;
                C8o4 c8o43 = (C8o4) r012;
                Sticker sticker2 = c8o43.A07;
                Fragment fragment = c8o43.A03;
                View view = c8o43.A02;
                6tM r014 = c8o43.A08;
                96D r015 = c8o43.A0B;
                C6wd c6wd = c8o43.A06;
                AnonymousClass959 anonymousClass959 = c8o43.A04;
                96J r016 = c8o43.A09;
                11T.A0F(r013, 0);
                7zP.A1M(sticker2, 1, r016);
                if (c6wd != null && r015 != null && view != null && r014 != null) {
                    EnumMap enumMap = new EnumMap(C6we.class);
                    enumMap.put((EnumMap) C6we.A0A, (C6we) new Im6(2, r016, r013, anonymousClass959));
                    Context A0A = 7zL.A0A(r013);
                    c6wd.A03(A0A, view, fragment, null, sticker2, r014, r015, enumMap, APG.A00);
                    c6wd.A02(A0A, view, fragment, null, sticker2, r014, r015);
                    1LI r017 = r013.A02;
                    if (r017 != null && (r0 = ((C8o4) r017).A05) != null) {
                        C98g c98g = C98g.A0B;
                        A6H a6h = new A6H("sticker");
                        ImmutableMap immutableMap = RegularImmutableMap.A03;
                        11T.A0A(immutableMap);
                        7zR.A1E(r0, new A5u(c98g, a6h, immutableMap));
                    }
                    z = true;
                    return Boolean.valueOf(z);
                }
                z = false;
                return Boolean.valueOf(z);
            default:
                return null;
        }
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        C6qq c6qq = this.A0A;
        11T.A0F(r302, 0);
        if (c6qq == null) {
            1Hv.A02(7zL.A0A(r302), 66077);
        }
    }
}
