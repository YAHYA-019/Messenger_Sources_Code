package com.facebook.odin.model;

import X.11T;
import X.1BK;
import X.1BL;
import X.5Yt;
import X.5Yu;
import X.5Yv;
import X.5Z6;
import X.5ZL;
import X.5Za;
import X.JQz;
import X.JR0;
import X.JR1;
import X.KbQ;
import X.M9V;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: OdinContext$$serializer.class */
public final class OdinContext$$serializer implements 5Yt {
    public static final OdinContext$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.5Yt, com.facebook.odin.model.OdinContext$$serializer, java.lang.Object] */
    static {
        ?? obj = new Object();
        INSTANCE = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.facebook.odin.model.OdinContext", obj, 5);
        pluginGeneratedSerialDescriptor.A01(PublicKeyCredentialControllerUtility.JSON_KEY_ID, true);
        JR1.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, pluginGeneratedSerialDescriptor);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public 5Yu[] childSerializers() {
        5Yu[] r0 = OdinContext.A05;
        return new 5Yu[]{5ZL.A01, r0[1], r0[2], r0[3], r0[4]};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public OdinContext m8746deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        5Z6 ABn = decoder.ABn(pluginGeneratedSerialDescriptor);
        5Yu[] r0 = OdinContext.A05;
        String str = null;
        Type type = null;
        Map map = null;
        Map map2 = null;
        Map map3 = null;
        int i = 0;
        while (true) {
            int i2 = i;
            int ALu = ABn.ALu(pluginGeneratedSerialDescriptor);
            if (ALu == -1) {
                ABn.AQH(pluginGeneratedSerialDescriptor);
                return new OdinContext(type, str, map, map2, map3, i2);
            }
            if (ALu == 0) {
                str = ABn.AMG(pluginGeneratedSerialDescriptor, 0);
                i = i2 | 1;
            } else if (ALu == 1) {
                type = (Type) JQz.A0h(type, pluginGeneratedSerialDescriptor, ABn, r0, 1);
                i = i2 | 2;
            } else if (ALu == 2) {
                map = JR0.A0z(map, pluginGeneratedSerialDescriptor, ABn, r0, 2);
                i = i2 | 4;
            } else if (ALu == 3) {
                map2 = JR0.A0z(map2, pluginGeneratedSerialDescriptor, ABn, r0, 3);
                i = i2 | 8;
            } else {
                if (ALu != 4) {
                    throw M9V.A00(ALu);
                }
                map3 = JR0.A0z(map3, pluginGeneratedSerialDescriptor, ABn, r0, 4);
                i = i2 | 16;
            }
        }
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, OdinContext odinContext) {
        boolean A1X = 1BL.A1X(encoder, odinContext);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        5Za ABo = encoder.ABo(pluginGeneratedSerialDescriptor);
        5Yv[] r0 = OdinContext.A05;
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 0) || !11T.A0O(odinContext.A01, "")) {
            ABo.AQ0(odinContext.A01, pluginGeneratedSerialDescriptor, 0);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, A1X ? 1 : 0) || odinContext.A00 != Type.A0C) {
            ABo.APw(odinContext.A00, r0[A1X ? 1 : 0], pluginGeneratedSerialDescriptor, A1X ? 1 : 0);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 2) || !11T.A0O(odinContext.A03, 1BK.A1C())) {
            ABo.APw(odinContext.A03, r0[2], pluginGeneratedSerialDescriptor, 2);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 3) || !11T.A0O(odinContext.A02, 1BK.A1C())) {
            ABo.APw(odinContext.A02, r0[3], pluginGeneratedSerialDescriptor, 3);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 4) || !11T.A0O(odinContext.A04, 1BK.A1C())) {
            ABo.APw(odinContext.A04, r0[4], pluginGeneratedSerialDescriptor, 4);
        }
        ABo.AQH(pluginGeneratedSerialDescriptor);
    }

    public 5Yu[] typeParametersSerializers() {
        return KbQ.A00;
    }
}
