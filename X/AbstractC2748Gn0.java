package X;

import android.app.Activity;
import android.content.res.Resources;
import android.location.LocationManager;
import androidx.fragment.app.Fragment;
import com.facebook.runtimepermissions.RequestPermissionsConfig;

/* renamed from: X.Gn0, reason: case insensitive filesystem */
/* loaded from: Gn0.class */
public abstract class AbstractC2748Gn0 extends L4Y {
    public static long A02;
    public final HIR A00;
    public final 53U A01;

    public AbstractC2748Gn0(Activity activity, LocationManager locationManager, Fragment fragment, HIR hir, 53U r306) {
        super(activity, locationManager, fragment);
        this.A01 = r306;
        this.A00 = hir;
    }

    public final RequestPermissionsConfig A03() {
        Resources resources = super.A01.getResources();
        C5iw c5iw = new C5iw();
        c5iw.A00 = AbG.A11();
        c5iw.A04 = resources.getString(2131958760);
        c5iw.A00(resources.getString(2131958759));
        c5iw.A03 = resources.getString(2131958761);
        c5iw.A06 = true;
        return new RequestPermissionsConfig(c5iw);
    }
}
