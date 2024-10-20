package X;

import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.Jho, reason: case insensitive filesystem */
/* loaded from: Jho.class */
public final class C3055Jho extends 2Xd {
    public final K87 A00;

    public C3055Jho(K87 k87) {
        this.A00 = k87;
    }

    public /* bridge */ /* synthetic */ void BlZ(C2lb c2lb, int i) {
        K87 k87 = this.A00;
        int i2 = k87.A04.A05.A04 + i;
        TextView textView = ((C3067Ji5) c2lb).A00;
        String string = textView.getContext().getString(2131961871);
        Locale locale = Locale.getDefault();
        Integer valueOf = Integer.valueOf(i2);
        textView.setText(String.format(locale, "%d", valueOf));
        textView.setContentDescription(String.format(string, valueOf));
        Km4 km4 = k87.A05;
        Calendar A01 = LBq.A01();
        L2U l2u = A01.get(1) == i2 ? km4.A06 : km4.A07;
        Iterator it = k87.A06.B9f().iterator();
        while (it.hasNext()) {
            A01.setTimeInMillis(JR0.A0X(it));
            if (A01.get(1) == i2) {
                l2u = km4.A04;
            }
        }
        l2u.A01(textView);
        textView.setOnClickListener(new LKE(i2, 2, this));
    }

    public /* bridge */ /* synthetic */ C2lb Bs3(ViewGroup viewGroup, int i) {
        return new C3067Ji5((TextView) AbG.A08(DKD.A0A(viewGroup), viewGroup, 2132542786));
    }

    public int getItemCount() {
        return this.A00.A04.A02;
    }
}
