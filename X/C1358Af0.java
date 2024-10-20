package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import com.facebook.acra.constants.ActionId;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;

/* renamed from: X.Af0, reason: case insensitive filesystem */
/* loaded from: Af0.class */
public final class C1358Af0 extends ClickableSpan {
    public final /* synthetic */ C2k6 A00;
    public final /* synthetic */ EvM A01;
    public final /* synthetic */ C40 A02;
    public final /* synthetic */ C1955Axk A03;
    public final /* synthetic */ MigColorScheme A04;
    public final /* synthetic */ boolean A05;

    public C1358Af0(C2k6 c2k6, EvM evM, C40 c40, C1955Axk c1955Axk, MigColorScheme migColorScheme, boolean z) {
        this.A05 = z;
        this.A03 = c1955Axk;
        this.A00 = c2k6;
        this.A02 = c40;
        this.A01 = evM;
        this.A04 = migColorScheme;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        boolean z = this.A05;
        C1955Axk c1955Axk = this.A03;
        Context A00 = 3vP.A00(this.A00);
        if (z) {
            Object A0E = 1Bn.A0E(A00, (1BY) null, 83439);
            EU9.A00(A00);
            RbJ.A02(A00, EUZ.A00(A00), DKB.A00(ActionId.RTMP_CONNECTION_RELEASE), 04R.A0A(7zO.A1b("platform", ConstantsKt.CAMERA_ID_FRONT, 1BK.A1G("identity_id", A0E))));
            return;
        }
        EvM evM = this.A01;
        C40 c40 = this.A02;
        if (!(!TextUtils.isEmpty(((1Ey) evM.A02.get()).Aue().mSessionCookiesString))) {
            evM.A00(new ChS(A00, c40, c1955Axk));
        } else {
            c40.A00(A00);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        11T.A0F(textPaint, 0);
        textPaint.setColor(this.A04.AZc());
    }
}
