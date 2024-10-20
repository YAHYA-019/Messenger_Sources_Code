package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.0D5, reason: invalid class name */
/* loaded from: 0D5.class */
public final class C0D5 extends 0D4 {
    public final Object A00;
    public final Object A01;
    public final boolean A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D5(C0Ao c0Ao, boolean z, boolean z2) {
        super(c0Ao);
        11T.A0F(c0Ao, 1);
        Integer num = c0Ao.A00;
        Integer num2 = 0S2.A01;
        Fragment A01 = c0Ao.A01();
        this.A01 = num == num2 ? z ? A01.getReenterTransition() : A01.getEnterTransition() : z ? A01.getReturnTransition() : A01.getExitTransition();
        this.A02 = num == num2 ? z ? A01.getAllowReturnTransitionOverlap() : A01.getAllowEnterTransitionOverlap() : true;
        this.A00 = z2 ? z ? A01.getSharedElementReturnTransition() : A01.getSharedElementEnterTransition() : null;
    }

    private final 0UA A00(Object obj) {
        0UA r303;
        if (obj == null) {
            r303 = null;
        } else {
            r303 = 0U3.A00;
            if (!r303.A0M(obj)) {
                0UA r0 = 0U3.A01;
                if (r0 != null && r0.A0M(obj)) {
                    return r0;
                }
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("Transition ");
                A0k.append(obj);
                A0k.append(" for fragment ");
                A0k.append(((0D4) this).A00.A01());
                throw AnonymousClass002.A0D(" is not a valid framework Transition or AndroidX Transition", A0k);
            }
        }
        return r303;
    }

    public final 0UA A02() {
        Object obj = this.A01;
        0UA A00 = A00(obj);
        Object obj2 = this.A00;
        0UA A002 = A00(obj2);
        if (A00 == null) {
            return A002;
        }
        if (A002 == null || A00 == A002) {
            return A00;
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
        A0k.append(((0D4) this).A00.A01());
        A0k.append(" returned Transition ");
        A0k.append(obj);
        throw AnonymousClass002.A0C(obj2, " which uses a different Transition  type than its shared element transition ", A0k);
    }
}
