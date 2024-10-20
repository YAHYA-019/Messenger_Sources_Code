package X;

import android.os.Build;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.786, reason: invalid class name */
/* loaded from: 786.class */
public final class AnonymousClass786 implements AnonymousClass782, C6xq {
    public static volatile 7Td A07;
    public static volatile ImmutableList A08;
    public static volatile ImmutableList A09;
    public final 7Td A00;
    public final ImmutableList A01;
    public final ImmutableList A02;
    public final ImmutableList A03;
    public final ImmutableList A04;
    public final Set A05;
    public final boolean A06;

    public AnonymousClass786(7Td r302, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, ImmutableList immutableList4, Set set, boolean z) {
        this.A00 = r302;
        C1pq.A08("grantedPermissions", immutableList);
        this.A01 = immutableList;
        this.A06 = z;
        C1pq.A08("missingPermissions", immutableList2);
        this.A02 = immutableList2;
        this.A03 = immutableList3;
        this.A04 = immutableList4;
        this.A05 = Collections.unmodifiableSet(set);
    }

    public static C7vw A00() {
        return C7vw.A00;
    }

    public static ImmutableList A01() {
        ImmutableList of = Build.VERSION.SDK_INT >= 33 ? ImmutableList.of((Object) AbstractC00603o4.A00(4), (Object) AbstractC00603o4.A00(2), (Object) AbstractC00603o4.A00(0)) : ImmutableList.of((Object) "android.permission.READ_EXTERNAL_STORAGE");
        11T.A0D(of);
        return of;
    }

    @Override // X.AnonymousClass782
    public 7Td AlX() {
        if (this.A05.contains("factory")) {
            return this.A00;
        }
        if (A07 == null) {
            synchronized (this) {
                if (A07 == null) {
                    A07 = A00();
                }
            }
        }
        return A07;
    }

    @Override // X.AnonymousClass782
    public ImmutableList Ao6() {
        return this.A01;
    }

    @Override // X.AnonymousClass782
    public ImmutableList Axv() {
        return this.A02;
    }

    @Override // X.AnonymousClass782
    public ImmutableList B7Z() {
        if (this.A05.contains("requiredPermissions")) {
            return this.A03;
        }
        if (A08 == null) {
            synchronized (this) {
                if (A08 == null) {
                    A08 = A01();
                }
            }
        }
        return A08;
    }

    @Override // X.AnonymousClass782
    public ImmutableList B7a() {
        if (this.A05.contains("requiredPermissionsMinTargetSdk")) {
            return this.A04;
        }
        if (A09 == null) {
            synchronized (this) {
                if (A09 == null) {
                    A09 = A01();
                }
            }
        }
        return A09;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AnonymousClass786)) {
                return false;
            }
            AnonymousClass786 anonymousClass786 = (AnonymousClass786) obj;
            if (!11T.A0O(AlX(), anonymousClass786.AlX()) || !11T.A0O(this.A01, anonymousClass786.A01) || this.A06 != anonymousClass786.A06 || !11T.A0O(this.A02, anonymousClass786.A02) || !11T.A0O(B7Z(), anonymousClass786.B7Z()) || !11T.A0O(B7a(), anonymousClass786.B7a())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(B7a(), C1pq.A04(B7Z(), C1pq.A04(this.A02, C1pq.A02(C1pq.A04(this.A01, C1pq.A03(AlX())), this.A06))));
    }
}
