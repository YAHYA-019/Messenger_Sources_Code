package X;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.logging.LoggingContext;
import java.util.LinkedHashMap;

/* loaded from: JxP.class */
public final class JxP extends JgV implements MIr {
    public static final String __redex_internal_original_name = "ECPConfirmationContentFragment";
    public ContextThemeWrapper A00;
    public View A01;
    public Button A02;
    public Q2i A03;
    public Q2L A04;
    public ECPHandler A05;
    public LoggingContext A06;

    public static final void A05(LoggingContext loggingContext, JxP jxP, String str, String str2) {
        LZv A0b = 7zU.A0b();
        Q2L q2l = jxP.A04;
        if (q2l == null) {
            11T.A0L("confirmationViewModel");
            throw 0Q8.createAndThrow();
        }
        LinkedHashMap A0t = DKH.A0t(q2l.A07);
        if (str2 != null) {
            A0t.put("upsell_action_type", str2);
        }
        LZv.A02(AbF.A08(1BK.A08(A0b.A00, 1BJ.A00(2132)), 308), loggingContext, A0t, str, 23);
    }

    @Override // X.MIr
    public /* synthetic */ boolean Bmr(LoggingContext loggingContext, Integer num) {
        return false;
    }

    @Override // X.MIr
    public void CoJ(ECPHandler eCPHandler) {
        this.A05 = eCPHandler;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(1397617637);
        ContextThemeWrapper A01 = JgV.A01(this, layoutInflater);
        this.A00 = A01;
        View inflate = layoutInflater.cloneInContext(A01).inflate(2132541880, viewGroup, false);
        0FI.A08(-1225890251, A02);
        return inflate;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x03e9, code lost:
    
        if (X.0CU.A0O(r0) != false) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onViewCreated(android.view.View r302, android.os.Bundle r303) {
        /*
            Method dump skipped, instructions count: 1518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JxP.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
