package X;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: IcA.class */
public final class IcA implements JOW, JOX {
    public final Context A03;
    public final Hxy A04;
    public final java.util.Map A01 = AnonymousClass001.A0u();
    public final ConcurrentHashMap A02 = new ConcurrentHashMap();
    public final I4V A05 = I4V.A00();
    public int A00 = 0;

    public IcA(Context context, Hxy hxy) {
        this.A03 = context.getApplicationContext();
        this.A04 = hxy;
    }

    private void A00() {
        JQ9 jq9;
        if (this.A00 == 0) {
            HJS hjs = JQ9.A00;
            if (BRE(hjs)) {
                jq9 = (JQ9) AdD(hjs);
                if (jq9 != null) {
                    jq9.BZh("init_controllers_started", "ComponentManager", null, GOn.A0B(this));
                }
            } else {
                jq9 = null;
            }
            this.A00 = 1;
            List list = this.A05.A00;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                IdA idA = (JG5) list.get(i);
                if (!idA.A01) {
                    idA.A01 = true;
                }
            }
            ConcurrentHashMap concurrentHashMap = this.A02;
            Iterator A13 = GOo.A13(concurrentHashMap);
            while (A13.hasNext()) {
                ((JMx) A13.next()).init();
            }
            Iterator A132 = GOo.A13(concurrentHashMap);
            while (A132.hasNext()) {
                ((JMx) A132.next()).BP0();
            }
            if (jq9 != null) {
                jq9.BZh("init_controllers_finished", "ComponentManager", null, GOn.A0B(this));
            }
        }
    }

    public void A01(JQC jqc, GuJ guJ) {
        this.A02.put(jqc, jqc);
        java.util.Map map = this.A01;
        synchronized (map) {
            java.util.Map map2 = (java.util.Map) map.get(guJ);
            if (map2 == null) {
                map2 = AnonymousClass001.A0u();
                map.put(guJ, map2);
            }
            1BK.A1O(jqc, map2, 0);
        }
    }

    public void A02(JG5 jg5) {
        I4V i4v = this.A05;
        if (i4v.A00.contains(jg5)) {
            return;
        }
        i4v.A02(jg5);
        IdA idA = (IdA) jg5;
        if (idA.A01) {
            return;
        }
        idA.A01 = true;
    }

    public void AAp(String str) {
        if (this.A00 == 0) {
            throw AnonymousClass001.A0N(str);
        }
    }

    public JQC AdC(GuJ guJ) {
        JQC jqc;
        synchronized (this) {
            A00();
            jqc = null;
            java.util.Map map = this.A01;
            synchronized (map) {
                try {
                    java.util.Map map2 = (java.util.Map) map.get(guJ);
                    if (map2 != null) {
                        jqc = (JQC) 7zN.A0r(map2, 0);
                    }
                } catch (Throwable th) {
                    th = th;
                }
            }
            if (jqc == null) {
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("Requested component is null for index: ");
                A0k.append(0);
                th = 1BL.A0h(guJ, " and componentClass: ", A0k);
                throw th;
            }
        }
        return jqc;
    }

    public JG5 AdD(HJS hjs) {
        List list = this.A05.A00;
        int size = list.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                throw AnonymousClass002.A0C(hjs, "Requested core component is null for key ", AnonymousClass001.A0k());
            }
            JG5 jg5 = (JG5) list.get(i2);
            if (jg5.Asg() == hjs) {
                return jg5;
            }
            i = i2 + 1;
        }
    }

    public Object Adm(HJO hjo) {
        throw AnonymousClass001.A0N("ConnectConfigurationKey not supported!");
    }

    public Object Adn(Hvf hvf) {
        return this.A04.A00.get(hvf);
    }

    public boolean BRD(GuJ guJ) {
        boolean containsKey;
        java.util.Map map = this.A01;
        synchronized (map) {
            containsKey = map.containsKey(guJ);
        }
        return containsKey;
    }

    public boolean BRE(HJS hjs) {
        List list = this.A05.A00;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                break;
            }
            if (((JG5) list.get(i2)).Asg() == hjs) {
                z = true;
                break;
            }
            i = i2 + 1;
        }
        return z;
    }

    public void destroy() {
        synchronized (this) {
            if (this.A00 != 0) {
                pause();
                Iterator A13 = GOo.A13(this.A02);
                while (A13.hasNext()) {
                    ((JQC) A13.next()).release();
                }
                this.A00 = 0;
            }
        }
    }

    public Context getContext() {
        return this.A03;
    }

    public void pause() {
        synchronized (this) {
            AAp("LiteCameraController must be initialized before invoking pause()");
            if (this.A00 == 2) {
                this.A00 = 1;
                Iterator A13 = GOo.A13(this.A02);
                while (A13.hasNext()) {
                    ((JQC) A13.next()).disconnect();
                }
            }
        }
    }

    public void resume() {
        JQ9 jq9;
        synchronized (this) {
            A00();
            AAp("LiteCameraController must be initialized before invoking resume()");
            if (this.A00 == 1) {
                HJS hjs = JQ9.A00;
                if (BRE(hjs)) {
                    jq9 = (JQ9) AdD(hjs);
                    if (jq9 != null) {
                        jq9.BZh("connect_controllers_started", "ComponentManager", null, GOn.A0B(this));
                    }
                } else {
                    jq9 = null;
                }
                this.A00 = 2;
                ConcurrentHashMap concurrentHashMap = this.A02;
                Iterator A13 = GOo.A13(concurrentHashMap);
                while (A13.hasNext()) {
                    ((JQC) A13.next()).CY8();
                }
                Iterator A132 = GOo.A13(concurrentHashMap);
                while (A132.hasNext()) {
                    ((JQC) A132.next()).connect();
                }
                if (jq9 != null) {
                    jq9.BZh("connect_controllers_finished", "ComponentManager", null, GOn.A0B(this));
                }
            }
        }
    }
}
