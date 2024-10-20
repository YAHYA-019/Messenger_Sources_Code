package com.facebook.auth.reauth;

import X.06Z;
import X.1BJ;
import X.1BK;
import X.1BY;
import X.1Lo;
import X.1iF;
import X.1pK;
import X.7zL;
import X.AbL;
import X.C06c;
import X.DKE;
import X.DKH;
import X.DZL;
import X.FXr;
import X.FcS;
import X.GCQ;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.forker.Process;
import java.util.concurrent.CancellationException;

/* loaded from: ReauthActivity.class */
public class ReauthActivity extends FbFragmentActivity implements GCQ {
    public DZL A00;
    public FcS A01;

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return DKE.A0P();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        Toolbar A0E = DKH.A0E(this, 2132543221);
        A0E.A0M(2131964185);
        FXr.A04(A0E, this, 11);
        06Z BDe = BDe();
        this.A00 = new 1pK();
        Bundle A05 = 1BK.A05();
        A05.putString("message", getIntent().getStringExtra("message"));
        this.A00.setArguments(A05);
        C06c A0G = 7zL.A0G(BDe);
        A0G.A0L(this.A00, 2131366836);
        A0G.A04();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2z(Bundle bundle) {
        super.A2z(bundle);
        this.A01 = (FcS) 1Lo.A04(this, AbL.A08(this), (1BY) null, 99157);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        FcS fcS = this.A01;
        fcS.getClass();
        fcS.A00.onFailure(new CancellationException(1BJ.A00(Process.SD_STDOUT)));
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        boolean onCreateOptionsMenu = super.onCreateOptionsMenu(menu);
        menu.clear();
        return onCreateOptionsMenu;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
