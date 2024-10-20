package X;

import com.facebookpay.logging.LoggingContext;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: GAn.class */
public final class GAn extends C00q implements Function1 {
    public final Object A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GAn(LoggingContext loggingContext, String str, List list, java.util.Map map, boolean z) {
        super(1);
        this.A02 = loggingContext;
        this.A00 = list;
        this.A04 = z;
        this.A03 = str;
        this.A01 = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        EQk eQk;
        2R2 r0 = (2R2) obj;
        0DA r02 = new 0DA();
        LoggingContext loggingContext = (LoggingContext) this.A02;
        7zR.A15(r02, loggingContext);
        List<KOy> list = (List) this.A00;
        ArrayList A0z = 1BL.A0z(list);
        for (KOy kOy : list) {
            switch (DKE.A0C(kOy)) {
                case 6:
                    eQk = EQk.A01;
                    break;
                case 12:
                    eQk = EQk.A02;
                    break;
                case 13:
                    eQk = EQk.A03;
                    break;
                case 19:
                    eQk = EQk.A04;
                    break;
                case 20:
                    eQk = EQk.A05;
                    break;
                case 21:
                    eQk = EQk.A06;
                    break;
                case 24:
                    eQk = EQk.A07;
                    break;
                case 25:
                    eQk = EQk.A08;
                    break;
                case 28:
                    eQk = EQk.A09;
                    break;
                case 29:
                    eQk = EQk.A0A;
                    break;
                case 33:
                    eQk = EQk.A0B;
                    break;
                default:
                    throw AnonymousClass002.A0C(kOy, "Invalid component type: ", AnonymousClass001.A0k());
            }
            A0z.add(eQk);
        }
        r02.A08(1BJ.A00(387), A0z);
        r02.A03("is_prewarm", Boolean.valueOf(this.A04));
        String str2 = this.A03;
        int hashCode = str2.hashCode();
        if (hashCode == -2086110754) {
            if (str2.equals("PRE_FETCH")) {
                str = "pre_fetch";
                r02.A07("fetch_type", str);
                7zQ.A1A(r02, loggingContext);
                r02.A07("view_name", "checkout");
                7zL.A1E(r0, r02);
                7zO.A18(r0, this.A01);
                return r0;
            }
            throw 0Pz.A05("Invalid component fetch type: ", str2);
        }
        if (hashCode == -482433343) {
            if (str2.equals("PRE_WARM")) {
                str = "pre_warm";
                r02.A07("fetch_type", str);
                7zQ.A1A(r02, loggingContext);
                r02.A07("view_name", "checkout");
                7zL.A1E(r0, r02);
                7zO.A18(r0, this.A01);
                return r0;
            }
            throw 0Pz.A05("Invalid component fetch type: ", str2);
        }
        if (hashCode == 1804446588 && str2.equals("REGULAR")) {
            str = "regular";
            r02.A07("fetch_type", str);
            7zQ.A1A(r02, loggingContext);
            r02.A07("view_name", "checkout");
            7zL.A1E(r0, r02);
            7zO.A18(r0, this.A01);
            return r0;
        }
        throw 0Pz.A05("Invalid component fetch type: ", str2);
    }
}
