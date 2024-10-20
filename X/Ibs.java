package X;

import com.facebook.memcontext.mca.MailboxMEMContextJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;
import java.util.List;
import java.util.Set;

/* loaded from: Ibs.class */
public final class Ibs implements MailboxCallback {
    public final /* synthetic */ GsJ A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ Number A02;
    public final /* synthetic */ Number A03;
    public final /* synthetic */ Number A04;
    public final /* synthetic */ Number A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ String A0E;
    public final /* synthetic */ List A0G;
    public final /* synthetic */ Set A0H;
    public final /* synthetic */ boolean A0I;
    public final /* synthetic */ boolean A0J;
    public final /* synthetic */ boolean A0K;
    public final /* synthetic */ boolean A0L;
    public final /* synthetic */ boolean A0M;
    public final /* synthetic */ String A0F = "256002347743983";
    public final /* synthetic */ String A09 = "256002347743983";

    public Ibs(GsJ gsJ, MailboxFutureImpl mailboxFutureImpl, Number number, Number number2, Number number3, Number number4, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, Set set, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A00 = gsJ;
        this.A01 = mailboxFutureImpl;
        this.A0G = list;
        this.A04 = number;
        this.A0D = str;
        this.A08 = str2;
        this.A0A = str3;
        this.A07 = str4;
        this.A0E = str5;
        this.A0B = str6;
        this.A0C = str7;
        this.A03 = number2;
        this.A06 = str8;
        this.A0H = set;
        this.A02 = number3;
        this.A05 = number4;
        this.A0J = z;
        this.A0I = z2;
        this.A0K = z3;
        this.A0L = z4;
        this.A0M = z5;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String A1D = 7zM.A1D(GsJ.A00, 1);
        NotificationScope CcE = accountSession.getSessionedNotificationCenterCallbackManager().CcE(new Ic4(A1D, this, 4), A1D, 1);
        this.A01.setNotification(A1D, CcE);
        MailboxMEMContextJNI.dispatchVOOOOOOOOOOOOOOOOOOOOOOOOOZZZZZZZZZZZZZZ(2, accountSession, CcE, this.A0G, "256002347743983", "256002347743983", this.A04, "DEBUG", this.A0D, this.A08, this.A0A, this.A07, this.A0E, this.A0B, this.A0C, this.A03, this.A06, null, null, null, null, this.A0H, this.A02, null, this.A05, null, false, this.A0J, this.A0I, true, false, false, false, this.A0K, false, this.A0L, false, false, this.A0M, true);
    }
}
