package X;

import kotlin.jvm.functions.Function2;

/* renamed from: X.4Xn, reason: invalid class name */
/* loaded from: 4Xn.class */
public final class C4Xn implements Function2 {
    public final 4FO A00;

    public /* synthetic */ C4Xn(4FO r302) {
        this.A00 = r302;
    }

    public boolean equals(Object obj) {
        4FO r0 = this.A00;
        boolean z = false;
        if ((obj instanceof C4Xn) && 11T.A0O(r0, ((C4Xn) obj).A00)) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        4FO r0 = this.A00;
        1sP.A00();
        return ((Function2) r0.A00).invoke(obj, obj2);
    }

    public String toString() {
        4FO r0 = this.A00;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("MemoizedCallback2(callbackHolder=");
        return AnonymousClass002.A0K(r0, A0k);
    }
}
