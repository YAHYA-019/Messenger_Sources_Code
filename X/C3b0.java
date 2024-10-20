package X;

import com.facebook.core.mca.MailboxCoreJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.3b0, reason: invalid class name */
/* loaded from: 3b0.class */
public final class C3b0 implements MailboxCallback {
    public final /* synthetic */ 1xC A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ Boolean A02;
    public final /* synthetic */ Number A03;
    public final /* synthetic */ Number A04;
    public final /* synthetic */ Number A05;
    public final /* synthetic */ Number A06;
    public final /* synthetic */ Number A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ String A0E;
    public final /* synthetic */ String A0F;
    public final /* synthetic */ String A0G;
    public final /* synthetic */ String A0H;
    public final /* synthetic */ String A0I;
    public final /* synthetic */ String A0J;
    public final /* synthetic */ String A0K;
    public final /* synthetic */ String A0L;
    public final /* synthetic */ String A0M;
    public final /* synthetic */ String A0N;
    public final /* synthetic */ String A0O;
    public final /* synthetic */ boolean A0P;

    public C3b0(1xC r302, MailboxFutureImpl mailboxFutureImpl, Boolean bool, Number number, Number number2, Number number3, Number number4, Number number5, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, boolean z) {
        this.A00 = r302;
        this.A01 = mailboxFutureImpl;
        this.A05 = number;
        this.A0M = str;
        this.A06 = number2;
        this.A07 = number3;
        this.A0G = str2;
        this.A0I = str3;
        this.A0O = str4;
        this.A04 = number4;
        this.A0E = str5;
        this.A0D = str6;
        this.A0C = str7;
        this.A0F = str8;
        this.A08 = str9;
        this.A03 = number5;
        this.A09 = str10;
        this.A0H = str11;
        this.A0N = str12;
        this.A0J = str13;
        this.A0K = str14;
        this.A0A = str15;
        this.A0B = str16;
        this.A0L = str17;
        this.A02 = bool;
        this.A0P = z;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String str = (String) 1xC.A00.A00(31);
        NotificationScope A00 = ((C1y2) accountSession.getNotificationCenterCallbackManager()).A00(new Czo(str, this, 1), str);
        this.A01.setNotification(str, A00);
        MailboxCoreJNI.dispatchVOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOZ(27, accountSession, this.A05, this.A0M, this.A06, this.A07, this.A0G, this.A0I, this.A0O, this.A04, this.A0E, this.A0D, this.A0C, this.A0F, this.A08, this.A03, this.A09, null, null, null, null, this.A0H, this.A0N, this.A0J, this.A0K, this.A0A, this.A0B, this.A0L, null, this.A02, null, A00, this.A0P);
    }
}
