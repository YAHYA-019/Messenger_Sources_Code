package X;

/* renamed from: X.8uh, reason: invalid class name */
/* loaded from: 8uh.class */
public final class C8uh extends 9AU {
    public final C87w A00;

    public C8uh(C87w c87w) {
        this.A00 = c87w;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C8uh) && 11T.A0O(this.A00, ((C8uh) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("AwaitingUserInput(callerInfo=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
