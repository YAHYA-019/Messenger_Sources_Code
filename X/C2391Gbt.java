package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.litho.LithoView;
import com.facebook.messaging.montage.util.customimage.MontageCustomImageUtil;
import java.util.List;

/* renamed from: X.Gbt, reason: case insensitive filesystem */
/* loaded from: Gbt.class */
public final class C2391Gbt extends 1pK implements JOH {
    public static final String __redex_internal_original_name = "CanvasBaseCustomImageFragment";
    public LithoView A00;
    public I9K A01;
    public MontageCustomImageUtil A02;
    public final 1Br A03 = 1Bq.A00(66351);

    /* JADX WARN: Multi-variable type inference failed */
    public final void A1X() {
        C2630Gjf c2630Gjf;
        Integer valueOf;
        LithoView lithoView;
        Context context = getContext();
        if (C1ub.A03() && context != null) {
            2aK.A03((Integer) null, (0DE) null, new AJj(this, context, (0DR) null, 47, 42), 2Zy.A00(getViewLifecycleOwner(), 2Zo.A04(true)), 3);
            return;
        }
        MontageCustomImageUtil montageCustomImageUtil = this.A02;
        if (montageCustomImageUtil == null) {
            11T.A0L("montageCustomImageUtil");
            throw 0Q8.createAndThrow();
        }
        List list = montageCustomImageUtil.A02;
        if (list == null || (c2630Gjf = (C2630Gjf) list.get(montageCustomImageUtil.A00)) == null || (valueOf = Integer.valueOf(c2630Gjf.A00)) == null || (lithoView = this.A00) == null) {
            return;
        }
        lithoView.A0y(new 8fX(ImageView.ScaleType.CENTER_CROP, valueOf, (String) null));
    }

    public C6x7 AbZ() {
        return C6x7.A03;
    }

    public C6x1 Aba() {
        return C6x1.A03;
    }

    public boolean Bkd() {
        return false;
    }

    public void Bn9() {
        I9K i9k = this.A01;
        if (i9k != null) {
            IQ1 iq1 = i9k.A00;
            CallerContext callerContext = IQ1.A1m;
            JOH A03 = iq1.A1P.A03();
            ((MontageCustomImageUtil) iq1.A0q.get()).A00 = 0;
            if (A03 instanceof C2391Gbt) {
                ((C2391Gbt) A03).A1X();
            }
            iq1.A1Q.CzY();
            iq1.A1C.A0Q();
        }
    }

    public void BqH(H9e h9e) {
    }

    public void BqI(boolean z) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A04 = 7zQ.A04(layoutInflater, 152492033);
        super/*androidx.fragment.app.Fragment*/.onCreateView(layoutInflater, viewGroup, bundle);
        this.A02 = (MontageCustomImageUtil) 1Lm.A06(((1Fv) 1Br.A0B(this.A03)).A06(this), 68409);
        this.A00 = AbK.A0O(this);
        A1X();
        LithoView lithoView = this.A00;
        0FI.A08(-1009582697, A04);
        return lithoView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroyView() {
        int A02 = 0FI.A02(-657165461);
        super/*androidx.fragment.app.Fragment*/.onDestroyView();
        this.A00 = null;
        0FI.A08(1579692519, A02);
    }

    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        LithoView lithoView = this.A00;
        if (lithoView != null) {
            IKN.A00(lithoView, this, 5);
        }
    }
}
