package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.82b, reason: invalid class name */
/* loaded from: 82b.class */
public final class C82b extends C04v {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C82b() {
        this.A03 = 3;
        C0ty c0ty = C0ty.A00;
        C11434wh c11434wh = new C11434wh(c0ty, false);
        03W r0 = 03W.A00;
        11T.A0I(r0, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        this.A03 = 3;
        11T.A0F(c0ty, 1);
        11T.A0F(r0, 3);
        this.A02 = c0ty;
        this.A01 = c11434wh;
        this.A00 = r0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C82b(int i) {
        this();
        this.A03 = i;
        switch (i) {
            case 0:
                this((Long) null, (java.util.Map) null, (java.util.Map) null, (DefaultConstructorMarker) null, 7, 0);
                return;
            case 1:
                this.A03 = 1;
                Integer num = 0S2.A01;
                Integer num2 = 0S2.A00;
                this.A03 = 1;
                this.A01 = num;
                this.A00 = num2;
                this.A02 = num2;
                return;
            case 2:
                this.A03 = 2;
                this(2, null, null, null);
                return;
            default:
                return;
        }
    }

    public C82b(int i, Object obj, Object obj2, Object obj3) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C82b(8Lq r302, 8Lq r303, 8Lq r304, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this(2, null, null, null);
        this.A03 = 2;
    }

    public C82b(Integer num, Integer num2, Integer num3, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this.A03 = 1;
        Integer num4 = 0S2.A01;
        Integer num5 = 0S2.A00;
        this.A03 = 1;
        this.A01 = num4;
        this.A00 = num5;
        this.A02 = num5;
    }

    public C82b(Long l, java.util.Map map, java.util.Map map2, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this.A03 = 0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        this.A03 = 0;
        this.A01 = linkedHashMap;
        this.A02 = linkedHashMap2;
        this.A00 = null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82b.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public int hashCode() {
        int hashCode;
        Object obj;
        int hashCode2;
        Object obj2;
        int i;
        switch (this.A03) {
            case 0:
                hashCode2 = ((this.A01.hashCode() * 31) + this.A02.hashCode()) * 31;
                obj2 = this.A00;
                if (obj2 == null) {
                    i = 0;
                    return hashCode2 + i;
                }
                i = obj2.hashCode();
                return hashCode2 + i;
            case 1:
                int intValue = ((Number) this.A01).intValue();
                hashCode2 = ((7zM.A04(1 != intValue ? "VERIFIED" : 4YT.A00(701), intValue) * 31) + 9Az.A00((Integer) this.A00)) * 31;
                i = 9Az.A00((Integer) this.A02);
                return hashCode2 + i;
            case 2:
                Object obj3 = this.A00;
                i = (((obj3 == null ? 0 : obj3.hashCode()) * 31) + AnonymousClass001.A02(this.A01)) * 31;
                hashCode2 = 4YU.A03(this.A02);
                return hashCode2 + i;
            case 3:
                hashCode = this.A02.hashCode() * 31;
                obj = this.A01;
                hashCode2 = (hashCode + obj.hashCode()) * 31;
                obj2 = this.A00;
                i = obj2.hashCode();
                return hashCode2 + i;
            case 4:
            default:
                return super.hashCode();
            case 5:
                hashCode = this.A01.hashCode() * 31;
                obj = this.A02;
                hashCode2 = (hashCode + obj.hashCode()) * 31;
                obj2 = this.A00;
                i = obj2.hashCode();
                return hashCode2 + i;
        }
    }
}
