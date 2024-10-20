package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import java.util.List;

/* renamed from: X.2eu, reason: invalid class name */
/* loaded from: 2eu.class */
public final class C2eu implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ MailboxFutureImpl A03;
    public final /* synthetic */ C2et A04;
    public final /* synthetic */ Number A05;
    public final /* synthetic */ Number A06;
    public final /* synthetic */ Number A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ List A09;
    public final /* synthetic */ List A0A;
    public final /* synthetic */ List A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;
    public final /* synthetic */ boolean A0E;
    public final /* synthetic */ boolean A0F;
    public final /* synthetic */ boolean A0G;
    public final /* synthetic */ boolean A0H;
    public final /* synthetic */ boolean A0I;

    public C2eu(MailboxFutureImpl mailboxFutureImpl, C2et c2et, Number number, Number number2, Number number3, String str, List list, List list2, List list3, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A04 = c2et;
        this.A03 = mailboxFutureImpl;
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
        this.A09 = list;
        this.A0A = list2;
        this.A0B = list3;
        this.A05 = number;
        this.A06 = number2;
        this.A08 = str;
        this.A07 = number3;
        this.A0H = z;
        this.A0I = z2;
        this.A0G = z3;
        this.A0E = z4;
        this.A0F = z5;
        this.A0D = z6;
        this.A0C = z7;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, this.A03, new MailboxNullable(null), this.A02, 0, "MCAMailboxOrcaContactList", "OrcaContactList", new 30Q(this, 0));
    }
}
