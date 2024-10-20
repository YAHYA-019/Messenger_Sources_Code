package X;

import java.util.Arrays;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: M9q.class */
public final class M9q extends PluginGeneratedSerialDescriptor {
    /* JADX WARN: Type inference failed for: r0v2, types: [X.M9q, kotlinx.serialization.internal.PluginGeneratedSerialDescriptor] */
    public static M9q A00(String str, 5Yu r302) {
        return new PluginGeneratedSerialDescriptor(str, new LvV(r302), 1);
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj instanceof M9q) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                if (11T.A0O(BA2(), serialDescriptor.BA2()) && Arrays.equals((Object[]) this.A06.getValue(), (Object[]) ((PluginGeneratedSerialDescriptor) obj).A06.getValue()) && Aj9() == serialDescriptor.Aj9()) {
                    int Aj9 = Aj9();
                    int i = 0;
                    while (true) {
                        int i2 = i;
                        if (i2 < Aj9) {
                            if (!11T.A0O(Aj5(i2).BA2(), serialDescriptor.Aj5(i2).BA2()) || !11T.A0O(Aj5(i2).Asv(), serialDescriptor.Aj5(i2).Asv())) {
                                break;
                            }
                            i = i2 + 1;
                        } else {
                            break;
                        }
                    }
                }
            }
            z = false;
        }
        return z;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return true;
    }
}
