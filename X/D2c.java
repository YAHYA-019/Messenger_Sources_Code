package X;

import android.content.Intent;
import com.facebook.common.util.TriState;

/* loaded from: D2c.class */
public final class D2c implements GGf {
    @Override // X.GGf
    public TriState BTZ(Intent intent) {
        String action = intent.getAction();
        return (action == null || !action.startsWith("android.settings.")) ? TriState.UNSET : TriState.YES;
    }
}
