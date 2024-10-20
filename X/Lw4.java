package X;

import com.shopify.checkout.models.BuyerInfo;
import com.shopify.checkout.models.CartInfo;
import com.shopify.checkout.models.CheckoutStatePayload;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: Lw4.class */
public final class Lw4 implements 5Yt {
    public static final Lw4 A00;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.5Yt, java.lang.Object, X.Lw4] */
    static {
        ?? obj = new Object();
        A00 = obj;
        PluginGeneratedSerialDescriptor A14 = JR0.A14("com.shopify.checkout.models.CheckoutStatePayload", (5Yt) obj);
        A14.A01("flowType", false);
        A14.A01("cart", false);
        A14.A01("buyer", true);
        A14.A01("deliveries", true);
        A01 = A14;
    }

    public 5Yu[] childSerializers() {
        return new 5Yu[]{5ZL.A01, Lvz.A00, KZ3.A00(Lvy.A00), KZ3.A00(CheckoutStatePayload.A04[3])};
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Z6 ABn = decoder.ABn(pluginGeneratedSerialDescriptor);
        5Yw[] r0 = CheckoutStatePayload.A04;
        String str = null;
        CartInfo cartInfo = null;
        BuyerInfo buyerInfo = null;
        List list = null;
        int i = 0;
        while (true) {
            int i2 = i;
            int ALu = ABn.ALu(pluginGeneratedSerialDescriptor);
            if (ALu == -1) {
                ABn.AQH(pluginGeneratedSerialDescriptor);
                return new CheckoutStatePayload(buyerInfo, cartInfo, str, list, i2);
            }
            if (ALu == 0) {
                str = ABn.AMG(pluginGeneratedSerialDescriptor, 0);
                i = i2 | 1;
            } else if (ALu == 1) {
                cartInfo = (CartInfo) ABn.AMB(cartInfo, Lvz.A00, pluginGeneratedSerialDescriptor, 1);
                i = i2 | 2;
            } else if (ALu == 2) {
                buyerInfo = (BuyerInfo) ABn.AM9(buyerInfo, Lvy.A00, pluginGeneratedSerialDescriptor, 2);
                i = i2 | 4;
            } else {
                if (ALu != 3) {
                    throw M9V.A00(ALu);
                }
                list = (List) ABn.AM9(list, r0[3], pluginGeneratedSerialDescriptor, 3);
                i = i2 | 8;
            }
        }
    }

    public SerialDescriptor getDescriptor() {
        return A01;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        CheckoutStatePayload checkoutStatePayload = (CheckoutStatePayload) obj;
        boolean A1X = 1BL.A1X(encoder, checkoutStatePayload);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Za ABo = encoder.ABo(pluginGeneratedSerialDescriptor);
        5Yv[] r0 = CheckoutStatePayload.A04;
        ABo.AQ0(checkoutStatePayload.A02, pluginGeneratedSerialDescriptor, 0);
        ABo.APw(checkoutStatePayload.A01, Lvz.A00, pluginGeneratedSerialDescriptor, A1X ? 1 : 0);
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 2) || checkoutStatePayload.A00 != null) {
            ABo.APv(checkoutStatePayload.A00, Lvy.A00, pluginGeneratedSerialDescriptor, 2);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 3) || checkoutStatePayload.A03 != null) {
            ABo.APv(checkoutStatePayload.A03, r0[3], pluginGeneratedSerialDescriptor, 3);
        }
        ABo.AQH(pluginGeneratedSerialDescriptor);
    }

    public 5Yu[] typeParametersSerializers() {
        return KbQ.A00;
    }
}
