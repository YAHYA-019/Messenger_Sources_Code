package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.litho.LithoView;
import com.mapbox.mapboxsdk.location.LocationComponentOptions;

/* renamed from: X.Gbl, reason: case insensitive filesystem */
/* loaded from: Gbl.class */
public final class C2384Gbl extends 1pK {
    public static final String __redex_internal_original_name = "EndedCallSurveyFragment";
    public long A00;
    public HVc A01;
    public IEA A02;
    public JMS A03;
    public boolean A05;
    public boolean A06;
    public FbUserSession A07;
    public final boolean A0E;
    public final boolean A0F;
    public final 1Br A0C = 7zM.A0U();
    public final 1Br A09 = 1Bu.A02(this, 114885);
    public final 1Br A0D = 1BK.A0C();
    public final 1Br A0B = 1BK.A0E();
    public final 1Br A0A = 1Bq.A00(115690);
    public final 1Br A08 = 1Bu.A02(this, 114982);
    public String A04 = "";

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0080, code lost:
    
        if (X.1Br.A07(r301.A0D).AZk(36323586394442504L) == false) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2384Gbl() {
        /*
            r301 = this;
            r0 = r301
            r0.<init>()
            X.1Br r0 = X.7zM.A0U()
            r302 = r0
            r0 = r301
            r1 = r302
            r0.A0C = r1
            r0 = r301
            r1 = 114885(0x1c0c5, float:1.60988E-40)
            X.1Br r0 = X.1Bu.A02(r0, r1)
            r302 = r0
            r0 = r301
            r1 = r302
            r0.A09 = r1
            X.1Br r0 = X.1BK.A0C()
            r302 = r0
            r0 = r301
            r1 = r302
            r0.A0D = r1
            X.1Br r0 = X.1BK.A0E()
            r302 = r0
            r0 = r301
            r1 = r302
            r0.A0B = r1
            r0 = 115690(0x1c3ea, float:1.62116E-40)
            X.1Br r0 = X.1Bq.A00(r0)
            r302 = r0
            r0 = r301
            r1 = r302
            r0.A0A = r1
            r0 = r301
            r1 = 114982(0x1c126, float:1.61124E-40)
            X.1Br r0 = X.1Bu.A02(r0, r1)
            r302 = r0
            r0 = r301
            r1 = r302
            r0.A08 = r1
            r0 = r301
            java.lang.String r1 = ""
            r0.A04 = r1
            r0 = r301
            X.1Br r0 = r0.A0D
            r302 = r0
            r0 = r302
            X.2yD r0 = X.1Br.A07(r0)
            r303 = r0
            r0 = 36323586394770189(0x810c1c00074b0d, double:3.034520527170611E-306)
            r304 = r0
            r0 = r303
            r1 = r304
            boolean r0 = r0.AZk(r1)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L83
            r0 = r301
            X.1Br r0 = r0.A0D
            r302 = r0
            r0 = r302
            X.2yD r0 = X.1Br.A07(r0)
            r303 = r0
            r0 = 36323586394442504(0x810c1c00024b08, double:3.034520526963382E-306)
            r304 = r0
            r0 = r303
            r1 = r304
            boolean r0 = r0.AZk(r1)
            r307 = r0
            r0 = 1
            r306 = r0
            r0 = r307
            if (r0 != 0) goto L88
        L83:
            r0 = 0
            r306 = r0
            r0 = 0
            r302 = r0
        L88:
            r0 = r301
            r1 = r306
            r0.A0F = r1
            r0 = r301
            X.1Br r0 = r0.A0D
            X.2yD r0 = X.1Br.A07(r0)
            r1 = 36323586394966800(0x810c1c000a4b10, double:3.0345205272949487E-306)
            boolean r0 = r0.AZk(r1)
            r306 = r0
            r0 = r301
            r1 = r306
            r0.A0E = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2384Gbl.<init>():void");
    }

    private final void A03(View view, int i) {
        View requireViewById = view.requireViewById(2131368410);
        11T.A0A(requireViewById);
        requireViewById.setVisibility(4);
        View A0B = DKG.A0B(view, 2131368408);
        int i2 = 2131368042;
        if (i == 5) {
            i2 = 2131368044;
        }
        ImageView imageView = (ImageView) DKG.A0B(view, i2);
        imageView.setBackgroundResource(2132410599);
        GOn.A1P(imageView, C1u3.A42, 7zP.A0S(this.A0C));
        if (i == 1) {
            imageView.setRotation(180.0f);
        }
        imageView.setOnClickListener(new LKI(i, 1, view, A0B, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.Gbk, androidx.fragment.app.Fragment] */
    public static final void A06(View view, ViewGroup viewGroup, C2384Gbl c2384Gbl, int i) {
        HVc hVc;
        if (i < 3) {
            if (!1Br.A07(c2384Gbl.A0D).AZk(2342158873256994337L)) {
                ((Ifq) 1Br.A0B(c2384Gbl.A09)).D0M(i, null);
                return;
            }
            boolean z = c2384Gbl.A05;
            Bundle A05 = 1BK.A05();
            ?? c2383Gbk = new C2383Gbk();
            c2383Gbk.setArguments(A05);
            c2383Gbk.A0B = z;
            c2383Gbk.A05 = new HVH(c2384Gbl);
            c2383Gbk.A00 = i;
            view.postDelayed(new Iws(c2383Gbk, c2384Gbl), 800L);
            return;
        }
        TextView A06 = AbF.A06(view, 2131366810);
        if (!c2384Gbl.A06 && A06 != null) {
            A06.setText(2131966817);
        }
        JMS jms = c2384Gbl.A03;
        if (jms != null) {
            jms.CPZ(c2384Gbl.getContext(), (String) null, (String) null, (String) null, i);
        }
        viewGroup.postDelayed(new Ire(viewGroup), 800L);
        if ((c2384Gbl.A0E && c2384Gbl.A06) || (hVc = c2384Gbl.A01) == null) {
            return;
        }
        GQy.A09(hVc.A00, "thanks_feedback_timeout", 3000L);
    }

    public 1iF A1R() {
        return GOq.A0U();
    }

    public void onAttach(Context context) {
        11T.A0F(context, 0);
        super.onAttach(context);
        this.A03 = HKy.A00(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A02 = 0FI.A02(378924614);
        11T.A0F(layoutInflater, 0);
        FbUserSession A01 = 1BM.A01(this);
        this.A07 = A01;
        if (A01 == null) {
            str = "fbUserSession";
        } else {
            this.A02 = (IEA) 7zN.A0m(this, A01, 115612);
            View inflate = layoutInflater.inflate(this.A0F ? 2132541935 : 2132541934, viewGroup, false);
            C00i c00i = this.A09.A00;
            Ifq ifq = (Ifq) c00i.get();
            Context requireContext = requireContext();
            GR0 gr0 = ((HuL) 1Br.A0B(this.A08)).A02;
            if (gr0 != null) {
                String string = requireArguments().getString("localCallId");
                if (string == null) {
                    IllegalStateException A0h = 1BK.A0h();
                    0FI.A08(-1642015136, A02);
                    throw A0h;
                }
                IEA iea = this.A02;
                1Br.A0C(ifq.A0F);
                ifq.A02 = new GQz(requireContext, gr0, GOp.A0w(ifq.A0D));
                ifq.A03 = null;
                ifq.A05 = string;
                ifq.A01 = iea;
                inflate.setBackgroundColor(-16777216);
                C00i c00i2 = this.A0C.A00;
                C1u2 c1u2 = (C1u2) c00i2.get();
                C1u3 c1u3 = C1u3.A1w;
                C1u4 c1u4 = C1u4.SIZE_32;
                Drawable A07 = c1u2.A07(c1u3);
                ImageView A0I = GOn.A0I(inflate, 2131363898);
                if (A0I != null) {
                    A0I.setImageDrawable(A07);
                }
                View findViewById = inflate.findViewById(2131363897);
                if (findViewById != null) {
                    IKB.A00(findViewById, this, 6);
                    C2rp.A01(findViewById);
                }
                I5D.A00(this.A0A).markerPoint(887560851, "rating_displayed");
                HVc hVc = this.A01;
                if (hVc != null) {
                    GQy.A09(hVc.A00, "survey_timeout", LocationComponentOptions.STALE_STATE_DELAY_MS);
                }
                if (((Ifq) c00i.get()).A05()) {
                    A03(inflate, 5);
                    A03(inflate, 1);
                    ((Ifq) c00i.get()).A03(1);
                } else {
                    View requireViewById = inflate.requireViewById(2131368408);
                    11T.A0A(requireViewById);
                    requireViewById.setVisibility(4);
                    ViewGroup viewGroup2 = (ViewGroup) DKG.A0B(inflate, 2131368410);
                    int childCount = viewGroup2.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = viewGroup2.getChildAt(i);
                        11T.A0I(childAt, DKB.A00(ActionId.RTMP_CONNECTION_CONNECTED));
                        ImageView imageView = (ImageView) childAt;
                        imageView.setImageResource(((C1u2) c00i2.get()).A04(C1u3.A63, c1u4));
                        imageView.setOnClickListener(new LKI(i, 2, inflate, viewGroup2, this));
                    }
                    ((Ifq) c00i.get()).A03(0);
                }
                0FI.A08(1569172794, A02);
                return inflate;
            }
            str = "fragmentManagerProvider";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroyView() {
        int A02 = 0FI.A02(1947323712);
        I5D.A00(this.A0A).markerPoint(887560851, "rating_dismissed");
        super/*androidx.fragment.app.Fragment*/.onDestroyView();
        0FI.A08(-1471770556, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v58, types: [X.Dg5, X.Dg6, X.Dfl] */
    public void onViewCreated(View view, Bundle bundle) {
        String formatStrLocaleSafe;
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        if (this.A0F) {
            TextView A06 = AbF.A06(view, 2131362761);
            Resources A0D = 7zO.A0D(this);
            long A062 = 4YU.A06(this.A00);
            long j = A062 / 3600;
            long j2 = A062 - (3600 * j);
            long j3 = 60;
            long j4 = j2 / j3;
            long j5 = j2 - (j3 * j4);
            if (j == 0) {
                formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%d:%02d", Long.valueOf(j4), Long.valueOf(j5));
            } else {
                formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe(4YT.A00(483), Long.valueOf(j), Long.valueOf(j4), Long.valueOf(j5));
            }
            11T.A0D(formatStrLocaleSafe);
            A06.setText(4YU.A0u(A0D, formatStrLocaleSafe, 2131967833));
            LithoView lithoView = (LithoView) DKG.A0B(requireView(), 2131366696);
            1Iw r0 = new 1Iw(view.getContext());
            2cM A00 = 2cK.A00(r0);
            A00.A2b();
            ?? abstractC2157Dfl = new AbstractC2157Dfl(r0);
            abstractC2157Dfl.A0f(this.A04);
            abstractC2157Dfl.A07 = "Profile Picture";
            abstractC2157Dfl.A04 = ENi.A01;
            abstractC2157Dfl.A00 = ENG.A0C.mSizeDip;
            A00.A2e(abstractC2157Dfl.A0O(CallerContext.A0B(__redex_internal_original_name)));
            lithoView.A0x(A00.A00);
            view.findViewById(2131366676).setOnClickListener(new FXr(r0, ActionId.RTMP_CONNECTION_RELEASE));
        }
    }
}
