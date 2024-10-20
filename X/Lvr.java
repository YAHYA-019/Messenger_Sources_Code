package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: Lvr.class */
public final class Lvr implements 5Yt {
    public static final Lvr A00;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.5Yt, java.lang.Object, X.Lvr] */
    static {
        ?? obj = new Object();
        A00 = obj;
        PluginGeneratedSerialDescriptor A13 = JR0.A13("com.facebook.payments.p2m.messenger.plugins.payment.ctahandler.bloksasynccontroller.P2mBloksAsyncControllerXmaHandler.ActionContentBlob", (5Yt) obj);
        A13.A01("action_type", false);
        A13.A01("entry_point", false);
        A13.A01("extra_data", true);
        A01 = A13;
    }

    public 5Yu[] childSerializers() {
        5Yu[] r0 = Jt4.A03;
        5Yu r02 = 5ZL.A01;
        return new 5Yu[]{r02, r02, KZ3.A00(r0[2])};
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Z6 ABn = decoder.ABn(pluginGeneratedSerialDescriptor);
        5Yw[] r0 = Jt4.A03;
        String str = null;
        String str2 = null;
        java.util.Map map = null;
        int i = 0;
        while (true) {
            int i2 = i;
            int ALu = ABn.ALu(pluginGeneratedSerialDescriptor);
            if (ALu == -1) {
                ABn.AQH(pluginGeneratedSerialDescriptor);
                return new Jt4(str, str2, map, i2);
            }
            if (ALu == 0) {
                str = ABn.AMG(pluginGeneratedSerialDescriptor, 0);
                i = i2 | 1;
            } else if (ALu == 1) {
                str2 = ABn.AMG(pluginGeneratedSerialDescriptor, 1);
                i = i2 | 2;
            } else {
                if (ALu != 2) {
                    throw M9V.A00(ALu);
                }
                map = (java.util.Map) ABn.AM9(map, r0[2], pluginGeneratedSerialDescriptor, 2);
                i = i2 | 4;
            }
        }
    }

    public SerialDescriptor getDescriptor() {
        return A01;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        Jt4 jt4 = (Jt4) obj;
        boolean A1X = 1BL.A1X(encoder, jt4);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Za ABo = encoder.ABo(pluginGeneratedSerialDescriptor);
        5Yv[] r0 = Jt4.A03;
        ABo.AQ0(jt4.A00, pluginGeneratedSerialDescriptor, 0);
        ABo.AQ0(jt4.A01, pluginGeneratedSerialDescriptor, A1X ? 1 : 0);
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 2) || jt4.A02 != null) {
            ABo.APv(jt4.A02, r0[2], pluginGeneratedSerialDescriptor, 2);
        }
        ABo.AQH(pluginGeneratedSerialDescriptor);
    }

    public 5Yu[] typeParametersSerializers() {
        return KbQ.A00;
    }
}
