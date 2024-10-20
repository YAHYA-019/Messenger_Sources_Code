package X;

import com.facebookpay.logging.LoggingContext;
import kotlin.jvm.functions.Function1;

/* loaded from: GAj.class */
public final class GAj extends C00q implements Function1 {
    public final /* synthetic */ java.util.Map $extraData;
    public final /* synthetic */ boolean $isEcpAvailable;
    public final /* synthetic */ LoggingContext $loggingContext;
    public final /* synthetic */ String $orderId;
    public final /* synthetic */ String $receiverId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GAj(LoggingContext loggingContext, String str, String str2, java.util.Map map, boolean z) {
        super(1);
        this.$loggingContext = loggingContext;
        this.$receiverId = str;
        this.$isEcpAvailable = z;
        this.$orderId = str2;
        this.$extraData = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        2R2 r0 = (2R2) obj;
        0DA r02 = new 0DA();
        7zR.A15(r02, this.$loggingContext);
        String str = this.$receiverId;
        if (str == null) {
            str = "";
        }
        r02.A07("receiver_id", str);
        r02.A03(JQw.A00(25), Boolean.valueOf(this.$isEcpAvailable));
        r02.A07("view_name", "checkout_setup_mutation");
        String str2 = this.$orderId;
        if (str2 != null) {
            r02.A06("order_id", 0CW.A0e(str2));
        }
        7zL.A1E(r0, r02);
        java.util.Map map = this.$extraData;
        if (map != null) {
            r0.A0I(map);
        }
        return r0;
    }
}
