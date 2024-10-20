package com.facebook.wearable.common.comms.hera.shared.callmanager;

import X.04S;
import X.0DO;
import X.0DR;
import X.0Dt;
import X.0QD;
import X.AnonymousClass001;
import X.C0Bd;
import X.C0ty;
import com.facebook.wearable.common.comms.hera.shared.intf.IHeraCallEngineStateListener;
import java.util.Iterator;
import java.util.List;

/* loaded from: HeraCallManager$handlePeerVideoStateChanges$2.class */
public final class HeraCallManager$handlePeerVideoStateChanges$2 extends 0DO implements C0Bd {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ HeraCallManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeraCallManager$handlePeerVideoStateChanges$2(HeraCallManager heraCallManager, 0DR r303) {
        super(3, r303);
        this.this$0 = heraCallManager;
    }

    @Override // X.C0Bd
    public final Object invoke(List list, List list2, 0DR r304) {
        HeraCallManager$handlePeerVideoStateChanges$2 heraCallManager$handlePeerVideoStateChanges$2 = new HeraCallManager$handlePeerVideoStateChanges$2(this.this$0, r304);
        heraCallManager$handlePeerVideoStateChanges$2.L$0 = list;
        heraCallManager$handlePeerVideoStateChanges$2.L$1 = list2;
        return heraCallManager$handlePeerVideoStateChanges$2.invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0M();
        }
        0Dt.A00(obj);
        Iterable iterable = (Iterable) this.L$0;
        Iterable iterable2 = (Iterable) this.L$1;
        if (iterable == null) {
            iterable = C0ty.A00;
        }
        Iterable iterable3 = iterable2 == null ? C0ty.A00 : iterable2;
        List A0Z = 0QD.A0Z(iterable3, iterable);
        HeraCallManager heraCallManager = this.this$0;
        Iterator it = A0Z.iterator();
        while (it.hasNext()) {
            String A0i = AnonymousClass001.A0i(it);
            Iterator it2 = heraCallManager.peerVideoStreamEventListeners.iterator();
            while (it2.hasNext()) {
                ((IHeraCallEngineStateListener.IPeerVideoStreamListener) it2.next()).onPeerVideoStarted(A0i);
            }
        }
        List A0Z2 = 0QD.A0Z(iterable, iterable3);
        HeraCallManager heraCallManager2 = this.this$0;
        Iterator it3 = A0Z2.iterator();
        while (it3.hasNext()) {
            String A0i2 = AnonymousClass001.A0i(it3);
            Iterator it4 = heraCallManager2.peerVideoStreamEventListeners.iterator();
            while (it4.hasNext()) {
                ((IHeraCallEngineStateListener.IPeerVideoStreamListener) it4.next()).onPeerVideoStopped(A0i2);
            }
        }
        return iterable2;
    }
}
