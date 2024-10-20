package X;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.graphql.enums.GraphQLStringDefUtil;
import com.facebook.xapp.messaging.threadview.theme.custom.model.CompositeThreadThemeInfo;
import com.facebook.xapp.messaging.threadview.theme.custom.model.ThreadThemeInfo;
import com.facebook.xapp.messaging.threadview.theme.custom.model.ThreadThemeReactionAssetInfo;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

/* renamed from: X.3Ot, reason: invalid class name */
/* loaded from: 3Ot.class */
public abstract class C3Ot {
    public static CompositeThreadThemeInfo A00(C35w c35w, boolean z) {
        if (c35w == null) {
            return C20r.A00;
        }
        String A0k = c35w.A0k();
        long parseLong = A0k != null ? Long.parseLong(A0k) : -1;
        ThreadThemeInfo threadThemeInfo = null;
        ImmutableMap.Builder A0c = 1BK.A0c();
        ThreadThemeInfo A01 = A01(c35w, parseLong);
        if (z) {
            String str = A01.A0k;
            if (!TextUtils.isEmpty(str)) {
                A0c.put(str, A01);
            }
        }
        1Du it = c35w.A0c(-1838707556, C35w.class, 1677614347).iterator();
        while (it.hasNext()) {
            C35w c35w2 = (C35w) it.next();
            ThreadThemeInfo A012 = A01(c35w2, parseLong);
            if (z) {
                String str2 = A012.A0k;
                if (!TextUtils.isEmpty(str2)) {
                    A0c.put(str2, A012);
                }
            }
            if ("DARK".equals(c35w2.A0t(GraphQLStringDefUtil.A00(), "GraphQLMessengerAppColorMode", -640756259))) {
                threadThemeInfo = A012;
            }
        }
        2Gq r0 = new 2Gq();
        r0.A00(A01);
        r0.A00 = threadThemeInfo;
        ImmutableMap build = A0c.build();
        r0.A02 = build;
        C1pq.A08("themeVariantMap", build);
        return new CompositeThreadThemeInfo(r0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ThreadThemeInfo A01(C35w c35w, long j) {
        2JX A0L;
        String A0l;
        String A0l2;
        String A0l3;
        String A0l4;
        2JY A0S;
        String A0l5;
        2xK r0 = new 2xK();
        r0.A0S = j;
        String A0k = c35w.A0k();
        if (A0k != null) {
            r0.A0T = Long.parseLong(A0k);
        }
        String A0t = c35w.A0t(GraphQLStringDefUtil.A00(), "GraphQLMessengerAppColorMode", -640756259);
        if (A0t != null) {
            r0.A05(A0t);
        }
        String A0r = c35w.A0r(261031878);
        if (A0r != null) {
            r0.A08 = 0De.A02(A0r);
        }
        String A0r2 = c35w.A0r(1746464963);
        if (A0r2 != null) {
            r0.A04(A0r2);
        }
        String A0h = c35w.A0h();
        if (A0h != null) {
            r0.A0g = A0h;
        }
        r0.A01(3Gb.A00(c35w.A0Z(-1476702881)));
        r0.A0m = c35w.getBooleanValue(114863630);
        2JY A0B = 1BK.A0B(c35w, 2JX.class, 2035058847, 1972017379);
        if (A0B != null && (A0S = A0B.A0S(2JX.class, 679242286)) != null && (A0l5 = A0S.A0l()) != null) {
            Uri uri = null;
            try {
                uri = C0A2.A03(A0l5);
            } catch (SecurityException unused) {
            }
            r0.A0V = uri;
        }
        String A0r3 = c35w.A0r(-1156994110);
        if (A0r3 != null) {
            Uri uri2 = null;
            try {
                uri2 = C0A2.A03(A0r3);
            } catch (SecurityException unused2) {
            }
            r0.A0U = uri2;
        }
        2JY A0B2 = 1BK.A0B(c35w, 2JX.class, -170947670, -751343639);
        if (A0B2 != null) {
            2JY A0B3 = 1BK.A0B(A0B2, 2JX.class, 109548807, 674602988);
            if (A0B3 != null && (A0l4 = A0B3.A0l()) != null) {
                Uri uri3 = null;
                try {
                    uri3 = C0A2.A03(A0l4);
                } catch (SecurityException unused3) {
                }
                r0.A0Y = uri3;
            }
            2JY A0B4 = 1BK.A0B(A0B2, 2JX.class, 102742843, 308612776);
            if (A0B4 != null && (A0l3 = A0B4.A0l()) != null) {
                Uri uri4 = null;
                try {
                    uri4 = C0A2.A03(A0l3);
                } catch (SecurityException unused4) {
                }
                r0.A0W = uri4;
            }
        }
        2JY A0B5 = 1BK.A0B(c35w, 2JX.class, -1647103377, -953878981);
        if (A0B5 != null && (A0L = 1BL.A0L(A0B5, 1564247641, 245150719)) != null) {
            ImmutableList.Builder builder = ImmutableList.builder();
            1Du it = A0L.A2J(1509822839).iterator();
            while (it.hasNext()) {
                2JY r02 = (2JY) it.next();
                Uri uri5 = null;
                Uri uri6 = null;
                Uri uri7 = null;
                String A0r4 = r02.A0r(1448042252);
                if (A0r4 != null) {
                    try {
                        uri5 = C0A2.A03(A0r4);
                    } catch (SecurityException unused5) {
                    }
                }
                2JY A0B6 = 1BK.A0B(r02, 2JX.class, 909412887, 2032070819);
                if (A0B6 != null && (A0l2 = A0B6.A0l()) != null) {
                    try {
                        uri7 = C0A2.A03(A0l2);
                    } catch (SecurityException unused6) {
                    }
                }
                2JY A0B7 = 1BK.A0B(r02, 2JX.class, 446109795, -1724166477);
                if (A0B7 != null && (A0l = A0B7.A0l()) != null) {
                    try {
                        uri6 = C0A2.A03(A0l);
                    } catch (SecurityException unused7) {
                    }
                }
                String A0r5 = r02.A0r(469613232);
                C1pq.A08("reactionEmoji", A0r5);
                builder.m11011add((Object) new ThreadThemeReactionAssetInfo(uri5, uri6, uri7, "", A0r5));
            }
            ImmutableList build = builder.build();
            r0.A0d = build;
            C1pq.A08("reactionAssets", build);
        }
        String A0t2 = c35w.A0t(GraphQLStringDefUtil.A00(), "GraphQLMessengerThreadViewMode", -1573218563);
        if (A0t2 != null) {
            r0.A0i = A0t2;
            2xK.A00(r0, "threadViewMode");
        }
        String A0t3 = c35w.A0t(GraphQLStringDefUtil.A00(), "GraphQLMessengerThreadThemeType", 549259248);
        if (A0t3 != null) {
            r0.A06(A0t3);
        }
        ImmutableList A00 = 3Gb.A00(c35w.A0Z(-1024402354));
        r0.A0Z = A00;
        C1pq.A08("backgroundGradientColors", A00);
        String A0r6 = c35w.A0r(-698721467);
        if (A0r6 != null) {
            r0.A0O = 0De.A02(A0r6);
        }
        String A0r7 = c35w.A0r(1855967825);
        if (A0r7 != null) {
            r0.A00 = 0De.A02(A0r7);
        }
        r0.A03(3Gb.A00(c35w.A0Z(-764364191)));
        String A0r8 = c35w.A0r(-1491421234);
        if (A0r8 != null) {
            r0.A0A = 0De.A02(A0r8);
        }
        r0.A0B = c35w.getIntValue(-1473137103);
        r0.A0C = c35w.getIntValue(474710970);
        r0.A0D = c35w.getIntValue(1952204934);
        String A0r9 = c35w.A0r(1948351375);
        if (A0r9 != null) {
            r0.A0E = 0De.A02(A0r9);
        }
        String A0r10 = c35w.A0r(-211803448);
        if (A0r10 != null) {
            r0.A0F = 0De.A02(A0r10);
        }
        r0.A0G = c35w.getIntValue(-193519317);
        r0.A0H = c35w.getIntValue(383822720);
        r0.A0I = c35w.getIntValue(1861316684);
        String A0r11 = c35w.A0r(-1898357495);
        if (A0r11 != null) {
            r0.A0J = 0De.A02(A0r11);
        }
        String A0r12 = c35w.A0r(-949652924);
        if (A0r12 != null) {
            r0.A0Q = 0De.A02(A0r12);
        }
        String A0r13 = c35w.A0r(353681360);
        if (A0r13 != null) {
            r0.A0N = 0De.A02(A0r13);
        }
        String A0r14 = c35w.A0r(139382905);
        if (A0r14 != null) {
            r0.A0P = 0De.A02(A0r14);
        }
        String A0r15 = c35w.A0r(1360264934);
        if (A0r15 != null) {
            r0.A01 = 0De.A02(A0r15);
        }
        String A0r16 = c35w.A0r(-342229437);
        if (A0r16 != null) {
            r0.A04 = 0De.A02(A0r16);
        }
        String A0r17 = c35w.A0r(-690851484);
        if (A0r17 != null) {
            r0.A02 = 0De.A02(A0r17);
        }
        r0.A03 = c35w.getIntValue(-672567353);
        String A0r18 = c35w.A0r(-991289954);
        if (A0r18 != null) {
            r0.A05 = 0De.A02(A0r18);
        }
        String A0r19 = c35w.A0r(-748520405);
        if (A0r19 != null) {
            r0.A06 = 0De.A02(A0r19);
        }
        String A0r20 = c35w.A0r(-629248623);
        if (A0r20 != null) {
            r0.A07 = 0De.A02(A0r20);
        }
        String A0r21 = c35w.A0r(-325007394);
        if (A0r21 != null) {
            r0.A0M = 0De.A02(A0r21);
        }
        String A0r22 = c35w.A0r(-1156910099);
        if (A0r22 != null) {
            r0.A09 = 0De.A02(A0r22);
        }
        String A0r23 = c35w.A0r(270974786);
        if (A0r23 != null) {
            r0.A0K = 0De.A02(A0r23);
        }
        String A0r24 = c35w.A0r(-69071189);
        if (A0r24 != null) {
            r0.A0R = 0De.A02(A0r24);
        }
        String A0r25 = c35w.A0r(-1056551486);
        if (A0r25 != null) {
            r0.A0L = 0De.A02(A0r25);
        }
        String A0r26 = c35w.A0r(1911354504);
        if (A0r26 != null) {
            r0.A0k = A0r26;
        }
        ImmutableList.Builder builder2 = ImmutableList.builder();
        Object A0C = 2JY.A0C(c35w, 215815355);
        if (A0C == null) {
            A0C = c35w.getIntList(215815355);
            2JY.A0E(c35w, A0C, 215815355);
        }
        1Du it2 = ((ImmutableCollection) A0C).iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (next != null) {
                builder2.m11011add(next);
            }
        }
        r0.A02(builder2.build());
        r0.A0h = c35w.A0r(-806216334);
        return new ThreadThemeInfo(r0);
    }
}
