package X;

import android.os.Parcelable;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.BitSet;

/* renamed from: X.1v9, reason: invalid class name */
/* loaded from: 1v9.class */
public final class C1v9 {
    public final BitSet A00 = new BitSet();
    public final BitSet A01;

    public C1v9(BitSet bitSet) {
        this.A01 = bitSet;
    }

    public final void A00(int i) {
        if (this.A01.get(i)) {
            this.A00.set(i);
        }
    }

    public final void A01(int i) {
        if (this.A01.get(i)) {
            this.A00.clear(i);
        }
    }

    public final void A02(Capabilities capabilities) {
        11T.A0F(capabilities, 0);
        BitSet bitSet = new BitSet();
        bitSet.or(this.A01);
        Parcelable.Creator creator = Capabilities.CREATOR;
        bitSet.and(capabilities.A00);
        this.A00.or(bitSet);
    }
}
