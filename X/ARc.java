package X;

import com.facebookpay.logging.LoggingContext;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: ARc.class */
public final class ARc extends C00q implements Function1 {
    public final long A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ARc(EnumC3490Mfk enumC3490Mfk, LoggingContext loggingContext, String str, List list, List list2, java.util.Map map, long j) {
        super(1);
        this.A05 = loggingContext;
        this.A00 = j;
        this.A03 = enumC3490Mfk;
        this.A02 = list;
        this.A06 = str;
        this.A01 = list2;
        this.A04 = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r308v1 */
    /* JADX WARN: Type inference failed for: r308v2 */
    /* JADX WARN: Type inference failed for: r308v5, types: [java.util.AbstractCollection] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list;
        2R2 r0 = (2R2) obj;
        0DA r02 = new 0DA();
        LoggingContext loggingContext = (LoggingContext) this.A05;
        7zR.A15(r02, loggingContext);
        0DA r03 = new 0DA();
        r03.A06("credential_id", Long.valueOf(this.A00));
        7zV.A0t(r03, r02, (EnumC3490Mfk) this.A03);
        List list2 = (List) this.A02;
        if (list2 != null) {
            list = 1BL.A0z(list2);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                7zV.A19((AbstractCollection) list, it);
            }
        } else {
            list = C0ty.A00;
        }
        r02.A08("container_ids", list);
        7zQ.A1A(r02, loggingContext);
        r02.A07("view_name", this.A06);
        r02.A08("applied_discounts", (List) this.A01);
        7zL.A1E(r0, r02);
        7zO.A18(r0, this.A04);
        return r0;
    }
}
