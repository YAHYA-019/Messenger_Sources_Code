package X;

import com.facebook.ipc.composer.model.MinutiaeTag;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;

/* loaded from: GKr.class */
public interface GKr {
    public static final MinutiaeTag A00;
    public static final RWY A01 = RWY.A00;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.ROM, java.lang.Object] */
    static {
        ?? obj = new Object();
        ((ROM) obj).A00 = ConstantsKt.CAMERA_ID_FRONT;
        A00 = new MinutiaeTag((ROM) obj);
    }
}
