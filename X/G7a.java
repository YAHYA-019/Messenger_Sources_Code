package X;

/* loaded from: G7a.class */
public final class G7a implements C0Bh {
    public final 4FO A00;

    public boolean equals(Object obj) {
        4FO r0 = this.A00;
        boolean z = false;
        if ((obj instanceof G7a) && 11T.A0O(r0, ((G7a) obj).A00)) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.C0Bh
    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        4FO r0 = this.A00;
        1sP.A00();
        return ((C0Bh) r0.A00).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    public String toString() {
        4FO r0 = this.A00;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("MemoizedCallback7(callbackHolder=");
        return AnonymousClass002.A0K(r0, A0k);
    }
}
