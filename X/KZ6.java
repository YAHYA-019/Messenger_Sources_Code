package X;

import java.util.Arrays;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: KZ6.class */
public abstract class KZ6 {
    public static final int A00(SerialDescriptor serialDescriptor, SerialDescriptor[] serialDescriptorArr) {
        int i;
        11T.A0F(serialDescriptorArr, 1);
        int A02 = 4YV.A02(serialDescriptor.BA2()) + Arrays.hashCode(serialDescriptorArr);
        int Aj9 = serialDescriptor.Aj9();
        int i2 = 1;
        int i3 = 1;
        while (true) {
            i = i3;
            int i4 = Aj9;
            if (Aj9 <= 0) {
                break;
            }
            int i5 = 0;
            Aj9--;
            SerialDescriptor Aj5 = serialDescriptor.Aj5(serialDescriptor.Aj9() - i4);
            int i6 = i * 31;
            String BA2 = Aj5.BA2();
            if (BA2 != null) {
                i5 = BA2.hashCode();
            }
            i3 = i6 + i5;
        }
        int Aj92 = serialDescriptor.Aj9();
        while (true) {
            int i7 = Aj92;
            if (Aj92 <= 0) {
                return (((A02 * 31) + i) * 31) + i2;
            }
            Aj92--;
            i2 = (i2 * 31) + AnonymousClass002.A04(serialDescriptor.Aj5(serialDescriptor.Aj9() - i7).Asv());
        }
    }
}
