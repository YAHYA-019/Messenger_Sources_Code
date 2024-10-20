package X;

import com.facebook.fury.context.AcediaReqContexts;
import com.facebook.fury.props.ReadableProps;
import java.util.Iterator;

/* renamed from: X.02c, reason: invalid class name */
/* loaded from: 02c.class */
public final class C02c implements ReadableProps {
    public final int A00;
    public final /* synthetic */ AcediaReqContexts A01;

    public C02c(AcediaReqContexts acediaReqContexts, int i) {
        this.A01 = acediaReqContexts;
        this.A00 = i;
    }

    @Override // com.facebook.fury.props.ReadableProps
    public boolean getBoolean(int i, boolean z) {
        boolean nativeGetBooleanProp;
        nativeGetBooleanProp = this.A01.nativeGetBooleanProp(i, z, this.A00);
        return nativeGetBooleanProp;
    }

    @Override // com.facebook.fury.props.ReadableProps
    public int getInt(int i, int i2) {
        int nativeGetIntProp;
        nativeGetIntProp = this.A01.nativeGetIntProp(i, i2, this.A00);
        return nativeGetIntProp;
    }

    @Override // com.facebook.fury.props.ReadableProps
    public long getLong(int i, long j) {
        long nativeGetLongProp;
        nativeGetLongProp = this.A01.nativeGetLongProp(i, j, this.A00);
        return nativeGetLongProp;
    }

    @Override // com.facebook.fury.props.ReadableProps
    public Object getObject(int i) {
        return null;
    }

    @Override // com.facebook.fury.props.ReadableProps
    public String getString(int i) {
        String nativeGetStringProp;
        nativeGetStringProp = this.A01.nativeGetStringProp(i, this.A00);
        return nativeGetStringProp;
    }

    @Override // com.facebook.fury.props.ReadableProps
    public boolean isEmpty() {
        int nativeGetPropCount;
        nativeGetPropCount = this.A01.nativeGetPropCount(this.A00);
        boolean z = false;
        if (nativeGetPropCount <= 0) {
            z = true;
        }
        return z;
    }

    @Override // com.facebook.fury.props.ReadableProps
    public Iterator props() {
        return C0jn.A00;
    }

    @Override // com.facebook.fury.props.ReadableProps
    public int size() {
        int nativeGetPropCount;
        nativeGetPropCount = this.A01.nativeGetPropCount(this.A00);
        return nativeGetPropCount;
    }
}
