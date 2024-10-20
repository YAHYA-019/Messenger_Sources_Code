package X;

import com.facebook.cameracore.mediapipeline.services.instruction.InstructionServiceListenerWrapper;

/* loaded from: Ios.class */
public final class Ios implements Runnable {
    public static final String __redex_internal_original_name = "InstructionServiceListenerWrapper$4";
    public final /* synthetic */ InstructionServiceListenerWrapper A00;

    public Ios(InstructionServiceListenerWrapper instructionServiceListenerWrapper) {
        this.A00 = instructionServiceListenerWrapper;
    }

    @Override // java.lang.Runnable
    public void run() {
        JKt jKt = this.A00.mListener;
        if (jKt != null) {
            jKt.BO6();
        }
    }
}
