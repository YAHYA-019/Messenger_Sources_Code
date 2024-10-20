package X;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* loaded from: LaS.class */
public final class LaS implements 6WC {
    public int A00;
    public Handler A01;
    public Looper A02;
    public LaQ A03;
    public MLC A04;
    public 6YT A05;
    public final long A06;
    public final LaN A07;
    public final List A08;
    public final Set A09;
    public final Set A0A;
    public final UUID A0B;
    public final int[] A0C;
    public final LaO A0D;
    public final MFu A0E;
    public final MCi A0F;
    public final 6ZG A0G;
    public final String A0H;
    public final HashMap A0I;
    public volatile JWa A0J;

    public LaS(MFu mFu, MCi mCi, 6ZG r304, String str, HashMap hashMap, UUID uuid, int[] iArr) {
        uuid.getClass();
        if (!(!6Za.A01.equals(uuid))) {
            throw AnonymousClass001.A0L(String.valueOf("Use C.CLEARKEY_UUID instead"));
        }
        this.A0B = uuid;
        this.A0E = mFu;
        this.A0F = mCi;
        this.A0I = hashMap;
        this.A0C = iArr;
        this.A0G = r304;
        this.A0H = str;
        this.A07 = new LaN(this);
        this.A0D = new LaO(this);
        this.A08 = AnonymousClass001.A0s();
        this.A0A = Collections.newSetFromMap(new IdentityHashMap());
        this.A09 = Collections.newSetFromMap(new IdentityHashMap());
        this.A06 = 300000L;
    }

    private LaQ A00(6ZM r302, List list) {
        this.A04.getClass();
        UUID uuid = this.A0B;
        MLC mlc = this.A04;
        LaN laN = this.A07;
        LaO laO = this.A0D;
        HashMap hashMap = this.A0I;
        MCi mCi = this.A0F;
        Looper looper = this.A02;
        looper.getClass();
        6ZG r0 = this.A0G;
        6YT r02 = this.A05;
        r02.getClass();
        LaQ laQ = new LaQ(looper, r02, laN, laO, mlc, mCi, r0, hashMap, list, uuid);
        laQ.A3s(r302);
        if (this.A06 != -9223372036854775807L) {
            laQ.A3s((6ZM) null);
        }
        return laQ;
    }

    public static C7ys A01(Looper looper, 6Yl r302, LaS laS, 6ZM r304, boolean z) {
        if (laS.A0J == null) {
            laS.A0J = new JWa(looper, laS);
        }
        DrmInitData drmInitData = r302.A0O;
        if (drmInitData == null) {
            C6ac.A01(r302.A0W);
            laS.A04.getClass();
            return null;
        }
        UUID uuid = laS.A0B;
        ArrayList A02 = A02(drmInitData, uuid, false);
        if (A02.isEmpty()) {
            Exception exc = new Exception(AnonymousClass001.A0Z(uuid, "Media does not support uuid: ", AnonymousClass001.A0k()));
            5My.A05("DefaultDrmSessionMgr", "DRM error", exc);
            if (r304 != null) {
                r304.A04(exc);
            }
            return new LaP(new KLn(6003, exc));
        }
        LaQ laQ = laS.A03;
        if (laQ != null) {
            laQ.A3s(r304);
            return laQ;
        }
        LaQ A00 = laS.A00(r304, A02);
        LaQ.A00(A00);
        if (A00.A00 == 1) {
            KLn AkK = A00.AkK();
            AkK.getClass();
            if (AkK.getCause() instanceof ResourceBusyException) {
                Set set = laS.A09;
                if (!set.isEmpty()) {
                    1Du it = ImmutableSet.A07(set).iterator();
                    while (it.hasNext()) {
                        ((C7ys) it.next()).Cch(null);
                    }
                    A00.Cch(r304);
                    if (laS.A06 != -9223372036854775807L) {
                        A00.Cch((6ZM) null);
                    }
                    A00 = laS.A00(r304, A02);
                }
            }
        }
        LaQ.A00(A00);
        if (A00.A00 == 1) {
            KLn AkK2 = A00.AkK();
            AkK2.getClass();
            if ((AkK2.getCause() instanceof ResourceBusyException) && z) {
                Set set2 = laS.A0A;
                if (!set2.isEmpty()) {
                    1Du it2 = ImmutableSet.A07(set2).iterator();
                    while (it2.hasNext()) {
                        ((LaR) it2.next()).release();
                    }
                    Set set3 = laS.A09;
                    if (!set3.isEmpty()) {
                        1Du it3 = ImmutableSet.A07(set3).iterator();
                        while (it3.hasNext()) {
                            ((C7ys) it3.next()).Cch(null);
                        }
                    }
                    A00.Cch(r304);
                    if (laS.A06 != -9223372036854775807L) {
                        A00.Cch((6ZM) null);
                    }
                    A00 = laS.A00(r304, A02);
                }
            }
        }
        laS.A03 = A00;
        laS.A08.add(A00);
        return A00;
    }

