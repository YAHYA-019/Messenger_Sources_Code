package X;

import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.LifecycleObserver;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.model.GraphQLMedia;
import com.facebook.litho.LithoView;
import com.facebook.messaging.rtc.incall.impl.mediasync.playbackview.MediaSyncPlaybackView;
import com.facebook.rsys.cowatch.gen.CowatchCaptionLocale;
import com.facebook.rsys.cowatch.gen.CowatchMediaInfoModel;
import com.facebook.rsys.cowatch.gen.CowatchPlayerApi;
import com.facebook.rsys.cowatch.gen.CowatchPlayerModel;
import com.facebook.rsys.cowatchad.gen.CowatchAdMediaPlayerApi;
import com.facebook.video.engine.api.VideoDataSource;
import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: GrG.class */
public final class GrG extends GS2 implements LifecycleObserver {
    public CowatchMediaInfoModel A00;
    public CowatchPlayerModel A01;
    public String A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final Context A07;
    public final FbUserSession A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final 1Br A0E;
    public final 1Br A0F;
    public final 1Br A0G;
    public final 1Br A0H;
    public final 1Br A0I;
    public final 1Br A0J;
    public final 1Br A0K;
    public final 1Br A0L;
    public final 1Br A0M;
    public final 1Br A0N;
    public final Gpp A0O;
    public final JFi A0P;
    public final I0I A0Q;
    public final H0t A0R;
    public final H0u A0S;
    public final 2Qn A0T;
    public final IY8 A0U;
    public final GPl A0V;
    public final GPl A0W;
    public final C15h A0X;
    public final H1U A0Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GrG(FbUserSession fbUserSession, Context context) {
        super("MediaSyncPlaybackRsysPresenter");
        1BL.A1F(fbUserSession, context);
        this.A08 = fbUserSession;
        this.A07 = context;
        this.A0X = J5u.A03(this, 52);
        this.A0N = GOn.A0U(context, fbUserSession);
        this.A0U = IY8.A01(this, 31);
        this.A0J = 1Bu.A01(context, 16430);
        this.A0H = 1Bu.A01(context, 115390);
        this.A0M = GOn.A0V(context, fbUserSession);
        this.A0B = 1Lm.A00(context, fbUserSession, 99500);
        1Br A01 = 1Bu.A01(context, 147733);
        this.A0C = A01;
        1Br.A0C(A01);
        this.A0Q = new I0I(fbUserSession, context);
        this.A0E = 1Lm.A00(context, fbUserSession, 115396);
        this.A09 = GOn.A0X(context, fbUserSession);
        this.A0F = 1Bu.A01(context, 115794);
        this.A0G = 1Bu.A01(context, 114925);
        this.A0A = GOn.A0Y(context, fbUserSession);
        this.A0K = 1Bu.A01(context, 99489);
        this.A0I = 1Bu.A01(context, 67593);
        this.A0L = 1Lm.A00(context, fbUserSession, 114854);
        this.A0D = 1Lm.A00(context, fbUserSession, 115395);
        this.A0P = new IYo(this);
        this.A0T = IYv.A00(this, 27);
        this.A0W = GPl.A00(this, 29);
        this.A0V = GPl.A00(this, 28);
        H1U h1u = new H1U(this);
        this.A0Y = h1u;
        this.A0R = new H0t(h1u);
        this.A0S = new H0u(h1u);
        this.A0O = new Gpp(this, 8);
        this.A03 = "";
    }

