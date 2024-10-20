package X;

import com.facebook.expression.effect.interactive.metadata.InteractiveEffectMetadata;
import com.facebook.messaging.montage.model.art.EffectItem;
import com.facebook.messaging.rtc.incall.plugins.notification.feature.effect.EffectImplementation;
import java.util.Iterator;

/* loaded from: Ivf.class */
public final class Ivf implements Runnable {
    public static final String __redex_internal_original_name = "EffectActivity$4";
    public final /* synthetic */ GzJ A00;
    public final /* synthetic */ HZt A01;

    public Ivf(GzJ gzJ, HZt hZt) {
        this.A00 = gzJ;
        this.A01 = hZt;
    }

    @Override // java.lang.Runnable
    public void run() {
        HZt hZt = this.A01;
        EffectItem effectItem = this.A00.A01;
        effectItem.getClass();
        InteractiveEffectMetadata interactiveEffectMetadata = effectItem.A0F;
        interactiveEffectMetadata.getClass();
        String str = interactiveEffectMetadata.A00;
        11T.A0F(str, 0);
        Iterator it = hZt.A01.iterator();
        while (it.hasNext()) {
            C2523Gg7 c2523Gg7 = (C2523Gg7) ((HFU) it.next());
            if (2 - c2523Gg7.A00 == 0) {
                EffectImplementation effectImplementation = (EffectImplementation) c2523Gg7.A01;
                String A13 = AbK.A13(effectImplementation.A01, str, 2131964915);
                I8a i8a = ((HEt) effectImplementation).A00;
                if (i8a != null) {
                    I8a.A00(i8a, HBr.A18, A13);
                }
            }
        }
    }
}
