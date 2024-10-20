package X;

import com.facebook.interstitial.triggers.InterstitialTrigger;
import com.facebook.interstitial.triggers.InterstitialTriggerContext;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.RegularImmutableSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;

/* renamed from: X.4Gr, reason: invalid class name */
/* loaded from: 4Gr.class */
public final class C4Gr implements C4Gf {
    public static final C4Gy A00(ImmutableSet immutableSet, String str) {
        4WB r306;
        String str2;
        if (str != null && str.length() != 0) {
            HashSet hashSet = new HashSet();
            Matcher matcher = HwJ.A00.matcher(str);
            while (matcher.find()) {
                hashSet.add(matcher.group(1));
            }
            if (!hashSet.isEmpty()) {
                if (immutableSet.isEmpty()) {
                    r306 = new 4WB("failingParameters", hashSet);
                    str2 = "missing_context_to_sub_dynamic_params";
                } else {
                    hashSet.removeAll(immutableSet);
                    if (!hashSet.isEmpty()) {
                        r306 = new 4WB("failingParameters", hashSet);
                        str2 = "leftover_dynamic_params_not_subbed";
                    }
                }
                return C4Gx.A02(r306, str2);
            }
        }
        return C4Gx.A00();
    }

    @Override // X.C4Gf
    public C4Gy A8f(C4Gc c4Gc, 44I r303) {
        4TF r307;
        C4H1 c4h1;
        InterstitialTriggerContext interstitialTriggerContext;
        11T.A0F(r303, 0);
        11T.A0F(c4Gc, 1);
        ImmutableSet immutableSet = c4Gc.A0H;
        11T.A0F(immutableSet, 0);
        InterstitialTrigger interstitialTrigger = (InterstitialTrigger) 0QD.A08(immutableSet);
        if (interstitialTrigger == null || (interstitialTriggerContext = interstitialTrigger.A01) == null) {
            RegularImmutableSet regularImmutableSet = RegularImmutableSet.A05;
            11T.A0A(regularImmutableSet);
            r307 = new 4TF(regularImmutableSet, false);
        } else {
            Set keySet = interstitialTriggerContext.A00.keySet();
            11T.A0A(keySet);
            ImmutableSet immutableSet2 = (ImmutableSet) keySet;
            11T.A0F(immutableSet2, 0);
            r307 = new 4TF(immutableSet2, true);
        }
        if (r307.A01 && (c4h1 = (C4H1) r303.A03.getValue()) != null) {
            ImmutableSet immutableSet3 = r307.A00;
            QuickPromotionDefinition.Creative creative = c4h1.A00;
            Iterator it = C0s8.A14(creative.title, creative.content).iterator();
            while (it.hasNext()) {
                C4Gy A00 = A00(immutableSet3, (String) it.next());
                if (!A00.A07) {
                    return A00;
                }
            }
            for (C4H3 c4h3 : C0s8.A14((C4H3) c4h1.A02.getValue(), (C4H3) c4h1.A03.getValue())) {
                if (c4h3 != null) {
                    QuickPromotionDefinition.Action action = ((C4H2) c4h3).A00;
                    Iterator it2 = C0s8.A14(action.title, action.url).iterator();
                    while (it2.hasNext()) {
                        C4Gy A002 = A00(immutableSet3, (String) it2.next());
                        if (!A002.A07) {
                            return A002;
                        }
                    }
                }
            }
        }
        return C4Gx.A00();
    }

    @Override // X.C4Gf
    public String DAM() {
        return "client_parameters";
    }
}