    public static final 2JN A00(GrG grG) {
        return GOp.A0O(grG.A0N);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004b, code lost:
    
        if (r306 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0070, code lost:
    
        if (r306 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.facebook.rsys.cowatch.gen.CowatchMediaInfoModel A01(X.GrG r301, com.facebook.rsys.cowatch.gen.CowatchPlayerModel r302, java.lang.String r303) {
        /*
            r0 = 0
            r304 = r0
            r0 = r302
            com.facebook.rsys.cowatch.gen.CowatchMediaInfoModel r0 = r0.mediaInfo
            r305 = r0
            r0 = r301
            X.1Br r0 = r0.A0I
            r306 = r0
            r0 = r306
            X.1CO r0 = X.ICR.A00(r0)
            r307 = r0
            r0 = 36320210550013093(0x81090a00003ca5, double:3.032385629352788E-306)
            r308 = r0
            r0 = r307
            r1 = r308
            boolean r0 = r0.AZk(r1)
            r310 = r0
            r0 = r310
            if (r0 != 0) goto L2d
            r0 = r305
            return r0
        L2d:
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r307 = r0
            r0 = r305
            if (r0 == 0) goto L89
            r0 = r302
            com.facebook.rsys.cowatch.gen.CowatchSuggestedContentQueueModel r0 = r0.suggestedContentQueue
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L4e
            r0 = r306
            java.util.ArrayList r0 = r0.previousMediaInfoModels
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L53
        L4e:
            X.0ty r0 = X.C0ty.A00
            r306 = r0
        L53:
            r0 = r305
            r1 = r306
            java.util.ArrayList r0 = X.0QD.A0P(r0, r1)
            r311 = r0
            r0 = r302
            com.facebook.rsys.cowatch.gen.CowatchSuggestedContentQueueModel r0 = r0.suggestedContentQueue
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L73
            r0 = r306
            java.util.ArrayList r0 = r0.nextMediaInfoModels
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L78
        L73:
            X.0ty r0 = X.C0ty.A00
            r306 = r0
        L78:
            r0 = r306
            r1 = r311
            java.util.ArrayList r0 = X.0QD.A0O(r0, r1)
            r306 = r0
            r0 = r307
            r1 = r306
            boolean r0 = r0.addAll(r1)
        L89:
            r0 = r307
            java.util.Iterator r0 = r0.iterator()
            r307 = r0
        L90:
            r0 = r307
            boolean r0 = r0.hasNext()
            r310 = r0
            r0 = r310
            if (r0 == 0) goto Lc5
            r0 = r307
            java.lang.Object r0 = r0.next()
            r311 = r0
            r0 = r311
            r306 = r0
            r0 = r311
            com.facebook.rsys.cowatch.gen.CowatchMediaInfoModel r0 = (com.facebook.rsys.cowatch.gen.CowatchMediaInfoModel) r0
            java.lang.String r0 = r0.mediaID
            r306 = r0
            r0 = r303
            r1 = r306
            boolean r0 = X.11T.A0O(r0, r1)
            r310 = r0
            r0 = r310
            if (r0 == 0) goto L90
            r0 = r311
            r304 = r0
        Lc5:
            r0 = r304
            com.facebook.rsys.cowatch.gen.CowatchMediaInfoModel r0 = (com.facebook.rsys.cowatch.gen.CowatchMediaInfoModel) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GrG.A01(X.GrG, com.facebook.rsys.cowatch.gen.CowatchPlayerModel, java.lang.String):com.facebook.rsys.cowatch.gen.CowatchMediaInfoModel");
    }

    public static 2JS A02(GrG grG) {
        return A00(grG).A01();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r303v0 */
    /* JADX WARN: Type inference failed for: r303v1 */
    /* JADX WARN: Type inference failed for: r303v2, types: [java.util.AbstractCollection] */
    public static final List A03(CowatchMediaInfoModel cowatchMediaInfoModel) {
        List list;
        ArrayList arrayList = cowatchMediaInfoModel.captionAvailableLanguages;
        if (arrayList != null) {
            list = 1BL.A0z(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                CowatchCaptionLocale cowatchCaptionLocale = (CowatchCaptionLocale) it.next();
                if (cowatchCaptionLocale.localizedLanguage == null) {
                    throw 1BK.A0h();
                }
                String str = cowatchCaptionLocale.locale;
                11T.A09(str);
                list.add(new JtB(str, String.valueOf(cowatchCaptionLocale.localizedLanguage), cowatchCaptionLocale.localizedCountry, cowatchCaptionLocale.localizedCreationMethod, cowatchCaptionLocale.captionsUrl, 3));
            }
        } else {
            list = C0ty.A00;
        }
        return list;
    }

    public static void A08(GrG grG) {
        A0A(grG, A00(grG).A01());
    }

    public static final void A09(GrG grG, CowatchMediaInfoModel cowatchMediaInfoModel, CowatchPlayerModel cowatchPlayerModel) {
        CowatchAdMediaPlayerApi Aeq;
        I9A i9a;
        I9A i9a2;
        String A0Z;
        if (cowatchMediaInfoModel != null) {
            if (cowatchMediaInfoModel.mediaURL == null && cowatchMediaInfoModel.dashManifest == null) {
                return;
            }
            String str = cowatchMediaInfoModel.mediaID;
            String str2 = null;
            if (str != null && !0CU.A0O(str)) {
                str2 = 0Pz.A0W(str, cowatchMediaInfoModel.mediaSource);
            }
            boolean z = !11T.A0O(str2, grG.A02);
            Ifk ifk = new Ifk(cowatchMediaInfoModel);
            if (z && !A0D(cowatchPlayerModel)) {
                ((Hoz) 1Br.A0B(grG.A0L)).A00(ifk, cowatchPlayerModel.internal.tabSelectedFromAmdPlayNow);
                if (cowatchMediaInfoModel.mediaType == 1) {
                    grG.A02 = str2;
                }
            }
            if (!A0C(cowatchMediaInfoModel, cowatchPlayerModel) || !GS2.A07(grG)) {
                I9A i9a3 = ((MediaSyncPlaybackView) ((JPE) GS2.A05(grG))).A0H;
                if (i9a3 != null) {
                    i9a3.A02();
                    return;
                }
                return;
            }
            CowatchMediaInfoModel cowatchMediaInfoModel2 = grG.A00;
            ArrayList arrayList = null;
            if (cowatchMediaInfoModel2 != null) {
                arrayList = cowatchMediaInfoModel2.captionAvailableLanguages;
            }
            if (7zL.A1X(arrayList, cowatchMediaInfoModel.captionAvailableLanguages)) {
                JFq jFq = ((GS2) grG).A00;
                I9A i9a4 = ((MediaSyncPlaybackView) ((JPE) AbM.A0r(jFq))).A0H;
                if (i9a4 != null && i9a4.A02 && (i9a2 = ((MediaSyncPlaybackView) ((JPE) AbM.A0r(jFq))).A0H) != null) {
                    List A03 = A03(cowatchMediaInfoModel);
                    11T.A0F(A03, 0);
                    GraphQLMedia A01 = 6US.A01(i9a2.A00);
                    if (A01 != null && (A0Z = A01.A0Z()) != null) {
                        6TI r0 = i9a2.A00;
                        6TF r02 = new 6TF();
                        if (r0 != null) {
                            r02.A02(r0);
                        }
                        r02.A03(Hvb.A00(A0Z, A03, A01.A0b(-1099189116)), "GraphQLMedia");
                        i9a2.A00 = r02.A01();
                    }
                }
            }
            if (z || ((i9a = ((MediaSyncPlaybackView) ((JPE) GS2.A05(grG))).A0H) != null && !i9a.A02)) {
                grG.A02 = str2;
                ((HsZ) 1Br.A0B(grG.A0D)).A00();
                String str3 = cowatchPlayerModel.internal.tabSelectedFromAmdPlayNow;
                I9A i9a5 = ((MediaSyncPlaybackView) ((JPE) GS2.A05(grG))).A0H;
                if (i9a5 != null) {
                    FbUserSession fbUserSession = grG.A08;
                    String str4 = cowatchMediaInfoModel.mediaID;
                    if (str4 == null) {
                        str4 = "";
                    }
                    String str5 = cowatchMediaInfoModel.mediaURL;
                    String str6 = cowatchMediaInfoModel.dashManifest;
                    long j = cowatchMediaInfoModel.durationMs;
                    String str7 = cowatchMediaInfoModel.thumbnailUrl;
                    boolean z2 = cowatchMediaInfoModel.isLive;
                    boolean z3 = cowatchMediaInfoModel.isReportable;
                    List A032 = A03(cowatchMediaInfoModel);
                    C00i c00i = grG.A0I.A00;
                    boolean z4 = false;
                    if ((1Br.A06(((ICR) c00i.get()).A00).AZk(36320210550013093L) && !grG.A0B(cowatchMediaInfoModel)) || (((ICR) c00i.get()).A03() && str3 != null && str3.equals("thread_upload"))) {
                        z4 = true;
                    }
                    String str8 = cowatchMediaInfoModel.mediaTitle;
                    boolean z5 = cowatchMediaInfoModel.isNonInteractable;
                    String str9 = cowatchMediaInfoModel.contentRating;
                    11T.A0F(A032, 9);
                    I9A.A00(i9a5);
                    6A9 r03 = new 6A9();
                    r03.A04 = 6AB.A05;
                    r03.A07 = str6;
                    if (str5 != null) {
                        Uri uri = null;
                        try {
                            uri = C0A2.A03(str5);
                        } catch (SecurityException unused) {
                        }
                        r03.A03 = uri;
                    }
                    6TA r04 = new 6TA();
                    r04.A0i = str4;
                    r04.A1h = z4;
                    r04.A1G = z2;
                    r04.A0L = (int) j;
                    r04.A1k = true;
                    r04.A0U = new VideoDataSource(r03);
                    6TF A0L = AbstractC2327GOs.A0L(fbUserSession, r04);
                    A0L.A03(Boolean.valueOf(z3), "ShowReportOptionKey");
                    2Dp A012 = 2Dp.A01(str7);
                    if (A012 != null) {
                        A0L.A03(A012, "CoverImageParamsKey");
                    }
                    if (str8 != null) {
                        A0L.A03(str8, "CowatchVideoTitle");
                    }
                    if (str9 != null) {
                        A0L.A03(str9, "CoWatchContentRating");
                    }
                    A0L.A03(Hvb.A00(str4, A032, z2), "GraphQLMedia");
                    A0L.A03(Boolean.valueOf(z5), "IsNonInteractable");
                    6TI A013 = A0L.A01();
                    GOn.A1U(i9a5.A09, i9a5.A08);
                    LithoView lithoView = i9a5.A07;
                    if (lithoView != null) {
                        QDK qdk = new QDK(lithoView.A09, new Gl8());
                        boolean z6 = i9a5.A0C;
                        Gl8 gl8 = qdk.A01;
                        gl8.A02 = z6;
                        BitSet bitSet = qdk.A02;
                        bitSet.set(0);
                        gl8.A01 = A013;
                        bitSet.set(1);
                        gl8.A00 = new HVP(i9a5);
                        C1rs.A00(bitSet, qdk.A03);
                        qdk.A0J();
                        lithoView.A0x(gl8);
                    }
                    i9a5.A00 = A013;
                    i9a5.A02 = true;
                }
                if (ICR.A00(grG.A0I).AZk(36315125309907428L)) {
                    1Br.A0C(grG.A0F);
                    Hql A00 = HvP.A00();
                    if (A00 != null) {
                        String str10 = cowatchMediaInfoModel.mediaID;
                        long j2 = cowatchPlayerModel.mediaPositionMs;
                        if (!Objects.equal(str10, A00.A09)) {
                            A00.A09 = str10;
                            1Br.A0C(A00.A0E);
                            Ia1 A0d = GOq.A0d();
                            if (A0d != null && (Aeq = A0d.A02.Aeq()) != null) {
                                Aeq.didMediaChange(str10, j2);
                            }
                        }
                    }
                }
            }
            grG.A01 = cowatchPlayerModel;
            grG.A00 = cowatchMediaInfoModel;
            if (11T.A0O(cowatchPlayerModel.mediaID, cowatchMediaInfoModel.mediaID)) {
                int i = cowatchPlayerModel.mediaPlaybackState;
                boolean z7 = true;
                if (i != 2 && i != 1) {
                    z7 = false;
                }
                I9A i9a6 = ((MediaSyncPlaybackView) ((JPE) GS2.A05(grG))).A0H;
                if (i9a6 != null) {
                    i9a6.A03(new J0l(grG, cowatchPlayerModel, z7));
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a9, code lost:
    
        if (r0.A01 != X.H9X.A02) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0115, code lost:
    
        if (r0.contentAvailability == 3) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0139, code lost:
    
        if (r0 != 1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0266, code lost:
    
        if (r301.A04 == false) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A0A(X.GrG r301, X.2JS r302) {
        /*
            Method dump skipped, instructions count: 1233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GrG.A0A(X.GrG, X.2JS):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002c, code lost:
    
        if (r0.A01 == X.H9X.A02) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean A0B(com.facebook.rsys.cowatch.gen.CowatchMediaInfoModel r302) {
        /*
            r301 = this;
            r0 = r302
            boolean r0 = r0.isNonInteractable
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L2f
            r0 = r301
            X.1Br r0 = r0.A0F
            X.1Br.A0C(r0)
            X.Hql r0 = X.HvP.A00()
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L31
            r0 = r305
            X.H9X r0 = r0.A01
            r306 = r0
            X.H9X r0 = X.H9X.A02
            r305 = r0
            r0 = r306
            r1 = r305
            if (r0 != r1) goto L31
        L2f:
            r0 = 1
            r304 = r0
        L31:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GrG.A0B(com.facebook.rsys.cowatch.gen.CowatchMediaInfoModel):boolean");
    }

    public static final boolean A0C(CowatchMediaInfoModel cowatchMediaInfoModel, CowatchPlayerModel cowatchPlayerModel) {
        int i;
        String str = cowatchMediaInfoModel != null ? cowatchMediaInfoModel.mediaID : null;
        boolean z = false;
        if (str != null && str.length() != 0 && cowatchMediaInfoModel != null && cowatchMediaInfoModel.mediaType == 2 && ((i = cowatchPlayerModel.mediaPlaybackState) == 1 || i == 0 || i == 2)) {
            z = true;
        }
        return z;
    }

    public static final boolean A0D(CowatchPlayerModel cowatchPlayerModel) {
        int i = cowatchPlayerModel.mediaPlaybackState;
        if (i == 4 || i == 5) {
            return true;
        }
        return i == 3 && cowatchPlayerModel.contentAvailability != 3;
    }

    public void A0d() {
        ((Hu4) 1Br.A0B(this.A0E)).A00 = 1;
        CowatchPlayerApi cowatchPlayerApi = (CowatchPlayerApi) this.A0X.get();
        if (cowatchPlayerApi != null) {
            cowatchPlayerApi.endSession("close_button", "media_player");
        }
        GOp.A0K(this.A0H).A06(this.A08, "close_button");
    }

    public void A0e() {
        String str;
        CowatchPlayerModel A0k = GOq.A0k(A02(this));
        if (A0k != null) {
            GOp.A0R(this.A09).A0B(0S2.A00);
            if (HIm.A00(A0k.mediaSource) == 0S2.A01) {
                GOp.A0Q(this.A0A).D0D(7);
                return;
            }
            if (A0D(A0k)) {
                String str2 = A0k.mediaID;
                str = (str2 == null || str2.length() == 0) ? "player_null_state" : "up_next_preview";
            } else {
                str = "player_controls";
            }
            ((I27) 1Br.A0B(this.A0G)).A01(str);
        }
    }

    public final void onResume() {
        CowatchPlayerModel A0k = GOq.A0k(A02(this));
        if (A0k != null) {
            int i = A0k.mediaPlaybackState;
            if (Integer.valueOf(i) != null && (i == 5 || i == 4)) {
                DKE.A0K(this.A0J).post(new Iwv(this, A0k));
            }
        }
        GOp.A0K(this.A0H).A04(this.A08);
    }

    public final void onStopped() {
        I9A i9a;
        JFq jFq = ((GS2) this).A00;
        if (!AbM.A1a(jFq) || (i9a = ((MediaSyncPlaybackView) ((JPE) AbM.A0r(jFq))).A0H) == null) {
            return;
        }
        i9a.A02();
    }
}
