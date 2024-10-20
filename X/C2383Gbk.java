package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.resources.ui.FbEditText;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Gbk, reason: case insensitive filesystem */
/* loaded from: Gbk.class */
public final class C2383Gbk extends 1pK {
    public static final String __redex_internal_original_name = "EndedCallSurveyFeedbackFragment";
    public int A00;
    public LayoutInflater A01;
    public View A02;
    public View A03;
    public View A04;
    public HVH A05;
    public FbEditText A06;
    public JMS A07;
    public String A08;
    public String A09;
    public String A0A;
    public boolean A0B;
    public final 1Br A0C = 1HG.A01(this, 100189);
    public final 1Br A0E = 1BK.A0C();
    public final 1Br A0D = 7zM.A0U();
    public final List A0F = AnonymousClass001.A0s();
    public final List A0I = AnonymousClass001.A0s();
    public final List A0G = AnonymousClass001.A0s();
    public final List A0H = AnonymousClass001.A0s();

    public static final View A03(C2383Gbk c2383Gbk, String str, String str2, boolean z) {
        LayoutInflater layoutInflater = c2383Gbk.A01;
        if (layoutInflater == null) {
            11T.A0L("layoutInflater");
            throw 0Q8.createAndThrow();
        }
        View inflate = layoutInflater.inflate(2132542846, (ViewGroup) null);
        11T.A0A(inflate);
        ((TextView) 7zM.A0H(inflate, 2131366139)).setText(str);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(10, 0, 10, 0);
        inflate.setLayoutParams(layoutParams);
        inflate.setOnClickListener(new IKD(inflate, c2383Gbk, str2, GOp.A02(z ? 1 : 0)));
        return inflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A06(C2383Gbk c2383Gbk) {
        TextView A06;
        View view = c2383Gbk.A04;
        if (view == null || (A06 = AbF.A06(view, 2131362572)) == null) {
            return;
        }
        A06.setClickable(true);
        A06.setTextColor(7zM.A02(c2383Gbk.requireContext(), 2MR.A1Z));
        A06.setBackgroundResource(2132411498);
        IKB.A00(A06, c2383Gbk, 4);
    }

    public 1iF A1R() {
        return GOq.A0U();
    }

    public void onAttach(Context context) {
        11T.A0F(context, 0);
        super.onAttach(context);
        this.A07 = HKy.A00(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ImageView A0I;
        int A02 = 0FI.A02(843188580);
        11T.A0F(layoutInflater, 0);
        this.A01 = layoutInflater;
        this.A04 = layoutInflater.inflate(2132542056, viewGroup, false);
        Drawable A08 = 7zP.A0S(this.A0D).A08(C1u3.A1w, -16777216);
        View view = this.A04;
        View view2 = null;
        if (view != null && (A0I = GOn.A0I(view, 2131363057)) != null) {
            A0I.setImageDrawable(A08);
            IKB.A00(A0I, this, 3);
        }
        View view3 = this.A04;
        if (view3 != null) {
            view2 = view3.findViewById(2131366140);
        }
        11T.A0I(view2, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup2 = (ViewGroup) view2;
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(A03(this, 7zN.A0s(this, 2131965294), "audio_issue", true));
        if (this.A0B) {
            A0s.add(A03(this, 7zN.A0s(this, 2131965320), "video_issue", true));
        }
        if (this.A0B && 1Br.A07(this.A0E).AZk(36324810459992152L)) {
            Collections.shuffle(A0s);
        }
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            View view4 = (View) it.next();
            if (viewGroup2 != null) {
                viewGroup2.addView(view4);
            }
        }
        if (viewGroup2 != null) {
            viewGroup2.addView(A03(this, 7zN.A0s(this, 2131965312), "other_issue", true));
        }
        View view5 = this.A04;
        0FI.A08(-1719230110, A02);
        return view5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroyView() {
        int A02 = 0FI.A02(997731470);
        this.A02 = null;
        this.A04 = null;
        this.A03 = null;
        this.A06 = null;
        super/*androidx.fragment.app.Fragment*/.onDestroyView();
        0FI.A08(1908448450, A02);
    }
}
