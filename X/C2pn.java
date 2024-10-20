package X;

/* renamed from: X.2pn, reason: invalid class name */
/* loaded from: 2pn.class */
public final class C2pn implements C2po {
    public final C1u3 A00;

    public boolean equals(Object obj) {
        C1u3 c1u3 = this.A00;
        boolean z = false;
        if ((obj instanceof C2pn) && c1u3 == ((C2pn) obj).A00) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        C1u3 c1u3 = this.A00;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("MdsIcon(iconName=");
        return AnonymousClass002.A0K(c1u3, A0k);
    }
}
