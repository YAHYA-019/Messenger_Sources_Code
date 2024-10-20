package X;

/* loaded from: F9g.class */
public final class F9g {
    public final ESR A00;

    public F9g() {
        this(null);
    }

    public F9g(ESR esr) {
        this.A00 = esr;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof F9g) && 11T.A0O(this.A00, ((F9g) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass001.A02(this.A00);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("UIState(nuxState=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
