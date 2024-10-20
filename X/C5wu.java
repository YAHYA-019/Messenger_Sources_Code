package X;

import java.util.List;

/* renamed from: X.5wu, reason: invalid class name */
/* loaded from: 5wu.class */
public final class C5wu extends C04v implements 5PP {
    public final List A00;
    public final boolean A01;

    public C5wu(List list, boolean z) {
        this.A00 = list;
        this.A01 = z;
        if (!(!list.isEmpty()) && !z) {
            throw AnonymousClass001.A0N("Invalid metadata if no one has seen this message");
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C5wu)) {
                return false;
            }
            C5wu c5wu = (C5wu) obj;
            if (!11T.A0O(this.A00, c5wu.A00) || this.A01 != c5wu.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int hashCode = this.A00.hashCode() * 31;
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        return hashCode + i;
    }
}
