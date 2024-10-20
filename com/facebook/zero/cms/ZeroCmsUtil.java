package com.facebook.zero.cms;

import X.0fH;
import X.1BK;
import X.1BQ;
import X.1BV;
import X.1Bn;
import X.1Fw;
import X.1G2;
import X.1HH;
import X.1I7;
import X.1Kd;
import X.1Ky;
import X.1VX;
import X.1Vd;
import X.1iF;
import X.2BQ;
import X.2JX;
import X.2Jf;
import X.7qS;
import X.AnonymousClass001;
import X.C00i;
import X.C01663sh;
import X.C03713yu;
import X.C11804xj;
import X.C2067Das;
import X.C3sa;
import X.C3sb;
import X.InterfaceC09644qs;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.inject.FbInjector;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: ZeroCmsUtil.class */
public final class ZeroCmsUtil implements InterfaceC09644qs {
    public final Object A0E = new Object();
    public final C00i A0C = new 1BQ(16964);
    public final C00i A0J = new 1BV(66086);
    public final C00i A08 = new 1BQ(16511);
    public final C00i A0I = new 1BQ(33028);
    public final C00i A0A = new 1BQ(16923);
    public final C00i A0D = new 1BV(33101);
    public final C00i A09 = new 1BQ(33013);
    public final C00i A07 = new 1BQ(33026);
    public final C00i A0H = new 1BQ(16449);
    public final C00i A0G = FbInjector.A00;
    public final C00i A0B = new 1HH(FbInjector.A03, 65728);
    public ListenableFuture A00 = null;
    public Map A05 = RegularImmutableMap.A03;
    public String A03 = null;
    public String A02 = null;
    public String A04 = null;
    public String A01 = null;
    public boolean A06 = false;
    public final List A0F = new ArrayList();

    public static void A00(ZeroCmsUtil zeroCmsUtil) {
        C00i c00i = zeroCmsUtil.A0C;
        if (c00i.get() == null || !((2BQ) c00i.get()).A05("zero_cms_read_for_fb4a") || zeroCmsUtil.A06) {
            return;
        }
        ((C11804xj) zeroCmsUtil.A0I.get()).A00(zeroCmsUtil);
        zeroCmsUtil.A06 = true;
    }

    public static void A01(ZeroCmsUtil zeroCmsUtil, Map map) {
        zeroCmsUtil.A05 = map;
        if (zeroCmsUtil.A04 != null && zeroCmsUtil.A01 != null) {
            ImmutableMap.copyOf(map);
        }
        Iterator it = zeroCmsUtil.A0F.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass001.A0Q("onCmsChanged");
        }
        ((1I7) zeroCmsUtil.A0B.get()).CkT("com.facebook.zero.UI_STRINGS_CHANGED");
    }

    public C03713yu A02(FbUserSession fbUserSession, boolean z) {
        7qS r0 = (7qS) this.A0J.get();
        String A3a = ((FbSharedPreferences) this.A09.get()).A3a((1G2) ((1Ky) 1Bn.A0A(98565)).A0g.getValue(), "");
        0fH.A0j("ZeroCmsAPIHandler", "Trying to get the cms data from server.");
        GraphQlQueryParamSet graphQlQueryParamSet = new GraphQlQueryParamSet();
        if (!z) {
            A3a = "";
        }
        graphQlQueryParamSet.A05("hash", A3a);
        C00i c00i = r0.A01;
        if (((C01663sh) c00i.get()).A0H()) {
            graphQlQueryParamSet.A04("carrier_id_override", Integer.valueOf(((C01663sh) c00i.get()).A05()));
        }
        2Jf r02 = new 2Jf(2JX.class, (Class) null, "FetchCmsQuery", (String) null, "fbandroid", 755885682, 0, 416148177L, 416148177L, false, true);
        r02.A00 = graphQlQueryParamSet;
        C3sa A00 = C3sa.A00(r02);
        ((C3sb) A00).A03 = 0L;
        A00.A0B = false;
        1Vd A0F = 1VX.A0F((Context) 1Bn.A0E((Context) null, r0.A00, 83719), fbUserSession);
        A00.A05 = new 1iF(453586272481763L);
        C03713yu A04 = A0F.A04(A00);
        synchronized (this.A0E) {
            ListenableFuture listenableFuture = this.A00;
            if (listenableFuture != null) {
                listenableFuture.cancel(true);
            }
            this.A00 = A04;
        }
        1Kd.A0F(new C2067Das(this, 5), A04, (Executor) this.A0H.get());
        return A04;
    }

    public String A03(String str, int i) {
        return A04(str, 1BK.A04(this.A0G).getString(i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0069, code lost:
    
        if (r301.A01 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0206, code lost:
    
        if (r308 == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0040, code lost:
    
        if (((X.2BQ) r0.get()).A05("zero_cms_read_for_fb4a") == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String A04(java.lang.String r302, java.lang.String r303) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.zero.cms.ZeroCmsUtil.A04(java.lang.String, java.lang.String):java.lang.String");
    }

    @Override // X.InterfaceC09644qs
    public ListenableFuture C4u(Locale locale) {
        FbUserSession A00 = 1Fw.A00();
        0fH.A0j("ZeroCmsUtil", "The Locale is changed, reload the cms data");
        A02(A00, false);
        return null;
    }
}
