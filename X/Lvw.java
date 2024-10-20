package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.shopify.checkout.models.Address;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: Lvw.class */
public final class Lvw implements 5Yt {
    public static final Lvw A00;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.5Yt, X.Lvw, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.shopify.checkout.models.Address", obj, 11);
        pluginGeneratedSerialDescriptor.A01("referenceId", true);
        pluginGeneratedSerialDescriptor.A01(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, true);
        pluginGeneratedSerialDescriptor.A01("firstName", true);
        pluginGeneratedSerialDescriptor.A01("lastName", true);
        pluginGeneratedSerialDescriptor.A01("postalCode", true);
        pluginGeneratedSerialDescriptor.A01("address1", true);
        pluginGeneratedSerialDescriptor.A01("address2", true);
        pluginGeneratedSerialDescriptor.A01(ServerW3CShippingAddressConstants.CITY, true);
        pluginGeneratedSerialDescriptor.A01("countryCode", true);
        pluginGeneratedSerialDescriptor.A01("zoneCode", true);
        pluginGeneratedSerialDescriptor.A01("phone", true);
        A01 = pluginGeneratedSerialDescriptor;
    }

    public 5Yu[] childSerializers() {
        5ZL r0 = 5ZL.A01;
        return new 5Yu[]{KZ3.A00(r0), KZ3.A00(r0), KZ3.A00(r0), KZ3.A00(r0), KZ3.A00(r0), KZ3.A00(r0), KZ3.A00(r0), KZ3.A00(r0), KZ3.A00(r0), KZ3.A00(r0), KZ3.A00(r0)};
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
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        int i = 0;
        while (true) {
            int i2 = i;
            int ALu = ABn.ALu(pluginGeneratedSerialDescriptor);
            switch (ALu) {
                case -1:
                    ABn.AQH(pluginGeneratedSerialDescriptor);
                    return new Address(str, str11, str9, str10, str8, str5, str7, str4, str3, str2, str6, i2);
                case 0:
                    str = 4YU.A17(str, 5ZL.A01, pluginGeneratedSerialDescriptor, ABn, 0);
                    i = i2 | 1;
                    break;
                case 1:
                    str11 = 4YU.A17(str11, 5ZL.A01, pluginGeneratedSerialDescriptor, ABn, 1);
                    i = i2 | 2;
                    break;
                case 2:
                    str9 = 4YU.A17(str9, 5ZL.A01, pluginGeneratedSerialDescriptor, ABn, 2);
                    i = i2 | 4;
                    break;
                case 3:
                    str10 = 4YU.A17(str10, 5ZL.A01, pluginGeneratedSerialDescriptor, ABn, 3);
                    i = i2 | 8;
                    break;
                case 4:
                    str8 = 4YU.A17(str8, 5ZL.A01, pluginGeneratedSerialDescriptor, ABn, 4);
                    i = i2 | 16;
                    break;
                case 5:
                    str5 = 4YU.A17(str5, 5ZL.A01, pluginGeneratedSerialDescriptor, ABn, 5);
                    i = i2 | 32;
                    break;
                case 6:
                    str7 = 4YU.A17(str7, 5ZL.A01, pluginGeneratedSerialDescriptor, ABn, 6);
                    i = i2 | 64;
                    break;
                case 7:
                    str4 = 4YU.A17(str4, 5ZL.A01, pluginGeneratedSerialDescriptor, ABn, 7);
                    i = i2 | 128;
                    break;
                case 8:
                    str3 = 4YU.A17(str3, 5ZL.A01, pluginGeneratedSerialDescriptor, ABn, 8);
                    i = i2 | 256;
                    break;
                case 9:
                    str2 = 4YU.A17(str2, 5ZL.A01, pluginGeneratedSerialDescriptor, ABn, 9);
                    i = i2 | 512;
                    break;
                case 10:
                    str6 = 4YU.A17(str6, 5ZL.A01, pluginGeneratedSerialDescriptor, ABn, 10);
                    i = i2 | 1024;
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
        Address address = (Address) obj;
        boolean A1X = 1BL.A1X(encoder, address);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Za ABo = encoder.ABo(pluginGeneratedSerialDescriptor);
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 0) || address.A09 != null) {
            ABo.APv(address.A09, 5ZL.A01, pluginGeneratedSerialDescriptor, 0);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, A1X ? 1 : 0) || address.A06 != null) {
            ABo.APv(address.A06, 5ZL.A01, pluginGeneratedSerialDescriptor, A1X ? 1 : 0);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 2) || address.A04 != null) {
            ABo.APv(address.A04, 5ZL.A01, pluginGeneratedSerialDescriptor, 2);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 3) || address.A05 != null) {
            ABo.APv(address.A05, 5ZL.A01, pluginGeneratedSerialDescriptor, 3);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 4) || address.A08 != null) {
            ABo.APv(address.A08, 5ZL.A01, pluginGeneratedSerialDescriptor, 4);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 5) || address.A00 != null) {
            ABo.APv(address.A00, 5ZL.A01, pluginGeneratedSerialDescriptor, 5);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 6) || address.A01 != null) {
            ABo.APv(address.A01, 5ZL.A01, pluginGeneratedSerialDescriptor, 6);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 7) || address.A02 != null) {
            ABo.APv(address.A02, 5ZL.A01, pluginGeneratedSerialDescriptor, 7);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 8) || address.A03 != null) {
            ABo.APv(address.A03, 5ZL.A01, pluginGeneratedSerialDescriptor, 8);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 9) || address.A0A != null) {
            ABo.APv(address.A0A, 5ZL.A01, pluginGeneratedSerialDescriptor, 9);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 10) || address.A07 != null) {
            ABo.APv(address.A07, 5ZL.A01, pluginGeneratedSerialDescriptor, 10);
        }
        ABo.AQH(pluginGeneratedSerialDescriptor);
    }

    public 5Yu[] typeParametersSerializers() {
        return KbQ.A00;
    }
}
