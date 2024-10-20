package com.facebook.messaging.omnipicker.namepage;

import X.0D2;
import X.0FI;
import X.1JF;
import X.Bfx;
import X.C2121Dea;
import X.CSG;
import X.CYa;
import android.os.Bundle;
import android.widget.EditText;
import com.facebook.acra.constants.ActionId;
import com.facebook.ui.dialogs.NonDismissingAlertDialogFragment;

/* loaded from: OmnipickerChatNameSetDialogFragment.class */
public class OmnipickerChatNameSetDialogFragment extends NonDismissingAlertDialogFragment {
    public Bfx A00;
    public String A01;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.ui.dialogs.NonDismissingAlertDialogFragment
    public C2121Dea A1C(Bundle bundle) {
        EditText editText = new EditText(getContext());
        editText.addTextChangedListener(new CYa(this, 9));
        C2121Dea c2121Dea = new C2121Dea(getContext());
        c2121Dea.A06(2131962448);
        c2121Dea.A05(2131962446);
        c2121Dea.A09(editText);
        CSG.A06(c2121Dea, this, ActionId.APP_WILL_ENTER_FOREGROUND, 2131962447);
        c2121Dea.A07(CSG.A00(this, ActionId.APP_DID_BECOME_ACTIVE));
        return c2121Dea;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(2071010317);
        super/*androidx.fragment.app.Fragment*/.onResume();
        ((0D2) this).A01.A00.A0F.setEnabled(!1JF.A0A(this.A01));
        0FI.A08(-2125808830, A02);
    }
}
