package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.msys.contacts.plugins.user.threadviewotheruser.ThreadViewOtherUserLoaderImplementation;
import com.facebook.messaging.presence.plugins.core.communitythreadsubtitledata.CommunityPresenceThreadSubtitleData;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableList;
import java.util.Set;

/* loaded from: Gs9.class */
public final class Gs9 extends C21h {
    public final int A00 = 0;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gs9(Eq1 eq1) {
        super("contact_share_settings_by_id");
        this.A01 = eq1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gs9(I2j i2j) {
        super("get_user_control_action_state");
        this.A01 = i2j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gs9(I2r i2r) {
        super("presence_state_for_all_users");
        this.A01 = i2r;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gs9(I9B i9b) {
        super("orca_contact_list");
        this.A01 = i9b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gs9(RfA rfA) {
        super("orca_contact_list");
        this.A01 = rfA;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gs9(ThreadViewOtherUserLoaderImplementation threadViewOtherUserLoaderImplementation) {
        super("orca_contact_list");
        this.A01 = threadViewOtherUserLoaderImplementation;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gs9(CommunityPresenceThreadSubtitleData communityPresenceThreadSubtitleData) {
        super("get_channel_active_count");
        this.A01 = communityPresenceThreadSubtitleData;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    @Override // X.C21h
    public void A00(Set set) {
        1Um AQV;
        MailboxFutureImpl A0Q;
        Ib2 ibK;
        C2eo c2eo;
        ImmutableList of;
        C9wa ixz;
        boolean z;
        switch (this.A00) {
            case 0:
                Eq1 eq1 = (Eq1) this.A01;
                ((22Y) 1Br.A0B(eq1.A03)).A00(eq1.A05);
                return;
            case 1:
                0fH.A0j("HideContactListener", "onObservedStoredProcedureChanged triggered");
                I2j i2j = (I2j) this.A01;
                if (!i2j.A00) {
                    0fH.A0j("HideContactListener", "onObservedStoredProcedureChanged ignored");
                    return;
                }
                MailboxFeature A0d = 7zP.A0d(i2j.A07);
                long A03 = AbG.A03(i2j.A0A.A13);
                int i = i2j.A01;
                PrivacyContext A00 = ((AnonymousClass224) 1Br.A0B(i2j.A06)).A00("335567417973647");
                Iby iby = new Iby(i2j, 10);
                AQV = A0d.mMailboxApiHandleMetaProvider.AQV(0);
                A0Q = 1BK.A0Q(AQV, iby);
                ibK = new IbK(i, 4, A03, A0d, A00, A0Q);
                1Um.A02(AQV, ibK, A0Q, false);
                return;
            case 2:
                ThreadViewOtherUserLoaderImplementation threadViewOtherUserLoaderImplementation = (ThreadViewOtherUserLoaderImplementation) this.A01;
                if (threadViewOtherUserLoaderImplementation.A07.get()) {
                    c2eo = (C2eo) 1Br.A0B(threadViewOtherUserLoaderImplementation.A01);
                    of = ImmutableList.of((Object) Long.valueOf(threadViewOtherUserLoaderImplementation.A04.A02));
                    ixz = new IXZ(threadViewOtherUserLoaderImplementation, 0);
                    c2eo.A07(ixz, of);
                    return;
                }
                return;
            case 3:
                CommunityPresenceThreadSubtitleData communityPresenceThreadSubtitleData = (CommunityPresenceThreadSubtitleData) this.A01;
                synchronized (this) {
                    z = communityPresenceThreadSubtitleData.A00;
                }
                if (z) {
                    ThreadKey threadKey = communityPresenceThreadSubtitleData.A06;
                    0fH.A0g(Long.valueOf(threadKey.A04), "CommunityPresenceThreadSubtitleData", "onStoredProcedureChanged GetChannelActiveCount for channel %d");
                    CommunityPresenceThreadSubtitleData.A00(threadKey, communityPresenceThreadSubtitleData);
                    return;
                }
                return;
            case 4:
                I9B i9b = (I9B) this.A01;
                8Lr r0 = i9b.A00;
                if (r0 != null) {
                    C2623GjD c2623GjD = (C2623GjD) r0.A00;
                    long j = c2623GjD.A00;
                    ThreadKey threadKey2 = c2623GjD.A02;
                    boolean z2 = r0.A01;
                    C5y7 c5y7 = i9b.A0C;
                    IbP ibP = new IbP(2, r0, c2623GjD, threadKey2, i9b, z2);
                    C5y8 c5y8 = c5y7.A03;
                    PrivacyContext A002 = ((AnonymousClass224) 1Br.A0B(c5y7.A02)).A00(4YT.A00(502));
                    AQV = c5y8.mMailboxApiHandleMetaProvider.AQV(0);
                    A0Q = 1BK.A0Q(AQV, ibP);
                    ibK = new Ib2(2, j, c5y8, A0Q, A002);
                    1Um.A02(AQV, ibK, A0Q, false);
                    return;
                }
                return;
            case 5:
                RfA rfA = (RfA) this.A01;
                Capabilities capabilities = RfA.A0B;
                if (rfA.A00 != -1) {
                    c2eo = (C2eo) 1Br.A0B(rfA.A03);
                    of = ImmutableList.of((Object) Long.valueOf(rfA.A00));
                    ixz = new C9wa(rfA, 1);
                    c2eo.A07(ixz, of);
                    return;
                }
                return;
            default:
                C00j.A05(".onObservedStoredProcedureChanged", 1624911779);
                try {
                    ((I2r) this.A01).A01();
                    C00j.A01(-1794211369);
                    return;
                } catch (Throwable th) {
                    C00j.A01(-637017353);
                    throw th;
                }
        }
    }
}
