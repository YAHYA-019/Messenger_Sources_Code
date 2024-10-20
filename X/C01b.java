package X;

import com.facebook.fury.context.ReqContext;
import java.util.Iterator;

/* renamed from: X.01b, reason: invalid class name */
/* loaded from: 01b.class */
public final class C01b implements ReqContext {
    public final ReqContext A00;

    public C01b(ReqContext reqContext) {
        this.A00 = reqContext instanceof C01b ? ((C01b) reqContext).A00 : reqContext;
    }

    @Override // com.facebook.fury.context.ReqContext, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // com.facebook.fury.context.ReqContext
    public boolean getBoolean(int i, boolean z, int i2) {
        return this.A00.getBoolean(i, z, i2);
    }

    @Override // com.facebook.fury.context.ReqContext
    public int getCurrentSeqId() {
        return this.A00.getCurrentSeqId();
    }

    @Override // com.facebook.fury.context.ReqContext
    public long getCurrentTid() {
        return this.A00.getCurrentTid();
    }

    @Override // com.facebook.fury.context.ReqContext
    public int getInt(int i, int i2, int i3) {
        return this.A00.getInt(i, i2, i3);
    }

    @Override // com.facebook.fury.context.ReqContext
    public long getLong(int i, long j, int i2) {
        return this.A00.getLong(i, j, i2);
    }

    @Override // com.facebook.fury.context.ReqContext
    public Object getObject(int i, int i2) {
        return this.A00.getObject(i, i2);
    }

    @Override // com.facebook.fury.context.ReqContext
    public int getParentSeqId() {
        return this.A00.getParentSeqId();
    }

    @Override // com.facebook.fury.context.ReqContext
    public long getParentTid() {
        return this.A00.getParentTid();
    }

    @Override // com.facebook.fury.context.ReqContext
    public String getString(int i, int i2) {
        return this.A00.getString(i, i2);
    }

    @Override // com.facebook.fury.context.ReqContext
    public String getTag() {
        return this.A00.getTag();
    }

    @Override // com.facebook.fury.context.ReqContext
    public int getType() {
        return this.A00.getType();
    }

    @Override // com.facebook.fury.context.ReqContext
    public Iterator globalProps() {
        return this.A00.globalProps();
    }

    @Override // com.facebook.fury.context.ReqContext
    public boolean hasParent() {
        return this.A00.hasParent();
    }

    @Override // com.facebook.fury.context.ReqContext
    public boolean hasSameProps(ReqContext reqContext) {
        return this.A00.hasSameProps(reqContext);
    }

    @Override // com.facebook.fury.context.ReqContext
    public boolean isFlagOn(int i) {
        return this.A00.isFlagOn(i);
    }

    @Override // com.facebook.fury.context.ReqContext
    public Iterator localProps() {
        return this.A00.localProps();
    }
}
