package X;

import com.shopify.checkout.models.CartInfo;
import com.shopify.checkout.models.Price;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: Lvz.class */
public final class Lvz implements 5Yt {
    public static final Lvz A00;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Lvz, X.5Yt, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        PluginGeneratedSerialDescriptor A13 = JR0.A13("com.shopify.checkout.models.CartInfo", (5Yt) obj);
        A13.A01("token", false);
        A13.A01("lines", false);
        A13.A01("price", false);
        A01 = A13;
    }

    public 5Yu[] childSerializers() {
        return new 5Yu[]{5ZL.A01, CartInfo.A03[1], LwG.A00};
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Z6 ABn = decoder.ABn(pluginGeneratedSerialDescriptor);
        5Yu[] r0 = CartInfo.A03;
        String str = null;
        List list = null;
        Price price = null;
        int i = 0;
        while (true) {
            int i2 = i;
            int ALu = ABn.ALu(pluginGeneratedSerialDescriptor);
            if (ALu == -1) {
                ABn.AQH(pluginGeneratedSerialDescriptor);
                return new CartInfo(price, str, list, i2);
            }
            if (ALu == 0) {
                str = ABn.AMG(pluginGeneratedSerialDescriptor, 0);
                i = i2 | 1;
            } else if (ALu == 1) {
                list = (List) JQz.A0h(list, pluginGeneratedSerialDescriptor, ABn, r0, 1);
                i = i2 | 2;
            } else {
                if (ALu != 2) {
                    throw M9V.A00(ALu);
                }
                price = (Price) ABn.AMB(price, LwG.A00, pluginGeneratedSerialDescriptor, 2);
                i = i2 | 4;
            }
        }
    }

    public SerialDescriptor getDescriptor() {
        return A01;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        CartInfo cartInfo = (CartInfo) obj;
        boolean A1X = 1BL.A1X(encoder, cartInfo);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Za ABo = encoder.ABo(pluginGeneratedSerialDescriptor);
        5Yv[] r0 = CartInfo.A03;
        ABo.AQ0(cartInfo.A01, pluginGeneratedSerialDescriptor, 0);
        ABo.APw(cartInfo.A02, r0[A1X ? 1 : 0], pluginGeneratedSerialDescriptor, A1X ? 1 : 0);
        ABo.APw(cartInfo.A00, LwG.A00, pluginGeneratedSerialDescriptor, 2);
        ABo.AQH(pluginGeneratedSerialDescriptor);
    }

    public 5Yu[] typeParametersSerializers() {
        return KbQ.A00;
    }
}
