package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.locationsharing.core.models.Address;
import com.facebook.locationsharing.core.models.Location;
import com.facebook.locationsharing.core.models.Place;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.9t4, reason: invalid class name */
/* loaded from: 9t4.class */
public final class C9t4 implements JJs {
    public 8JG A00;
    public 2Zs A01;
    public 2Zs A02;
    public final 1Br A03;
    public final 1Br A04;
    public final FbUserSession A05;
    public final 1De A06;

    public C9t4(1De r302) {
        this.A06 = r302;
        1BY r0 = r302.A00;
        1Br A03 = 1Bu.A03(r0, 16428);
        this.A04 = A03;
        FbUserSession A032 = 1Br.A03(A03);
        this.A05 = A032;
        1Br A033 = 1Lm.A03(A032, r0, 68859);
        this.A03 = A033;
        this.A01 = 2aN.A00;
        this.A02 = 4ZJ.A00;
        1Uj mailboxProvider = 7zP.A0d(A033).getMailboxProvider();
        11T.A0D(mailboxProvider);
        mailboxProvider.A06(A1d.A00(this, 64));
    }

    @Override // X.JJs
    public void AVw(5fT r302, double d, double d2) {
        MailboxFeature A0d = 7zP.A0d(this.A03);
        A0M a0m = new A0M(r302, this, d, d2, 1);
        1Um AQV = A0d.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0Q = 1BK.A0Q(AQV, a0m);
        1Um.A02(AQV, new A0M(A0d, A0Q, d2, d, 0), A0Q, false);
    }

    @Override // X.JJs
    public void Cx0(JOe jOe, Address address, String str, String str2, String str3) {
        11T.A0F(str, 0);
        MailboxFeature A0d = 7zP.A0d(this.A03);
        long A00 = 7Vj.A00(str);
        Location location = address.A00;
        Double valueOf = Double.valueOf(location.A00);
        Double valueOf2 = Double.valueOf(location.A01);
        Boolean valueOf3 = Boolean.valueOf(address.A02);
        A1f A002 = A1f.A00(jOe, this, 49);
        1Um A0O = 1BK.A0O(A0d, 0);
        MailboxFutureImpl A0Q = 1BK.A0Q(A0O, A002);
        1Um.A02(A0O, new A0v(valueOf3, null, A0Q, valueOf2, A0d, valueOf, 0, A00), A0Q, false);
    }

    @Override // X.JJs
    public void Cx2(JOe jOe, Place place, String str, String str2, String str3) {
        11T.A0F(str, 0);
        MailboxFeature A0d = 7zP.A0d(this.A03);
        long A00 = 7Vj.A00(str);
        Location location = place.A00;
        Double valueOf = Double.valueOf(location.A00);
        Double valueOf2 = Double.valueOf(location.A01);
        String str4 = place.A01;
        11T.A0A(str4);
        Long A0n = 1BK.A0n(str4);
        A1f A002 = A1f.A00(jOe, this, 50);
        1Um A0O = 1BK.A0O(A0d, 0);
        MailboxFutureImpl A0Q = 1BK.A0Q(A0O, A002);
        1Um.A02(A0O, new A0v(false, A0n, A0Q, valueOf2, A0d, valueOf, 0, A00), A0Q, false);
    }
}
