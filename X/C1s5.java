package X;

import android.os.Looper;
import android.view.Choreographer;
import com.facebook.litho.ComponentTree;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1s5, reason: invalid class name */
/* loaded from: 1s5.class */
public final class C1s5 {
    public final /* synthetic */ ComponentTree A05;
    public final AtomicReference A04 = new AtomicReference();
    public final AtomicInteger A02 = new AtomicInteger(0);
    public final AtomicReference A03 = new AtomicReference("");
    public final Choreographer.FrameCallback A00 = new Choreographer.FrameCallback() { // from class: X.1s6
        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            C1s5 c1s5 = C1s5.this;
            String str = (String) c1s5.A03.getAndSet("");
            if (c1s5.A02.getAndSet(0) > 0) {
                ComponentTree componentTree = c1s5.A05;
                if (str == null) {
                    str = 0Pz.A0j("<cls>", AnonymousClass001.A0Y(componentTree.A0V.A02), "</cls>");
                }
                componentTree.A0V(true, str);
            }
        }
    };
    public final Runnable A01 = new Runnable() { // from class: X.1s7
        public static final String __redex_internal_original_name = "ComponentTree$PostStateUpdateToChoreographerCallback$$ExternalSyntheticLambda0";

        @Override // java.lang.Runnable
        public final void run() {
            C1s5 c1s5 = C1s5.this;
            AtomicReference atomicReference = c1s5.A04;
            atomicReference.set(Choreographer.getInstance());
            if (c1s5.A02.get() > 0) {
                ((Choreographer) atomicReference.get()).postFrameCallback(c1s5.A00);
            }
        }
    };

    public C1s5(ComponentTree componentTree) {
        this.A05 = componentTree;
        AtomicReference atomicReference = this.A04;
        if (atomicReference.get() == null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                atomicReference.set(Choreographer.getInstance());
            } else {
                this.A05.A0D.CXu(this.A01, "Create Main Choreographer");
            }
        }
    }
}
