package kotlinx.serialization.internal;

import X.04R;
import X.07C;
import X.0Pz;
import X.0QD;
import X.11T;
import X.5Yt;
import X.5Yu;
import X.5Yz;
import X.5ZB;
import X.5ZD;
import X.AHl;
import X.AnonymousClass001;
import X.C01g;
import X.C01i;
import X.C03i;
import X.C0ty;
import X.JRK;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: PluginGeneratedSerialDescriptor.class */
public class PluginGeneratedSerialDescriptor implements SerialDescriptor, 5Yz {
    public int A00 = -1;
    public Map A01;
    public final int A02;
    public final String A03;
    public final C01i A04;
    public final C01i A05;
    public final C01i A06;
    public final 5Yt A07;
    public final String[] A08;
    public final List[] A09;
    public final boolean[] A0A;

    public PluginGeneratedSerialDescriptor(String str, 5Yt r303, int i) {
        this.A03 = str;
        this.A07 = r303;
        this.A02 = i;
        String[] strArr = new String[i];
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= i) {
                this.A08 = strArr;
                this.A09 = new List[i];
                this.A0A = new boolean[i];
                this.A01 = 04R.A0G();
                C03i c03i = C03i.A03;
                this.A05 = C01g.A00(c03i, new JRK(this, 0));
                this.A06 = C01g.A00(c03i, new JRK(this, 1));
                this.A04 = C01g.A00(c03i, new JRK(this, 2));
                return;
            }
            strArr[i3] = "[UNINITIALIZED]";
            i2 = i3 + 1;
        }
    }

    public final void A01(String str, boolean z) {
        11T.A0F(str, 0);
        String[] strArr = this.A08;
        int i = this.A00 + 1;
        this.A00 = i;
        strArr[i] = str;
        this.A0A[i] = z;
        this.A09[i] = null;
        if (i != this.A02 - 1) {
            return;
        }
        HashMap hashMap = new HashMap();
        int length = strArr.length;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= length) {
                this.A01 = hashMap;
                return;
            } else {
                hashMap.put(strArr[i3], Integer.valueOf(i3));
                i2 = i3 + 1;
            }
        }
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List Aj4(int i) {
        List list = this.A09[i];
        if (list == null) {
            list = C0ty.A00;
        }
        return list;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor Aj5(int i) {
        return ((5Yu[]) this.A05.getValue())[i].getDescriptor();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int Aj6(String str) {
        11T.A0F(str, 0);
        Number number = (Number) this.A01.get(str);
        if (number != null) {
            return number.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String Aj8(int i) {
        return this.A08[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int Aj9() {
        return this.A02;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public 5ZD Asv() {
        return 5ZB.A00;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String BA2() {
        return this.A03;
    }

    public Set BA3() {
        return this.A01.keySet();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean BRu(int i) {
        return this.A0A[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean BUZ() {
        return false;
    }

    public boolean equals(Object obj) {
        int i;
        boolean z = true;
        if (this != obj) {
            if (obj instanceof PluginGeneratedSerialDescriptor) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                if (11T.A0O(this.A03, serialDescriptor.BA2()) && Arrays.equals((Object[]) this.A06.getValue(), (Object[]) ((PluginGeneratedSerialDescriptor) obj).A06.getValue()) && (i = this.A02) == serialDescriptor.Aj9()) {
                    int i2 = 0;
                    while (true) {
                        int i3 = i2;
                        if (i3 < i) {
                            if (!11T.A0O(Aj5(i3).BA2(), serialDescriptor.Aj5(i3).BA2()) || !11T.A0O(Aj5(i3).Asv(), serialDescriptor.Aj5(i3).Asv())) {
                                break;
                            }
                            i2 = i3 + 1;
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

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List getAnnotations() {
        return C0ty.A00;
    }

    public int hashCode() {
        return AnonymousClass001.A03(this.A04.getValue());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return false;
    }

    public String toString() {
        return 0QD.A0K(", ", 0Pz.A0J(this.A03, '('), ")", 07C.A07(0, this.A02), new AHl(this, 1), -1);
    }
}
