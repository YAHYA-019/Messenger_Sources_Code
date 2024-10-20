package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.inject.FbInjector;
import com.facebook.widget.CustomFrameLayout;

/* loaded from: H50.class */
public final class H50 extends CustomFrameLayout implements CallerContextable {
    public static final CallerContext A03 = CallerContext.A0A(H50.class, "messenger_montage_art_prefetch", "art_item_drawee_load");
    public static final String __redex_internal_original_name = "BasketArtItemView";
    public final FbDraweeView A00;
    public final 1Br A01;
    public final RJE A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H50(Context context) {
        super(context, null, 0);
        11T.A0F(context, 1);
        this.A01 = 1Bu.A00(498);
        A0U(2132541564);
        this.A00 = DKC.A0M(this, 2131362386);
        C1F6 A0I = GOp.A0I(this.A01);
        FbDraweeView A0M = DKC.A0M(this, 2131362387);
        Context A01 = FbInjector.A01();
        AbL.A0y(A0I);
        try {
            RJE rje = new RJE(A0M);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A02 = rje;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public final void A0V(HAR har) {
        int i;
        5YB r305;
        RJE rje = this.A02;
        if (har == HAR.A02) {
            r305 = rje.A00;
            i = 8;
        } else {
            if (har != HAR.A03 && har != HAR.A05 && har != HAR.A04 && har != HAR.A06) {
                return;
            }
            HQt hQt = (HQt) rje.A01.get();
            5YB r3052 = rje.A00;
            new I5M(r3052, hQt.A00).A01(0.75f);
            i = 0;
            r305 = r3052;
        }
        r305.setVisibility(i);
    }
}
