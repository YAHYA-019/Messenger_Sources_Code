package com.facebook.messenger.bugreporter.bottomsheet;

import X.0FI;
import X.1BQ;
import X.1Iw;
import X.1LI;
import X.1iF;
import X.AbF;
import X.AnonymousClass553;
import X.C00i;
import X.C1rs;
import X.C5xv;
import X.DKF;
import X.EPO;
import X.FXq;
import X.FkE;
import X.FkI;
import X.QDd;
import X.QIz;
import android.os.Bundle;
import android.view.View;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.base.Preconditions;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.BitSet;

/* loaded from: MessengerBugReporterConsentFlowBottomSheetDialogFragment.class */
public class MessengerBugReporterConsentFlowBottomSheetDialogFragment extends MigBottomSheetDialogFragment {
    public long A00;
    public EPO A01;
    public C00i A02;
    public final C00i A05 = 1BQ.A02(49736);
    public final C00i A06 = 1BQ.A02(66351);
    public boolean A03 = true;
    public final AnonymousClass553 A07 = new FkE(this, 9);
    public final View.OnClickListener A04 = FXq.A00(this, 1);
    public final C5xv A08 = new FkI(this, 24);

    public 1iF A17() {
        return AbF.A0C(2923293961022627L);
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        QDd qDd = new QDd(r302, new QIz());
        MigColorScheme A1F = A1F();
        1LI r0 = qDd.A01;
        ((QIz) r0).A02 = A1F;
        BitSet bitSet = qDd.A02;
        bitSet.set(1);
        ((QIz) r0).A01 = this.A07;
        bitSet.set(3);
        ((QIz) r0).A00 = this.A04;
        bitSet.set(2);
        ((QIz) r0).A03 = this.A08;
        bitSet.set(0);
        C1rs.A02(bitSet, qDd.A03);
        qDd.A0J();
        return r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-733700582);
        super.onCreate(bundle);
        this.A02 = 1BQ.A02(100325);
        Bundle bundle2 = this.mArguments;
        EPO epo = bundle2 != null ? (EPO) bundle2.get(Property.SYMBOL_Z_ORDER_SOURCE) : EPO.A0O;
        this.A01 = epo;
        if (epo == null) {
            this.A01 = EPO.A0X;
        }
        Bundle bundle3 = this.mArguments;
        long j = bundle3 != null ? bundle3.getLong("flow_start_time_ms") : 0L;
        this.A00 = j;
        if (j == 0) {
            this.A00 = System.currentTimeMillis();
        }
        0FI.A08(-1955486113, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(-555769436);
        super/*androidx.fragment.app.Fragment*/.onPause();
        if (this.A03) {
            DKF.A0Q(this.A02).A02();
        }
        0FI.A08(812928564, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int i;
        int A02 = 0FI.A02(895170329);
        super/*androidx.fragment.app.Fragment*/.onResume();
        if (A16() == null) {
            i = -485484872;
        } else {
            Preconditions.checkNotNull(this.A01, "mSource null. OnCreate() should guarantee not null.");
            DKF.A0Q(this.A02).A03(this.A01);
            i = 1397083780;
        }
        0FI.A08(i, A02);
    }
}
