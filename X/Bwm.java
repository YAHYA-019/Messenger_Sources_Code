package X;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.messengerprefs.tincan.TincanDeviceModel;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: Bwm.class */
public final class Bwm {
    public TincanDeviceModel A00;
    public MigColorScheme A01;
    public boolean A02;
    public final DialogInterface.OnClickListener A03 = CSG.A00(this, ActionId.RTMP_CONNECTION_REQUESTED);
    public final Fragment A04;
    public final CbB A05;
    public final Context A06;

    public Bwm(Context context, Fragment fragment) {
        this.A06 = context;
        this.A05 = (CbB) 1Bn.A0E(context, (1BY) null, 82534);
        this.A04 = fragment;
    }
}
