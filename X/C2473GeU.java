package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.GeU, reason: case insensitive filesystem */
/* loaded from: GeU.class */
public final class C2473GeU extends C1q6 {
    public Activity A00;
    public Window A01;
    public boolean A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A06;
    public final 1Br A08;
    public final 1Br A09;
    public final Context A0A;
    public final FbUserSession A0B;
    public final 1Br A05 = 1Bq.A00(99410);
    public final 1Br A07 = 1Bq.A00(66444);
    public final HGB A0E = new Gpl(this, 15);
    public final JLm A0D = GpZ.A00(this, 34);
    public final 52O A0C = new IQG(this);
    public final 2QY A0G = Gys.A00(this, 23);
    public final 2Qn A0F = IYv.A00(this, 32);

    public C2473GeU(FbUserSession fbUserSession, Context context) {
        this.A0B = fbUserSession;
        this.A0A = context;
        this.A03 = GOn.A0X(context, fbUserSession);
        this.A04 = GOn.A0Y(context, fbUserSession);
        this.A06 = GOn.A0b(context, fbUserSession);
        this.A08 = GOn.A0V(context, fbUserSession);
        this.A09 = GOn.A0U(context, fbUserSession);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
    
        if (r0 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0084, code lost:
    
        if (r0.inCallState != 2) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A00(X.C2473GeU r301) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2473GeU.A00(X.GeU):void");
    }

    @Override // X.C1q6, X.C1pu
    public void Bib(Bundle bundle, View view, Fragment fragment) {
        11T.A0F(view, 1);
        Activity A04 = 0NA.A04(view.getContext());
        11T.A0I(A04, 7zK.A00(2));
        Window window = A04.getWindow();
        if (window == null) {
            throw 1BK.A0h();
        }
        this.A01 = window;
        this.A00 = A04;
        int A00 = ((5W9) 1Br.A0B(this.A07)).A00(A04, 2132213826);
        1tJ.A09(window, true);
        1tJ.A06(window, A00);
        window.addFlags(-2013265920);
        C2yk.A00(window, A00);
        WindowManager.LayoutParams attributes = window.getAttributes();
        11T.A0A(attributes);
        attributes.layoutInDisplayCutoutMode = 1;
    }

    @Override // X.C1q6, X.C1pu, X.C1pv
    public void Bic(Fragment fragment) {
        this.A01 = null;
    }

    @Override // X.C1q6, X.C1pu, X.C1pv
    public void CMf(Fragment fragment) {
        GOp.A0R(this.A03).A09(this.A0E);
        GOp.A0Q(this.A04).A60(this.A0D);
        C00i c00i = this.A05.A00;
        ((C4A7) c00i.get()).A03(this.A0C);
        GOp.A0u(this.A06).A67(this.A0G);
        GOp.A0e(this.A08).A02(this.A0F);
        this.A02 = ((C4A7) c00i.get()).A04(15);
        A00(this);
    }

    @Override // X.C1q6, X.C1pu, X.C1pv
    public void CNf(Fragment fragment) {
        GOp.A0R(this.A03).A0A(this.A0E);
        GOp.A0Q(this.A04).CeV(this.A0D);
        C4A7 c4a7 = (C4A7) 1Br.A0B(this.A05);
        52O r0 = this.A0C;
        synchronized (c4a7.A03) {
            c4a7.A02.A03(r0);
        }
        GOp.A0u(this.A06).CeZ(this.A0G);
        GOp.A0e(this.A08).A03(this.A0F);
    }
}
