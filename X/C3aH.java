package X;

/* renamed from: X.3aH, reason: invalid class name */
/* loaded from: 3aH.class */
public final class C3aH implements C1p8 {
    public final C1p8 A00;
    public final C1p8 A01;

    public C3aH(C1p8 c1p8, C1p8 c1p82) {
        this.A01 = c1p8;
        this.A00 = c1p82;
    }

    @Override // X.C1p8
    public int AgL() {
        return 0De.A01(this.A01.AgL(), this.A00.AgL());
    }

    @Override // X.C1p8
    public int Ato() {
        return 0De.A01(this.A01.Ato(), this.A00.Ato());
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !1BL.A1V(this, obj)) {
                return false;
            }
            C3aH c3aH = (C3aH) obj;
            if (this.A01 != c3aH.A01 || this.A00 != c3aH.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 0J6.A00(this.A01, this.A00);
    }
}
