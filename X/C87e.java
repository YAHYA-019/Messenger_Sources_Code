package X;

/* renamed from: X.87e, reason: invalid class name */
/* loaded from: 87e.class */
public final class C87e extends AnonymousClass999 {
    public final Object A00;

    public C87e(Object obj) {
        this.A00 = obj;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C87e) && 11T.A0O(this.A00, ((C87e) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass001.A02(this.A00);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Success(data=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
