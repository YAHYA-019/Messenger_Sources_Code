package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.google.common.util.concurrent.SettableFuture;
import java.io.File;

/* loaded from: Ib6.class */
public final class Ib6 implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public Ib6(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A04 = str;
        this.A03 = obj2;
        this.A02 = obj3;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox;
        MailboxFutureImpl mailboxFutureImpl;
        HyD A0T;
        Ic0 A00;
        String str;
        String str2;
        int i;
        1FX r303;
        9Pv A03;
        79P r310;
        switch (this.A00) {
            case 0:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A02;
                A0T = 1BL.A0T();
                A00 = Ic0.A00(this, 60);
                str = "MCAMailboxGIF";
                str2 = "SerializeQueryToToken";
                i = 1;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, i, str, str2, A00);
                return;
            case 1:
                if (!7zP.A1W(obj)) {
                    0fH.A0k("[MP] LegacyAttachmentHandler", "Fail to update file path");
                    return;
                }
                0fH.A0j("[MP] LegacyAttachmentHandler", "Success update file path");
                Context context = (Context) this.A01;
                String str3 = this.A04;
                Uri uri = (Uri) this.A03;
                Uri fromFile = Uri.fromFile((File) this.A02);
                11T.A0A(fromFile);
                C7uM.A02(context, uri, fromFile, str3);
                return;
            case 2:
                1qX A14 = 7zM.A14((MailboxNullable) obj);
                if (A14 != null) {
                    if (1qX.A00(A14) != 0) {
                        int A002 = 1qX.A00(A14);
                        for (int i2 = 0; i2 < A002; i2++) {
                            String string = A14.mResultSet.getString(i2, 0);
                            String str4 = this.A04;
                            if (11T.A0O(string, str4)) {
                                int integer = A14.mResultSet.getInteger(i2, 1);
                                if (integer != 1) {
                                    79V r0 = (79V) this.A03;
                                    FbUserSession fbUserSession = (FbUserSession) this.A01;
                                    79V.A00(fbUserSession, r0);
                                    if (integer == 2) {
                                        r0.A01 = ((GsF) 1Lm.A05(r0.A04, fbUserSession, 84157)).A00(new Iaj(this.A02, r0, 6), str4);
                                        return;
                                    } else {
                                        if (integer == 3) {
                                            r303 = (1FX) this.A02;
                                            A03 = r0.A03((Gsi) null);
                                            r303.set(A03);
                                            return;
                                        }
                                        return;
                                    }
                                }
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A02;
                A0T = 1BL.A0T();
                A00 = Ic0.A00(this, ActionId.ABORTED);
                str = "MCAMailboxReactionV2";
                str2 = "GetReactionsV2DetailsRange";
                C1qL c1qL = GsM.A00;
                i = 0;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, i, str, str2, A00);
                return;
            case 4:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A02;
                A0T = new HyD((Number) null, (Number) null);
                A00 = Ic0.A00(this, ActionId.MESSENGER_QUEUE_CREATION);
                str = "MCAMailboxShim";
                str2 = "SHIMClientThreadCreateOptimistic";
                i = 1;
                C1qL c1qL2 = 5P5.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, i, str, str2, A00);
                return;
            case 5:
                1qX A142 = 7zM.A14((MailboxNullable) obj);
                if (A142 == null || 1qX.A00(A142) == 0) {
                    return;
                }
                int A003 = 1qX.A00(A142);
                for (int i3 = 0; i3 < A003; i3++) {
                    int A032 = 7zP.A03(A142, i3);
                    r310 = (79P) this.A03;
                    if (A032 == r310.A06) {
                        int integer2 = A142.mResultSet.getInteger(i3, 1);
                        if (integer2 != 1) {
                            FbUserSession fbUserSession2 = (FbUserSession) this.A01;
                            79P.A02(fbUserSession2, r310);
                            if (integer2 == 2) {
                                79P.A03(fbUserSession2, r310, (SettableFuture) this.A02, this.A04);
                                return;
                            }
                            r303 = (1FX) this.A02;
                            A03 = 79P.A01(r310.A05);
                            r303.set(A03);
                            return;
                        }
                        return;
                    }
                }
                return;
            default:
                if (!AnonymousClass001.A1V(obj)) {
                    r303 = (1FX) this.A02;
                    r310 = (79P) this.A03;
                    A03 = 79P.A01(r310.A05);
                    r303.set(A03);
                    return;
                }
                79P r02 = (79P) this.A03;
                FbUserSession fbUserSession3 = (FbUserSession) this.A01;
                String str5 = this.A04;
                SettableFuture settableFuture = (SettableFuture) this.A02;
                79P.A02(fbUserSession3, r02);
                Gs8 gs8 = new Gs8(fbUserSession3, r02, settableFuture, str5);
                r02.A00 = gs8;
                C21S.A00(gs8, (1Uj) 1Lm.A05(r02.A08, fbUserSession3, 16686));
                return;
        }
    }
}
