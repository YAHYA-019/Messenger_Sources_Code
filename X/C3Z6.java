package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.presence.unifiedpresence.UnifiedPresenceViewLoggerItem;
import com.google.common.base.Preconditions;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.3Z6, reason: invalid class name */
/* loaded from: 3Z6.class */
public final class C3Z6 implements 2YE {
    public final C00i A01 = 1BQ.A02(16772);
    public final C00i A00 = 1BV.A00(32840);
    public final C00i A02 = 1BQ.A02(16766);
    public final C00i A03 = 1BQ.A02(16973);

    public static final C3Z6 A00() {
        return new C3Z6();
    }

    public static 2DM A01(3E3 r301, C3Z5 c3z5, C26T c26t) {
        2DM r0 = new 2DM(c26t);
        StringBuilder sb = new StringBuilder();
        sb.append(r301.unitId);
        sb.append(":");
        sb.append(c3z5.A08);
        r0.A0o(PublicKeyCredentialControllerUtility.JSON_KEY_ID, sb.toString());
        return r0;
    }

    public static 2DM A02(C3Z5 c3z5) {
        3E3 r0 = c3z5.A09;
        3E3 r02 = 3E3.A02;
        Preconditions.checkArgument(r0.equals(r02));
        2DM A01 = A01(r0, c3z5, C26T.A00);
        A01.A0i(PublicKeyCredentialControllerUtility.JSON_KEY_RP, c3z5.A00);
        A01.A0i(K92.__redex_internal_original_name, 0);
        A06(r0, c3z5, A01, r02);
        A01.A0o("mt", c3z5.A06);
        A01.A0o("mst", c3z5.A05);
        return A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0027, code lost:
    
        if (r0.equals(X.3E3.A04) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.2DM A03(X.C3Z5 r301) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3Z6.A03(X.3Z5):X.2DM");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r0.A00 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String A04(X.C3Z5 r301) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3Z6.A04(X.3Z5):java.lang.String");
    }

    public static void A05(AbstractC01593ro abstractC01593ro, 24X r302, String str) {
        abstractC01593ro.A01(r302, str);
        abstractC01593ro.A06("pigeon_reserved_keyword_module", "inbox2");
        abstractC01593ro.A0A();
    }

    public static void A06(3E3 r301, C3Z5 c3z5, 2DM r303, Object obj) {
        r303.A0o("st", obj.toString());
        r303.A0o("src", "CONTACTS_M4");
        r303.A0o("u", r301.analyticsTag);
        r303.A0i("up", c3z5.A01);
        r303.A0o("ulg", A04(c3z5));
    }

    public void A07(C3Z5 c3z5) {
        AbstractC01593ro A3u = 8EQ.A00(1BK.A06(this.A01)).A00.A3u("inbox2_click", false);
        ((C1is) this.A02.get()).A0E("active_now_friends_tab");
        ((2Kv) this.A03.get()).A09("click_point", "active_now_friends_tab");
        if (A3u.A0B()) {
            A05(A3u, A03(c3z5), "i");
        }
    }

