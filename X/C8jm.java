package X;

import com.facebook.messaging.model.messages.GenericAdminMessageExtensibleData;
import com.facebook.messaging.model.messages.GenericAdminMessageInfo;
import com.facebook.messaging.model.messages.GroupPollingInfoProperties;
import com.facebook.messaging.model.messages.Message;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.BitSet;

/* renamed from: X.8jm, reason: invalid class name */
/* loaded from: 8jm.class */
public final class C8jm extends C1rj {
    public 5zD A00;
    public C62r A01;
    public C62y A02;
    public 7WM A03;
    public Capabilities A04;
    public boolean A05;

    public C8jm() {
        super("PollAdminMessageComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A04, this.A03, this.A02, this.A01, Boolean.valueOf(this.A05), this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        GroupPollingInfoProperties groupPollingInfoProperties;
        8PR r322;
        String str;
        String str2;
        7WM r0 = this.A03;
        5zD r02 = this.A00;
        C62y c62y = this.A02;
        Capabilities capabilities = this.A04;
        boolean z = this.A05;
        C62r c62r = this.A01;
        boolean A1X = 1BL.A1X(r302, r0);
        int A06 = 7zP.A06(r02, c62y, 2);
        11T.A0F(capabilities, 4);
        11T.A0F(c62r, 6);
        Message message = r0.A00.A03;
        GenericAdminMessageInfo genericAdminMessageInfo = message.A0C;
        if (genericAdminMessageInfo != null) {
            GenericAdminMessageExtensibleData genericAdminMessageExtensibleData = genericAdminMessageInfo.A0E;
            if (genericAdminMessageExtensibleData == null) {
                genericAdminMessageExtensibleData = null;
            }
            groupPollingInfoProperties = (GroupPollingInfoProperties) genericAdminMessageExtensibleData;
        } else {
            groupPollingInfoProperties = null;
        }
        String A0x = 4YU.A0x(message);
        if (A0x == null || A0x.length() == 0 || groupPollingInfoProperties == null) {
            C89o c89o = new C89o(r302, new C89n());
            C89m c89m = new C89m(null, null, null, 7zL.A0A(r302).getString(2131952461), A1X);
            C89n c89n = c89o.A01;
            c89n.A01 = c89m;
            BitSet bitSet = c89o.A02;
            bitSet.set(2);
            c89n.A00 = r02;
            bitSet.set(A1X ? 1 : 0);
            c89n.A03 = capabilities;
            bitSet.set(0);
            return c89o.A2V();
        }
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        A01.A1N(2);
        boolean z2 = !z;
        boolean z3 = false;
        C89o c89o2 = new C89o(r302, new C89n());
        String string = 7zL.A0A(r302).getResources().getString(2131952468);
        C9pw A00 = C9pw.A00(c62y, groupPollingInfoProperties, 30);
        if (!4YU.A1Y(capabilities, 36) || z2) {
            z3 = true;
        }
        C89m c89m2 = new C89m(null, A00, string, A0x, z3);
        C89n c89n2 = c89o2.A01;
        c89n2.A01 = c89m2;
        BitSet bitSet2 = c89o2.A02;
        bitSet2.set(2);
        c89n2.A00 = r02;
        bitSet2.set(A1X ? 1 : 0);
        c89n2.A03 = capabilities;
        bitSet2.set(0);
        A01.A2d(c89o2);
        if (!r0.A02 || (str = groupPollingInfoProperties.A02) == null || str.length() == 0 || (str2 = groupPollingInfoProperties.A03) == null || str2.length() == 0) {
            r322 = null;
        } else {
            r322 = new 8PR(r302, new C8kd());
            C8kd c8kd = r322.A01;
            c8kd.A04 = r0;
            BitSet bitSet3 = r322.A02;
            bitSet3.set(A1X ? 1 : 0);
            c8kd.A00 = r02;
            bitSet3.set(6);
            c8kd.A01 = groupPollingInfoProperties;
            bitSet3.set(4);
            c8kd.A03 = c62y;
            bitSet3.set(2);
            c8kd.A02 = c62r;
            bitSet3.set(A06);
            c8kd.A06 = z;
            bitSet3.set(5);
            c8kd.A05 = capabilities;
            bitSet3.set(0);
        }
        return 7zL.A0U(A01, r322);
    }
}
