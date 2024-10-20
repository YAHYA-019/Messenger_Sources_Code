package X;

import com.shopify.checkout.models.DeliveryDetails;
import com.shopify.checkout.models.DeliveryInfo;
import com.shopify.checkout.models.DeliveryMethod;
import com.shopify.checkout.models.DeliveryMethodSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: Lw7.class */
public final class Lw7 implements 5Yt {
    public static final Lw7 A00;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.5Yt, X.Lw7, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        PluginGeneratedSerialDescriptor A12 = JR0.A12("com.shopify.checkout.models.DeliveryInfo", (5Yt) obj);
        A12.A01("method", false);
        A12.A01("details", false);
        A01 = A12;
    }

    public 5Yu[] childSerializers() {
        return new 5Yu[]{DeliveryMethodSerializer.A00, Lw6.A00};
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Z6 ABn = decoder.ABn(pluginGeneratedSerialDescriptor);
        DeliveryMethod deliveryMethod = null;
        DeliveryDetails deliveryDetails = null;
        int i = 0;
        while (true) {
            int i2 = i;
            int ALu = ABn.ALu(pluginGeneratedSerialDescriptor);
            if (ALu == -1) {
                ABn.AQH(pluginGeneratedSerialDescriptor);
                return new DeliveryInfo(deliveryDetails, deliveryMethod, i2);
            }
            if (ALu == 0) {
                deliveryMethod = (DeliveryMethod) ABn.AMB(deliveryMethod, DeliveryMethodSerializer.A00, pluginGeneratedSerialDescriptor, 0);
                i = i2 | 1;
            } else {
                if (ALu != 1) {
                    throw M9V.A00(ALu);
                }
                deliveryDetails = (DeliveryDetails) ABn.AMB(deliveryDetails, Lw6.A00, pluginGeneratedSerialDescriptor, 1);
                i = i2 | 2;
            }
        }
    }

    public SerialDescriptor getDescriptor() {
        return A01;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        DeliveryInfo deliveryInfo = (DeliveryInfo) obj;
        boolean A1X = 1BL.A1X(encoder, deliveryInfo);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Za ABo = encoder.ABo(pluginGeneratedSerialDescriptor);
        ABo.APw(deliveryInfo.A01, DeliveryMethodSerializer.A00, pluginGeneratedSerialDescriptor, 0);
        ABo.APw(deliveryInfo.A00, Lw6.A00, pluginGeneratedSerialDescriptor, A1X ? 1 : 0);
        ABo.AQH(pluginGeneratedSerialDescriptor);
    }

    public 5Yu[] typeParametersSerializers() {
        return KbQ.A00;
    }
}
