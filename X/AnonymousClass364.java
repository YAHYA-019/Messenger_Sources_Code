package X;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: X.364, reason: invalid class name */
/* loaded from: 364.class */
public final class AnonymousClass364 extends AnonymousClass366 {
    public int A00;
    public C2vl A01;
    public C2vm A02;
    public Integer A03;
    public Long A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public java.util.Map A0E;
    public final int A0F;
    public final Class A0G;
    public final Integer A0H;
    public final String A0I;
    public final java.util.Map A0J;
    public final /* synthetic */ AnonymousClass365 A0K;

    public AnonymousClass364(Fragment fragment, AnonymousClass365 anonymousClass365, Integer num) {
        String str;
        Intent intent;
        this.A0K = anonymousClass365;
        int hashCode = fragment.hashCode();
        this.A0F = hashCode;
        this.A0J = AnonymousClass001.A0u();
        this.A08 = fragment instanceof 1lN ? ((1lN) fragment).AWg() : null;
        this.A0G = fragment.getClass();
        Bundle bundle = fragment.mArguments;
        if (bundle != null) {
            if (bundle.containsKey("key_uri")) {
                str = bundle.getString("key_uri");
            } else if (bundle.containsKey("tab_root_intent") && (intent = (Intent) bundle.get("tab_root_intent")) != null) {
                str = intent.getStringExtra(AbstractC00603o4.A00(176));
            }
            this.A0I = str;
            C3Op c3Op = AnonymousClass365.A0O;
            this.A0B = C3Op.A00();
            this.A0C = C2vt.A00(anonymousClass365.A0G.now());
            this.A0H = num;
            if (num == null && hashCode == num.intValue()) {
                throw 1BK.A0g();
            }
        }
        str = null;
        this.A0I = str;
        C3Op c3Op2 = AnonymousClass365.A0O;
        this.A0B = C3Op.A00();
        this.A0C = C2vt.A00(anonymousClass365.A0G.now());
        this.A0H = num;
        if (num == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
    
        if (r0.equals(r0) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass364.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int A07 = (((((((((((AnonymousClass002.A07(this.A0C, (((AnonymousClass002.A07(this.A0B, AnonymousClass002.A05(this.A0G, ((this.A0F * 31) + 1BL.A06(this.A08)) * 31)) + 1BL.A06(this.A0I)) * 31) + this.A00) * 31) + AnonymousClass002.A04(this.A0H)) * 31) + 1BL.A06(this.A07)) * 31) + 1BL.A06(this.A0D)) * 31) + 1BL.A06(this.A06)) * 31) + 1BL.A06(this.A0A)) * 31) + 1BL.A06(this.A09)) * 31;
        java.util.Map map = this.A0E;
        if (map != null) {
            i = map.hashCode();
        }
        return 1BK.A03(this.A0J, (A07 + i) * 31);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("\n            FragmentSession{fragmentInstanceId=");
        A0k.append(this.A0F);
        A0k.append(",\n            moduleName='");
        A0k.append(this.A08);
        A0k.append("',\n            fragmentClass=");
        A0k.append(this.A0G);
        A0k.append(",\n            sessionId='");
        A0k.append(this.A0B);
        A0k.append("',\n            keyURI='");
        A0k.append(this.A0I);
        A0k.append("',\n            subsessionId=");
        A0k.append(this.A00);
        A0k.append(",\n            subsessionTimestamp='");
        A0k.append(this.A0C);
        A0k.append("',\n            parentFragmentInstanceId=");
        A0k.append(this.A0H);
        A0k.append(",\n            currentSurfaceLinkId='");
        A0k.append(this.A07);
        A0k.append("',\n            surfaceName='");
        A0k.append(this.A0D);
        A0k.append("',\n            bookmarkTypeName='");
        A0k.append(this.A06);
        A0k.append("',\n            badgeCount=");
        A0k.append(this.A03);
        A0k.append(",\n            badgeType='");
        A0k.append(this.A05);
        A0k.append("',\n            promoSource='");
        A0k.append(this.A01);
        A0k.append("',\n            promoType='");
        A0k.append(this.A02);
        A0k.append("',\n            promoId='");
        A0k.append(this.A04);
        A0k.append("',\n            originalNavigationTapPoint='");
        A0k.append(this.A0A);
        A0k.append("',\n            navigationTapPoint='");
        A0k.append(this.A09);
        A0k.append("',\n            extras='");
        A0k.append(this.A0E);
        A0k.append("',\n            childFragmentSessions=");
        A0k.append(this.A0J);
        return 0Cc.A0j(AnonymousClass001.A0d("}\n            ", A0k));
    }
}
