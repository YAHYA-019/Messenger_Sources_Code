package X;

import com.facebook.wearlistener.DataLayerListenerService;
import com.google.android.gms.wearable.internal.zzgp;
import com.google.android.gms.wearable.zzag;

/* loaded from: Lon.class */
public final class Lon implements Runnable {
    public static final String __redex_internal_original_name = "zzx";
    public final /* synthetic */ zzgp A00;
    public final /* synthetic */ zzag A01;

    public Lon(zzgp zzgpVar, zzag zzagVar) {
        this.A01 = zzagVar;
        this.A00 = zzgpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DataLayerListenerService dataLayerListenerService = this.A01.A01;
        zzgp zzgpVar = this.A00;
        dataLayerListenerService.A06 = JR2.A0Y(dataLayerListenerService);
        0fH.A04(DataLayerListenerService.class, Integer.valueOf(dataLayerListenerService.A05.size()), dataLayerListenerService.A05.size() != 1 ? K93.__redex_internal_original_name : "", zzgpVar.A00, "Sending onMessageReceived to %s listener%s: Message path of %s");
        DataLayerListenerService.A00(2Ri.A02(new Lez(dataLayerListenerService, zzgpVar, 1), dataLayerListenerService.A05));
    }
}
