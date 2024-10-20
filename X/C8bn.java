package X;

import com.facebook.messaging.communitymessaging.invitelink.model.CommunityJoinChainingChatData;
import com.facebook.messaging.communitymessaging.invitelink.model.CommunityMessagingInviteLinkData;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.8bn, reason: invalid class name */
/* loaded from: 8bn.class */
public final class C8bn extends 1LH {
    public final 9Hl A00;
    public final MigColorScheme A01;
    public final ImmutableList A02;
    public final boolean A03;
    public final CommunityMessagingInviteLinkData A04;
    public final boolean A05;

    public C8bn(9Hl r302, CommunityMessagingInviteLinkData communityMessagingInviteLinkData, MigColorScheme migColorScheme, ImmutableList immutableList, boolean z, boolean z2) {
        7zR.A1O(immutableList, migColorScheme);
        this.A04 = communityMessagingInviteLinkData;
        this.A02 = immutableList;
        this.A01 = migColorScheme;
        this.A03 = z;
        this.A00 = r302;
        this.A05 = z2;
    }

    public 1LI A0s(C2k5 c2k5) {
        boolean A1W = 7zL.A1W(c2k5);
        2lO A0K = 4YV.A0K((2lO) null, 0S2.A04, 4YV.A06(2RH.A05));
        DD4 dd4 = new DD4(this, 1);
        Integer num = 0S2.A00;
        2lO A0Z = 7zQ.A0Z(A0K, num, dd4);
        C2sn A0L = 7zR.A0L(c2k5);
        2lO A0L2 = 4YV.A0L((2lO) null, num, C1ro.FLEX_END, A1W ? 1 : 0);
        1Iw r0 = A0L.A00;
        C2sn A0U = 7zQ.A0U(r0);
        8TX A00 = C8nl.A00(A0U.A00);
        MigColorScheme migColorScheme = this.A01;
        A00.A2Z(migColorScheme);
        A00.A2a(3yH.A09(A0U, 2131958499));
        A00.A2Y(C9py.A03(this, 45));
        7zQ.A1E(A00.A2W(), A0U, A0L, A0L2);
        C1ro c1ro = C1ro.CENTER;
        Integer num2 = 0S2.A01;
        2lO A04 = C82m.A04(null, num2, 60.0f, A1W ? 1 : 0);
        C2sn A0U2 = 7zQ.A0U(r0);
        1Iw r02 = A0U2.A00;
        2KD A0X = 7zN.A0X(r02, migColorScheme, A1W ? 1 : 0);
        A0X.A2g();
        A0X.A2b();
        A0X.A2a();
        A0X.A1y(c1ro);
        String str = this.A04.A0H;
        11T.A0A(str);
        A0X.A2z(3yH.A0A(A0U2, str, 2131958501));
        2RH r03 = 2RH.A06;
        long A06 = 4YV.A06(r03);
        long A062 = 4YV.A06(r03);
        2lO A0K2 = 4YV.A0K((2lO) null, 0S2.A15, A06);
        Integer num3 = 0S2.A1J;
        7zS.A1K(A0X, A0K2, num3, A062);
        2KD A0d = 7zR.A0d(r02, A0U2, A0X, A1W ? 1 : 0);
        A0d.A2x(migColorScheme);
        A0d.A2n();
        A0d.A2b();
        A0d.A2a();
        A0d.A1y(c1ro);
        C5z7.A00(A0d, 7zT.A0d((2lO) null, 2RH.A08, num3));
        7zM.A1X(A0d, A0U2, 2131958500);
        7zN.A1Q(A0U2, A0d);
        2lO A0d2 = 7zT.A0d(C82m.A04(null, num2, 85.0f, A1W ? 1 : 0), r03, num3);
        long A08 = 7zP.A08();
        2NI r04 = C8nc.A0O;
        1Iw AeS = A0U2.AeS();
        C02A c02a = AeS.A03.A01;
        C1J8 c1j8 = c02a.A02;
        boolean z = c02a.A0X;
        C9bp c9bp = new C9bp();
        ImmutableList immutableList = this.A02;
        ArrayList A0z = 1BL.A0z(immutableList);
        Iterator it = immutableList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                C0s8.A18();
                throw 0Q8.createAndThrow();
            }
            CommunityJoinChainingChatData communityJoinChainingChatData = (CommunityJoinChainingChatData) next;
            long j = communityJoinChainingChatData.A00;
            boolean z2 = true;
            if (i != immutableList.size() - 1) {
                z2 = false;
            }
            c9bp.A00(new QH6(this.A00, communityJoinChainingChatData, migColorScheme, z2, this.A03), Long.valueOf(j), A1W);
            A0z.add(04S.A00);
            i = i2;
        }
        A0U2.A00(new C8ej(r04, null, null, A0d2, null, C9mj.A02(AeS, c1j8, 7zN.A03(A0U2, A08), z), c9bp, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true));
        7zN.A1L(A0U2, A0L, A04);
        8TZ A002 = C8nr.A00(r0);
        A002.A2a(migColorScheme);
        A002.A2c(this.A05);
        A002.A2Y(2131958498);
        A002.A2Z(C9py.A03(this, 46));
        return 7zM.A0l(A002.A2W(), A0L, c2k5, A0Z);
    }
}
