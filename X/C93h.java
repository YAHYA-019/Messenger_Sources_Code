package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.93h, reason: invalid class name */
/* loaded from: 93h.class */
public final class C93h extends C99o {
    public final ImmutableList A00;

    public C93h(ImmutableList immutableList) {
        this.A00 = immutableList;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C93h) && 11T.A0O(this.A00, ((C93h) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
