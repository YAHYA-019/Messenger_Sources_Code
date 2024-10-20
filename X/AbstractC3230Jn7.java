package X;

import android.content.DialogInterface;
import com.facebook.browser.lite.extensions.autofill.base.jsbridge.AutofillSharedJSBridgeProxy;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall;
import java.util.List;

/* renamed from: X.Jn7, reason: case insensitive filesystem */
/* loaded from: Jn7.class */
public abstract class AbstractC3230Jn7 extends JnD {
    public static final String __redex_internal_original_name = "SaveAutofillBottomSheetDialogFragment";
    public int A00;
    public long A01;
    public DialogInterface.OnDismissListener A02;
    public AutofillSharedJSBridgeProxy A03;
    public C11474wl A04;
    public C3243Jnf A05;
    public C11384wc A06;
    public AutofillData A07;
    public AutofillData A08;
    public RequestAutofillJSBridgeCall A09;
    public String A0A;
    public List A0B;
    public final L8t A0E;
    public boolean A0D = false;
    public boolean A0C = false;

    public AbstractC3230Jn7(L8t l8t) {
        this.A0E = l8t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (r0 != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCancel(android.content.DialogInterface r302) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC3230Jn7.onCancel(android.content.DialogInterface):void");
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super/*X.0D2*/.onDismiss(dialogInterface);
        this.A01 = 0L;
        DialogInterface.OnDismissListener onDismissListener = this.A02;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    public void onStart() {
        int A02 = 0FI.A02(-134069482);
        this.A01 = System.currentTimeMillis();
        super/*X.JgN*/.onStart();
        0FI.A08(494675307, A02);
    }
}
