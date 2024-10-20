package X;

import android.content.Intent;
import com.facebook.common.util.TriState;

/* loaded from: D2d.class */
public final class D2d implements GGf {
    @Override // X.GGf
    public TriState BTZ(Intent intent) {
        String action = intent.getAction();
        return (action == null || !(action.equals("android.provider.Telephony.ACTION_CHANGE_DEFAULT") || (action.equals("android.app.role.action.REQUEST_ROLE") && intent.getExtras() != null && "android.app.role.SMS".equals(intent.getExtras().get("android.intent.extra.ROLE_NAME"))))) ? TriState.UNSET : TriState.YES;
    }
}
