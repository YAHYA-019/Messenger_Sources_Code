package X;

/* loaded from: G38.class */
public final class G38 implements Runnable {
    public static final String __redex_internal_original_name = "VideoPrefetchFb4aMarkerStateHelper$markerStartInternal$2";
    public final /* synthetic */ int A00;
    public final /* synthetic */ 6Co A01;

    public G38(6Co r302, int i) {
        this.A01 = r302;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        6Co r0 = this.A01;
        java.util.Map map = r0.A03;
        int i = this.A00;
        if (map.containsKey(Integer.valueOf(i))) {
            6Co.A00(r0, i, r0.A00.now(), (short) 113);
        }
    }
}
