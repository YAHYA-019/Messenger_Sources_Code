package com.facebook.fury.context;

import java.io.Closeable;
import java.util.Iterator;

/* loaded from: ReqContext.class */
public interface ReqContext extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    boolean getBoolean(int i, boolean z, int i2);

    int getCurrentSeqId();

    long getCurrentTid();

    int getInt(int i, int i2, int i3);

    long getLong(int i, long j, int i2);

    Object getObject(int i, int i2);

    int getParentSeqId();

    long getParentTid();

    String getString(int i, int i2);

    String getTag();

    int getType();

    Iterator globalProps();

    boolean hasParent();

    boolean hasSameProps(ReqContext reqContext);

    boolean isFlagOn(int i);

    Iterator localProps();
}
