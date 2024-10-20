package X;

import com.facebook.msys.mca.MailboxFeature;
import com.facebook.payments.p2p.messenger.plugins.bloksactions.sendpaymentarmadillo.SendPaymentArmadilloImplementation;
import com.facebook.payments.p2p.messenger.plugins.bloksactions.sendrequestarmadillo.SendRequestArmadilloImplementation;
import java.util.Set;

/* loaded from: E2v.class */
public final class E2v extends C21h {
    public final int A00 = 0;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final String A08;
    public final String A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E2v(1Uj r302, SendPaymentArmadilloImplementation sendPaymentArmadilloImplementation, FHh fHh, GJj gJj, GJj gJj2, GJj gJj3, GJj gJj4, String str, String str2) {
        super("payments_get_server_request_response");
        this.A05 = r302;
        this.A09 = str;
        this.A07 = sendPaymentArmadilloImplementation;
        this.A03 = gJj;
        this.A02 = gJj2;
        this.A04 = gJj3;
        this.A08 = str2;
        this.A06 = gJj4;
        this.A01 = fHh;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E2v(1Uj r302, SendRequestArmadilloImplementation sendRequestArmadilloImplementation, FHh fHh, GJj gJj, GJj gJj2, GJj gJj3, GJj gJj4, String str, String str2) {
        super("payments_get_server_request_response");
        this.A05 = r302;
        this.A09 = str;
        this.A07 = sendRequestArmadilloImplementation;
        this.A03 = gJj;
        this.A02 = gJj2;
        this.A04 = gJj3;
        this.A08 = str2;
        this.A06 = gJj4;
        this.A01 = fHh;
    }

    @Override // X.C21h
    public void A00(Set set) {
        int i = this.A00;
        1Uj r0 = (1Uj) this.A05;
        MailboxFeature mailboxFeature = new MailboxFeature(r0);
        String str = this.A09;
        Object obj = this.A07;
        Object obj2 = this.A03;
        Object obj3 = this.A02;
        mailboxFeature.A00(new FkP(this.A06, this.A04, r0, this.A01, obj3, obj, obj2, this.A08, i != 0 ? 2 : 1), str);
    }
}
