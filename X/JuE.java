package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.lifecycle.ViewModelProvider;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;

/* loaded from: JuE.class */
public final class JuE extends E1z {
    public static final String __redex_internal_original_name = "FxDecalFragment";
    public FbUserSession A00;
    public C3025Jgo A01;
    public final 1Br A05 = 1Bu.A02(this, 114840);
    public final 1Br A03 = 1Bu.A00(99816);
    public final 1Br A04 = 1Bu.A00(98541);
    public final 1Br A06 = 7zM.A0S();
    public final View.OnClickListener A02 = LKO.A00(this, 67);

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A03(JuE juE) {
        F9e f9e = (F9e) 1Br.A0B(juE.A03);
        Context requireContext = juE.requireContext();
        MigColorScheme migColorScheme = ((BJB) juE).A01;
        11T.A0A(migColorScheme);
        f9e.A02(requireContext, new LFM(juE, 10), migColorScheme, null);
    }

    public 1iF A1R() {
        return new 1iF(141073731263171L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        this.A00 = 1BM.A01(this);
        C3025Jgo c3025Jgo = (C3025Jgo) new ViewModelProvider(requireActivity()).get(C3025Jgo.class);
        this.A01 = c3025Jgo;
        if (c3025Jgo != null) {
            String string = requireArguments().getString("ACCOUNT_ID", "");
            11T.A0A(string);
            String string2 = requireArguments().getString("ACCOUNT_TYPE", "");
            11T.A0A(string2);
            c3025Jgo.A01 = string;
            c3025Jgo.A02 = string2;
            F4E f4e = (F4E) 1Br.A0B(this.A04);
            C3025Jgo c3025Jgo2 = this.A01;
            if (c3025Jgo2 != null) {
                F4E.A00(f4e, "unlink_accounts_initiated", c3025Jgo2.A01, (String) null);
                requireActivity().B03().A06(new JZh(this), this);
                return;
            }
        }
        11T.A0L("contentViewModel");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1c() {
        LithoView lithoView = ((BJB) this).A00;
        if (lithoView == null || getContext() == null) {
            return;
        }
        C3025Jgo c3025Jgo = this.A01;
        if (c3025Jgo != null) {
            if (c3025Jgo.A00 == null) {
                return;
            }
            A1b();
            1Iw r0 = new 1Iw(requireContext());
            MigColorScheme migColorScheme = ((BJB) this).A01;
            11T.A0A(migColorScheme);
            F4E f4e = (F4E) 1Br.A0B(this.A04);
            C3025Jgo c3025Jgo2 = this.A01;
            if (c3025Jgo2 != null) {
                F4E.A00(f4e, "unlink_accounts_screen_shown", c3025Jgo2.A01, (String) null);
                C5yw A00 = C5yv.A00(r0);
                A00.A2f("");
                A00.A2X();
                A00.A2i(false);
                A00.A2b(migColorScheme);
                A00.A2d(new LX8(this, 1));
                C5yv A2V = A00.A2V();
                C3025Jgo c3025Jgo3 = this.A01;
                if (c3025Jgo3 != null) {
                    2JX r02 = c3025Jgo3.A00;
                    if (r02 == null) {
                        throw 1BK.A0h();
                    }
                    2JY A0K = r02.A0K(1648206760, 2JX.class, -287019037);
                    11T.A0A(A0K);
                    ImmutableList A0b = 1BK.A0b();
                    ImmutableList A0b2 = 1BK.A0b();
                    String A0r = A0K.A0r(-986761940);
                    String A0r2 = A0K.A0r(624198946);
                    String A0r3 = A0K.A0r(-1556382642);
                    String A0r4 = A0K.A0r(-1976136773);
                    View.OnClickListener onClickListener = this.A02;
                    ImmutableList A0c = A0K.A0c(1380523274, 2JX.class, 1740433324);
                    if (A0c != null) {
                        A0b = A0c;
                    }
                    lithoView.A0x(new Duz(A2V, new QFp(new ROt(onClickListener, (View.OnClickListener) null, A0b2, A0b, A0r3, A0r4, (String) null, A0r2, A0r), migColorScheme)));
                    7zP.A0e(this.A06).markerEnd(857812687, (short) 2);
                    return;
                }
            }
        }
        11T.A0L("contentViewModel");
        throw 0Q8.createAndThrow();
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        11T.A0F(view, 0);
        super/*X.1pK*/.onViewCreated(view, bundle);
        C3025Jgo c3025Jgo = this.A01;
        if (c3025Jgo == null) {
            str = "contentViewModel";
        } else {
            if (c3025Jgo.A00 != null) {
                return;
            }
            A1e();
            Kj2 kj2 = (Kj2) 1Br.A0B(this.A05);
            if (this.A00 == null) {
                str = "fbUserSession";
            } else {
                C3025Jgo c3025Jgo2 = this.A01;
                str = "contentViewModel";
                if (c3025Jgo2 != null) {
                    String str2 = c3025Jgo2.A01;
                    String str3 = c3025Jgo2.A02;
                    LfN lfN = new LfN(this, 11);
                    GraphQlQueryParamSet graphQlQueryParamSet = new GraphQlQueryParamSet();
                    graphQlQueryParamSet.A05(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str2);
                    graphQlQueryParamSet.A05(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str3);
                    2Jf r0 = new 2Jf(2JX.class, (Class) null, "FxDecalInitQuery", (String) null, "fbandroid", -1854614163, 0, 2550453392L, 2550453392L, false, true);
                    r0.A00 = graphQlQueryParamSet;
                    1Kd.A0F(lfN, 7zR.A0n(kj2.A00, C3sa.A00(r0)), 4YV.A11(kj2.A01));
                    return;
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
