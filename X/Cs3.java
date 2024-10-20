package X;

import android.content.Context;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.business.search.model.PlatformSearchGameData;
import com.facebook.messaging.business.search.model.PlatformSearchUserData;
import com.facebook.messaging.graph.usercontrols.hidecontact.confirmationview.nux.HideContactNuxFragment;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.search.lists.model.MessageSearchMessageModel;
import com.facebook.messaging.search.lists.model.MessageSearchThreadModel;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import java.io.Serializable;

/* loaded from: Cs3.class */
public final class Cs3 implements DIn {
    public final int A00;
    public final Object A01;

    public Cs3(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.DIn
    public void D9q(PlatformSearchGameData platformSearchGameData) {
    }

    @Override // X.DIn
    public void D9r(PlatformSearchUserData platformSearchUserData) {
        if (3 - this.A00 == 0) {
            ((Cqz) this.A01).A00.A00(CCa.A00(platformSearchUserData));
        }
    }

    @Override // X.DIn
    public void D9s(ThreadSummary threadSummary) {
    }

    @Override // X.DIn
    public void D9t(C1772As6 c1772As6) {
    }

    @Override // X.DIn
    public void D9u(MessageSearchMessageModel messageSearchMessageModel) {
    }

    @Override // X.DIn
    public void D9v(MessageSearchThreadModel messageSearchThreadModel) {
    }

    @Override // X.DIn
    public void D9x(User user) {
        Context context;
        switch (this.A00) {
            case 0:
                2Ok r0 = ((Cqy) this.A01).A00.A00;
                if (r0.A06 == null || (context = r0.getContext()) == null) {
                    return;
                }
                CIe cIe = (CIe) 1Lo.A04(context, r0.A02, (1BY) null, 83623);
                String str = user.A13;
                11T.A0F(str, 0);
                if (cIe.A01 != null || cIe.A00 != null) {
                    CIe.A00(BOU.A09, cIe, str);
                }
                r0.A06.A00.A00(user, r0.A09);
                return;
            case 1:
                11T.A0F(user, 0);
                AlB alB = ((Be0) this.A01).A00;
                AlB.A06(alB);
                1Br.A0C(alB.A09);
                Context requireContext = alB.requireContext();
                FbUserSession A0E = 7zS.A0E(alB.A07);
                11T.A0F(A0E, 3);
                1Bu.A01(requireContext, 147606);
                1BV A0R = 7zL.A0R(requireContext, 147607);
                1HH A0Q = AbF.A0Q(requireContext, 83143);
                06Z A08 = 7zN.A08(alB);
                Be1 be1 = new Be1(alB);
                Serializable serializable = 3Ea.A03;
                A0R.get();
                I2j i2j = new I2j(requireContext, A0E, user, 0);
                if (!AbH.A1b(1Br.A09(((CCP) 1Bn.A0E(requireContext, (1BY) null, 83141)).A00), CCP.A01)) {
                    i2j.A01();
                    ((CGK) A0Q.get()).A01(serializable, AbF.A1A(user), "privacy_setting", "confirmed", -1);
                    AlB.A03(be1.A00);
                    return;
                }
                0D2 hideContactNuxFragment = new HideContactNuxFragment();
                Bundle A05 = 1BK.A05();
                A05.putParcelable("args_user", user);
                A05.putInt("args_active_now_position", -1);
                A05.putSerializable("args_presence_type", serializable);
                A05.putSerializable("args_entry_point", "privacy_setting");
                hideContactNuxFragment.setArguments(A05);
                hideContactNuxFragment.A04 = i2j;
                hideContactNuxFragment.A03 = be1;
                hideContactNuxFragment.A0m(A08, "hide_contact_confirmation_nux_fragment");
                return;
            case 2:
                DFE dfe = ((CFj) this.A01).A01;
                if (dfe != null) {
                    dfe.Bwq(user, "search");
                    return;
                }
                return;
            case 3:
                ((Cqz) this.A01).A00.A00(user);
                return;
            default:
                11T.A0F(user, 0);
                C6G c6g = ((Bii) this.A01).A00;
                UserKey userKey = user.A0k;
                11T.A0A(userKey);
                C1529Aki c1529Aki = c6g.A01;
                if (c1529Aki != null) {
                    InputMethodManager inputMethodManager = (InputMethodManager) c1529Aki.A04.getValue();
                    LithoView lithoView = c1529Aki.A00;
                    if (lithoView == null) {
                        AbF.A1G();
                        throw 0Q8.createAndThrow();
                    }
                    AbH.A1L(lithoView, inputMethodManager);
                }
                ((AeX) 1Br.A0B(c6g.A08)).A02(new CjX(c6g, 7), userKey);
                return;
        }
    }
}
