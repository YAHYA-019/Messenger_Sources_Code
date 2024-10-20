package X;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import androidx.fragment.app.Fragment;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.logging.LoggingContext;

/* loaded from: La3.class */
public final class La3 implements MFq {
    public final int A00;
    public final Object A01;

    public La3(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.JxS, androidx.fragment.app.Fragment] */
    @Override // X.MFq
    public final void C3Z(RYu rYu) {
        String str;
        Intent A05;
        Uri A03;
        switch (this.A00) {
            case 0:
                ?? r0 = (JxS) this.A01;
                C3033Jgw c3033Jgw = r0.A0B;
                if (c3033Jgw == null) {
                    str = "ecpViewModel";
                } else {
                    Q2K q2k = c3033Jgw.A1V;
                    06Z A08 = 7zN.A08((Fragment) r0);
                    Bundle A052 = 1BK.A05();
                    ECPPaymentRequest eCPPaymentRequest = q2k.A00;
                    if (eCPPaymentRequest == null) {
                        str = "ecpPaymentRequest";
                    } else {
                        A052.putParcelable("ECP_LAUNCH_PARAMS", eCPPaymentRequest);
                        LoggingContext loggingContext = q2k.A01;
                        if (loggingContext == null) {
                            str = "loggingContext";
                        } else {
                            A052.putParcelable("logging_context", loggingContext);
                            Object A01 = C06014fk.A0A().A01(A052, "blank_bottom_sheet_fragment");
                            11T.A0I(A01, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.FBPayBottomSheetDialogFragment");
                            K83 k83 = (K83) A01;
                            k83.A09 = "terms_condition_fragment";
                            k83.A01 = A052;
                            Ks7 A0A = C06014fk.A0A();
                            String str2 = k83.A09;
                            Bundle bundle = k83.A01;
                            if (bundle != null) {
                                k83.A07 = A0A.A01(bundle, str2);
                                k83.A0m(A08, "TERMS_CONTENT_FRAGMENT_TAG");
                                return;
                            }
                            str = "fragmentBundle";
                        }
                    }
                }
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            case 1:
                String str3 = rYu.A03;
                if (str3 != null) {
                    JxS jxS = (JxS) this.A01;
                    ETd A0G = C06014fk.A0G();
                    ContextThemeWrapper contextThemeWrapper = jxS.A01;
                    if (contextThemeWrapper != null) {
                        A0G.A01(contextThemeWrapper, str3);
                        return;
                    }
                    str = "viewContext";
                    11T.A0L(str);
                    throw 0Q8.createAndThrow();
                }
                return;
            case 2:
                String str4 = rYu.A03;
                if (str4 != null) {
                    JgT jgT = (JgT) this.A01;
                    ETd A0G2 = C06014fk.A0G();
                    ContextThemeWrapper contextThemeWrapper2 = jgT.A00;
                    if (contextThemeWrapper2 != null) {
                        A0G2.A00(contextThemeWrapper2, str4);
                        return;
                    }
                    str = "viewContext";
                    11T.A0L(str);
                    throw 0Q8.createAndThrow();
                }
                return;
            case 3:
                String str5 = rYu.A03;
                if (str5 == null) {
                    str5 = DKB.A00(417);
                }
                A05 = AbG.A05();
                A03 = C0A2.A03(str5);
                09X.A00().A05().A0A(((Fragment) ((FZB) this.A01).A01).requireActivity(), A05.setData(A03));
                return;
            default:
                String str6 = rYu.A03;
                if (str6 != null) {
                    A05 = AbG.A05();
                    A03 = C0A2.A03(str6);
                    09X.A00().A05().A0A(((Fragment) ((FZB) this.A01).A01).requireActivity(), A05.setData(A03));
                    return;
                }
                return;
        }
    }
}
