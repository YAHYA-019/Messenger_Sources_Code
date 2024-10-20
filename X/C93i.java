package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.93i, reason: invalid class name */
/* loaded from: 93i.class */
public final class C93i extends C99o {
    public final ImmutableList A00;

    public C93i(ImmutableList immutableList) {
        this.A00 = immutableList;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C93i) && 11T.A0O(this.A00, ((C93i) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
