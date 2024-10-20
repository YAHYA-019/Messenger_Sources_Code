package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.msys.thread.aibot.footer.view.AiBotDisclosureView;
import com.mapbox.mapboxsdk.R;
import kotlin.jvm.functions.Function1;

/* renamed from: X.8uT, reason: invalid class name */
/* loaded from: 8uT.class */
public final class C8uT extends 8Cf {
    public Function1 A00;
    public TextWatcher A01;
    public final C01i A02;
    public final C01i A03;
    public final C01i A04;
    public final C01i A05;
    public final C01i A06;
    public final C01i A07;
    public final C01i A08;
    public final C01i A09;
    public final C01i A0A;

    public C8uT(Context context) {
        super(context);
        C03i c03i = C03i.A02;
        this.A09 = AQa.A00(this, c03i, 14);
        this.A0A = AQa.A00(this, c03i, 15);
        this.A04 = AQa.A00(this, c03i, 9);
        this.A02 = AQa.A00(this, c03i, 7);
        this.A08 = AQa.A00(this, c03i, 13);
        this.A05 = AQa.A00(this, c03i, 10);
        this.A03 = AQa.A00(this, c03i, 8);
        this.A07 = AQa.A00(context, c03i, 12);
        this.A06 = AQa.A00(context, c03i, 11);
        this.A00 = ASr.A00;
    }

    public void A0H() {
        super.A0H();
        TextWatcher textWatcher = this.A01;
        if (textWatcher != null) {
            ((TextView) 7zM.A1B(this.A03)).removeTextChangedListener(textWatcher);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0L(6Nq r302, C1u2 c1u2, C06074fs c06074fs, Aaf aaf, float f, long j, boolean z, boolean z2, boolean z3) {
        1BK.A1M(r302, c06074fs);
        super.A0J(r302, c06074fs, aaf, f, 2, j, false, z, z2);
        2OB r0 = ((AiBotDisclosureView) 7zM.A1B(this.A04)).A00;
        Integer num = 0S2.A1G;
        Integer num2 = 0S2.A0d;
        C9dn.A01(r0, num, num2);
        C9dn.A01((TextView) 7zM.A1B(this.A09), 0S2.A0Y, num2);
        if (!z3) {
            C01i c01i = this.A0A;
            ((View) 7zM.A1B(c01i)).setBackground(C2cn.A00(getResources().getDimension(R.dimen.mapbox_eight_dp), 1BL.A07(this.A07), C9dn.A00(4YU.A08(this), 0S2.A0F)));
            C9dn.A01((TextView) 7zM.A1B(c01i), 0S2.A0j, 0S2.A0k);
            ((View) 7zM.A1B(this.A02)).setVisibility(8);
            ((View) 7zM.A1B(c01i)).setVisibility(0);
            C9py.A04((View) 7zM.A1B(c01i), this, ActionId.APPLY_OPTIMISTICS);
            return;
        }
        ((View) 7zM.A1B(this.A02)).setVisibility(0);
        ((View) 7zM.A1B(this.A0A)).setVisibility(8);
        GradientDrawable gradientDrawable = new GradientDrawable();
        Context A08 = 4YU.A08(this);
        gradientDrawable.setColor(C9dn.A00(A08, 0S2.A0C));
        gradientDrawable.setCornerRadius(A08.getResources().getDimension(2132279314));
        C01i c01i2 = this.A03;
        ((View) 7zM.A1B(c01i2)).setBackground(gradientDrawable);
        TextView textView = (TextView) 7zM.A1B(c01i2);
        9pI r02 = new 9pI(this, 3);
        textView.addTextChangedListener(r02);
        this.A01 = r02;
        if (c1u2 != null) {
            ImageView imageView = (ImageView) 7zM.A1B(this.A05);
            3vO r03 = AbstractC02503vN.A00;
            C1u3 c1u3 = C1u3.A3S;
            C1u4 c1u4 = C1u4.SIZE_32;
            imageView.setImageResource(r03.A01(c1u3, c1u4));
            C01i c01i3 = this.A08;
            ((ImageView) 7zM.A1B(c01i3)).setImageResource(c1u2.A04(C1u3.A5k, c1u4));
            C9py.A04((View) 7zM.A1B(c01i3), this, ActionId.POPULATE_CONSISTENCY_MEMORY_CACHE);
            ((ImageView) 7zM.A1B(c01i3)).setColorFilter(1BL.A07(this.A06));
            ((View) 7zM.A1B(c01i3)).setEnabled(false);
        }
    }

    public final void A0M(CharSequence charSequence) {
        C01i c01i = this.A04;
        ((AiBotDisclosureView) 7zM.A1B(c01i)).A00(charSequence);
        View view = (View) 7zM.A1B(c01i);
        int i = 0;
        if (charSequence == null || 0CU.A0O(charSequence)) {
            i = 8;
        }
        view.setVisibility(i);
    }
}
