package X;

import android.content.Context;
import com.facebook.litho.LithoView;
import com.facebook.messaging.communitymessaging.model.ChannelMember;
import com.facebook.messaging.communitymessaging.model.Member;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: Cy1.class */
public final class Cy1 implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final boolean A04;

    public Cy1(Object obj, Object obj2, String str, int i, boolean z) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
        this.A03 = str;
        this.A04 = z;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        ChannelMember channelMember;
        int i;
        Mailbox mailbox;
        MailboxFutureImpl mailboxFutureImpl;
        Object A0T;
        Czl A00;
        String str;
        String str2;
        int i2;
        switch (this.A00) {
            case 0:
                MailboxNullable mailboxNullable = (MailboxNullable) obj;
                if (mailboxNullable != null) {
                    CFT cft = (CFT) this.A02;
                    C0G c0g = (C0G) this.A01;
                    String str3 = this.A03;
                    boolean z = this.A04;
                    1qX r0 = (1qX) mailboxNullable.value;
                    if (r0 != null) {
                        ArrayList A0s = AnonymousClass001.A0s();
                        int A002 = 1qX.A00(r0);
                        for (int i3 = 0; i3 < A002; i3++) {
                            String A11 = 4YU.A11(r0, i3, 0);
                            11T.A0A(A11);
                            boolean A1O = AnonymousClass001.A1O(A11.length());
                            String A112 = 4YU.A11(r0, i3, 1);
                            11T.A0A(A112);
                            if (A112.length() != 0) {
                                if (A1O) {
                                    String A113 = 4YU.A11(r0, i3, 1);
                                    AbF.A1U(A113);
                                    Member member = new Member(null, null, null, null, "", A113, "", "", null, "", 0, 0L, 0L, 0L, 0L, AbK.A11(r0.mResultSet, i3, 15, false).booleanValue(), false, false, false, false, false, false, false, false, false);
                                    String A0l = 7zP.A0l(r0, i3);
                                    11T.A0A(A0l);
                                    channelMember = new ChannelMember(member, null, null, A0l, false, AbK.A11(r0.mResultSet, i3, 6, true).booleanValue(), AbK.A11(r0.mResultSet, i3, 7, true).booleanValue(), true);
                                } else {
                                    int ordinal = ((C1yf) 1Br.A0B(cft.A08)).A00(r0.mResultSet.getInteger(i3, 4)).ordinal();
                                    if (ordinal == 1 || ordinal == 14) {
                                        long A03 = AbG.A03(4YU.A11(r0, i3, 0));
                                        String A114 = 4YU.A11(r0, i3, 1);
                                        11T.A0A(A114);
                                        String A0l2 = 7zP.A0l(r0, i3);
                                        11T.A0A(A0l2);
                                        String A0j = 7zP.A0j(r0, i3);
                                        11T.A0A(A0j);
                                        channelMember = new ChannelMember(null, new C1779AsD(null, null, null, A114, A0l2, null, A0j, null, 7zU.A0o(r0, i3), A03), null, "", true, false, false, false);
                                    } else {
                                        long A032 = AbG.A03(4YU.A11(r0, i3, 0));
                                        String A115 = 4YU.A11(r0, i3, 1);
                                        AbF.A1U(A115);
                                        String A0j2 = 7zP.A0j(r0, i3);
                                        C1pq.A08("profilePicUrl", A0j2);
                                        Member member2 = new Member(null, null, null, null, "", A115, "", A0j2, 7zP.A0r(r0, i3), "", 0, 0L, 0L, A032, 0L, AbK.A11(r0.mResultSet, i3, 15, false).booleanValue(), false, false, false, false, false, AbK.A11(r0.mResultSet, i3, 7, true).booleanValue(), false, false, false);
                                        String A0l3 = 7zP.A0l(r0, i3);
                                        11T.A0A(A0l3);
                                        channelMember = new ChannelMember(member2, null, AbK.A11(r0.mResultSet, i3, 14, false), A0l3, false, AbK.A11(r0.mResultSet, i3, 6, true).booleanValue(), AbK.A11(r0.mResultSet, i3, 7, true).booleanValue(), false);
                                    }
                                }
                                A0s.add(channelMember);
                            }
                        }
                        c0g.A00(str3, A0s, z);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                AmK amK = (AmK) this.A01;
                int size = ((List) this.A02).size();
                boolean z2 = this.A04;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                String str4 = this.A03;
                Context context = amK.getContext();
                if (context != null) {
                    int A01 = booleanValue ? ((C5rp) amK.A0U.get()).A01(context, amK.A0C) : context.getColor(2132214339);
                    LithoView lithoView = amK.A05;
                    if (booleanValue) {
                        i = 2131820781;
                        if (z2) {
                            i = 2131820779;
                        }
                    } else {
                        i = 2131820780;
                        if (z2) {
                            i = 2131820778;
                        }
                    }
                    AmK.A07(lithoView, amK, 7zO.A0D(amK).getQuantityString(i, size, Integer.valueOf(size), str4), A01);
                    return;
                }
                return;
            case 2:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A02;
                A0T = 1BL.A0T();
                A00 = Czl.A00(this, 41);
                str = "MCAMailboxSearch";
                str2 = "CommunitySearchResults";
                C1qL c1qL = C00683ob.A00;
                i2 = 0;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, i2, str, str2, A00);
                return;
            default:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A02;
                A0T = false;
                A00 = Czl.A00(this, 100);
                str = 1BJ.A00(790);
                str2 = "OptimisticDeleteThenInsertUserPrefBool";
                i2 = 1;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, i2, str, str2, A00);
                return;
        }
    }
}
