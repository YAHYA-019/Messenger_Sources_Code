package X;

import android.content.Intent;
import android.net.Uri;
import com.facebook.browser.iabcontext.IabCommonTrait;
import com.facebook.iabadscontext.IABAdsContext;
import com.facebook.iabbwpextension.IABBwPContext;
import com.facebook.iabbwpextension.IABBwPExtension;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: L4Z.class */
public final class L4Z {
    public static int A05;
    public static L4Z A06;
    public static String A07;
    public 8Lr A00;
    public DqM A01;
    public boolean A02;
    public final Kio A03 = new Kio();
    public final KmT A04;

    /* JADX WARN: Type inference failed for: r0v109, types: [X.RKX, java.lang.Object] */
    public L4Z(Intent intent) {
        IABBwPExtension iABBwPExtension;
        StringBuilder A0k;
        String authority;
        String queryParameter;
        this.A04 = new KmT(intent);
        this.A01 = new DqM(0S2.A00, (String) null, (String) null, (String) null, (String) null);
        this.A00 = new 8Lr();
        IabCommonTrait iabCommonTrait = (IabCommonTrait) intent.getParcelableExtra("EXTRA_IAB_CONTEXT");
        IABAdsContext iABAdsContext = (iabCommonTrait == null || !(iabCommonTrait instanceof IABAdsContext)) ? null : (IABAdsContext) iabCommonTrait;
        IABBwPContext iABBwPContext = (IABBwPContext) intent.getParcelableExtra("EXTRA_POST_CLICK_CONTEXT");
        if (iABAdsContext == null && iABBwPContext == null) {
            return;
        }
        if (intent.getBooleanExtra("BrowserLiteIntent.EXTRA_IS_STICKY_UTM_ENABLED", false) && iABAdsContext != null) {
            HashSet A1E = AbF.A1E(iABAdsContext.A08);
            Uri data = intent.getData();
            ?? obj = new Object();
            Uri uri = null;
            ((RKX) obj).A01 = AnonymousClass001.A0s();
            if (data != null && (authority = data.getAuthority()) != null) {
                boolean contains = RKX.A03.contains(authority);
                String queryParameter2 = data.getQueryParameter("u");
                if (queryParameter2 != null) {
                    try {
                        uri = C0A2.A03(queryParameter2);
                    } catch (SecurityException e) {
                        LCd.A04("InitialStickyUTM", "URL parsing throw security exception: %s", new Object[]{e});
                    }
                }
                String str = null;
                if (!contains) {
                    str = data.getAuthority();
                } else if (uri != null) {
                    str = uri.getAuthority();
                }
                ((RKX) obj).A00 = str;
                ArrayList A0s = AnonymousClass001.A0s();
                Iterator it = RKX.A02.iterator();
                while (it.hasNext()) {
                    String A0i = AnonymousClass001.A0i(it);
                    String queryParameter3 = data.getQueryParameter(A0i);
                    if (queryParameter3 != null) {
                        4YU.A1R(A0i, queryParameter3, A0s);
                    }
                    if (contains && uri != null && (queryParameter = uri.getQueryParameter(A0i)) != null) {
                        4YU.A1R(A0i, queryParameter, A0s);
                    }
                }
                ((RKX) obj).A01 = A0s;
            }
            this.A00 = new 8Lr(0, (Object) obj, A1E.contains(EOw.A0A));
        }
        KmT kmT = this.A04;
        if (kmT.A0D || !kmT.A0C) {
            return;
        }
        if (iABAdsContext == null) {
            if (iABBwPContext != null) {
                this.A02 = true;
                iABBwPExtension = iABBwPContext.A00;
            }
            LCd.A05("BwPContext", "Null BwP Extension!", new Object[0]);
        }
        iABBwPExtension = iABAdsContext.A07;
        if (iABBwPExtension != null) {
            Kio kio = this.A03;
            long j = iABBwPExtension.A00;
            long longExtra = intent.getLongExtra("BWP_CACHED_ACCESS_TOKEN_TTL", 0L);
            if (longExtra > j) {
                String stringExtra = intent.getStringExtra("BWP_CACHED_ACCESS_TOKEN_VALUE");
                kio.A02 = stringExtra == null ? "" : stringExtra;
                kio.A00 = longExtra;
                kio.A01 = 0S2.A0C;
                A0k = AnonymousClass001.A0k();
                A0k.append("Extracted token from cache with ttl ");
                A0k.append(longExtra);
            } else {
                kio.A02 = iABBwPExtension.A02;
                kio.A00 = j;
                kio.A01 = 0S2.A0N;
                A0k = AnonymousClass001.A0k();
                A0k.append("Extracted token from ad with ttl ");
                A0k.append(j);
            }
            0fH.A0j("BwPAccessToken", A0k.toString());
            this.A01 = new DqM(iABBwPExtension);
            LCd.A03("BwPContext", AnonymousClass001.A0Z(iABBwPExtension, "Recharged with ", AnonymousClass001.A0k()), new Object[0]);
            return;
        }
        LCd.A05("BwPContext", "Null BwP Extension!", new Object[0]);
    }

    public static final L4Z A00(Intent intent) {
        11T.A0F(intent, 0);
        L4Z l4z = A06;
        if (l4z == null) {
            A05 = LCd.A00(intent, "BwPContext");
            l4z = new L4Z(intent);
        }
        if (A05 != intent.hashCode() && A06 != null) {
            A05 = LCd.A00(intent, "BwPContext");
            l4z = new L4Z(intent);
        }
        if (!11T.A0O(A06, l4z)) {
            A06 = l4z;
        }
        return l4z;
    }

    public final boolean A01() {
        return AnonymousClass001.A1W(this.A01.A01, 0S2.A0C);
    }

    public final boolean A02() {
        if (this.A04.A0C) {
            return this.A01.A01 == 0S2.A01 || A01();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r306 == null) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A03(java.lang.String r302) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L4Z.A03(java.lang.String):boolean");
    }
}
