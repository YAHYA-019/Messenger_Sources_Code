package X;

/* renamed from: X.94u, reason: invalid class name */
/* loaded from: 94u.class */
public final class C94u extends ESJ {
    public final Eyh A00;

    public C94u() {
        this(null);
    }

    public C94u(Eyh eyh) {
        this.A00 = eyh;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C94u) && 11T.A0O(this.A00, ((C94u) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass001.A02(this.A00);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("EmuFlashScreen(flashGeneratedImage=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
