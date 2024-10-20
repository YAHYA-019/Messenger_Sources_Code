package X;

import java.util.BitSet;

/* renamed from: X.Att, reason: case insensitive filesystem */
/* loaded from: Att.class */
public final class C1820Att extends C1rs {
    public 1Iw A00;
    public B0v A01;
    public final BitSet A02;
    public final String[] A03;

    public C1820Att(1Iw r302, B0v b0v) {
        super(b0v, r302, 0, 0);
        this.A03 = new String[]{"actionButtonText", "allowMembersToInviteToPrivateChannel", "channelCategory", "channelDescription", "channelName", "colorScheme", "communityId", "defaultChannelImage", "emoji", "fbUserSession", "gradientColors", "groupId", "hasFieldChanged", "isChannelCreation", "isFromTemplate", "isMemberSuggestionOrCreation", "listener", "nameInputPlaceholderText", "showCategorySelectionField", "showNameAndDescriptionFields", "showThreadImageField", "threadTileViewData", "threadType", "titleRes", "upListener"};
        BitSet A18 = 1BK.A18(25);
        this.A02 = A18;
        this.A01 = b0v;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A05(this.A02, this.A03, 25);
        A0J();
        return this.A01;
    }
}
