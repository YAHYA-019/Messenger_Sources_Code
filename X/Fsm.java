package X;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.common.util.TriState;

/* loaded from: Fsm.class */
public final class Fsm implements GGf {
    @Override // X.GGf
    public TriState BTZ(Intent intent) {
        Bundle extras = intent.getExtras();
        return (extras == null || !"carrier_portal_upsell".equals(extras.getString("iab_click_source"))) ? TriState.UNSET : TriState.YES;
    }
}
