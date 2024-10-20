package X;

import com.google.common.collect.ImmutableMap;

/* renamed from: X.5dg, reason: invalid class name */
/* loaded from: 5dg.class */
public final class C5dg implements C5dh {
    public final ImmutableMap A00;

    public boolean equals(Object obj) {
        ImmutableMap immutableMap = this.A00;
        boolean z = false;
        if ((obj instanceof C5dg) && 11T.A0O(immutableMap, ((C5dg) obj).A00)) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        ImmutableMap immutableMap = this.A00;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Success(itemsUnreadCounts=");
        return AnonymousClass002.A0K(immutableMap, A0k);
    }
}