    public void Bbs(Collection collection) {
        if (collection.isEmpty()) {
            return;
        }
        HashMap A0u = AnonymousClass001.A0u();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C2k8 c2k8 = (C2k8) it.next();
            C1ps c1ps = c2k8.A05;
            if (c1ps != null) {
                if (!A0u.containsKey(((C3Z5) c1ps).A09)) {
                    A0u.put(((C3Z5) c2k8.A05).A09, AnonymousClass001.A0s());
                }
                ((AbstractCollection) A0u.get(((C3Z5) c2k8.A05).A09)).add(c2k8);
            }
        }
        Iterator A19 = 1BK.A19(A0u);
        while (A19.hasNext()) {
            3E3 r0 = (3E3) A19.next();
            AbstractCollection abstractCollection = (AbstractCollection) A0u.get(r0);
            FbUserSession A00 = 1Fw.A00();
            int ordinal = r0.ordinal();
            if (ordinal == 3 || ordinal == 0) {
                AbstractC01593ro A3u = 8EQ.A00(1BK.A06(this.A01)).A00.A3u("inbox2_vpv", false);
                if (A3u.A0B()) {
                    C03353xs c03353xs = new C03353xs(C26T.A00);
                    Iterator it2 = abstractCollection.iterator();
                    while (it2.hasNext()) {
                        C2k8 c2k82 = (C2k8) it2.next();
                        C1ps c1ps2 = c2k82.A05;
                        if (c1ps2 != null) {
                            2DM A03 = A03((C3Z5) c1ps2);
                            A03.A0i(K92.__redex_internal_original_name, c2k82.A01);
                            A03.A0j("t", c2k82.A02 / 1000);
                            c03353xs.A0d(A03);
                        }
                    }
                    A05(A3u, c03353xs, "is");
                }
                Iterator it3 = abstractCollection.iterator();
                while (it3.hasNext()) {
                    C2k8 c2k83 = (C2k8) it3.next();
                    if (c2k83.A05 != null) {
                        3yB r02 = (3yB) this.A00.get();
                        C3Z5 c3z5 = (C3Z5) c2k83.A05;
                        long j = c3z5.A08;
                        String str = c3z5.A07;
                        if (((C1gb) r02.A03.get()).A0B()) {
                            3yB.A02(A00, r02, Long.valueOf(j), "tab", "an", str, 2yD.A00(2eD.A00((2eD) r02.A02.get()), 36597712684191454L), 1);
                        }
                    }
                }
            } else if (ordinal == 1) {
                AbstractC01593ro A3u2 = 8EQ.A00(1BK.A06(this.A01)).A00.A3u("inbox2_vpv", false);
                if (A3u2.A0B()) {
                    C03353xs c03353xs2 = new C03353xs(C26T.A00);
                    Iterator it4 = abstractCollection.iterator();
                    while (it4.hasNext()) {
                        C2k8 c2k84 = (C2k8) it4.next();
                        C1ps c1ps3 = c2k84.A05;
                        if (c1ps3 != null) {
                            2DM A02 = A02((C3Z5) c1ps3);
                            A02.A0j("t", c2k84.A02 / 1000);
                            c03353xs2.A0d(A02);
                        }
                    }
                    A05(A3u2, c03353xs2, "is");
                }
                Iterator it5 = abstractCollection.iterator();
                while (it5.hasNext()) {
                    C2k8 c2k85 = (C2k8) it5.next();
                    if (c2k85.A05 != null) {
                        3yB r03 = (3yB) this.A00.get();
                        C3Z5 c3z52 = (C3Z5) c2k85.A05;
                        long j2 = c3z52.A08;
                        String str2 = c3z52.A07;
                        if (((C1gb) r03.A03.get()).A0B()) {
                            3yB.A02(A00, r03, Long.valueOf(j2), "tab", "story", str2, 2yD.A00(2eD.A00((2eD) r03.A02.get()), 36597712684191454L), 1);
                        }
                    }
                }
            } else if (ordinal == 2) {
                AbstractC01593ro A3u3 = 8EQ.A00(1BK.A06(this.A01)).A00.A3u("inbox2_vpv", false);
                if (A3u3.A0B()) {
                    C26T c26t = C26T.A00;
                    C03353xs c03353xs3 = new C03353xs(c26t);
                    Iterator it6 = abstractCollection.iterator();
                    while (it6.hasNext()) {
                        C2k8 c2k86 = (C2k8) it6.next();
                        C1ps c1ps4 = c2k86.A05;
                        if (c1ps4 != null) {
                            C3Z5 c3z53 = (C3Z5) c1ps4;
                            3E3 r04 = c3z53.A09;
                            Preconditions.checkArgument(r04.equals(3E3.A03));
                            2DM A01 = A01(r04, c3z53, c26t);
                            A01.A0i(PublicKeyCredentialControllerUtility.JSON_KEY_RP, c3z53.A00);
                            A06(r04, c3z53, A01, 3E3.A01);
                            UnifiedPresenceViewLoggerItem unifiedPresenceViewLoggerItem = c3z53.A02;
                            if (unifiedPresenceViewLoggerItem != null) {
                                A01.A0o("as", unifiedPresenceViewLoggerItem.A04);
                                Long l = unifiedPresenceViewLoggerItem.A02;
                                if (l != null) {
                                    A01.A0o("lat", l.toString());
                                }
                            }
                            A01.A0i(K92.__redex_internal_original_name, c2k86.A01);
                            A01.A0j("t", c2k86.A02 / 1000);
                            c03353xs3.A0d(A01);
                        }
                    }
                    A05(A3u3, c03353xs3, "is");
                }
            }
        }
    }
}
