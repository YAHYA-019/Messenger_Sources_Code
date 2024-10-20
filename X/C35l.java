package X;

/* renamed from: X.35l, reason: invalid class name */
/* loaded from: 35l.class */
public final class C35l extends C2E7 {
    public final Integer A00;

    public C35l(Integer num) {
        super("FallbackToOriginalUrl");
        this.A00 = num;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C35l) && 11T.A0O(this.A00, ((C35l) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass001.A02(this.A00);
    }

    @Override // X.C2E7
    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("FallbackToOriginalUrl(bestAllowlistedSize=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
