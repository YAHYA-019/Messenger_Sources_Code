package X;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Ae1, reason: case insensitive filesystem */
/* loaded from: Ae1.class */
public final class C1323Ae1 {
    public final int A00;
    public final ImmutableList A01;
    public final Integer A02;
    public static final C1323Ae1 A05 = new C1323Ae1(ImmutableList.of(), 0S2.A00);
    public static final C1323Ae1 A03 = new C1323Ae1(ImmutableList.of(), 0S2.A0N);
    public static final C1323Ae1 A04 = AbK.A0b();

    public C1323Ae1(ImmutableList immutableList, Integer num) {
        this(immutableList, num, immutableList.size());
    }

    public C1323Ae1(ImmutableList immutableList, Integer num, int i) {
        Preconditions.checkNotNull(immutableList, "Please use ImmutableList.of()");
        this.A01 = immutableList;
        this.A02 = num;
        this.A00 = i;
    }

    public static C1323Ae1 A00(ImmutableList immutableList) {
        return AbG.A0n(immutableList);
    }
}
