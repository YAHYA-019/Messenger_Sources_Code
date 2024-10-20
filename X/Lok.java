package X;

import com.facebook.wearlistener.DataLayerListenerService;
import com.google.android.gms.wearable.internal.zzbj;
import com.google.android.gms.wearable.zzag;

/* loaded from: Lok.class */
public final class Lok implements Runnable {
    public static final String __redex_internal_original_name = "zzae";
    public final /* synthetic */ zzbj A00;
    public final /* synthetic */ zzag A01;

    public Lok(zzbj zzbjVar, zzag zzagVar) {
        this.A01 = zzagVar;
        this.A00 = zzbjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbj zzbjVar = this.A00;
        DataLayerListenerService dataLayerListenerService = this.A01.A01;
        zzbjVar.A00(dataLayerListenerService);
        zzbjVar.A00(dataLayerListenerService.A09);
    }
}
