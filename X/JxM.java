package X;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.logging.LoggingContext;

/* loaded from: JxM.class */
public final class JxM extends JgV {
    public static final String __redex_internal_original_name = "ECPNuxLearnMoreFragment";
    public ECPPaymentRequest A00;
    public C3030Jgt A01;
    public LoggingContext A02;
    public ContextThemeWrapper A03;

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        String str;
        int A02 = 0FI.A02(-1671690960);
        super/*androidx.fragment.app.Fragment*/.onCreate(bundle);
        this.A02 = (LoggingContext) JR1.A0X(this);
        this.A00 = JgV.A02(this);
        LoggingContext loggingContext = this.A02;
        if (loggingContext != null) {
            this.A01 = RVv.A00(this, (ECPPaymentRequest) null, loggingContext);
            LZv A0b = 7zU.A0b();
            LoggingContext loggingContext2 = this.A02;
            if (loggingContext2 != null) {
                C3030Jgt c3030Jgt = this.A01;
                if (c3030Jgt == null) {
                    str = "ecpNuxViewModel";
                    11T.A0L(str);
                    throw 0Q8.createAndThrow();
                }
                LZv.A02(AbF.A08(1BK.A08(A0b.A00, "client_load_ecpbranding_success"), 61), loggingContext2, DKH.A0t(c3030Jgt.A0S), "ecp_branding_banner_learn_more_detail", 31);
                0FI.A08(20044657, A02);
                return;
            }
        }
        str = "loggingContext";
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(346895413);
        ContextThemeWrapper A01 = JgV.A01(this, layoutInflater);
        this.A03 = A01;
        View inflate = layoutInflater.cloneInContext(A01).inflate(2131558405, viewGroup, false);
        0FI.A08(246790472, A02);
        return inflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        if (getActivity() != null) {
            C06014fk.A04().A03(4YU.A08(view.requireViewById(2131366322)), 39, 33);
        } else {
            Ri6.A08(this, false);
            Ri6.A02(this);
            ECPPaymentRequest eCPPaymentRequest = this.A00;
            if (eCPPaymentRequest != null) {
                if (LD1.A04(eCPPaymentRequest)) {
                    Object obj = this.mParentFragment;
                    11T.A0I(obj, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.FBPayBottomSheetDialogFragment");
                    ((K83) obj).A0r();
                    return;
                }
                return;
            }
            11T.A0L("ecpPaymentRequest");
        }
        throw 0Q8.createAndThrow();
    }
}
