package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Map;

/* renamed from: X.6ey, reason: invalid class name */
/* loaded from: 6ey.class */
public final class C6ey implements Map.Entry {
    public int A00;
    public C6ey A01;
    public C6ey A02;
    public C6ey A03;
    public C6ey A04;
    public C6ey A05;
    public Object A06;
    public final Object A07;
    public final boolean A08;

    public C6ey(C6ey c6ey, C6ey c6ey2, C6ey c6ey3, Object obj, boolean z) {
        this.A03 = c6ey;
        this.A07 = obj;
        this.A08 = z;
        this.A00 = 1;
        this.A02 = c6ey2;
        this.A04 = c6ey3;
        c6ey3.A02 = this;
        c6ey2.A04 = this;
    }

    public C6ey(boolean z) {
        this.A07 = null;
        this.A08 = z;
        this.A04 = this;
        this.A02 = this;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.A07;
            Object key = entry.getKey();
            if (obj2 != null ? obj2.equals(key) : key == null) {
                Object obj3 = this.A06;
                Object value = entry.getValue();
                if (obj3 != null ? obj3.equals(value) : value == null) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.A07;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.A06;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return AnonymousClass001.A02(this.A07) ^ 4YU.A03(this.A06);
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        if (obj == null && !this.A08) {
            throw AnonymousClass001.A0Q("value == null");
        }
        Object obj2 = this.A06;
        this.A06 = obj;
        return obj2;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(this.A07);
        A0k.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
        return AnonymousClass001.A0a(this.A06, A0k);
    }
}
