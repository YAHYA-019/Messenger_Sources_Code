package X;

import android.content.Context;
import android.os.Bundle;

/* loaded from: B2g.class */
public final class B2g extends B2z {
    public static final String __redex_internal_original_name = "AccountLoginSSOInstagramFragment";
    public COx A00;
    public Bjw A01;
    public 6HM A02;
    public final C00i A05 = 1BV.A00(32994);
    public final C00i A03 = AlJ.A03(this);
    public final DJy A07 = new ChQ(this, 2);
    public final BPY A06 = new B37(this, 12);
    public final DIj A04 = new ChV(this);

    public 1iF A1R() {
        return AbK.A0F();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [X.B34, X.C00, X.B36] */
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        this.A01 = (Bjw) 1Bn.A0A(85247);
        this.A02 = (6HM) 7zO.A0m(this, 50020);
        Context context = getContext();
        if (context != null) {
            BPY bpy = this.A06;
            DJy dJy = this.A07;
            ?? b36 = new B36(context, dJy);
            b36.A00 = dJy;
            COx cOx = new COx(this, ((AlJ) this).A00, (C00) b36, bpy, "auth_password", "authenticateOperation", "passwordCredentials", false);
            COx.A02(cOx);
            this.A00 = cOx;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0078, code lost:
    
        if (((X.4DL) r301.A05.get()).A00(r0, r0.getStringExtra(r306)) != false) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            r301 = this;
            r0 = 548558268(0x20b255bc, float:3.0211107E-19)
            r302 = r0
            r0 = r302
            int r0 = X.0FI.A02(r0)
            r303 = r0
            r0 = r301
            super/*androidx.fragment.app.Fragment*/.onResume()
            r0 = r301
            androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L41
            r0 = r304
            android.content.Intent r0 = r0.getIntent()
            r305 = r0
            java.lang.String r0 = "is_msite_sso_eligible"
            r306 = r0
            r0 = r305
            r1 = r306
            boolean r0 = r0.hasExtra(r1)
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L48
            r0 = 0
            r304 = r0
            r0 = r305
            r1 = r306
            r2 = 0
            boolean r0 = r0.getBooleanExtra(r1, r2)
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L48
        L3a:
            r0 = r305
            r1 = r306
            r0.removeExtra(r1)
        L41:
            r0 = -1929027663(0xffffffff8d055fb1, float:-4.1098974E-31)
            r1 = r303
            X.0FI.A08(r0, r1)
            return
        L48:
            java.lang.String r0 = "is_msite_sso_uri"
            r306 = r0
            r0 = r305
            r1 = r306
            boolean r0 = r0.hasExtra(r1)
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L41
            r0 = r301
            X.00i r0 = r0.A05
            java.lang.Object r0 = r0.get()
            X.4DL r0 = (X.4DL) r0
            r307 = r0
            r0 = r305
            r1 = r306
            java.lang.String r0 = r0.getStringExtra(r1)
            r304 = r0
            r0 = r307
            r1 = r305
            r2 = r304
            boolean r0 = r0.A00(r1, r2)
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L41
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B2g.onResume():void");
    }
}
