package com.facebook.odin.model;

import X.11T;
import X.5Yt;
import X.5Yu;
import X.5Z6;
import X.5Za;
import X.JQz;
import X.JR0;
import X.KbQ;
import X.M9V;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: Matrix$$serializer.class */
public final class Matrix$$serializer implements 5Yt {
    public static final Matrix$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.5Yt, java.lang.Object, com.facebook.odin.model.Matrix$$serializer] */
    static {
        ?? obj = new Object();
        INSTANCE = obj;
        PluginGeneratedSerialDescriptor A11 = JR0.A11("com.facebook.odin.model.Matrix", (5Yt) obj);
        A11.A01("matrixInternal", false);
        descriptor = A11;
    }

    public 5Yu[] childSerializers() {
        return new 5Yu[]{Matrix.A01[0]};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public Matrix m8743deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        5Z6 ABn = decoder.ABn(pluginGeneratedSerialDescriptor);
        5Yu[] r0 = Matrix.A01;
        float[][] fArr = null;
        int i = 0;
        while (true) {
            int i2 = i;
            int ALu = ABn.ALu(pluginGeneratedSerialDescriptor);
            if (ALu == -1) {
                ABn.AQH(pluginGeneratedSerialDescriptor);
                return new Matrix(fArr, i2);
            }
            if (ALu != 0) {
                throw M9V.A00(ALu);
            }
            fArr = (float[][]) JQz.A0h(fArr, pluginGeneratedSerialDescriptor, ABn, r0, 0);
            i = i2 | 1;
        }
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, Matrix matrix) {
        11T.A0H(encoder, matrix);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        5Za ABo = encoder.ABo(pluginGeneratedSerialDescriptor);
        ABo.APw(matrix.A00, Matrix.A01[0], pluginGeneratedSerialDescriptor, 0);
        ABo.AQH(pluginGeneratedSerialDescriptor);
    }

    public 5Yu[] typeParametersSerializers() {
        return KbQ.A00;
    }
}
