package X;

import android.net.Uri;

/* renamed from: X.7g4, reason: invalid class name */
/* loaded from: 7g4.class */
public final class C7g4 extends C1rj {
    public Uri A00;
    public 1Im A01;
    public 6Sh A02;
    public 6Sh A03;
    public boolean A04;

    public C7g4() {
        super("RowSelectorImageComponent");
    }

    public final Object[] A0k() {
        return new Object[]{Boolean.valueOf(this.A04), this.A02, this.A03, this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C06974ih c06974ih;
        Uri uri = this.A00;
        boolean z = this.A04;
        boolean A1X = 1BL.A1X(r302, uri);
        if (z) {
            C07004ik A00 = C06984ii.A00();
            A00.A0J = A1X;
            c06974ih = new C06974ih(A00);
        } else {
            c06974ih = null;
        }
        C1rq A01 = C1rg.A01(r302, null, 0);
        A01.A0z(36.0f);
        A01.A0F("android.widget.Button");
        A01.A1I(2132410440);
        A01.A2T(1LI.A06(r302, C7g4.class, "RowSelectorImageComponent"));
        A01.A1J(2131964716);
        A01.A2K("messaging_suggested_sticker_emoji_gif_selector_icon");
        5BH A012 = 5BG.A01(r302);
        A012.A2X(uri);
        A012.A2Z(c06974ih);
        A012.A24(C26z.ALL, 4.0f);
        A012.A1n(1LI.A09(r302, C7g4.class, "RowSelectorImageComponent", -1132621385));
        A01.A2e(A012);
        return A01.A00;
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        return 4YV.A0M(c1qp);
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [X.7GA, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [X.7GA, java.lang.Object] */
    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        6Sh r308;
        1Im r309;
        int i = r302.A01;
        if (i == -1351902487) {
            1Iv r0 = r302.A00;
            1Is r02 = r0.A01;
            1Iw r03 = r0.A00;
            r308 = ((C7g4) r02).A02;
            11T.A0H(r03, r308);
            1LI r04 = r03.A02;
            if (r04 == null) {
                return null;
            }
            r309 = ((C7g4) r04).A01;
            if (r309 == null) {
                return null;
            }
            7Ay r05 = 7Ay.A02;
            ?? obj2 = new Object();
            ((7GA) obj2).A00 = r05;
            r309.A00((Object) obj2);
        } else {
            if (i != -1132621385) {
                4YV.A1G(r302, obj, i);
                return null;
            }
            1Iv r06 = r302.A00;
            1Is r07 = r06.A01;
            1Iw r08 = r06.A00;
            r308 = ((C7g4) r07).A03;
            11T.A0H(r08, r308);
            1LI r09 = r08.A02;
            if (r09 == null) {
                return null;
            }
            r309 = ((C7g4) r09).A01;
            if (r309 == null) {
                return null;
            }
        }
        ?? obj3 = new Object();
        ((7GA) obj3).A00 = r308;
        r309.A00((Object) obj3);
        return null;
    }
}
