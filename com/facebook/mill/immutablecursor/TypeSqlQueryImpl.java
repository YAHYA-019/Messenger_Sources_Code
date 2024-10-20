package com.facebook.mill.immutablecursor;

import X.04S;
import X.0Q8;
import X.11T;
import X.KWt;
import X.KxT;
import X.KxU;
import com.facebook.mill.runtime.TypeSqlQuery;
import com.facebook.simplejni.NativeHolder;

/* loaded from: TypeSqlQueryImpl.class */
public final class TypeSqlQueryImpl implements TypeSqlQuery {
    public static final KWt Companion = new Object();
    public static final int SQLITE_BLOB = 4;
    public static final int SQLITE_FLOAT = 2;
    public static final int SQLITE_INTEGER = 1;
    public static final int SQLITE_NULL = 5;
    public static final int SQLITE_TEXT = 3;
    public byte[] columnTypes;
    public NativeHolder mNativeHolder;
    public int size;

    public TypeSqlQueryImpl(NativeHolder nativeHolder) {
        11T.A0F(nativeHolder, 1);
        this.mNativeHolder = nativeHolder;
        KxU.A00();
        KxT.A00();
        this.size = -1;
    }

    private final native int getSize();

    private final native boolean isNull(int i);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public native void close();

    public Object getAny(int i) {
        int type = getType(i);
        return type != 1 ? type != 2 ? type != 4 ? type != 5 ? getString(i) : 04S.A00 : getBlob(i) : Float.valueOf(getFloat(i)) : Integer.valueOf(getInt(i));
    }

    public native byte[] getBlob(int i);

    public native boolean getBoolean(int i);

    public byte[] getColumnTypes() {
        byte[] bArr = this.columnTypes;
        if (bArr != null) {
            return bArr;
        }
        11T.A0L("columnTypes");
        throw 0Q8.createAndThrow();
    }

    public int getCount() {
        int i = this.size;
        if (i == -1) {
            i = getSize();
            this.size = i;
        }
        return i;
    }

    public native double getDouble(int i);

    public native float getFloat(int i);

    public native int getInt(int i);

    public native long getLong(int i);

    public Object getNullableAny(int i) {
        if (isNull(i)) {
            return null;
        }
        return getAny(i);
    }

    public byte[] getNullableBlob(int i) {
        if (isNull(i)) {
            return null;
        }
        return getBlob(i);
    }

    public Boolean getNullableBoolean(int i) {
        if (isNull(i)) {
            return null;
        }
        return Boolean.valueOf(getBoolean(i));
    }

    public Double getNullableDouble(int i) {
        if (isNull(i)) {
            return null;
        }
        return Double.valueOf(getDouble(i));
    }

    public Float getNullableFloat(int i) {
        if (isNull(i)) {
            return null;
        }
        return Float.valueOf(getFloat(i));
    }

    public Integer getNullableInt(int i) {
        if (isNull(i)) {
            return null;
        }
        return Integer.valueOf(getInt(i));
    }

    public Long getNullableLong(int i) {
        if (isNull(i)) {
            return null;
        }
        return Long.valueOf(getLong(i));
    }

    public String getNullableString(int i) {
        if (isNull(i)) {
            return null;
        }
        return getString(i);
    }

    public native String getString(int i);

    public native int getType(int i);

    public native boolean next();

    public native void resetPosition();

    @Override // com.facebook.mill.runtime.TypeSqlQuery
    public void setColumnTypes(byte[] bArr) {
        11T.A0F(bArr, 0);
        this.columnTypes = bArr;
    }
}
