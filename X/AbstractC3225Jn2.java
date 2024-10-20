package X;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.RemoteException;
import com.facebook.browser.lite.ipc.BrowserLiteCallback;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.Jn2, reason: case insensitive filesystem */
/* loaded from: Jn2.class */
public abstract class AbstractC3225Jn2 extends JnD {
    public static final String __redex_internal_original_name = "AutofillPaymentBottomSheetDialogFragment";
    public Context A00;
    public LET A01;
    public C11474wl A02;
    public AbstractC3252Jnp A03;
    public KqR A04;

    public void onCancel(DialogInterface dialogInterface) {
        Ktt A0H;
        List A12;
        Object obj;
        8Lt r0;
        11T.A0F(dialogInterface, 0);
        LET let = this.A01;
        if (let != null) {
            LET.A0A(let, (L1y) null);
            C11474wl c11474wl = let.A0P;
            C11424wg c11424wg = c11474wl.A00;
            Integer num = 0S2.A00;
            11T.A0F(c11424wg, 0);
            C11394wd c11394wd = c11424wg.A08;
            String str = c11394wd.A01;
            Integer num2 = null;
            if (str != null && (A12 = JQx.A12(str, (java.util.Map) c11424wg.A0I.A02)) != null) {
                ListIterator A1F = AbH.A1F(A12);
                while (true) {
                    if (!A1F.hasPrevious()) {
                        obj = null;
                        break;
                    }
                    obj = A1F.previous();
                    8Lu r02 = (8Lu) obj;
                    8Lt r03 = (8Lt) r02.A01;
                    if (r03.A01 == num && r03.A03 == num && r02.A00 == 0S2.A01) {
                        break;
                    }
                }
                8Lu r04 = (8Lu) obj;
                if (r04 != null && (r0 = (8Lt) r04.A01) != null) {
                    num2 = (Integer) r0.A02;
                }
            }
            String str2 = "DECLINED_AUTOFILL";
            if (num2 != null && num2 == num) {
                Ktt A0H2 = let.A0H(str2);
                A0H2.A0H = "CONTACT_AUTOFILL";
                C3243Jnf c3243Jnf = let.A03;
                A0H2.A0P = !c3243Jnf.A0I();
                LEA.A0B(c11474wl, c3243Jnf, A0H2);
                return;
            }
            c11424wg.A0J.A00 = 0S2.A0N;
            LET.A07(let);
            c11394wd.A00++;
            Object obj2 = c11424wg.A0O.A00;
            if (obj2 == EnumC11364wa.A02) {
                LEA.A08(let, c11474wl, let.A0H("NOT_NOW_CLICK"));
                str2 = "DECLINED_PREFETCH";
            } else if (obj2 == EnumC11364wa.A04 && let.A03.A0J()) {
                str2 = "DECLINED_RE_OPT_IN";
            }
            if (num2 != null) {
                String A00 = Kvh.A00(num2);
                A0H = let.A0H(str2);
                A0H.A0H = A00;
            } else {
                A0H = let.A0H(str2);
            }
            C3243Jnf c3243Jnf2 = let.A03;
            A0H.A0P = !c3243Jnf2.A0I();
            LEA.A0B(c11474wl, c3243Jnf2, A0H);
            if (c3243Jnf2.A0J()) {
                BrowserLiteCallback browserLiteCallback = LDF.A00().A06;
                if (browserLiteCallback != null) {
                    try {
                        browserLiteCallback.BOX();
                    } catch (RemoteException e) {
                        0fH.A0w("BrowserLiteCallbacker", "Error in incrementReOptInDeclineCount", e);
                    }
                }
                c3243Jnf2.A0N = true;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(1401173168);
        if (bundle != null) {
            A0o();
        }
        super.onCreate(bundle);
        0FI.A08(-839175257, A02);
    }
}
