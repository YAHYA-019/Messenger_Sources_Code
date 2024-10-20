package X;

import android.content.Context;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.enums.GraphQLLivingRoomContentRestrictionReason;
import com.facebook.litho.LithoView;
import com.facebook.widget.CountdownRingContainer;
import java.lang.ref.WeakReference;

/* loaded from: H2t.class */
public final class H2t extends C6d6 {
    public WeakReference A00;
    public boolean A01;
    public final View.OnLayoutChangeListener A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Iw A05;
    public final LithoView A06;
    public final RFJ A07;
    public final FbUserSession A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final HDW A0B;
    public final 2Qn A0C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public H2t(Context context, FbUserSession fbUserSession) {
        super(context, null, 0);
        int A05 = 7zP.A05(context, fbUserSession, 1);
        this.A08 = fbUserSession;
        this.A03 = 1Bq.A00(115528);
        this.A0A = 1Bu.A01(context, 81945);
        this.A09 = 1Bu.A01(context, 115390);
        this.A04 = 1Bu.A00(16430);
        this.A00 = 7zL.A14((Object) null);
        this.A0C = IYv.A00(this, A05);
        this.A0B = new C2729Gme(this, 0);
        this.A07 = new RFJ(this);
        this.A02 = new IKN(this, 1);
        A0C(2132541788);
        this.A05 = new 1Iw(context);
        this.A06 = (LithoView) 7zM.A0H(this, 2131363438);
        this.A01 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00f0, code lost:
    
        if (X.GOp.A0U(r0).A02 != false) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A00(X.H2t r301) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H2t.A00(X.H2t):void");
    }

    @Override // X.C6d6
    public String A0H() {
        return "CoWatchComponentNullStatePlugin";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C6d6
    public void A0M() {
        View AAm;
        CountdownRingContainer countdownRingContainer = (CountdownRingContainer) this.A00.get();
        if (countdownRingContainer != null && countdownRingContainer.A0D) {
            countdownRingContainer.A01();
        }
        ((2Qa) GOq.A0y(this, this.A08, 33089)).A03(this.A0C);
        I2J i2j = (I2J) 1Br.A0B(this.A03);
        HDW hdw = this.A0B;
        11T.A0F(hdw, 0);
        i2j.A02.remove(hdw);
        LithoView lithoView = this.A06;
        lithoView.A0i();
        lithoView.A0w();
        6cT r0 = super.A07;
        if (r0 == null || (AAm = r0.AAm()) == null) {
            return;
        }
        AAm.removeOnLayoutChangeListener(this.A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C6d6
    public void A0e(6TI r302, boolean z) {
        View AAm;
        11T.A0F(r302, 0);
        FbUserSession fbUserSession = r302.A01;
        11T.A0D(fbUserSession);
        Context A08 = 4YU.A08(this);
        ((2Qa) 1Lm.A05(A08, fbUserSession, 33089)).A02(this.A0C);
        C00i c00i = this.A03.A00;
        I2J i2j = (I2J) c00i.get();
        HDW hdw = this.A0B;
        11T.A0F(hdw, 0);
        i2j.A02.add(hdw);
        String str = r302.A03.A0k;
        if (str == null || str.length() == 0) {
            ((Hu4) 1Lm.A05(A08, fbUserSession, 115396)).A02(str);
            I2J i2j2 = (I2J) c00i.get();
            if (r302.A02("LivingRoomRestrictedContentKey") != GraphQLLivingRoomContentRestrictionReason.A01) {
                I2J.A00(i2j2, 0S2.A01);
            }
            A00(this);
            6cT r0 = super.A07;
            if (r0 != null && (AAm = r0.AAm()) != null) {
                AAm.addOnLayoutChangeListener(this.A02);
            }
            this.A06.setVisibility(0);
            return;
        }
        DKE.A0K(this.A04).removeCallbacksAndMessages(null);
        c00i.get();
        ((HsZ) 1Lm.A05(A08, fbUserSession, 115395)).A00();
        I2J i2j3 = (I2J) c00i.get();
        Integer num = i2j3.A00;
        Integer num2 = 0S2.A0C;
        if (num != num2) {
            i2j3.A00 = num2;
        }
        this.A06.setVisibility(8);
        this.A01 = true;
    }
}
