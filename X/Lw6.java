package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.shopify.checkout.models.Address;
import com.shopify.checkout.models.DeliveryDetails;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: Lw6.class */
public final class Lw6 implements 5Yt {
    public static final Lw6 A00;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.5Yt, java.lang.Object, X.Lw6] */
    static {
        ?? obj = new Object();
        A00 = obj;
        PluginGeneratedSerialDescriptor A13 = JR0.A13("com.shopify.checkout.models.DeliveryDetails", (5Yt) obj);
        A13.A01(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, true);
        A13.A01("location", true);
        A13.A01("additionalInfo", true);
        A01 = A13;
    }

    public 5Yu[] childSerializers() {
        5ZL r0 = 5ZL.A01;
        return new 5Yu[]{KZ3.A00(r0), KZ3.A00(Lvw.A00), KZ3.A00(r0)};
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Z6 ABn = decoder.ABn(pluginGeneratedSerialDescriptor);
        String str = null;
        Address address = null;
        String str2 = null;
        int i = 0;
        while (true) {
            int i2 = i;
            int ALu = ABn.ALu(pluginGeneratedSerialDescriptor);
            if (ALu == -1) {
                ABn.AQH(pluginGeneratedSerialDescriptor);
                return new DeliveryDetails(address, str, str2, i2);
            }
            if (ALu == 0) {
                str = 4YV.A0w(str, pluginGeneratedSerialDescriptor, ABn, 0);
                i = i2 | 1;
            } else if (ALu == 1) {
                address = (Address) ABn.AM9(address, Lvw.A00, pluginGeneratedSerialDescriptor, 1);
                i = i2 | 2;
            } else {
                if (ALu != 2) {
                    throw M9V.A00(ALu);
                }
                str2 = 4YV.A0w(str2, pluginGeneratedSerialDescriptor, ABn, 2);
                i = i2 | 4;
            }
        }
    }

    public SerialDescriptor getDescriptor() {
        return A01;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        DeliveryDetails deliveryDetails = (DeliveryDetails) obj;
        boolean A1X = 1BL.A1X(encoder, deliveryDetails);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Za ABo = encoder.ABo(pluginGeneratedSerialDescriptor);
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 0) || deliveryDetails.A02 != null) {
            ABo.APv(deliveryDetails.A02, 5ZL.A01, pluginGeneratedSerialDescriptor, 0);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, A1X ? 1 : 0) || deliveryDetails.A00 != null) {
            ABo.APv(deliveryDetails.A00, Lvw.A00, pluginGeneratedSerialDescriptor, A1X ? 1 : 0);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 2) || deliveryDetails.A01 != null) {
            ABo.APv(deliveryDetails.A01, 5ZL.A01, pluginGeneratedSerialDescriptor, 2);
        }
        ABo.AQH(pluginGeneratedSerialDescriptor);
    }

    public 5Yu[] typeParametersSerializers() {
        return KbQ.A00;
    }
}
