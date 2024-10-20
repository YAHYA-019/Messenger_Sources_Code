package X;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: J25.class */
public final class J25 implements Runnable {
    public static final String __redex_internal_original_name = "MediaGraphIOInput$1";
    public final /* synthetic */ I9U A00;
    public final /* synthetic */ Hmm A01;
    public final /* synthetic */ Icg A02;
    public final /* synthetic */ String A03;

    public J25(I9U i9u, Hmm hmm, Icg icg, String str) {
        this.A01 = hmm;
        this.A00 = i9u;
        this.A03 = str;
        this.A02 = icg;
    }

    @Override // java.lang.Runnable
    public void run() {
        Hmm hmm = this.A01;
        I9U i9u = this.A00;
        String str = this.A03;
        Icg icg = this.A02;
        ConcurrentHashMap concurrentHashMap = hmm.A00;
        Object obj = concurrentHashMap.get(str);
        if (obj instanceof JLE) {
            i9u.A04((JLE) obj);
        }
        if (icg instanceof JLE) {
            i9u.A03(icg);
        }
        if (icg == null) {
            concurrentHashMap.remove(str);
        } else {
            concurrentHashMap.put(str, icg);
        }
    }
}
