package X;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.HashSet;
import java.util.Set;

/* loaded from: A6e.class */
public final class A6e implements 6xM {
    public HashSet A00;
    public boolean A01;
    public final C6xN A02;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.6xN] */
    public A6e() {
        Boolean A0d = 1BK.A0d();
        ?? obj = new Object();
        obj.A00 = A0d;
        this.A02 = obj;
        this.A00 = null;
    }

    private void A00() {
        if (this.A01) {
            return;
        }
        C6xN c6xN = this.A02;
        11T.A0F(c6xN, 1);
        c6xN.A00 = 1BK.A0d();
        this.A01 = true;
    }

    public /* bridge */ /* synthetic */ Set AoU() {
        HashSet hashSet = this.A00;
        if (hashSet == null) {
            hashSet = AnonymousClass001.A0w(new Class[]{C6zq.class, 7BY.class, 7Ax.class, 7Ay.class, C7Ah.class});
            this.A00 = hashSet;
        }
        return hashSet;
    }

    public String BGe() {
        return "MontageViewerSoftInputPlugin";
    }

    public void BLY(Capabilities capabilities, C77n c77n, 6RU r304, 6Sh r305) {
        C7Ah c7Ah;
        if (r305 instanceof C7Ah) {
            A00();
            C7Ah c7Ah2 = (C7Ah) r305;
            C77w c77w = (C77w) c77n.AUP(C77w.class);
            C6xN c6xN = this.A02;
            1BL.A11(1, c7Ah2, c77w, c6xN);
            c6xN.A00 = 1BK.A0d();
            boolean z = c77w.A03;
            boolean z2 = c7Ah2.A01;
            if (z != z2) {
                c77n.ClL(new C77w(c7Ah2.A00, c77w.A01, c77w.A02, z2));
                return;
            }
            return;
        }
        if ((r305 instanceof 7Ax) || (r305 instanceof 7Ay)) {
            A00();
            return;
        }
        if (r305 instanceof C6zq) {
            A00();
            C6zq c6zq = (C6zq) r305;
            C77w c77w2 = (C77w) c77n.AUP(C77w.class);
            C6xN c6xN2 = this.A02;
            11T.A0F(r304, 0);
            1BL.A11(1, c6zq, c77w2, c6xN2);
            if (11T.A0O(c6xN2.A00, true)) {
                return;
            }
            Context context = r304.A00;
            6Nr r0 = (6Nr) 7zN.A0l(context, 1, 68747);
            boolean Bf8 = c6zq.Bf8();
            if (Bf8 == r0.A04) {
                return;
            }
            c77n.ClL(new C77w(c77w2.A00, c77w2.A01, Bf8, c77w2.A03));
            c6xN2.A00 = true;
            if (!(c6zq instanceof 7Al)) {
                ((InputMethodManager) 7zN.A0l(context, 1, 100189)).toggleSoftInput(0, 0);
            }
            c7Ah = new C7Ah(c6zq.Bf8(), r0.A00);
        } else {
            if (!(r305 instanceof 7BY)) {
                return;
            }
            A00();
            C77w c77w3 = (C77w) c77n.AUP(C77w.class);
            11T.A0H(r304, c77w3);
            if (c77w3.A02) {
                return;
            } else {
                c7Ah = 7Al.A03;
            }
        }
        7FI.A02(r304, c7Ah);
    }

    public void BPN(C77n c77n, 6RU r303, boolean z) {
        if (z) {
            return;
        }
        A00();
    }
}
