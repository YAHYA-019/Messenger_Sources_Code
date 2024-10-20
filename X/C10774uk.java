package X;

import android.content.Context;
import android.net.Uri;
import android.util.LruCache;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.distribgw.client.regionhint.DGWRegionHintManager;
import com.facebook.graphql.enums.GraphQLStoryAttachmentStyle;
import com.facebook.messaging.attachments.VideoAttachmentData;
import com.facebook.messaging.media.prefetch.XMACacheData;
import com.facebook.messaging.media.prefetch.source.MediaPrefetchRequestSource;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.montage.model.MontageCard;
import com.facebook.video.engine.api.VideoDataSource;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.4uk, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4uk.class */
public final class C10774uk implements CallerContextable {
    public static long A0K = 0;
    public static final String __redex_internal_original_name = "MediaPrefetchHandler";
    public 1BY A00;
    public final C00i A01 = new 1BQ(49420);
    public final C00i A09 = new 1BV((1BY) null, 67968);
    public final C00i A02 = new 1BV((1BY) null, 33031);
    public final C00i A0B = new 1BQ(16477);
    public final C00i A05 = new 1BQ(50015);
    public final C00i A06 = new 1BQ(65609);
    public final C00i A07 = new 1BV((1BY) null, 84677);
    public final C00i A0E = new 1BV((1BY) null, 49970);
    public final C00i A0D = new 1BQ(49880);
    public final C00i A0G = new 1BQ(49991);
    public final C00i A0J = new 1BV((1BY) null, 67568);
    public final C00i A04 = new 1BQ(32976);
    public final C00i A03 = new 1BQ(99390);
    public final C00i A0F = new 1BV((1BY) null, 66568);
    public final C00i A08 = new 1BV((1BY) null, 116183);
    public final C00i A0C = new 1BV((1BY) null, 116182);
    public final C00i A0I = new 1BQ(16385);
    public final C00i A0A = new 1HH((Context) 1Bn.A0E((Context) null, (1BY) null, 83719), 66579);
    public final LruCache A0H = new LruCache(200);

    public C10774uk(1BO r302) {
        this.A00 = new 1BY(r302);
    }

    public static 6Ce A00(Integer num, boolean z) {
        6Ce r0 = 6Ce.A0K;
        switch (num.intValue()) {
            case 0:
                return 6Ce.A0G;
            case 1:
                return 6Ce.A0F;
            case 2:
                return 6Ce.A0E;
            case 3:
                return 6Ce.A0D;
            case 4:
            default:
                return r0;
            case 5:
                return z ? 6Ce.A0I : 6Ce.A0H;
            case 6:
                return 6Ce.A0J;
        }
    }

    public static void A01(Uri uri, CallerContext callerContext, C10774uk c10774uk, Message message, Integer num, boolean z, boolean z2) {
        if (uri != null) {
            if (0CO.A04(uri) || DGWRegionHintManager.SERVICE_KEY_MSYS.equals(uri.getScheme()) || (0CO.A02(uri) && uri.getHost() != null && uri.getHost().endsWith("tam-attachment"))) {
                if (z) {
                    C00i c00i = c10774uk.A0F;
                    c00i.get();
                    1G9 r0 = C09374px.A03;
                    if (message != null) {
                        c10774uk.A0A.get();
                        ((C09374px) c00i.get()).A01(uri.toString(), message.A05 + 60V.A00(message));
                    }
                }
                ((Executor) c10774uk.A0B.get()).execute(new 81R(uri, callerContext, c10774uk, message, num, z, z2));
            }
        }
    }

    public static void A02(Uri uri, CallerContext callerContext, C10774uk c10774uk, MontageCard montageCard, Integer num, boolean z) {
        if (uri == null || !0CO.A04(uri)) {
            return;
        }
        C00i c00i = c10774uk.A0F;
        c00i.get();
        1G9 r0 = C09374px.A03;
        ((C09374px) c00i.get()).A01(uri.toString(), ((60V) c10774uk.A0A.get()).A07(montageCard));
        ((Executor) c10774uk.A0B.get()).execute(new AHB(uri, callerContext, c10774uk, montageCard, num, z));
    }

