package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.acra.constants.ActionId;
import com.facebook.payments.ui.titlebar.PaymentsTitleBarViewStub;
import com.facebook.payments.ui.titlebar.model.PaymentsTitleBarTitleStyle;
import com.facebook.widget.text.BetterTextView;

/* loaded from: Foh.class */
public final class Foh implements GJZ {
    public Toolbar A00;
    public C2137Deq A01;
    public F8H A02;
    public RGy A03;
    public BetterTextView A04;
    public GL6 A05;
    public final Context A06;
    public final C00i A07;

    public Foh(Context context) {
        this.A07 = 7zL.A0R(context, 442);
        this.A06 = context;
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [com.facebook.widget.text.BetterTextView, android.view.View] */
    public void A00(F8H f8h, PaymentsTitleBarTitleStyle paymentsTitleBarTitleStyle, String str, int i) {
        Integer num;
        int ordinal = paymentsTitleBarTitleStyle.ordinal();
        if (ordinal == 0) {
            this.A05.CvV(str);
        } else if (ordinal == 1) {
            TextView A0F = DKF.A0F(this.A00, 2131368123);
            A0F.setText(str);
            A0F.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
            C2cd.A02(A0F);
            C0Ad.A0H(A0F, true);
            2KU.A02(A0F.getTypeface(), A0F, 0S2.A00, 0S2.A0N);
            FIR.A03(A0F, DKC.A0V(this.A07).A13(this.A06));
            A0F.setTextSize(0, r0.getResources().getDimensionPixelOffset(2132279320));
        } else {
            if (ordinal != 2) {
                throw AnonymousClass002.A0C(paymentsTitleBarTitleStyle, "Invalid titleBarTitleStyle provided: ", AnonymousClass001.A0k());
            }
            if (i > 0) {
                ImageView imageView = (ImageView) this.A00.requireViewById(2131368080);
                imageView.setImageResource(i);
                imageView.setVisibility(0);
            }
            TextView A0F2 = DKF.A0F(this.A00, 2131368123);
            A0F2.setText(str);
            C0Ad.A0H(A0F2, true);
            JXy layoutParams = A0F2.getLayoutParams();
            layoutParams.A00 = 16;
            A0F2.setLayoutParams(layoutParams);
            2KU.A02(A0F2.getTypeface(), A0F2, 0S2.A00, 0S2.A0C);
            AbR A0V = DKC.A0V(this.A07);
            Context context = this.A06;
            FIR.A02(A0F2, A0V.A13(context));
            PaymentsTitleBarViewStub paymentsTitleBarViewStub = this.A03.A00;
            ViewGroup.LayoutParams layoutParams2 = paymentsTitleBarViewStub.getLayoutParams();
            layoutParams2.height = paymentsTitleBarViewStub.getResources().getDimensionPixelSize(2132279345);
            paymentsTitleBarViewStub.setLayoutParams(layoutParams2);
            this.A00.setPadding(context.getResources().getDimensionPixelSize(2132279310), 0, DKG.A01(context, 2132279310), 0);
            this.A00.setMinimumHeight(DKG.A01(context, 2132279345));
        }
        if (f8h != null) {
            this.A02 = f8h;
            f8h.A02.add(this);
            Toolbar toolbar = this.A00;
            if (toolbar != null) {
                ?? r0 = (BetterTextView) toolbar.requireViewById(2131363410);
                this.A04 = r0;
                ViewGroup.MarginLayoutParams A0I = DKC.A0I((View) r0);
                Context context2 = this.A06;
                A0I.setMarginEnd(7zN.A01(context2.getResources()));
                if (this.A02.A00 == EMD.A03) {
                    num = 0S2.A0N;
                    this.A04.setTextAppearance(context2, 2132608108);
                    this.A04.setCompoundDrawablesWithIntrinsicBounds(C1uu.A03.A02(context2.getResources(), 2132345476, 5YG.A00(context2, 2MR.A28)), null, null, null);
                    this.A04.setCompoundDrawablePadding(DKC.A04(context2.getResources()));
                } else {
                    2MR r02 = 2MR.A1d;
                    2Mg r03 = 2Me.A02;
                    int A03 = r03.A03(context2, r02);
                    GradientDrawable A0G = 7zO.A0G(0);
                    A0G.setColor(A03);
                    TypedValue typedValue = new TypedValue();
                    context2.getResources().getValue(2132279638, typedValue, true);
                    A0G.setCornerRadius(typedValue.getFloat());
                    this.A04.setBackgroundResource(2132410803);
                    this.A04.setBackground(A0G);
                    DKF.A14(context2, this.A04, 2MR.A0H, r03);
                    this.A04.setTextSize(0, 7zL.A01(context2.getResources(), 2132279323));
                    num = 0S2.A00;
                }
                int dimensionPixelSize = context2.getResources().getDimensionPixelSize(2132279313);
                int A04 = DKC.A04(context2.getResources());
                this.A04.setPadding(dimensionPixelSize, A04, dimensionPixelSize, A04);
                this.A04.setTypeface(2KU.A01(context2, num));
                FXq.A01(this.A04, this, ActionId.ACTION_BAR_COMPLETE);
            }
        }
    }

    public void Byq() {
    }

    public void CN0() {
        this.A04.setVisibility(0);
    }

    public void CSl(CharSequence charSequence) {
        2OB r0 = this.A04;
        if (r0 != null) {
            r0.setText(charSequence);
        }
    }
}
