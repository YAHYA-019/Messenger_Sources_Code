package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import com.facebook.smartcapture.logging.SmartCaptureQpl;
import java.util.LinkedHashMap;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.Gcg, reason: case insensitive filesystem */
/* loaded from: Gcg.class */
public final class C2419Gcg extends Ic7 implements JPz, JFy {
    public static final LinkedHashMap A0B = 1BK.A1C();
    public int A00;
    public final Handler A01;
    public final JEB A02;
    public final I1d A03;
    public final JQ9 A04;
    public final I2L A05;
    public final IHW A06;
    public final IHY A07;
    public volatile JEC A08;
    public volatile JMw A09;
    public volatile CountDownLatch A0A;

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0199, code lost:
    
        if (A02(com.facebook.acra.constants.ActionId.ABORTED) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01c1, code lost:
    
        if (A02(com.facebook.acra.constants.ActionId.RTMP_PACKET_RECEIVED) != false) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2419Gcg(X.JOW r302) {
        /*
            Method dump skipped, instructions count: 895
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2419Gcg.<init>(X.JOW):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A00(C2419Gcg c2419Gcg, Gtv gtv) {
        JQ9 jq9 = c2419Gcg.A04;
        if (jq9 != null) {
            Throwable cause = gtv.getCause();
            jq9.BaP(gtv, "media_pipeline_error", "MediaGraphControllerImpl", ((cause instanceof Error) || (cause instanceof RuntimeException)) ? "high" : SmartCaptureQpl.ANNOTATION_KEY_MEDIUM, "MediaGraphControllerImpl", null, GOn.A0B(c2419Gcg));
        }
    }

    public static final void A01(C2419Gcg c2419Gcg, JQ6 jq6) {
        if ((jq6 instanceof Icn) && Ic7.A0A(c2419Gcg, JO2.A05, 1BK.A0d())) {
            jq6 = new Icz((Icn) jq6);
        }
        IHW ihw = c2419Gcg.A06;
        Handler handler = ihw.A01;
        if (handler.getLooper() != Looper.myLooper()) {
            handler.sendMessage(Message.obtain(ihw.A04.A00, 4, jq6));
        } else {
            IHW.A00(jq6, ihw);
        }
    }

    private final boolean A02(int i) {
        HJS hjs = JQ8.A00;
        JOW jow = super.A00;
        jow.getClass();
        if (jow.BRE(hjs)) {
            return ((JQ8) Ic7.A08(this, hjs)).BSa(i);
        }
        return false;
    }

    @Override // X.JFy
    public String Aj7() {
        return "MediaGraphControllerImpl";
    }

    @Override // X.JPz
    public void CfS(Long l) {
        this.A07.A02((Long) null, false);
    }

    @Override // X.JPz
    public void Cr9(JQ6 jq6) {
        11T.A0F(jq6, 0);
        Handler handler = this.A01;
        if (11T.A0O(handler.getLooper(), Looper.myLooper())) {
            A01(this, jq6);
        } else {
            handler.post(new IvW(this, jq6));
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.HFN, java.lang.Object] */
    @Override // X.JPz
    public void D7Z(int i, int i2, int i3, int i4, int i5, boolean z) {
        IHW ihw = this.A07.A01;
        SparseArray sparseArray = ihw.A02;
        ?? obj = new Object();
        ((HFN) obj).A01 = i2;
        ((HFN) obj).A00 = i3;
        ((HFN) obj).A03 = i4;
        ((HFN) obj).A02 = i5;
        ((HFN) obj).A04 = z;
        sparseArray.put(i, obj);
        JQ6 jq6 = ihw.A00;
        if (jq6 != null) {
            try {
                jq6.D7Z(i, i2, i3, i4, i5, z);
            } catch (Exception e) {
                ihw.A05.C62(ihw, e);
            }
        }
    }
}
