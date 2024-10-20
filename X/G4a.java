package X;

/* loaded from: G4a.class */
public final class G4a implements Runnable {
    public static final String __redex_internal_original_name = "IntegrationMiddleware$1";
    public final /* synthetic */ GGj A00;
    public final /* synthetic */ Ft0 A01;
    public final /* synthetic */ Object A02;

    public G4a(GGj gGj, Ft0 ft0, Object obj) {
        this.A01 = ft0;
        this.A00 = gGj;
        this.A02 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.Fsz, java.lang.Object, X.3oI] */
    @Override // java.lang.Runnable
    public void run() {
        GGj gGj = this.A00;
        Object obj = this.A02;
        Ft0 ft0 = this.A01;
        ?? obj2 = new Object();
        obj2.A00 = ft0;
        gGj.BhS(obj2, obj);
    }
}
