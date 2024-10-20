package X;

import android.text.TextWatcher;
import com.facebook.messaging.composer.OneLineComposerView;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.7S7, reason: invalid class name */
/* loaded from: 7S7.class */
public final class C7S7 implements 6xM {
    public HashSet A00;
    public boolean A01;
    public final 6Qf A02;
    public final boolean A03;
    public final 6wV A04;

    public C7S7(6Qf r302, 6wV r303, boolean z) {
        r303.getClass();
        this.A04 = r303;
        this.A02 = r302;
        this.A03 = Boolean.valueOf(z).booleanValue();
        this.A00 = null;
    }

    public /* bridge */ /* synthetic */ Set AoU() {
        HashSet hashSet = this.A00;
        if (hashSet == null) {
            hashSet = new HashSet(Arrays.asList(7Aj.class, 7Ar.class));
            this.A00 = hashSet;
        }
        return hashSet;
    }

    public String BGe() {
        return "OrcaTextPlugin";
    }

    public void BLY(Capabilities capabilities, C77n c77n, 6RU r304, 6Sh r305) {
        if (r305 instanceof 7Ar) {
            7Ar r0 = (7Ar) r305;
            6wV r02 = this.A04;
            11T.A0F(r0, 0);
            r02.A7W(r0.A00);
            return;
        }
        if (r305 instanceof 7Aj) {
            7Aj r03 = (7Aj) r305;
            6wV r04 = this.A04;
            11T.A0F(r03, 0);
            r04.ANq(r03.A00);
        }
    }

    public void BPN(C77n c77n, 6RU r303, boolean z) {
        if (this.A01) {
            return;
        }
        C77v c77v = (C77v) c77n.AUP(C77v.class);
        6Qe r0 = this.A02;
        boolean z2 = this.A03;
        11T.A0F(r303, 0);
        11T.A0F(c77v, 2);
        C79q c79q = c77v.A00;
        if (c79q == null) {
            c79q = new C79q(new TextWatcher[0]);
            C79s c79s = new C79s(c77v);
            c79s.A00 = c79q;
            c77n.ClL(new C77v(c79s));
            6PS.A00(((OneLineComposerView) r0.A00.A0A).A0Z.A0R).A03.add(new 7SH(c79q));
        }
        if (z2) {
            c79q.A00(new C79t(r303));
        }
        this.A01 = true;
    }
}
