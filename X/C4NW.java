package X;

/* renamed from: X.4NW, reason: invalid class name */
/* loaded from: 4NW.class */
public final class C4NW implements C00m {
    public final 4FO A00;

    public /* synthetic */ C4NW(4FO r302) {
        this.A00 = r302;
    }

    public boolean equals(Object obj) {
        4FO r0 = this.A00;
        boolean z = false;
        if ((obj instanceof C4NW) && 11T.A0O(r0, ((C4NW) obj).A00)) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.C00m
    public Object invoke() {
        4FO r0 = this.A00;
        1sP.A00();
        return ((C00m) r0.A00).invoke();
    }

    public String toString() {
        4FO r0 = this.A00;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("MemoizedCallback0(callbackHolder=");
        return AnonymousClass002.A0K(r0, A0k);
    }
}
