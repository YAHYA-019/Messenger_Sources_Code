package X;

import com.facebook.messaging.customthreads.threadsettings.picker.customtheme.fragment.GeneratedThemeCreationFragment;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: A82.class */
public final class A82 implements AYn {
    public final /* synthetic */ GeneratedThemeCreationFragment A00;

    public A82(GeneratedThemeCreationFragment generatedThemeCreationFragment) {
        this.A00 = generatedThemeCreationFragment;
    }

    @Override // X.AYn
    public void Bp6(String str) {
        11T.A0F(str, 0);
        GeneratedThemeCreationFragment generatedThemeCreationFragment = this.A00;
        9Wn r0 = (9Wn) 1Br.A0B(generatedThemeCreationFragment.A0d);
        ThreadKey threadKey = generatedThemeCreationFragment.A0C;
        if (threadKey == null) {
            throw 1BK.A0h();
        }
        1UG A08 = 1BK.A08(1Br.A02(r0.A00), "messenger_customthreads_submit_prompt");
        if (A08.isSampled()) {
            7zS.A1F(A08, threadKey);
            7zN.A15(A08);
            7zV.A0v(A08, threadKey, "ai_theme_null_state");
            A08.A5c(98D.A01, "theme_type");
            A08.BZL();
        }
        GeneratedThemeCreationFragment.A0N(generatedThemeCreationFragment, GeneratedThemeCreationFragment.A06(generatedThemeCreationFragment, str));
    }
}
