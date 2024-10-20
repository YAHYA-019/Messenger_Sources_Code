package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.msys.cql.dataclasses.ReadOnlyMessageMetadataDataclassAdapter;

/* renamed from: X.5u3, reason: invalid class name */
/* loaded from: 5u3.class */
public final class C5u3 extends 1qX implements 4lD {
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
        return (5oV) readOnlyMessageMetadataDataclassAdapter2.getNullableAdaptedObject(i, new C00m() { // from class: X.AHo
            @Override // X.C00m
            public final Object invoke() {
                C5u3 c5u3 = C5u3.this;
                return ((1qX) c5u3).mResultSet.getString(i, ActionId.RTMP_STREAM_PREPARED);
            }
        });
    }
}
