package com.facebook.wearable.common.comms.hera.shared.callmanager;

import X.04S;
import X.0DO;
import X.0DR;
import X.0Dt;
import X.AnonymousClass001;
import com.facebook.wearable.common.comms.hera.shared.intf.IHeraCallEngineStateListener;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* loaded from: HeraCallManager$handleDeviceStateChanges$2.class */
public final class HeraCallManager$handleDeviceStateChanges$2 extends 0DO implements Function2 {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ HeraCallManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeraCallManager$handleDeviceStateChanges$2(HeraCallManager heraCallManager, 0DR r303) {
        super(2, r303);
        this.this$0 = heraCallManager;
    }

    public final 0DR create(Object obj, 0DR r303) {
        HeraCallManager$handleDeviceStateChanges$2 heraCallManager$handleDeviceStateChanges$2 = new HeraCallManager$handleDeviceStateChanges$2(this.this$0, r303);
        heraCallManager$handleDeviceStateChanges$2.L$0 = obj;
        return heraCallManager$handleDeviceStateChanges$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List list, 0DR r303) {
        return create(list, r303).invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0M();
        }
        0Dt.A00(obj);
        List list = (List) this.L$0;
        Iterator it = this.this$0.deviceStateEventListeners.iterator();
        while (it.hasNext()) {
            ((IHeraCallEngineStateListener.IDeviceStateListener) it.next()).onDeviceStateChanged(list);
        }
        return 04S.A00;
    }
}
