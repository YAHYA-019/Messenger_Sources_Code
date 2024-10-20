package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.video.common.playerorigin.PlayerOrigin;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Gll, reason: case insensitive filesystem */
/* loaded from: Gll.class */
public final class C2698Gll extends C1rj {
    public static final CallerContext A0B = CallerContext.A0B("CoverImagePluginVitoComponent");
    public InterfaceC07034in A00;
    public PlayerOrigin A01;
    public 6UR A02;
    public 6TI A03;
    public IhX A04;
    public GRX A05;
    public JNT A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;

    public C2698Gll() {
        super("CoverImagePluginVitoComponent");
        this.A07 = false;
        this.A09 = false;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.HEy, java.lang.Object] */
    public static void A00(PlayerOrigin playerOrigin, 6Tb r302, String str, boolean z) {
        if (str != null) {
            GRD A07 = r302.A07(playerOrigin, str);
            String str2 = z ? "VISIBLE" : "INVISIBLE";
            ?? obj = new Object();
            ((HEy) obj).A00 = str2;
            java.util.Map map = A07.A0A;
            11T.A09(map);
            map.put("CoverImageVisibility", obj);
        }
    }

    public final Object[] A0k() {
        return new Object[]{this.A04, Boolean.valueOf(this.A07), 1BK.A0d(), Boolean.valueOf(this.A08), Boolean.valueOf(this.A09), Boolean.valueOf(this.A0A), this.A06, this.A05, this.A01, this.A02, this.A03, this.A00};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0118, code lost:
    
        if (X.6UR.A03 != r308) goto L16;
     */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0y(X.1Iw r302) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2698Gll.A0y(X.1Iw):X.1LI");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        C1qp A00 = 1sK.A00(c1qp);
        7zO.A1Q(A00, 900907473652242L);
        return A00;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        AtomicBoolean atomicBoolean;
        AtomicBoolean atomicBoolean2;
        boolean z;
        int i;
        boolean z2;
        int i2 = r302.A01;
        if (i2 == -1932591986) {
            C2716Gm3 c2716Gm3 = (C2716Gm3) 4YU.A0P(r302.A00.A00);
            C1rn c1rn = c2716Gm3.A01;
            atomicBoolean = c2716Gm3.A07;
            atomicBoolean2 = c2716Gm3.A06;
            7zN.A1G(c1rn, 1.0f);
            z = true;
        } else {
            if (i2 != -1823397085) {
                4YV.A1G(r302, obj, i2);
                return null;
            }
            1Iv r0 = r302.A00;
            1Is r02 = r0.A01;
            1Iw r03 = r0.A00;
            Float valueOf = Float.valueOf(((2lD) obj).A00);
            C2698Gll c2698Gll = (C2698Gll) r02;
            C2716Gm3 c2716Gm32 = (C2716Gm3) 4YU.A0P(r03);
            boolean z3 = c2698Gll.A0A;
            atomicBoolean2 = c2716Gm32.A06;
            atomicBoolean = c2716Gm32.A08;
            AtomicReference atomicReference = c2716Gm32.A0A;
            AtomicBoolean atomicBoolean3 = c2716Gm32.A05;
            5Kv A0b = GOo.A0b();
            if (A0b.A1U) {
                i = A0b.A06;
            } else {
                i = GOo.A07(A0b.A3g, 36593194414376054L);
                A0b.A06 = i;
                A0b.A1U = true;
            }
            if (i < 0) {
                return null;
            }
            2yD A0K = 1BK.A0K();
            if (z3 || A0K.AZk(36313261315004434L)) {
                return null;
            }
            if (A0b.A2m) {
                z2 = A0b.A2l;
            } else {
                z2 = 2yD.A04(A0b.A3g, 36311719437733154L);
                A0b.A2l = z2;
                A0b.A2m = true;
            }
            if (!atomicBoolean2.get() || valueOf.floatValue() < i || atomicReference == null || 6UR.A07.equals(atomicReference.get())) {
                return null;
            }
            boolean z4 = atomicBoolean.get();
            if (z2 && !z4) {
                return null;
            }
            atomicBoolean3.set(true);
            if (r03.A02 != null) {
                r03.A0G(new C2l4(new Object[0], 0), "updateState:CoverImagePluginVitoComponent.updateBlankCoverImage");
            }
            z = false;
        }
        atomicBoolean.set(z);
        atomicBoolean2.set(z);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x007b  */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1N(X.1Iw r302, X.2Yv r303) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2698Gll.A1N(X.1Iw, X.2Yv):void");
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
