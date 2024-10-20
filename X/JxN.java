package X;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.logging.LoggingContext;

/* loaded from: JxN.class */
public final class JxN extends JgV {
    public static final String __redex_internal_original_name = "ECPSeeItemDetailsFragment";
    public C3030Jgt A00;
    public LoggingContext A01;
    public ContextThemeWrapper A02;
    public ECPPaymentRequest A03;
    public final C01i A05 = GAW.A00(this, 10);
    public final java.util.Map A04 = 02J.A01(LAF.A00(KOy.A08, false));
    public final Observer A06 = LR9.A01(this, 49);

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        String str;
        int A02 = 0FI.A02(1614821285);
        super/*androidx.fragment.app.Fragment*/.onCreate(bundle);
        this.A01 = (LoggingContext) JR1.A0X(this);
        ECPPaymentRequest A022 = JgV.A02(this);
        this.A03 = A022;
        LoggingContext loggingContext = this.A01;
        if (loggingContext == null) {
            str = "loggingContext";
        } else {
            if (A022 != null) {
                this.A00 = RVv.A00(this, A022, loggingContext);
                0FI.A08(-1867836128, A02);
                return;
            }
            str = "ecpPaymentRequest";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-730699084);
        ContextThemeWrapper A01 = JgV.A01(this, layoutInflater);
        this.A02 = A01;
        View inflate = layoutInflater.cloneInContext(A01).inflate(2132541903, viewGroup, false);
        0FI.A08(746017516, A02);
        return inflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        Ri6.A02(this);
        RecyclerView recyclerView = (RecyclerView) DKG.A0B(view, 2131366867);
        recyclerView.A1D(new LinearLayoutManager(requireActivity(), 1, false));
        recyclerView.A1A(null);
        recyclerView.A16((2Xd) this.A05.getValue());
        LAF A0V = JQz.A0V(KOy.A08, this.A04);
        if (A0V != null) {
            GAW gaw = new GAW(this, 11);
            if (!A0V.A01) {
                A0V.A01 = true;
                gaw.invoke();
            }
        }
        C3030Jgt c3030Jgt = this.A00;
        if (c3030Jgt == null) {
            11T.A0L("ecpViewModel");
            throw 0Q8.createAndThrow();
        }
        if (c3030Jgt.A01 != null) {
            throw AnonymousClass001.A0Q("transactionInfo");
        }
    }
}
