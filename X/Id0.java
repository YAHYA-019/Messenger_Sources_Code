package X;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: Id0.class */
public final class Id0 implements JMh {
    public Id0 A00;
    public Id0 A01;
    public final Handler A02;
    public final I1d A03;
    public final JQ9 A04;
    public final I9U A05;
    public final Hmm A06;
    public final I21 A07;

    public Id0(I1d i1d, I9U i9u, Hmm hmm, I21 i21) {
        this.A03 = i1d;
        this.A05 = i9u;
        this.A02 = i9u.A00;
        this.A06 = hmm;
        this.A07 = i21;
        this.A04 = null;
    }

    public Id0(I1d i1d, JQ9 jq9, I9U i9u) {
        Hmm hmm = new Hmm();
        I21 i21 = new I21(i1d);
        this.A03 = i1d;
        this.A05 = i9u;
        this.A02 = i9u.A00;
        this.A06 = hmm;
        this.A07 = i21;
        this.A04 = jq9;
    }

    @Override // X.JMh
    public void A5n(JNP jnp, int i) {
        I21 i21 = this.A07;
        I9U i9u = this.A05;
        I21.A00(i9u, i21, i).A01(i9u, jnp);
        JQ9 jq9 = this.A04;
        if (jq9 != null) {
            HashMap A0u = AnonymousClass001.A0u();
            A0u.put("output_index", String.valueOf(i));
            A0u.put("output_class", AnonymousClass001.A0X(jnp));
            jq9.BaQ("media_pipeline_add_output", "MediaGraphIOImpl", A0u, GOn.A0B(this));
        }
    }

    @Override // X.JMh
    public int Anu(int i) {
        Ici ici = (Ici) this.A07.A00.get(0);
        if (ici != null) {
            return ici.A05.A00.size();
        }
        return 0;
    }

    @Override // X.JMh
    public List Anv(int i) {
        Ici ici = (Ici) this.A07.A00.get(0);
        if (ici != null) {
            return ici.A05.A00;
        }
        throw GOp.A16("GlOutput not set ", 0);
    }

    @Override // X.JMh
    public Object Aqr(int i) {
        return this.A06.A00(0Pz.A0T("input_", i));
    }

    @Override // X.JMh
    public boolean BTW(int i) {
        return AnonymousClass001.A1T(this.A06.A00.get(0Pz.A0T("input_", i)));
    }

    @Override // X.JMh
    public void CeN(int i, Object obj) {
        Ici ici = (Ici) this.A07.A00.get(i);
        if (ici != null) {
            ici.A03(obj);
        }
        JQ9 jq9 = this.A04;
        if (jq9 != null) {
            HashMap A0u = AnonymousClass001.A0u();
            A0u.put("output_index", String.valueOf(i));
            jq9.BaQ("media_pipeline_remove_output", "MediaGraphIOImpl", A0u, GOn.A0B(this));
        }
    }

    @Override // X.JMh
    public void Cky(JMv jMv, int i) {
        this.A07.A01(jMv, null);
    }

    @Override // X.JMh
    public void Cpn(Icg icg, int i) {
        String A0T = 0Pz.A0T("input_", i);
        Hmm hmm = this.A06;
        I9U i9u = this.A05;
        Handler handler = this.A02;
        ConcurrentHashMap concurrentHashMap = hmm.A00;
        if (concurrentHashMap.get(A0T) != icg) {
            if (handler.getLooper() == Looper.myLooper()) {
                Object obj = concurrentHashMap.get(A0T);
                if (obj instanceof JLE) {
                    i9u.A04((JLE) obj);
                }
                if (icg instanceof JLE) {
                    i9u.A03(icg);
                }
                if (icg == null) {
                    concurrentHashMap.remove(A0T);
                } else {
                    concurrentHashMap.put(A0T, icg);
                }
            } else {
                handler.post(new J25(i9u, hmm, icg, A0T));
            }
        }
        JQ9 jq9 = this.A04;
        if (jq9 != null) {
            HashMap A0u = AnonymousClass001.A0u();
            A0u.put("input_index", A0T);
            jq9.BaQ("media_pipeline_add_input", "MediaGraphIOImpl", A0u, GOn.A0B(this));
        }
    }
}
