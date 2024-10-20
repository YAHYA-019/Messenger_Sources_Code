package X;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: M9g.class */
public final class M9g extends 5Z9 {
    public List A00;
    public final java.util.Map A01;
    public final java.util.Map A02;
    public final C01i A03 = C01g.A00(C03i.A03, new LuK(this, 5));
    public final 0BZ A04;

    public M9g(0BZ r302, Annotation[] annotationArr, 0BZ[] r304, 5Yu[] r305) {
        this.A04 = r302;
        this.A00 = C0ty.A00;
        int min = Math.min(2, 2);
        ArrayList A0t = AnonymousClass001.A0t(min);
        for (int i = 0; i < min; i++) {
            7zU.A1Y(r304[i], r305[i], A0t);
        }
        java.util.Map A0B = 04R.A0B(A0t);
        this.A01 = A0B;
        Set<Map.Entry> entrySet = A0B.entrySet();
        LinkedHashMap A1C = 1BK.A1C();
        for (Map.Entry entry : entrySet) {
            String BA2 = ((5Yu) entry.getValue()).getDescriptor().BA2();
            Object obj = A1C.get(BA2);
            if (obj == null) {
                A1C.containsKey(BA2);
            }
            Map.Entry entry2 = (Map.Entry) obj;
            if (entry2 != null) {
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("Multiple sealed subclasses of '");
                A0k.append(this.A04);
                A0k.append("' have the same serial name '");
                A0k.append(BA2);
                A0k.append("': '");
                A0k.append(entry2.getKey());
                A0k.append("', '");
                A0k.append(entry.getKey());
                throw AnonymousClass001.A0N(AnonymousClass001.A0g(A0k, '\''));
            }
            A1C.put(BA2, entry);
        }
        LinkedHashMap A14 = DKE.A14(A1C);
        Iterator A0x = AnonymousClass001.A0x(A1C);
        while (A0x.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0x);
            A14.put(A0z.getKey(), ((Map.Entry) A0z.getValue()).getValue());
        }
        this.A02 = A14;
        this.A00 = JR0.A0x(annotationArr);
    }

    public 5Yw A00(String str, 5Z6 r303) {
        5Yw r304 = (5Yw) this.A02.get(str);
        if (r304 == null) {
            r304 = super.A00(str, r303);
        }
        return r304;
    }

    public 5Yv A01(Object obj, Encoder encoder) {
        5Yv r305 = (5Yv) this.A01.get(7zL.A18(obj.getClass()));
        if (r305 == null) {
            r305 = super.A01(obj, encoder);
            if (r305 == null) {
                r305 = null;
            }
        }
        return r305;
    }

    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.A03.getValue();
    }
}
