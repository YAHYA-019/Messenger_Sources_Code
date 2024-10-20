package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Map;

/* renamed from: X.4d3, reason: invalid class name */
/* loaded from: 4d3.class */
public final class C4d3 implements Map.Entry {
    public Object A00;
    public final Object A01;
    public final /* synthetic */ 1kN A02;

    public C4d3(1kN r302, Object obj, Object obj2) {
        this.A02 = r302;
        this.A01 = obj;
        this.A00 = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (this.A01.equals(entry.getKey()) && this.A00.equals(entry.getValue())) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.A01;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.A00;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return this.A01.hashCode() ^ this.A00.hashCode();
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        Object put = this.A02.put(this.A01, obj);
        this.A00 = obj;
        return put;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(getKey());
        A0k.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
        return AnonymousClass001.A0a(getValue(), A0k);
    }
}
