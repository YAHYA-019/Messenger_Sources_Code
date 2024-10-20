package X;

import com.facebook.chatheads.view.bubble.BubbleView;
import com.google.common.util.concurrent.SettableFuture;

/* loaded from: Jvf.class */
public final class Jvf extends C66m {
    public final /* synthetic */ BubbleView A00;

    public Jvf(BubbleView bubbleView) {
        this.A00 = bubbleView;
    }

    @Override // X.C66m, X.C66n
    public void CMP(C66i c66i) {
        BubbleView.A08(this.A00);
    }

    @Override // X.C66m, X.C66n
    public void CMR(C66i c66i) {
        BubbleView bubbleView = this.A00;
        C81q.A00(bubbleView);
        BubbleView.A08(bubbleView);
        SettableFuture settableFuture = bubbleView.A0F;
        if (settableFuture != null) {
            settableFuture.set((Object) null);
            bubbleView.A0F = null;
        }
        if (bubbleView.A0H) {
            BubbleView.A06(bubbleView);
        } else {
            BubbleView.A05(bubbleView);
        }
    }

    @Override // X.C66m, X.C66n
    public void CMV(C66i c66i) {
        BubbleView bubbleView = this.A00;
        C81q.A00(bubbleView);
        BubbleView.A07(bubbleView);
    }
}
