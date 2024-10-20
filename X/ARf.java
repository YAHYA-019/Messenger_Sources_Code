package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebookpay.logging.LoggingContext;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: ARf.class */
public final class ARf extends C00q implements Function1 {
    public final /* synthetic */ List $appliedDiscounts;
    public final /* synthetic */ List $containerIds;
    public final /* synthetic */ long $credentialId;
    public final /* synthetic */ EnumC3490Mfk $credentialType;
    public final /* synthetic */ java.util.Map $extraData = null;
    public final /* synthetic */ String $failureReason;
    public final /* synthetic */ LoggingContext $loggingContext;
    public final /* synthetic */ String $viewName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ARf(EnumC3490Mfk enumC3490Mfk, LoggingContext loggingContext, String str, String str2, List list, List list2, long j) {
        super(1);
        this.$loggingContext = loggingContext;
        this.$credentialId = j;
        this.$credentialType = enumC3490Mfk;
        this.$containerIds = list;
        this.$viewName = str;
        this.$failureReason = str2;
        this.$appliedDiscounts = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r308v1 */
    /* JADX WARN: Type inference failed for: r308v2 */
    /* JADX WARN: Type inference failed for: r308v7, types: [java.util.AbstractCollection] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list;
        2R2 r0 = (2R2) obj;
        0DA r02 = new 0DA();
        7zR.A15(r02, this.$loggingContext);
        0DA r03 = new 0DA();
        r03.A06("credential_id", Long.valueOf(this.$credentialId));
        7zV.A0t(r03, r02, this.$credentialType);
        List list2 = this.$containerIds;
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
        LoggingContext loggingContext = this.$loggingContext;
        11T.A0F(loggingContext, 0);
        7zQ.A1A(r02, loggingContext);
        r02.A07("view_name", this.$viewName);
        r02.A07(TraceFieldType.FailureReason, this.$failureReason);
        r02.A08("applied_discounts", this.$appliedDiscounts);
        7zL.A1E(r0, r02);
        java.util.Map map = this.$extraData;
        if (map != null) {
            r0.A0I(map);
        }
        return r0;
    }
}
