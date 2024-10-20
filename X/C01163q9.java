package X;

import android.telephony.TelephonyCallback;
import java.util.List;

/* renamed from: X.3q9, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3q9.class */
public final class C01163q9 extends TelephonyCallback implements TelephonyCallback.CellInfoListener {
    public final /* synthetic */ 2DH A00;

    @Override // android.telephony.TelephonyCallback.CellInfoListener
    public void onCellInfoChanged(List list) {
        2DH.A0b(this.A00, list);
    }
}
