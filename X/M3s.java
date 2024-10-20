package X;

import com.facebookpay.logging.LoggingContext;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: M3s.class */
public final class M3s extends C00q implements Function1 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M3s(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        super(1);
        this.A00 = i;
        this.A04 = obj;
        this.A02 = obj2;
        this.A01 = obj3;
        this.A03 = obj4;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2;
        2R2 r0 = (2R2) obj;
        switch (this.A00) {
            case 0:
            case 1:
                0DA r02 = new 0DA();
                r02.A07("view_name", "incentive");
                JQz.A1D(r02, "add_incentive");
                r02.A08("incentives_to_apply", (List) this.A03);
                r02.A08("applied_incentives", (List) this.A01);
                L9N.A03(r02, (LoggingContext) this.A04);
                r0.A0A(r02, "event_payload");
                obj2 = this.A02;
                break;
            case 2:
                0DA r03 = new 0DA();
                LoggingContext loggingContext = (LoggingContext) this.A04;
                7zR.A15(r03, loggingContext);
                r03.A01(LEL.A01((EnumC3490Mfk) this.A02), "credential_type");
                7zQ.A1A(r03, loggingContext);
                r03.A07("view_name", "checkout");
                Long l = (Long) this.A01;
                if (l != null) {
                    r03.A06("credential_id", l);
                }
                r0.A0A(r03, "event_payload");
                obj2 = this.A03;
                break;
            default:
                0DA r04 = new 0DA();
                r04.A07("view_name", "incentive");
                JQz.A1D(r04, "remove_incentive");
                r04.A08("incentives_to_apply", (List) this.A03);
                r04.A08("applied_incentives", (List) this.A01);
                L9N.A03(r04, (LoggingContext) this.A04);
                r0.A0A(r04, "event_payload");
                obj2 = this.A02;
                break;
        }
        java.util.Map map = (java.util.Map) obj2;
        if (map != null) {
            r0.A0I(map);
        }
        return r0;
    }
}
