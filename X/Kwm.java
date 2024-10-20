package X;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: Kwm.class */
public abstract class Kwm {
    public static final LvT A00(String str, Function1 function1, 5ZD r303, SerialDescriptor[] serialDescriptorArr) {
        11T.A0F(str, 0);
        if (!7zL.A1V(str)) {
            throw AnonymousClass001.A0L("Blank serial names are prohibited");
        }
        if (!(!r303.equals(5ZB.A00))) {
            throw AnonymousClass001.A0L("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        L0k l0k = new L0k(str);
        function1.invoke(l0k);
        return new LvT(str, 02L.A09(serialDescriptorArr), l0k, r303, l0k.A03.size());
    }

    public static final 5ZO A01(String str, 5ZN r302) {
        if (!7zL.A1V(str)) {
            throw AnonymousClass001.A0L("Blank serial names are prohibited");
        }
        Iterator A1B = 1BK.A1B(Ky0.A00);
        while (A1B.hasNext()) {
            String A01 = C0Bx.A01(((0BZ) A1B.next()).A00);
            11T.A0D(A01);
            String A00 = Ky0.A00(A01);
            if (str.equalsIgnoreCase(0Pz.A0W("kotlin.", A00)) || str.equalsIgnoreCase(A00)) {
                throw AnonymousClass001.A0L(0Cc.A0j(0Pz.A0z("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exist ", Ky0.A00(A00), "Serializer.\n                Please refer to SerialDescriptor documentation for additional information.\n            ")));
            }
        }
        return new 5ZO(str, r302);
    }
}
