package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.messaging.wellbeing.unknowncontact.reachabilitycontrols.activity.ReachabilitySettingsActivity;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.773, reason: invalid class name */
/* loaded from: 773.class */
public final class AnonymousClass773 implements 6xM {
    public HashSet A00;
    public boolean A01;

    public /* bridge */ /* synthetic */ Set AoU() {
        HashSet hashSet = this.A00;
        if (hashSet == null) {
            hashSet = new HashSet(Arrays.asList(7D3.class));
            this.A00 = hashSet;
        }
        return hashSet;
    }

    public String BGe() {
        return "ReachabilitySettingsHandlerPlugin";
    }

    public void BLY(Capabilities capabilities, C77n c77n, 6RU r304, 6Sh r305) {
        if (r305 instanceof 7D3) {
            if (!this.A01) {
                this.A01 = true;
            }
            7D3 r0 = (7D3) r305;
            11T.A0F(r304, 0);
            11T.A0F(r0, 1);
            if (r0.A00.AVC() == C5vv.A0u) {
                Context context = r304.A00;
                Intent A0D = C3o5.A0D(context, ReachabilitySettingsActivity.class);
                A0D.putExtra("entry_point", (Serializable) BOD.A03);
                0LS.A0A(context, A0D);
            }
        }
    }

    public void BPN(C77n c77n, 6RU r303, boolean z) {
        if (z || this.A01) {
            return;
        }
        this.A01 = true;
    }
}
