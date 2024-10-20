package X;

import android.view.ViewGroup;
import com.facebookpay.expresscheckout.logging.ComponentLoggingData;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.widget.listcell.ListCell;
import java.util.List;

/* loaded from: Jwt.class */
public final class Jwt extends AbstractC3052Jhk {
    public boolean A00;

    @Override // X.AbstractC3052Jhk
    public C2lb A07(ViewGroup viewGroup) {
        11T.A0F(viewGroup, 0);
        List list = C2lb.A0J;
        ListCell A02 = AbstractC3052Jhk.A02(4YU.A08(viewGroup), viewGroup, KP0.A0d, C06014fk.A0A());
        if (this.A01) {
            A02.A0J(KOW.A0D);
            A02.A0G(KOS.A05);
        } else {
            A02.A0J(KOW.A06);
        }
        if (!this.A00) {
            this.A00 = true;
            LoggingContext loggingContext = this.A03;
            if (loggingContext == null) {
                throw 1BK.A0h();
            }
            A02.A0F(new ComponentLoggingData(null, "checkout_screen", "shipping_option"), loggingContext);
        }
        A02.setOnClickListener(super.A00);
        RVu.A01(A02, 0S2.A01, (String) null);
        return new Q34(this, A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x009d, code lost:
    
        if (r316 == X.0S2.A0C) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x048b  */
    @Override // X.AbstractC3052Jhk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void A08(X.C2lb r302, X.FJC r303) {
        /*
            Method dump skipped, instructions count: 1280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Jwt.A08(X.2lb, X.FJC):void");
    }
}
