package kotlinx.serialization;

import X.0BZ;
import X.11T;
import X.5Yn;
import X.5Yu;
import X.5Zf;
import X.JR0;
import X.Kwm;
import X.LuM;
import X.LvO;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: ContextualSerializer.class */
public final class ContextualSerializer implements 5Yu {
    public final 0BZ A00;
    public final 5Yu A01;
    public final List A02;
    public final SerialDescriptor A03;

    public ContextualSerializer(0BZ r302, 5Yu r303, 5Yu[] r304) {
        this.A00 = r302;
        this.A01 = r303;
        this.A02 = JR0.A0x(r304);
        this.A03 = new LvO(r302, Kwm.A00("kotlinx.serialization.ContextualSerializer", new LuM(this, 5), 5Zf.A00, new SerialDescriptor[0]));
    }

    public Object deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        5Yn BA6 = decoder.BA6();
        0BZ r0 = this.A00;
        11T.A0F(r0, 0);
        BA6.A00.get(r0);
        return decoder.AMC(this.A01);
    }

    public SerialDescriptor getDescriptor() {
        return this.A03;
    }

    public void serialize(Encoder encoder, Object obj) {
        11T.A0H(encoder, obj);
        5Yn BA6 = encoder.BA6();
        0BZ r0 = this.A00;
        11T.A0F(r0, 0);
        BA6.A00.get(r0);
        encoder.APx(obj, this.A01);
    }
}
