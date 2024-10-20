package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: X.6yf, reason: invalid class name */
/* loaded from: 6yf.class */
public abstract class C6yf implements C6yg {
    public final int A00;
    public final Bundle A01;
    public final Class A02;

    public C6yf(6yW r302) {
        Class cls = r302.A04;
        if (cls == null) {
            throw 1BK.A0h();
        }
        Bundle bundle = r302.A02;
        bundle = bundle == null ? Bundle.EMPTY : bundle;
        11T.A0D(bundle);
        int i = r302.A00;
        11T.A0F(bundle, 2);
        this.A02 = cls;
        this.A01 = bundle;
        this.A00 = i;
    }

    public final Intent A01(Context context, Bundle bundle) {
        11T.A0F(context, 0);
        11T.A0F(bundle, 1);
        Intent intent = new Intent(context, (Class<?>) this.A02);
        intent.putExtras(this.A01);
        intent.putExtras(bundle);
        return intent;
    }

    public void A02(Bundle bundle) {
        C6ye c6ye = (C6ye) this;
        Fragment fragment = (Fragment) c6ye.A00.get();
        if (fragment != null) {
            Context context = fragment.getContext();
            if (context == null) {
                0fH.A18("ActivityLauncher", "Unable to launch %s: invalid context", new Object[]{c6ye.A02});
                return;
            }
            2yD A0Q = 1BL.A0Q();
            if (!A0Q.AZk(36325553489335110L)) {
                0LS.A0A(context, c6ye.A01(context, bundle));
                return;
            }
            2aH A00 = 2Zy.A00(fragment.getViewLifecycleOwner(), 2Zo.A01());
            96Z r304 = (96Z) C9ec.A00.get(Integer.valueOf(2yD.A00(A0Q, 36607028466359934L)));
            if (r304 == null) {
                r304 = 96Z.A02;
            }
            2aK.A03((Integer) null, C9ec.A00(r304), new AJf(c6ye, bundle, context, null, 24), A00, 2);
        }
    }

    @Override // X.C6yg
    public int B7H() {
        return this.A00;
    }

    @Override // X.C6yg
    public void BXy(6RU r302) {
        Bundle bundle = Bundle.EMPTY;
        11T.A0B(bundle);
        BXz(bundle, r302);
    }

    @Override // X.C6yg
    public void BXz(Bundle bundle, 6RU r303) {
        C6ye c6ye = (C6ye) this;
        Fragment fragment = (Fragment) c6ye.A00.get();
        if (fragment != null) {
            Context context = fragment.getContext();
            if (context == null) {
                0fH.A18("ActivityLauncher", "Unable to launch %s: invalid context", new Object[]{c6ye.A02});
                return;
            }
            2yD r0 = (2yD) 1Bi.A03(16385);
            if (!r0.AZk(36325553489335110L)) {
                0LS.A05(c6ye.A01(context, bundle), fragment, ((C6yf) c6ye).A00);
                return;
            }
            2aH A00 = 2Zy.A00(fragment.getViewLifecycleOwner(), 2Zo.A01());
            96Z r305 = (96Z) C9ec.A00.get(Integer.valueOf(2yD.A00(r0, 36607028466359934L)));
            if (r305 == null) {
                r305 = 96Z.A02;
            }
            2aK.A03((Integer) null, C9ec.A00(r305), new AnonymousClass851(c6ye, bundle, context, fragment, (0DR) null, 41), A00, 2);
        }
    }

    @Override // X.C6yg
    public void BzX(Fragment fragment, 6RU r303) {
    }
}