    public static void A03(Uri uri, C10774uk c10774uk, Integer num, String str, String str2, boolean z) {
        if (((2yD) c10774uk.A0I.get()).AZk(36325218483196372L) && str != null) {
            LruCache lruCache = c10774uk.A0H;
            if (lruCache.get(str) != null) {
                return;
            } else {
                lruCache.put(str, str);
            }
        }
        c10774uk.A0A(uri, A00(num, z), str, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0351, code lost:
    
        if (X.AnonymousClass693.A00(r0, r314, r307) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x013f, code lost:
    
        if (X.AnonymousClass693.A00(r0, X.HBi.A06, r307) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x018b, code lost:
    
        if (com.facebook.messaging.media.prefetch.source.MediaPrefetchRequestSource.A01(r307) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x018e, code lost:
    
        r0 = X.1BK.A05();
        r0.putParcelable("fetchStickersParams", new com.facebook.stickers.service.models.FetchStickersParams(X.0S2.A01, X.1BK.A17(java.util.Arrays.asList(r0))));
        X.1Kd.A0D(r303.A0B, new X.8Hi(r302, r303, r304, r307, r0, r0), X.1Ho.A00(((com.facebook.fbservice.ops.BlueServiceOperationFactory) r303.A02.get()).newInstance("fetch_stickers", r0, 0, r302, r301), true));
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02e3, code lost:
    
        if (X.AnonymousClass693.A00(r0, X.HBi.A05, r307) == false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A04(com.facebook.auth.usersession.FbUserSession r301, com.facebook.common.callercontext.CallerContext r302, X.C10774uk r303, com.facebook.messaging.model.messages.Message r304, java.lang.Boolean r305, java.lang.Boolean r306, java.lang.Integer r307) {
        /*
            Method dump skipped, instructions count: 1223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10774uk.A04(com.facebook.auth.usersession.FbUserSession, com.facebook.common.callercontext.CallerContext, X.4uk, com.facebook.messaging.model.messages.Message, java.lang.Boolean, java.lang.Boolean, java.lang.Integer):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x02da, code lost:
    
        if (X.AnonymousClass693.A00((X.AnonymousClass693) X.1Lo.A04((android.content.Context) null, r301, r303.A00, 65932), ((X.C69m) r0.get()).A02(r304) ? X.HBi.A03 : X.HBi.A04, r306) == false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A05(com.facebook.auth.usersession.FbUserSession r301, com.facebook.common.callercontext.CallerContext r302, X.C10774uk r303, com.facebook.messaging.montage.model.MontageCard r304, java.lang.Boolean r305, java.lang.Integer r306) {
        /*
            Method dump skipped, instructions count: 1029
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10774uk.A05(com.facebook.auth.usersession.FbUserSession, com.facebook.common.callercontext.CallerContext, X.4uk, com.facebook.messaging.montage.model.MontageCard, java.lang.Boolean, java.lang.Integer):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        if (r301.getQueryParameter("oe") == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A06(android.net.Uri r301) {
        /*
            r0 = r301
            if (r0 == 0) goto L3f
            r0 = r301
            boolean r0 = X.C0Aj.A04(r0)
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L30
            r0 = r301
            boolean r0 = X.C0Aj.A05(r0)
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L3f
            r0 = r301
            java.lang.String r0 = r0.getHost()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L3f
            java.util.regex.Pattern r0 = X.C0Aj.A03
            r1 = r303
            java.util.regex.Matcher r0 = r0.matcher(r1)
            r304 = r0
            r0 = r304
            boolean r0 = r0.matches()
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L3f
        L30:
            r0 = r301
            java.lang.String r1 = "oe"
            java.lang.String r0 = r0.getQueryParameter(r1)
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r304
            if (r0 != 0) goto L44
        L3f:
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
        L44:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10774uk.A06(android.net.Uri):boolean");
    }

    private boolean A07(FbUserSession fbUserSession, String str) {
        boolean z;
        9Vq r0 = (9Vq) 1Lo.A04((Context) null, fbUserSession, this.A00, 68082);
        synchronized (r0) {
            java.util.Map map = r0.A08;
            if (map.containsKey(str)) {
                Object obj = map.get(str);
                11T.A0D(obj);
                z = AnonymousClass001.A1V(obj);
            } else {
                z = true;
                if (!11T.A0O(r0.A01.A02, str)) {
                    double Ai7 = 1BK.A0N(((C2fx) 1Br.A0B(r0.A05)).A01).Ai7(37155220912341058L);
                    if (Ai7 <= 1.0d) {
                        if (Ai7 >= 0.0d) {
                            C00i c00i = r0.A06.A00;
                            2Ts r02 = (2Ts) c00i.get();
                            2To r03 = 2To.A0K;
                            if (r02.A00(r03) == null) {
                                C00i c00i2 = r0.A03.A00;
                                if (4YV.A05(c00i2) - r0.A00 > 60000) {
                                    if (((1GU) 1Br.A0B(r0.A02)).BWu()) {
                                        0fH.A0o(r0.A07, "Trying to prefetch on UI thread");
                                    } else {
                                        C2xh A00 = ((2Tz) 1Br.A0B(r0.A04)).A00(r03);
                                        String str2 = A00.A02;
                                        ImmutableList immutableList = (ImmutableList) A00.A01;
                                        2Ts r04 = (2Ts) c00i.get();
                                        2Tx r05 = new 2Tx(r03, immutableList, str2);
                                        r04.A01.put(r05.A00, r05);
                                        r0.A00 = 4YV.A05(c00i2);
                                    }
                                }
                            }
                            2Tx A002 = ((2Ts) c00i.get()).A00(r03);
                            if (A002 != null) {
                                ImmutableList immutableList2 = A002.A01;
                                if (immutableList2.size() != 0) {
                                    int ceil = (int) Math.ceil(immutableList2.size() * Ai7);
                                    for (int i = 0; i < ceil; i++) {
                                        if (11T.A0O(((2Vb) ((2Va) immutableList2.get(i))).A04, str)) {
                                            map.put(str, true);
                                        }
                                    }
                                    map.put(str, false);
                                }
                            }
                        }
                        return false;
                    }
                }
            }
            return z;
        }
    }

    public static boolean A08(C10774uk c10774uk, XMACacheData xMACacheData) {
        boolean z = true;
        long now = (((C0dp) c10774uk.A03.get()).now() - xMACacheData.timeStamp) / 1000;
        if (now <= 86400) {
            return false;
        }
        if (now < 115200) {
            String str = xMACacheData.progressiveUrl;
            if (str != null) {
                Uri uri = 0CO.A00;
                if (A06(Uri.parse(str))) {
                    String str2 = xMACacheData.progressiveUrl;
                    z = C0Aj.A02(str2 != null ? Uri.parse(str2) : null);
                }
            }
            String str3 = xMACacheData.dashManifest;
            if (str3 != null) {
                return 7uN.A01(str3);
            }
            return false;
        }
        return z;
    }

    public static boolean A09(VideoDataSource videoDataSource) {
        Uri uri = videoDataSource.A03;
        if (uri != null && A06(uri)) {
            return C0Aj.A02(uri);
        }
        String str = videoDataSource.A07;
        if (str != null) {
            return 7uN.A01(str);
        }
        return false;
    }

    public void A0A(Uri uri, 6Ce r303, String str, String str2) {
        6Cf r0 = (6Cf) this.A0J.get();
        11T.A0F(str, 0);
        11T.A0F(uri, 1);
        11T.A0F(r303, 4);
        r0.A00(uri, (5M8) null, r303, str, str2);
    }

    public void A0B(FbUserSession fbUserSession, CallerContext callerContext, Integer num, List list) {
        if (list.isEmpty() || ((5zA) this.A0D.get()).A02((Message) null)) {
            return;
        }
        AnonymousClass693 anonymousClass693 = (AnonymousClass693) 1Lo.A04((Context) null, fbUserSession, this.A00, 65932);
        11T.A0F(num, 0);
        if (AnonymousClass693.A00(anonymousClass693, HBi.A04, num)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A01((Uri) it.next(), callerContext, this, null, num, false, true);
            }
        }
    }

    public void A0C(final FbUserSession fbUserSession, final Message message, final Integer num, final boolean z, final boolean z2) {
        6Ay BCm;
        C00i c00i = this.A01;
        VideoAttachmentData A0B = ((C12114ys) c00i.get()).A0B(message);
        if (A0B == null) {
            C12114ys c12114ys = (C12114ys) c00i.get();
            5Pm r0 = message.A08;
            if (r0 == null || (BCm = r0.BCm()) == null || BCm.A0u() == null || !BCm.BDF().contains(GraphQLStoryAttachmentStyle.A1J)) {
                return;
            }
            A0B = C12114ys.A03(c12114ys, message);
            if (A0B == null) {
                return;
            }
        }
        if (A0D(fbUserSession, message, num)) {
            final VideoAttachmentData videoAttachmentData = A0B;
            ((Executor) this.A0B.get()).execute(new Runnable() { // from class: X.89r
                public static final String __redex_internal_original_name = "MediaPrefetchHandler$4";

                /* JADX WARN: Code restructure failed: missing block: B:29:0x0177, code lost:
                
                    if (r0.A0u() == null) goto L31;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:33:0x01a6, code lost:
                
                    if (r0.A07 != X.1Kq.A04) goto L36;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:49:0x0276, code lost:
                
                    if (X.C10774uk.A09(r315) != false) goto L67;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:55:0x0298, code lost:
                
                    if (X.C10774uk.A08(r0, r0) != false) goto L74;
                 */
                /* JADX WARN: Removed duplicated region for block: B:106:0x0232  */
                /* JADX WARN: Removed duplicated region for block: B:109:0x03bc  */
                /* JADX WARN: Removed duplicated region for block: B:110:0x03e8  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void run() {
                    /*
                        Method dump skipped, instructions count: 1058
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C89r.run():void");
                }
            });
        }
    }

    public boolean A0D(FbUserSession fbUserSession, Message message, Integer num) {
        boolean z = false;
        if (!ThreadKey.A0q(message.A0V)) {
            if (MediaPrefetchRequestSource.A01(num)) {
                z = true;
            } else if (!((5zA) this.A0D.get()).A02(message)) {
                AnonymousClass693 anonymousClass693 = (AnonymousClass693) 1Lo.A04((Context) null, fbUserSession, this.A00, 65932);
                11T.A0F(num, 0);
                return AnonymousClass693.A00(anonymousClass693, HBi.A06, num);
            }
        }
        return z;
    }
}
