package X;

/* renamed from: X.Jc8, reason: case insensitive filesystem */
/* loaded from: Jc8.class */
public abstract class AbstractC2887Jc8 extends LPR {
    public LPR A00;
    public final int A01 = LD2.A00(this);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [X.LPR] */
    /* JADX WARN: Type inference failed for: r0v41, types: [X.LPR] */
    private final void A00(int i, boolean z) {
        int i2 = ((LPR) this).A01;
        ((LPR) this).A01 = i;
        if (i2 != i) {
            LPR lpr = ((LPR) this).A03;
            if (lpr == this) {
                ((LPR) this).A00 = i;
            }
            if (((LPR) this).A08) {
                AbstractC2887Jc8 abstractC2887Jc8 = this;
                do {
                    i |= ((LPR) abstractC2887Jc8).A01;
                    ((LPR) abstractC2887Jc8).A01 = i;
                    if (abstractC2887Jc8 == lpr) {
                        break;
                    } else {
                        abstractC2887Jc8 = ((LPR) abstractC2887Jc8).A04;
                    }
                } while (abstractC2887Jc8 != null);
                if (z && abstractC2887Jc8 == lpr) {
                    i = LD2.A01(lpr);
                    lpr.A01 = i;
                }
                if (abstractC2887Jc8 != null) {
                    LPR lpr2 = ((LPR) abstractC2887Jc8).A02;
                    int i3 = i | (lpr2 != null ? lpr2.A00 : 0);
                    do {
                        i3 |= ((LPR) abstractC2887Jc8).A01;
                        ((LPR) abstractC2887Jc8).A00 = i3;
                        abstractC2887Jc8 = ((LPR) abstractC2887Jc8).A04;
                    } while (abstractC2887Jc8 != null);
                }
            }
        }
    }

    public void A09() {
        super.A09();
        LPR lpr = this.A00;
        while (true) {
            LPR lpr2 = lpr;
            if (lpr2 == null) {
                return;
            }
            lpr2.A0G(((LPR) this).A05);
            if (!lpr2.A08) {
                lpr2.A09();
            }
            lpr = lpr2.A02;
        }
    }

    public void A0A() {
        LPR lpr = this.A00;
        while (true) {
            LPR lpr2 = lpr;
            if (lpr2 == null) {
                super.A0A();
                return;
            } else {
                lpr2.A0A();
                lpr = lpr2.A02;
            }
        }
    }

    public void A0C() {
        super.A0C();
        LPR lpr = this.A00;
        while (true) {
            LPR lpr2 = lpr;
            if (lpr2 == null) {
                return;
            }
            lpr2.A0C();
            lpr = lpr2.A02;
        }
    }

    public void A0D() {
        LPR lpr = this.A00;
        while (true) {
            LPR lpr2 = lpr;
            if (lpr2 == null) {
                super.A0D();
                return;
            } else {
                lpr2.A0D();
                lpr = lpr2.A02;
            }
        }
    }

    public void A0E() {
        super.A0E();
        LPR lpr = this.A00;
        while (true) {
            LPR lpr2 = lpr;
            if (lpr2 == null) {
                return;
            }
            lpr2.A0E();
            lpr = lpr2.A02;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0H(MBc mBc) {
        String A0Z;
        LPR lpr = (LPR) mBc;
        LPR lpr2 = lpr.A03;
        LPR lpr3 = null;
        if (1BK.A1V(lpr2, mBc)) {
            if (mBc instanceof LPR) {
                lpr3 = lpr.A04;
            }
            if (lpr2 != ((LPR) this).A03 || !11T.A0O(lpr3, this)) {
                throw AnonymousClass001.A0N("Cannot delegate to an already delegated node");
            }
            return;
        }
        if (!lpr2.A08) {
            lpr2.A0F(((LPR) this).A03);
            int i = ((LPR) this).A01;
            int A01 = LD2.A01(lpr2);
            lpr2.A01 = A01;
            int i2 = ((LPR) this).A01;
            int i3 = A01 & 2;
            if (i3 == 0 || (i2 & 2) == 0 || (this instanceof MNY)) {
                lpr2.A02 = this.A00;
                this.A00 = lpr2;
                lpr2.A04 = this;
                A00(i2 | A01, false);
                if (((LPR) this).A08) {
                    if (i3 == 0 || (i & 2) != 0) {
                        A0G(((LPR) this).A05);
                    } else {
                        LDS lds = LDX.A02((MBc) this).A0T;
                        ((LPR) this).A03.A0G((AbstractC2938JdR) null);
                        lds.A08();
                    }
                    lpr2.A09();
                    lpr2.A0D();
                    LD2.A02(lpr2);
                    return;
                }
                return;
            }
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: ");
            A0k.append(this);
            A0Z = AnonymousClass001.A0Z(lpr2, "\nDelegate Node: ", A0k);
        } else {
            A0Z = "Cannot delegate to an already attached node";
        }
        throw AnonymousClass001.A0N(A0Z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0I(MBc mBc) {
        LPR lpr = null;
        for (LPR lpr2 = this.A00; lpr2 != null; lpr2 = lpr2.A02) {
            if (lpr2 == mBc) {
                if (lpr2.A08) {
                    LD2.A04(lpr2, -1, 2);
                    lpr2.A0E();
                    lpr2.A0A();
                }
                lpr2.A0F(lpr2);
                lpr2.A00 = 0;
                LPR lpr3 = lpr2.A02;
                if (lpr == null) {
                    this.A00 = lpr3;
                } else {
                    lpr.A02 = lpr3;
                }
                lpr2.A02 = null;
                lpr2.A04 = null;
                int i = ((LPR) this).A01;
                int A01 = LD2.A01(this);
                A00(A01, true);
                if (((LPR) this).A08 && (i & 2) != 0 && (A01 & 2) == 0) {
                    LDS lds = LDX.A02(this).A0T;
                    ((LPR) this).A03.A0G((AbstractC2938JdR) null);
                    lds.A08();
                    return;
                }
                return;
            }
            lpr = lpr2;
        }
        throw 1BL.A0h(mBc, "Could not find delegate: ", AnonymousClass001.A0k());
    }
}
