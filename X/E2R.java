package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.fbui.widget.layout.ImageBlockLayout;
import com.facebook.messaging.xma.ui.XMALinearLayout;

/* loaded from: E2R.class */
public final class E2R extends C6eO {
    public final Context A00;
    public final 1De A01;

    public E2R(1De r302) {
        this.A01 = r302;
        this.A00 = AbK.A0A(r302);
    }

    @Override // X.C6eO
    public /* bridge */ /* synthetic */ EeO A02(ViewGroup viewGroup) {
        Context context = this.A00;
        11T.A0F(context, 1);
        XMALinearLayout xMALinearLayout = new XMALinearLayout(context, null);
        Context A08 = 4YU.A08(xMALinearLayout);
        ((E2Z) xMALinearLayout).A03 = 1Bu.A01(A08, 49963);
        1Br A01 = 1Bu.A01(A08, 83431);
        ((E2Z) xMALinearLayout).A05 = A01;
        ((E2Z) xMALinearLayout).A04 = 1BK.A0C();
        E2Z.A06 = ((ViewerContext) A01.get()).mUserId;
        xMALinearLayout.A0D(2132542377);
        ((E2Z) xMALinearLayout).A02 = (ImageBlockLayout) C09s.A01(xMALinearLayout, 2131365613);
        ((E2Z) xMALinearLayout).A00 = (LinearLayout) C09s.A01(xMALinearLayout, 2131362385);
        ((E2Z) xMALinearLayout).A01 = (LinearLayout) C09s.A01(xMALinearLayout, 2131368386);
        return new EeO(xMALinearLayout);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0338, code lost:
    
        if (com.facebook.graphql.enums.GraphQLJobOpeningSource.USER != r0) goto L60;
     */
    @Override // X.C6eO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void A03(com.facebook.auth.usersession.FbUserSession r302, X.5zD r303, X.5Pm r304, X.EeO r305, X.7Wh r306) {
        /*
            Method dump skipped, instructions count: 924
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E2R.A03(com.facebook.auth.usersession.FbUserSession, X.5zD, X.5Pm, X.EeO, X.7Wh):void");
    }
}
