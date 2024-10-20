package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Parcelable;
import android.text.Spannable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.iorg.common.upsell.server.UpsellPromo;
import com.facebook.iorg.common.upsell.server.ZeroRecommendedPromoResult;
import com.facebook.iorg.common.upsell.ui.UpsellDontShowAgainCheckbox;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: Dpk.class */
public final class Dpk extends FAG {
    public ZeroRecommendedPromoResult A00;
    public DQU A01;
    public F7f A02;
    public boolean A03 = false;
    public final Evr A04;
    public final C15h A05;

    public Dpk() {
        Evr A0X = DKG.A0X();
        G7K A01 = G7K.A01(this, 30);
        F7f f7f = (F7f) 1Bn.A0A(98829);
        this.A04 = A0X;
        this.A05 = A01;
        this.A02 = f7f;
    }

    /* JADX WARN: Type inference failed for: r0v277, types: [X.Qxz, java.lang.Object] */
    public View A03(Context context, ViewGroup viewGroup) {
        this.A01 = new DQU(context);
        ZeroRecommendedPromoResult zeroRecommendedPromoResult = ((FAG) this).A01.A02;
        if (zeroRecommendedPromoResult != null) {
            CompoundButton.OnCheckedChangeListener onCheckedChangeListener = null;
            boolean z = false;
            ArrayList A0s = AnonymousClass001.A0s();
            1Du it = zeroRecommendedPromoResult.A01.iterator();
            while (it.hasNext()) {
                UpsellPromo upsellPromo = (UpsellPromo) it.next();
                String str = upsellPromo.A08;
                String str2 = upsellPromo.A03;
                String str3 = upsellPromo.A07;
                ?? obj = new Object();
                ((Qxz) obj).A03 = str;
                ((Qxz) obj).A01 = str2;
                ((Qxz) obj).A02 = str3;
                ((Qxz) obj).A00 = upsellPromo;
                A0s.add(obj);
            }
            if (!ImmutableList.copyOf((Collection) A0s).isEmpty()) {
                String str4 = null;
                String str5 = null;
                String str6 = null;
                FXs fXs = null;
                int i = ((FAG) this).A01.requireArguments().getInt("title_extra_image_resource_id");
                String str7 = zeroRecommendedPromoResult.A03;
                String str8 = zeroRecommendedPromoResult.A08;
                if (1JF.A0B(str8)) {
                    str8 = zeroRecommendedPromoResult.A09;
                }
                String str9 = zeroRecommendedPromoResult.A06;
                if (!1JF.A0B(str9)) {
                    str4 = str9;
                }
                if (1BL.A1a(this.A05)) {
                    str6 = ((FAG) this).A01.getString(2131967761);
                    fXs = FXs.A00(EM6.A0B, this, 13);
                } else {
                    str5 = zeroRecommendedPromoResult.A0A;
                    if (zeroRecommendedPromoResult.A0C) {
                        str6 = ((FAG) this).A01.getString(2131958477);
                        fXs = FAG.A00(this);
                    }
                    2BQ r0 = this.A02.A00;
                    if (r0.A05("upsell_dont_warn_again")) {
                        onCheckedChangeListener = new FYT(this, 0);
                        z = r0.A05("upsell_dont_warn_again_checkbox_checked");
                    }
                }
                DQU.A00((Spannable) null, (View.OnClickListener) null, fXs, (View.OnClickListener) null, (CompoundButton.OnCheckedChangeListener) null, this.A01, (String) null, (String) null, (String) null, (String) null, str4, str5, (String) null, str6, (String) null, str8, str7, 0, i, false, true, false);
                Q1F q1f = new Q1F(((FAG) this).A01.getContext());
                View.OnClickListener A02 = FXr.A02(this, 53);
                q1f.A00 = A02;
                List list = q1f.A01;
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).setOnClickListener(A02);
                }
                list.clear();
                q1f.removeAllViews();
                1Du A0g = DKD.A0g(A0s);
                RelativeLayout relativeLayout = null;
                while (A0g.hasNext()) {
                    Qxz qxz = (Qxz) A0g.next();
                    if (!1JF.A0B("")) {
                        Context context2 = q1f.getContext();
                        TextView textView = new TextView(context2);
                        textView.setText("");
                        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, C0A8.A00(context2, 48.0f)));
                        int dimensionPixelSize = q1f.getResources().getDimensionPixelSize(2132279320);
                        textView.setPadding(dimensionPixelSize, 0, dimensionPixelSize, C0A8.A00(context2, 4.0f));
                        textView.setTypeface(Typeface.DEFAULT_BOLD);
                        DKF.A11(context2, textView, 2132214372);
                        textView.setGravity(80);
                        q1f.addView(textView);
                    }
                    q1f.addView(Q1F.A00(q1f));
                    relativeLayout = new RelativeLayout(q1f.getContext());
                    View inflate = DKD.A0A(relativeLayout).inflate(2132543535, relativeLayout);
                    ((EAT) relativeLayout).A03 = AbF.A06(inflate, 2131368167);
                    ((EAT) relativeLayout).A01 = AbF.A06(inflate, 2131362597);
                    ((EAT) relativeLayout).A02 = AbF.A06(inflate, 2131366992);
                    ((EAT) relativeLayout).A00 = (ImageButton) inflate.findViewById(2131366978);
                    Resources resources = relativeLayout.getResources();
                    relativeLayout.setPadding(0, resources.getDimensionPixelSize(2131165285), 0, resources.getDimensionPixelSize(2131165285));
                    relativeLayout.setVisibility(8);
                    String str10 = qxz.A03;
                    if (!1JF.A0B(str10)) {
                        ((EAT) relativeLayout).A03.setText(str10);
                        ((EAT) relativeLayout).A03.setContentDescription(str10);
                        ((EAT) relativeLayout).A03.setVisibility(0);
                    }
                    String str11 = qxz.A01;
                    if (!1JF.A0B(str11)) {
                        ((EAT) relativeLayout).A01.setText(str11);
                        ((EAT) relativeLayout).A01.setContentDescription(str11);
                        ((EAT) relativeLayout).A01.setVisibility(0);
                    }
                    TextView textView2 = ((EAT) relativeLayout).A02;
                    Parcelable parcelable = qxz.A00;
                    textView2.setTag(parcelable);
                    ((EAT) relativeLayout).A00.setTag(parcelable);
                    TextView textView3 = ((EAT) relativeLayout).A02;
                    String str12 = qxz.A02;
                    textView3.setText(str12);
                    ((EAT) relativeLayout).A02.setContentDescription(str12);
                    ((EAT) relativeLayout).A02.setVisibility(0);
                    relativeLayout.setVisibility(0);
                    View.OnClickListener onClickListener = q1f.A00;
                    ((EAT) relativeLayout).A02.setOnClickListener(onClickListener);
                    ((EAT) relativeLayout).A00.setOnClickListener(onClickListener);
                    list.add(relativeLayout);
                    q1f.addView(relativeLayout);
                }
                if (relativeLayout != null) {
                    if (onCheckedChangeListener != null) {
                        Resources resources2 = q1f.getResources();
                        relativeLayout.setPadding(0, resources2.getDimensionPixelSize(2131165285), 0, resources2.getDimensionPixelSize(2132279305));
                        UpsellDontShowAgainCheckbox upsellDontShowAgainCheckbox = new UpsellDontShowAgainCheckbox(q1f.getContext());
                        upsellDontShowAgainCheckbox.A00.setOnCheckedChangeListener(onCheckedChangeListener);
                        upsellDontShowAgainCheckbox.A00.setChecked(z);
                        q1f.addView(upsellDontShowAgainCheckbox);
                    }
                    q1f.addView(Q1F.A00(q1f));
                }
                q1f.setVisibility(0);
                this.A01.A00.addView(q1f);
                this.A00 = zeroRecommendedPromoResult;
            }
        }
        return this.A01;
    }
}
