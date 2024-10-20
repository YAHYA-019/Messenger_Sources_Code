package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: Lun.class */
public final class Lun implements 5Yu {
    public final 5Yu A00;
    public final SerialDescriptor A01;

    public Lun(5Yu r302) {
        this.A00 = r302;
        this.A01 = new LvS(r302.getDescriptor());
    }

    public Object deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        if (decoder.AM8()) {
            return decoder.AMC(this.A00);
        }
        return null;
    }

    public boolean equals(Object obj) {
        return this == obj || (obj != null && getClass() == obj.getClass() && 11T.A0O(this.A00, ((Lun) obj).A00));
    }

    public SerialDescriptor getDescriptor() {
        return this.A01;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public void serialize(Encoder encoder, Object obj) {
        11T.A0F(encoder, 0);
        if (obj != null) {
            encoder.APx(obj, this.A00);
        } else {
            encoder.APu();
        }
    }
}
