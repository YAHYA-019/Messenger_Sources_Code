package X;

import android.os.Handler;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.CountDownLatch;

/* loaded from: Id2.class */
public final class Id2 implements JMw {
    public boolean A00;
    public final /* synthetic */ C2419Gcg A01;

    public Id2(C2419Gcg c2419Gcg) {
        this.A01 = c2419Gcg;
    }

    @Override // X.JMw
    public void C5x(IHW ihw) {
        C2419Gcg c2419Gcg = this.A01;
        JQ9 jq9 = c2419Gcg.A04;
        if (jq9 != null) {
            HashMap A0u = AnonymousClass001.A0u();
            LinkedHashMap linkedHashMap = C2419Gcg.A0B;
            synchronized (linkedHashMap) {
                String obj = c2419Gcg.toString();
                String B51 = jq9.B51();
                11T.A0A(B51);
                String B512 = B51.length() > 0 ? jq9.B51() : "unknown";
                11T.A0D(B512);
                linkedHashMap.put(obj, B512);
                A0u.put("active_media_pipelines", linkedHashMap.values().toString());
            }
            jq9.BaQ("media_pipeline_start", "MediaGraphControllerImpl", A0u, GOn.A0B(ihw));
        }
    }

    @Override // X.JMw
    public void C5z(IHW ihw) {
        C2419Gcg c2419Gcg = this.A01;
        c2419Gcg.A00 = 0;
        JQ9 jq9 = c2419Gcg.A04;
        if (jq9 != null) {
            jq9.BaQ("media_pipeline_pause", "MediaGraphControllerImpl", null, GOn.A0B(ihw));
        }
        IHT iht = c2419Gcg.A06.A04.A07;
        11T.A0A(iht);
        iht.A00(c2419Gcg);
        Handler handler = iht.A01;
        if (handler != null) {
            handler.sendEmptyMessage(3);
        }
    }

    @Override // X.JMw
    public void C60(IHW ihw) {
        C2419Gcg c2419Gcg = this.A01;
        CountDownLatch countDownLatch = c2419Gcg.A0A;
        c2419Gcg.A0A = null;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        JOW jow = ((Ic7) c2419Gcg).A00;
        jow.getClass();
        JQ7 jq7 = (JQ7) jow.AdD(JQ7.A00);
        String str = (String) jow.Adn(JO2.A0G);
        if (str != null) {
            jq7.Cak(str);
        }
        if (7zR.A1X(jow.Adn(JO2.A0J))) {
            jq7.Cak(0Pz.A0T("OC-", jow.hashCode()));
        }
    }

    @Override // X.JMw
    public void C61(IHW ihw) {
        C2419Gcg c2419Gcg = this.A01;
        JQ9 jq9 = c2419Gcg.A04;
        if (jq9 != null) {
            HashMap A0u = AnonymousClass001.A0u();
            LinkedHashMap linkedHashMap = C2419Gcg.A0B;
            synchronized (linkedHashMap) {
                linkedHashMap.remove(c2419Gcg.toString());
                A0u.put("active_media_pipelines", linkedHashMap.values().toString());
            }
            A0u.put("frame_render_noop_counter", String.valueOf(c2419Gcg.A00));
            jq9.BaQ("media_pipeline_stop", "MediaGraphControllerImpl", A0u, GOn.A0B(ihw));
        }
        IHT iht = c2419Gcg.A06.A04.A07;
        11T.A0A(iht);
        iht.A00(c2419Gcg);
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [X.HDP, X.Gtv] */
    @Override // X.JMw
    public void C62(IHW ihw, Exception exc) {
        C2419Gcg c2419Gcg = this.A01;
        JQ9 jq9 = c2419Gcg.A04;
        if (jq9 != null) {
            C2419Gcg.A00(c2419Gcg, new HDP(31000, exc));
            if (!this.A00) {
                this.A00 = true;
                jq9.D10("MediaGraphControllerImpl:onMediaGraphRenderError", exc, true);
            }
        }
        JEB jeb = c2419Gcg.A02;
        if (jeb != null) {
            jeb.C5y(new HDP(31000, exc));
        }
    }

    @Override // X.JMw
    public void C63(IHW ihw, Long l) {
        C2419Gcg c2419Gcg = this.A01;
        JQ9 jq9 = c2419Gcg.A04;
        if (jq9 != null) {
            jq9.CbV(System.nanoTime(), true);
        }
        JEC jec = c2419Gcg.A08;
        if (jec != null) {
            jec.C67(l);
        }
        IHT iht = c2419Gcg.A06.A04.A07;
        11T.A0A(iht);
        iht.A01(c2419Gcg);
    }

    @Override // X.JMw
    public void C64(IHW ihw) {
        this.A01.A00++;
    }

    @Override // X.JMw
    public void C65(IHW ihw, Long l) {
        if (this.A01.A04 != null) {
            System.nanoTime();
        }
    }

    @Override // X.JMw
    public void C66(IHW ihw, Long l) {
        JQ9 jq9 = this.A01.A04;
        if (jq9 != null) {
            jq9.CbW(System.nanoTime());
        }
    }

    @Override // X.JMw
    public void C68(IHW ihw) {
        JQ9 jq9 = this.A01.A04;
        if (jq9 != null) {
            jq9.BaQ("media_pipeline_resume", "MediaGraphControllerImpl", null, GOn.A0B(ihw));
        }
    }
}
