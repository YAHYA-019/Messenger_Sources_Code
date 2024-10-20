package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;

/* loaded from: Frq.class */
public final class Frq implements C08j {
    public final /* synthetic */ 4fI A00;

    public Frq(4fI r302) {
        this.A00 = r302;
    }

    @Override // X.C08j
    public ArrayList Ara() {
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new IntentFilter("com.facebook.fixie.action.FOA_FOREGROUND_EVENT"));
        A0s.add(new IntentFilter("com.facebook.fixie.action.FOA_BACKGROUND_EVENT"));
        return A0s;
    }

    @Override // X.C08j
    public void CFb(Context context, Intent intent, C01q c01q) {
        4fI r0 = this.A00;
        String stringExtra = intent.getStringExtra(4YT.A00(606));
        if (r0.A01.equals(stringExtra)) {
            return;
        }
        if (!"com.facebook.fixie.action.FOA_FOREGROUND_EVENT".equals(intent.getAction())) {
            if ("com.facebook.fixie.action.FOA_BACKGROUND_EVENT".equals(intent.getAction()) && 4fI.A03(r0)) {
                4fI.A02(r0);
                return;
            }
            return;
        }
        if (intent.getBooleanExtra(4YT.A00(504), false) && 4fI.A04(r0)) {
            int intExtra = intent.getIntExtra(4YT.A00(675), -1);
            int intExtra2 = intent.getIntExtra(4YT.A00(674), -1);
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("memory boost for ");
            A0k.append(stringExtra);
            A0k.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            A0k.append(intExtra);
            A0k.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            A0k.append(intExtra2);
            00F.A01(A0k.toString());
        }
    }
}
