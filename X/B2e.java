package X;

import android.os.Bundle;
import com.facebook.auth.credentials.PasswordCredentials;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueClearCheckpoint;

/* loaded from: B2e.class */
public final class B2e extends B2f implements CallerContextable {
    public static final String __redex_internal_original_name = "AccountLoginClearCheckpointFragment";
    public COx A00;
    public final BPY A01 = new B37(this, 1);

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        COx cOx = new COx(this, ((AlJ) this).A00, new C00(getContext()), this.A01, "auth_password", "auth_operation", "passwordCredentials", false);
        COx.A02(cOx);
        this.A00 = cOx;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(-232476291);
        super/*androidx.fragment.app.Fragment*/.onResume();
        AccountLoginSegueClearCheckpoint accountLoginSegueClearCheckpoint = (AccountLoginSegueClearCheckpoint) ((AlJ) this).A01;
        this.A00.A04(new PasswordCredentials(EPM.A0R, accountLoginSegueClearCheckpoint.A01, accountLoginSegueClearCheckpoint.A00, "login"), "action_auth_with_credentials", 2131952189);
        0FI.A08(-1939703468, A02);
    }
}
