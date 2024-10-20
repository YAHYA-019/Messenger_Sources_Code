package X;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: IkG.class */
public final class IkG implements JMY {
    public int A00;
    public HuI A01;
    public Exception A02;
    public Integer A03;
    public java.util.Map A04;
    public RRF A05;
    public final JIC A06;
    public final Hqj A07;
    public final I8v A08;
    public final I9d A09;
    public final QqC A0A;
    public final RZF A0B;
    public final Hqo A0C;
    public final QpB A0D;
    public final IF5 A0E;
    public final JNB A0F;
    public final File A0G;
    public final HashMap A0H;
    public final HashMap A0I;
    public final List A0J;
    public final List A0K;
    public final List A0L;
    public final TreeSet A0M;
    public final ExecutorService A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final Ho9 A0Q;
    public final JMJ A0R;

    public IkG(JIC jic, Hqj hqj, I8v i8v, Ho9 ho9, I9d i9d, QqC qqC, Hqo hqo, QpB qpB, QyG qyG, JMJ jmj, String str, java.util.Map map, ExecutorService executorService, boolean z, boolean z2) {
        1BL.A1G(jic, ho9);
        this.A07 = hqj;
        this.A0C = hqo;
        this.A06 = jic;
        this.A0Q = ho9;
        this.A0R = jmj;
        this.A08 = i8v;
        this.A0D = qpB;
        this.A0P = z;
        this.A0O = z2;
        this.A0N = executorService;
        this.A0A = qqC;
        this.A09 = i9d;
        this.A0G = AnonymousClass001.A0E(str);
        JNB jnb = hqo.A02;
        this.A0F = jnb;
        this.A0L = AnonymousClass001.A0s();
        this.A0K = AnonymousClass001.A0s();
        this.A0J = AnonymousClass001.A0s();
        this.A03 = 0S2.A00;
        this.A0M = new TreeSet(SFN.A00);
        this.A0H = AnonymousClass001.A0u();
        this.A0I = AnonymousClass001.A0u();
        this.A0B = new RZF(jnb, jmj, hqo.A0e);
        map.put("crash_recovery_mode", "NO_RECORD");
        map.put("video_transcode_is_segmented", String.valueOf(AnonymousClass001.A1W(qpB, QpB.A05)));
        Hqj hqj2 = this.A07;
        if (hqj2 != null) {
            map.put("source_color_space", RVP.A00(hqj2.A01));
        }
        JIC jic2 = this.A06;
        HuI huI = new HuI(jic2, i8v, map);
        this.A01 = huI;
        HashMap hashMap = new HashMap(huI.A02);
        this.A04 = hashMap;
        ROD rod = new ROD(jic, hashMap, this.A0C.A01.A0A());
        Hyh hyh = new Hyh(jic, this.A04);
        HdY hdY = new HdY(jic2, this.A04, -1);
        11T.A0A(this.A0G.getPath());
        this.A0E = qyG.A00(hdY, hqj2, this, hyh, rod, qpB);
    }

    public static final JSONArray A00(List list) {
        JSONObject A00;
        JSONArray jSONArray = new JSONArray();
        for (Object obj : list) {
            if (obj instanceof QyS) {
                A00 = ((QyS) obj).A00();
            } else if (obj instanceof IDe) {
                A00 = ((IDe) obj).A03();
            }
            jSONArray.put(A00);
        }
        return jSONArray;
    }

