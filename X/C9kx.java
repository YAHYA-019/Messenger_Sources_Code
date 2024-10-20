package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.util.TriState;
import com.facebook.messaging.inbox.units.StaticUnitConfig;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.mapbox.mapboxsdk.style.layers.Property;

/* renamed from: X.9kx, reason: invalid class name */
/* loaded from: 9kx.class */
public final class C9kx {
    public final Context A00;
    public final 2YQ A01;
    public final 06Z A02;
    public final FbUserSession A03;
    public final 2SI A04;
    public final boolean A05;

    public C9kx(Context context, 06Z r303, FbUserSession fbUserSession, 2YQ r305, 2SI r306, boolean z) {
        7zT.A1W(context, fbUserSession, r303, r305);
        this.A00 = context;
        this.A03 = fbUserSession;
        this.A02 = r303;
        this.A01 = r305;
        this.A04 = r306;
        this.A05 = z;
    }

    public static final C2gi A00(C9kx c9kx, ThreadSummary threadSummary) {
        Context context = c9kx.A00;
        C2xd c2xd = (C2xd) 1Bu.A06(context, 17160);
        StaticUnitConfig staticUnitConfig = 9hH.A05;
        return 2V5.A00(TriState.UNSET, 3GZ.A00(), threadSummary, c2xd.A0I(context, c9kx.A03, 2SI.A06), C2f1.A00);
    }

    public static final void A01(8LD r301, C9kx c9kx, int i) {
        Integer num;
        COv cOv = (COv) 1Lm.A05(c9kx.A00, c9kx.A03, 83648);
        boolean z = c9kx.A05;
        11T.A0F(r301, 0);
        boolean z2 = r301.A0C;
        if (z) {
            if (z2) {
                num = 0S2.A0Y;
            } else {
                if (r301.A0B) {
                    num = 0S2.A0j;
                }
                num = 0S2.A0u;
            }
        } else if (z2) {
            num = 0S2.A15;
        } else {
            if (r301.A0B) {
                num = 0S2.A1G;
            }
            num = 0S2.A0u;
        }
        1BK.A1M(num, r301);
        1UG A08 = 1BK.A08(1Br.A02(cOv.A04), "ls_inbox2_click");
        if (A08.isSampled()) {
            0DA r0 = new 0DA();
            r0.A06(PublicKeyCredentialControllerUtility.JSON_KEY_ID, 128950834329188L);
            r0.A06("rank", 0L);
            7zN.A14(r0, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, 63);
            7zN.A14(r0, Property.SYMBOL_Z_ORDER_SOURCE, 14);
            7zN.A14(r0, "service_type", 0);
            8Ep A00 = 8LD.A00(r301, num, i);
            long j = r301.A04;
            A00.A01(j > 0 ? 3Ea.A01 : 3Ea.A03, "item_presence");
            0DA r02 = new 0DA();
            r02.A07(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "channel");
            r02.A06("member_cnt", Long.valueOf(r301.A06));
            r02.A06("active_member_cnt", Long.valueOf(j));
            r02.A07("membership", z2 ? "yes" : "no");
            A08.A7T(r0, "unit");
            A08.A7T(A00, "item");
            A08.A7T(r02, "community");
            A08.BZL();
        }
        7zQ.A0Q().Ciz(new AEX(r301, c9kx));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A02(final X.8LD r302, final int r303) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9kx.A02(X.8LD, int):void");
    }
}
