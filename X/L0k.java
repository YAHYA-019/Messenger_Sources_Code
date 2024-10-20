package X;

import java.util.List;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: L0k.class */
public final class L0k {
    public final String A05;
    public List A00 = C0ty.A00;
    public final List A03 = AnonymousClass001.A0s();
    public final Set A06 = AnonymousClass001.A0v();
    public final List A02 = AnonymousClass001.A0s();
    public final List A01 = AnonymousClass001.A0s();
    public final List A04 = AnonymousClass001.A0s();

    public L0k(String str) {
        this.A05 = str;
    }

    public static final void A00(String str, List list, L0k l0k, SerialDescriptor serialDescriptor) {
        11T.A0F(str, 0);
        1BL.A1F(serialDescriptor, list);
        if (!l0k.A06.add(str)) {
            throw AnonymousClass001.A0L(0Pz.A0v("Element with name '", str, "' is already registered in ", l0k.A05));
        }
        l0k.A03.add(str);
        l0k.A02.add(serialDescriptor);
        l0k.A01.add(list);
        l0k.A04.add(false);
    }
}
