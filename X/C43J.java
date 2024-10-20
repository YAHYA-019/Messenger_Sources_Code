package X;

/* renamed from: X.43J, reason: invalid class name */
/* loaded from: 43J.class */
public final class C43J {
    public 24S A00;
    public Class A01;
    public boolean A02;
    public int A03;

    public C43J() {
    }

    public C43J(24S r302, boolean z) {
        this.A00 = r302;
        this.A01 = null;
        this.A02 = z;
        int hashCode = r302.hashCode();
        this.A03 = z ? hashCode - 2 : hashCode - 1;
    }

    public C43J(Class cls, boolean z) {
        this.A01 = cls;
        this.A00 = null;
        this.A02 = z;
        int hashCode = cls.getName().hashCode();
        this.A03 = z ? hashCode + 1 : hashCode;
    }

    public final boolean equals(Object obj) {
        boolean z = false;
        if (obj != null) {
            boolean z2 = true;
            if (obj != this) {
                if (obj.getClass() == getClass()) {
                    C43J c43j = (C43J) obj;
                    if (c43j.A02 == this.A02) {
                        Class cls = this.A01;
                        if (cls == null) {
                            z2 = this.A00.equals(c43j.A00);
                        } else if (c43j.A01 == cls) {
                            z = true;
                        }
                    }
                }
            }
            return z2;
        }
        return z;
    }

    public final int hashCode() {
        return this.A03;
    }

    public final String toString() {
        Class cls = this.A01;
        StringBuilder A0k = AnonymousClass001.A0k();
        if (cls != null) {
            A0k.append("{class: ");
            A0k.append(cls.getName());
        } else {
            A0k.append("{type: ");
            A0k.append(this.A00);
        }
        A0k.append(", typed? ");
        A0k.append(this.A02);
        return AnonymousClass001.A0d("}", A0k);
    }
}
