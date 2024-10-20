package X;

import android.os.Bundle;
import com.facebook.fbservice.ops.BlueServiceOperationFactory;

/* loaded from: C0t.class */
public final class C0t {
    public final BlueServiceOperationFactory A00 = (BlueServiceOperationFactory) 1Bn.A0B(33031);

    public void A00(String str, boolean z) {
        Bundle A05 = 1BK.A05();
        A05.putString("invite_token", str);
        A05.putBoolean("is_new_install", z);
        1Ho newInstance_DEPRECATED = this.A00.newInstance_DEPRECATED("messenger_invites", A05);
        newInstance_DEPRECATED.A0A = true;
        1Ho.A00(newInstance_DEPRECATED, true);
    }
}
