package X;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.13q, reason: invalid class name */
/* loaded from: 13q.class */
public final class C13q {
    public static final 13R A00(4RW r301, List list) {
        C0ty c0ty = C0ty.A00;
        return new 13R(r301, c0ty, c0ty, list, (DefaultConstructorMarker) null, false);
    }

    public static final 13R A01(4RW r301, List list, List list2) {
        11T.A0F(list2, 2);
        return new 13R(r301, list, list2, C0ty.A00, (DefaultConstructorMarker) null, false);
    }

    public static final 13R A02(4RW r301, List list, List list2, boolean z) {
        return new 13R(r301, list, list2, C0ty.A00, (DefaultConstructorMarker) null, z);
    }

    public final 13R A03(4RW r302) {
        return A04(r302, C0ty.A00);
    }

    public final 13R A04(4RW r302, List list) {
        return A01(r302, list, C0ty.A00);
    }

    public final 13R A05(List list) {
        return A04(4RW.A05, list);
    }
}
