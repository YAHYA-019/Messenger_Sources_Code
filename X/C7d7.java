package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.List;

/* renamed from: X.7d7, reason: invalid class name */
/* loaded from: 7d7.class */
public final class C7d7 extends 2V0 {
    public final List A00 = AnonymousClass001.A0s();

    public Iterable A01() {
        return new 4nU(2Ri.A02(new Imb(this, 3), this.A00));
    }

    public String A02() {
        List<2V0> list = this.A00;
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        boolean z = true;
        for (2V0 r0 : list) {
            if (!z) {
                A0k.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            }
            A0k.append(r0.A02());
            z = false;
        }
        return A0k.toString();
    }

    public String[] A03() {
        return (String[]) 2Ri.A0I(A01());
    }
}
