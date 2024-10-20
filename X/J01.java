package X;

import com.facebook.locationsharing.core.models.LiveLocationSession;

/* loaded from: J01.class */
public final class J01 implements Runnable {
    public static final String __redex_internal_original_name = "LiveLocationSessionRepositoryProxy$3";
    public final /* synthetic */ JOe A00;
    public final /* synthetic */ 5fR A01;
    public final /* synthetic */ LiveLocationSession A02;

    public J01(JOe jOe, 5fR r303, LiveLocationSession liveLocationSession) {
        this.A01 = r303;
        this.A02 = liveLocationSession;
        this.A00 = jOe;
    }

    @Override // java.lang.Runnable
    public void run() {
        5fR r0 = this.A01;
        r0.A00.D8W(new RlR(this.A00, r0.A01), this.A02);
    }
}
