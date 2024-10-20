package X;

import com.facebook.broadcastflow.mca.MailboxBroadcastFlowJNI;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.util.NotificationScope;
import java.util.List;

/* loaded from: Cz1.class */
public final class Cz1 implements MailboxCallback {
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
    public final /* synthetic */ Boolean A0M;
    public final /* synthetic */ Boolean A0N;
    public final /* synthetic */ Number A0O;
    public final /* synthetic */ Number A0P;
    public final /* synthetic */ Number A0Q;
    public final /* synthetic */ Number A0R;
    public final /* synthetic */ Number A0S;
    public final /* synthetic */ Number A0T;
    public final /* synthetic */ Number A0U;
    public final /* synthetic */ List A0V;

    public Cz1(BDU bdu, MailboxFutureImpl mailboxFutureImpl, PrivacyContext privacyContext, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, Boolean bool21, Number number, Number number2, Number number3, Number number4, Number number5, Number number6, Number number7, List list) {
        this.A00 = bdu;
        this.A01 = mailboxFutureImpl;
        this.A0T = number;
        this.A0R = number2;
        this.A0A = bool;
        this.A0P = number3;
        this.A09 = bool2;
        this.A03 = bool3;
        this.A0G = bool4;
        this.A0J = bool5;
        this.A08 = bool6;
        this.A0F = bool7;
        this.A05 = bool8;
        this.A0N = bool9;
        this.A0S = number4;
        this.A0U = number5;
        this.A0K = bool10;
        this.A0V = list;
        this.A04 = bool11;
        this.A0I = bool12;
        this.A06 = bool13;
        this.A0H = bool14;
        this.A0E = bool15;
        this.A0M = bool16;
        this.A0L = bool17;
        this.A07 = bool18;
        this.A0O = number6;
        this.A0D = bool19;
        this.A0Q = number7;
        this.A0B = bool20;
        this.A0C = bool21;
        this.A02 = privacyContext;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        String A1D = 7zM.A1D(BDU.A00, 1);
        NotificationScope CcE = mailbox.getSessionedNotificationCenterCallbackManager().CcE(new Czn(this, 1), A1D, 1);
        this.A01.setNotification(A1D, CcE);
        MailboxBroadcastFlowJNI.dispatchVOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO(0, mailbox, this.A0T, this.A0R, this.A0A, this.A0P, this.A09, this.A03, this.A0G, this.A0J, this.A08, this.A0F, this.A05, this.A0N, this.A0S, this.A0U, this.A0K, this.A0V, this.A04, this.A0I, this.A06, this.A0H, this.A0E, this.A0M, this.A0L, this.A07, this.A0O, this.A0D, this.A0Q, this.A0B, this.A0C, this.A02, CcE);
    }
}
