package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.montage.model.MontageBucketPreview;
import com.facebook.messaging.montage.model.MontageCard;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.5S2, reason: invalid class name */
/* loaded from: 5S2.class */
public final class C5S2 extends C1rj {
    public FbUserSession A00;
    public MontageBucketPreview A01;
    public 5S3 A02;
    public MigColorScheme A03;
    public C2fr A04;

    public C5S2() {
        super("MontageThreadImageComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A03, this.A00, this.A01, this.A02, this.A04};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        String string;
        5S4 A00 = r302.A06().A00();
        FbUserSession fbUserSession = this.A00;
        C2fr c2fr = this.A04;
        MontageBucketPreview montageBucketPreview = this.A01;
        MigColorScheme migColorScheme = this.A03;
        boolean z = A00.A00;
        11T.A0F(fbUserSession, 1);
        11T.A0F(montageBucketPreview, 3);
        11T.A0F(migColorScheme, 4);
        53G r0 = (53G) 1Bi.A03(84456);
        Context context = r302.A0D;
        11T.A0A(context);
        C2fz c2fz = (C2fz) 1Lo.A04(context, fbUserSession, (1BY) null, 33235);
        C2pz A002 = C2px.A00(r302);
        A002.A2X(C2q0.A08);
        A002.A2Z(c2fr);
        A002.A2Y(migColorScheme);
        if (c2fz.A00(montageBucketPreview)) {
            if (!c2fz.A00(montageBucketPreview)) {
                throw 1BK.A0g();
            }
            boolean A01 = r0.A01(montageBucketPreview.A02.A00);
            boolean z2 = montageBucketPreview.A09;
            int B87 = ((!z2 || A01) ? 0S2.A01 : 0S2.A0C).intValue() != 1 ? migColorScheme.B87() : migColorScheme.B86();
            C2px c2px = A002.A01;
            c2px.A00 = B87;
            A002.A0z(56.0f);
            float f = 1.0f;
            if (z) {
                f = 0.9f;
            }
            A002.A0v(f);
            A002.A2L("montage_press");
            A002.A1x(5Rn.A01);
            Integer num = 0S2.A01;
            A002.A1s(1LI.A02(r302, C5S2.class, num, "MontageThreadImageComponent", (Object[]) null, -1336101728));
            c2px.A02 = 1LI.A02(r302, C5S2.class, num, "MontageThreadImageComponent", (Object[]) null, 792338070);
            A002.A1v(1LI.A02(r302, C5S2.class, num, "MontageThreadImageComponent", new Object[]{montageBucketPreview}, 1776021484));
            A002.A25(C26z.RIGHT, 0.0f);
            if (montageBucketPreview.A0A) {
                string = context.getResources().getString(2131960685);
            } else {
                String str = montageBucketPreview.A08;
                Resources resources = context.getResources();
                int i = 2131960684;
                if (z2) {
                    i = 2131960745;
                }
                string = resources.getString(i, str);
            }
            11T.A0A(string);
            A002.A2S(string);
        }
        if (c2fz.A00(montageBucketPreview) && montageBucketPreview.A09 && !((C5S5) c2fz.A02.A00.get()).A01.AZk(36324926425026772L)) {
            final MontageCard montageCard = montageBucketPreview.A04;
            A002.A01.A03 = new 3xV(montageCard) { // from class: X.5S6
                public final MontageCard A00;

                {
                    this.A00 = montageCard;
                }

                public 1LI ALG(C5S8 c5s8) {
                    85R r02 = new 85R(c5s8.A01, new C5S9());
                    float f2 = c5s8.A00;
                    r02.A0z(f2);
                    r02.A0l(f2);
                    MontageCard montageCard2 = this.A00;
                    C5S9 c5s9 = r02.A01;
                    c5s9.A01 = montageCard2;
                    r02.A02.set(0);
                    c5s9.A00 = 5SA.A00();
                    r02.A2T(c5s8.A02);
                    return r02.A2W();
                }
            };
        }
        return A002.A2W();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        Object[] objArr;
        Boolean bool;
        switch (r302.A01) {
            case -1336101728:
                1Iw r0 = r302.A00.A00;
                MotionEvent motionEvent = ((3xE) obj).A00;
                11T.A0F(r0, 0);
                11T.A0F(motionEvent, 1);
                int action = motionEvent.getAction();
                if (action != 0) {
                    if ((action == 1 || action == 3) && r0.A02 != null) {
                        objArr = new Object[1];
                        bool = false;
                        objArr[0] = bool;
                        r0.A0G(new C2l4(objArr, 0), "updateState:MontageThreadImageComponent.updatePressedState");
                    }
                } else if (r0.A02 != null) {
                    objArr = new Object[1];
                    bool = true;
                    objArr[0] = bool;
                    r0.A0G(new C2l4(objArr, 0), "updateState:MontageThreadImageComponent.updatePressedState");
                }
                return false;
            case -1048037474:
                1LI.A0J(r302, obj);
                return null;
            case 792338070:
                C5S2 c5s2 = (C5S2) r302.A00.A01;
                C2fr c2fr = c5s2.A04;
                MontageBucketPreview montageBucketPreview = c5s2.A01;
                final 5S3 r02 = c5s2.A02;
                11T.A0F(c2fr, 1);
                11T.A0F(montageBucketPreview, 2);
                11T.A0F(r02, 3);
                final long j = montageBucketPreview.A02.A00;
                boolean z = false;
                if (c2fr.BFg() == C2fd.A01) {
                    z = true;
                }
                final boolean z2 = z;
                ((9Yi) r02.A03.A00.get()).A00(r02.A00, r02.A01, new 67O() { // from class: X.3Yh
                    public static final String __redex_internal_original_name = "MontageThreadImageListener$onMontageTileClicked$listener$1";

                    public void Bml(Object obj2) {
                    }

                    public void BqY(Object obj2) {
                        5S3 r03 = r02;
                        ((2BQ) 1Br.A0B(r03.A02)).A01("free_messenger_my_day_interstitial");
                        r03.A04.C7O(j, z2);
                    }
                });
                return null;
            case 1776021484:
                1Iv r03 = r302.A00;
                1Is r04 = r03.A01;
                1Iw r05 = r03.A00;
                MontageBucketPreview montageBucketPreview2 = (MontageBucketPreview) r302.A03[0];
                FbUserSession fbUserSession = ((C5S2) r04).A00;
                11T.A0F(r05, 0);
                11T.A0F(fbUserSession, 1);
                11T.A0F(montageBucketPreview2, 2);
                Context context = r05.A0D;
                11T.A0A(context);
                long j2 = montageBucketPreview2.A02.A00;
                1Bi.A03(68571);
                ((C5ag) 1Bn.A0E(context, (1BY) null, 49793)).A01(fbUserSession, C5ah.PREFETCH_STORIES_ONLY, j2);
                return null;
            default:
                return null;
        }
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
