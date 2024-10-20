package com.facebook.cameracore.mediapipeline.services.instruction;

import X.AnonymousClass001;
import X.Ios;
import X.IvZ;
import X.J2Z;
import X.JKt;
import X.SAY;
import android.os.Handler;
import java.util.List;

/* loaded from: InstructionServiceListenerWrapper.class */
public class InstructionServiceListenerWrapper {
    public final JKt mListener;
    public final Handler mUIHandler = AnonymousClass001.A07();

    public InstructionServiceListenerWrapper(JKt jKt) {
        this.mListener = jKt;
    }

    public void hideInstruction() {
        this.mUIHandler.post(new Ios(this));
    }

    public void setVisibleAutomaticInstruction(int i, List list, List list2, List list3) {
        this.mUIHandler.post(new J2Z(this, list, list2, list3, i));
    }

    public void showInstructionForToken(String str) {
        this.mUIHandler.post(new IvZ(this, str));
    }

    public void showInstructionWithCustomText(String str) {
        this.mUIHandler.post(new SAY(this, str));
    }
}
