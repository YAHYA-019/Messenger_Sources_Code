package com.facebook.wearable.common.comms.hera.host.applinks;

import X.04S;
import X.0CU;
import X.0Pz;
import X.0fH;
import X.11T;
import X.1BK;
import X.AnonymousClass001;
import X.C00q;
import X.JR1;
import X.KtJ;
import X.Ktr;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.functions.Function1;

/* loaded from: LinkedDeviceManager$makeLam$1$5.class */
public final class LinkedDeviceManager$makeLam$1$5 extends C00q implements Function1 {
    public final /* synthetic */ LinkedDeviceManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkedDeviceManager$makeLam$1$5(LinkedDeviceManager linkedDeviceManager) {
        super(1);
        this.this$0 = linkedDeviceManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List) obj);
        return 04S.A00;
    }

    public final void invoke(List list) {
        int i;
        11T.A0F(list, 0);
        0fH.A0j(LinkedDeviceManager.TAG, 0Pz.A0d("Found ", " device config(s).", list.size()));
        LinkedDeviceManager linkedDeviceManager = this.this$0;
        synchronized (linkedDeviceManager.linkedDeviceConfigs) {
            LinkedHashMap A1C = 1BK.A1C();
            A1C.putAll(linkedDeviceManager.linkedDeviceConfigs);
            linkedDeviceManager.linkedDeviceConfigs.clear();
            Iterator it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                Ktr ktr = (Ktr) it.next();
                UUID uuid = ktr.A0B;
                if (0CU.A0O(11T.A02(uuid))) {
                    0fH.A0n(LinkedDeviceManager.TAG, AnonymousClass001.A0d(" due to missing serviceUUID.", JR1.A11(ktr)));
                } else {
                    String str = ktr.A01;
                    if (str == null || 0CU.A0O(str)) {
                        0fH.A0n(LinkedDeviceManager.TAG, AnonymousClass001.A0d(" due to missing BtcAddress.", JR1.A11(ktr)));
                    } else {
                        KtJ ktJ = ktr.A00;
                        if (ktJ == null) {
                            0fH.A0n(LinkedDeviceManager.TAG, AnonymousClass001.A0d(" due to missing linkSecurity.", JR1.A11(ktr)));
                        } else {
                            String str2 = ktr.A05;
                            if (str2 == null || 0CU.A0O(str2)) {
                                0fH.A0n(LinkedDeviceManager.TAG, AnonymousClass001.A0d(" due to missing deviceName.", JR1.A11(ktr)));
                            } else {
                                DeviceType deviceType = DeviceTypeKt.getDeviceType(ktr);
                                if (deviceType == null || !linkedDeviceManager.supportedDevices.contains(deviceType)) {
                                    0fH.A0n(LinkedDeviceManager.TAG, AnonymousClass001.A0d(" due to not being supported.", JR1.A11(ktr)));
                                } else {
                                    linkedDeviceManager.linkedDeviceConfigs.put(str, new AppLinksDeviceConfig(uuid, ktJ, str, ktr.A07, ktr.A06, ktr.A09, ktr.A03, ktr.A04, ktr.A02, str2, ktr.A08, ktr.A0A, deviceType));
                                    A1C.remove(str);
                                }
                            }
                        }
                    }
                }
                i++;
            }
            linkedDeviceManager.linkedDeviceConfigsReceived = true;
            linkedDeviceManager.announceLinkedDeviceConfigs(linkedDeviceManager.onDeviceDiscoveredListeners);
            linkedDeviceManager.announceGoneDeviceConfigs(linkedDeviceManager.onDeviceGoneListeners, A1C);
        }
        this.this$0.debugStat = 0Pz.A0b("Device Config Received (", ", skipped: ", ')', list.size(), i);
    }
}
