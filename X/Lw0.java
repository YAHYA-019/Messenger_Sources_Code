package X;

import com.shopify.checkout.models.CartLine;
import com.shopify.checkout.models.CartLineImage;
import com.shopify.checkout.models.Money;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: Lw0.class */
public final class Lw0 implements 5Yt {
    public static final Lw0 A00;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Lw0, X.5Yt, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.shopify.checkout.models.CartLine", obj, 7);
        pluginGeneratedSerialDescriptor.A01("merchandiseId", true);
        pluginGeneratedSerialDescriptor.A01("productId", true);
        pluginGeneratedSerialDescriptor.A01("image", true);
        pluginGeneratedSerialDescriptor.A01("quantity", false);
        pluginGeneratedSerialDescriptor.A01("title", false);
        pluginGeneratedSerialDescriptor.A01("price", false);
        pluginGeneratedSerialDescriptor.A01("discounts", true);
        A01 = pluginGeneratedSerialDescriptor;
    }

    public 5Yu[] childSerializers() {
        5Yu[] r0 = CartLine.A07;
        5Yu r02 = 5ZL.A01;
        return new 5Yu[]{KZ3.A00(r02), KZ3.A00(r02), KZ3.A00(Lw1.A00), Lv8.A00, r02, LwB.A00, KZ3.A00(r0[6])};
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Z6 ABn = decoder.ABn(pluginGeneratedSerialDescriptor);
        5Yw[] r0 = CartLine.A07;
        List list = null;
        Money money = null;
        String str = null;
        String str2 = null;
        CartLineImage cartLineImage = null;
        String str3 = null;
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            int ALu = ABn.ALu(pluginGeneratedSerialDescriptor);
            switch (ALu) {
                case -1:
                    ABn.AQH(pluginGeneratedSerialDescriptor);
                    return new CartLine(cartLineImage, money, str, str2, str3, list, i3, i);
                case 0:
                    str = 4YU.A17(str, 5ZL.A01, pluginGeneratedSerialDescriptor, ABn, 0);
                    i2 = i3 | 1;
                    break;
                case 1:
                    str2 = 4YU.A17(str2, 5ZL.A01, pluginGeneratedSerialDescriptor, ABn, 1);
                    i2 = i3 | 2;
                    break;
                case 2:
                    cartLineImage = (CartLineImage) ABn.AM9(cartLineImage, Lw1.A00, pluginGeneratedSerialDescriptor, 2);
                    i2 = i3 | 4;
                    break;
                case 3:
                    i = ABn.AM4(pluginGeneratedSerialDescriptor, 3);
                    i2 = i3 | 8;
                    break;
                case 4:
                    str3 = ABn.AMG(pluginGeneratedSerialDescriptor, 4);
                    i2 = i3 | 16;
                    break;
                case 5:
                    money = (Money) ABn.AMB(money, LwB.A00, pluginGeneratedSerialDescriptor, 5);
                    i2 = i3 | 32;
                    break;
                case 6:
                    list = (List) ABn.AM9(list, r0[6], pluginGeneratedSerialDescriptor, 6);
                    i2 = i3 | 64;
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
        CartLine cartLine = (CartLine) obj;
        boolean A1X = 1BL.A1X(encoder, cartLine);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Za ABo = encoder.ABo(pluginGeneratedSerialDescriptor);
        5Yv[] r0 = CartLine.A07;
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 0) || cartLine.A03 != null) {
            ABo.APv(cartLine.A03, 5ZL.A01, pluginGeneratedSerialDescriptor, 0);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, A1X ? 1 : 0) || cartLine.A04 != null) {
            ABo.APv(cartLine.A04, 5ZL.A01, pluginGeneratedSerialDescriptor, A1X ? 1 : 0);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 2) || cartLine.A01 != null) {
            ABo.APv(cartLine.A01, Lw1.A00, pluginGeneratedSerialDescriptor, 2);
        }
        ABo.APr(pluginGeneratedSerialDescriptor, 3, cartLine.A00);
        ABo.AQ0(cartLine.A05, pluginGeneratedSerialDescriptor, 4);
        ABo.APw(cartLine.A02, LwB.A00, pluginGeneratedSerialDescriptor, 5);
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 6) || cartLine.A06 != null) {
            ABo.APv(cartLine.A06, r0[6], pluginGeneratedSerialDescriptor, 6);
        }
        ABo.AQH(pluginGeneratedSerialDescriptor);
    }

    public 5Yu[] typeParametersSerializers() {
        return KbQ.A00;
    }
}
