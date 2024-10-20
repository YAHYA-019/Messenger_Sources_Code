package X;

import android.view.Choreographer;
import com.facebook.ui.choreographer.DefaultChoreographerWrapper_API16;

/* loaded from: Lnl.class */
public final class Lnl implements Runnable {
    public static final String __redex_internal_original_name = "DefaultChoreographerWrapper_API16$1";
    public final /* synthetic */ DefaultChoreographerWrapper_API16 A00;
    public final /* synthetic */ C1pl A01;

    public Lnl(DefaultChoreographerWrapper_API16 defaultChoreographerWrapper_API16, C1pl c1pl) {
        this.A00 = defaultChoreographerWrapper_API16;
        this.A01 = c1pl;
    }

    @Override // java.lang.Runnable
    public void run() {
        DefaultChoreographerWrapper_API16 defaultChoreographerWrapper_API16 = this.A00;
        Choreographer choreographer = defaultChoreographerWrapper_API16.A00;
        if (choreographer == null) {
            choreographer = Choreographer.getInstance();
            defaultChoreographerWrapper_API16.A00 = choreographer;
        }
        choreographer.postFrameCallback(this.A01.A02());
    }
}
