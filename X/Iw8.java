package X;

/* loaded from: Iw8.class */
public final class Iw8 implements Runnable {
    public static final String __redex_internal_original_name = "LifecycleAwareCallback$onSuccess$$inlined$onMainThread$1";
    public final /* synthetic */ InE A00;
    public final /* synthetic */ Object A01;

    public Iw8(InE inE, Object obj) {
        this.A01 = obj;
        this.A00 = inE;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.A01;
        JIM jim = this.A00.A00;
        if (obj == null) {
            if (jim != null) {
                jim.onFailure(AnonymousClass001.A0T(7zK.A00(22)));
            }
        } else if (jim != null) {
            jim.onSuccess(obj);
        }
    }
}
