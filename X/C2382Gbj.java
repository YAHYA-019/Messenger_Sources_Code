package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.messaging.rtc.incall.impl.widgets.EndedCallButtonsView;

/* renamed from: X.Gbj, reason: case insensitive filesystem */
/* loaded from: Gbj.class */
public final class C2382Gbj extends 1pK {
    public static final String __redex_internal_original_name = "EndedCallFragment";
    public HVb A00;
    public GSP A01;
    public IEA A02;
    public final 1CO A03 = GOp.A0j();
    public final C01i A04 = J9s.A00(this, C03i.A02, 30);

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutInflater A17() {
        return AbstractC2326GOr.A0C(this, this.A03);
    }

    public 1iF A1R() {
        return GOq.A0U();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        this.A02 = (IEA) 7zN.A0n(this, 1BM.A01(this), 115612);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Context getContext() {
        if (!7zQ.A1a(this.A04)) {
            return super/*androidx.fragment.app.Fragment*/.getContext();
        }
        GSP gsp = this.A01;
        if (gsp == null) {
            Context context = super/*androidx.fragment.app.Fragment*/.getContext();
            if (context != null) {
                String string = requireArguments().getString("local_call_id");
                if (string == null) {
                    throw 1BK.A0h();
                }
                gsp = GSP.A00(context, this.A03, string);
            } else {
                gsp = null;
            }
            this.A01 = gsp;
        }
        return gsp;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(883608043);
        11T.A0F(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2132542454, viewGroup, false);
        0FI.A08(1924763815, A02);
        return inflate;
    }

    public void onDetach() {
        int A02 = 0FI.A02(1550056348);
        this.A01 = null;
        super.onDetach();
        0FI.A08(248222049, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(2122759153);
        super/*androidx.fragment.app.Fragment*/.onResume();
        IEA iea = this.A02;
        if (iea == null) {
            IllegalStateException A0h = 1BK.A0h();
            0FI.A08(1494087219, A02);
            throw A0h;
        }
        IEA.A04(iea, 16252964, (short) 2);
        IEA.A04(iea, 51592696, (short) 2);
        0FI.A08(-1143832263, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        ((EndedCallButtonsView) 7zL.A0F(this, 2131363911)).A00 = new HVG(this);
    }
}
