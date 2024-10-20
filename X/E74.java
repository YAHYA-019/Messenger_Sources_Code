package X;

import com.facebook.fig.deprecated.button.FigToggleButton;
import com.facebook.widget.text.BetterTextView;
import java.text.NumberFormat;

/* loaded from: E74.class */
public final class E74 extends EBe {
    public int A00;
    public int A01;
    public int A02;
    public FigToggleButton A03;
    public FigToggleButton A04;
    public Ef4 A05;
    public BetterTextView A06;
    public NumberFormat A07;

    public static void A00(E74 e74) {
        e74.A06.setText(e74.A07.format(e74.A00));
        boolean z = true;
        e74.A03.setChecked(4YV.A1X(e74.A00, e74.A02));
        FigToggleButton figToggleButton = e74.A04;
        if (e74.A00 >= e74.A01) {
            z = false;
        }
        figToggleButton.setChecked(z);
        Ef4 ef4 = e74.A05;
        if (ef4 != null) {
            ef4.A00.A04.putExtra("extra_quantity", e74.A00);
        }
    }
}
