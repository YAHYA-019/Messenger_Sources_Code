package X;

import android.content.Context;
import com.facebook.threadview.ThreadViewVideoStateButton;

/* renamed from: X.6e1, reason: invalid class name */
/* loaded from: 6e1.class */
public final class C6e1 extends C6d6 {
    public int A00;
    public boolean A01;
    public boolean A02;
    public final ThreadViewVideoStateButton A03;

    /* JADX WARN: Multi-variable type inference failed */
    public C6e1(Context context) {
        super(context, null, 0);
        A0C(2132542924);
        A0h(new 82P(this, 1), new 82P(this, 2));
        this.A03 = (ThreadViewVideoStateButton) C09s.A01(this, 2131366171);
        this.A00 = 0;
    }

    public static void A00(C6e1 c6e1) {
        6Tu r0;
        6UR B3e;
        if (c6e1.A02 || c6e1.A01 || ((r0 = c6e1.A08) != null && (c6e1.A00 == 8 || (B3e = r0.B3e()) == 6UR.A07 || B3e == 6UR.A02))) {
            c6e1.A03.setVisibility(8);
        } else {
            c6e1.A03.setVisibility(0);
        }
    }

    public void setVisibility(int i) {
        this.A00 = i;
        A00(this);
    }
}
