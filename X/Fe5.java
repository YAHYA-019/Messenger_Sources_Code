package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.ui.legacynavbar.LegacyNavigationBar;

/* loaded from: Fe5.class */
public final class Fe5 implements GEe {
    public final int A00;
    public final Object A01;

    public Fe5(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.GEe
    public boolean A8s(int i, int i2, int i3, int i4) {
        switch (this.A00) {
            case 0:
                DKF.A1H((View) this.A01, i2);
                return false;
            case 1:
                ((ViewGroup.MarginLayoutParams) this.A01).topMargin = i2;
                return true;
            default:
                if (!1tJ.A0A()) {
                    synchronized (Integer.valueOf(1tJ.A00)) {
                        1tJ.A00 = i2;
                    }
                }
                LegacyNavigationBar legacyNavigationBar = (LegacyNavigationBar) this.A01;
                CallerContext callerContext = LegacyNavigationBar.A0M;
                legacyNavigationBar.A01 = i2;
                legacyNavigationBar.A05 = true;
                if (!legacyNavigationBar.A06) {
                    return true;
                }
                if (legacyNavigationBar.getPaddingTop() <= 0) {
                    if (legacyNavigationBar.A05) {
                        1Br.A07(((F86) 1Bn.A0A(98599)).A02).AZk(36310675733545873L);
                        legacyNavigationBar.setPadding(0, legacyNavigationBar.A01, 0, 0);
                    } else {
                        legacyNavigationBar.A06 = true;
                    }
                }
                legacyNavigationBar.A06 = false;
                return true;
        }
    }
}
