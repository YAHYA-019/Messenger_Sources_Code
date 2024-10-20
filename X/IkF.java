package X;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: IkF.class */
public final class IkF implements JMY {
    public int A00;
    public HuI A01;
    public Integer A02;
    public RRF A03;
    public final JIC A04;
    public final Hqj A05;
    public final RZF A06;
    public final Hqo A07;
    public final IF5 A08;
    public final JNB A09;
    public final JMJ A0A;
    public final String A0B;
    public final List A0C;
    public final List A0D;
    public final java.util.Map A0E;
    public final ExecutorService A0F;
    public final Ho9 A0G;

    public IkF(JIC jic, Hqj hqj, Ho9 ho9, Hqo hqo, QyG qyG, JMJ jmj, String str, java.util.Map map, ExecutorService executorService) {
        1BK.A1K(str, 2, jic);
        11T.A0F(ho9, 8);
        this.A07 = hqo;
        this.A0B = str;
        this.A0E = map;
        this.A0A = jmj;
        JNB jnb = hqo.A02;
        this.A09 = jnb;
        this.A06 = new RZF(jnb, jmj, hqo.A0e);
        this.A04 = jic;
        this.A0D = AnonymousClass001.A0s();
        this.A05 = hqj;
        this.A0G = ho9;
        this.A0F = executorService;
        this.A02 = 0S2.A00;
        this.A0C = AnonymousClass001.A0s();
        ROD rod = new ROD(jic, map, hqo.A01.A0A());
        this.A08 = qyG.A00(new HdY(jic, map, GOp.A08(str)), hqj, this, new Hyh(jic, map), rod, QpB.A04);
    }

    public static final JSONObject A00(IkF ikF) {
        JSONObject A00;
        JSONObject A12 = AnonymousClass001.A12();
        if (ikF.A07.A01.A0A()) {
            try {
                A12.put("mTranscodeSuccessCount", ikF.A00);
                A12.put("mTranscodeTokens", ikF.A0D.size());
                A12.put("mState", HLi.A00(ikF.A02));
                List list = ikF.A0C;
                JSONArray jSONArray = new JSONArray();
                for (Object obj : list) {
                    if (obj instanceof QyS) {
                        A00 = ((QyS) obj).A00();
                    } else if (obj instanceof IDe) {
                        A00 = ((IDe) obj).A03();
                    }
                    jSONArray.put(A00);
                }
                A12.put("mTranscodeResults", jSONArray);
            } catch (JSONException unused) {
            }
        }
        return A12;
    }

    public void CJz(Rb8 rb8, float f) {
        synchronized (this) {
            this.A0A.CEI(f);
            RRF rrf = this.A03;
            if (rrf != null) {
                rrf.A00(rb8, f);
            }
        }
    }

    public void CRb(Exception exc) {
        synchronized (this) {
            this.A08.A07();
            this.A0A.Bxd(exc);
        }
    }

    public void CRg(HtP htP) {
        this.A0A.CSx(htP.A00());
    }

    public void CSw(RZ2 rz2) {
        synchronized (this) {
            this.A0A.onSuccess(new Rac(QpB.A04, rz2, AnonymousClass001.A0s()));
        }
    }

    public void Cja() {
    }

    public void D8Q() {
        IllegalStateException th;
        int size;
        try {
            this.A0A.onStart();
            Hqo hqo = this.A07;
            HYt hYt = hqo.A0U;
            if (hYt != null) {
                I8v i8v = hqo.A0Q;
                if (i8v != null) {
                    i8v.A0A = 1080;
                    i8v.A0C = 1080;
                    i8v.A0D = 100;
                    JNB jnb = this.A09;
                    Hqj hqj = this.A05;
                    jnb.CRV(hqj, i8v);
                    this.A02 = 0S2.A01;
                    java.util.Map map = this.A0E;
                    JIC jic = this.A04;
                    HuI huI = new HuI(jic, i8v, map);
                    this.A01 = huI;
                    huI.A02();
                    Rgr rgr = new Rgr(jic, map);
                    JKc jKc = hqo.A0X;
                    if (jKc != null) {
                        I9d i9d = hYt.A00;
                        File A0E = AnonymousClass001.A0E(this.A0B);
                        List ALD = jKc.ALD(hqj, i8v, i9d, hqo, new S3O(new IkK(rgr, this), this.A0F), QpB.A04, A0E, AnonymousClass001.A0s(), AnonymousClass001.A0s(), 1L, 1L, false, false, true);
                        Iterator it = ALD.iterator();
                        while (it.hasNext()) {
                            this.A0D.add(this.A0G.A00((JKZ) it.next()));
                        }
                        if (ALD.isEmpty()) {
                            List list = this.A0C;
                            if (1BK.A1Y(list)) {
                                RZF rzf = this.A06;
                                rzf.A01 = 1.0f;
                                RZF.A00(rzf);
                                jnb.CRW(i9d, hqo, list, true);
                            }
                        }
                        IF5 if5 = this.A08;
                        synchronized (if5) {
                            try {
                                size = if5.A0L.size();
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        this.A03 = new RRF(this.A06, size, 1);
                        if5.A09();
                        return;
                    }
                    th = AnonymousClass001.A0N("Required value was null.");
                } else {
                    th = 1BK.A0h();
                }
            } else {
                th = 1BK.A0h();
            }
            throw th;
        } catch (Exception e) {
            this.A0A.Bxd(e);
        }
    }

    public void cancel() {
        synchronized (this) {
            this.A08.A07();
        }
        this.A0A.Bn7(new CancellationException("ResizedPTVMediaUploadStrategy canceled by user"));
    }
}
