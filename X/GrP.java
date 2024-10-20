package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.rsys.call.gen.CallModel;
import com.facebook.rsys.call.gen.CallParticipant;
import com.facebook.user.model.UserKey;

/* loaded from: GrP.class */
public final class GrP extends Gqk {
    public int A00;
    public int A01;
    public int A02;
    public 8Lr A03;
    public C2p1 A04;
    public C2fr A05;
    public String A06;
    public String A07;
    public C00m A08;
    public boolean A09;
    public boolean A0A;
    public int[] A0B;
    public final Context A0C;
    public final FbUserSession A0D;
    public final 1Br A0E;
    public final 1Br A0F;
    public final 1Br A0G;
    public final 1Br A0H;
    public final 1Br A0I;
    public final 1Br A0J;
    public final 1Br A0K;
    public final 1Br A0L;
    public final 1Br A0M;
    public final 1Br A0N;
    public final 1Br A0O;
    public final 1Br A0P;
    public final 1Br A0Q;
    public final 1Br A0R;
    public final 1Br A0S;
    public final IY8 A0T;
    public final C01i A0U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GrP(Context context, FbUserSession fbUserSession, String str) {
        super(str);
        7zR.A1O(fbUserSession, context);
        this.A0D = fbUserSession;
        this.A0C = context;
        this.A0J = GOn.A0V(context, fbUserSession);
        this.A0L = 1Lm.A00(context, fbUserSession, 114859);
        this.A0I = GOn.A0e(context, fbUserSession);
        this.A0P = 1Bq.A00(83005);
        this.A0Q = 1Lm.A00(context, fbUserSession, 49772);
        this.A0O = 1Bu.A01(context, 115428);
        this.A0H = 1Lm.A00(context, fbUserSession, 99476);
        this.A0G = 1Lm.A00(context, fbUserSession, 114853);
        this.A0E = GOn.A0d(context, fbUserSession);
        this.A0F = GOn.A0S(context);
        this.A0S = GOn.A0T(context, fbUserSession);
        this.A0N = GOn.A0Z(context, fbUserSession);
        this.A0K = 1Bq.A00(99793);
        this.A0R = 7zM.A0O();
        this.A0U = J9t.A01(this, 31);
        this.A0A = true;
        this.A0M = GOn.A0U(context, fbUserSession);
        this.A0T = IY8.A01(this, 49);
    }

    public static final 2JN A00(GrP grP) {
        return GOp.A0O(grP.A0M);
    }

    public static final CallParticipant A01(GrP grP) {
        String str;
        CallModel A0j;
        8Lr r0 = grP.A03;
        CallParticipant callParticipant = null;
        if (r0 != null && (str = ((UserKey) r0.A00).id) != null && (A0j = GOq.A0j(GOp.A0O(grP.A0M).A01())) != null) {
            if (!r0.A01) {
                return IFr.A04(A0j, str);
            }
            callParticipant = A0j.selfParticipant;
        }
        return callParticipant;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b5, code lost:
    
        if (r301.A0B == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0139, code lost:
    
        if (r301.A01 > X.GOo.A01(r310.getResources())) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01ad, code lost:
    
        if (r0.callState != 4) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01e9, code lost:
    
        if (X.GOq.A0s(r301.A0N).A0T != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0213, code lost:
    
        if (X.I4j.A00(r301.A0L) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0218, code lost:
    
        if (r308 != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0299, code lost:
    
        if (r306 == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A02(X.GrP r301) {
        /*
            Method dump skipped, instructions count: 866
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GrP.A02(X.GrP):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
    
        if (r307 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0229, code lost:
    
        if (r307 != null) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0215  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A03(X.GrP r301, com.facebook.rsys.call.gen.CallParticipant r302) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GrP.A03(X.GrP, com.facebook.rsys.call.gen.CallParticipant):void");
    }

    public static final void A08(GrP grP, C2fr c2fr) {
        if (!((HmX) 1Br.A0B(grP.A0F)).A00() || grP.A02 == 3 || grP.A09) {
            GOp.A0O(grP.A0M).A01();
            A02(grP);
        } else {
            if (c2fr == null || c2fr.BIe().isEmpty()) {
                return;
            }
            UserKey userKey = (UserKey) c2fr.BIe().get(0);
            int A01 = GOo.A01(grP.A0C.getResources());
            IPd iPd = (IPd) 1Br.A0B(grP.A0K);
            Uri uri = (Uri) 4YU.A0q(c2fr.BIP(A01, A01), 0);
            11T.A0D(userKey);
            iPd.A00(uri, userKey, new J9t(grP, 32), new AV2(grP, 10));
        }
    }
}
