package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.messaging.xma.ui.XMALinearLayout;

/* loaded from: E2N.class */
public final class E2N extends C6eO {
    public final Context A00 = 7zP.A0J();

    /* JADX WARN: Type inference failed for: r0v2, types: [X.E2a, android.widget.LinearLayout, android.view.View, com.facebook.messaging.xma.ui.XMALinearLayout, com.facebook.widget.CustomLinearLayout] */
    @Override // X.C6eO
    public /* bridge */ /* synthetic */ EeO A02(ViewGroup viewGroup) {
        Context context = this.A00;
        ?? xMALinearLayout = new XMALinearLayout(context, null);
        xMALinearLayout.A02 = (CH8) 1Bi.A03(85098);
        xMALinearLayout.A04 = (EeB) 1Bn.A0A(99465);
        xMALinearLayout.A03 = (EeA) 1Bn.A0A(99464);
        xMALinearLayout.A00 = context;
        xMALinearLayout.A0D(2132542096);
        xMALinearLayout.A01 = (LinearLayout) C09s.A01(xMALinearLayout, 2131364336);
        xMALinearLayout.setOrientation(1);
        return new EeO((View) xMALinearLayout);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x007b, code lost:
    
        if (X.1JF.A0B(r315) == false) goto L12;
     */
    @Override // X.C6eO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void A03(com.facebook.auth.usersession.FbUserSession r302, X.5zD r303, X.5Pm r304, X.EeO r305, X.7Wh r306) {
        /*
            Method dump skipped, instructions count: 577
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E2N.A03(com.facebook.auth.usersession.FbUserSession, X.5zD, X.5Pm, X.EeO, X.7Wh):void");
    }
}
