package com.facebook.device.resourcemonitor;

import X.AbstractC01033pi;
import X.C27T;
import com.facebook.common.json.FbJsonDeserializer;

/* loaded from: MonitoredProcessDeserializer.class */
public class MonitoredProcessDeserializer extends FbJsonDeserializer {
    @Override // com.facebook.common.json.FbJsonDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        return MonitoredProcess.fromString(abstractC01033pi.A1Z());
    }
}
