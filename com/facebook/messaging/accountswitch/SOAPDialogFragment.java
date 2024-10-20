package com.facebook.messaging.accountswitch;

import X.0FI;
import X.1BL;
import X.1BV;
import X.AbJ;
import X.C00i;
import X.C15h;
import X.C1s;
import X.DBe;
import android.content.DialogInterface;
import android.os.Bundle;

/* loaded from: SOAPDialogFragment.class */
public class SOAPDialogFragment extends BaseLoadingActionDialogFragment {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public C15h A04;
    public final C00i A06 = 1BV.A00(49870);
    public final C00i A05 = 1BV.A00(83673);

    public String AWg() {
        return "mswitch_accounts_soap";
    }

    public Long Am7() {
        return AbJ.A0v();
    }

    @Override // com.facebook.messaging.accountswitch.BaseLoadingActionDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(624480258);
        super.onCreate(bundle);
        this.A04 = DBe.A00(this, 19);
        0FI.A08(-1183733444, A02);
    }

    @Override // com.facebook.messaging.accountswitch.BaseLoadingActionDialogFragment
    public void onDismiss(DialogInterface dialogInterface) {
        ((C1s) this.A05.get()).A00(1BL.A0F().A02, this.A02, false);
        super.onDismiss(dialogInterface);
    }
}
