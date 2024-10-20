package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;

/* loaded from: Kpt.class */
public final class Kpt {
    public final Object A00;
    public final Object A01;
    public final Object A02;

    public Kpt(Object obj, Object obj2, Object obj3) {
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    public final IllegalArgumentException A00() {
        Object obj = this.A02;
        Object obj2 = this.A01;
        Object obj3 = this.A00;
        return AnonymousClass001.A0L(0Pz.A13("Multiple entries with same key: ", String.valueOf(obj3), InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, String.valueOf(obj2), " and ", String.valueOf(obj3), InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, String.valueOf(obj)));
    }
}
