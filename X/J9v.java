package X;

import android.media.AudioManager;
import kotlin.jvm.functions.Function1;

/* loaded from: J9v.class */
public final class J9v extends C00q implements Function1 {
    public final /* synthetic */ IH9 $listener;
    public final /* synthetic */ Gyl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J9v(IH9 ih9, Gyl gyl) {
        super(1);
        this.this$0 = gyl;
        this.$listener = ih9;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        try {
            ((If6) this.this$0).A02.removeOnCommunicationDeviceChangedListener((AudioManager.OnCommunicationDeviceChangedListener) this.$listener);
        } catch (IllegalArgumentException unused) {
            ((If6) this.this$0).A05.DAI("RtcAudioOutputManagerImplV2", "selectDevice: tried to remove listener before it was added", AnonymousClass001.A1Z());
        }
        return 04S.A00;
    }
}
