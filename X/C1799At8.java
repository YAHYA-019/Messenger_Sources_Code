package X;

/* renamed from: X.At8, reason: case insensitive filesystem */
/* loaded from: At8.class */
public final class C1799At8 extends C04v implements JDB {
    public final boolean A00;

    public C1799At8(boolean z) {
        this.A00 = z;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1799At8) && this.A00 == ((C1799At8) obj).A00);
    }

    public int hashCode() {
        return AnonymousClass002.A00(this.A00 ? 1 : 0);
    }

    public String toString() {
        return 0Pz.A0R("ScreenSharingViewState(isScreenSharingEnabledForAnyone=", ')', this.A00);
    }
}
