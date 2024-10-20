package X;

import com.facebook.chatheads.view.bubble.BubbleView;

/* loaded from: Lkc.class */
public final class Lkc implements Runnable {
    public static final String __redex_internal_original_name = "BubbleView$4";
    public final /* synthetic */ BubbleView A00;

    public Lkc(BubbleView bubbleView) {
        this.A00 = bubbleView;
    }

    @Override // java.lang.Runnable
    public void run() {
        1Du A0g = DKD.A0g(this.A00.A0M.values());
        while (A0g.hasNext()) {
            A0g.next();
        }
    }
}
