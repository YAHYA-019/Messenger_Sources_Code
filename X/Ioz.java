package X;

import com.facebook.common.draggableview.DraggableViewContainer;

/* loaded from: Ioz.class */
public final class Ioz implements Runnable {
    public static final String __redex_internal_original_name = "DraggableViewContainer$update$2";
    public final /* synthetic */ DraggableViewContainer A00;

    public Ioz(DraggableViewContainer draggableViewContainer) {
        this.A00 = draggableViewContainer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DraggableViewContainer draggableViewContainer = this.A00;
        if (draggableViewContainer.A0D) {
            draggableViewContainer.A0D = false;
            DraggableViewContainer.A07(draggableViewContainer, true);
        }
    }
}
