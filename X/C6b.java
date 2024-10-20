package X;

import com.facebook.messaging.communitymessaging.model.CommunityChannelPrivacyType;

/* loaded from: C6b.class */
public final class C6b {
    public final /* synthetic */ AlQ A00;

    public C6b(AlQ alQ) {
        this.A00 = alQ;
    }

    public void A00() {
        AlQ alQ = this.A00;
        if (AlQ.A0B(alQ)) {
            if (CNn.A00(alQ).A01 == CommunityChannelPrivacyType.BROADCAST) {
                AlQ.A0A(alQ, "choose_standard_chat_type", "chat_type", (java.util.Map) null);
                AlQ.A03(alQ).A05(CommunityChannelPrivacyType.PUBLIC);
                return;
            }
            return;
        }
        AfY afY = alQ.A03;
        if (afY != null) {
            if (afY.A00() != CommunityChannelPrivacyType.BROADCAST) {
                return;
            }
            AlQ.A0A(alQ, "choose_standard_chat_type", "chat_type", (java.util.Map) null);
            AfY afY2 = alQ.A03;
            if (afY2 != null) {
                7zP.A0O(afY2.A07).A00(afY2.A01, CommunityChannelPrivacyType.PUBLIC);
                return;
            }
        }
        11T.A0L("channelCreationViewModel");
        throw 0Q8.createAndThrow();
    }

    public void A01() {
        AlQ alQ = this.A00;
        AlQ.A0A(alQ, "choose_view_only_chat_type", "chat_type", (java.util.Map) null);
        if (AlQ.A0B(alQ)) {
            AlQ.A03(alQ).A05(CommunityChannelPrivacyType.BROADCAST);
            return;
        }
        AfY afY = alQ.A03;
        if (afY == null) {
            11T.A0L("channelCreationViewModel");
            throw 0Q8.createAndThrow();
        }
        7zP.A0O(afY.A07).A00(afY.A01, CommunityChannelPrivacyType.BROADCAST);
    }
}
