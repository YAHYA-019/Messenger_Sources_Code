package X;

import android.os.Bundle;
import com.facebook.privacy.zone.policy.ZonePolicy;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: X.Jna, reason: case insensitive filesystem */
/* loaded from: Jna.class */
public final class C3239Jna extends L5Y implements MNr, MNs, MNq {
    public boolean A00;
    public final MLg A01;

    public C3239Jna(MLg mLg) {
        this.A01 = mLg;
    }

    public static final void A00(C3239Jna c3239Jna) {
        Bundle bundle;
        if (c3239Jna.A00) {
            c3239Jna.A00 = false;
            LDF A00 = LDF.A00();
            java.util.Map emptyMap = Collections.emptyMap();
            JgX jgX = ((L5Y) c3239Jna).A03;
            ZonePolicy zonePolicy = null;
            if (jgX != null) {
                bundle = jgX.A09;
                zonePolicy = jgX.A0d;
            } else {
                bundle = null;
            }
            A00.A0A(bundle, zonePolicy, "checkpoint_flow_closed", emptyMap);
        }
    }

    public static final void A01(C3239Jna c3239Jna, String str) {
        Bundle bundle;
        if (c3239Jna.A00) {
            HashMap A0u = AnonymousClass001.A0u();
            A0u.put("action_name", str);
            LDF A00 = LDF.A00();
            JgX jgX = ((L5Y) c3239Jna).A03;
            ZonePolicy zonePolicy = null;
            if (jgX != null) {
                bundle = jgX.A09;
                zonePolicy = jgX.A0d;
            } else {
                bundle = null;
            }
            A00.A0A(bundle, zonePolicy, "checkpoint_flow_log_action", A0u);
        }
    }

    @Override // X.MNq
    public boolean C30(RDm rDm, String str, String str2, String str3) {
        rDm.A00.cancel();
        return true;
    }
}
