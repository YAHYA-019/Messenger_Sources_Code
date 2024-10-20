package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebookpay.common.recyclerview.adapteritems.PuxContactItem;
import com.facebookpay.logging.LoggingContext;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;

/* loaded from: GAf.class */
public final class GAf extends C00q implements Function1 {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GAf(Object obj, String str, String str2, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
        this.A03 = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        switch (this.A00) {
            case 0:
                EEq eEq = ((DaX) this.A01).A02;
                if (eEq != null) {
                    eEq.handleMessage(this.A02, this.A03);
                    break;
                }
                break;
            case 1:
                JMA jma = (JMA) obj;
                11T.A0F(jma, 0);
                0PI r0 = (0PI) this.A01;
                if (r0.element == 0) {
                    jma.CO3(this.A03, this.A02);
                }
                r0.element++;
                break;
            case 2:
                C8sI c8sI = (C8sI) obj;
                11T.A0F(c8sI, 0);
                C9m2.A00((C9m2) this.A01).flowAnnotate(c8sI.A00, this.A02, this.A03);
                break;
            case 3:
                String str2 = this.A02;
                if (str2 != null && str2.length() != 0) {
                    0Be r02 = (0Be) this.A01;
                    if (r02 != null) {
                        r02.invoke(str2, this.A03, true, (Object) null);
                    }
                    C00i c00i = 7Jz.A0Y.A00;
                    QuickPerformanceLogger A0V = 1BK.A0V(c00i);
                    int hashCode = str2.hashCode();
                    A0V.markerStart(5512460, hashCode);
                    1BK.A0V(c00i).markerAnnotate(5512460, hashCode, "messageId", str2);
                    break;
                }
                break;
            default:
                boolean A1V = AnonymousClass001.A1V(obj);
                LZv A0b = 7zU.A0b();
                C3033Jgw c3033Jgw = (C3033Jgw) this.A01;
                LoggingContext loggingContext = c3033Jgw.A1P;
                String str3 = this.A03;
                PuxContactItem puxContactItem = (PuxContactItem) c3033Jgw.A0I.A01;
                Long A0n = (puxContactItem == null || (str = puxContactItem.A02) == null) ? null : 1BK.A0n(str);
                Kzj A04 = c3033Jgw.A1Q.A04();
                String str4 = this.A02;
                LinkedHashMap A0x = DKF.A0x(A04, A1V);
                if (str4 != null) {
                    A0x.put("selected_contact_state", str4);
                }
                A0b.A0G(loggingContext, A0n, str3, A0x);
                break;
        }
        return 04S.A00;
    }
}
