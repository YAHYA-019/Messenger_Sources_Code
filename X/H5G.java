package X;

import android.content.Context;
import android.graphics.Canvas;
import android.net.Uri;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.inject.FbInjector;
import com.facebook.ui.compat.fbrelativelayout.FbRelativeLayout;
import com.facebook.user.model.UserKey;
import com.facebook.widget.CustomFrameLayout;
import java.util.ArrayList;
import java.util.List;

/* loaded from: H5G.class */
public final class H5G extends CustomFrameLayout implements JIi, JPT {
    public static final C06974ih A0U;
    public static final JFp A0V;
    public Uri A00;
    public View A01;
    public Animation A02;
    public Animation A03;
    public LinearLayout A04;
    public C2137Deq A05;
    public FbRelativeLayout A06;
    public 2Wo A07;
    public 2Wo A08;
    public 2Wo A09;
    public 2Wo A0A;
    public 2Wo A0B;
    public 2Wo A0C;
    public 2Wo A0D;
    public 2Wo A0E;
    public Integer A0F;
    public List A0G;
    public boolean A0H;
    public View A0I;
    public final FbUserSession A0J;
    public final 1Br A0K;
    public final 1Br A0L;
    public final 1Br A0M;
    public final 1Br A0N;
    public final 1Br A0O;
    public final HVk A0P;
    public final C01i A0Q;
    public final boolean A0R;
    public final HpR A0S;
    public static final CallerContext A0T = CallerContext.A0B("ParticipantViewImpl");
    public static final JFp A0W = IZD.A00;

    static {
        C07004ik A00 = C06984ii.A00();
        A00.A00(InterfaceC07034in.A04);
        A00.A0J = true;
        A0U = new C06974ih(A00);
        A0V = IZC.A00;
    }

