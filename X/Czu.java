package X;

import android.content.Context;
import android.view.View;
import com.facebook.messaging.business.plugins.suggestasyoutype.disclosure.SAYTDisclosureBanner;
import com.facebook.messaging.business.plugins.suggestedreply.disclosure.SuggestedReplyDisclosureBanner;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.google.common.collect.ImmutableList;

/* loaded from: Czu.class */
public final class Czu implements 1HN, 1HO {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public Czu(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj3;
        this.A03 = obj2;
    }

    public final void onSharedPreferenceChanged(FbSharedPreferences fbSharedPreferences, 1G2 r303) {
        Object A0B;
        if (this.A00 == 0) {
            boolean A1X = 1BL.A1X(fbSharedPreferences, r303);
            if (!fbSharedPreferences.AZn(r303, false)) {
                return;
            }
            Context context = (Context) this.A01;
            String A0y = AbJ.A0y(context, 2131966503);
            String string = context.getString(2131966502);
            String A0u = 1BK.A0u(context, 2131966504);
            7OX r0 = (7OX) this.A02;
            SAYTDisclosureBanner sAYTDisclosureBanner = (SAYTDisclosureBanner) this.A03;
            r0.CXr(new 6Ky((View.OnClickListener) null, (View.OnClickListener) null, (1LI) null, (C9g0) null, 9DU.A00(new CYr(2, context, r0, sAYTDisclosureBanner), A0u), 9DU.A00(new CZE(r0, sAYTDisclosureBanner, 11), 1BK.A0u(context, 2131966505)), (ImmutableList) null, "ls://circleicon?icon=message-dots&iconColor=staticwhite&circleColor=blue", string, A0y, (Class) null, (Integer) null, 0, false));
            1G2 r02 = SAYTDisclosureBanner.A05;
            1Ql.A01(1Br.A08(((CGH) 1Br.A0B(sAYTDisclosureBanner.A02)).A00).putBoolean(CGH.A01, A1X), CGH.A02, false);
            A0B = 1Br.A0B(sAYTDisclosureBanner.A03);
        } else {
            if (!fbSharedPreferences.AZn(r303, false)) {
                return;
            }
            Context context2 = (Context) this.A02;
            String A0y2 = AbJ.A0y(context2, 2131966562);
            String string2 = context2.getString(2131966561);
            ((7OX) this.A03).CXr(new 6Ky((View.OnClickListener) null, (View.OnClickListener) null, (1LI) null, (C9g0) null, 9DU.A00(CZD.A00(this, 42), context2.getString(2131966563)), 9DU.A00(CZD.A00(this, 43), context2.getString(2131966564)), (ImmutableList) null, "ls://circleicon?icon=message-dots&iconColor=staticwhite&circleColor=blue", string2, A0y2, (Class) null, (Integer) null, 0, false));
            SuggestedReplyDisclosureBanner suggestedReplyDisclosureBanner = (SuggestedReplyDisclosureBanner) this.A01;
            C00i c00i = ((CGI) suggestedReplyDisclosureBanner.A03.get()).A00;
            AbK.A1O(1BL.A0V(c00i), CGI.A02);
            1Ql.A01(1BL.A0V(c00i), CGI.A01, false);
            A0B = suggestedReplyDisclosureBanner.A04.get();
        }
        C6W c6w = (C6W) A0B;
        1UG A08 = 1BK.A08(c6w.A01(), 1BJ.A00(1062));
        if (A08.isSampled()) {
            1UG.A02(A08, "biim");
            C6W.A00(new 0DA(), A08, c6w);
        }
    }
}
