package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import java.lang.ref.WeakReference;

/* renamed from: X.92y, reason: invalid class name */
/* loaded from: 92y.class */
public final class C92y extends C6yf {
    public final WeakReference A00;

    public C92y(6yW r302) {
        super(r302);
        Activity activity = r302.A01;
        if (activity == null) {
            throw AnonymousClass001.A0L("Cannot create ActivityStrategy with null Builder.launcherActivity");
        }
        this.A00 = 7zL.A14(activity);
    }

    public static 96Z A00(2yD r301) {
        96Z r308 = (96Z) C9ec.A00.get(Integer.valueOf((int) r301.Auy(36607028466359934L)));
        if (r308 == null) {
            r308 = 96Z.A02;
        }
        return r308;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C6yf
    public void A02(Bundle bundle) {
        2aH A0y;
        2Zs A00;
        int i;
        Activity activity = (Activity) this.A00.get();
        if (activity == 0) {
            0fH.A18("ActivityLauncher", "Unable to launch activity %s, invalid host context", new Object[]{this.A02});
            return;
        }
        2yD A0Q = 1BL.A0Q();
        if (!A0Q.AZk(36325553489335110L)) {
            0LS.A0A(activity, A01(activity, bundle));
            return;
        }
        if (activity instanceof LifecycleOwner) {
            A0y = 7zO.A16((LifecycleOwner) activity);
            A00 = C9ec.A00(A00(A0Q));
            i = 20;
        } else {
            A0y = 7zN.A0y();
            A00 = C9ec.A00(A00(A0Q));
            i = 21;
        }
        2aK.A03((Integer) null, A00, new AJf(this, bundle, activity, null, i), A0y, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C6yf, X.C6yg
    public void BXz(Bundle bundle, 6RU r303) {
        2aH A0y;
        2Zs A00;
        int i;
        Activity activity = (Activity) this.A00.get();
        if (activity == 0) {
            0fH.A18("ActivityLauncher", "Unable to launch activity %s, invalid host context", new Object[]{this.A02});
            return;
        }
        2yD A0Q = 1BL.A0Q();
        if (!A0Q.AZk(36325553489335110L)) {
            0LS.A07(activity, A01(activity, bundle), super.A00);
            return;
        }
        if (activity instanceof LifecycleOwner) {
            A0y = 7zO.A16((LifecycleOwner) activity);
            A00 = C9ec.A00(A00(A0Q));
            i = 22;
        } else {
            A0y = 7zN.A0y();
            A00 = C9ec.A00(A00(A0Q));
            i = 23;
        }
        2aK.A03((Integer) null, A00, new AJf(this, bundle, activity, null, i), A0y, 2);
    }
}
