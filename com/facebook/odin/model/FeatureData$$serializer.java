package com.facebook.odin.model;

import X.04R;
import X.11T;
import X.1BL;
import X.4YU;
import X.5Yt;
import X.5Yu;
import X.5Yv;
import X.5Z6;
import X.5ZL;
import X.5ZP;
import X.5Za;
import X.C0ty;
import X.JQz;
import X.JR0;
import X.JR1;
import X.KZ3;
import X.KbQ;
import X.Lv3;
import X.Lv6;
import X.M9V;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.utils.RequestDefragmentingOutputStream;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: FeatureData$$serializer.class */
public final class FeatureData$$serializer implements 5Yt {
    public static final FeatureData$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.5Yt, java.lang.Object, com.facebook.odin.model.FeatureData$$serializer] */
    static {
        ?? obj = new Object();
        INSTANCE = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.facebook.odin.model.FeatureData", obj, 14);
        pluginGeneratedSerialDescriptor.A01(PublicKeyCredentialControllerUtility.JSON_KEY_ID, true);
        pluginGeneratedSerialDescriptor.A01(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, true);
        pluginGeneratedSerialDescriptor.A01("longVal", true);
        pluginGeneratedSerialDescriptor.A01("doubleVal", true);
        pluginGeneratedSerialDescriptor.A01("stringVal", true);
        pluginGeneratedSerialDescriptor.A01("booleanVal", true);
        pluginGeneratedSerialDescriptor.A01("longList", true);
        pluginGeneratedSerialDescriptor.A01("doubleList", true);
        pluginGeneratedSerialDescriptor.A01("stringList", true);
        JR1.A1L("booleanList", pluginGeneratedSerialDescriptor);
        pluginGeneratedSerialDescriptor.A01("booleanMap", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public 5Yu[] childSerializers() {
        5Yu[] r0 = FeatureData.A0E;
        5Yu r02 = 5ZL.A01;
        return new 5Yu[]{r02, r0[1], 5ZP.A00, Lv6.A00, KZ3.A00(r02), Lv3.A00, r0[6], r0[7], r0[8], r0[9], r0[10], r0[11], r0[12], r0[13]};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public FeatureData m8740deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        5Z6 ABn = decoder.ABn(pluginGeneratedSerialDescriptor);
        5Yu[] r0 = FeatureData.A0E;
        int i = 0;
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        String str = null;
        Map map = null;
        Map map2 = null;
        Map map3 = null;
        Map map4 = null;
        Type type = null;
        long j = 0;
        double d = 0.0d;
        String str2 = null;
        boolean z = false;
        while (true) {
            int ALu = ABn.ALu(pluginGeneratedSerialDescriptor);
            switch (ALu) {
                case -1:
                    ABn.AQH(pluginGeneratedSerialDescriptor);
                    return new FeatureData(type, str2, str, list4, list2, list3, list, map3, map2, map4, map, d, i, j, z);
                case 0:
                    str2 = ABn.AMG(pluginGeneratedSerialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    type = (Type) JQz.A0h(type, pluginGeneratedSerialDescriptor, ABn, r0, 1);
                    i |= 2;
                    break;
                case 2:
                    j = ABn.AM7(pluginGeneratedSerialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    d = ABn.ALt(pluginGeneratedSerialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str = 4YU.A17(str, 5ZL.A01, pluginGeneratedSerialDescriptor, ABn, 4);
                    i |= 16;
                    break;
                case 5:
                    z = ABn.ALn(pluginGeneratedSerialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    list4 = (List) JQz.A0h(list4, pluginGeneratedSerialDescriptor, ABn, r0, 6);
                    i |= 64;
                    break;
                case 7:
                    list2 = (List) JQz.A0h(list2, pluginGeneratedSerialDescriptor, ABn, r0, 7);
                    i |= 128;
                    break;
                case 8:
                    list3 = (List) JQz.A0h(list3, pluginGeneratedSerialDescriptor, ABn, r0, 8);
                    i |= 256;
                    break;
                case 9:
                    list = (List) JQz.A0h(list, pluginGeneratedSerialDescriptor, ABn, r0, 9);
                    i |= 512;
                    break;
                case 10:
                    map3 = JR0.A0z(map3, pluginGeneratedSerialDescriptor, ABn, r0, 10);
                    i |= 1024;
                    break;
                case 11:
                    map2 = JR0.A0z(map2, pluginGeneratedSerialDescriptor, ABn, r0, 11);
                    i |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
                    break;
                case 12:
                    map4 = JR0.A0z(map4, pluginGeneratedSerialDescriptor, ABn, r0, 12);
                    i |= RequestDefragmentingOutputStream.BODY_BUFFER_SIZE;
                    break;
                case 13:
                    map = JR0.A0z(map, pluginGeneratedSerialDescriptor, ABn, r0, 13);
                    i |= 8192;
                    break;
                default:
                    throw M9V.A00(ALu);
            }
        }
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, FeatureData featureData) {
        boolean A1X = 1BL.A1X(encoder, featureData);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        5Za ABo = encoder.ABo(pluginGeneratedSerialDescriptor);
        5Yv[] r0 = FeatureData.A0E;
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 0) || !11T.A0O(featureData.A03, "")) {
            ABo.AQ0(featureData.A03, pluginGeneratedSerialDescriptor, 0);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, A1X ? 1 : 0) || featureData.A02 != Type.A06) {
            ABo.APw(featureData.A02, r0[A1X ? 1 : 0], pluginGeneratedSerialDescriptor, A1X ? 1 : 0);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 2) || featureData.A01 != -1) {
            ABo.APt(pluginGeneratedSerialDescriptor, 2, featureData.A01);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 3) || Double.compare(featureData.A00, -1.0d) != 0) {
            ABo.APk(pluginGeneratedSerialDescriptor, featureData.A00, 3);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 4) || featureData.A04 != null) {
            ABo.APv(featureData.A04, 5ZL.A01, pluginGeneratedSerialDescriptor, 4);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 5) || featureData.A0D) {
            ABo.APg(pluginGeneratedSerialDescriptor, 5, featureData.A0D);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 6) || !11T.A0O(featureData.A07, C0ty.A00)) {
            ABo.APw(featureData.A07, r0[6], pluginGeneratedSerialDescriptor, 6);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 7) || !11T.A0O(featureData.A06, C0ty.A00)) {
            ABo.APw(featureData.A06, r0[7], pluginGeneratedSerialDescriptor, 7);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 8) || !11T.A0O(featureData.A08, C0ty.A00)) {
            ABo.APw(featureData.A08, r0[8], pluginGeneratedSerialDescriptor, 8);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 9) || !11T.A0O(featureData.A05, C0ty.A00)) {
            ABo.APw(featureData.A05, r0[9], pluginGeneratedSerialDescriptor, 9);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 10) || !11T.A0O(featureData.A0B, 04R.A0G())) {
            ABo.APw(featureData.A0B, r0[10], pluginGeneratedSerialDescriptor, 10);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 11) || !11T.A0O(featureData.A0A, 04R.A0G())) {
            ABo.APw(featureData.A0A, r0[11], pluginGeneratedSerialDescriptor, 11);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 12) || !11T.A0O(featureData.A0C, 04R.A0G())) {
            ABo.APw(featureData.A0C, r0[12], pluginGeneratedSerialDescriptor, 12);
        }
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 13) || !11T.A0O(featureData.A09, 04R.A0G())) {
            ABo.APw(featureData.A09, r0[13], pluginGeneratedSerialDescriptor, 13);
        }
        ABo.AQH(pluginGeneratedSerialDescriptor);
    }

    public 5Yu[] typeParametersSerializers() {
        return KbQ.A00;
    }
}
