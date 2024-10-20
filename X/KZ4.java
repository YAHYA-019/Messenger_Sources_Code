package X;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: KZ4.class */
public abstract class KZ4 {
    public static final 0BZ A00(SerialDescriptor serialDescriptor) {
        if (serialDescriptor instanceof LvO) {
            return ((LvO) serialDescriptor).A01;
        }
        if (serialDescriptor instanceof LvS) {
            return A00(((LvS) serialDescriptor).A00);
        }
        return null;
    }
}
