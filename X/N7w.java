package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mci.PrivacyContext;
import java.util.List;

/* loaded from: N7w.class */
public final class N7w implements MailboxCallback {
    public final /* synthetic */ BDU A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ PrivacyContext A02;
    public final /* synthetic */ Boolean A03;
    public final /* synthetic */ Boolean A04;
    public final /* synthetic */ Boolean A05;
    public final /* synthetic */ Boolean A06;
    public final /* synthetic */ Boolean A07;
    public final /* synthetic */ Boolean A08;
    public final /* synthetic */ Boolean A09;
    public final /* synthetic */ Boolean A0A;
    public final /* synthetic */ Boolean A0B;
    public final /* synthetic */ Boolean A0C;
    public final /* synthetic */ Boolean A0D;
    public final /* synthetic */ Boolean A0E;
    public final /* synthetic */ Boolean A0F;
    public final /* synthetic */ Boolean A0G;
    public final /* synthetic */ Boolean A0H;
    public final /* synthetic */ Boolean A0I;
    public final /* synthetic */ Boolean A0J;
    public final /* synthetic */ Boolean A0K;
    public final /* synthetic */ Boolean A0L;
    public final /* synthetic */ Number A0M;
    public final /* synthetic */ Number A0N;
    public final /* synthetic */ Number A0O;
    public final /* synthetic */ List A0P;

    public N7w(BDU bdu, MailboxFutureImpl mailboxFutureImpl, PrivacyContext privacyContext, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Number number, Number number2, Number number3, List list) {
        this.A00 = bdu;
        this.A01 = mailboxFutureImpl;
        this.A02 = privacyContext;
        this.A0B = bool;
        this.A0A = bool2;
        this.A0N = number;
        this.A0H = bool3;
        this.A09 = bool4;
        this.A0F = bool5;
        this.A03 = bool6;
        this.A0L = bool7;
        this.A0K = bool8;
        this.A0P = list;
        this.A0I = bool9;
        this.A07 = bool10;
        this.A0E = bool11;
        this.A08 = bool12;
        this.A0M = number2;
        this.A0D = bool13;
        this.A05 = bool14;
        this.A0G = bool15;
        this.A0J = bool16;
        this.A0C = bool17;
        this.A0O = number3;
        this.A06 = bool18;
        this.A04 = bool19;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFutureImpl mailboxFutureImpl = this.A01;
        MailboxNullable A0s = 7zL.A0s((Object) null);
        PrivacyContext privacyContext = this.A02;
        N85 A00 = N85.A00(this, 6);
        String A002 = AbE.A00(298);
        C1qL c1qL = BDU.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, A0s, 0, 1, null, privacyContext, A002, "BcfRecentThreads", A00);
    }
}
