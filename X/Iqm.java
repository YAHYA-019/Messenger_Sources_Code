package X;

import com.facebook.messaging.montage.composer.cameracore.view.InstructionView;

/* loaded from: Iqm.class */
public final class Iqm implements Runnable {
    public static final String __redex_internal_original_name = "InstructionView$fadeOutInstructionAnimationRunnable$1";
    public final /* synthetic */ InstructionView A00;

    public Iqm(InstructionView instructionView) {
        this.A00 = instructionView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.animate().alpha(0.0f);
    }
}
