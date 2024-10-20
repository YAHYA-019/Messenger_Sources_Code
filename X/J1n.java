package X;

import com.facebook.expression.effect.interactive.metadata.InteractiveEffectMetadata;
import com.facebook.messaging.montage.model.art.EffectItem;
import com.facebook.messaging.rtc.incall.plugins.notification.feature.effect.EffectImplementation;
import java.util.Iterator;

/* loaded from: J1n.class */
public final class J1n implements Runnable {
    public static final String __redex_internal_original_name = "EffectActivity$3";
    public final /* synthetic */ GzJ A00;
    public final /* synthetic */ HZt A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public J1n(GzJ gzJ, HZt hZt, String str, String str2) {
        this.A00 = gzJ;
        this.A01 = hZt;
        this.A02 = str;
        this.A03 = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        String A0v;
        GzJ gzJ = this.A00;
        if (gzJ.mInitiatorUserId.equals(gzJ.A0B)) {
            HZt hZt = this.A01;
            String str = this.A02;
            EffectItem effectItem = gzJ.A01;
            effectItem.getClass();
            InteractiveEffectMetadata interactiveEffectMetadata = effectItem.A0F;
            interactiveEffectMetadata.getClass();
            String str2 = interactiveEffectMetadata.A00;
            String str3 = this.A03;
            7zT.A1S(str, str2, str3);
            Iterator it = hZt.A01.iterator();
            while (it.hasNext()) {
                C2523Gg7 c2523Gg7 = (C2523Gg7) ((HFU) it.next());
                switch (c2523Gg7.A00) {
                    case 0:
                        ((Hja) c2523Gg7.A01).A08.add(str2);
                        break;
                    case 2:
                        if (!str3.equals("USER_DECLINED") && !str3.equals("REQUEST_TIMED_OUT")) {
                            EffectImplementation effectImplementation = (EffectImplementation) c2523Gg7.A01;
                            if (EffectImplementation.A00(effectImplementation, str) != null) {
                                1Br.A0C(effectImplementation.A07);
                                A0v = 4YU.A0u(GOn.A0D(), str2, 2131964912);
                                if (A0v == null) {
                                    ((I5n) 1Br.A0B(effectImplementation.A0G)).A04("INTERACTIVE_EFFECT_PEER_DOWNLOAD_START", "MISSING_NOTIFICATION_TEXT");
                                    break;
                                }
                            } else {
                                A0v = 1BK.A0v(effectImplementation.A01, str2, 2131964917);
                            }
                            ((I5n) 1Br.A0B(effectImplementation.A0G)).A03(effectImplementation.A02, "INTERACTIVE_EFFECT_PEER_DOWNLOAD_START", str2);
                            I8a i8a = ((HEt) effectImplementation).A00;
                            if (i8a == null) {
                                break;
                            } else {
                                I8a.A00(i8a, HBr.A0l, A0v);
                                break;
                            }
                        }
                        break;
                }
            }
        }
    }
}
