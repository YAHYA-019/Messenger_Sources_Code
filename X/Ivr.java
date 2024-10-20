package X;

/* loaded from: Ivr.class */
public final class Ivr implements Runnable {
    public static final String __redex_internal_original_name = "LivingRoomMetadataSubject$publish$2";
    public final /* synthetic */ Hfi A00;
    public final /* synthetic */ GgS A01;

    public Ivr(Hfi hfi, GgS ggS) {
        this.A01 = ggS;
        this.A00 = hfi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GgS ggS = this.A01;
        Hfi hfi = this.A00;
        GgS.A00(ggS, hfi);
        ggS.A01 = hfi;
    }
}
