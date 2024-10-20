package X;

import java.util.HashSet;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: L6t.class */
public abstract class L6t {
    public static final SerialDescriptor[] A00 = new SerialDescriptor[0];

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.Set] */
    public static final Set A00(SerialDescriptor serialDescriptor) {
        HashSet hashSet;
        if (serialDescriptor instanceof 5Yz) {
            hashSet = ((5Yz) serialDescriptor).BA3();
        } else {
            hashSet = new HashSet(serialDescriptor.Aj9());
            int Aj9 = serialDescriptor.Aj9();
            for (int i = 0; i < Aj9; i++) {
                hashSet.add(serialDescriptor.Aj8(i));
            }
        }
        return hashSet;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (r303 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlinx.serialization.descriptors.SerialDescriptor[] A01(java.util.List r301) {
        /*
            r0 = r301
            if (r0 == 0) goto L23
            r0 = r301
            boolean r0 = r0.isEmpty()
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L23
            r0 = 0
            kotlinx.serialization.descriptors.SerialDescriptor[] r0 = new kotlinx.serialization.descriptors.SerialDescriptor[r0]
            r303 = r0
            r0 = r301
            r1 = r303
            java.lang.Object[] r0 = r0.toArray(r1)
            kotlinx.serialization.descriptors.SerialDescriptor[] r0 = (kotlinx.serialization.descriptors.SerialDescriptor[]) r0
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L27
        L23:
            kotlinx.serialization.descriptors.SerialDescriptor[] r0 = X.L6t.A00
            r303 = r0
        L27:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L6t.A01(java.util.List):kotlinx.serialization.descriptors.SerialDescriptor[]");
    }
}
