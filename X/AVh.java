package X;

import android.content.Context;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.highlightstab.immersivecolorschemes.HTImmersiveFixedColorScheme;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;
import kotlin.jvm.functions.Function2;

/* loaded from: AVh.class */
public final class AVh extends C00q implements Function2 {
    public final /* synthetic */ int $backgroundColor;
    public final /* synthetic */ C1rn[] $cardTranslationYInPxs;
    public final /* synthetic */ C1rn[] $cardVisibilityPercentages;
    public final /* synthetic */ C2lh $firstVisibleItemPosition;
    public final /* synthetic */ HTImmersiveFixedColorScheme $fixedColorScheme;
    public final /* synthetic */ float $statusBarHeightInPx;
    public final /* synthetic */ C2k5 $this_render;
    public final /* synthetic */ C8i2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AVh(C2k5 c2k5, C2lh c2lh, C8i2 c8i2, HTImmersiveFixedColorScheme hTImmersiveFixedColorScheme, C1rn[] c1rnArr, C1rn[] c1rnArr2, float f, int i) {
        super(2);
        this.this$0 = c8i2;
        this.$cardVisibilityPercentages = c1rnArr;
        this.$cardTranslationYInPxs = c1rnArr2;
        this.$backgroundColor = i;
        this.$fixedColorScheme = hTImmersiveFixedColorScheme;
        this.$statusBarHeightInPx = f;
        this.$firstVisibleItemPosition = c2lh;
        this.$this_render = c2k5;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C9sl c9sl = (C9sl) obj;
        final HighlightsFeedContent highlightsFeedContent = (HighlightsFeedContent) obj2;
        1BK.A1M(c9sl, highlightsFeedContent);
        C8i2 c8i2 = this.this$0;
        long j = C8i2.A0D;
        final int indexOf = c8i2.A05.A00().A01.indexOf(highlightsFeedContent);
        final int i = indexOf % 20;
        C8i2 c8i22 = this.this$0;
        final FbUserSession fbUserSession = c8i22.A02;
        final C9yk c9yk = c8i22.A08;
        final C1rn[] c1rnArr = this.$cardVisibilityPercentages;
        final C1rn[] c1rnArr2 = this.$cardTranslationYInPxs;
        final int i2 = this.$backgroundColor;
        final HTImmersiveFixedColorScheme hTImmersiveFixedColorScheme = this.$fixedColorScheme;
        final float f = this.$statusBarHeightInPx;
        final 06Z r0 = c8i22.A01;
        final boolean z = c8i22.A0B;
        final View view = c8i22.A00;
        final AZg aZg = c8i22.A09;
        final 9Tf r02 = c8i22.A07;
        final boolean A1Q = AnonymousClass001.A1Q(indexOf, 7zP.A01(this.$firstVisibleItemPosition));
        1LH r03 = new 1LH(view, r0, fbUserSession, hTImmersiveFixedColorScheme, r02, highlightsFeedContent, c9yk, aZg, c1rnArr, c1rnArr2, f, indexOf, i, i2, z, A1Q) { // from class: X.8eg
            public final View A00;
            public final 06Z A01;
            public final 9Tf A02;
            public final AZg A03;
            public final float A04;
            public final int A05;
            public final int A06;
            public final int A07;
            public final FbUserSession A08;
            public final HTImmersiveFixedColorScheme A09;
            public final HighlightsFeedContent A0A;
            public final C9yk A0B;
            public final boolean A0C;
            public final boolean A0D;
            public final C1rn[] A0E;
            public final C1rn[] A0F;

            {
                11T.A0F(fbUserSession, 1);
                1BL.A1G(c9yk, c1rnArr);
                11T.A0F(c1rnArr2, 7);
                7zP.A1O(hTImmersiveFixedColorScheme, 9, r0);
                7zP.A1Q(view, 13, aZg);
                11T.A0F(r02, 15);
                this.A08 = fbUserSession;
                this.A0A = highlightsFeedContent;
                this.A05 = indexOf;
                this.A07 = i;
                this.A0B = c9yk;
                this.A0F = c1rnArr;
                this.A0E = c1rnArr2;
                this.A06 = i2;
                this.A09 = hTImmersiveFixedColorScheme;
                this.A04 = f;
                this.A01 = r0;
                this.A0D = z;
                this.A00 = view;
                this.A03 = aZg;
                this.A02 = r02;
                this.A0C = A1Q;
            }

            public 1LI A0s(C2k5 c2k5) {
                11T.A0F(c2k5, 0);
                HighlightsFeedContent highlightsFeedContent2 = this.A0A;
                C9yk c9yk2 = this.A0B;
                HTImmersiveFixedColorScheme hTImmersiveFixedColorScheme2 = this.A09;
                Context A00 = 3vP.A00(c2k5);
                2cL r311 = null;
                Context A002 = 3vP.A00(c2k5);
                06Z r04 = this.A01;
                95J r05 = 95J.A02;
                View view2 = this.A00;
                AZg aZg2 = this.A03;
                9Tf r06 = this.A02;
                9Wd r07 = (9Wd) C1Y6.A00(A00, "com_facebook_messaging_highlightstab_immersiveuicomponents_featurecontentview_plugins_interfaces_cards_HTImmersiveCardViewInterfaceSpec", "All", new Object[]{A002, highlightsFeedContent2, c9yk2, r04, r05, hTImmersiveFixedColorScheme2, view2, aZg2, r06});
                int i3 = highlightsFeedContent2.A05;
                9X8 A003 = r07.A00(i3);
                if (A003 == null) {
                    A003 = r07.A00(i3 + 1000);
                }
                int i4 = this.A05;
                float f2 = this.A04;
                C1rn[] c1rnArr3 = this.A0E;
                int i5 = this.A07;
                9SW r08 = new 9SW(c1rnArr3[i5], hTImmersiveFixedColorScheme2, f2, i4);
                if (A003 != null) {
                    1LI A004 = A003.A00(this.A08, c2k5, r08);
                    2lQ r09 = 2lO.A02;
                    if (highlightsFeedContent2.A0p) {
                        C9mV.A03.A03(3vP.A00(c2k5));
                    }
                    11T.A0F(this.A0F[i5], 2);
                    C2sn A0L = 7zR.A0L(c2k5);
                    A0L.A00(A004);
                    A0L.A00(new 8ZB(r06, highlightsFeedContent2, i4, this.A0C));
                    8O3 A005 = 8nD.A00(A0L.A00);
                    A005.A0l(C9mV.A03.A03(3vP.A00(A0L)));
                    A005.A01.A00 = 7zL.A05(A005, 2132279365);
                    A005.A0e();
                    A005.A0c();
                    A005.A1X(2132279325);
                    A005.A01.A01 = this.A06;
                    A005.A0J();
                    r311 = 7zM.A0l(A005.A01, A0L, c2k5, r09);
                }
                return r311;
            }
        };
        AZg aZg2 = this.this$0.A09;
        Object obj3 = highlightsFeedContent;
        if (highlightsFeedContent.A05 == C5by.A0D.value) {
            obj3 = C95j.A04;
        }
        return C9dF.A01(C9dF.A00(r03, this.$this_render, new 8Ke(obj3, indexOf, 0, -1, false), aZg2), C9iN.A01(c9sl), highlightsFeedContent);
    }
}
