package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.7vy, reason: invalid class name */
/* loaded from: 7vy.class */
public final class C7vy implements 7Td {
    public static final C7vy A00 = new Object();

    public /* bridge */ /* synthetic */ AnonymousClass782 D7Y(AnonymousClass782 anonymousClass782, ImmutableList immutableList, ImmutableList immutableList2) {
        AnonymousClass781 anonymousClass781 = (AnonymousClass781) anonymousClass782;
        11T.A0F(anonymousClass781, 0);
        C7u2 c7u2 = new C7u2(anonymousClass781);
        c7u2.A02 = immutableList;
        C1pq.A08("missingPermissions", immutableList);
        c7u2.A01 = immutableList2;
        C1pq.A08("grantedPermissions", immutableList2);
        return new AnonymousClass781(c7u2);
    }
}
