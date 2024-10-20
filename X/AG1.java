package X;

import com.facebook.messaging.memories.model.MemoryViewModel;

/* loaded from: AG1.class */
public final class AG1 implements Runnable {
    public static final String __redex_internal_original_name = "MemoryViewerListenerImpl$onHideMenuClick$1$memoryViewerHideBottomSheetListener$1$onMemoryHide$1";
    public final /* synthetic */ MemoryViewModel A00;
    public final /* synthetic */ 9V1 A01;
    public final /* synthetic */ 9lM A02;

    public AG1(MemoryViewModel memoryViewModel, 9V1 r303, 9lM r304) {
        this.A01 = r303;
        this.A02 = r304;
        this.A00 = memoryViewModel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A00.invoke();
        C9mY.A02(this.A02.A05, this.A00, null, 81, false);
    }
}
