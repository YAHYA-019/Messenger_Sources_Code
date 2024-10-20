package X;

import android.view.View;
import com.facebook.messaging.communitymessaging.model.CommunityChannelPrivacyType;
import com.facebook.messaging.communitymessaging.model.CommunityExtraData;
import com.facebook.messaging.communitymessaging.plugins.channelorganization.manageemptystate.managechannelemptystate.ManageChannelEmptyStateImplementation;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;

/* renamed from: X.3UF, reason: invalid class name */
/* loaded from: 3UF.class */
public final class C3UF implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public C3UF(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        IllegalStateException A0N;
        int i2;
        String str;
        switch (this.A00) {
            case 0:
                A05 = 0FI.A05(1492776198);
                1vD.A00((View) this.A01).CeH("TakeProfilePictureFragment");
                i = 141918696;
                0FI.A0B(i, A05);
                return;
            case 1:
                A05 = 0FI.A05(-1594221052);
                2PZ r0 = (2PZ) this.A01;
                ((C47h) 1Br.A0B(r0.A06)).A00();
                ((2Pi) 1Br.A0B(r0.A0C)).A01();
                1Br.A0C(r0.A0A);
                ((2Pe) 1Br.A0B(r0.A08)).D5o();
                2PZ.A00(r0);
                i = -77771112;
                0FI.A0B(i, A05);
                return;
            default:
                A05 = 0FI.A05(-472517207);
                ManageChannelEmptyStateImplementation manageChannelEmptyStateImplementation = (ManageChannelEmptyStateImplementation) this.A01;
                ParcelableSecondaryData parcelableSecondaryData = (ParcelableSecondaryData) manageChannelEmptyStateImplementation.A02.A01;
                if (parcelableSecondaryData != null) {
                    CommunityExtraData communityExtraData = (CommunityExtraData) ParcelableSecondaryData.A00(parcelableSecondaryData, CommunityExtraData.class, null);
                    if (communityExtraData == null || (str = communityExtraData.A06) == null) {
                        A0N = AnonymousClass001.A0N("communityId shouldn't be null");
                        i2 = 1190646613;
                    } else {
                        CommunityExtraData communityExtraData2 = (CommunityExtraData) ParcelableSecondaryData.A00(parcelableSecondaryData, CommunityExtraData.class, null);
                        if (communityExtraData2 != null) {
                            long j = communityExtraData2.A00;
                            if (Long.valueOf(j) != null) {
                                1Bn.A0A(147536);
                                CHV.A00(new CHV(manageChannelEmptyStateImplementation.A00, manageChannelEmptyStateImplementation.A01, (CommunityChannelPrivacyType) null, manageChannelEmptyStateImplementation.A03, AbE.A00(58), (String) null, "messenger_community_messaging:category_organize_screen", str, (String) null, j), false);
                                i = -2125951537;
                                0FI.A0B(i, A05);
                                return;
                            }
                        }
                        A0N = AnonymousClass001.A0N("groupId shouldn't be null");
                        i2 = 140366375;
                    }
                } else {
                    A0N = AnonymousClass001.A0N("extradata shouldn't be null");
                    i2 = 451700988;
                }
                0FI.A0B(i2, A05);
                throw A0N;
        }
    }
}
