package com.facebook.fury.props;

import java.util.Iterator;

/* loaded from: ReadableProps.class */
public interface ReadableProps {
    boolean getBoolean(int i, boolean z);

    int getInt(int i, int i2);

    long getLong(int i, long j);

    Object getObject(int i);

    String getString(int i);

    boolean isEmpty();

    Iterator props();

    int size();
}
