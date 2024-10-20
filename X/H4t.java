package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.fbui.widget.text.ImageWithTextView;
import com.facebook.inject.FbInjector;
import com.facebook.litho.LithoView;
import com.facebook.messaging.composer.params.ComposerInitParamsSpec$ComposerLaunchSource;
import com.facebook.messaging.media.folder.Folder;
import com.facebook.messaging.media.loader.LocalMediaLoaderParams;
import com.facebook.messaging.media.swipeablemediatray.SwipeableMediaTrayContainerView;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.montage.composer.model.MontageComposerFragmentParams;
import com.facebook.messaging.montage.composer.model.RollCallCameraModel;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.resources.ui.FbLinearLayout;
import com.facebook.runtimepermissions.RequestPermissionsConfig;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.ui.media.attachments.source.MediaResourceSendSource;
import com.facebook.widget.CustomFrameLayout;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.HashSet;

/* loaded from: H4t.class */
public final class H4t extends CustomFrameLayout {
    public static boolean A0y;
    public static final MediaResourceSendSource A0z;
    public static final MediaResourceSendSource A10;
    public View A00;
    public 06Z A01;
    public GridLayoutManager A02;
    public RecyclerView A03;
    public C98M A04;
    public DMV A05;
    public ImageWithTextView A06;
    public ImageWithTextView A07;
    public LithoView A08;
    public LithoView A09;
    public ComposerInitParamsSpec$ComposerLaunchSource A0A;
    public Folder A0B;
    public JL5 A0C;
    public HqP A0D;
    public JEy A0E;
    public JMn A0F;
    public HaW A0G;
    public I2P A0H;
    public ThreadKey A0I;
    public ThreadSummary A0J;
    public MigColorScheme A0K;
    public FbLinearLayout A0L;
    public 2Wo A0M;
    public Capabilities A0N;
    public Integer A0O;
    public Long A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public String[] A0X;
    public final 1Br A0Y;
    public final 1Br A0Z;
    public final 1Br A0a;
    public final 1Br A0b;
    public final 1Br A0c;
    public final 1Br A0d;
    public final 1Br A0e;
    public final 1Br A0f;
    public final 1Br A0g;
    public final 1Br A0h;
    public final 1Br A0i;
    public final 1Br A0j;
    public final 1Br A0k;
    public final 1Br A0l;
    public final 1Br A0m;
    public final 1Br A0n;
    public final 1Br A0o;
    public final 1Br A0p;
    public final 1Br A0q;
    public final 1Br A0r;
    public final 1Br A0s;
    public final 1Br A0t;
    public final IQR A0u;
    public final HS0 A0v;
    public final IDF A0w;
    public final GWj A0x;

