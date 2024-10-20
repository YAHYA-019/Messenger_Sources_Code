package X;

/* renamed from: X.5ne, reason: invalid class name */
/* loaded from: 5ne.class */
public final class C5ne implements Runnable {
    public static final String __redex_internal_original_name = "DataCache$1";
    public final /* synthetic */ 5Ti A00;
    public final /* synthetic */ 5TY A01;
    public final /* synthetic */ String A02;

    public C5ne(5Ti r302, 5TY r303, String str) {
        this.A00 = r302;
        this.A02 = str;
        this.A01 = r303;
    }

    @Override // java.lang.Runnable
    public void run() {
        int intValue;
        5Tt A00;
        5Ti r0 = this.A00;
        5Ti r02 = 5Ti.A05;
        synchronized (r0.A02) {
            5Ts r03 = 5Ts.A03;
            String str = this.A02;
            synchronized (r03.A02) {
                C04r c04r = r03.A00;
                intValue = ((Integer) c04r.getOrDefault(str, 0)).intValue() - 1;
                if (intValue == 0) {
                    c04r.remove(str);
                } else if (intValue >= 1) {
                    c04r.put(str, Integer.valueOf(intValue));
                }
            }
            A00 = intValue == 0 ? 5Ti.A00(r0, str) : null;
        }
        if (A00 != null) {
            r0.A04.BsX(this.A01, A00.A01, A00.A00);
            A00.A03.destroy();
        }
    }
}
