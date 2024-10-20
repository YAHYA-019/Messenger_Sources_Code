package X;

import com.facebookpay.logging.LoggingContext;
import kotlin.jvm.functions.Function1;

/* loaded from: AV9.class */
public final class AV9 extends C00q implements Function1 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AV9(LoggingContext loggingContext, Long l, String str, java.util.Map map, int i) {
        super(1);
        this.A00 = i;
        switch (i) {
            case 9:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                this.A02 = loggingContext;
                this.A04 = str;
                this.A03 = l;
                this.A01 = map;
                break;
            case 10:
            case 16:
            case 17:
            case 18:
            default:
                this.A03 = loggingContext;
                this.A04 = str;
                this.A01 = l;
                this.A02 = map;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AV9(Object obj, Object obj2, Object obj3, String str, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
        this.A04 = str;
        this.A03 = obj2;
        this.A02 = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x016b, code lost:
    
        if (X.11T.A0O(r0, "add_shipping_info") == false) goto L6;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00cd  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 3277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AV9.invoke(java.lang.Object):java.lang.Object");
    }
}
