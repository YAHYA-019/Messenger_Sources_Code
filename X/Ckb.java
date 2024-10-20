package X;

import android.os.Bundle;
import android.os.Parcelable;
import java.lang.ref.WeakReference;

/* loaded from: Ckb.class */
public final class Ckb implements C7yf {
    @Override // X.C7yf
    public 1pK AlC(Parcelable parcelable) {
        Bundle A05 = 1BK.A05();
        1pK r0 = new 1pK();
        A05.putParcelable("arg_page_about_params", parcelable);
        r0.setArguments(A05);
        return r0;
    }

    @Override // X.C7yf
    public BP7 AlE() {
        return BP7.PAGE_ABOUT;
    }

    @Override // X.C7yf
    public /* synthetic */ 1pK AlF(Parcelable parcelable, WeakReference weakReference) {
        return null;
    }
}