    public H5G(Context context, UserKey userKey, int i, boolean z) {
        super(context);
        this.A0R = z;
        FbUserSession A01 = IDw.A01(this, "ParticipantViewImpl");
        this.A0J = A01;
        this.A0M = 1Bu.A01(context, 85039);
        this.A0K = GOn.A0R(context);
        this.A0N = 1Lm.A00(context, A01, 115000);
        this.A0O = 1Bq.A00(115045);
        this.A0Q = C01g.A00(C03i.A02, new AKd(i, 4, this, context));
        this.A0L = 1Bq.A00(115036);
        this.A0H = true;
        this.A0S = new HpR();
        this.A0P = new HVk(this);
        if (!Hwh.A01) {
            Hwh.A00(getContext().getApplicationContext());
        }
        A0U(2132543021);
        setImportantForAccessibility(1);
        Context context2 = getContext();
        this.A02 = AnimationUtils.loadAnimation(context2, 2130772005);
        this.A03 = AnimationUtils.loadAnimation(context2, 2130772006);
        View findViewById = findViewById(2131366309);
        if (findViewById == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A01 = findViewById;
        View A012 = C09s.A01(this, 2131366282);
        11T.A0I(A012, "null cannot be cast to non-null type android.view.ViewStub");
        2Wo A00 = 2Wo.A00((ViewStub) A012);
        this.A0B = A00;
        IlT.A00(A00, this, 18);
        2Wo A0v = GOq.A0v(this, 2131363942);
        this.A08 = A0v;
        IlT.A00(A0v, this, 19);
        this.A04 = (LinearLayout) C09s.A01(this, 2131362745);
        this.A06 = (FbRelativeLayout) C09s.A01(this, 2131366290);
        this.A0D = GOq.A0v(this, 2131366294);
        2Wo A0v2 = GOq.A0v(this, 2131366311);
        this.A0C = A0v2;
        IlT.A00(A0v2, this, 20);
        this.A09 = GOq.A0v(this, 2131363987);
        this.A07 = GOq.A0v(this, 2131363868);
        this.A0A = AbK.A0v(this, 2131364346);
        this.A0E = GOq.A0v(this, 2131367565);
        if (userKey != null) {
            CsK(userKey);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A00(android.widget.FrameLayout r302, java.lang.Integer r303, int r304) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H5G.A00(android.widget.FrameLayout, java.lang.Integer, int):void");
    }

    private final void A01(IZv iZv, JFp jFp, 2Wo r304) {
        if (jFp != null) {
            jFp.ABt(GOo.A0F(r304), iZv);
        }
        if (r304.A05()) {
            return;
        }
        r304.A03();
        if (this.A0H) {
            View A01 = r304.A01();
            if (A01 == null) {
                throw 1BK.A0h();
            }
            A01.startAnimation(this.A02);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0885  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x025f  */
    /* JADX WARN: Type inference failed for: r0v145, types: [android.widget.TextView, com.facebook.resources.ui.FbTextView] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A02(X.IZv r302, boolean r303) {
        /*
            Method dump skipped, instructions count: 2566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H5G.A02(X.IZv, boolean):void");
    }

    public static final void A03(H5G h5g) {
        View view = h5g.A0I;
        if (view != null) {
            FrameLayout frameLayout = ((view instanceof GvR) || (view instanceof H4G)) ? (FrameLayout) view : null;
            Integer num = h5g.A0F;
            if (frameLayout == null || num == null) {
                return;
            }
            h5g.A00(frameLayout, num, 7zN.A01(h5g.getResources()));
        }
    }

    private final void A04(2Wo r302, boolean z) {
        if (r302.A05()) {
            if (z && this.A0H) {
                r302.A01().startAnimation(this.A03);
            }
            r302.A02();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:237:0x03dc A[Catch: all -> 0x05e5, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x05e5, blocks: (B:3:0x0023, B:5:0x0028, B:8:0x0036, B:11:0x003f, B:14:0x004b, B:16:0x0052, B:20:0x008f, B:23:0x0099, B:27:0x00a7, B:29:0x00ad, B:32:0x00b7, B:34:0x00c2, B:36:0x00d1, B:37:0x00d7, B:39:0x00dd, B:41:0x00e4, B:43:0x00e9, B:46:0x00f3, B:49:0x00fe, B:50:0x0104, B:51:0x010a, B:52:0x010f, B:56:0x011e, B:58:0x0125, B:59:0x012a, B:61:0x0137, B:62:0x013e, B:63:0x0145, B:65:0x014e, B:67:0x0155, B:69:0x0161, B:71:0x016a, B:72:0x0171, B:74:0x0180, B:76:0x018c, B:77:0x0191, B:77:0x0191, B:80:0x0198, B:81:0x019f, B:83:0x01a5, B:84:0x01aa, B:86:0x01b6, B:88:0x01bf, B:90:0x01c6, B:92:0x01ca, B:93:0x01cf, B:97:0x05b7, B:99:0x05e4, B:104:0x025c, B:106:0x0263, B:107:0x0267, B:109:0x0276, B:115:0x0421, B:118:0x042b, B:121:0x0436, B:125:0x0442, B:127:0x0449, B:128:0x044e, B:130:0x0457, B:132:0x045c, B:135:0x0464, B:138:0x046f, B:141:0x047a, B:142:0x0480, B:144:0x048a, B:146:0x0490, B:148:0x0497, B:151:0x049f, B:155:0x04ad, B:157:0x04b2, B:158:0x04b7, B:159:0x04be, B:160:0x04c4, B:162:0x04c9, B:164:0x04cf, B:166:0x04d6, B:170:0x04e4, B:171:0x04e9, B:171:0x04e9, B:173:0x04ee, B:174:0x04f5, B:175:0x04fa, B:175:0x04fa, B:178:0x0504, B:179:0x050b, B:181:0x0511, B:183:0x0517, B:185:0x051d, B:188:0x0525, B:191:0x0530, B:193:0x0539, B:198:0x056d, B:199:0x05db, B:201:0x0545, B:202:0x0579, B:204:0x0552, B:205:0x0583, B:206:0x058d, B:208:0x0560, B:209:0x0597, B:210:0x0293, B:211:0x0299, B:212:0x029f, B:215:0x02aa, B:218:0x02b6, B:220:0x02bf, B:232:0x02fe, B:234:0x03d2, B:237:0x03dc, B:238:0x03e3, B:241:0x03ef, B:246:0x0406, B:248:0x040f, B:249:0x0416, B:251:0x041d, B:253:0x03b2, B:255:0x03b8, B:258:0x03c2, B:260:0x03cb, B:262:0x0308, B:264:0x030e, B:267:0x0318, B:268:0x031e, B:270:0x0329, B:272:0x0337, B:274:0x0343, B:276:0x034c, B:279:0x0354, B:281:0x035e, B:282:0x0364, B:285:0x0370, B:288:0x037c, B:289:0x0382, B:290:0x0386, B:290:0x0386, B:293:0x038f, B:294:0x0394, B:295:0x039c, B:297:0x03a5, B:299:0x03a8, B:300:0x05a1, B:302:0x05aa, B:304:0x05ad, B:306:0x05b4, B:308:0x0284, B:309:0x01dd, B:311:0x01e8, B:313:0x01f7, B:314:0x05bf, B:316:0x005f, B:318:0x0068, B:320:0x0075, B:323:0x0080, B:325:0x0089, B:326:0x01ff, B:327:0x0203, B:329:0x020d, B:331:0x0217, B:333:0x0221, B:335:0x0227, B:338:0x022f, B:341:0x023a, B:343:0x0245, B:344:0x024c, B:345:0x05c9, B:347:0x05d0, B:349:0x05d3), top: B:2:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03ef A[Catch: all -> 0x05e5, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x05e5, blocks: (B:3:0x0023, B:5:0x0028, B:8:0x0036, B:11:0x003f, B:14:0x004b, B:16:0x0052, B:20:0x008f, B:23:0x0099, B:27:0x00a7, B:29:0x00ad, B:32:0x00b7, B:34:0x00c2, B:36:0x00d1, B:37:0x00d7, B:39:0x00dd, B:41:0x00e4, B:43:0x00e9, B:46:0x00f3, B:49:0x00fe, B:50:0x0104, B:51:0x010a, B:52:0x010f, B:56:0x011e, B:58:0x0125, B:59:0x012a, B:61:0x0137, B:62:0x013e, B:63:0x0145, B:65:0x014e, B:67:0x0155, B:69:0x0161, B:71:0x016a, B:72:0x0171, B:74:0x0180, B:76:0x018c, B:77:0x0191, B:77:0x0191, B:80:0x0198, B:81:0x019f, B:83:0x01a5, B:84:0x01aa, B:86:0x01b6, B:88:0x01bf, B:90:0x01c6, B:92:0x01ca, B:93:0x01cf, B:97:0x05b7, B:99:0x05e4, B:104:0x025c, B:106:0x0263, B:107:0x0267, B:109:0x0276, B:115:0x0421, B:118:0x042b, B:121:0x0436, B:125:0x0442, B:127:0x0449, B:128:0x044e, B:130:0x0457, B:132:0x045c, B:135:0x0464, B:138:0x046f, B:141:0x047a, B:142:0x0480, B:144:0x048a, B:146:0x0490, B:148:0x0497, B:151:0x049f, B:155:0x04ad, B:157:0x04b2, B:158:0x04b7, B:159:0x04be, B:160:0x04c4, B:162:0x04c9, B:164:0x04cf, B:166:0x04d6, B:170:0x04e4, B:171:0x04e9, B:171:0x04e9, B:173:0x04ee, B:174:0x04f5, B:175:0x04fa, B:175:0x04fa, B:178:0x0504, B:179:0x050b, B:181:0x0511, B:183:0x0517, B:185:0x051d, B:188:0x0525, B:191:0x0530, B:193:0x0539, B:198:0x056d, B:199:0x05db, B:201:0x0545, B:202:0x0579, B:204:0x0552, B:205:0x0583, B:206:0x058d, B:208:0x0560, B:209:0x0597, B:210:0x0293, B:211:0x0299, B:212:0x029f, B:215:0x02aa, B:218:0x02b6, B:220:0x02bf, B:232:0x02fe, B:234:0x03d2, B:237:0x03dc, B:238:0x03e3, B:241:0x03ef, B:246:0x0406, B:248:0x040f, B:249:0x0416, B:251:0x041d, B:253:0x03b2, B:255:0x03b8, B:258:0x03c2, B:260:0x03cb, B:262:0x0308, B:264:0x030e, B:267:0x0318, B:268:0x031e, B:270:0x0329, B:272:0x0337, B:274:0x0343, B:276:0x034c, B:279:0x0354, B:281:0x035e, B:282:0x0364, B:285:0x0370, B:288:0x037c, B:289:0x0382, B:290:0x0386, B:290:0x0386, B:293:0x038f, B:294:0x0394, B:295:0x039c, B:297:0x03a5, B:299:0x03a8, B:300:0x05a1, B:302:0x05aa, B:304:0x05ad, B:306:0x05b4, B:308:0x0284, B:309:0x01dd, B:311:0x01e8, B:313:0x01f7, B:314:0x05bf, B:316:0x005f, B:318:0x0068, B:320:0x0075, B:323:0x0080, B:325:0x0089, B:326:0x01ff, B:327:0x0203, B:329:0x020d, B:331:0x0217, B:333:0x0221, B:335:0x0227, B:338:0x022f, B:341:0x023a, B:343:0x0245, B:344:0x024c, B:345:0x05c9, B:347:0x05d0, B:349:0x05d3), top: B:2:0x0023 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void CfQ(X.JDB r302) {
        /*
            Method dump skipped, instructions count: 1518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H5G.CfQ(X.JDB):void");
    }

    @Override // X.JIi
    public void CsK(UserKey userKey) {
        IYt iYt;
        C00j.A05("ParticipantViewImpl.setParticipantKey", 568311490);
        try {
            GrU A0V2 = GOo.A0V(this);
            if (!C2qv.A01(A0V2.A06, userKey)) {
                A0V2.A06 = userKey;
                if (((UserKey) 1Br.A0B(A0V2.A0P)) == null) {
                    4zI.A03.A06("ParticipantPresenter", "mLoggedInUserKey is null", new Object[0]);
                }
                HpS hpS = (HpS) 1Br.A0B(A0V2.A0O);
                String str = userKey.id;
                11T.A0A(str);
                boolean A0O = 11T.A0O(hpS.A00(), str);
                A0V2.A08 = A0O;
                GOn.A1W(4zI.A03, "ParticipantPresenter", 0Pz.A16("id=", userKey.id, ", forSelf=", A0O));
                if (A0V2.A08) {
                    iYt = (IYt) A0V2.A12.getValue();
                } else {
                    AbR A0J = AbJ.A0J(A0V2.A0W);
                    String str2 = userKey.id;
                    Context A01 = FbInjector.A01();
                    AbL.A0y(A0J);
                    try {
                        new IYs(AbG.A0H(A0J), str2);
                        1Bn.A0K();
                        FbInjector.A04(A01);
                    } catch (Throwable th) {
                        1Bn.A0K();
                        FbInjector.A04(A01);
                        throw th;
                    }
                }
                A0V2.A05 = (JL8) iYt;
                Hka A02 = GrU.A02(A0V2);
                A02.A0D = A0V2.A08;
                A02.A07 = userKey;
                Boolean A03 = GrU.A03(A0V2);
                if (A03 != null) {
                    A02.A0B = A03.booleanValue();
                }
                IZv.A00(A02, A0V2);
                GrU.A0A(A0V2);
            }
            C00j.A01(45189017);
        } catch (Throwable th2) {
            C00j.A01(-534132977);
            throw th2;
        }
    }

    @Override // X.JIi
    public void Ctq(int i) {
        GrU A0V2 = GOo.A0V(this);
        if (A0V2.A01 != i) {
            A0V2.A01 = i;
            Hka A02 = GrU.A02(A0V2);
            A02.A03 = i;
            IZv.A00(A02, A0V2);
            GrU.A0B(A0V2);
            GrU.A0D(A0V2);
            A0V2.A0f();
            GrU.A09(A0V2);
            GrU.A0F(A0V2);
            GrU.A0G(A0V2);
            GrU.A0I(A0V2);
        }
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        11T.A0F(canvas, 0);
        super.dispatchDraw(canvas);
        HpR hpR = this.A0S;
        if (hpR.A01) {
            canvas.drawPath(hpR.A03, hpR.A02);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.widget.CustomFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        boolean z;
        int A06 = 0FI.A06(-779960692);
        C00j.A05("ParticipantViewImpl.onAttachedToWindow", -1591435715);
        try {
            super.onAttachedToWindow();
            List list = this.A0G;
            if (list == null) {
                int[] iArr = new int[3];
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 0;
                ArrayList A0t = AnonymousClass001.A0t(3);
                int i = 0;
                do {
                    int i2 = iArr[i];
                    String A01 = I6F.A01(this);
                    Context context = getContext();
                    HVk hVk = this.A0P;
                    boolean z2 = this.A0R;
                    if (i2 == 0) {
                        1BL.A1F(context, hVk);
                        new HgG(context, hVk, A01, z2);
                    } else if (i2 == 1) {
                        11T.A0G(context, 1, hVk);
                        if (z2) {
                            new HgG(context, hVk, A01, true);
                        } else {
                            z = false;
                        }
                    } else {
                        if (i2 != 2) {
                            throw 1BK.A0f(DKB.A00(0), new Object[]{Integer.valueOf(i2)});
                        }
                        11T.A0F(context, 1);
                        11T.A0F(hVk, 2);
                        new HgG(context, hVk, A01, z2);
                    }
                    A0t.add(z);
                    i++;
                } while (i < 3);
                list = 0QD.A0S(A0t);
            }
            this.A0G = list;
            GOo.A0V(this).A0Y(this);
            List<GpR> list2 = this.A0G;
            if (list2 != null) {
                for (GpR gpR : list2) {
                    if (gpR instanceof GpR) {
                        GpR gpR2 = gpR;
                        gpR2.A01 = C9lt.A00(((HgG) gpR2).A01).A00(new Iey(gpR2), JAQ.A00, true);
                    }
                }
            }
            C00j.A01(-11028595);
            0FI.A0C(-2079929960, A06);
        } catch (Throwable th) {
            C00j.A01(-864281032);
            0FI.A0C(-314793771, A06);
            throw th;
        }
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IllegalStateException A0h;
        int A06 = 0FI.A06(-1672967273);
        C00j.A05("ParticipantViewImpl.onDetachedFromWindow", 1970393198);
        try {
            GOo.A0V(this).A0X();
            2Wo r0 = this.A0A;
            if (r0 != null) {
                if (r0.A00 != null) {
                    C7uL.A01(C09s.A01(r0.A01(), 2131366307));
                }
                2Wo r02 = this.A0A;
                if (r02 != null) {
                    A04(r02, false);
                    A02(null, true);
                    List<GpR> list = this.A0G;
                    if (list != null) {
                        for (GpR gpR : list) {
                            if (gpR instanceof GpR) {
                                GpR gpR2 = gpR;
                                C00m c00m = gpR2.A01;
                                if (c00m != null) {
                                    c00m.invoke();
                                }
                                gpR2.A01 = null;
                            }
                        }
                    }
                    super.onDetachedFromWindow();
                    C00j.A01(-1678618817);
                    0FI.A0C(-1249618231, A06);
                    return;
                }
                A0h = 1BK.A0h();
                0FI.A0C(-2136745700, A06);
            } else {
                A0h = 1BK.A0h();
            }
            throw A0h;
        } catch (Throwable th) {
            C00j.A01(1226340743);
            0FI.A0C(-1450905202, A06);
            throw th;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = 0FI.A06(738267505);
        super.onSizeChanged(i, i2, i3, i4);
        HpR hpR = this.A0S;
        hpR.A00(i, i2, hpR.A00);
        0FI.A0C(2021650308, A06);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0039, code lost:
    
        if (X.GOp.A0a(r0.A0R).A07 < 2) goto L6;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r302) {
        /*
            r301 = this;
            r0 = 387737019(0x171c65bb, float:5.053472E-25)
            int r0 = X.0FI.A05(r0)
            r303 = r0
            r0 = r302
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r301
            X.GrU r0 = X.GOo.A0V(r0)
            r304 = r0
            r0 = r304
            boolean r0 = r0.A08
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L3c
            r0 = r304
            X.1Br r0 = r0.A0R
            X.JOM r0 = X.GOp.A0a(r0)
            X.IYp r0 = (X.IYp) r0
            r306 = r0
            r0 = r306
            int r0 = r0.A07
            r307 = r0
            r0 = 2
            r308 = r0
            r0 = 1
            r305 = r0
            r0 = r307
            r1 = r308
            if (r0 >= r1) goto L42
        L3c:
            r0 = 0
            r305 = r0
            r0 = 0
            r306 = r0
        L42:
            r0 = 1
            r307 = r0
            r0 = r305
            if (r0 == 0) goto Lb3
            r0 = r304
            X.1Br r0 = r0.A0J
            X.IMJ r0 = X.GOp.A0F(r0)
            r309 = r0
            r0 = r309
            com.facebook.messaging.montage.model.art.EffectItem r0 = r0.A00
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L9e
            r0 = r306
            boolean r0 = r0.A13
            r305 = r0
            r0 = r305
            r1 = r307
            if (r0 != r1) goto L9e
            r0 = r309
            boolean r0 = r0.A0B()
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L9e
        L79:
            r0 = r304
            X.N1W r0 = r0.A03
            r306 = r0
            r0 = r306
            if (r0 == 0) goto Lb3
            r0 = r306
            r1 = r302
            r2 = 0
            boolean r0 = r0.A03(r1, r2)
            r305 = r0
            r0 = r305
            r1 = r307
            if (r0 != r1) goto Lb3
        L94:
            r0 = 1959753157(0x74cf75c5, float:1.3149342E32)
            r1 = r303
            X.0FI.A0B(r0, r1)
            r0 = r307
            return r0
        L9e:
            r0 = r304
            X.1Br r0 = r0.A0K
            X.IML r0 = X.GOp.A0W(r0)
            r306 = r0
            r0 = r306
            boolean r0 = r0.A0P()
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L79
        Lb3:
            r0 = r304
            android.view.GestureDetector r0 = r0.A02
            r306 = r0
            r0 = r306
            if (r0 == 0) goto Ld0
            r0 = r306
            r1 = r302
            boolean r0 = r0.onTouchEvent(r1)
            r305 = r0
            r0 = r305
            r1 = r307
            if (r0 != r1) goto Ld0
            goto L94
        Ld0:
            r0 = 0
            r307 = r0
            goto L94
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H5G.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
