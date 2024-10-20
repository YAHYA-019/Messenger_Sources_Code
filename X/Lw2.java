package X;

import com.shopify.checkout.models.CartInfo;
import com.shopify.checkout.models.CheckoutCompletedPayload;
import com.shopify.checkout.models.OrderDetails;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: Lw2.class */
public final class Lw2 implements 5Yt {
    public static final Lw2 A00;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.5Yt, java.lang.Object, X.Lw2] */
    static {
        ?? obj = new Object();
        A00 = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.shopify.checkout.models.CheckoutCompletedPayload", obj, 6);
        pluginGeneratedSerialDescriptor.A01("flowType", false);
        pluginGeneratedSerialDescriptor.A01("orderDetails", false);
        pluginGeneratedSerialDescriptor.A01("confirmationURL", false);
        pluginGeneratedSerialDescriptor.A01("orderId", false);
        pluginGeneratedSerialDescriptor.A01("cart", false);
        pluginGeneratedSerialDescriptor.A01("thankYouPageUrl", false);
        A01 = pluginGeneratedSerialDescriptor;
    }

    public 5Yu[] childSerializers() {
        5Yu r0 = 5ZL.A01;
        return new 5Yu[]{r0, LwD.A00, r0, r0, Lvz.A00, r0};
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Z6 ABn = decoder.ABn(pluginGeneratedSerialDescriptor);
        String str = null;
        OrderDetails orderDetails = null;
        String str2 = null;
        String str3 = null;
        CartInfo cartInfo = null;
        String str4 = null;
        int i = 0;
        while (true) {
            int i2 = i;
            int ALu = ABn.ALu(pluginGeneratedSerialDescriptor);
            switch (ALu) {
                case -1:
                    ABn.AQH(pluginGeneratedSerialDescriptor);
                    return new CheckoutCompletedPayload(cartInfo, orderDetails, str, str2, str3, str4, i2);
                case 0:
                    str = ABn.AMG(pluginGeneratedSerialDescriptor, 0);
                    i = i2 | 1;
                    break;
                case 1:
                    orderDetails = (OrderDetails) ABn.AMB(orderDetails, LwD.A00, pluginGeneratedSerialDescriptor, 1);
                    i = i2 | 2;
                    break;
                case 2:
                    str2 = ABn.AMG(pluginGeneratedSerialDescriptor, 2);
                    i = i2 | 4;
                    break;
                case 3:
                    str3 = ABn.AMG(pluginGeneratedSerialDescriptor, 3);
                    i = i2 | 8;
                    break;
                case 4:
                    cartInfo = (CartInfo) ABn.AMB(cartInfo, Lvz.A00, pluginGeneratedSerialDescriptor, 4);
                    i = i2 | 16;
                    break;
                case 5:
                    str4 = ABn.AMG(pluginGeneratedSerialDescriptor, 5);
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
        CheckoutCompletedPayload checkoutCompletedPayload = (CheckoutCompletedPayload) obj;
        boolean A1X = 1BL.A1X(encoder, checkoutCompletedPayload);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Za ABo = encoder.ABo(pluginGeneratedSerialDescriptor);
        ABo.AQ0(checkoutCompletedPayload.A03, pluginGeneratedSerialDescriptor, 0);
        ABo.APw(checkoutCompletedPayload.A01, LwD.A00, pluginGeneratedSerialDescriptor, A1X ? 1 : 0);
        ABo.AQ0(checkoutCompletedPayload.A02, pluginGeneratedSerialDescriptor, 2);
        ABo.AQ0(checkoutCompletedPayload.A04, pluginGeneratedSerialDescriptor, 3);
        ABo.APw(checkoutCompletedPayload.A00, Lvz.A00, pluginGeneratedSerialDescriptor, 4);
        ABo.AQ0(checkoutCompletedPayload.A05, pluginGeneratedSerialDescriptor, 5);
        ABo.AQH(pluginGeneratedSerialDescriptor);
    }

    public 5Yu[] typeParametersSerializers() {
        return KbQ.A00;
    }
}
