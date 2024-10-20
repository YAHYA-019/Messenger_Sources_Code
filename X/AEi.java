package X;

import com.facebook.messaging.customthreads.threadsettings.picker.customtheme.fragment.GeneratedThemeCreationFragment;
import com.facebook.resources.ui.FbLinearLayout;

/* loaded from: AEi.class */
public final class AEi implements Runnable {
    public static final String __redex_internal_original_name = "GeneratedThemeCreationFragment$hideLoadingStateView$1";
    public final /* synthetic */ GeneratedThemeCreationFragment A00;
    public final /* synthetic */ FbLinearLayout A01;

    public AEi(GeneratedThemeCreationFragment generatedThemeCreationFragment, FbLinearLayout fbLinearLayout) {
        this.A01 = fbLinearLayout;
        this.A00 = generatedThemeCreationFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.setVisibility(8);
        InterfaceC00713oe interfaceC00713oe = this.A00.A0A;
        if (interfaceC00713oe != null) {
            interfaceC00713oe.Bef(0S2.A01);
        }
    }
}
