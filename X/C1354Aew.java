package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.fos.headers.transparency.HeaderTransparencyInterstitialActivity;
import com.facebook.messaging.blocking.ManageBlockingParam;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.Aew, reason: case insensitive filesystem */
/* loaded from: Aew.class */
public final class C1354Aew extends ClickableSpan {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C1354Aew(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARN: Type inference failed for: r0v64, types: [X.Al0, androidx.fragment.app.Fragment] */
    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        C2Q c2q;
        boolean z;
        boolean A1X;
        int A02;
        BOe bOe;
        C1277Ach c1277Ach;
        ManageBlockingParam manageBlockingParam;
        switch (this.A00) {
            case 0:
                BvU bvU = (BvU) this.A01;
                if (1BK.A1T(1BK.A0R(bvU.A01), 5SH.A0A)) {
                    0LS.A0C((Context) this.A02, 4YU.A09(C0A2.A04("https://www.facebook.com/help/1137953062904148?ref=zero_header_transparency_banner")));
                    c2q = (C2Q) bvU.A02.get();
                    z = true;
                    C00i c00i = bvU.A05;
                    A1X = AbM.A1X(c00i);
                    A02 = AbM.A02(c00i);
                    bOe = BOe.A06;
                } else {
                    Context context = (Context) this.A02;
                    0LS.A0A(context, C3o5.A0D(context, HeaderTransparencyInterstitialActivity.class));
                    c2q = (C2Q) bvU.A02.get();
                    z = true;
                    C00i c00i2 = bvU.A05;
                    A1X = AbM.A1X(c00i2);
                    A02 = AbM.A02(c00i2);
                    bOe = BOe.A03;
                }
                c2q.A00(bOe, "fb4a_login_page", (String) null, A02, ((CIb) bvU.A03.get()).A01(), z, A1X);
                return;
            case 1:
                7zL.A1R(this.A01);
                return;
            case 2:
                11T.A0F(view, 0);
                ?? r0 = (C1547Al0) this.A02;
                ThreadKey threadKey = (ThreadKey) r0.requireActivity().getIntent().getParcelableExtra("thread_key");
                if (threadKey != null) {
                    5HC r02 = (5HC) 1Br.A0B(r0.A02);
                    FbUserSession fbUserSession = r0.A00;
                    if (fbUserSession == null) {
                        7zL.A1C();
                        throw 0Q8.createAndThrow();
                    }
                    r02.A04(fbUserSession, threadKey, "navigate_to_bubbles_settings_os_from_bubbles_inbox");
                }
                08O A0l = 7zR.A0l();
                1Bi.A03(82117);
                Context A08 = 4YU.A08(view);
                A0l.A01().A0A(A08, CLj.A00(A08));
                return;
            case 3:
                Context A0L = 7zP.A0L((C2k6) this.A01);
                ((FIu) 1Bn.A0E(A0L, (1BY) null, 100011)).A09(A0L, 4YU.A0F(DKB.A00(15)), C5id.A10);
                ((AxM) this.A02).A02.invoke(BOB.A03);
                return;
            case 4:
                7zU.A0R().A0E(3vP.A00((C2k6) this.A01), 4YU.A0F(7zK.A00(30)));
                return;
            case 5:
            case 6:
            default:
                ((08O) 1Bi.A03(6)).A02().A0A(((1Iw) this.A01).A0D, 4YV.A08("https://www.messenger.com/help/863157058843539"));
                return;
            case 7:
                c1277Ach = (C1277Ach) this.A01;
                if (c1277Ach != null) {
                    manageBlockingParam = (ManageBlockingParam) this.A02;
                    break;
                } else {
                    return;
                }
            case 8:
                C1277Ach c1277Ach2 = (C1277Ach) this.A02;
                if (c1277Ach2 != null) {
                    AnonymousClass622 anonymousClass622 = (AnonymousClass622) this.A01;
                    C62q c62q = c1277Ach2.A00;
                    if (c62q != null) {
                        c62q.Boa(null, null, anonymousClass622);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                c1277Ach = ((BnE) this.A02).A00;
                if (c1277Ach != null) {
                    manageBlockingParam = ManageBlockingParam.A00;
                    break;
                } else {
                    return;
                }
        }
        C62q c62q2 = c1277Ach.A00;
        if (c62q2 != null) {
            c62q2.C5V(manageBlockingParam);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        int color;
        switch (this.A00) {
            case 0:
                BvU bvU = (BvU) this.A01;
                Context context = (Context) this.A02;
                int i = 2132214208;
                if (C0et.A0P == bvU.A00) {
                    i = 2132214198;
                }
                color = context.getColor(i);
                textPaint.setColor(color);
                return;
            case 1:
                11T.A0F(textPaint, 0);
                super.updateDrawState(textPaint);
                textPaint.setColor(((C1937Ax2) this.A02).A01.Atv());
                textPaint.setUnderlineText(false);
                return;
            case 2:
                11T.A0F(textPaint, 0);
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                textPaint.setColor(((MigColorScheme) this.A01).Atv());
                textPaint.setTypeface(Typeface.create(textPaint.getTypeface(), 1));
                return;
            case 3:
                11T.A0F(textPaint, 0);
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                return;
            case 4:
                11T.A0F(textPaint, 0);
                color = ((C1974Ay3) this.A02).A01.AZc();
                textPaint.setColor(color);
                return;
            case 5:
            case 6:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                color = ((MigColorScheme) this.A02).Atv();
                textPaint.setColor(color);
                return;
            default:
                super.updateDrawState(textPaint);
                return;
        }
    }
}
