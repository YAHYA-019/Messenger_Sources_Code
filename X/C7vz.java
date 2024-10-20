package X;

import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.7vz, reason: invalid class name */
/* loaded from: 7vz.class */
public final class C7vz implements 6xM {
    public HashSet A00;
    public boolean A01;

    public /* bridge */ /* synthetic */ Set AoU() {
        HashSet hashSet = this.A00;
        if (hashSet == null) {
            hashSet = AnonymousClass001.A0w(new Class[]{7Bj.class, C6zq.class});
            this.A00 = hashSet;
        }
        return hashSet;
    }

    public String BGe() {
        return "BelowComposerSpacePlugin";
    }

    public void BLY(Capabilities capabilities, C77n c77n, 6RU r304, 6Sh r305) {
        if (r305 instanceof C6zq) {
            if (!this.A01) {
                this.A01 = true;
            }
            C6zq c6zq = (C6zq) r305;
            7fH AUP = c77n.AUP(7fH.class);
            4YV.A1N(c6zq, AUP);
            c77n.ClL(new 7fH(c6zq.Bf4(), AUP.A01));
            return;
        }
        if (r305 instanceof 7Bj) {
            if (!this.A01) {
                this.A01 = true;
            }
            C77w c77w = (C77w) c77n.AUP(C77w.class);
            1BK.A1M(r304, c77w);
            if (c77w.A03) {
                7FI.A02(r304, new C7Ah(false, c77w.A00));
            }
        }
    }

    public void BPN(C77n c77n, 6RU r303, boolean z) {
        if (z || this.A01) {
            return;
        }
        this.A01 = true;
    }
}
