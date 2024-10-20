package X;

import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.montage.model.MontageCard;
import com.facebook.messaging.montage.model.cards.MontageFeedbackOverlay;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

/* renamed from: X.4V8, reason: invalid class name */
/* loaded from: 4V8.class */
public abstract class C4V8 {
    public static MontageCard A00(MontageCard montageCard, ImmutableList immutableList) {
        montageCard.getClass();
        C48c c48c = new C48c(montageCard);
        c48c.A08 = montageCard.A08;
        c48c.A02 = montageCard.A03;
        c48c.A0I = montageCard.A0E;
        c48c.A04 = montageCard.A05;
        c48c.A0G = montageCard.A04();
        c48c.A0L = montageCard.A0H;
        c48c.A0K = montageCard.A0G;
        c48c.A0D = A02(immutableList, montageCard.A03());
        c48c.A09 = montageCard.A09;
        c48c.A0A = montageCard.A0A;
        c48c.A0B = montageCard.A01();
        c48c.A0C = montageCard.A02();
        c48c.A0M = montageCard.A0I;
        c48c.A0J = montageCard.A0F;
        c48c.A01 = montageCard.A02;
        c48c.A0H = montageCard.A0D;
        c48c.A0N = montageCard.A0J;
        c48c.A05 = montageCard.A00;
        String str = montageCard.A0K;
        if (str != null) {
            c48c.A0O = str;
        }
        ImmutableMap immutableMap = montageCard.A0C;
        if (immutableMap != null) {
            c48c.A0F = immutableMap;
        }
        Message message = montageCard.A06;
        if (message != null) {
            5PI r0 = new 5PI(message);
            r0.A0w = A02(immutableList, montageCard.A03());
            c48c.A06 = new Message(r0);
        }
        return c48c.A00();
    }

    public static ImmutableList A01(ImmutableList immutableList) {
        Message message;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            MontageCard montageCard = (MontageCard) it.next();
            if (!montageCard.A0L && (message = montageCard.A06) != null) {
                builder.m11011add((Object) message);
            }
        }
        return builder.build();
    }

    public static ImmutableList A02(ImmutableList immutableList, ImmutableList immutableList2) {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        builder.addAll(immutableList);
        if (immutableList2 != null) {
            1Du it = immutableList2.iterator();
            while (it.hasNext()) {
                MontageFeedbackOverlay montageFeedbackOverlay = (MontageFeedbackOverlay) it.next();
                if (montageFeedbackOverlay.A0A != null || montageFeedbackOverlay.A00 != null || montageFeedbackOverlay.A01 != null || montageFeedbackOverlay.A08 != null) {
                    builder.m11011add((Object) montageFeedbackOverlay);
                }
            }
        }
        return builder.build();
    }
}
