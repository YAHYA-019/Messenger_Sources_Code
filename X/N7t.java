package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import java.util.List;

/* loaded from: N7t.class */
public final class N7t implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ C00683ob A03;
    public final /* synthetic */ Number A04;
    public final /* synthetic */ Object A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ List A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;
    public final /* synthetic */ boolean A0E;
    public final /* synthetic */ boolean A0F;
    public final /* synthetic */ boolean A0G;
    public final /* synthetic */ boolean A0H;
    public final /* synthetic */ boolean A0I;
    public final /* synthetic */ boolean A0J;
    public final /* synthetic */ boolean A0K;

    public N7t(MailboxFutureImpl mailboxFutureImpl, C00683ob c00683ob, Number number, Object obj, String str, List list, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.A03 = c00683ob;
        this.A02 = mailboxFutureImpl;
        this.A01 = i;
        this.A00 = i2;
        this.A06 = str;
        this.A05 = obj;
        this.A07 = list;
        this.A04 = number;
        this.A0F = z;
        this.A0E = z2;
        this.A08 = z3;
        this.A0J = z4;
        this.A0G = z5;
        this.A0I = z6;
        this.A0D = z7;
        this.A0K = z8;
        this.A0C = z9;
        this.A0H = z10;
        this.A09 = z11;
        this.A0A = z12;
        this.A0B = z13;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFutureImpl mailboxFutureImpl = this.A02;
        MailboxNullable A0T = 1BL.A0T();
        int i = this.A01;
        int i2 = this.A00;
        N85 A00 = N85.A00(this, 87);
        C1qL c1qL = C00683ob.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, A0T, i, i2, "MCAMailboxSearch", "SdkQuerySearchAndroidMessengerUniversal", A00);
    }
}
