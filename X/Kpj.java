package X;

import android.os.Bundle;
import com.facebook.iabeventlogging.model.IABHistoryInteractionEvent;
import com.facebook.privacy.zone.policy.ZonePolicy;

/* loaded from: Kpj.class */
public final class Kpj {
    public final LDF A00;
    public final C0dp A01;
    public final String A02;

    public Kpj(LDF ldf, String str) {
        this.A00 = ldf;
        this.A02 = str;
        0rI r0 = 0rI.A00;
        11T.A0A(r0);
        this.A01 = r0;
    }

    public final void A00(Integer num) {
        long now = this.A01.now();
        IABHistoryInteractionEvent iABHistoryInteractionEvent = new IABHistoryInteractionEvent(num, this.A02, "", now, now);
        new Bundle();
        Bundle A05 = 1BK.A05();
        A05.putBoolean("Tracking.ENABLED", true);
        this.A00.A08(new Bundle(A05), iABHistoryInteractionEvent, ZonePolicy.A03);
    }
}
