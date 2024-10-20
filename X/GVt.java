package X;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;

/* loaded from: GVt.class */
public final class GVt extends 0KB {
    public final /* synthetic */ FrameLayout A00;
    public final /* synthetic */ Fragment A01;
    public final /* synthetic */ GWk A02;

    public GVt(FrameLayout frameLayout, Fragment fragment, GWk gWk) {
        this.A02 = gWk;
        this.A01 = fragment;
        this.A00 = frameLayout;
    }

    public void A02(Bundle bundle, View view, Fragment fragment, 06Z r305) {
        if (fragment == this.A01) {
            r305.A1J(this);
            GWk.A02(view, this.A00);
        }
    }
}
