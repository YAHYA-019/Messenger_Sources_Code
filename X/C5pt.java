package X;

import com.facebook.msys.cql.dataclasses.ReadOnlyMessageMetadataDataclassAdapter;
import com.facebook.msys.cql.dataclasses.XmaContentRefDataclassAdapter;
import com.facebook.msys.cql.dataclasses.XmaDataclassAdapter;

/* renamed from: X.5pt, reason: invalid class name */
/* loaded from: 5pt.class */
public final class C5pt extends 1qX implements C5pu {
    public ReadOnlyMessageMetadataDataclassAdapter A00;
    public XmaContentRefDataclassAdapter A01;
    public XmaDataclassAdapter A02;

    @Override // X.C5pu
    public int AXc(int i) {
        return ((1qX) this).mResultSet.getInteger(i, 9);
    }

    /* JADX WARN: Type inference failed for: r303v2, types: [com.facebook.msys.cql.dataclasses.XmaDataclassAdapter, X.49J] */
    @Override // X.C5pu
    public 6AO BLI(int i) {
        XmaDataclassAdapter xmaDataclassAdapter = this.A02;
        XmaDataclassAdapter xmaDataclassAdapter2 = xmaDataclassAdapter;
        if (xmaDataclassAdapter == null) {
            ?? r303 = new 49J();
            this.A02 = r303;
            xmaDataclassAdapter2 = r303;
        }
        return (6AO) xmaDataclassAdapter2.getNullableAdaptedObject(0, new DBf(this, 3));
    }
}
