package X;

import android.os.Build;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.781, reason: invalid class name */
/* loaded from: 781.class */
public final class AnonymousClass781 implements AnonymousClass782, C6xq {
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

    public AnonymousClass781(C7u2 c7u2) {
        this.A00 = c7u2.A00;
        ImmutableList immutableList = c7u2.A01;
        C1pq.A08("grantedPermissions", immutableList);
        this.A01 = immutableList;
        this.A06 = c7u2.A06;
        ImmutableList immutableList2 = c7u2.A02;
        C1pq.A08("missingPermissions", immutableList2);
        this.A02 = immutableList2;
        this.A03 = c7u2.A03;
        this.A04 = c7u2.A04;
        this.A05 = Collections.unmodifiableSet(c7u2.A05);
    }

    public AnonymousClass781(ImmutableList immutableList, ImmutableList immutableList2, Set set) {
        this.A00 = null;
        C1pq.A08("grantedPermissions", immutableList);
        this.A01 = immutableList;
        this.A06 = false;
        C1pq.A08("missingPermissions", immutableList2);
        this.A02 = immutableList2;
        this.A03 = null;
        this.A04 = null;
        this.A05 = Collections.unmodifiableSet(set);
    }

    public static C7vy A00() {
        return C7vy.A00;
    }

    public static ImmutableList A01() {
        int i = Build.VERSION.SDK_INT;
        String A00 = AbstractC00603o4.A00(2);
        String A002 = AbstractC00603o4.A00(0);
        ImmutableList of = i >= 34 ? ImmutableList.of((Object) A002, (Object) A00, (Object) AbE.A00(0)) : ImmutableList.of((Object) A002, (Object) A00);
        11T.A0A(of);
        return of;
    }

    public static ImmutableList A02() {
        ImmutableList of = ImmutableList.of((Object) "android.permission.READ_EXTERNAL_STORAGE");
        11T.A0A(of);
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
                    A08 = A02();
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
            if (!(obj instanceof AnonymousClass781)) {
                return false;
            }
            AnonymousClass781 anonymousClass781 = (AnonymousClass781) obj;
            if (!11T.A0O(AlX(), anonymousClass781.AlX()) || !11T.A0O(this.A01, anonymousClass781.A01) || this.A06 != anonymousClass781.A06 || !11T.A0O(this.A02, anonymousClass781.A02) || !11T.A0O(B7Z(), anonymousClass781.B7Z()) || !11T.A0O(B7a(), anonymousClass781.B7a())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(B7a(), C1pq.A04(B7Z(), C1pq.A04(this.A02, C1pq.A02(C1pq.A04(this.A01, C1pq.A03(AlX())), this.A06))));
    }
}
