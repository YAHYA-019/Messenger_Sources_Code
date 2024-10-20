package X;

import android.content.Context;
import android.os.SystemClock;
import com.facebook.acra.constants.ActionId;
import java.util.Iterator;
import java.util.List;

/* loaded from: L9t.class */
public final class L9t {
    public static volatile L9t A0F;
    public final Context A00;
    public final Context A01;
    public final K1a A02;
    public final L0g A03;
    public final MCv A04;
    public final K6j A05;
    public final K6c A06;
    public final K6d A07;
    public final K6e A08;
    public final Kq8 A09;
    public final K6a A0A;
    public final K6f A0B;
    public final K6g A0C;
    public final K6h A0D;
    public final K6b A0E;

    /* JADX WARN: Type inference failed for: r0v10, types: [X.K6n, X.LCw, X.K6g] */
    /* JADX WARN: Type inference failed for: r0v35, types: [X.K6n, X.LCw, X.K6b] */
    /* JADX WARN: Type inference failed for: r0v42, types: [X.K6n, X.LCw, X.K6e] */
    /* JADX WARN: Type inference failed for: r0v48, types: [X.K6n, X.LCw, X.K6a] */
    /* JADX WARN: Type inference failed for: r0v58, types: [X.K1a, X.K1o] */
    public L9t(Context context, Context context2) {
        AbstractC00481b7.A03(context, "Application context can't be null");
        AbstractC00481b7.A02(context2);
        this.A00 = context;
        this.A01 = context2;
        this.A04 = Lct.A00;
        this.A09 = new Kq8(this);
        ?? lCw = new LCw(this);
        lCw.A0H();
        lCw.A00 = true;
        this.A0C = lCw;
        A02(lCw);
        String str = Kc9.A00;
        StringBuilder A0l = AnonymousClass001.A0l(1BK.A02(str) + ActionId.APP_MAIN);
        A0l.append("Google Analytics ");
        A0l.append(str);
        LCw.A0A((LCw) lCw, AnonymousClass001.A0d(" is starting up. To enable debug logging on a device run:\n  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4", A0l), 4);
        K6h k6h = new K6h(this);
        k6h.A0H();
        ((K6n) k6h).A00 = true;
        this.A0D = k6h;
        ?? lCw2 = new LCw(this);
        lCw2.A0H();
        lCw2.A00 = true;
        this.A0E = lCw2;
        K6c k6c = new K6c(this);
        ?? lCw3 = new LCw(this);
        K6j k6j = new K6j(this);
        K6d k6d = new K6d(this);
        ?? lCw4 = new LCw(this);
        AbstractC00481b7.A02(context);
        if (L0g.A06 == null) {
            synchronized (L0g.class) {
                if (L0g.A06 == null) {
                    L0g.A06 = new L0g(context);
                }
            }
        }
        L0g l0g = L0g.A06;
        l0g.A00 = new Lrk(this);
        this.A03 = l0g;
        ?? k1o = new K1o(this);
        k1o.A00 = AnonymousClass001.A0v();
        lCw3.A0H();
        lCw3.A00 = true;
        this.A08 = lCw3;
        k6j.A0H();
        ((K6n) k6j).A00 = true;
        this.A05 = k6j;
        k6d.A0H();
        ((K6n) k6d).A00 = true;
        this.A07 = k6d;
        lCw4.A0H();
        lCw4.A00 = true;
        this.A0A = lCw4;
        K6f k6f = new K6f(this);
        k6f.A0H();
        ((K6n) k6f).A00 = true;
        this.A0B = k6f;
        k6c.A0H();
        ((K6n) k6c).A00 = true;
        this.A06 = k6c;
        K6b k6b = k1o.A01.A0E;
        A02(k6b);
        k6b.A0I();
        k6b.A0I();
        if (k6b.A04) {
            k6b.A0I();
            k1o.A02 = k6b.A05;
        }
        k6b.A0I();
        k1o.A01 = true;
        this.A02 = k1o;
        K6k k6k = k6c.A00;
        k6k.A0I();
        AbstractC00481b7.A09(!k6k.A01, "Analytics backend already started");
        k6k.A01 = true;
        A00(k6k).A02.submit(new Llw(k6k));
    }

    public static L0g A00(LCw lCw) {
        L0g l0g = lCw.A00.A03;
        AbstractC00481b7.A02(l0g);
        return l0g;
    }

    public static L9t A01(Context context) {
        AbstractC00481b7.A02(context);
        if (A0F == null) {
            synchronized (L9t.class) {
                if (A0F == null) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    AbstractC00481b7.A02(context);
                    Context applicationContext = context.getApplicationContext();
                    AbstractC00481b7.A03(applicationContext, "Application context can't be null");
                    L9t l9t = new L9t(applicationContext, applicationContext);
                    A0F = l9t;
                    synchronized (K1a.class) {
                        List list = K1a.A03;
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                            K1a.A03 = null;
                        }
                    }
                    long A0O = JQx.A0O(elapsedRealtime);
                    Long l = (Long) Kz3.A0A.A00;
                    if (A0O > l.longValue()) {
                        K6g k6g = l9t.A0C;
                        A02(k6g);
                        k6g.A0C(Long.valueOf(A0O), l, "Slow initialization (ms)");
                    }
                }
            }
        }
        return A0F;
    }

    public static void A02(K6n k6n) {
        AbstractC00481b7.A03(k6n, "Analytics service not created/initialized");
        AbstractC00481b7.A08(AnonymousClass001.A1N(k6n.A00 ? 1 : 0), "Analytics service not initialized");
    }
}
