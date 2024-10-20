package X;

import com.shopify.checkout.models.InitPayload;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: Lw9.class */
public final class Lw9 implements 5Yt {
    public static final Lw9 A00;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Lw9, X.5Yt, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        PluginGeneratedSerialDescriptor A11 = JR0.A11("com.shopify.checkout.models.InitPayload", (5Yt) obj);
        A11.A01("paymentUrl", false);
        A01 = A11;
    }

    public 5Yu[] childSerializers() {
        return new 5Yu[]{5ZL.A01};
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Z6 ABn = decoder.ABn(pluginGeneratedSerialDescriptor);
        String str = null;
        int i = 0;
        while (true) {
            int i2 = i;
            int ALu = ABn.ALu(pluginGeneratedSerialDescriptor);
            if (ALu == -1) {
                ABn.AQH(pluginGeneratedSerialDescriptor);
                return new InitPayload(str, i2);
            }
            if (ALu != 0) {
                throw M9V.A00(ALu);
            }
            str = ABn.AMG(pluginGeneratedSerialDescriptor, 0);
            i = i2 | 1;
        }
    }

    public SerialDescriptor getDescriptor() {
        return A01;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        InitPayload initPayload = (InitPayload) obj;
        11T.A0H(encoder, initPayload);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Za ABo = encoder.ABo(pluginGeneratedSerialDescriptor);
        ABo.AQ0(initPayload.A00, pluginGeneratedSerialDescriptor, 0);
        ABo.AQH(pluginGeneratedSerialDescriptor);
    }

    public 5Yu[] typeParametersSerializers() {
        return KbQ.A00;
    }
}
