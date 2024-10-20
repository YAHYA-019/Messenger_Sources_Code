package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.resources.ui.FbTextView;
import java.util.concurrent.Executor;

/* loaded from: Hqk.class */
public final class Hqk {
    public View A00;
    public View A01;
    public View A02;
    public ImageView A03;
    public ImageView A04;
    public ImageView A05;
    public 1BY A06;
    public LithoView A07;
    public FbTextView A08;
    public FbTextView A09;
    public FbTextView A0A;
    public final C00i A0B;
    public final C00i A0C;
    public final 9KG A0D;
    public final float A0F;
    public final float A0G;
    public final C00i A0J;
    public final 1qI A0K;
    public final boolean A0L;
    public final MigColorScheme A0E = (MigColorScheme) 1Bn.A0B(16979);
    public final C1u2 A0I = 7zP.A0R();
    public final C09964s0 A0H = (C09964s0) 1Bi.A03(49322);

    public Hqk(1BO r302) {
        1qI r0 = (1qI) 1Bi.A03(66409);
        this.A0K = r0;
        this.A0D = (9KG) 1Bn.A0E((Context) null, (1BY) null, 67867);
        this.A0J = 1BQ.A02(66227);
        this.A0B = 1BV.A01((1BY) null, 49262);
        this.A0C = 1BV.A01((1BY) null, 114690);
        float f = 0.43f;
        float f2 = 0.044f;
        boolean AZk = 1qI.A02(r0).AZk(36322796130158506L);
        this.A0L = AZk;
        this.A0G = AZk ? 0.29f : f;
        this.A0F = AZk ? 0.02f : f2;
        this.A06 = 7zL.A0Q(r302);
    }

    public void A00(View view, FbUserSession fbUserSession, JL4 jl4, C6r6 c6r6) {
        View findViewById;
        this.A01 = view.findViewById(2131367680);
        this.A02 = view.findViewById(2131367681);
        this.A00 = view.findViewById(2131367682);
        this.A07 = (LithoView) view.findViewById(2131366829);
        this.A05 = GOn.A0I(view, 2131366092);
        this.A0A = DKC.A0e(view, 2131366094);
        this.A04 = GOn.A0I(view, 2131366089);
        this.A09 = DKC.A0e(view, 2131366091);
        this.A03 = GOn.A0I(view, 2131366095);
        this.A08 = DKC.A0e(view, 2131366097);
        MigColorScheme migColorScheme = this.A0E;
        MigColorScheme.A00(view, migColorScheme);
        C09964s0 c09964s0 = this.A0H;
        int min = Math.min(c09964s0.A06(), c09964s0.A08());
        ViewGroup.LayoutParams layoutParams = this.A01.getLayoutParams();
        float f = min;
        int i = (int) (this.A0G * f);
        layoutParams.width = i;
        ViewGroup.MarginLayoutParams A0I = DKC.A0I(this.A02);
        ((ViewGroup.LayoutParams) A0I).width = i;
        int i2 = (int) (this.A0F * f);
        A0I.setMargins(i2, 0, 0, 0);
        A0I.setMarginStart(i2);
        ViewGroup.MarginLayoutParams A0I2 = DKC.A0I(this.A00);
        ((ViewGroup.LayoutParams) A0I2).width = i;
        A0I2.setMargins(0, 0, i2, 0);
        A0I2.setMarginEnd(i2);
        this.A01.setLayoutParams(layoutParams);
        this.A02.setLayoutParams(A0I);
        this.A00.setLayoutParams(A0I2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(7zL.A01(view.getResources(), 2132279311));
        gradientDrawable.setColor(migColorScheme.AmV());
        this.A01.setBackground(gradientDrawable);
        this.A02.setBackground(gradientDrawable);
        this.A00.setBackground(gradientDrawable);
        ImageView imageView = this.A05;
        C1u2 c1u2 = this.A0I;
        GOo.A1E(imageView, C1u3.A6P, c1u2, migColorScheme.B4i());
        GOo.A1E(this.A04, C1u3.A1K, c1u2, migColorScheme.B4i());
        GOo.A1E(this.A03, C1u3.A3Q, c1u2, migColorScheme.B4i());
        AbH.A1M(this.A0A, migColorScheme);
        AbH.A1M(this.A09, migColorScheme);
        AbH.A1M(this.A08, migColorScheme);
        View requireViewById = view.requireViewById(2131367680);
        if (((C1uz) this.A0J.get()).A02(37)) {
            C2rp.A01(requireViewById);
            IKE.A01(requireViewById, jl4, 54);
        } else {
            requireViewById.setVisibility(8);
        }
        View findViewById2 = view.findViewById(2131367681);
        C2rp.A01(findViewById2);
        IKE.A01(findViewById2, jl4, 55);
        if (this.A0L && (findViewById = view.findViewById(2131367682)) != null) {
            C2rp.A01(findViewById);
            findViewById.setVisibility(0);
            ((C08664ng) this.A0B.get()).A01(HCb.A02, c6r6 == null ? "" : c6r6.toString());
            findViewById.setOnClickListener(new IK1(2, this, jl4, c6r6));
        }
        int i3 = (int) (0.29f * f);
        if (this.A0D.A00.AZk(72340666742476799L)) {
            Executor A1D = AbJ.A1D();
            HUi hUi = (HUi) 1Bn.A0E((Context) null, this.A06, 115600);
            Context context = this.A07.getContext();
            boolean A1X = 1BL.A1X(fbUserSession, context);
            GraphQlQueryParamSet A0M = 7zL.A0M();
            A0M.A05(AbE.A00(436), "COLLECTION_1");
            C3sa A0L = 7zM.A0L(A0M, new 2Jf(2JX.class, (Class) null, "MessengerReadyMadeContentCollectionQuery", (String) null, "fbandroid", -513800570, 0, 2094514339L, 2094514339L, false, A1X));
            A0L.A0A(86400L);
            A0L.A09(86400L);
            1Kd.A0F(new FwB(jl4, this, c6r6, 1BL.A0W(), i3, i2), 2FP.A02(Imu.A00, 7zR.A0n(context, A0L), 4YV.A11(hUi.A00)), A1D);
        }
    }
}
