package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.base.Objects;
import com.google.common.collect.ArrayTable;
import com.google.common.collect.Tables$ImmutableCell;

/* loaded from: Kuf.class */
public abstract class Kuf {
    public Object A00() {
        if (this instanceof Tables$ImmutableCell) {
            return ((Tables$ImmutableCell) this).columnKey;
        }
        KB1 kb1 = (KB1) this;
        return kb1.A02.columnList.get(kb1.A00);
    }

    public Object A01() {
        if (this instanceof Tables$ImmutableCell) {
            return ((Tables$ImmutableCell) this).rowKey;
        }
        KB1 kb1 = (KB1) this;
        return kb1.A02.rowList.get(kb1.A01);
    }

    public Object A02() {
        if (this instanceof Tables$ImmutableCell) {
            return ((Tables$ImmutableCell) this).value;
        }
        KB1 kb1 = (KB1) this;
        ArrayTable arrayTable = kb1.A02;
        int i = kb1.A01;
        int i2 = kb1.A00;
        return L5M.A00(arrayTable, i, i2)[i2];
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof Kuf)) {
                return false;
            }
            Kuf kuf = (Kuf) obj;
            if (!Objects.equal(A01(), kuf.A01()) || !Objects.equal(A00(), kuf.A00()) || !Objects.equal(A02(), kuf.A02())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 4YU.A04(A01(), A00(), A02());
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("(");
        A0k.append(A01());
        A0k.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        A0k.append(A00());
        A0k.append(")=");
        return AnonymousClass001.A0a(A02(), A0k);
    }
}
