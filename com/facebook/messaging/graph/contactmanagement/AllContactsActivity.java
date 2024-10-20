package com.facebook.messaging.graph.contactmanagement;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1BY;
import X.1Bn;
import X.1Lo;
import X.2Ok;
import X.5SW;
import X.7zL;
import X.7zQ;
import X.7zU;
import X.8HC;
import X.AbM;
import X.AbR;
import X.B4e;
import X.BKm;
import X.C06c;
import X.C8y;
import X.CIe;
import X.Ckk;
import X.Ckl;
import X.DKy;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;

/* loaded from: AllContactsActivity.class */
public final class AllContactsActivity extends FbFragmentActivity {
    public FbUserSession A00;
    public C8y A01;

    private final void A12() {
        if (this.A01 == null) {
            Ckl ckl = new Ckl(this);
            this.A01 = ((AbR) 1Bn.A0E(this, (1BY) null, 901)).A0T(this, BDe(), new Ckk(), ckl);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity
    public void A2b(Fragment fragment) {
        11T.A0F(fragment, 0);
        super.A2b(fragment);
        A12();
        if (fragment instanceof B4e) {
            ((B4e) fragment).A0C = this.A01;
        } else if (fragment instanceof 2Ok) {
            ((2Ok) fragment).A06 = this.A01;
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        this.A00 = 7zQ.A0N().A05(this);
        A12();
        FbUserSession fbUserSession = this.A00;
        if (fbUserSession == null) {
            7zL.A1C();
            throw 0Q8.createAndThrow();
        }
        ((DKy) 1Lo.A04(this, fbUserSession, (1BY) null, 99445)).A01(this);
        setContentView(2132541501);
        if (bundle == null) {
            C06c A0D = 7zU.A0D(this);
            8HC b4e = new B4e();
            Bundle A05 = 1BK.A05();
            A05.putBoolean("should_show_title_bar", true);
            A05.putBoolean("should_show_index_rail", true);
            A05.putBoolean("should_update_search_bar_visibility", true);
            A05.putString("thread_nav_trigger", "icon_contact_list");
            A05.putSerializable("extra_thread_view_source", 5SW.A0W);
            b4e.setArguments(A05);
            AbM.A1D(A0D, b4e, "all_contacts_fragment", 2131364232);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public boolean A36() {
        return true;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        C8y c8y = this.A01;
        if (c8y != null) {
            if (c8y.A01.A02 == BKm.A01) {
                c8y.A00();
                return;
            }
            FbUserSession fbUserSession = this.A00;
            if (fbUserSession == null) {
                7zL.A1C();
                throw 0Q8.createAndThrow();
            }
            ((CIe) 1Lo.A04(this, fbUserSession, (1BY) null, 83623)).A01();
        }
        super.onBackPressed();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        int A00 = 0FI.A00(572746066);
        super.onStart();
        0FI.A07(2083490026, A00);
    }
}
