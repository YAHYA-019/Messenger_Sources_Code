package com.facebook.messaging.accountswitch;

import X.0FI;
import X.1BV;
import X.1G0;
import X.1G2;
import X.1G3;
import X.AbH;
import X.AbI;
import X.AbJ;
import X.AbL;
import X.C00i;
import X.C15h;
import X.CIj;
import X.ChO;
import X.DJV;
import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.widget.text.BetterTextView;

/* loaded from: AddAccountDialogFragment.class */
public class AddAccountDialogFragment extends BaseLoadingActionDialogFragment {
    public static boolean A0H;
    public static final 1G2 A0I = 1G3.A01(1G0.A04, "oauth_switcher_add_account_auto_logged_in/");
    public CheckBox A01;
    public EditText A02;
    public EditText A03;
    public TextView A04;
    public FbUserSession A05;
    public CIj A06;
    public BetterTextView A07;
    public C15h A08;
    public C15h A09;
    public boolean A0A;
    public final C00i A0E = 1BV.A00(756);
    public final C00i A0B = AbI.A0N();
    public final C00i A0F = 1BV.A00(16430);
    public final C00i A0C = 1BV.A00(83726);
    public final C00i A0D = AbH.A0S();
    public int A00 = 0;
    public final DJV A0G = new ChO(this, 6);

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0025, code lost:
    
        if (r301.A03.getText().length() <= 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A05(com.facebook.messaging.accountswitch.AddAccountDialogFragment r301) {
        /*
            r0 = r301
            android.widget.EditText r0 = r0.A02
            android.text.Editable r0 = r0.getText()
            r302 = r0
            r0 = r302
            int r0 = r0.length()
            r303 = r0
            r0 = r303
            if (r0 <= 0) goto L28
            r0 = r301
            android.widget.EditText r0 = r0.A03
            android.text.Editable r0 = r0.getText()
            r302 = r0
            r0 = r302
            int r0 = r0.length()
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 > 0) goto L2a
        L28:
            r0 = 0
            r304 = r0
        L2a:
            r0 = r301
            android.widget.Button r0 = r0.A03
            r1 = r304
            r0.setEnabled(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.accountswitch.AddAccountDialogFragment.A05(com.facebook.messaging.accountswitch.AddAccountDialogFragment):void");
    }

    public String AWg() {
        return "mswitch_accounts_add";
    }

    public Long Am7() {
        return AbJ.A0v();
    }

    @Override // com.facebook.messaging.accountswitch.BaseLoadingActionDialogFragment
    public void onActivityResult(int i, int i2, Intent intent) {
        CIj cIj;
        super.onActivityResult(i, i2, intent);
        if (i != 55 || (cIj = this.A06) == null || intent == null) {
            return;
        }
        cIj.A02(i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.accountswitch.BaseLoadingActionDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-1778136865);
        super.onCreate(bundle);
        this.A05 = AbL.A09(this);
        0FI.A08(1568289433, A02);
    }
}
