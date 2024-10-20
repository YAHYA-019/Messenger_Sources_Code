package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: Lup.class */
public final class Lup implements 5Yu {
    public static final Lup A00 = new Object();
    public static final SerialDescriptor A01 = Kwm.A01("Feature", 5ZM.A00);

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        List A19 = 4YU.A19(decoder.AMF(), InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0);
        return new Jt7(1BK.A14(A19, 0), Integer.parseInt(1BK.A14(A19, 1)));
    }

    public SerialDescriptor getDescriptor() {
        return A01;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        Jt7 jt7 = (Jt7) obj;
        11T.A0H(encoder, jt7);
        encoder.APz(0Pz.A0M(jt7.A01, ',', jt7.A00));
    }
}
