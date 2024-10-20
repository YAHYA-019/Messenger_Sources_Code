package X;

import com.facebook.messaging.montage.model.art.BaseItem;
import com.facebook.messaging.montage.model.art.EffectItem;

/* loaded from: J0i.class */
public final class J0i implements Runnable {
    public static final String __redex_internal_original_name = "AvatarInRtcSharedStateImpl$initEffectListener$1$onEffectLoadingFailed$1";
    public final /* synthetic */ IEo A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ Throwable A02;

    public J0i(IEo iEo, String str, Throwable th) {
        this.A00 = iEo;
        this.A01 = str;
        this.A02 = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IEo iEo = this.A00;
        EffectItem effectItem = iEo.A02;
        String str = null;
        if (11T.A0O(effectItem != null ? BaseItem.A02(effectItem).toString() : null, this.A01) && iEo.A03 == HAI.A04) {
            HtR htR = (HtR) 1Br.A0B(iEo.A0C);
            Throwable th = this.A02;
            if (th != null) {
                str = th.getMessage();
            }
            htR.A02("effect_loading_in_engine_failure", str);
            iEo.A0D(th);
        }
    }
}
