package X;

import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.6yB, reason: invalid class name */
/* loaded from: 6yB.class */
public final class C6yB implements 6xM {
    public HashSet A00;
    public boolean A01;

    public /* bridge */ /* synthetic */ Set AoU() {
        HashSet hashSet = this.A00;
        if (hashSet == null) {
            hashSet = new HashSet(Arrays.asList(7Aa.class));
            this.A00 = hashSet;
        }
        return hashSet;
    }

    public String BGe() {
        return "MessengerSearchSendPlugin";
    }

    public void BLY(Capabilities capabilities, C77n c77n, 6RU r304, 6Sh r305) {
        if (r305 instanceof 7Aa) {
            if (!this.A01) {
                this.A01 = true;
            }
            7Aa r0 = (7Aa) r305;
            11T.A0F(r0, 0);
            ((6Os) 1Bi.A03(84359)).A00(r0.A01);
        }
    }

    public void BPN(C77n c77n, 6RU r303, boolean z) {
        if (z || this.A01) {
            return;
        }
        this.A01 = true;
    }
}
