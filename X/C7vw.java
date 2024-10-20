package X;

import com.google.common.collect.ImmutableList;
import java.util.HashSet;

/* renamed from: X.7vw, reason: invalid class name */
/* loaded from: 7vw.class */
public final class C7vw implements 7Td {
    public static final C7vw A00 = new Object();

    public /* bridge */ /* synthetic */ AnonymousClass782 D7Y(AnonymousClass782 anonymousClass782, ImmutableList immutableList, ImmutableList immutableList2) {
        AnonymousClass786 anonymousClass786 = (AnonymousClass786) anonymousClass782;
        11T.A0F(anonymousClass786, 0);
        7Td r0 = anonymousClass786.A00;
        boolean z = anonymousClass786.A06;
        ImmutableList immutableList3 = anonymousClass786.A03;
        ImmutableList immutableList4 = anonymousClass786.A04;
        HashSet hashSet = new HashSet(anonymousClass786.A05);
        C1pq.A08("missingPermissions", immutableList);
        C1pq.A08("grantedPermissions", immutableList2);
        return new AnonymousClass786(r0, immutableList2, immutableList, immutableList3, immutableList4, hashSet, z);
    }
}
