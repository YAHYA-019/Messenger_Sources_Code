package X;

/* loaded from: D1q.class */
public final class D1q implements DES {
    public final Object A00;

    public boolean equals(Object obj) {
        Object obj2 = this.A00;
        boolean z = false;
        if ((obj instanceof D1q) && 11T.A0O(obj2, ((D1q) obj).A00)) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return AnonymousClass001.A02(this.A00);
    }

    public String toString() {
        Object obj = this.A00;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Success(result=");
        return AnonymousClass002.A0K(obj, A0k);
    }
}
