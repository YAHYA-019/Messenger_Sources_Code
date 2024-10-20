package X;

/* renamed from: X.3tt, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3tt.class */
public final class C02053tt extends 2K0 {
    public static final long serialVersionUID = 2;
    public final boolean _value;
    public static final C02053tt A01 = new C02053tt(true);
    public static final C02053tt A00 = new C02053tt(false);

    public C02053tt(boolean z) {
        this._value = z;
    }

    public static C02053tt A00(boolean z) {
        return z ? A01 : A00;
    }

    public int A06(int i) {
        return this._value ? 1 : 0;
    }

    public long A09(long j) {
        return this._value ? 1L : 0L;
    }

    public 2wD A0F() {
        return 2wD.A03;
    }

    public String A0H() {
        return this._value ? "true" : "false";
    }

    public boolean A0O() {
        return this._value;
    }

    public boolean A0P() {
        return this._value;
    }

    public boolean A0b(boolean z) {
        return this._value;
    }

    public C42h AAi() {
        return this._value ? C42h.A0D : C42h.A08;
    }

    public final void ClJ(28Q r302, C26c c26c) {
        r302.A0v(this._value);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj != this) {
            if (obj == null || !(obj instanceof C02053tt)) {
                return false;
            }
            if (this._value != ((C02053tt) obj)._value) {
                z = false;
            }
        }
        return z;
    }

    public int hashCode() {
        int i = 1;
        if (this._value) {
            i = 3;
        }
        return i;
    }

    public Object readResolve() {
        return this._value ? A01 : A00;
    }
}
