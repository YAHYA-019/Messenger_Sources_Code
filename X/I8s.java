package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: I8s.class */
public final class I8s {
    public JH1 A00;
    public IFL A01;
    public Hkg A02;
    public Ik1 A03;
    public Boolean A04;
    public boolean A06;
    public final Context A07;
    public final Bitmap.CompressFormat A08;
    public final I8c A09;
    public final JO9 A0A;
    public final I51 A0B;
    public final JGx A0C;
    public final JGy A0D;
    public final JKb A0E;
    public final JLT A0F;
    public final JH6 A0H;
    public final I7C A0K;
    public HashMap A05 = AnonymousClass001.A0u();
    public final List A0I = AnonymousClass001.A0s();
    public final RT3 A0G = new Object();
    public final AtomicBoolean A0J = new AtomicBoolean();

    /* JADX WARN: Type inference failed for: r0v15, types: [X.RT3, java.lang.Object] */
    public I8s(Context context, Bitmap.CompressFormat compressFormat, I8c i8c, I7C i7c, JO9 jo9, I51 i51, JGx jGx, JGy jGy, JKb jKb, JLT jlt, JH1 jh1, Hkg hkg, JH6 jh6) {
        this.A0H = jh6;
        this.A0D = jGy;
        this.A0A = jo9;
        this.A0E = jKb;
        this.A02 = hkg;
        this.A09 = i8c;
        this.A0B = i51;
        this.A08 = compressFormat;
        this.A0C = jGx;
        this.A07 = context;
        this.A0F = jlt;
        this.A00 = jh1;
        this.A0K = i7c;
    }

    public static HashMap A00(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("thumbnail_extraction_api_version", ConstantsKt.CAMERA_ID_BACK);
        hashMap.put("latency_ms", String.valueOf(j));
        return hashMap;
    }

    private void A01(long j, Throwable th) {
        if (this.A00 != null && !(th instanceof Exception)) {
            new Exception(th);
        }
        if (this.A02.A07 != null) {
            if ((th instanceof ExecutionException) && th.getCause() != null) {
                th = th.getCause();
            }
            I51 i51 = new I51();
            i51.A04 = j;
            this.A02.A07.Bwt(i51, new Exception(th));
        }
        this.A04 = Boolean.FALSE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.I3R] */
    public void A02() {
        ?? obj = new Object();
        Ik1 ik1 = this.A03;
        if (ik1 != null) {
            try {
                ik1.finish();
            } catch (Throwable th) {
                I3R.A00((I3R) obj, th);
            }
        }
        try {
            this.A0G.A00();
            this.A05.clear();
        } catch (Throwable th2) {
            I3R.A00((I3R) obj, th2);
        }
        try {
            IFL ifl = this.A01;
            if (ifl != null) {
                ifl.A0B();
            }
        } catch (Throwable th3) {
            I3R.A00((I3R) obj, th3);
        }
        obj.A02();
    }

    /* JADX WARN: Code restructure failed: missing block: B:250:0x0640, code lost:
    
        if (r312 != null) goto L280;
     */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0779  */
    /* JADX WARN: Removed duplicated region for block: B:316:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v337, types: [X.Ik6, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v436, types: [X.HFm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v444, types: [java.lang.Object, X.JGv] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A03(java.util.List r302) {
        /*
            Method dump skipped, instructions count: 2107
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I8s.A03(java.util.List):void");
    }
}
