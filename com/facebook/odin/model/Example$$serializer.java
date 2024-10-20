package com.facebook.odin.model;

import X.11T;
import X.1BL;
import X.5Yt;
import X.5Yu;
import X.5Yv;
import X.5Z6;
import X.5ZL;
import X.5Za;
import X.AnonymousClass001;
import X.JQz;
import X.JR0;
import X.KbQ;
import X.M9V;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.HashMap;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: Example$$serializer.class */
public final class Example$$serializer implements 5Yt {
    public static final Example$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.odin.model.Example$$serializer, X.5Yt, java.lang.Object] */
    static {
        ?? obj = new Object();
        INSTANCE = obj;
        PluginGeneratedSerialDescriptor A13 = JR0.A13("com.facebook.odin.model.Example", (5Yt) obj);
        A13.A01(PublicKeyCredentialControllerUtility.JSON_KEY_ID, true);
        A13.A01("exampleContext", true);
        A13.A01("features", true);
        descriptor = A13;
    }

    public 5Yu[] childSerializers() {
        return new 5Yu[]{5ZL.A01, ExampleContext$$serializer.INSTANCE, Example.A03[2]};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public Example m8734deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        5Z6 ABn = decoder.ABn(pluginGeneratedSerialDescriptor);
        5Yu[] r0 = Example.A03;
        String str = null;
        ExampleContext exampleContext = null;
        HashMap hashMap = null;
        int i = 0;
        while (true) {
            int i2 = i;
            int ALu = ABn.ALu(pluginGeneratedSerialDescriptor);
            if (ALu == -1) {
                ABn.AQH(pluginGeneratedSerialDescriptor);
                return new Example(exampleContext, str, hashMap, i2);
            }
            if (ALu == 0) {
                str = ABn.AMG(pluginGeneratedSerialDescriptor, 0);
                i = i2 | 1;
            } else if (ALu == 1) {
                exampleContext = (ExampleContext) ABn.AMB(exampleContext, ExampleContext$$serializer.INSTANCE, pluginGeneratedSerialDescriptor, 1);
                i = i2 | 2;
            } else {
                if (ALu != 2) {
                    throw M9V.A00(ALu);
                }
                hashMap = (HashMap) JQz.A0h(hashMap, pluginGeneratedSerialDescriptor, ABn, r0, 2);
                i = i2 | 4;
            }
        }
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, Example example) {
        boolean A1X = 1BL.A1X(encoder, example);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        5Za ABo = encoder.ABo(pluginGeneratedSerialDescriptor);
        5Yv[] r0 = Example.A03;
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 0) || !11T.A0O(example.A01, "identity")) {
            ABo.AQ0(example.A01, pluginGeneratedSerialDescriptor, 0);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, A1X ? 1 : 0) || !11T.A0O(example.A00, ExampleContext.A05)) {
            ABo.APw(example.A00, ExampleContext$$serializer.INSTANCE, pluginGeneratedSerialDescriptor, A1X ? 1 : 0);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 2) || !11T.A0O(example.A02, AnonymousClass001.A0u())) {
            ABo.APw(example.A02, r0[2], pluginGeneratedSerialDescriptor, 2);
        }
        ABo.AQH(pluginGeneratedSerialDescriptor);
    }

    public 5Yu[] typeParametersSerializers() {
        return KbQ.A00;
    }
}
