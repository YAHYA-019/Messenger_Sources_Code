package X;

import android.R;
import android.content.res.ColorStateList;

/* renamed from: X.Ja6, reason: case insensitive filesystem */
/* loaded from: Ja6.class */
public final class C2815Ja6 extends DRF {
    public static final int[][] A02 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList A00;
    public boolean A01;

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-699965372);
        super/*android.widget.TextView*/.onAttachedToWindow();
        if (this.A01 && getButtonTintList() == null) {
            this.A01 = true;
            ColorStateList colorStateList = this.A00;
            if (colorStateList == null) {
                int A01 = Kwa.A01(this, 2130969144);
                int A012 = Kwa.A01(this, 2130969153);
                int A013 = Kwa.A01(this, 2130969162);
                colorStateList = new ColorStateList(A02, new int[]{6T1.A00(1.0f, A013, A01), 6T1.A00(0.54f, A013, A012), 6T1.A00(0.38f, A013, A012), 6T1.A00(0.38f, A013, A012)});
                this.A00 = colorStateList;
            }
            setButtonTintList(colorStateList);
        }
        0FI.A0C(-1503073769, A06);
    }
}
