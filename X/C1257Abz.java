package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.http.interfaces.RequestPriority;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Abz, reason: case insensitive filesystem */
/* loaded from: Abz.class */
public final class C1257Abz implements 1Xc, CallerContextable {
    public static final String __redex_internal_original_name = "OnUpgradeGkRefresher";
    public final C15h A05 = DBe.A00(this, 9);
    public final C00i A03 = AbH.A0S();
    public final C00i A01 = AbH.A0a();
    public final C00i A00 = 1BQ.A02(49320);
    public final C00i A04 = 1BQ.A02(49313);
    public final C00i A02 = 1BV.A00(33255);

    public String BB2() {
        return __redex_internal_original_name;
    }

    public void init() {
        int i;
        int A03 = 0FI.A03(1877093467);
        0fH.A0A(C1257Abz.class, "Initialized on upgrade");
        if (((FbUserSession) this.A05.get()).A07) {
            0fH.A0A(C1257Abz.class, "Not logged in, skipping.");
            i = 950680793;
        } else {
            1G2 A01 = 1G3.A01(((4IL) this.A02.get()).A01(), C09754rf.class.getName());
            1Ql A0V = 1BL.A0V(this.A03);
            A0V.CaH(A01, 1BL.A08(this.A01));
            A0V.commit();
            C1255Abx c1255Abx = new C1255Abx((C09754rf) this.A04.get());
            try {
                0fH.A0A(C1257Abz.class, "Trying to refresh Gks on app upgrade.");
                C09894rt c09894rt = (C09894rt) this.A00.get();
                CallerContext A06 = CallerContext.A06(C1257Abz.class);
                ImmutableList of = ImmutableList.of((Object) c1255Abx);
                C04033zm c04033zm = new C04033zm();
                c04033zm.A01 = RequestPriority.CAN_WAIT;
                c09894rt.A00(A06, c04033zm, of, "onUpgradeGkRefresh");
                0fH.A0A(C1257Abz.class, "Successfully refreshed Gks on app upgrade.");
            } catch (Exception e) {
                0fH.A0K(C1257Abz.class, "Failed to refresh Gks on app upgrade.", e);
            }
            i = -1572099170;
        }
        0FI.A09(i, A03);
    }
}
