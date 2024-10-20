package X;

/* renamed from: X.8q5, reason: invalid class name */
/* loaded from: 8q5.class */
public final class C8q5 extends 2Yv implements C54v {
    public boolean A00;

    public void A02(C2l4 c2l4) {
        if (A90(c2l4) != null) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Type inference failed for: r305v0, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r305v2, types: [java.lang.Object, X.66W] */
    @Override // X.C54v
    public C3s9 A90(C2l4 c2l4) {
        5X3 A0G;
        66W r305;
        int i = c2l4.A00;
        if (i == 0) {
            ?? obj = new Object();
            ((66W) obj).A00 = Boolean.valueOf(this.A00);
            ((66W) obj).A00 = AnonymousClass001.A0K();
            A0G = 7zV.A0G();
            r305 = obj;
        } else {
            if (i != 1) {
                return null;
            }
            ?? obj2 = new Object();
            ((66W) obj2).A00 = Boolean.valueOf(this.A00);
            ((66W) obj2).A00 = 1BK.A0d();
            A0G = C3s9.A02("game_icon_transition_key");
            A0G.A03(C2jm.A00);
            ((5X4) A0G).A02 = new 5Rl(300.0d, 35.0d);
            r305 = obj2;
        }
        this.A00 = AnonymousClass001.A1V(r305.A00);
        return A0G;
    }
}
