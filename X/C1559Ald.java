package X;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.litho.LithoView;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.quicklog.reliability.CancelReason;
import com.facebook.widget.CustomLinearLayout;

/* renamed from: X.Ald, reason: case insensitive filesystem */
/* loaded from: Ald.class */
public final class C1559Ald extends 1pK implements 1pN {
    public static final String __redex_internal_original_name = "MessageSearchScrimScreenFragment";
    public GestureDetector A00;
    public LithoView A01;
    public LithoView A02;
    public 6Hx A03;
    public ThreadSummary A04;
    public String A05;
    public final DIX A0B = new CsJ(this);
    public final C00i A06 = AbH.A0c(this);
    public final C00i A0A = AbH.A0Q();
    public final C00i A07 = 1BV.A00(84471);
    public final C00i A08 = 1BV.A00(82457);
    public final C00i A09 = 1BQ.A02(83522);
    public final C00i A0C = 1BV.A00(98496);

    public static void A03(C1559Ald c1559Ald) {
        C2T c2t = (C2T) c1559Ald.A09.get();
        AbG.A0r(c2t.A01).flowEndCancel(c2t.A00, CancelReason.USER_CANCELLED);
    }

    public 1iF A1R() {
        return AbF.A0C(949036578942304L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        if (bundle != null) {
            this.A04 = AbF.A0h(bundle, "thread_summary");
            this.A05 = bundle.getString("query");
        } else {
            Bundle bundle2 = this.mArguments;
            if (bundle2 != null) {
                this.A04 = AbF.A0h(bundle2, "thread_summary");
            }
        }
        this.A04.getClass();
        this.A00 = new GestureDetector(getContext(), new C1361Af3(this));
        this.A03 = (6Hx) 7zN.A0m(this, 1BL.A0G(this), 84247);
        ((C2T) this.A09.get()).A00();
        this.A03.A04(this.A04, 0S2.A01, 0S2.A00, (String) null);
    }

    public boolean Bkd() {
        A03(this);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(1749272189);
        CustomLinearLayout customLinearLayout = new CustomLinearLayout(requireContext());
        customLinearLayout.setOrientation(1);
        AbH.A1J(customLinearLayout, -1);
        Context context = customLinearLayout.getContext();
        LithoView lithoView = new LithoView(context, (AttributeSet) null);
        this.A02 = lithoView;
        AbK.A1G(lithoView, customLinearLayout);
        LithoView lithoView2 = new LithoView(context, (AttributeSet) null);
        this.A01 = lithoView2;
        customLinearLayout.addView(lithoView2, new LinearLayout.LayoutParams(-1, -1));
        0FI.A08(-463765714, A02);
        return customLinearLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("thread_summary", this.A04);
        bundle.putString("query", this.A05);
        ((3OQ) this.A0C.get()).A01(getContext(), bundle, "thread_summary");
        super.onSaveInstanceState(bundle);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        LithoView lithoView = this.A02;
        1Iw r0 = lithoView.A09;
        AwX awX = new AwX(r0, new B0g());
        String str = this.A05;
        B0g b0g = awX.A01;
        b0g.A0A = str;
        C00i c00i = this.A06;
        b0g.A06 = AbF.A0p(c00i);
        b0g.A04 = this.A04.A0n;
        awX.A2a(4YU.A0E(r0).getString(2131959875));
        b0g.A00 = AbF.A0p(c00i).B36();
        awX.A2Z(2KE.A0C);
        awX.A2Y(this.A0B);
        b0g.A01 = 268435459;
        awX.A2X(((C1u2) this.A0A.get()).A00());
        b0g.A0E = true;
        b0g.A0C = "search_in_chat_edit_text_tag";
        b0g.A0B = Integer.valueOf(AbF.A0p(c00i).B4h());
        lithoView.A0x(awX.A2W());
        this.A01.setVisibility(0);
        LithoView lithoView2 = this.A01;
        C2k3 A00 = C2k2.A00(lithoView2.A09);
        A00.A2X(AbF.A0p(c00i).Ahs());
        A00.A0c();
        A00.A0b();
        A00.A2N(true);
        lithoView2.A0x(A00.A2V());
        this.A01.setOnTouchListener(new CZL(this, 2));
    }
}
