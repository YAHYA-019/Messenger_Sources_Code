package X;

import android.content.Context;
import android.os.Parcelable;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.communityprofile.fragment.ChangeCommunityProfilePictureBottomMenuFragment;
import com.facebook.messaging.communitymessaging.model.Community;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.rsys.state.gen.State;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: ARb.class */
public final class ARb extends C00q implements Function1 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ARb(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        super(1);
        this.A00 = i;
        this.A03 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A05 = obj4;
        this.A04 = obj5;
        this.A06 = obj6;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.A00) {
            case 0:
                L8T l8t = (L8T) obj;
                L56[] l56Arr = (L56[]) this.A04;
                List list = (List) this.A03;
                MNd mNd = (MNd) this.A05;
                0PI r0 = (0PI) this.A02;
                0PI r02 = (0PI) this.A01;
                LP0 lp0 = (LP0) this.A06;
                int length = l56Arr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    L56 l56 = l56Arr[i];
                    11T.A0I(l56, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                    LCh.A03(lp0.A00, (MNG) list.get(i2), l8t, l56, mNd.AtT(), r0.element, r02.element);
                    i++;
                    i2++;
                }
                return 04S.A00;
            case 1:
                ((C4X) 1Br.A0B(((CIE) this.A06).A00)).A00((Context) this.A02, (06Z) this.A03, (ThreadSummary) this.A05, AQt.A01(this.A01, this.A04, 0), AnonymousClass001.A1V(obj));
                return 04S.A00;
            case 2:
                3xC r03 = (3xC) obj;
                11T.A0F(r03, 0);
                FbUserSession fbUserSession = (FbUserSession) this.A03;
                Context A06 = 7zN.A06(this.A01);
                C9ad c9ad = (C9ad) 1Lm.A05(A06, fbUserSession, 83373);
                CMt cMt = (CMt) 1Lm.A05(A06, fbUserSession, 83067);
                Parcelable A00 = ParcelableSecondaryData.A00((ParcelableSecondaryData) this.A02, Community.class, null);
                if (A00 == null) {
                    throw 1BK.A0h();
                }
                Community community = (Community) A00;
                1pI A002 = 1vD.A00(r03.A00);
                boolean A1T = AnonymousClass001.A1T(c9ad.A01.A03);
                ChangeCommunityProfilePictureBottomMenuFragment changeCommunityProfilePictureBottomMenuFragment = new ChangeCommunityProfilePictureBottomMenuFragment();
                changeCommunityProfilePictureBottomMenuFragment.A06 = false;
                changeCommunityProfilePictureBottomMenuFragment.A05 = A1T;
                User user = (User) this.A06;
                changeCommunityProfilePictureBottomMenuFragment.A00 = new CvX(2, cMt, A002, community, user);
                changeCommunityProfilePictureBottomMenuFragment.A04 = new AQj(9, user, A002, community, cMt);
                changeCommunityProfilePictureBottomMenuFragment.A01 = (C5ww) this.A05;
                changeCommunityProfilePictureBottomMenuFragment.A0m((06Z) this.A04, "change_profile_picture_fragment");
                CMt.A00(cMt, (String) null, (String) null, 9, 2, 7zU.A07(community), 7zQ.A0C(community), 7zQ.A0H(user));
                return 04S.A00;
            case 3:
                C2k5 c2k5 = (C2k5) this.A03;
                C2lh c2lh = (C2lh) this.A05;
                C2lh c2lh2 = (C2lh) this.A01;
                C2lh c2lh3 = (C2lh) this.A02;
                C2lh c2lh4 = (C2lh) this.A04;
                7zM.A1T(c2lh, 400);
                c2lh2.A02(7zN.A0f());
                c2lh3.A02(Float.valueOf(30.0f));
                C07z c07z = C07y.A00;
                7zM.A1T(c2lh4, C07y.A01.A06(0, 7zS.A01(c2k5, 44.0d)));
                return 04S.A00;
            default:
                8LW A0e = 7zO.A0e(obj);
                if (7zR.A1a(A0e, (Function1) this.A01)) {
                    C9dd.A00(new AnonymousClass915((5Vt) this.A04), (Function1) this.A02, (0Je) this.A03, (0CL) this.A06, (0CL) this.A05);
                }
                State state = (State) A0e.A00(State.class);
                if (state != null && state.callState == 0) {
                    C9dd.A00(new 9Lf() { // from class: X.916
                    }, (Function1) this.A02, (0Je) this.A03, (0CL) this.A06, (0CL) this.A05);
                }
                return 04S.A00;
        }
    }
}
