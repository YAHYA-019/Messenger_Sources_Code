package X;

/* renamed from: X.9c9, reason: invalid class name */
/* loaded from: 9c9.class */
public final class C9c9 {
    public final AnonymousClass622 A00;

    public /* synthetic */ C9c9(AnonymousClass622 anonymousClass622) {
        this.A00 = anonymousClass622;
    }

    public boolean equals(Object obj) {
        AnonymousClass622 anonymousClass622 = this.A00;
        boolean z = false;
        if ((obj instanceof C9c9) && 11T.A0O(anonymousClass622, ((C9c9) obj).A00)) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        AnonymousClass622 anonymousClass622 = this.A00;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("PinnedMessage(rowMessageItem=");
        return AnonymousClass002.A0K(anonymousClass622, A0k);
    }
}
