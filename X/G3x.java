package X;

import com.facebook.acra.constants.ActionId;

/* loaded from: G3x.class */
public final class G3x implements Runnable {
    public static final String __redex_internal_original_name = "NTAction$2";
    public final /* synthetic */ int A00;
    public final /* synthetic */ FIJ A01;
    public final /* synthetic */ 50G A02;

    public G3x(FIJ fij, 50G r303, int i) {
        this.A01 = fij;
        this.A02 = r303;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A02.AR6(ActionId.RTMP_PACKET_RECEIVED, this.A00);
    }
}
