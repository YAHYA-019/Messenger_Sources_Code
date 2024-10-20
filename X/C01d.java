package X;

import com.facebook.fury.context.ReqContext;
import com.facebook.fury.context.ReqContextsPlugin;
import com.facebook.fury.props.ReadableProps;
import com.facebook.fury.props.ReqChainProps;
import com.facebook.fury.props.ReqContextProps;
import java.util.Iterator;

/* renamed from: X.01d, reason: invalid class name */
/* loaded from: 01d.class */
public final class C01d implements ReqContext {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final ReqContextsPlugin A06;
    public final ReqChainProps A07;
    public final ReqContextProps A08;
    public final String A09;

    public C01d(ReqContextsPlugin reqContextsPlugin, ReqChainProps reqChainProps, ReqContextProps reqContextProps, String str, int i, int i2, int i3, int i4, long j, long j2) {
        this.A09 = str;
        this.A05 = j;
        this.A02 = i;
        this.A04 = j2;
        this.A00 = i2;
        this.A01 = i3;
        this.A07 = reqChainProps;
        this.A08 = reqContextProps;
        this.A03 = i4;
        this.A06 = reqContextsPlugin;
    }

    @Override // com.facebook.fury.context.ReqContext, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.A06.deactivate(this);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C01d c01d = (C01d) obj;
            if (this.A04 != c01d.A04) {
                return false;
            }
            if (this.A00 != c01d.A00) {
                z = false;
            }
        }
        return z;
    }

    @Override // com.facebook.fury.context.ReqContext
    public boolean getBoolean(int i, boolean z, int i2) {
        ReadableProps readableProps;
        boolean z2;
        ReadableProps readableProps2;
        if (i2 == 0) {
            readableProps = this.A07;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    z2 = this.A08.getBoolean(i, z);
                    if (z2 == z) {
                        readableProps2 = this.A07;
                        z2 = readableProps2.getBoolean(i, z);
                    }
                    return z2;
                }
                if (i2 != 3) {
                    return z;
                }
                z2 = this.A07.getBoolean(i, z);
                if (z2 == z) {
                    readableProps2 = this.A08;
                    z2 = readableProps2.getBoolean(i, z);
                }
                return z2;
            }
            readableProps = this.A08;
        }
        return readableProps.getBoolean(i, z);
    }

    @Override // com.facebook.fury.context.ReqContext
    public int getCurrentSeqId() {
        return this.A00;
    }

    @Override // com.facebook.fury.context.ReqContext
    public long getCurrentTid() {
        return this.A04;
    }

    @Override // com.facebook.fury.context.ReqContext
    public int getInt(int i, int i2, int i3) {
        ReadableProps readableProps;
        int i4;
        ReadableProps readableProps2;
        if (i3 == 0) {
            readableProps = this.A07;
        } else {
            if (i3 != 1) {
                if (i3 == 2) {
                    i4 = this.A08.getInt(i, i2);
                    if (i4 == i2) {
                        readableProps2 = this.A07;
                        i4 = readableProps2.getInt(i, i2);
                    }
                    return i4;
                }
                if (i3 != 3) {
                    return i2;
                }
                i4 = this.A07.getInt(i, i2);
                if (i4 == i2) {
                    readableProps2 = this.A08;
                    i4 = readableProps2.getInt(i, i2);
                }
                return i4;
            }
            readableProps = this.A08;
        }
        return readableProps.getInt(i, i2);
    }

    @Override // com.facebook.fury.context.ReqContext
    public long getLong(int i, long j, int i2) {
        ReadableProps readableProps;
        long j2;
        ReadableProps readableProps2;
        if (i2 == 0) {
            readableProps = this.A07;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    j2 = this.A08.getLong(i, j);
                    if (j2 == j) {
                        readableProps2 = this.A07;
                        j2 = readableProps2.getLong(i, j);
                    }
                    return j2;
                }
                if (i2 != 3) {
                    return j;
                }
                j2 = this.A07.getLong(i, j);
                if (j2 == j) {
                    readableProps2 = this.A08;
                    j2 = readableProps2.getLong(i, j);
                }
                return j2;
            }
            readableProps = this.A08;
        }
        return readableProps.getLong(i, j);
    }

    @Override // com.facebook.fury.context.ReqContext
    public Object getObject(int i, int i2) {
        ReadableProps readableProps;
        Object object;
        ReadableProps readableProps2;
        if (i2 == 0) {
            readableProps = this.A07;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    object = this.A08.getObject(i);
                    if (object == null) {
                        readableProps2 = this.A07;
                        return readableProps2.getObject(i);
                    }
                    return object;
                }
                if (i2 != 3) {
                    object = null;
                } else {
                    object = this.A07.getObject(i);
                    if (object == null) {
                        readableProps2 = this.A08;
                        return readableProps2.getObject(i);
                    }
                }
                return object;
            }
            readableProps = this.A08;
        }
        return readableProps.getObject(i);
    }

    @Override // com.facebook.fury.context.ReqContext
    public int getParentSeqId() {
        return this.A02;
    }

    @Override // com.facebook.fury.context.ReqContext
    public long getParentTid() {
        return this.A05;
    }

    @Override // com.facebook.fury.context.ReqContext
    public String getString(int i, int i2) {
        ReadableProps readableProps;
        String string;
        ReadableProps readableProps2;
        if (i2 == 0) {
            readableProps = this.A07;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    string = this.A08.getString(i);
                    if (string == null) {
                        readableProps2 = this.A07;
                        return readableProps2.getString(i);
                    }
                    return string;
                }
                if (i2 != 3) {
                    string = null;
                } else {
                    string = this.A07.getString(i);
                    if (string == null) {
                        readableProps2 = this.A08;
                        return readableProps2.getString(i);
                    }
                }
                return string;
            }
            readableProps = this.A08;
        }
        return readableProps.getString(i);
    }

    @Override // com.facebook.fury.context.ReqContext
    public String getTag() {
        return this.A09;
    }

    @Override // com.facebook.fury.context.ReqContext
    public int getType() {
        return this.A03;
    }

    @Override // com.facebook.fury.context.ReqContext
    public Iterator globalProps() {
        return this.A07.props();
    }

    @Override // com.facebook.fury.context.ReqContext
    public boolean hasParent() {
        boolean z = false;
        if (this.A05 != -1) {
            z = true;
        }
        return z;
    }

    @Override // com.facebook.fury.context.ReqContext
    public boolean hasSameProps(ReqContext reqContext) {
        boolean z = false;
        if (reqContext instanceof C01d) {
            C01d c01d = (C01d) reqContext;
            if (this.A07.equals(c01d.A07) && this.A08.equals(c01d.A08)) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        return AnonymousClass002.A01(this.A04) + this.A00;
    }

    @Override // com.facebook.fury.context.ReqContext
    public boolean isFlagOn(int i) {
        boolean z = false;
        if ((i & this.A01) != 0) {
            z = true;
        }
        return z;
    }

    @Override // com.facebook.fury.context.ReqContext
    public Iterator localProps() {
        return this.A08.props();
    }
}