    public static ArrayList A02(DrmInitData drmInitData, UUID uuid, boolean z) {
        int i = drmInitData.A01;
        ArrayList A0t = AnonymousClass001.A0t(i);
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= i) {
                return A0t;
            }
            DrmInitData.SchemeData schemeData = drmInitData.A03[i3];
            if ((schemeData.A00(uuid) || (6Za.A00.equals(uuid) && schemeData.A00(6Za.A01))) && (schemeData.A04 != null || z)) {
                A0t.add(schemeData);
            }
            i2 = i3 + 1;
        }
    }

    public static void A03(LaS laS) {
        if (laS.A04 != null && laS.A00 == 0 && laS.A08.isEmpty() && laS.A0A.isEmpty()) {
            MLC mlc = laS.A04;
            mlc.getClass();
            mlc.release();
            laS.A04 = null;
        }
    }

    private void A04(boolean z) {
        if (z && this.A02 == null) {
            5My.A06("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", JQx.A0o());
            return;
        }
        Thread currentThread = Thread.currentThread();
        Looper looper = this.A02;
        looper.getClass();
        if (currentThread != looper.getThread()) {
            5My.A06("DefaultDrmSessionMgr", 0Pz.A0v("DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: ", currentThread.getName(), "\nExpected thread: ", this.A02.getThread().getName()), JQx.A0o());
        }
    }

    public C7ys A3x(6Yl r302, 6ZM r303) {
        boolean z = false;
        A04(false);
        if (this.A00 > 0) {
            z = true;
        }
        6DP.A04(z);
        Looper looper = this.A02;
        6DP.A01(looper);
        return A01(looper, r302, this, r303, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d8, code lost:
    
        if ("cens".equals(r0) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int Af8(X.6Yl r302) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LaS.Af8(X.6Yl):int");
    }

    public C6at CYI(6Yl r302, 6ZM r303) {
        6DP.A04(AnonymousClass001.A1P(this.A00));
        6DP.A01(this.A02);
        LaR laR = new LaR(this, r303);
        Handler handler = laR.A03.A01;
        handler.getClass();
        handler.post(new LoM(r302, laR));
        return laR;
    }

    public final void CYY() {
        A04(true);
        int i = this.A00;
        this.A00 = i + 1;
        if (i != 0) {
            return;
        }
        if (this.A04 == null) {
            MLC A3v = this.A0E.A3v(this.A0B);
            this.A04 = A3v;
            A3v.Crp(new LaT(this));
            if (5N4.A02(5N3.A1M)) {
                return;
            }
            String str = this.A0H;
            if (str.isEmpty()) {
                return;
            }
            try {
                this.A04.CtY("securityLevel", str);
                return;
            } catch (Exception unused) {
                5My.A02("DefaultDrmSessionMgr", "Failed to set securityLevel property for defaultDrmSessionManager");
                return;
            }
        }
        if (this.A06 == -9223372036854775807L) {
            return;
        }
        int i2 = 0;
        while (true) {
            List list = this.A08;
            if (i2 >= list.size()) {
                return;
            }
            ((LaQ) list.get(i2)).A3s((6ZM) null);
            i2++;
        }
    }

    public void Csr(Looper looper, 6YT r303) {
        synchronized (this) {
            Looper looper2 = this.A02;
            if (looper2 == null) {
                this.A02 = looper;
                this.A01 = new Handler(looper);
            } else {
                6DP.A04(AnonymousClass001.A1W(looper2, looper));
                this.A01.getClass();
            }
        }
        this.A05 = r303;
    }

    public final void release() {
        A04(true);
        int i = this.A00 - 1;
        this.A00 = i;
        if (i == 0) {
            if (this.A06 != -9223372036854775807L) {
                ArrayList A17 = 1BK.A17(this.A08);
                int i2 = 0;
                while (true) {
                    int i3 = i2;
                    if (i3 >= A17.size()) {
                        break;
                    }
                    ((LaQ) A17.get(i3)).Cch((6ZM) null);
                    i2 = i3 + 1;
                }
            }
            1Du it = ImmutableSet.A07(this.A0A).iterator();
            while (it.hasNext()) {
                ((LaR) it.next()).release();
            }
            A03(this);
        }
    }
}
