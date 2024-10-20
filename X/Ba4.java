package X;

import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;

/* loaded from: Ba4.class */
public abstract class Ba4 {
    public static final C84j A02 = new C84j("notification_received", ConstantsKt.CAMERA_ID_FRONT, 4);
    public static final C84j A00 = new C84j("mailbox_created", ConstantsKt.CAMERA_ID_BACK, 4);
    public static final C84j A04 = new C84j("notification_synced", "14", 4);
    public static final C84j A03 = new C84j("notification_rendering", "15", 4);
    public static final C84j A01 = new C84j("badging", "17", 4);

    static {
        new C84j("notification_rendering_chat_heads", "40", 4);
        new C84j("notification_received_chat_heads", "41", 4);
        new C84j("notification_received_chat_bubbles", "42", 4);
    }
}
