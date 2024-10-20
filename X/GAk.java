package X;

import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebookpay.logging.LoggingContext;
import kotlin.jvm.functions.Function1;

/* loaded from: GAk.class */
public final class GAk extends C00q implements Function1 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GAk(Object obj, Object obj2, String str, int i, boolean z) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
        this.A03 = str;
        this.A02 = obj2;
        this.A04 = z;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        2R2 r304;
        0DA r305;
        LoggingContext loggingContext;
        Boolean valueOf;
        String str;
        String str2;
        String str3;
        switch (this.A00) {
            case 1:
                11T.A0F(obj, 0);
                return new M8x(this.A01, obj, this.A02, this.A03, 1, this.A04);
            case 2:
                r304 = null;
                if (obj != null) {
                    Context context = (Context) this.A01;
                    String str4 = this.A03;
                    ThreadKey threadKey = (ThreadKey) this.A02;
                    boolean z = this.A04;
                    FIw.A04(context, (FyG) null, (DLQ) null, (GJj) null);
                    R3y.A00(context, threadKey, str4, z);
                    return null;
                }
                return r304;
            case 3:
                r304 = (2R2) obj;
                r305 = new 0DA();
                7zR.A15(r305, (LoggingContext) this.A02);
                String str5 = this.A03;
                if (str5 == null) {
                    str5 = "";
                }
                r305.A07("receiver_id", str5);
                r305.A03(JQw.A00(25), Boolean.valueOf(this.A04));
                r305.A07("view_name", "checkout_setup_mutation");
                7zL.A1E(r304, r305);
                7zO.A18(r304, this.A01);
                return r304;
            case 4:
                r304 = (2R2) obj;
                r305 = new 0DA();
                loggingContext = (LoggingContext) this.A02;
                7zR.A15(r305, loggingContext);
                r305.A07("target_name", this.A03);
                valueOf = Boolean.valueOf(this.A04);
                str = "otc_toggle_state_on";
                r305.A03(str, valueOf);
                7zQ.A1A(r305, loggingContext);
                7zL.A1E(r304, r305);
                7zO.A18(r304, this.A01);
                return r304;
            case 5:
                r304 = (2R2) obj;
                r305 = new 0DA();
                7zT.A1F(r305, this.A02);
                str2 = this.A03;
                str3 = "target_name";
                r305.A07(str3, str2);
                r305.A03(JQw.A00(87), Boolean.valueOf(this.A04));
                7zL.A1E(r304, r305);
                7zO.A18(r304, this.A01);
                return r304;
            case 6:
            case 7:
            default:
                r304 = (2R2) obj;
                r305 = new 0DA();
                7zT.A1F(r305, this.A02);
                str2 = this.A03;
                str3 = "view_name";
                r305.A07(str3, str2);
                r305.A03(JQw.A00(87), Boolean.valueOf(this.A04));
                7zL.A1E(r304, r305);
                7zO.A18(r304, this.A01);
                return r304;
            case 8:
                r304 = (2R2) obj;
                r305 = new 0DA();
                loggingContext = (LoggingContext) this.A02;
                7zR.A15(r305, loggingContext);
                r305.A07("view_name", this.A03);
                valueOf = Boolean.valueOf(this.A04);
                str = "is_default_otc_toggle_state_on";
                r305.A03(str, valueOf);
                7zQ.A1A(r305, loggingContext);
                7zL.A1E(r304, r305);
                7zO.A18(r304, this.A01);
                return r304;
            case 9:
                r304 = (2R2) obj;
                r305 = new 0DA();
                7zT.A1F(r305, this.A02);
                str2 = this.A03;
                str3 = "view_name";
                r305.A07(str3, str2);
                r305.A03(JQw.A00(87), Boolean.valueOf(this.A04));
                7zL.A1E(r304, r305);
                7zO.A18(r304, this.A01);
                return r304;
        }
    }
}
