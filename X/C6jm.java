package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.6jm, reason: invalid class name */
/* loaded from: 6jm.class */
public final class C6jm extends C04v implements 61F {
    public final ImmutableList A00;

    public C6jm(ImmutableList immutableList) {
        this.A00 = immutableList;
    }

    public int BNp() {
        return this.A00.hashCode();
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C6jm) && 11T.A0O(this.A00, ((C6jm) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
