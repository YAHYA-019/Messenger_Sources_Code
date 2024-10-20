package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.inject.FbInjector;
import com.facebook.litho.LithoView;
import com.facebook.messaging.messengerprefs.tincan.TincanDeviceModel;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* loaded from: B91.class */
public final class B91 extends BJB {
    public static final String __redex_internal_original_name = "M4TincanDeviceInformationFragment";
    public Bwm A00;
    public By5 A01;

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        boolean z;
        super.A1S(bundle);
        C1F6 c1f6 = (C1F6) 7zO.A0l(this, 787);
        Context requireContext = requireContext();
        Context A01 = FbInjector.A01();
        AbL.A0y(c1f6);
        try {
            Bwm bwm = new Bwm(requireContext, this);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A00 = bwm;
            Bundle bundle2 = this.mArguments;
            if (bundle != null) {
                bwm.A00 = (TincanDeviceModel) bundle.getParcelable("TINCAN_DEVICE_MODEL");
                z = bundle.getBoolean("IS_CURRENT_DEVICE", false);
            } else {
                if (bundle2 == null) {
                    return;
                }
                bwm.A00 = (TincanDeviceModel) bundle2.getParcelable("TINCAN_DEVICE_MODEL");
                z = bundle2.getBoolean("IS_CURRENT_DEVICE", false);
            }
            bwm.A02 = z;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1c() {
        LithoView lithoView = ((BJB) this).A00;
        if (lithoView == null || getContext() == null) {
            return;
        }
        A1b();
        this.A00.A01 = ((BJB) this).A01;
        1Iw A0P = AbI.A0P(this);
        String str = this.A00.A00.A02;
        By5 by5 = this.A01;
        if (by5 == null) {
            C9bw c9bw = new C9bw();
            c9bw.A04 = str;
            by5 = c9bw.A00();
            this.A01 = by5;
        }
        QCf qCf = new QCf(A0P, new QLS());
        MigColorScheme migColorScheme = ((BJB) this).A01;
        QLS qls = qCf.A01;
        qls.A01 = migColorScheme;
        BitSet bitSet = qCf.A02;
        bitSet.set(0);
        qls.A00 = this.A00;
        bitSet.set(1);
        C1rs.A00(bitSet, qCf.A03);
        qCf.A0J();
        BJB.A0I(qls, A0P, lithoView, this, by5);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(170030333);
        LithoView A1Y = A1Y(layoutInflater, viewGroup);
        0FI.A08(-1339978799, A02);
        return A1Y;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super/*X.DZJ*/.onSaveInstanceState(bundle);
        Bwm bwm = this.A00;
        bundle.putParcelable("TINCAN_DEVICE_MODEL", bwm.A00);
        bundle.putBoolean("IS_CURRENT_DEVICE", bwm.A02);
    }
}
