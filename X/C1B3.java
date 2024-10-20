package X;

import java.util.List;

/* renamed from: X.1B3, reason: invalid class name */
/* loaded from: 1B3.class */
public final class C1B3 {
    public final List A00;

    public C1B3(List list) {
        this.A00 = list;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1B3) && 11T.A0O(this.A00, ((C1B3) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("BackupDataModel(entries=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
