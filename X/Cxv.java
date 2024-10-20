package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messengerrankingextension.mca.MailboxMessengerRankingExtensionJNI;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.util.NotificationScope;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: Cxv.class */
public final class Cxv implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public Cxv(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A04 = obj2;
        this.A03 = obj4;
        this.A01 = obj;
        this.A02 = obj3;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        switch (this.A00) {
            case 0:
                MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, (MailboxFutureImpl) this.A02, 1BL.A0T(), 0, 1, GOm.A00(ActionId.APPLY_FINISHED_LIST), "NotPresentedClientNotifications", new Ic0(this, 9));
                return;
            case 1:
                final 2SW r0 = (2SW) this.A04;
                1qX r02 = (1qX) ((MailboxNullable) obj).value;
                Number number = (Number) this.A03;
                11T.A0D(number);
                final long longValue = number.longValue();
                final BOq bOq = (BOq) this.A01;
                11T.A0D(bOq);
                MailboxFeature mailboxFeature = (MailboxFeature) this.A02;
                FbUserSession fbUserSession = r0.A01;
                if (r02 == null || 1qX.A00(r02) == 0) {
                    r0.A05.remove(number);
                    return;
                }
                final 1Br A01 = 1Lm.A01(fbUserSession, 68275);
                Long nullableLong = r02.mResultSet.getNullableLong(0, 0);
                if (nullableLong != null) {
                    final long longValue2 = nullableLong.longValue();
                    long A03 = 7zP.A03(r02, 0);
                    for (final EnumC03583yg enumC03583yg : EnumC03583yg.values()) {
                        Long valueOf = Long.valueOf(enumC03583yg.mValue);
                        if (valueOf != null && valueOf.longValue() == A03) {
                            int integer = r02.mResultSet.getInteger(0, 3);
                            final String A0i = 7zP.A0i(r02, 0);
                            long j = integer == 4096 ? longValue : longValue2;
                            long A0C = 7zO.A0C(fbUserSession);
                            PrivacyContext privacyContext = r0.A04;
                            MailboxCallback mailboxCallback = new MailboxCallback() { // from class: X.4Vx
                                @Override // com.facebook.msys.mca.MailboxCallback
                                public /* bridge */ /* synthetic */ void onCompletion(Object obj2) {
                                    1qX r03 = (1qX) obj2;
                                    if (r03.mResultSet.getCount() == 0) {
                                        r0.A05.remove(Long.valueOf(longValue));
                                        return;
                                    }
                                    ArrayList A0s = AnonymousClass001.A0s();
                                    int count = r03.mResultSet.getCount();
                                    for (int i = 0; i < count; i++) {
                                        Long nullableLong2 = r03.mResultSet.getNullableLong(i, 34);
                                        if (nullableLong2 == null) {
                                            return;
                                        }
                                        A0s.add(Long.valueOf(nullableLong2.longValue()));
                                    }
                                    C00i c00i = A01.A00;
                                    C4Ni c4Ni = (C4Ni) c00i.get();
                                    BOq bOq2 = bOq;
                                    ImmutableList copyOf = ImmutableList.copyOf((Collection) A0s);
                                    11T.A0A(copyOf);
                                    EnumC03583yg enumC03583yg2 = enumC03583yg;
                                    long j2 = longValue2;
                                    long j3 = longValue;
                                    String str = A0i;
                                    11T.A0F(bOq2, 0);
                                    if (1Br.A07(c4Ni.A00).AZk(72340881490907398L) || 1Br.A07(c4Ni.A02).AZk(36318999369692719L)) {
                                        C4Ni.A01(enumC03583yg2, bOq2, C4Re.GROUP_THREAD_CREATED_AUTHORITATIVELY, null, null, c4Ni, Boolean.valueOf(AnonymousClass001.A1T(str)), Long.valueOf(j2), Long.valueOf(j3), null, null, copyOf, true);
                                    }
                                    ((C4Ni) c00i.get()).A03.remove(Long.valueOf(j3));
                                }
                            };
                            1Um A0O = 1BK.A0O(mailboxFeature, 0);
                            MailboxFutureImpl A0Q = 1BK.A0Q(A0O, mailboxCallback);
                            1Um.A02(A0O, new CyV(integer, 6, A0C, j, mailboxFeature, privacyContext, A0Q), A0Q, false);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 2:
                Mailbox mailbox = (Mailbox) obj;
                String A1D = 7zM.A1D(BDX.A00, 3);
                NotificationScope A00 = mailbox.getSessionedNotificationCenterCallbackManager().A00(new Ic4(A1D, this, 8), A1D);
                7zL.A1O(A00, this.A02, A1D);
                MailboxMessengerRankingExtensionJNI.dispatchVOOOOOO(6, mailbox, "mldw_key", this.A03, null, this.A04, A00);
                return;
            case 3:
                MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, (MailboxFutureImpl) this.A03, false, 0, 1, null, (PrivacyContext) this.A04, 4YT.A00(231), "OnDemandFetchPresence", new Ic0(this, 90));
                return;
            default:
                MailboxFutureImpl mailboxFutureImpl = (MailboxFutureImpl) this.A02;
                MailboxNullable A0s = 7zL.A0s((Object) null);
                PrivacyContext privacyContext2 = (PrivacyContext) this.A04;
                Ic0 ic0 = new Ic0(this, ActionId.RTMP_CONNECTION_FAILED);
                C1qL c1qL = C00683ob.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, A0s, 0, 0, null, privacyContext2, "MCAMailboxSearch", "SearchThreadsContainingExactlySelectedUsers", ic0);
                return;
        }
    }
}
