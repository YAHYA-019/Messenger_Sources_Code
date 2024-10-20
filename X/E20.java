package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.common.util.TriState;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: E20.class */
public final class E20 extends BJB {
    public static final String __redex_internal_original_name = "FlmConsentSettingFragment";
    public ExQ A00;
    public ClickableSpan A01;
    public RID A02;

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        this.A00 = (ExQ) 1Lm.A05(requireContext(), 1BM.A01(this), 82179);
        this.A02 = new RID(requireActivity(), this);
        requireContext();
        this.A01 = new DOB(this, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1c() {
        String str;
        Context context = getContext();
        if (context != null) {
            1Iw A0W = 7zL.A0W(context);
            MigColorScheme migColorScheme = ((BJB) this).A01;
            11T.A0A(migColorScheme);
            LithoView lithoView = ((BJB) this).A00;
            if (lithoView != null) {
                String A0D = A0W.A0D(2131956973);
                Resources A0J = 7zQ.A0J(A0W);
                String A0D2 = A0W.A0D(2131956971);
                String A0D3 = A0W.A0D(2131956972);
                ClickableSpan clickableSpan = this.A01;
                if (clickableSpan == null) {
                    str = "privacyNoticeClickableSpan";
                } else {
                    0Dc r0 = new 0Dc(A0J);
                    r0.A02(A0D2);
                    SpannableString A0B = 7zS.A0B(r0, clickableSpan, "[[face-and-hand-effects-privacy-notice]]", A0D3);
                    String A0D4 = A0W.A0D(2131956974);
                    ExQ exQ = this.A00;
                    if (exQ == null) {
                        str = "flmEffectConsentController";
                    } else {
                        boolean A1W = AnonymousClass001.A1W(exQ.A04.getValue(), TriState.YES);
                        RID rid = this.A02;
                        if (rid != null) {
                            11T.A0D(A0D);
                            11T.A0D(A0D4);
                            lithoView.A0x(new Duv(new 8Lg(rid, A0B, A0D, A0D4, A1W), migColorScheme));
                            return;
                        }
                        str = "settingListener";
                    }
                }
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A04 = 7zQ.A04(layoutInflater, -2094974227);
        super/*X.DZJ*/.onCreateView(layoutInflater, viewGroup, bundle);
        LithoView A1Y = A1Y(layoutInflater, viewGroup);
        11T.A0A(A1Y);
        0FI.A08(723264830, A04);
        return A1Y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super/*X.1pK*/.onViewCreated(view, bundle);
        ExQ exQ = this.A00;
        if (exQ == null) {
            11T.A0L("flmEffectConsentController");
            throw 0Q8.createAndThrow();
        }
        FZB.A03(this, exQ.A04, 4);
    }
}
