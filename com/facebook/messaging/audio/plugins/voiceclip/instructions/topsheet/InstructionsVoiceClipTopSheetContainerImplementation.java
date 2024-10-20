package com.facebook.messaging.audio.plugins.voiceclip.instructions.topsheet;

import X.1BK;
import X.1LI;
import X.2K3;
import X.2KD;
import X.7zL;
import android.content.Context;
import com.facebook.litho.LithoView;
import com.facebook.messaging.audio.plugins.voiceclip.instructions.InstructionsVoiceClipParams;
import com.facebook.messaging.composer.model.ComposerTopSheetOpenParams;
import com.facebook.messaging.threadview.scheme.interfaces.ThreadViewColorScheme;

/* loaded from: InstructionsVoiceClipTopSheetContainerImplementation.class */
public final class InstructionsVoiceClipTopSheetContainerImplementation {
    public LithoView A00;
    public ThreadViewColorScheme A01;
    public int A02;

    public static final void A00(Context context, InstructionsVoiceClipTopSheetContainerImplementation instructionsVoiceClipTopSheetContainerImplementation, ComposerTopSheetOpenParams composerTopSheetOpenParams) {
        int i = composerTopSheetOpenParams instanceof InstructionsVoiceClipParams ? ((InstructionsVoiceClipParams) composerTopSheetOpenParams).A00 : 2131966271;
        if (instructionsVoiceClipTopSheetContainerImplementation.A02 != i) {
            instructionsVoiceClipTopSheetContainerImplementation.A02 = i;
            String A0u = 1BK.A0u(context, i);
            2KD A01 = 2K3.A01(7zL.A0W(context), 0);
            ThreadViewColorScheme threadViewColorScheme = instructionsVoiceClipTopSheetContainerImplementation.A01;
            A01.A2x(threadViewColorScheme != null ? threadViewColorScheme.A0F : null);
            A01.A32(false);
            A01.A2z(A0u);
            A01.A2S(A0u);
            A01.A2n();
            A01.A2d();
            A01.A1C(10.0f);
            A01.A1B(10.0f);
            A01.A0L();
            A01.A2X();
            1LI A2W = A01.A2W();
            LithoView lithoView = instructionsVoiceClipTopSheetContainerImplementation.A00;
            if (lithoView != null) {
                lithoView.A0x(A2W);
            }
        }
    }
}
