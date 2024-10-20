package X;

import android.content.Context;
import android.graphics.Point;
import android.widget.FrameLayout;
import com.facebook.common.draggableview.DraggableViewContainer;
import com.facebook.litho.LithoView;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.6s7, reason: invalid class name */
/* loaded from: 6s7.class */
public final class C6s7 {
    public final /* synthetic */ C6s5 A00;

    public C6s7(C6s5 c6s5) {
        this.A00 = c6s5;
    }

    public void A00(boolean z) {
        C6s5 c6s5 = this.A00;
        int i = C6s5.A0g;
        DraggableViewContainer draggableViewContainer = c6s5.A06;
        if (draggableViewContainer != null) {
            if (z) {
                float Ai7 = (float) 1qI.A02(C6s5.A01(c6s5)).Ai7(37167221051425420L);
                int A00 = C6s5.A00(c6s5);
                if (A00 > 0) {
                    float f = A00;
                    int i2 = (int) (f / Ai7);
                    Context context = c6s5.A0Q;
                    int A02 = 3yG.A02(4YU.A0C(context));
                    int A04 = 3yG.A04(4YU.A0C(context), 2.0f);
                    9W2 r0 = c6s5.A0I;
                    if (r0 != null) {
                        6tZ r02 = (6tZ) 1Br.A0B(r0.A08);
                        ThreadKey threadKey = r0.A01;
                        if (threadKey == null) {
                            throw 1BK.A0h();
                        }
                        LithoView A05 = r02.A05(new A3M(threadKey, r0));
                        c6s5.A08 = A05;
                        A05.setLayoutParams(new FrameLayout.LayoutParams(A00, i2));
                        c6s5.A0c.add(A05);
                    }
                    C9kz c9kz = c6s5.A0K;
                    Integer num = (c9kz == null || !c9kz.A04) ? 0S2.A0C : 0S2.A00;
                    Point point = new Point((int) ((draggableViewContainer.getWidth() / 2.0f) - (f / 2.0f)), (int) (72.0f * 4YU.A0C(context).getDisplayMetrics().density));
                    LithoView lithoView = c6s5.A08;
                    if (lithoView == null) {
                        throw 1BK.A0h();
                    }
                    DraggableViewContainer.A03(point, lithoView, null, draggableViewContainer, num, A00, i2, A02, A04, A02, 3yG.A04(4YU.A0C(context), 56.0f), true);
                }
            } else {
                draggableViewContainer.removeView(c6s5.A08);
            }
        }
        C6s5.A03(c6s5, false);
    }

    public void A01(boolean z) {
        C6s5 c6s5 = this.A00;
        int i = C6s5.A0g;
        DraggableViewContainer draggableViewContainer = c6s5.A06;
        if (draggableViewContainer != null) {
            draggableViewContainer.A0E = z;
            LithoView lithoView = c6s5.A08;
            if (lithoView != null) {
                lithoView.animate().cancel();
                if (!z) {
                    Integer num = 0S2.A0C;
                    draggableViewContainer.A09 = null;
                    DraggableViewContainer.A06(draggableViewContainer, num, true, true);
                    return;
                }
                draggableViewContainer.A09 = new Point((int) ((draggableViewContainer.getWidth() / 2.0f) - (lithoView.getWidth() / 2.0f)), (int) (72.0f * 4YU.A0C(c6s5.A0Q).getDisplayMetrics().density));
                DraggableViewContainer.A06(draggableViewContainer, 0S2.A00, true, true);
                C6s5.A03(c6s5, false);
            }
        }
        if (!z) {
            return;
        }
        C6s5.A03(c6s5, false);
    }
}
