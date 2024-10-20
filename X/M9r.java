package X;

import kotlin.jvm.functions.Function1;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: M9r.class */
public final class M9r extends PluginGeneratedSerialDescriptor {
    public final C01i A00;
    public final 5ZD A01;

    public M9r(final String str, final int i) {
        super(str, null, i);
        this.A01 = M9e.A00;
        this.A00 = C01g.A01(new C00m() { // from class: X.LuT
            @Override // X.C00m
            public final Object invoke() {
                int i2 = i;
                String str2 = str;
                M9r m9r = this;
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[i2];
                int i3 = 0;
                while (true) {
                    int i4 = i3;
                    if (i4 >= i2) {
                        return serialDescriptorArr;
                    }
                    serialDescriptorArr[i4] = Kwm.A00(0Pz.A0Y(str2, m9r.A08[i4], '.'), new LuL(0), C7xt.A00, new SerialDescriptor[0]);
                    i3 = i4 + 1;
                }
            }
        });
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor Aj5(int i) {
        return ((SerialDescriptor[]) this.A00.getValue())[i];
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    public 5ZD Asv() {
        return this.A01;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof SerialDescriptor)) {
                return false;
            }
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (serialDescriptor.Asv() != M9e.A00 || !11T.A0O(this.A03, serialDescriptor.BA2()) || !11T.A0O(L6t.A00(this), L6t.A00(serialDescriptor))) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public int hashCode() {
        int hashCode = this.A03.hashCode();
        Lsn lsn = new Lsn(this);
        int i = 1;
        while (true) {
            int i2 = i;
            if (!lsn.hasNext()) {
                return (hashCode * 31) + i2;
            }
            i = (i2 * 31) + 1BL.A06((String) lsn.next());
        }
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public String toString() {
        return 0QD.A0K(", ", 0Pz.A0J(this.A03, '('), ")", new Lj8(this), (Function1) null, -1);
    }
}
