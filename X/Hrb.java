package X;

import com.facebook.messaging.montage.model.cards.MontageFeedbackOverlay;
import com.facebook.messaging.montage.model.cards.MontageFeedbackPoll;
import com.facebook.messaging.montage.model.cards.MontageFeedbackPollOption;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.Collections;

/* loaded from: Hrb.class */
public final class Hrb {
    public final java.util.Map A01 = Collections.synchronizedMap(new 0QO(0));
    public final java.util.Map A00 = Collections.synchronizedMap(new 0QO(0));

    public void A00(ImmutableList immutableList, String str) {
        MontageFeedbackPoll montageFeedbackPoll;
        ImmutableSet immutableSet;
        if (immutableList != null) {
            0WH A07 = AbI.A07();
            1Du it = immutableList.iterator();
            while (it.hasNext()) {
                MontageFeedbackOverlay montageFeedbackOverlay = (MontageFeedbackOverlay) it.next();
                if (montageFeedbackOverlay != null && (montageFeedbackPoll = montageFeedbackOverlay.A03) != null) {
                    1Du it2 = montageFeedbackPoll.A03.iterator();
                    while (it2.hasNext()) {
                        MontageFeedbackPollOption montageFeedbackPollOption = (MontageFeedbackPollOption) it2.next();
                        if (montageFeedbackPollOption != null && (immutableSet = montageFeedbackPollOption.A00) != null && !immutableSet.isEmpty()) {
                            A07.addAll(immutableSet);
                        }
                    }
                }
            }
            this.A00.put(str, A07);
        }
    }

    public void A01(1Mu r302, String str) {
        if (r302 != null) {
            0WH A07 = AbI.A07();
            for (UserKey userKey : r302.BXh()) {
                if (userKey != null) {
                    A07.add(userKey.id);
                }
            }
            this.A01.put(str, A07);
        }
    }
}
