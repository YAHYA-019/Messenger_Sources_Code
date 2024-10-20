package X;

import android.widget.EditText;
import com.facebook.litho.LithoView;
import com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueCredentials;

/* loaded from: Bzx.class */
public final class Bzx {
    public final /* synthetic */ B2q A00;

    public Bzx(B2q b2q) {
        this.A00 = b2q;
    }

    public void A00(String str) {
        EditText editText;
        B2q b2q = this.A00;
        b2q.A0J = true;
        AccountLoginSegueCredentials accountLoginSegueCredentials = (AccountLoginSegueCredentials) ((AlJ) b2q).A01;
        accountLoginSegueCredentials.A09 = str;
        accountLoginSegueCredentials.A0C = "";
        B2q.A09(b2q);
        LithoView lithoView = ((B2z) b2q).A00;
        if (lithoView != null && (editText = (EditText) lithoView.findViewWithTag("password_field_tag")) != null) {
            if (editText.getText() != null) {
                editText.getText().clear();
            }
            editText.requestFocus();
        }
        b2q.A1d();
    }
}
