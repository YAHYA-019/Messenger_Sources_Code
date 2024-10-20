package X;

import android.view.View;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: AGv.class */
public final class AGv implements Runnable {
    public static final String __redex_internal_original_name = "ThemeSelectionUtil$setMetaVerifiedAccountTheme$1$showSnackBar$1";
    public final /* synthetic */ View A00;
    public final /* synthetic */ 1Br A01;
    public final /* synthetic */ 9Zo A02;
    public final /* synthetic */ String A03;

    public AGv(View view, 1Br r303, 9Zo r304, String str) {
        this.A00 = view;
        this.A02 = r304;
        this.A01 = r303;
        this.A03 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.A00;
        if (view != null) {
            ((6LF) 1Br.A0B(this.A02.A05)).A03(view, (MigColorScheme) this.A01.get(), this.A03);
        }
    }
}
