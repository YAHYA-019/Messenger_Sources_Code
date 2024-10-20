package X;

import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.73o, reason: invalid class name */
/* loaded from: 73o.class */
public final class C73o implements 6xM {
    public HashSet A00;
    public boolean A01;

    public /* bridge */ /* synthetic */ Set AoU() {
        HashSet hashSet = this.A00;
        if (hashSet == null) {
            hashSet = new HashSet(Arrays.asList(7Aa.class, 7CN.class, C7Ag.class));
            this.A00 = hashSet;
        }
        return hashSet;
    }

    public String BGe() {
        return "MessageReplySummaryPlugin";
    }

    public void BLY(Capabilities capabilities, C77n c77n, 6RU r304, 6Sh r305) {
        if (!(r305 instanceof C7Ag)) {
            if ((r305 instanceof 7CN) || (r305 instanceof 7Aa)) {
                if (!this.A01) {
                    this.A01 = true;
                }
                11T.A0F(c77n, 0);
                c77n.ClL(new 78U((7Te) null, (C5fv) null, (CharSequence) null, (CharSequence) null, false, false));
                return;
            }
            return;
        }
        if (!this.A01) {
            this.A01 = true;
        }
        C7Ag c7Ag = (C7Ag) r305;
        11T.A0F(r304, 0);
        11T.A0F(c7Ag, 1);
        11T.A0F(c77n, 2);
        C5fv c5fv = c7Ag.A00;
        82T AxW = c5fv.AxW(C5le.A00);
        boolean z = false;
        if (AxW != null && AxW.A01) {
            z = true;
        }
        7Te r311 = null;
        C5fv c5fv2 = null;
        if (!z) {
            r311 = new 7Te(c5fv);
            c5fv2 = c5fv;
        }
        c77n.ClL(new 78U(r311, c5fv2, (CharSequence) null, (CharSequence) null, true, z));
        if (z) {
            return;
        }
        AnonymousClass785 anonymousClass785 = (AnonymousClass785) c77n.AUk(null, C11e.A00(new 0BY(AnonymousClass785.class)));
        if (anonymousClass785 == null || !anonymousClass785.A00) {
            C77z c77z = (C77z) c77n.AUk(null, C11e.A00(new 0BY(C77z.class)));
            if (c77z == null || !c77z.A03) {
                AnonymousClass781 anonymousClass781 = (AnonymousClass781) c77n.AUk(null, C11e.A00(new 0BY(AnonymousClass781.class)));
                if (anonymousClass781 == null || !anonymousClass781.A06) {
                    AnonymousClass780 anonymousClass780 = (AnonymousClass780) c77n.AUk(null, C11e.A00(new 0BY(AnonymousClass780.class)));
                    if (anonymousClass780 == null || !anonymousClass780.A00) {
                        AnonymousClass784 anonymousClass784 = (AnonymousClass784) c77n.AUk(null, C11e.A00(new 0BY(AnonymousClass784.class)));
                        if (anonymousClass784 == null || !anonymousClass784.A05) {
                            78X AUk = c77n.AUk(null, C11e.A00(new 0BY(78X.class)));
                            if (AUk == null || !AUk.A01) {
                                7FI.A02(r304, 7As.A02);
                            }
                        }
                    }
                }
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
