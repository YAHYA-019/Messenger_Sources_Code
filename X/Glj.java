package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.ContextChain;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.facebook.video.common.playerorigin.PlayerOrigin;
import com.facebook.video.plugins.CoverImagePlugin;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: Glj.class */
public final class Glj extends C1rj {
    public static final CallerContext A08 = CallerContext.A0B("CoverImagePluginComponent");
    public 6TN A00;
    public PlayerOrigin A01;
    public GRD A02;
    public 6TI A03;
    public IhX A04;
    public C6ce A05;
    public GRX A06;
    public I2C A07;

    public Glj() {
        super("CoverImagePluginComponent");
    }

    public boolean A0j(1Iw r302, 1Iw r303) {
        if (r302.A09(4gI.class) != null) {
            if (!r302.A09(4gI.class).equals(r303.A09(4gI.class))) {
                return false;
            }
        } else if (r303.A09(4gI.class) != null) {
            return false;
        }
        if (r302.A09(JCt.class) != null) {
            r302.A09(JCt.class);
            r303.A09(JCt.class);
            throw AnonymousClass001.A0Q("equals");
        }
        if (r303.A09(JCt.class) == null) {
            return r302.A09(ContextChain.class) != null ? r302.A09(ContextChain.class).equals(r303.A09(ContextChain.class)) : r303.A09(ContextChain.class) == null;
        }
        return false;
    }

    public Integer A0m() {
        return 0S2.A0C;
    }

    public Object A0n(Context context) {
        return new CoverImagePlugin(context, A08, null, 2132542426);
    }

    public boolean A0o() {
        return true;
    }

    public boolean A0p() {
        return true;
    }

    public boolean A0q() {
        return true;
    }

    public boolean A0r(1LI r302, 1LI r303, 2Yv r304, 2Yv r305) {
        Glj glj = (Glj) r302;
        Glj glj2 = (Glj) r303;
        6TI r306 = null;
        6TI r307 = glj == null ? null : glj.A03;
        if (glj2 != null) {
            r306 = glj2.A03;
        }
        boolean z = true;
        if (r307 != null && r306 != null) {
            z = !r307.A03().equals(r306.A03());
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.3om, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ InterfaceC00783om A11() {
        return new Object();
    }

    @Override // X.C1rj
    public void A1F(1Iw r302) {
        6TI r0 = this.A03;
        ContextChain contextChain = (ContextChain) r302.A09(ContextChain.class);
        InterfaceC06194g7 interfaceC06194g7 = (InterfaceC06194g7) 1Bi.A03(116404);
        HQQ hqq = (HQQ) 1Bi.A03(115869);
        CallerContext A05 = CallerContext.A05(contextChain, "CoverImagePluginComponent");
        C00i c00i = hqq.A00.A00;
        if (1BK.A0M(c00i).AZk(36315606345458901L)) {
            if (contextChain != null) {
                List A19 = 4YU.A19(2yD.A02(1BK.A0M(c00i), 36878556298937196L), InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0);
                if (!(A19 instanceof Collection) || !A19.isEmpty()) {
                    Iterator it = A19.iterator();
                    while (it.hasNext()) {
                        if (0CV.A0a(AnonymousClass001.A0i(it), contextChain.A00().A04, true)) {
                            break;
                        }
                    }
                }
            }
            2Dp A00 = 6dZ.A0L.A00(r0);
            if (A00 != null) {
                interfaceC06194g7.CYS(A00.A05, null, A05, 1BJ.A00(302));
            }
        }
        r302.A06().A05.A00 = A05;
    }

    @Override // X.C1rj
    public void A1H(1Iw r302, AnonymousClass274 anonymousClass274, C23P c23p, C27G c27g, int i, int i2) {
        C2ra.A02(c23p, (float) this.A03.A00, i, i2);
    }

    @Override // X.C1rj
    public void A1J(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        ((C6d6) obj).A0b(this.A03, this.A04.A00, this.A05);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x029e, code lost:
    
        if (r0.A1C() == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0276, code lost:
    
        if (X.6TN.A09.equals(r0) != false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02ef  */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1K(X.1Iw r302, X.AnonymousClass274 r303, java.lang.Object r304) {
        /*
            Method dump skipped, instructions count: 851
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Glj.A1K(X.1Iw, X.274, java.lang.Object):void");
    }

    @Override // X.C1rj
    public void A1L(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        ((C6d6) obj).A0Q();
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [X.HEy, java.lang.Object] */
    @Override // X.C1rj
    public void A1M(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        C6d6 c6d6 = (C6d6) obj;
        GRD grd = this.A02;
        PlayerOrigin playerOrigin = this.A01;
        6TI r0 = this.A03;
        6Tb r02 = (6Tb) 1Bi.A03(115824);
        c6d6.A04 = null;
        c6d6.A0S();
        if (grd != null) {
            ?? obj2 = new Object();
            ((HEy) obj2).A00 = "UNSET";
            java.util.Map map = grd.A0A;
            11T.A09(map);
            map.put("CoverImageVisibility", obj2);
        }
        if (playerOrigin == null || r0 == null) {
            return;
        }
        r02.A07(playerOrigin, r0.A03()).A0B.remove(CoverImagePlugin.class);
    }

    @Override // X.C1rj
    public void A1P(InterfaceC00783om interfaceC00783om, InterfaceC00783om interfaceC00783om2) {
        ((ITH) interfaceC00783om).A00 = ((ITH) interfaceC00783om2).A00;
    }

    @Override // X.C1rj
    public boolean A1a(1LI r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            Glj glj = (Glj) r302;
            IhX ihX = this.A04;
            IhX ihX2 = glj.A04;
            if (ihX != null) {
                if (!ihX.equals(ihX2)) {
                    return false;
                }
            } else if (ihX2 != null) {
                return false;
            }
            I2C i2c = this.A07;
            I2C i2c2 = glj.A07;
            if (i2c != null) {
                if (!i2c.equals(i2c2)) {
                    return false;
                }
            } else if (i2c2 != null) {
                return false;
            }
            GRD grd = this.A02;
            GRD grd2 = glj.A02;
            if (grd != null) {
                if (!grd.equals(grd2)) {
                    return false;
                }
            } else if (grd2 != null) {
                return false;
            }
            C6ce c6ce = this.A05;
            C6ce c6ce2 = glj.A05;
            if (c6ce != null) {
                if (!c6ce.equals(c6ce2)) {
                    return false;
                }
            } else if (c6ce2 != null) {
                return false;
            }
            PlayerOrigin playerOrigin = this.A01;
            PlayerOrigin playerOrigin2 = glj.A01;
            if (playerOrigin != null) {
                if (!playerOrigin.equals(playerOrigin2)) {
                    return false;
                }
            } else if (playerOrigin2 != null) {
                return false;
            }
            6TN r0 = this.A00;
            6TN r02 = glj.A00;
            if (r0 != null) {
                if (!r0.equals(r02)) {
                    return false;
                }
            } else if (r02 != null) {
                return false;
            }
            6TI r03 = this.A03;
            6TI r04 = glj.A03;
            if (r03 != null) {
                if (!r03.equals(r04)) {
                    return false;
                }
            } else if (r04 != null) {
                return false;
            }
            GRX grx = this.A06;
            GRX grx2 = glj.A06;
            if (grx != null) {
                if (!grx.equals(grx2)) {
                    return false;
                }
            } else if (grx2 != null) {
                return false;
            }
        }
        return true;
    }

    @Override // X.C1rj, X.C1rk
    public boolean ADe() {
        return true;
    }
}
