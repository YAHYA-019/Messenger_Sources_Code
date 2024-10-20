package X;

import android.graphics.Bitmap;
import java.io.File;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* loaded from: AJa.class */
public final class AJa extends 0DO implements Function2 {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AJa(8KQ r302, AnonymousClass958 anonymousClass958, C9h1 c9h1, File file, 0DR r306) {
        super(2, r306);
        this.A04 = 2;
        this.A05 = anonymousClass958;
        this.A06 = r302;
        this.A03 = c9h1;
        this.A07 = file;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AJa(Bitmap bitmap, 2EU r303, 8Lu r304, 8D1 r305, List list, 0DR r307) {
        super(2, r307);
        this.A04 = 3;
        this.A05 = bitmap;
        this.A07 = list;
        this.A06 = r303;
        this.A03 = r305;
        this.A01 = r304;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AJa(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, 0DR r307, int i) {
        super(2, r307);
        this.A04 = i;
        this.A02 = obj;
        this.A07 = obj2;
        this.A06 = obj3;
        this.A05 = obj4;
        this.A01 = obj5;
    }

    public final 0DR create(Object obj, 0DR r303) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int i;
        switch (this.A04) {
            case 0:
                obj6 = this.A02;
                obj4 = this.A07;
                obj5 = this.A06;
                obj3 = this.A05;
                obj2 = this.A01;
                i = 0;
                break;
            case 1:
                obj2 = this.A01;
                obj3 = this.A05;
                obj4 = this.A07;
                obj5 = this.A06;
                obj6 = this.A02;
                i = 1;
                break;
            case 2:
                return new AJa((8KQ) this.A06, (AnonymousClass958) this.A05, (C9h1) this.A03, (File) this.A07, r303);
            default:
                return new AJa((Bitmap) this.A05, (2EU) this.A06, (8Lu) this.A01, (8D1) this.A03, (List) this.A07, r303);
        }
        AJa aJa = new AJa(obj6, obj4, obj5, obj3, obj2, r303, i);
        aJa.A03 = obj;
        return aJa;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:42:0x079d  */
    /* JADX WARN: Type inference failed for: r0v311, types: [X.0zE, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 1992
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AJa.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
