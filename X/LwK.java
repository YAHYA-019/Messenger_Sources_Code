package X;

import com.shopify.checkout.models.errors.ErrorGroup;
import com.shopify.checkout.models.errors.ErrorGroupSerializer;
import com.shopify.checkout.models.errors.ParsableInternalErrorCode;
import com.shopify.checkout.models.errors.ParsableInternalErrorPayload;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: LwK.class */
public final class LwK implements 5Yt {
    public static final LwK A00;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.LwK, X.5Yt, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        PluginGeneratedSerialDescriptor A14 = JR0.A14("com.shopify.checkout.models.errors.ParsableInternalErrorPayload", (5Yt) obj);
        A14.A01("code", false);
        A14.A01("underlyingError", true);
        A14.A01("reason", true);
        A14.A01("group", true);
        A01 = A14;
    }

    public 5Yu[] childSerializers() {
        5Yu r0 = ParsableInternalErrorPayload.A04[0];
        5ZL r02 = 5ZL.A01;
        return new 5Yu[]{r0, KZ3.A00(r02), KZ3.A00(r02), ErrorGroupSerializer.A00};
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Z6 ABn = decoder.ABn(pluginGeneratedSerialDescriptor);
        5Yu[] r0 = ParsableInternalErrorPayload.A04;
        ParsableInternalErrorCode parsableInternalErrorCode = null;
        String str = null;
        String str2 = null;
        ErrorGroup errorGroup = null;
        int i = 0;
        while (true) {
            int i2 = i;
            int ALu = ABn.ALu(pluginGeneratedSerialDescriptor);
            if (ALu == -1) {
                ABn.AQH(pluginGeneratedSerialDescriptor);
                return new ParsableInternalErrorPayload(errorGroup, parsableInternalErrorCode, str, str2, i2);
            }
            if (ALu == 0) {
                parsableInternalErrorCode = (ParsableInternalErrorCode) JQz.A0h(parsableInternalErrorCode, pluginGeneratedSerialDescriptor, ABn, r0, 0);
                i = i2 | 1;
            } else if (ALu == 1) {
                str = 4YV.A0w(str, pluginGeneratedSerialDescriptor, ABn, 1);
                i = i2 | 2;
            } else if (ALu == 2) {
                str2 = 4YV.A0w(str2, pluginGeneratedSerialDescriptor, ABn, 2);
                i = i2 | 4;
            } else {
                if (ALu != 3) {
                    throw M9V.A00(ALu);
                }
                errorGroup = (ErrorGroup) ABn.AMB(errorGroup, ErrorGroupSerializer.A00, pluginGeneratedSerialDescriptor, 3);
                i = i2 | 8;
            }
        }
    }

    public SerialDescriptor getDescriptor() {
        return A01;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        ParsableInternalErrorPayload parsableInternalErrorPayload = (ParsableInternalErrorPayload) obj;
        boolean A1X = 1BL.A1X(encoder, parsableInternalErrorPayload);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Za ABo = encoder.ABo(pluginGeneratedSerialDescriptor);
        ABo.APw(parsableInternalErrorPayload.A01, ParsableInternalErrorPayload.A04[0], pluginGeneratedSerialDescriptor, 0);
        if (ABo.CxY(pluginGeneratedSerialDescriptor, A1X ? 1 : 0) || parsableInternalErrorPayload.A03 != null) {
            ABo.APv(parsableInternalErrorPayload.A03, 5ZL.A01, pluginGeneratedSerialDescriptor, A1X ? 1 : 0);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 2) || parsableInternalErrorPayload.A02 != null) {
            ABo.APv(parsableInternalErrorPayload.A02, 5ZL.A01, pluginGeneratedSerialDescriptor, 2);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 3) || parsableInternalErrorPayload.A00 != ErrorGroup.A05) {
            ABo.APw(parsableInternalErrorPayload.A00, ErrorGroupSerializer.A00, pluginGeneratedSerialDescriptor, 3);
        }
        ABo.AQH(pluginGeneratedSerialDescriptor);
    }

    public 5Yu[] typeParametersSerializers() {
        return KbQ.A00;
    }
}
