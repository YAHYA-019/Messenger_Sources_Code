package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: N7r.class */
public final class N7r implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ MailboxFutureImpl A05;
    public final /* synthetic */ 8yF A06;
    public final /* synthetic */ String A07;
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

    public N7r(MailboxFutureImpl mailboxFutureImpl, 8yF r303, String str, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.A06 = r303;
        this.A05 = mailboxFutureImpl;
        this.A02 = i;
        this.A01 = i2;
        this.A04 = i3;
        this.A00 = i4;
        this.A03 = i5;
        this.A07 = str;
        this.A0E = z;
        this.A0D = z2;
        this.A0H = z3;
        this.A0F = z4;
        this.A0G = z5;
        this.A0C = z6;
        this.A0A = z7;
        this.A0B = z8;
        this.A09 = z9;
        this.A08 = z10;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, this.A05, 1BL.A0T(), this.A02, this.A01, "MCAMailboxSearchQuery", "SearchResultsV2Query", N85.A00(this, 91));
    }
}
