package com.facebook.messaging.zombification;

import X.0FI;
import X.1Bn;
import X.1lN;
import X.6HM;
import X.7zO;
import X.AbG;
import X.AbH;
import X.AbJ;
import X.C00i;
import X.DKD;
import X.EwB;
import X.FAE;
import X.JgM;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.base.fragment.AbstractNavigableFragment;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.messaging.phoneconfirmation.protocol.PhoneNumberParam;
import com.facebook.user.model.User;

/* loaded from: PhoneReconfirmationLoginFragment.class */
public final class PhoneReconfirmationLoginFragment extends AbstractNavigableFragment implements 1lN, CallerContextable {
    public Button A00;
    public Button A01;
    public EditText A02;
    public TextView A03;
    public TextView A04;
    public EwB A05;
    public FbDraweeView A06;
    public JgM A07;
    public PhoneNumberParam A08;
    public FAE A09;
    public 6HM A0A;
    public User A0B;
    public String A0C;
    public boolean A0D;
    public TextView A0E;
    public final C00i A0G = AbH.A0D();
    public final C00i A0F = AbH.A0c(this);

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        this.A09 = (FAE) 1Bn.A0A(100132);
        this.A05 = DKD.A0G();
        this.A0A = (6HM) 7zO.A0m(this, 50020);
        setHasOptionsMenu(true);
    }

    public String AWg() {
        return "phone_reconfirmation_fb_login_screen";
    }

    public Long Am7() {
        return AbJ.A0v();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityCreated(Bundle bundle) {
        int A02 = 0FI.A02(-399047731);
        super/*androidx.fragment.app.Fragment*/.onActivityCreated(bundle);
        DKD.A1E(this.A05.A01, "com.facebook.orca.login.AuthStateMachineMonitor.SHOWING_LOGIN_UI");
        0FI.A08(830962112, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(2041748140);
        View A08 = AbG.A08(layoutInflater, viewGroup, 2132543099);
        0FI.A08(1976175888, A02);
        return A08;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            return A1Z();
        }
        return false;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        User user = this.A0B;
        boolean z = this.A0D;
        PhoneNumberParam phoneNumberParam = this.A08;
        String str = this.A0C;
        bundle.putParcelable("matched_facebook_user", user);
        bundle.putBoolean("should_allow_account_reactivation_key", z);
        if (phoneNumberParam != null) {
            bundle.putParcelable("phone_number", phoneNumberParam);
        }
        if (str != null) {
            bundle.putString("confirmation_code", str);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:1|(1:3)|26|(1:28)|29|(1:31)|5|(4:23|(1:25)|14|(2:16|17)(2:19|20))(1:9)|10|11|12|13|14|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (r303 != null) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0227  */
    /* JADX WARN: Type inference failed for: r301v0, types: [com.facebook.messaging.zombification.PhoneReconfirmationLoginFragment, androidx.fragment.app.Fragment, java.lang.Object, X.1pK] */
    /* JADX WARN: Type inference failed for: r307v4, types: [android.view.View] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onViewCreated(android.view.View r302, android.os.Bundle r303) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.zombification.PhoneReconfirmationLoginFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
