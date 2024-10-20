package X;

/* renamed from: X.8uj, reason: invalid class name */
/* loaded from: 8uj.class */
public final class C8uj extends 9AU {
    public final C87w A00;

    public C8uj(C87w c87w) {
        this.A00 = c87w;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C8uj) && 11T.A0O(this.A00, ((C8uj) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass001.A02(this.A00);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("TransitionInProgress(callerInfo=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
