package X;

import com.facebook.common.draggableview.DraggableViewContainer;

/* loaded from: GY1.class */
public final class GY1 extends LRX {
    public final /* synthetic */ DraggableViewContainer A00;

    public GY1(DraggableViewContainer draggableViewContainer) {
        this.A00 = draggableViewContainer;
    }

    public void A01(Lij lij) {
        DraggableViewContainer draggableViewContainer = this.A00;
        0fH.A0j("DraggableViewContainer", 0Pz.A0T("ChangeBounds transition ended or cancelled, pendingTransitionCount: ", draggableViewContainer.A06));
        draggableViewContainer.A06--;
        DraggableViewContainer.A07(draggableViewContainer, false);
    }

    public void A02(Lij lij) {
        DraggableViewContainer draggableViewContainer = this.A00;
        int i = draggableViewContainer.A06 + 1;
        draggableViewContainer.A06 = i;
        0fH.A0j("DraggableViewContainer", 0Pz.A0T("Beginning ChangeBounds transition, pendingTransitionCount: ", i));
    }

    public void CRm(Lij lij) {
        DraggableViewContainer draggableViewContainer = this.A00;
        0fH.A0j("DraggableViewContainer", 0Pz.A0T("ChangeBounds transition ended or cancelled, pendingTransitionCount: ", draggableViewContainer.A06));
        draggableViewContainer.A06--;
        DraggableViewContainer.A07(draggableViewContainer, false);
    }
}
