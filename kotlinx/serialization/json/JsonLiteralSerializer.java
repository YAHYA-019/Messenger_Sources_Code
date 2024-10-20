package kotlinx.serialization.json;

import X.11T;
import X.5Yu;
import X.5ZM;
import X.AnonymousClass001;
import X.C7uj;
import X.JR1;
import X.Kwm;
import X.Kwn;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: JsonLiteralSerializer.class */
public final class JsonLiteralSerializer implements 5Yu {
    public static final JsonLiteralSerializer A01 = new Object();
    public static final SerialDescriptor A00 = Kwm.A01("kotlinx.serialization.json.JsonLiteral", 5ZM.A00);

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        JsonElement AM5 = Kwn.A00(decoder).AM5();
        if (AM5 instanceof JsonLiteral) {
            return AM5;
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        throw C7uj.A01(AM5.toString(), AnonymousClass001.A0a(JR1.A17(AM5, "Unexpected JSON element, expected JsonLiteral, had ", A0k), A0k), -1);
    }

    public SerialDescriptor getDescriptor() {
        return A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00be, code lost:
    
        if (r0.equals("false") != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void serialize(kotlinx.serialization.encoding.Encoder r302, java.lang.Object r303) {
        /*
            r301 = this;
            r0 = r303
            kotlinx.serialization.json.JsonLiteral r0 = (kotlinx.serialization.json.JsonLiteral) r0
            r303 = r0
            r0 = r302
            r1 = r303
            X.11T.A0H(r0, r1)
            r0 = r302
            X.Kwn.A01(r0)
            r0 = r303
            boolean r0 = r0.A01
            r304 = r0
            r0 = r304
            if (r0 != 0) goto Lc4
            r0 = r303
            java.lang.String r0 = r0.A00
            r305 = r0
            r0 = r305
            java.lang.Long r0 = X.0CW.A0e(r0)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L39
            r0 = r306
            long r0 = r0.longValue()
            r307 = r0
        L30:
            r0 = r302
            r1 = r307
            r0.APs(r1)
            return
        L39:
            r0 = 0
            r304 = r0
            r0 = r305
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r305
            X.141 r0 = X.C0zh.A01(r0)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L65
            r0 = r306
            long r0 = r0.A00
            r307 = r0
            kotlinx.serialization.descriptors.SerialDescriptor r0 = X.LvD.A00
            r306 = r0
            r0 = r302
            r1 = r306
            kotlinx.serialization.encoding.Encoder r0 = r0.APo(r1)
            r302 = r0
            goto L30
        L65:
            r0 = r305
            java.lang.Double r0 = X.0CX.A0h(r0)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L81
            r0 = r306
            double r0 = r0.doubleValue()
            r309 = r0
            r0 = r302
            r1 = r309
            r0.APj(r1)
            return
        L81:
            r0 = 0
            r311 = r0
            java.lang.String r0 = "true"
            r306 = r0
            r0 = r305
            r1 = r306
            boolean r0 = r0.equals(r1)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto Lb1
            r0 = 1
            r311 = r0
        L97:
            r0 = r311
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto Lc4
            r0 = r306
            boolean r0 = r0.booleanValue()
            r304 = r0
            r0 = r302
            r1 = r304
            r0.APf(r1)
            return
        Lb1:
            java.lang.String r0 = "false"
            r306 = r0
            r0 = r305
            r1 = r306
            boolean r0 = r0.equals(r1)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto Lc4
            goto L97
        Lc4:
            r0 = r303
            java.lang.String r0 = r0.A00
            r306 = r0
            r0 = r302
            r1 = r306
            r0.APz(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.JsonLiteralSerializer.serialize(kotlinx.serialization.encoding.Encoder, java.lang.Object):void");
    }
}