    public static final JSONObject A01(IkG ikG) {
        JSONObject jSONObject = null;
        if (ikG.A0C.A01.A0A()) {
            try {
                JSONObject A12 = AnonymousClass001.A12();
                Iterator A0x = AnonymousClass001.A0x(ikG.A0I);
                while (A0x.hasNext()) {
                    Map.Entry A0z = AnonymousClass001.A0z(A0x);
                    A12.put(String.valueOf(((Qq3) A0z.getKey()).value), ((QyS) A0z.getValue()).A00());
                }
                JSONObject A122 = AnonymousClass001.A12();
                A122.put("mPrevUploadedSegmentByType", A12);
                A122.put("mTranscodeResults", A00(ikG.A0K));
                A122.put("mSucceededTranscoderSegments", A00(ikG.A0J));
                jSONObject = A122;
                boolean z = false;
                QyS[] qySArr = (QyS[]) ikG.A0M.toArray(new QyS[0]);
                A122.put("mPendingSegmentsToUpload", A00(C0s8.A14(Arrays.copyOf(qySArr, qySArr.length))));
                A122.put("mTranscodeSuccessCount", ikG.A00);
                A122.put("mTranscodeTokens", ikG.A0L.size());
                A122.put("mState", HLi.A00(ikG.A03));
                if (ikG.A02 != null) {
                    z = true;
                }
                A122.put("mTransferException", z);
                A122.put("mFileToSegmentMap", ikG.A0H);
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    public static final void A02(Rgr rgr, IDe iDe, IkG ikG, QyS qyS) {
        if (ikG.A0C.A01.A0A()) {
            String name = qyS.A04.name();
            int i = qyS.A00;
            JSONObject A01 = A01(ikG);
            synchronized (rgr) {
                11T.A0F(name, 0);
                Rgr.A00(rgr, iDe, "media_upload_debug_info", name, A01, i);
            }
        }
    }

    public static final void A03(IkG ikG) {
        IllegalStateException A0h;
        synchronized (ikG) {
            while (true) {
                try {
                    TreeSet treeSet = ikG.A0M;
                    if (!treeSet.isEmpty()) {
                        Object first = treeSet.first();
                        if (first == null) {
                            A0h = 1BK.A0h();
                            break;
                        }
                        QyS qyS = (QyS) first;
                        HashMap hashMap = ikG.A0I;
                        QyS qyS2 = (QyS) hashMap.get(qyS.A04);
                        Iterator A13 = GOo.A13(hashMap);
                        long j = -1;
                        QyS qyS3 = null;
                        while (A13.hasNext()) {
                            QyS qyS4 = (QyS) A13.next();
                            long j2 = qyS4.A03;
                            if (j2 > j) {
                                j = j2;
                                qyS3 = qyS4;
                            }
                        }
                        if (qyS2 != null) {
                            if (qyS2.A00 + 1 != qyS.A00) {
                                break;
                            }
                        } else if (qyS.A00 != 0) {
                            break;
                        }
                        long j3 = -1;
                        if ((qyS3 != null && qyS3.A02 == j3) || (qyS.A02 == j3 && !RiE.A0C(qyS.A05))) {
                            break;
                        }
                        Object pollFirst = treeSet.pollFirst();
                        if (pollFirst == null) {
                            A0h = 1BK.A0h();
                            break;
                        }
                        QyS qyS5 = (QyS) pollFirst;
                        Iterator A132 = GOo.A13(hashMap);
                        long j4 = -1;
                        QyS qyS6 = null;
                        while (A132.hasNext()) {
                            QyS qyS7 = (QyS) A132.next();
                            long j5 = qyS7.A03;
                            if (j5 > j4) {
                                j4 = j5;
                                qyS6 = qyS7;
                            }
                        }
                        long j6 = qyS6 == null ? 0L : qyS6.A03 + qyS6.A02;
                        qyS5.A03 = j6;
                        ikG.A0E.A0A(new Rb8(qyS5.A04, qyS5.A05, qyS5.A06, qyS5.A00, qyS5.A02, j6, qyS5.A01));
                        hashMap.put(qyS5.A04, qyS5);
                    } else {
                        break;
                    }
                } catch (Exception e) {
                    A04(ikG, e);
                    ikG.A01.A03(e);
                }
            }
            throw A0h;
        }
    }

    public static final void A04(IkG ikG, Exception exc) {
        String message = exc.getMessage();
        if (message == null) {
            message = "";
        }
        ikG.A05(message);
        ikG.A0R.Bxd(exc);
    }

    private final void A05(String str) {
        List list = this.A0L;
        if (list.size() != this.A00) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((JKY) it.next()).ADz(str);
            }
        }
        this.A0E.A07();
    }

    public void CJz(Rb8 rb8, float f) {
        synchronized (this) {
            RRF rrf = this.A05;
            if (rrf == null) {
                throw 1BK.A0h();
            }
            rrf.A00(rb8, f);
        }
    }

    public void CRb(Exception exc) {
        synchronized (this) {
            if (this.A03 == 0S2.A01) {
                if (this.A0L.size() == this.A00) {
                    this.A03 = 0S2.A0N;
                    A04(this, exc);
                } else {
                    this.A02 = exc;
                }
            }
        }
    }

    public void CRg(HtP htP) {
        this.A0R.CSx(htP.A00());
    }

    public void CSw(RZ2 rz2) {
        synchronized (this) {
            this.A0R.onSuccess(new Rac(this.A0D, rz2, this.A0K));
        }
    }

    public void Cja() {
        synchronized (this) {
        }
    }

    public void D8Q() {
        JMZ s3o;
        Hqo hqo;
        JKc jKc;
        IllegalStateException th;
        int size;
        synchronized (this) {
            JMJ jmj = this.A0R;
            jmj.onStart();
            JNB jnb = this.A0F;
            Hqj hqj = this.A07;
            I8v i8v = this.A08;
            jnb.CRV(hqj, i8v);
            try {
                this.A01.A02();
                this.A03 = 0S2.A01;
                s3o = new S3O(new IkL(new Rgr(this.A06, this.A04), this), this.A0N);
                int ordinal = this.A0A.ordinal();
                if (ordinal == 0) {
                    hqo = this.A0C;
                    jKc = hqo.A0Y;
                } else {
                    if (ordinal != 1) {
                        new Exception("Unsupported mimetype for transcoding");
                        throw th;
                    }
                    hqo = this.A0C;
                    jKc = hqo.A0X;
                }
            } catch (HDB | RuntimeException e) {
                jmj.Bxd(e);
            }
            if (jKc != null) {
                File file = this.A0G;
                List list = this.A0J;
                List list2 = this.A0K;
                QpB qpB = this.A0D;
                I9d i9d = this.A09;
                List<JKZ> ALD = jKc.ALD(hqj, i8v, i9d, hqo, s3o, qpB, file, list, list2, -1, 2500000L, this.A0P, this.A0O, false);
                int i = 0;
                for (JKZ jkz : ALD) {
                    i += jkz.AwM();
                    this.A0L.add(this.A0Q.A00(jkz));
                }
                if (i == 0) {
                    i = Math.max(list.size(), 1);
                }
                if (ALD.isEmpty() && 1BK.A1Y(list2)) {
                    RZF rzf = this.A0B;
                    rzf.A01 = 1.0f;
                    RZF.A00(rzf);
                    jnb.CRW(i9d, hqo, list2, true);
                }
                IF5 if5 = this.A0E;
                synchronized (if5) {
                    try {
                        size = if5.A0L.size();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                this.A05 = new RRF(this.A0B, size, i);
                if5.A09();
            } else {
                th = 1BK.A0h();
            }
            throw th;
        }
    }

    public void cancel() {
        synchronized (this) {
            if (this.A03 == 0S2.A01) {
                this.A03 = 0S2.A0C;
                A05("SegmentedMediaUploadStrategy canceled by user");
                this.A0R.Bn7(new CancellationException("SegmentedMediaUploadStrategy canceled by user"));
            }
        }
    }
}
