package X;

import java.util.List;

/* renamed from: X.5n7, reason: invalid class name */
/* loaded from: 5n7.class */
public final class C5n7 extends C5fu {
    public final List A00;
    public final C5fx A01;

    public C5n7(C5w9 c5w9) {
        super(c5w9);
        this.A01 = C5fw.A06;
        this.A00 = c5w9.A00;
        if (!(!r0.isEmpty())) {
            throw AnonymousClass001.A0L("Document list must not be empty");
        }
    }

    @Override // X.C5fv
    public C5fx Ax3() {
        return this.A01;
    }

    @Override // X.C5fu
    public boolean equals(Object obj) {
        boolean z = true;
        if (obj != this) {
            if (!(obj instanceof C5n7)) {
                return false;
            }
            if (11T.A0O(this.A00, ((C5n7) obj).A00) && super.equals(obj)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    @Override // X.C5fu
    public int hashCode() {
        return (super.hashCode() * 31) + this.A00.hashCode();
    }

    @Override // X.C5fu
    public String toString() {
        List list = this.A00;
        String A0K = 0QD.A0K(", ", "[", "]", list, SJE.A00, 3);
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("[DocumentMessage contentCount=");
        A0k.append(list.size());
        A0k.append(", docs=");
        A0k.append(A0K);
        A0k.append(", super=");
        return 4YW.A07(super.toString(), A0k);
    }
}
