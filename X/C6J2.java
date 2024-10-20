package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.calls.GraphQlCallInput;

/* renamed from: X.6J2, reason: invalid class name */
/* loaded from: 6J2.class */
public final class C6J2 extends C6J1 {
    public static void A00(Context context, FbUserSession fbUserSession, 2JX r303) {
        2JY A0B;
        String A0k;
        2JY A0B2;
        7eN r312;
        if (r303 == null || (A0B = 1BK.A0B(r303, 2JX.class, 1400838279, -495572513)) == null || (A0k = A0B.A0k()) == null || (A0B2 = 1BK.A0B(A0B, 2JX.class, 1345868457, -493539821)) == null) {
            return;
        }
        boolean A01 = A01(r303);
        07S A0J = 4YU.A0J(GraphQlCallInput.A02, "MESSENGER_BANNER", "surface");
        if (A01) {
            07S.A00(A0J, A0k, "followee_id");
            r312 = new 7eN();
        } else {
            07S.A00(A0J, A0k, "followee_id");
            r312 = new 7eM();
        }
        4YV.A1A(A0J, ((2Jf) r312).A00, "input");
        5Dh r0 = new 5Dh(r312);
        6As newTreeBuilder = 2tS.A00().newTreeBuilder("MarketplaceUserProfile", 6As.class, -493539821);
        newTreeBuilder.setString(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B2.A0k());
        newTreeBuilder.A0B("is_viewer_following", !A01);
        r0.A08(newTreeBuilder.getResult(2JX.class, -493539821));
        AbstractC05414dq A08 = 1VX.A08(context, fbUserSession);
        4YV.A1B(r0);
        A08.A06(r0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0037, code lost:
    
        if (r0.getBooleanValue(-1829945575) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A01(X.2JX r301) {
        /*
            java.lang.Class<X.2JX> r0 = X.2JX.class
            r302 = r0
            r0 = 1400838279(0x537f1887, float:1.09562816E12)
            r303 = r0
            r0 = -495572513(0xffffffffe27629df, float:-1.13522904E21)
            r304 = r0
            r0 = r301
            r1 = r302
            r2 = r303
            r3 = r304
            X.2JY r0 = X.1BK.A0B(r0, r1, r2, r3)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L3a
            r0 = 1345868457(0x503852a9, float:1.23697E10)
            r303 = r0
            r0 = -493539821(0xffffffffe2952e13, float:-1.3759424E21)
            r304 = r0
            r0 = r305
            r1 = r303
            r2 = r302
            r3 = r304
            com.facebook.graphservice.tree.TreeJNI r0 = r0.A0L(r1, r2, r3)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L3a
            r0 = r306
            r1 = -1829945575(0xffffffff92ed3f19, float:-1.4972358E-27)
            boolean r0 = r0.getBooleanValue(r1)
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L3c
        L3a:
            r0 = 0
            r304 = r0
        L3c:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6J2.A01(X.2JX):boolean");
    }

    public String BHd() {
        return "TOGGLE_FOLLOW_SELLER";
    }

    public void CX7(FbUserSession fbUserSession, Context context) {
        A00(context, fbUserSession, ((6Ik) this).A00);
    }
}
