package X;

import android.content.Context;
import android.view.View;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.8vp, reason: invalid class name */
/* loaded from: 8vp.class */
public final class C8vp extends C63h implements AYD, C6eR {
    public 06Z A00;
    public 1BY A01;
    public Message A02;
    public ThreadKey A03;
    public final C00i A04;
    public final C4r A05;

    public C8vp(1BO r302) {
        super((Context) 1Bn.A0B(83719));
        this.A04 = 1BQ.A02(68543);
        this.A01 = 7zL.A0Q(r302);
        this.A05 = ((AbR) 1Bn.A0B(450)).A0t((Context) 1Bn.A0B(83719));
    }

    @Override // X.C63h
    public String A03(6Az r302, Message message) {
        Dp9 dp9;
        String A0r;
        2JX A00 = 9Ct.A00(r302);
        return (A00 == null || (dp9 = (Dp9) A00.A0L(-801074910, Dp9.class, -1682063580)) == null || dp9.Ayl().isEmpty() || (A0r = dp9.A0r(-538310583)) == null) ? super.A03(r302, message) : A0r;
    }

    @Override // X.C63h
    public boolean A04() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0028, code lost:
    
        if (r309 != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00e1, code lost:
    
        if (r0.getBooleanValue(100490396) == false) goto L10;
     */
    @Override // X.C63h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A05(X.1Iw r302, X.5zD r303, X.6Az r304, X.AnonymousClass622 r305, X.7Wh r306) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8vp.A05(X.1Iw, X.5zD, X.6Az, X.622, X.7Wh):X.1LI");
    }

    public void BMf(View view, 6Az r303, Message message) {
        this.A05.A00(view, this.A00, r303, this.A02, this.A03);
    }

    @Override // X.C6eR
    public void Cp5(06Z r302) {
        this.A00 = r302;
    }
}
