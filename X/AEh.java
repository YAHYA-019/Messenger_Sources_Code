package X;

import com.facebook.messaging.customthreads.threadsettings.picker.customtheme.fragment.GeneratedThemeCreationFragment;
import com.facebook.resources.ui.FbLinearLayout;

/* loaded from: AEh.class */
public final class AEh implements Runnable {
    public static final String __redex_internal_original_name = "GeneratedThemeCreationFragment$hideInitialStateView$1";
    public final /* synthetic */ GeneratedThemeCreationFragment A00;
    public final /* synthetic */ FbLinearLayout A01;

    public AEh(GeneratedThemeCreationFragment generatedThemeCreationFragment, FbLinearLayout fbLinearLayout) {
        this.A01 = fbLinearLayout;
        this.A00 = generatedThemeCreationFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.setVisibility(8);
        InterfaceC00713oe interfaceC00713oe = this.A00.A09;
        if (interfaceC00713oe != null) {
            interfaceC00713oe.Bef(0S2.A01);
        }
    }
}
