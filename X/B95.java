package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: B95.class */
public final class B95 extends BJB {
    public static final String __redex_internal_original_name = "ProtectIpAddressSettingFragment";
    public FbUserSession A00;
    public By5 A01;
    public boolean A02;
    public String A03;
    public final 1Br A04 = 7zM.A0R();
    public final 1Br A05 = 7zM.A0T();

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (r304 == null) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1S(android.os.Bundle r302) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            super.A1S(r1)
            r0 = r301
            com.facebook.auth.usersession.FbUserSession r0 = X.1BM.A01(r0)
            r303 = r0
            r0 = r301
            r1 = r303
            r0.A00 = r1
            r0 = r301
            android.os.Bundle r0 = r0.mArguments
            r304 = r0
            java.lang.String r0 = "session_id"
            r303 = r0
            r0 = r304
            if (r0 == 0) goto L25
            r0 = r304
            r1 = r303
            java.lang.String r0 = r0.getString(r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L29
        L25:
            java.lang.String r0 = X.1BK.A0t()
            r304 = r0
        L29:
            r0 = r304
            X.11T.A0D(r0)
            r0 = r302
            if (r0 == 0) goto L3d
            r0 = r302
            r1 = r303
            java.lang.String r0 = r0.getString(r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L3d
            r0 = r303
            r304 = r0
        L3d:
            r0 = r301
            r1 = r304
            r0.A03 = r1
            X.9bw r0 = new X.9bw
            r304 = r0
            r0 = r304
            r0.<init>()
            r0 = r304
            r1 = 2131963807(0x7f132f9f, float:1.9564378E38)
            r0.A01 = r1
            r0 = r304
            r1 = r301
            r2 = 77
            X.By5 r0 = X.BJB.A0H(r0, r1, r2)
            r303 = r0
            r0 = r301
            r1 = r303
            r0.A01 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B95.A1S(android.os.Bundle):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1c() {
        Context context;
        LithoView lithoView = ((BJB) this).A00;
        if (lithoView == null || (context = getContext()) == null) {
            return;
        }
        1Iw A0G = BJB.A0G(context, this);
        MigColorScheme migColorScheme = ((BJB) this).A01;
        11T.A0A(migColorScheme);
        QGV qgv = new QGV(Cvn.A00(this, ActionId.CARD_DATA_LOADED), migColorScheme, this.A02);
        By5 by5 = this.A01;
        if (by5 != null) {
            BJB.A0I(qgv, A0G, lithoView, this, by5);
        } else {
            11T.A0L("titleBarParams");
            throw 0Q8.createAndThrow();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(792136700);
        11T.A0F(layoutInflater, 0);
        C3sa A0L = 7zM.A0L(7zL.A0M(), new 2Jf(2JX.class, (Class) null, "PrivacySettingsQuery", (String) null, "fbandroid", 1488586613, 0, 3606683282L, 3606683282L, false, true));
        if (this.A00 == null) {
            7zL.A1C();
            throw 0Q8.createAndThrow();
        }
        1FV A0n = 7zR.A0n(getContext(), A0L);
        1Br.A0D(this.A04, D4q.A00(this, 75), A0n);
        A1c();
        LithoView A0J = 7zU.A0J(layoutInflater, viewGroup, this);
        0FI.A08(1595058369, A02);
        return A0J;
    }

    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super/*X.DZJ*/.onSaveInstanceState(bundle);
        String str = this.A03;
        if (str == null) {
            11T.A0L("sessionId");
            throw 0Q8.createAndThrow();
        }
        AbF.A1I(bundle, str);
    }
}
