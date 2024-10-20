package X;

/* loaded from: Ix4.class */
public final class Ix4 implements Runnable {
    public static final String __redex_internal_original_name = "DisplayManagerEventListener$handleOnDisplayChanged$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ IZ3 A01;

    public Ix4(IZ3 iz3, int i) {
        this.A01 = iz3;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JFm jFm = this.A01.A02;
        if (jFm != null) {
            jFm.onRotationChanged(this.A00);
        }
    }
}
