package X;

import com.facebook.messaging.wearable.plugins.hera.impl.HeraMessengerPluginImplementation;
import com.facebook.wearable.common.comms.hera.host.applinks.LinkedDeviceManager;
import com.facebook.wearable.common.comms.hera.shared.intf.IHeraCallEngineStateListener;
import com.facebook.wearable.common.comms.rtc.hera.intf.INativeTransportProvider;
import java.util.Iterator;
import java.util.List;

/* loaded from: IkX.class */
public final class IkX implements IHeraCallEngineStateListener.ICallStateListener {
    public final /* synthetic */ HeraMessengerPluginImplementation A00;

    public IkX(HeraMessengerPluginImplementation heraMessengerPluginImplementation) {
        this.A00 = heraMessengerPluginImplementation;
    }

    @Override // com.facebook.wearable.common.comms.hera.shared.intf.IHeraCallEngineStateListener.ICallStateListener
    public Object onCallEnd(String str, 0DR r303) {
        HeraMessengerPluginImplementation heraMessengerPluginImplementation = this.A00;
        LinkedDeviceManager linkedDeviceManager = heraMessengerPluginImplementation.A05;
        if (linkedDeviceManager != null) {
            linkedDeviceManager.stop();
        }
        LinkedDeviceManager linkedDeviceManager2 = heraMessengerPluginImplementation.A05;
        if (linkedDeviceManager2 != null) {
            linkedDeviceManager2.removeOnDeviceDiscoveredListener(heraMessengerPluginImplementation.A0S);
        }
        LinkedDeviceManager linkedDeviceManager3 = heraMessengerPluginImplementation.A05;
        if (linkedDeviceManager3 != null) {
            linkedDeviceManager3.removeOnDeviceGoneListener(heraMessengerPluginImplementation.A0T);
        }
        List list = heraMessengerPluginImplementation.A0C;
        if (list == null) {
            11T.A0L("onDemandTransports");
            throw 0Q8.createAndThrow();
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((INativeTransportProvider) it.next()).stop();
        }
        heraMessengerPluginImplementation.A0A = null;
        return 04S.A00;
    }

    @Override // com.facebook.wearable.common.comms.hera.shared.intf.IHeraCallEngineStateListener.ICallStateListener
    public Object onCallStart(String str, 0DR r303) {
        HeraMessengerPluginImplementation heraMessengerPluginImplementation = this.A00;
        heraMessengerPluginImplementation.A0A = str;
        List list = heraMessengerPluginImplementation.A0C;
        if (list == null) {
            11T.A0L("onDemandTransports");
            throw 0Q8.createAndThrow();
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((INativeTransportProvider) it.next()).start();
        }
        LinkedDeviceManager linkedDeviceManager = heraMessengerPluginImplementation.A05;
        if (linkedDeviceManager != null) {
            linkedDeviceManager.start();
        }
        LinkedDeviceManager linkedDeviceManager2 = heraMessengerPluginImplementation.A05;
        if (linkedDeviceManager2 != null) {
            linkedDeviceManager2.addOnDeviceDiscoveredListener(heraMessengerPluginImplementation.A0S);
        }
        LinkedDeviceManager linkedDeviceManager3 = heraMessengerPluginImplementation.A05;
        if (linkedDeviceManager3 != null) {
            linkedDeviceManager3.addOnDeviceGoneListener(heraMessengerPluginImplementation.A0T);
        }
        return 04S.A00;
    }
}
