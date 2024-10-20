package X;

/* loaded from: Ivq.class */
public final class Ivq implements Runnable {
    public static final String __redex_internal_original_name = "LivingRoomMetadataSubject$addListener$1";
    public final /* synthetic */ JI9 A00;
    public final /* synthetic */ GgS A01;

    public Ivq(JI9 ji9, GgS ggS) {
        this.A01 = ggS;
        this.A00 = ji9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Hfi hfi = this.A01.A01;
        if (hfi != null) {
            this.A00.BlV(null, hfi);
        }
    }
}
