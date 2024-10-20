package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.browser.lite.extensions.autofill.base.jsbridge.AutofillSharedJSBridgeProxy;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Jn5, reason: case insensitive filesystem */
/* loaded from: Jn5.class */
public abstract class AbstractC3228Jn5 extends JnD {
    public static final String __redex_internal_original_name = "AutofillContactBottomSheetDialogFragment";
    public Context A00;
    public AutofillSharedJSBridgeProxy A01;
    public L8t A02;
    public C11474wl A03;
    public C3243Jnf A04;
    public C11384wc A05;
    public AbstractC3252Jnp A06;
    public String A07;
    public String A08;
    public List A09 = Collections.emptyList();
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;

    public final void A0r(Ktt ktt) {
        KuT kuT;
        C3243Jnf c3243Jnf;
        KuT kuT2;
        C3243Jnf c3243Jnf2 = this.A04;
        if (c3243Jnf2 == null || (kuT = c3243Jnf2.A08) == null || !kuT.A04(false) || (c3243Jnf = this.A04) == null || (kuT2 = c3243Jnf.A08) == null) {
            return;
        }
        ktt.A02("automatic_autofill_consent_toggle_status_on", String.valueOf(kuT2.A00.A00.A04.A01));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0091, code lost:
    
        if (r0 != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00e5, code lost:
    
        if (r303.isEmpty() != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCancel(android.content.DialogInterface r302) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC3228Jn5.onCancel(android.content.DialogInterface):void");
    }

    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(141682383);
        if (bundle != null) {
            A0o();
        }
        super.onCreate(bundle);
        0FI.A08(-858990404, A02);
    }
}
