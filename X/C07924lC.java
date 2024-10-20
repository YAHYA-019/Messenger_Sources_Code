package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.msys.cql.dataclasses.ReadOnlyMessageMetadataDataclassAdapter;

/* renamed from: X.4lC, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4lC.class */
public final class C07924lC extends 1qX implements 4lD {
    public ReadOnlyMessageMetadataDataclassAdapter A00;

    public String Ax2(int i) {
        return ((1qX) this).mResultSet.getString(i, 16);
    }

    /* JADX WARN: Type inference failed for: r303v2, types: [com.facebook.msys.cql.dataclasses.ReadOnlyMessageMetadataDataclassAdapter, X.49J] */
    public 5oV B6D(final int i) {
        ReadOnlyMessageMetadataDataclassAdapter readOnlyMessageMetadataDataclassAdapter = this.A00;
        ReadOnlyMessageMetadataDataclassAdapter readOnlyMessageMetadataDataclassAdapter2 = readOnlyMessageMetadataDataclassAdapter;
        if (readOnlyMessageMetadataDataclassAdapter == null) {
            ?? r303 = new 49J();
            this.A00 = r303;
            readOnlyMessageMetadataDataclassAdapter2 = r303;
        }
        return (5oV) readOnlyMessageMetadataDataclassAdapter2.getNullableAdaptedObject(i, new C00m() { // from class: X.5ph
            @Override // X.C00m
            public final Object invoke() {
                C07924lC c07924lC = C07924lC.this;
                return ((1qX) c07924lC).mResultSet.getString(i, ActionId.RTMP_STREAM_PREPARED);
            }
        });
    }
}
