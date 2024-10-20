package X;

/* renamed from: X.3h2, reason: invalid class name */
/* loaded from: 3h2.class */
public final class C3h2 implements Runnable {
    public static final String __redex_internal_original_name = "TimeoutManager$NotifyOnTimeout";
    public final String A00;
    public final /* synthetic */ 2Pf A01;

    public C3h2(2Pf r302, String str) {
        this.A01 = r302;
        this.A00 = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        2Pf r0 = this.A01;
        java.util.Map map = r0.A01;
        String str = this.A00;
        map.remove(str);
        2Pp r02 = r0.A00;
        if (r02 != null) {
            r02.CQe(str);
        }
    }
}
