package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.util.NotificationScope;
import com.facebook.search.mca.MailboxSearchJNI;

/* loaded from: Cz2.class */
public final class Cz2 implements MailboxCallback {
    public final /* synthetic */ MailboxFutureImpl A00;
    public final /* synthetic */ C00683ob A01;
    public final /* synthetic */ Boolean A02;
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
    public final /* synthetic */ Boolean A0O;
    public final /* synthetic */ Boolean A0P;
    public final /* synthetic */ Boolean A0Q;
    public final /* synthetic */ Boolean A0R;
    public final /* synthetic */ Number A0S;
    public final /* synthetic */ Number A0T;
    public final /* synthetic */ Object A0U;
    public final /* synthetic */ String A0V;

    public Cz2(MailboxFutureImpl mailboxFutureImpl, C00683ob c00683ob, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, Boolean bool21, Boolean bool22, Boolean bool23, Boolean bool24, Boolean bool25, Boolean bool26, Number number, Number number2, Object obj, String str) {
        this.A01 = c00683ob;
        this.A00 = mailboxFutureImpl;
        this.A0V = str;
        this.A0U = obj;
        this.A0T = number;
        this.A0S = number2;
        this.A08 = bool;
        this.A0D = bool2;
        this.A0H = bool3;
        this.A0F = bool4;
        this.A02 = bool5;
        this.A0J = bool6;
        this.A0E = bool7;
        this.A05 = bool8;
        this.A0K = bool9;
        this.A0L = bool10;
        this.A0B = bool11;
        this.A03 = bool12;
        this.A0Q = bool13;
        this.A0A = bool14;
        this.A09 = bool15;
        this.A0I = bool16;
        this.A0C = bool17;
        this.A0R = bool18;
        this.A0M = bool19;
        this.A0O = bool20;
        this.A06 = bool21;
        this.A07 = bool22;
        this.A0N = bool23;
        this.A0G = bool24;
        this.A0P = bool25;
        this.A04 = bool26;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        String A1D = 7zM.A1D(C00683ob.A00, 1);
        NotificationScope CcE = mailbox.getSessionedNotificationCenterCallbackManager().CcE(new Czn(this, 9), A1D, 1);
        this.A00.setNotification(A1D, CcE);
        MailboxSearchJNI.dispatchVOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO(3, mailbox, this.A0V, this.A0U, this.A0T, "[]", this.A0S, this.A08, this.A0D, this.A0H, this.A0F, this.A02, this.A0J, this.A0E, this.A05, this.A0K, this.A0L, this.A0B, this.A03, this.A0Q, this.A0A, this.A09, this.A0I, this.A0C, this.A0R, this.A0M, this.A0O, this.A06, this.A07, this.A0N, this.A0G, this.A0P, this.A04, CcE);
    }
}
