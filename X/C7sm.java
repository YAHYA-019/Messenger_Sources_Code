package X;

/* renamed from: X.7sm, reason: invalid class name */
/* loaded from: 7sm.class */
public final class C7sm {
    public final L42 A00;
    public final L42 A01;

    public C7sm(L42 l42, L42 l422) {
        this.A00 = l42;
        this.A01 = l422;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C7sm c7sm = (C7sm) obj;
            if (!this.A00.equals(c7sm.A00) || !this.A01.equals(c7sm.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A01, 1BL.A03(this.A00));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("[");
        L42 l42 = this.A00;
        A0k.append(l42);
        L42 l422 = this.A01;
        A0k.append(l42.equals(l422) ? "" : AnonymousClass001.A0Z(l422, ", ", AnonymousClass001.A0k()));
        return AnonymousClass001.A0d("]", A0k);
    }
}
