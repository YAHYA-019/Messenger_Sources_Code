package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.search.mca.MailboxSearchJNI;
import java.util.List;

/* renamed from: X.3ob, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3ob.class */
public final class C00683ob extends MailboxFeature {
    public static C1qL A00 = new C1qL() { // from class: X.3oc
        @Override // X.C1qL
        public List A01() {
            return MailboxSearchJNI.getHeaderFields();
        }
    };

    public void A00() {
        1Um AQV = this.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        if (AQV.Cj2(new C4W0(mailboxFutureImpl, this, 7))) {
            return;
        }
        mailboxFutureImpl.cancel(false);
    }

    public void A01(int i, long j) {
        1Um AQV = this.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        1Um.A02(AQV, new Iat(mailboxFutureImpl, this, i, j), mailboxFutureImpl, false);
    }

    public void A02(long j) {
        1Um AQV = this.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        1Um.A02(AQV, new Iak(mailboxFutureImpl, this, j), mailboxFutureImpl, false);
    }

    public void A03(MailboxCallback mailboxCallback) {
        1Um AQV = this.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        mailboxFutureImpl.Cu4(mailboxCallback);
        1Um.A02(AQV, new C4W0(mailboxFutureImpl, this, 6), mailboxFutureImpl, false);
    }

    public void A04(MailboxCallback mailboxCallback, int i) {
        1Um AQV = this.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        mailboxFutureImpl.Cu4(mailboxCallback);
        if (AQV.Cj2(new Ial(mailboxFutureImpl, this, i))) {
            return;
        }
        mailboxFutureImpl.cancel(false);
    }

    public void A05(MailboxCallback mailboxCallback, MailboxCallback mailboxCallback2, List list, int i) {
        1Um AQV = this.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        MailboxFutureImpl mailboxFutureImpl2 = new MailboxFutureImpl(AQV);
        if (mailboxCallback2 != null) {
            mailboxFutureImpl2.Cu4(mailboxCallback2);
        }
        if (mailboxCallback != null) {
            mailboxFutureImpl.Cu4(mailboxCallback);
        }
        if (AQV.Cj2(new Ib8(mailboxFutureImpl2, mailboxFutureImpl, this, list, i))) {
            return;
        }
        mailboxFutureImpl.cancel(false);
        mailboxFutureImpl2.cancel(false);
    }

    public void A06(MailboxCallback mailboxCallback, PrivacyContext privacyContext, Number number, String str) {
        1Um AQV = this.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        mailboxFutureImpl.Cu4(mailboxCallback);
        if (AQV.Cj2(new Ib7(mailboxFutureImpl, privacyContext, this, number, str))) {
            return;
        }
        mailboxFutureImpl.cancel(false);
    }

    public void A07(MailboxCallback mailboxCallback, PrivacyContext privacyContext, String str) {
        1Um AQV = this.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        mailboxFutureImpl.Cu4(mailboxCallback);
        if (AQV.Cj2(new Ias(mailboxFutureImpl, privacyContext, this, str))) {
            return;
        }
        mailboxFutureImpl.cancel(false);
    }

    public void A08(MailboxCallback mailboxCallback, Number number, Object obj) {
        1Um AQV = this.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        mailboxFutureImpl.Cu4(mailboxCallback);
        1Um.A02(AQV, new Iaw(1, this, mailboxFutureImpl, number, obj), mailboxFutureImpl, false);
    }

    public void A09(MailboxCallback mailboxCallback, Object obj) {
        1Um AQV = this.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        mailboxFutureImpl.Cu4(mailboxCallback);
        if (AQV.Cj2(new Cxk(2, this, mailboxFutureImpl, obj))) {
            return;
        }
        mailboxFutureImpl.cancel(false);
    }

    public void A0A(List list) {
        1Um AQV = this.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        if (AQV.Cj2(new Cxk(3, this, list, mailboxFutureImpl))) {
            return;
        }
        mailboxFutureImpl.cancel(false);
    }
}
