package X;

import com.facebook.litho.LithoView;
import com.facebook.ui.emoji.model.Emoji;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.List;

/* loaded from: A8p.class */
public final class A8p implements AYp {
    public final /* synthetic */ C9lz A00;

    public A8p(C9lz c9lz) {
        this.A00 = c9lz;
    }

    @Override // X.AYp
    public void Bvo(Emoji emoji) {
        11T.A0F(emoji, 0);
        C9lz c9lz = this.A00;
        BottomSheetBehavior bottomSheetBehavior = c9lz.A05;
        if (bottomSheetBehavior == null || bottomSheetBehavior.A0G != 2) {
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.A0B(4);
            }
            if (!c9lz.A09) {
                c9lz.A0H.Bvo(emoji);
                c9lz.A0F.A00(emoji);
                BottomSheetBehavior bottomSheetBehavior2 = c9lz.A05;
                if (bottomSheetBehavior2 != null) {
                    bottomSheetBehavior2.A0B(5);
                    return;
                }
                return;
            }
            LithoView lithoView = c9lz.A02;
            if (lithoView != null) {
                c9lz.A03(lithoView, "");
            }
            String A07 = emoji.A07();
            11T.A0A(A07);
            if (c9lz.A00 < c9lz.A06.size()) {
                int i = 0;
                int size = c9lz.A06.size();
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    if (A07.equals(c9lz.A06.get(i))) {
                        List list = c9lz.A06;
                        list.set(i, list.get(c9lz.A00));
                        break;
                    }
                    i++;
                }
                c9lz.A06.set(c9lz.A00, A07);
                C9lz.A02(c9lz);
            }
            c9lz.A0K.add(emoji);
            BottomSheetBehavior bottomSheetBehavior3 = c9lz.A05;
            if (bottomSheetBehavior3 != null) {
                bottomSheetBehavior3.A0B(4);
            }
        }
    }
}
