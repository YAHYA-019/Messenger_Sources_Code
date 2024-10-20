package com.facebook.messaging.neue.nux.webview;

import X.0CO;
import X.0fH;
import X.1BQ;
import X.1Bn;
import X.1iF;
import X.4YU;
import X.7zN;
import X.7zO;
import X.AbF;
import X.AbI;
import X.AbK;
import X.C00i;
import X.C5yw;
import X.CGw;
import X.DKD;
import X.DPM;
import X.F8q;
import X.FkI;
import X.InterfaceC03733yw;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.litho.LithoView;
import com.facebook.webview.FacebookWebViewDoNotUse;
import com.facebook.widget.listview.EmptyListViewItem;

/* loaded from: NeueNuxWebViewActivity.class */
public class NeueNuxWebViewActivity extends FbFragmentActivity implements InterfaceC03733yw {
    public C00i A00;
    public FacebookWebViewDoNotUse A01;
    public EmptyListViewItem A02;
    public CGw A03;
    public final C00i A04 = 1BQ.A01();
    public final C00i A05 = DKD.A0W(this);

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return AbK.A0F();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        this.A03 = (CGw) 1Bn.A0A(84925);
        this.A00 = AbI.A0J(this);
        setContentView(2132542819);
        LithoView lithoView = (LithoView) A2c(2131365268);
        C5yw A0b = 7zN.A0b(lithoView.A09, false);
        A0b.A2b(AbF.A0p(this.A05));
        A0b.A2f(7zO.A0H(this).getString("title_arg", ""));
        A0b.A2Y();
        lithoView.A0x(FkI.A00(A0b, this, 19));
        EmptyListViewItem emptyListViewItem = (EmptyListViewItem) A2c(2131363883);
        this.A02 = emptyListViewItem;
        emptyListViewItem.A0F(true);
        this.A02.A0D(2131957324);
        FacebookWebViewDoNotUse facebookWebViewDoNotUse = (FacebookWebViewDoNotUse) A2c(2131368428);
        this.A01 = facebookWebViewDoNotUse;
        facebookWebViewDoNotUse.setFocusableInTouchMode(true);
        this.A01.setWebViewClient(new DPM(this, 2));
        String string = 7zO.A0H(this).getString("uri_arg", "");
        Uri uri = 0CO.A00;
        if (0CO.A04(string != null ? Uri.parse(string) : null)) {
            CGw cGw = this.A03;
            cGw.getClass();
            cGw.A00(this.A01, string);
        } else {
            0fH.A0g(string, "NeueNuxWebViewActivity", "This uri was not valid ");
            AbI.A1V((F8q) 4YU.A0p(this.A00), 2131957317, false);
            finish();
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        FacebookWebViewDoNotUse facebookWebViewDoNotUse = this.A01;
        if (facebookWebViewDoNotUse != null) {
            facebookWebViewDoNotUse.restoreState(bundle);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        FacebookWebViewDoNotUse facebookWebViewDoNotUse = this.A01;
        if (facebookWebViewDoNotUse != null) {
            facebookWebViewDoNotUse.saveState(bundle);
        }
    }
}
