package X;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: Lul.class */
public final class Lul implements 5Yu {
    public List A00 = C0ty.A00;
    public final Object A01;
    public final C01i A02;

    public Lul(String str, Object obj) {
        this.A01 = obj;
        this.A02 = C01g.A00(C03i.A03, new LuJ(str, this, 2));
    }

    public Object deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        SerialDescriptor descriptor = getDescriptor();
        5Z6 ABn = decoder.ABn(descriptor);
        int ALu = ABn.ALu(getDescriptor());
        if (ALu != -1) {
            throw new IllegalArgumentException(0Pz.A0T("Unexpected index ", ALu));
        }
        ABn.AQH(descriptor);
        return this.A01;
    }

    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.A02.getValue();
    }

    public void serialize(Encoder encoder, Object obj) {
        11T.A0F(encoder, 0);
        encoder.ABo(getDescriptor()).AQH(getDescriptor());
    }
}
