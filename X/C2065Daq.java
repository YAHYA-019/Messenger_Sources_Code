package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;

/* renamed from: X.Daq, reason: case insensitive filesystem */
/* loaded from: Daq.class */
public final class C2065Daq extends C1q6 {
    public final /* synthetic */ Bxj A00;

    public C2065Daq(Bxj bxj) {
        this.A00 = bxj;
    }

    @Override // X.C1q6, X.C1pu
    public void Bib(Bundle bundle, View view, Fragment fragment) {
        if (view != null) {
            Bxj bxj = this.A00;
            FFj fFj = bxj.A06;
            FFj.A01(new DLF(view, fFj.A02), bxj.A05, fFj, new DLG(false));
        }
    }
}
