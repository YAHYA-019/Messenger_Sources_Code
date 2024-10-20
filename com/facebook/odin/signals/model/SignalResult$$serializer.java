package com.facebook.odin.signals.model;

import X.04R;
import X.11T;
import X.1BL;
import X.4YU;
import X.5Yt;
import X.5Yu;
import X.5Yv;
import X.5Yw;
import X.5Z6;
import X.5ZL;
import X.5ZP;
import X.5Za;
import X.JR0;
import X.KZ3;
import X.KbQ;
import X.M9V;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.odin.model.OdinContext;
import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: SignalResult$$serializer.class */
public final class SignalResult$$serializer implements 5Yt {
    public static final SignalResult$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.5Yt, java.lang.Object, com.facebook.odin.signals.model.SignalResult$$serializer] */
    static {
        ?? obj = new Object();
        INSTANCE = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.facebook.odin.signals.model.SignalResult", obj, 9);
        pluginGeneratedSerialDescriptor.A01(PublicKeyCredentialControllerUtility.JSON_KEY_ID, true);
        pluginGeneratedSerialDescriptor.A01(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, true);
        pluginGeneratedSerialDescriptor.A01("longs", true);
        pluginGeneratedSerialDescriptor.A01("floats", true);
        pluginGeneratedSerialDescriptor.A01("strings", true);
        pluginGeneratedSerialDescriptor.A01("stringLists", true);
        pluginGeneratedSerialDescriptor.A01("error", true);
        pluginGeneratedSerialDescriptor.A01("timestampInMillis", true);
        pluginGeneratedSerialDescriptor.A01("odinContext", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public 5Yu[] childSerializers() {
        5Yu[] r0 = SignalResult.A09;
        5Yu r02 = 5ZL.A01;
        return new 5Yu[]{r02, KZ3.A00(r02), r0[2], r0[3], r0[4], r0[5], KZ3.A00(r02), 5ZP.A00, KZ3.A00(r0[8])};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public SignalResult m8750deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        5Z6 ABn = decoder.ABn(pluginGeneratedSerialDescriptor);
        5Yw[] r0 = SignalResult.A09;
        String str = null;
        String str2 = null;
        Map map = null;
        Map map2 = null;
        OdinContext odinContext = null;
        Map map3 = null;
        long j = 0;
        int i = 0;
        String str3 = null;
        Map map4 = null;
        while (true) {
            int ALu = ABn.ALu(pluginGeneratedSerialDescriptor);
            switch (ALu) {
                case -1:
                    ABn.AQH(pluginGeneratedSerialDescriptor);
                    return new SignalResult(odinContext, str, str3, str2, map4, map, map2, map3, i, j);
                case 0:
                    str = ABn.AMG(pluginGeneratedSerialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str3 = 4YU.A17(str3, 5ZL.A01, pluginGeneratedSerialDescriptor, ABn, 1);
                    i |= 2;
                    break;
                case 2:
                    map4 = JR0.A0z(map4, pluginGeneratedSerialDescriptor, ABn, r0, 2);
                    i |= 4;
                    break;
                case 3:
                    map = JR0.A0z(map, pluginGeneratedSerialDescriptor, ABn, r0, 3);
                    i |= 8;
                    break;
                case 4:
                    map2 = JR0.A0z(map2, pluginGeneratedSerialDescriptor, ABn, r0, 4);
                    i |= 16;
                    break;
                case 5:
                    map3 = JR0.A0z(map3, pluginGeneratedSerialDescriptor, ABn, r0, 5);
                    i |= 32;
                    break;
                case 6:
                    str2 = 4YU.A17(str2, 5ZL.A01, pluginGeneratedSerialDescriptor, ABn, 6);
                    i |= 64;
                    break;
                case 7:
                    j = ABn.AM7(pluginGeneratedSerialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    odinContext = (OdinContext) ABn.AM9(odinContext, r0[8], pluginGeneratedSerialDescriptor, 8);
                    i |= 256;
                    break;
                default:
                    throw M9V.A00(ALu);
            }
        }
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, SignalResult signalResult) {
        boolean A1X = 1BL.A1X(encoder, signalResult);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        5Za ABo = encoder.ABo(pluginGeneratedSerialDescriptor);
        5Yv[] r0 = SignalResult.A09;
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 0) || !11T.A0O(signalResult.A03, "")) {
            ABo.AQ0(signalResult.A03, pluginGeneratedSerialDescriptor, 0);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, A1X ? 1 : 0) || signalResult.A04 != null) {
            ABo.APv(signalResult.A04, 5ZL.A01, pluginGeneratedSerialDescriptor, A1X ? 1 : 0);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 2) || !11T.A0O(signalResult.A06, 04R.A0G())) {
            ABo.APw(signalResult.A06, r0[2], pluginGeneratedSerialDescriptor, 2);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 3) || !11T.A0O(signalResult.A05, 04R.A0G())) {
            ABo.APw(signalResult.A05, r0[3], pluginGeneratedSerialDescriptor, 3);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 4) || !11T.A0O(signalResult.A08, 04R.A0G())) {
            ABo.APw(signalResult.A08, r0[4], pluginGeneratedSerialDescriptor, 4);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 5) || !11T.A0O(signalResult.A07, 04R.A0G())) {
            ABo.APw(signalResult.A07, r0[5], pluginGeneratedSerialDescriptor, 5);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 6) || signalResult.A02 != null) {
            ABo.APv(signalResult.A02, 5ZL.A01, pluginGeneratedSerialDescriptor, 6);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 7) || signalResult.A00 != 0) {
            ABo.APt(pluginGeneratedSerialDescriptor, 7, signalResult.A00);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 8) || signalResult.A01 != null) {
            ABo.APv(signalResult.A01, r0[8], pluginGeneratedSerialDescriptor, 8);
        }
        ABo.AQH(pluginGeneratedSerialDescriptor);
    }

    public 5Yu[] typeParametersSerializers() {
        return KbQ.A00;
    }
}
