package X;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.query.GraphQlQueryParamSet;

/* loaded from: E1N.class */
public final class E1N extends E1z {
    public static final String __redex_internal_original_name = "FxImSettingsFlowFragment";
    public FbUserSession A00;
    public 2JX A01;
    public boolean A03;
    public final C00i A04 = AbF.A0S(this, 99814);
    public final C00i A09 = 1BV.A00(99818);
    public final C00i A07 = AbF.A0S(this, 82296);
    public final C00i A05 = 1BV.A00(99815);
    public final C00i A06 = 1BV.A00(99771);
    public final C00i A08 = 1BV.A00(99824);
    public final C00i A0A = AbH.A0M();
    public boolean A02 = false;

    public static 2JX A03(2JX r301) {
        2JX A0L;
        if (r301 == null || (A0L = 1BL.A0L(r301, -480160002, -1968405396)) == null) {
            return null;
        }
        return 1BL.A0L(A0L, -1698705845, 1853013286);
    }

    public 1iF A1R() {
        return AbK.A0F();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        this.A00 = AbL.A09(this);
        1BK.A0U(this.A0A).markerStart(857804268);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x028f, code lost:
    
        if (r343 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x034c, code lost:
    
        if (r339 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0368, code lost:
    
        if (r336 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0384, code lost:
    
        if (r327 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x03c2, code lost:
    
        if (r338 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x03e5, code lost:
    
        if (r335 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0431, code lost:
    
        if (r337 == null) goto L90;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1c() {
        /*
            Method dump skipped, instructions count: 1933
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E1N.A1c():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityResult(int i, int i2, Intent intent) {
        super/*X.DZJ*/.onActivityResult(i, i2, intent);
        if (i2 != -1 || i != 2 || intent == null || intent.getStringExtra("SNACKBAR_MESSAGE") == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("SNACKBAR_MESSAGE");
        this.A09.get();
        F1t.A00(this, ((BJB) this).A01, stringExtra);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(-464557652);
        super/*androidx.fragment.app.Fragment*/.onPause();
        this.A03 = false;
        0FI.A08(-1360828633, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(-2125790896);
        super/*androidx.fragment.app.Fragment*/.onResume();
        1BK.A0U(this.A0A).markerStart(857804268);
        A1e();
        F9r f9r = (F9r) this.A07.get();
        this.A00.getClass();
        GraphQlQueryParamSet A0M = 7zL.A0M();
        2Jf r0 = new 2Jf(2JX.class, (Class) null, "FxImProfileQuery", (String) null, "fbandroid", -724122962, 0, 1570795262L, 1570795262L, false, true);
        r0.A00 = A0M;
        C3sa A0L = AbK.A0L(r0);
        A0L.A0B = false;
        f9r.A03(A0L, FwL.A00(this, 28));
        0FI.A08(-317929972, A02);
    }
}
