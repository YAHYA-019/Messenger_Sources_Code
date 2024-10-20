package X;

import com.facebook.video.common.playerorigin.PlayerOrigin;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;

/* renamed from: X.Glf, reason: case insensitive filesystem */
/* loaded from: Glf.class */
public final class C2693Glf extends C1rj {
    public static final 2dP A0C = 2dP.A01;
    public 6TN A00;
    public PlayerOrigin A01;
    public GRD A02;
    public 6TI A03;
    public IhX A04;
    public GRX A05;
    public 2dP A06;
    public String A07;
    public String A08;
    public List A09;
    public Function1 A0A;
    public boolean A0B;

    public C2693Glf() {
        super("VideoPluginsContainerComponent");
        this.A06 = A0C;
    }

    public final Object[] A0k() {
        return new Object[]{this.A04, this.A06, null, 1BK.A0d(), this.A07, this.A08, this.A0A, null, null, null, this.A01, this.A00, this.A09, this.A03, Boolean.valueOf(this.A0B), 4YU.A0k(), this.A05, this.A02};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x013c, code lost:
    
        if (r324 == X.6UR.A05) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x010c, code lost:
    
        if (r0.A1C() == false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x04a3 A[LOOP:2: B:68:0x0495->B:70:0x04a3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0778  */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0y(X.1Iw r302) {
        /*
            Method dump skipped, instructions count: 2184
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2693Glf.A0y(X.1Iw):X.1LI");
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
        int i = r302.A01;
        if (i == -1641004156) {
            HcQ hcQ = (HcQ) obj;
            1Iw r0 = r302.A00.A00;
            6UR r02 = hcQ.A00;
            String str = hcQ.A01;
            6UR r03 = ((C2709Glw) r0.A07(4YU.A0P(r0))).A00;
            0fH.A0d(str, r02.name(), "VideoPluginsContainerComponentSpec", "onPlaybackStateChanged [%s] [%s]");
            if (r02 == r03 || r0.A02 == null) {
                return null;
            }
            r0.A0G(7zS.A0N(r02), "updateState:VideoPluginsContainerComponent.updatePlayerState");
            return null;
        }
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i != 1722588034) {
            return null;
        }
        Object[] objArr = r302.A03;
        String str2 = (String) objArr[0];
        String str3 = (String) objArr[1];
        String str4 = (String) objArr[2];
        1UG A08 = 1BK.A08((04J) 1Bi.A05(04J.class, (Class) null), "ad_validate_image");
        if (!A08.isSampled()) {
            return null;
        }
        A08.A7R("event_name", "ad_validate_image");
        A08.A7R("event_sub_type", "image_component_load");
        A08.A7R("attached_link", str2);
        A08.A7R("ad_id_str", str3);
        A08.A7R(4YT.A00(10), str4);
        A08.BZL();
        return null;
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        C2709Glw c2709Glw = (C2709Glw) r303;
        6UR r0 = 6UR.A0B;
        AtomicInteger A1K = GOn.A1K(0);
        Object A0H = 1Bn.A0H(Hf5.class, (Class) null);
        c2709Glw.A00 = r0;
        c2709Glw.A02 = A1K;
        c2709Glw.A01 = (Hf5) A0H;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
