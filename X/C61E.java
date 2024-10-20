package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.61E, reason: invalid class name */
/* loaded from: 61E.class */
public final class C61E extends C04v implements 61F {
    public static final C61E A01;
    public final ImmutableList A00;

    static {
        ImmutableList of = ImmutableList.of();
        11T.A0A(of);
        A01 = new C61E(of);
    }

    public C61E() {
        this(1BK.A0b());
    }

    public C61E(ImmutableList immutableList) {
        11T.A0F(immutableList, 1);
        this.A00 = immutableList;
    }

    public int BNp() {
        return this.A00.hashCode();
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C61E) && 11T.A0O(this.A00, ((C61E) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
