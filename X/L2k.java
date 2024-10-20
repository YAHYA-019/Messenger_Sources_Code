package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.facebook.fbui.widget.glyph.GlyphButton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: L2k.class */
public final class L2k {
    public View.OnClickListener A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public View A09;
    public final int A0A;
    public final MLg A0B;
    public final Kqt A0C;
    public final LU3 A0D;
    public final Kqf A0E;
    public final L2h A0F;
    public final ArrayList A0G;
    public final List A0H;
    public final boolean A0I;
    public final boolean A0J;
    public int A00 = -1;
    public int A02 = -1;
    public int A01 = -1;

    public L2k(MLq mLq, MLg mLg, KeL keL, Kqt kqt, LU3 lu3, Kqf kqf, L2h l2h, List list, List list2, List list3, boolean z, boolean z2) {
        int i;
        List list4 = list;
        ArrayList A17 = 1BK.A17(Arrays.asList(2131362493, 2131362494, 2131362495));
        this.A0G = A17;
        this.A0D = lu3;
        this.A0B = mLg;
        this.A0I = z;
        this.A0J = z2;
        int size = list.size();
        int i2 = this.A0I ? 4 : 3;
        List A0s = size <= i2 ? AnonymousClass001.A0s() : list4.subList(i2, list4.size());
        this.A03 = (A0s.isEmpty() || mLq == null || lu3 == null) ? null : new FXh(1, list2, lu3, mLq, list3, keL, A0s);
        if (z) {
            AnonymousClass001.A1J(A17, 2131362496);
            i = 4;
        } else {
            i = 3;
        }
        this.A0A = i;
        int size2 = list4.size();
        int i3 = this.A0A;
        this.A0H = size2 > i3 ? list4.subList(0, i3) : list4;
        this.A0C = kqt;
        this.A0F = l2h;
        this.A0E = kqf;
    }

    public static void A00(View view, L2k l2k, int i) {
        List list = l2k.A0H;
        if (i < 0 || i >= list.size() || i >= l2k.A0A) {
            return;
        }
        MLq mLq = (MLq) list.get(i);
        int A0H = JQy.A0H(l2k.A0G, i);
        boolean isEnabled = mLq.isEnabled();
        GlyphButton glyphButton = (GlyphButton) view.requireViewById(A0H);
        int A01 = LDi.A02(view.getContext()).A01(isEnabled ? 2MR.A1g : 2MR.A0m);
        glyphButton.setEnabled(isEnabled);
        glyphButton.A02(A01);
        glyphButton.invalidate();
    }

    public void A01(View view) {
        List list = this.A0H;
        if (list.isEmpty()) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i;
            int i3 = this.A0A;
            if (i2 >= i3) {
                return;
            }
            if (i2 >= 0 && i2 < list.size() && i2 < i3) {
                Context context = view.getContext();
                MLq mLq = (MLq) list.get(i2);
                ImageView imageView = (ImageView) view.requireViewById(JQy.A0H(this.A0G, i2));
                MLq.A00(context, imageView, mLq);
                GOo.A16(context, imageView, mLq.BD5());
            }
            A00(view, this, i2);
            i = i2 + 1;
        }
    }
}
