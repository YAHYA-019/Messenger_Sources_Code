package X;

import com.facebook.msys.cql.dataclasses.ReadOnlyMessageMetadataDataclassAdapter;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.util.NotificationScope;
import com.facebook.tam.mca.MailboxTamJNI;
import java.util.List;

/* loaded from: Cz3.class */
public final class Cz3 implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ 5oV A03;
    public final /* synthetic */ MailboxFutureImpl A04;
    public final /* synthetic */ 22C A05;
    public final /* synthetic */ Number A06;
    public final /* synthetic */ Number A07;
    public final /* synthetic */ Number A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ List A0C;
    public final /* synthetic */ List A0D;
    public final /* synthetic */ List A0E;
    public final /* synthetic */ List A0F;
    public final /* synthetic */ List A0G;
    public final /* synthetic */ List A0H;
    public final /* synthetic */ List A0I;
    public final /* synthetic */ List A0J;
    public final /* synthetic */ List A0K;
    public final /* synthetic */ List A0L;
    public final /* synthetic */ List A0M;
    public final /* synthetic */ List A0N;
    public final /* synthetic */ List A0O;
    public final /* synthetic */ List A0P;
    public final /* synthetic */ List A0Q;
    public final /* synthetic */ List A0R;
    public final /* synthetic */ List A0S;
    public final /* synthetic */ List A0T;
    public final /* synthetic */ List A0U;
    public final /* synthetic */ List A0V;
    public final /* synthetic */ boolean A0W;

    public Cz3(5oV r302, MailboxFutureImpl mailboxFutureImpl, 22C r304, Number number, Number number2, Number number3, String str, String str2, String str3, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17, List list18, List list19, List list20, int i, long j, long j2, boolean z) {
        this.A05 = r304;
        this.A00 = i;
        this.A04 = mailboxFutureImpl;
        this.A02 = j;
        this.A01 = j2;
        this.A0C = list;
        this.A0K = list2;
        this.A0H = list3;
        this.A0V = list4;
        this.A0T = list5;
        this.A0S = list6;
        this.A0U = list7;
        this.A0E = list8;
        this.A0F = list9;
        this.A0Q = list10;
        this.A0G = list11;
        this.A0I = list12;
        this.A0R = list13;
        this.A0D = list14;
        this.A0M = list15;
        this.A0L = list16;
        this.A0N = list17;
        this.A0P = list18;
        this.A0O = list19;
        this.A0J = list20;
        this.A09 = str;
        this.A0B = str2;
        this.A0A = str3;
        this.A07 = number;
        this.A06 = number2;
        this.A08 = number3;
        this.A03 = r302;
        this.A0W = z;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        4uZ.A06("MailboxTam", 1BJ.A00(2024), this.A00);
        String A1D = 7zM.A1D(22C.A00, 0);
        NotificationScope A00 = Czo.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D, 58);
        this.A04.setNotification(A1D, A00);
        MailboxTamJNI.dispatchVJJOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOZ(2, this.A02, this.A01, mailbox, null, this.A0C, this.A0K, this.A0H, this.A0V, this.A0T, this.A0S, this.A0U, this.A0E, this.A0F, this.A0Q, this.A0G, this.A0I, this.A0R, this.A0D, this.A0M, this.A0L, this.A0N, this.A0P, this.A0O, this.A0J, this.A09, this.A0B, this.A0A, null, this.A07, this.A06, this.A08, ReadOnlyMessageMetadataDataclassAdapter.INSTANCE.toNullableRawObject(this.A03), A00, this.A0W);
    }
}
