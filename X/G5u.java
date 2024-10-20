package X;

/* loaded from: G5u.class */
public final /* synthetic */ class G5u implements Runnable {
    public static final String __redex_internal_original_name = "BloksTreeManager$$ExternalSyntheticLambda3";
    public final /* synthetic */ FxZ A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ Object A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public /* synthetic */ G5u(FxZ fxZ, Object obj, Object obj2, String str, String str2) {
        this.A00 = fxZ;
        this.A03 = str;
        this.A01 = obj;
        this.A04 = str2;
        this.A02 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FxZ fxZ = this.A00;
        String str = this.A03;
        fxZ.A0C(new EHd(this.A01, this.A02, str, this.A04));
    }
}
