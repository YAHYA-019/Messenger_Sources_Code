package X;

import com.shopify.checkout.models.Address;
import com.shopify.checkout.models.BuyerInfo;
import com.shopify.checkout.models.PaymentMethod;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: Lvy.class */
public final class Lvy implements 5Yt {
    public static final Lvy A00;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Lvy, X.5Yt, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        PluginGeneratedSerialDescriptor A14 = JR0.A14("com.shopify.checkout.models.BuyerInfo", (5Yt) obj);
        A14.A01("email", true);
        A14.A01("acceptsMarketing", true);
        A14.A01("selectedPaymentMethod", true);
        A14.A01("selectedShippingAddress", true);
        A01 = A14;
    }

    public 5Yu[] childSerializers() {
        return new 5Yu[]{KZ3.A00(5ZL.A01), Lv3.A00, KZ3.A00(LwF.A00), KZ3.A00(Lvw.A00)};
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Z6 ABn = decoder.ABn(pluginGeneratedSerialDescriptor);
        String str = null;
        PaymentMethod paymentMethod = null;
        Address address = null;
        int i = 0;
        boolean z = false;
        while (true) {
            int ALu = ABn.ALu(pluginGeneratedSerialDescriptor);
            if (ALu == -1) {
                ABn.AQH(pluginGeneratedSerialDescriptor);
                return new BuyerInfo(address, paymentMethod, str, i, z);
            }
            if (ALu == 0) {
                str = 4YV.A0w(str, pluginGeneratedSerialDescriptor, ABn, 0);
                i |= 1;
            } else if (ALu == 1) {
                z = ABn.ALn(pluginGeneratedSerialDescriptor, 1);
                i |= 2;
            } else if (ALu == 2) {
                paymentMethod = (PaymentMethod) ABn.AM9(paymentMethod, LwF.A00, pluginGeneratedSerialDescriptor, 2);
                i |= 4;
            } else {
                if (ALu != 3) {
                    throw M9V.A00(ALu);
                }
                address = (Address) ABn.AM9(address, Lvw.A00, pluginGeneratedSerialDescriptor, 3);
                i |= 8;
            }
        }
    }

    public SerialDescriptor getDescriptor() {
        return A01;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        BuyerInfo buyerInfo = (BuyerInfo) obj;
        boolean A1X = 1BL.A1X(encoder, buyerInfo);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Za ABo = encoder.ABo(pluginGeneratedSerialDescriptor);
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 0) || buyerInfo.A02 != null) {
            ABo.APv(buyerInfo.A02, 5ZL.A01, pluginGeneratedSerialDescriptor, 0);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, A1X ? 1 : 0) || buyerInfo.A03) {
            ABo.APg(pluginGeneratedSerialDescriptor, A1X ? 1 : 0, buyerInfo.A03);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 2) || buyerInfo.A01 != null) {
            ABo.APv(buyerInfo.A01, LwF.A00, pluginGeneratedSerialDescriptor, 2);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 3) || buyerInfo.A00 != null) {
            ABo.APv(buyerInfo.A00, Lvw.A00, pluginGeneratedSerialDescriptor, 3);
        }
        ABo.AQH(pluginGeneratedSerialDescriptor);
    }

    public 5Yu[] typeParametersSerializers() {
        return KbQ.A00;
    }
}