    static {
        C5es c5es = C5es.A0K;
        C5et c5et = C5et.PICK;
        A10 = new MediaResourceSendSource(c5es, c5et);
        A0z = new MediaResourceSendSource(C5es.A0J, c5et);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v117, types: [X.2kG, java.lang.Object] */
    public H4t(Context context, HS0 hs0, HqP hqP, IDF idf, GWj gWj) {
        super(context);
        this.A0m = 1Bq.A00(67262);
        this.A0r = 1Bu.A00(116007);
        this.A0k = 1Bq.A00(68021);
        this.A0Z = 1Bq.A00(66409);
        this.A0a = 1Bq.A00(68550);
        Context A08 = 4YU.A08(this);
        this.A0p = 1Bu.A01(A08, 65937);
        this.A0e = 1Bu.A00(66570);
        this.A0j = 1Bq.A00(68523);
        this.A0l = 1Bu.A00(68513);
        this.A0i = 1Bu.A00(85055);
        this.A0q = 1Bu.A00(68433);
        this.A0d = 1Bu.A00(653);
        this.A0b = 1Bq.A00(17012);
        this.A0t = 1Bu.A00(66207);
        this.A0c = 1Bu.A00(85056);
        this.A0g = 7zM.A0U();
        this.A0u = (IQR) 1Bn.A0E(A08, (1BY) null, 85136);
        this.A0h = 1Bq.A00(115999);
        this.A0f = AbG.A0a();
        this.A0Y = 1Bq.A00(66227);
        this.A0n = 1Bu.A01(A08, 67698);
        this.A0o = 1Bu.A01(A08, 68143);
        this.A0A = ComposerInitParamsSpec$ComposerLaunchSource.A06;
        this.A04 = C98M.MEDIA_PICKER;
        this.A0s = 1Bu.A00(147632);
        this.A0O = 0S2.A00;
        this.A0x = gWj;
        this.A0w = idf;
        this.A0D = hqP;
        this.A0v = hs0;
        this.A0K = 7zR.A0c(A08);
        1Br.A0C(this.A0h);
        this.A0X = I8d.A01(A08);
        A0U(2132543425);
        RecyclerView recyclerView = (RecyclerView) C09s.A01(this, 2131366462);
        this.A03 = recyclerView;
        String str = "recyclerView";
        if (recyclerView != null) {
            final Context context2 = recyclerView.getContext();
            GridLayoutManager gridLayoutManager = new GridLayoutManager(context2) { // from class: com.facebook.messaging.media.swipeablemediatray.SwipeableMediaTrayPhotoGalleryView$init$1
                @Override // androidx.recyclerview.widget.LinearLayoutManager
                public boolean A1e() {
                    return !this.A0U;
                }
            };
            this.A02 = gridLayoutManager;
            gridLayoutManager.A1p(1);
            RecyclerView recyclerView2 = this.A03;
            if (recyclerView2 != null) {
                GridLayoutManager gridLayoutManager2 = this.A02;
                if (gridLayoutManager2 == null) {
                    str = "layoutManager";
                } else {
                    recyclerView2.A1D(gridLayoutManager2);
                    RecyclerView recyclerView3 = this.A03;
                    if (recyclerView3 != 0) {
                        recyclerView3.A1B(new Object());
                        2Xd r0 = this.A0x;
                        ((GWj) r0).A03 = new HS2(this);
                        RecyclerView recyclerView4 = this.A03;
                        if (recyclerView4 != null) {
                            recyclerView4.A16(r0);
                            this.A08 = (LithoView) C09s.A01(this, 2131367774);
                            C1F6 A0I = GOp.A0I(this.A0d);
                            LithoView lithoView = this.A08;
                            if (lithoView != null) {
                                Context A01 = FbInjector.A01();
                                AbL.A0y(A0I);
                                try {
                                    HaW haW = new HaW(A08, lithoView);
                                    1Bn.A0K();
                                    FbInjector.A04(A01);
                                    this.A0G = haW;
                                    haW.A01.A01 = new HtH(this);
                                    this.A06 = (ImageWithTextView) C09s.A01(this, 2131367775);
                                    this.A00 = C09s.A01(this, 2131367794);
                                    this.A07 = (ImageWithTextView) C09s.A01(this, 2131367795);
                                    this.A0L = (FbLinearLayout) C09s.A01(this, 2131367008);
                                    2Wo A0v = AbK.A0v(this, 2131367797);
                                    this.A0M = A0v;
                                    IlT.A00(A0v, this, 6);
                                    this.A09 = (LithoView) C09s.A01(this, 2131367796);
                                    A01(this);
                                    return;
                                } catch (Throwable th) {
                                    1Bn.A0K();
                                    FbInjector.A04(A01);
                                    throw th;
                                }
                            }
                            str = "gridOverlayView";
                        }
                    }
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public static final void A00(H4t h4t) {
        h4t.A0x.A0H();
        SwipeableMediaTrayContainerView.A02(h4t.A0v.A00);
        JMn jMn = h4t.A0F;
        if (jMn != null) {
            jMn.Bo8();
        }
    }

    public static final void A01(H4t h4t) {
        String str;
        LithoView lithoView = h4t.A09;
        if (lithoView == null) {
            str = "partialPermissionView";
        } else {
            MigColorScheme migColorScheme = h4t.A0K;
            if (migColorScheme != null) {
                lithoView.A0y(new C8f7(migColorScheme, new AQr(h4t, 25)));
                return;
            }
            str = "colorScheme";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public static final void A02(H4t h4t, RequestPermissionsConfig requestPermissionsConfig) {
        String str = h4t.A0Q;
        if (str != null) {
            AbstractC2326GOr.A1P(1Br.A02(((Hrv) 1Br.A0B(h4t.A0c)).A01), "msg_media_picker_permission_screen_did_show", str);
        }
        JMn jMn = h4t.A0F;
        if (jMn != null) {
            String[] strArr = h4t.A0X;
            if (strArr != null) {
                jMn.AHT(requestPermissionsConfig, new GzL(h4t, 2), strArr);
            } else {
                11T.A0L("storagePermissions");
                throw 0Q8.createAndThrow();
            }
        }
    }

    public static final void A03(H4t h4t, MediaResource mediaResource) {
        if (h4t.A0H != null) {
            ((2Pl) 1Br.A0B(h4t.A0b)).A00("Edit media", 0S2.A03);
            String str = h4t.A0Q;
            if (str != null) {
                ((Hrv) 1Br.A0B(h4t.A0c)).A00(h4t.A0A, h4t.A0I, str, GOo.A1V(h4t));
            }
            I2P i2p = h4t.A0H;
            if (i2p != null) {
                11T.A0F(mediaResource, 0);
                MontageComposerFragmentParams.Builder builder = new MontageComposerFragmentParams.Builder();
                builder.A0D = C6r6.A0y;
                builder.A09 = C6x1.A05;
                builder.A04(AnonymousClass001.A0s());
                builder.A0a = true;
                builder.A0O = str;
                builder.A0F = mediaResource;
                builder.A0C = C6x5.A08;
                builder.A04 = i2p.A00;
                builder.A05 = i2p.A01;
                I2P.A00(i2p, (JF2) null, builder.A00());
            }
            A00(h4t);
            JL5 jl5 = h4t.A0C;
            if (jl5 != null) {
                jl5.A86();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
    
        if (X.I8d.A00(r0, r0) != false) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A04(X.H4t r301, boolean r302) {
        /*
            r0 = r301
            androidx.recyclerview.widget.RecyclerView r0 = r0.A03
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L15
            java.lang.String r0 = "recyclerView"
            r304 = r0
        Ld:
            r0 = r304
            X.11T.A0L(r0)
            X.0Q8 r0 = X.0Q8.createAndThrow()
            throw r0
        L15:
            r0 = 8
            r305 = r0
            r0 = r302
            int r0 = X.DKG.A00(r0)
            r306 = r0
            r0 = r303
            r1 = r306
            r0.setVisibility(r1)
            r0 = r302
            if (r0 == 0) goto L5c
            r0 = r301
            X.1Br r0 = r0.A0h
            r304 = r0
            r0 = r304
            java.lang.Object r0 = X.1Br.A0B(r0)
            X.I8d r0 = (X.I8d) r0
            r307 = r0
            r0 = r301
            java.lang.String[] r0 = r0.A0X
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L71
            r0 = r307
            boolean r0 = r0.A02()
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L5c
            r0 = r307
            r1 = r303
            boolean r0 = X.I8d.A00(r0, r1)
            r306 = r0
            r0 = 1
            r308 = r0
            r0 = r306
            if (r0 == 0) goto L61
        L5c:
            r0 = 0
            r308 = r0
            r0 = 0
            r303 = r0
        L61:
            r0 = r301
            com.facebook.litho.LithoView r0 = r0.A09
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L78
            java.lang.String r0 = "partialPermissionView"
            r304 = r0
            goto Ld
        L71:
            java.lang.String r0 = "storagePermissions"
            r304 = r0
            goto Ld
        L78:
            r0 = r308
            if (r0 == 0) goto L80
            r0 = 0
            r305 = r0
        L80:
            r0 = r304
            r1 = r305
            r0.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H4t.A04(X.H4t, boolean):void");
    }

    public final void A0V() {
        IDF idf;
        String str;
        I8d i8d = (I8d) 1Br.A0B(this.A0h);
        String[] strArr = this.A0X;
        if (strArr == null) {
            11T.A0L("storagePermissions");
            throw 0Q8.createAndThrow();
        }
        if (i8d.A03(strArr)) {
            Folder folder = this.A0B;
            Integer num = this.A0O;
            Integer num2 = 0S2.A01;
            IQR iqr = this.A0u;
            if (num == num2) {
                iqr.D1t(new LocalMediaLoaderParams(LocalMediaLoaderParams.A08, null, (-1) >>> 1, !((C61c) 1Br.A0B(this.A0k)).A0D(this.A0I) ? 86400000L : -1, false, true));
                return;
            }
            if (folder == null) {
                iqr.D1t(new LocalMediaLoaderParams(A10, null, (-1) >>> 1, -1, true, true));
                idf = this.A0w;
                str = GOo.A0A(this).getString(2131966646);
            } else {
                iqr.D1t(new LocalMediaLoaderParams(LocalMediaLoaderParams.A08, folder.A04, (-1) >>> 1, -1, true, true));
                idf = this.A0w;
                str = folder.A03;
            }
            if (str == null) {
                str = 4YU.A0t(idf.A0B.getResources(), 2131966646);
            }
            idf.A05 = str;
            idf.A04 = 0S2.A00;
            IDF.A03(idf);
        }
    }

    public final void A0W(C98M c98m, boolean z) {
        11T.A0F(c98m, 1);
        I2P i2p = this.A0H;
        if (i2p != null) {
            if (!z) {
                JMn jMn = this.A0F;
                if (jMn != null) {
                    jMn.CVY(C6r6.A0x, i2p.A01());
                    return;
                }
                return;
            }
            String str = this.A0Q;
            String str2 = this.A0R;
            String str3 = this.A0S;
            IW0 iw0 = new IW0(this);
            HashSet A0v = AnonymousClass001.A0v();
            if (str3 == null) {
                str3 = 1BK.A0u(i2p.A02, 2131964638);
            }
            C1pq.A08("promptText", str3);
            MontageComposerFragmentParams.Builder A01 = ((I3L) 1Br.A0B(i2p.A04)).A01(i2p.A00, C6r6.A0z, new RollCallCameraModel(c98m, str3, str2, 7zV.A0b(A0v, A0v), false));
            A01.A0O = str;
            I2P.A00(i2p, iw0, A01.A00());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x009d, code lost:
    
        if (r0.A1A() != true) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a8, code lost:
    
        r313 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b6, code lost:
    
        if (r0.A1F() == true) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b9, code lost:
    
        r313 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bc, code lost:
    
        r0 = X.AnonymousClass001.A1U(r301.A0R);
        r0 = X.C9kt.A03;
        r0.A01(r0, r0, null, false, r312, r313, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a5, code lost:
    
        if (r0 != null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0X(java.lang.Integer r302) {
        /*
            Method dump skipped, instructions count: 627
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H4t.A0X(java.lang.Integer):void");
    }
}
