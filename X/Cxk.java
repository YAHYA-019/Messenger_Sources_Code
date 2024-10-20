package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.community.mca.MailboxCommunityJNI;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mca.MailboxObservableImpl;
import com.facebook.simplejni.NativeHolder;
import com.google.common.collect.ImmutableList;

/* loaded from: Cxk.class */
public final class Cxk implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public Cxk(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        ThreadKey A01;
        Mailbox mailbox;
        MailboxFutureImpl mailboxFutureImpl;
        Object A0T;
        Ic0 ic0;
        String str;
        String str2;
        int i;
        switch (this.A00) {
            case 0:
                AbM.A1O((MailboxObservableImpl) this.A02, (NativeHolder) MailboxCommunityJNI.dispatchOIOO(2, 4, obj, new Iby(this, 1)), this.A03);
                return;
            case 1:
                MailboxNullable mailboxNullable = (MailboxNullable) obj;
                11T.A0F(mailboxNullable, 0);
                Object obj2 = mailboxNullable.value;
                if (obj2 == null) {
                    1Br.A04(((CbM) this.A03).A01).D0v("BroadcastFlowRecentsFetcher", "Failed to load recent threads from MSYS!");
                    return;
                }
                1qX r0 = (1qX) obj2;
                if (r0 != null) {
                    FbUserSession fbUserSession = (FbUserSession) this.A01;
                    1FX r02 = (1FX) this.A02;
                    ImmutableList.Builder A0h = 4YU.A0h();
                    int A00 = 1qX.A00(r0);
                    for (int i2 = 0; i2 < A00; i2++) {
                        Long nullableLong = r0.mResultSet.getNullableLong(i2, 0);
                        if (nullableLong != null) {
                            long longValue = nullableLong.longValue();
                            int integer = r0.mResultSet.getInteger(i2, 1);
                            boolean A1X = 1BK.A1X(r0.mResultSet.getNullableBoolean(i2, 30), true);
                            if (integer == -2) {
                                A01 = ThreadKey.A01(longValue);
                            } else if (integer != -1) {
                                if (integer != 1) {
                                    if (integer == 2) {
                                        A01 = ThreadKey.A08(longValue);
                                    } else if (integer == 18) {
                                        A01 = ThreadKey.A03(longValue);
                                    } else if (integer == 201) {
                                        A01 = ThreadKey.A0F(longValue, 7zO.A0C(fbUserSession));
                                    }
                                }
                                A01 = ThreadKey.A0H(longValue, 7zO.A0C(fbUserSession));
                            } else {
                                if (!A1X) {
                                    A01 = ThreadKey.A02(longValue);
                                }
                                A01 = ThreadKey.A0H(longValue, 7zO.A0C(fbUserSession));
                            }
                            11T.A0D(A01);
                            if (A01.A18()) {
                                long A05 = AbL.A05(A01);
                                1Kh A0y = AbF.A0y();
                                A0y.A05(0Pz.A0h("", "", A05));
                                AbH.A1U(A0y, 7zP.A0j(r0, i2));
                                A0y.A1R = 7zP.A0l(r0, i2);
                                A0y.A13 = 4YV.A0q(r0, i2);
                                AbM.A1Q(A0y, A0h);
                            }
                        }
                    }
                    r02.set(1Fj.A01(A0h));
                    return;
                }
                return;
            case 2:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                A0T = 1BL.A0T();
                ic0 = new Ic0(this, ActionId.VIDEO_SET_RENDERER_CONTEXT);
                str = "MCAMailboxSearch";
                str2 = "UniversalSearchAttachmentQuery";
                C1qL c1qL = C00683ob.A00;
                i = 0;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, i, str, str2, ic0);
                return;
            default:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A02;
                A0T = false;
                ic0 = new Ic0(this, ActionId.COMPONENTS_DATA_SOURCE_DID_END_UPDATES);
                str = "MCAMailboxSearch";
                str2 = "IssueAttachmentSearchQuery";
                i = 1;
                C1qL c1qL2 = C00683ob.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, i, str, str2, ic0);
                return;
        }
    }
}
