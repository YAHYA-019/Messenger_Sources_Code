package X;

import com.facebook.graphql.enums.GraphQLPagesPlatformNativeBookingStatus;
import com.mapbox.mapboxsdk.R;
import java.util.BitSet;
import java.util.List;

/* renamed from: X.Ayd, reason: case insensitive filesystem */
/* loaded from: Ayd.class */
public final class C1984Ayd extends C1rj {
    public GraphQLPagesPlatformNativeBookingStatus A00;
    public List A01;
    public boolean A02;
    public boolean A03;

    public C1984Ayd() {
        super("AppointmentDetailHeaderComponent");
    }

    public final Object[] A0k() {
        return new Object[]{null, this.A00, Boolean.valueOf(this.A02), this.A01, Boolean.valueOf(this.A03)};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        int i;
        boolean z = this.A03;
        GraphQLPagesPlatformNativeBookingStatus graphQLPagesPlatformNativeBookingStatus = this.A00;
        List list = this.A01;
        boolean z2 = this.A02;
        11T.A0F(r302, 0);
        2cM A00 = 2cK.A00(r302);
        A00.A0a();
        if (z && graphQLPagesPlatformNativeBookingStatus != null) {
            int ordinal = graphQLPagesPlatformNativeBookingStatus.ordinal();
            switch (ordinal) {
                case 1:
                case 3:
                    i = 2131952822;
                    break;
                case 2:
                    i = 2131952819;
                    break;
                case 5:
                    i = 2131952839;
                    break;
                case 6:
                case 8:
                case 9:
                    i = 2131952868;
                    if (!z2) {
                        i = 2131962833;
                        break;
                    }
                    break;
                case 7:
                    i = 2131952840;
                    break;
            }
            3yF A0L = 2KZ.A0L(r302, 2132608207);
            A0L.A23(C26z.TOP);
            A0L.A30(i);
            int i2 = -1;
            switch (ordinal) {
                case 1:
                case 3:
                    i2 = 2132214516;
                    break;
                case 2:
                    i2 = 2132214562;
                    break;
                case 4:
                    break;
                case 5:
                    i2 = 2132213793;
                    break;
                case 6:
                default:
                    i2 = 2132214611;
                    break;
                case 7:
                    i2 = 2132213794;
                    break;
            }
            A0L.A2z(i2);
            A00.A2X(A0L.A2W());
        }
        if (list != null && !list.isEmpty()) {
            AwB awB = new AwB(r302, new DyY());
            DyY dyY = awB.A01;
            dyY.A00 = list;
            BitSet bitSet = awB.A02;
            bitSet.set(0);
            dyY.A01 = true;
            awB.A1Z(R.dimen.mapbox_eight_dp);
            C1rs.A05(bitSet, awB.A03, 1);
            awB.A0J();
            A00.A2X(dyY);
        }
        1LI A2V = A00.A2V();
        11T.A0A(A2V);
        return A2V;
    }
}
