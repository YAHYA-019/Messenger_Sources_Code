package X;

import com.shopify.checkout.models.Address;
import com.shopify.checkout.models.PaymentMethod;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: LwF.class */
public final class LwF implements 5Yt {
    public static final LwF A00;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.5Yt, java.lang.Object, X.LwF] */
    static {
        ?? obj = new Object();
        A00 = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.shopify.checkout.models.PaymentMethod", obj, 6);
        pluginGeneratedSerialDescriptor.A01("referenceId", false);
        pluginGeneratedSerialDescriptor.A01("cardType", false);
        pluginGeneratedSerialDescriptor.A01("lastFourDigits", false);
        pluginGeneratedSerialDescriptor.A01("expirationMonth", false);
        pluginGeneratedSerialDescriptor.A01("expirationYear", false);
        pluginGeneratedSerialDescriptor.A01("billingAddress", false);
        A01 = pluginGeneratedSerialDescriptor;
    }

    public 5Yu[] childSerializers() {
        5Yu r0 = 5ZL.A01;
        return new 5Yu[]{r0, r0, r0, r0, r0, Lvw.A00};
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Z6 ABn = decoder.ABn(pluginGeneratedSerialDescriptor);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Address address = null;
        int i = 0;
        while (true) {
            int i2 = i;
            int ALu = ABn.ALu(pluginGeneratedSerialDescriptor);
            switch (ALu) {
                case -1:
                    ABn.AQH(pluginGeneratedSerialDescriptor);
                    return new PaymentMethod(address, str, str2, str3, str4, str5, i2);
                case 0:
                    str = ABn.AMG(pluginGeneratedSerialDescriptor, 0);
                    i = i2 | 1;
                    break;
                case 1:
                    str2 = ABn.AMG(pluginGeneratedSerialDescriptor, 1);
                    i = i2 | 2;
                    break;
                case 2:
                    str3 = ABn.AMG(pluginGeneratedSerialDescriptor, 2);
                    i = i2 | 4;
                    break;
                case 3:
                    str4 = ABn.AMG(pluginGeneratedSerialDescriptor, 3);
                    i = i2 | 8;
                    break;
                case 4:
                    str5 = ABn.AMG(pluginGeneratedSerialDescriptor, 4);
                    i = i2 | 16;
                    break;
                case 5:
                    address = (Address) ABn.AMB(address, Lvw.A00, pluginGeneratedSerialDescriptor, 5);
                    i = i2 | 32;
                    break;
                default:
                    throw M9V.A00(ALu);
            }
        }
    }

    public SerialDescriptor getDescriptor() {
        return A01;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        PaymentMethod paymentMethod = (PaymentMethod) obj;
        boolean A1X = 1BL.A1X(encoder, paymentMethod);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Za ABo = encoder.ABo(pluginGeneratedSerialDescriptor);
        ABo.AQ0(paymentMethod.A05, pluginGeneratedSerialDescriptor, 0);
        ABo.AQ0(paymentMethod.A01, pluginGeneratedSerialDescriptor, A1X ? 1 : 0);
        ABo.AQ0(paymentMethod.A04, pluginGeneratedSerialDescriptor, 2);
        ABo.AQ0(paymentMethod.A02, pluginGeneratedSerialDescriptor, 3);
        ABo.AQ0(paymentMethod.A03, pluginGeneratedSerialDescriptor, 4);
        ABo.APw(paymentMethod.A00, Lvw.A00, pluginGeneratedSerialDescriptor, 5);
        ABo.AQH(pluginGeneratedSerialDescriptor);
    }

    public 5Yu[] typeParametersSerializers() {
        return KbQ.A00;
    }
}
