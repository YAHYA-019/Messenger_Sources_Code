package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.messaging.montage.composer.cameracore.view.InstructionView;
import java.util.EnumSet;

/* loaded from: Iqj.class */
public final class Iqj implements Runnable {
    public static final String __redex_internal_original_name = "MessengerEffectInstructionController$showMaskPlaceholderRunnable$1";
    public final /* synthetic */ I8M A00;

    public Iqj(I8M i8m) {
        this.A00 = i8m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I8M i8m = this.A00;
        Context context = i8m.A02;
        I8M.A00(i8m, context.getResources().getString(2131953741));
        2Wo r0 = i8m.A04;
        InstructionView instructionView = (InstructionView) r0.A01();
        Drawable drawable = context.getDrawable(2132345654);
        5YB r02 = instructionView.A00;
        if (r02 != null) {
            r02.setImageDrawable(drawable);
        }
        InstructionView instructionView2 = (InstructionView) r0.A01();
        EnumSet of = EnumSet.of(H9Z.A02, H9Z.A03);
        11T.A0A(of);
        instructionView2.A0E(of);
        r0.A03();
    }
}
