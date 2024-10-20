package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.rtc.interfaces.WebrtcUiHandlerListenerParams;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.GeW, reason: case insensitive filesystem */
/* loaded from: GeW.class */
public final class C2475GeW extends C1q6 implements 2QP {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final Context A06;
    public final FbUserSession A07;
    public final Ht3 A08;
    public final 2Qe A09;
    public final 2QY A0A;
    public final List A0B;

    public C2475GeW(FbUserSession fbUserSession, Context context) {
        11T.A0F(fbUserSession, 1);
        this.A07 = fbUserSession;
        this.A06 = context;
        this.A02 = GOn.A0b(context, fbUserSession);
        this.A03 = GOn.A0Z(context, fbUserSession);
        this.A04 = GOn.A0e(context, fbUserSession);
        this.A01 = GOn.A0a(context, fbUserSession);
        this.A00 = 1Bq.A00(49426);
        this.A05 = 1Lm.A00(context, fbUserSession, 115589);
        this.A0B = AnonymousClass001.A0s();
        this.A0A = Gys.A00(this, 26);
        this.A08 = new Gq8(this, 11);
        this.A09 = new Gyx(this, 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e9, code lost:
    
        if (com.google.common.base.Objects.equal(r0.A03.A03, r0.A03.A03) == false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A00(X.C2475GeW r301) {
        /*
            Method dump skipped, instructions count: 740
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2475GeW.A00(X.GeW):void");
    }

    @Override // X.C1q6, X.C1pu
    public void CHq(Fragment fragment) {
        A00(this);
    }

    @Override // X.C1q6, X.C1pu, X.C1pv
    public void CMf(Fragment fragment) {
        GOp.A0u(this.A02).A67(this.A0A);
        GOp.A0a(this.A04).A62(this.A08);
        GOp.A0s(this.A01).A0l(this.A09, (WebrtcUiHandlerListenerParams) null);
        GOq.A1G(this.A00, this);
    }

    @Override // X.C1q6, X.C1pu, X.C1pv
    public void CNf(Fragment fragment) {
        GOp.A0u(this.A02).CeZ(this.A0A);
        GOp.A0a(this.A04).CeX(this.A08);
        GOp.A0s(this.A01).A0k(this.A09);
        ((C4zR) 1Br.A0B(this.A00)).A05(this);
        IfG ifG = GOq.A0s(this.A03).A07;
        if (ifG != null) {
            IfG.A00(ifG, new Ime(ifG, new 0QO(0), false));
            ((Hnj) 1Br.A0B(this.A05)).A00(C0uA.A00);
        }
    }

    public java.util.Map CYl() {
        StringBuilder A0k = AnonymousClass001.A0k();
        Iterator it = this.A0B.iterator();
        while (it.hasNext()) {
            A0k.append(AnonymousClass001.A0i(it));
            A0k.append(',');
        }
        if (A0k.length() > 0) {
            A0k.deleteCharAt(A0k.length() - 1);
        }
        java.util.Map singletonMap = Collections.singletonMap("Subscribed Streams", A0k.length() > 0 ? A0k.toString() : "None");
        11T.A0A(singletonMap);
        return singletonMap;
    }
}
