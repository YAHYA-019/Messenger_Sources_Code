package X;

import com.facebook.wearlistener.DataLayerListenerService;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.zzag;

/* loaded from: Lom.class */
public final class Lom implements Runnable {
    public static final String __redex_internal_original_name = "zzw";
    public final /* synthetic */ DataHolder A00;
    public final /* synthetic */ zzag A01;

    public Lom(DataHolder dataHolder, zzag zzagVar) {
        this.A01 = zzagVar;
        this.A00 = dataHolder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        K2t k2t = new K2t(this.A00);
        try {
            DataLayerListenerService dataLayerListenerService = this.A01.A01;
            dataLayerListenerService.A06 = JR2.A0Y(dataLayerListenerService);
            Integer valueOf = Integer.valueOf(dataLayerListenerService.A04.size());
            String str = dataLayerListenerService.A04.size() != 1 ? K93.__redex_internal_original_name : "";
            K2t.A00(k2t);
            0fH.A04(DataLayerListenerService.class, valueOf, str, 1BK.A0k(k2t.A00), "Sending onDataChanged to %d listener%s: Data Item count of %d");
            DataLayerListenerService.A00(2Ri.A02(new Lez(dataLayerListenerService, k2t, 0), dataLayerListenerService.A04));
        } finally {
            DataHolder dataHolder = ((Lcm) k2t).A00;
            if (dataHolder != null) {
                dataHolder.close();
            }
        }
    }
}
