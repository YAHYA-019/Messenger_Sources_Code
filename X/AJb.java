package X;

import android.content.Context;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* loaded from: AJb.class */
public final class AJb extends 0DO implements Function2 {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AJb(Context context, FHh fHh, GJj gJj, String str, List list, 0DR r307) {
        super(2, r307);
        this.A03 = 0;
        this.A06 = list;
        this.A05 = context;
        this.A07 = str;
        this.A01 = fHh;
        this.A04 = gJj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AJb(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, 0DR r308, int i) {
        super(2, r308);
        this.A03 = i;
        this.A02 = obj;
        this.A04 = obj2;
        this.A07 = str;
        this.A01 = obj3;
        this.A05 = obj4;
        this.A06 = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AJb(Object obj, Object obj2, Object obj3, Object obj4, String str, 0DR r307, int i) {
        super(2, r307);
        this.A03 = i;
        this.A02 = obj;
        this.A04 = obj2;
        this.A06 = obj3;
        this.A07 = str;
        this.A05 = obj4;
    }

    public final 0DR create(Object obj, 0DR r303) {
        Object obj2;
        Object obj3;
        String str;
        Object obj4;
        Object obj5;
        int i;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        String str2;
        Object obj10;
        int i2;
        switch (this.A03) {
            case 0:
                return new AJb((Context) this.A05, (FHh) this.A01, (GJj) this.A04, this.A07, (List) this.A06, r303);
            case 1:
                obj6 = this.A02;
                obj7 = this.A04;
                str2 = this.A07;
                obj8 = this.A01;
                obj10 = this.A05;
                obj9 = this.A06;
                i2 = 1;
                return new AJb(obj6, obj7, obj8, obj10, obj9, str2, r303, i2);
            case 2:
                obj2 = this.A02;
                obj3 = this.A04;
                obj4 = this.A06;
                str = this.A07;
                obj5 = this.A05;
                i = 2;
                break;
            case 3:
                obj2 = this.A02;
                obj3 = this.A04;
                str = this.A07;
                obj4 = this.A06;
                obj5 = this.A05;
                i = 3;
                break;
            case 4:
                obj6 = this.A02;
                obj7 = this.A04;
                obj8 = this.A01;
                obj9 = this.A06;
                str2 = this.A07;
                obj10 = this.A05;
                i2 = 4;
                return new AJb(obj6, obj7, obj8, obj10, obj9, str2, r303, i2);
            default:
                obj6 = this.A02;
                str2 = this.A07;
                obj7 = this.A04;
                obj8 = this.A01;
                obj10 = this.A05;
                obj9 = this.A06;
                i2 = 5;
                return new AJb(obj6, obj7, obj8, obj10, obj9, str2, r303, i2);
        }
        AJb aJb = new AJb(obj2, obj3, obj4, obj5, str, r303, i);
        aJb.A01 = obj;
        return aJb;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x02f0  */
    /* JADX WARN: Type inference failed for: r0v246, types: [X.4cZ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 1235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AJb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
