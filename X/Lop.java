package X;

import com.facebook.wearlistener.DataLayerListenerService;
import com.google.android.gms.wearable.internal.zzhg;
import com.google.android.gms.wearable.zzag;
import java.util.Set;

/* loaded from: Lop.class */
public final class Lop implements Runnable {
    public static final String __redex_internal_original_name = "zzz";
    public final /* synthetic */ zzhg A00;
    public final /* synthetic */ zzag A01;

    public Lop(zzhg zzhgVar, zzag zzagVar) {
        this.A01 = zzagVar;
        this.A00 = zzhgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DataLayerListenerService dataLayerListenerService = this.A01.A01;
        zzhg zzhgVar = this.A00;
        Set A0Y = JR2.A0Y(dataLayerListenerService);
        dataLayerListenerService.A06 = A0Y;
        0fH.A04(DataLayerListenerService.class, Integer.valueOf(A0Y.size()), dataLayerListenerService.A06.size() != 1 ? K93.__redex_internal_original_name : "", zzhgVar.A00, "Sending onPeerDisconnected to %s listener%s: Peer %s");
        DataLayerListenerService.A00(2Ri.A02(new Lez(dataLayerListenerService, zzhgVar, 3), dataLayerListenerService.A06));
    }
}
