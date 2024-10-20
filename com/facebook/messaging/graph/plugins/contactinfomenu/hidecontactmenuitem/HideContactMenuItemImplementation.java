package com.facebook.messaging.graph.plugins.contactinfomenu.hidecontactmenuitem;

import X.06Z;
import X.0D2;
import X.0S2;
import X.11T;
import X.1BK;
import X.1BV;
import X.1Bn;
import X.1Br;
import X.1Bu;
import X.1HG;
import X.2TI;
import X.3Ea;
import X.7zL;
import X.7zM;
import X.7zQ;
import X.7zR;
import X.7zT;
import X.AbF;
import X.AbG;
import X.AbH;
import X.AbK;
import X.C38;
import X.C5ic;
import X.CCP;
import X.CQu;
import X.CRD;
import X.CRI;
import X.DR6;
import X.I2j;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.graph.usercontrols.hidecontact.confirmationview.nux.HideContactNuxFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import java.io.Serializable;

/* loaded from: HideContactMenuItemImplementation.class */
public final class HideContactMenuItemImplementation {
    public final 1Br A00;
    public final int A01;
    public final Context A02;
    public final 06Z A03;
    public final 3Ea A04;
    public final FbUserSession A05;
    public final C38 A06;
    public final User A07;
    public final String A08;

    public HideContactMenuItemImplementation(Context context, 06Z r303, 3Ea r304, FbUserSession fbUserSession, C38 c38, User user, String str, int i) {
        7zT.A1W(context, user, str, r303);
        11T.A0F(fbUserSession, 7);
        this.A02 = context;
        this.A07 = user;
        this.A08 = str;
        this.A03 = r303;
        this.A01 = i;
        this.A04 = r304;
        this.A05 = fbUserSession;
        this.A06 = c38;
        this.A00 = 1Bu.A01(context, 147605);
    }

    public final void A00() {
        String str;
        1Br.A0C(this.A00);
        Context context = this.A02;
        User user = this.A07;
        FbUserSession fbUserSession = this.A05;
        1BV A0R = 7zL.A0R(context, 147606);
        1BV A0R2 = 7zL.A0R(context, 147607);
        1HG.A00(context, 83143);
        String str2 = this.A08;
        if (11T.A0O(str2, "inbox_an_tray_long_click") || 11T.A0O(str2, "inbox_close_connections_long_click")) {
            str = "inbox_tray";
        } else if (11T.A0O(str2, "people_an_tray_long_click") || 11T.A0O(str2, "see_all_active")) {
            str = "people_tab";
        } else {
            if (!11T.A0O(str2, "universal_search_contact_long_click")) {
                return;
            }
            C38 c38 = this.A06;
            if (c38 != null) {
                c38.A00(0S2.A0C);
            }
            str = "universal_search";
        }
        06Z r0 = this.A03;
        int i = this.A01;
        Serializable serializable = this.A04;
        if (serializable == null) {
            throw 1BK.A0e();
        }
        A0R2.get();
        I2j i2j = new I2j(context, fbUserSession, user, 0);
        if (AbH.A1b(1Br.A09(((CCP) 1Bu.A06(context, 83141)).A00), CCP.A01)) {
            0D2 hideContactNuxFragment = new HideContactNuxFragment();
            Bundle A05 = 1BK.A05();
            A05.putParcelable("args_user", user);
            A05.putInt("args_active_now_position", i);
            A05.putSerializable("args_presence_type", serializable);
            A05.putSerializable("args_entry_point", str);
            hideContactNuxFragment.setArguments(A05);
            hideContactNuxFragment.A04 = i2j;
            hideContactNuxFragment.A03 = null;
            hideContactNuxFragment.A0m(r0, "hide_contact_confirmation_nux_fragment");
            return;
        }
        A0R.get();
        1Bn.A0A(67527);
        MigColorScheme A0c = 7zR.A0c(context);
        1Br A00 = 1HG.A00(context, 83143);
        Resources resources = (Resources) 7zM.A19();
        2TI A0p = 7zQ.A0p();
        DR6 A01 = C5ic.A01(context, A0c);
        AbG.A1E(resources, A01, 2131957598);
        int i2 = 2131957597;
        if (A0p.A03()) {
            i2 = 2131957611;
        }
        AbK.A1E(resources, A01, AbF.A1B(user), i2);
        A01.A0G(new CRI(serializable, A00, i2j, user, str, i), resources.getString(2131957596));
        A01.A0E(new CRD(serializable, A00, user, str, i), resources.getString(2131957595));
        A01.A07(new CQu(serializable, A00, user, str, i));
        A01.A05();
    }
}
