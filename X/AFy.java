package X;

import com.facebook.resources.ui.FbFrameLayout;
import java.util.Collections;

/* loaded from: AFy.class */
public final class AFy implements Runnable {
    public static final String __redex_internal_original_name = "EmojiPongFragment$showFireworks$1$2$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ C34s A01;
    public final /* synthetic */ FbFrameLayout A02;

    public AFy(C34s c34s, FbFrameLayout fbFrameLayout, int i) {
        this.A00 = i;
        this.A02 = fbFrameLayout;
        this.A01 = c34s;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A00;
        FbFrameLayout fbFrameLayout = this.A02;
        if (i == fbFrameLayout.getChildCount() - 1) {
            fbFrameLayout.setVisibility(8);
            Collections.shuffle(this.A01.A0r);
        }
    }
}
