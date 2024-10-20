package X;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.facebook.payments.logging.PaymentsFlowStep;
import com.facebook.payments.logging.PaymentsLoggingSessionData;
import com.facebook.payments.model.PaymentItemType;
import com.facebook.resources.ui.FbEditText;
import java.util.ArrayList;

/* loaded from: E17.class */
public final class E17 extends DYd implements 2S0 {
    public static final String __redex_internal_original_name = "BankPickerFragment";
    public Filter A00;
    public DPS A01;
    public PaymentsLoggingSessionData A02;
    public PaymentItemType A03;
    public ArrayList A04;
    public ArrayList A05;
    public ListView A06;
    public FbEditText A07;
    public final FIQ A08 = DKG.A0i();

    public Activity A1P() {
        Activity A1P = super/*X.1pK*/.A1P();
        A1P.getClass();
        return A1P;
    }

    public 1iF A1R() {
        return AbF.A0C(675975893060109L);
    }

    public boolean Bkd() {
        PaymentsLoggingSessionData paymentsLoggingSessionData = this.A02;
        if (paymentsLoggingSessionData == null) {
            return false;
        }
        this.A08.A07(PaymentsFlowStep.A1w, paymentsLoggingSessionData, "payflows_back_click");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Context getContext() {
        Context context = super/*androidx.fragment.app.Fragment*/.getContext();
        context.getClass();
        return context;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-1031366748);
        View A08 = AbG.A08(layoutInflater, viewGroup, 2132541562);
        0FI.A08(1421416283, A02);
        return A08;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.widget.TextView, com.facebook.resources.ui.FbEditText] */
    public void onViewCreated(View view, Bundle bundle) {
        PaymentItemType paymentItemType;
        super/*X.1pK*/.onViewCreated(view, bundle);
        PaymentsLoggingSessionData paymentsLoggingSessionData = this.A02;
        if (paymentsLoggingSessionData != null && (paymentItemType = this.A03) != null) {
            this.A08.A06(bundle, PaymentsFlowStep.A1w, paymentsLoggingSessionData, paymentItemType);
        }
        ?? r0 = (FbEditText) 7zL.A0F(this, 2131362366);
        this.A07 = r0;
        FWn.A00((TextView) r0, this, 3);
        this.A01 = new DPS(getContext(), this);
        ListView listView = (ListView) 7zL.A0F(this, R.id.list);
        this.A06 = listView;
        listView.setAdapter((ListAdapter) this.A01);
        ArrayList arrayList = this.A05;
        if (arrayList != null) {
            this.A01.addAll(arrayList);
        }
        this.A06.setOnItemClickListener(new FYO(this, 3));
    }
}
