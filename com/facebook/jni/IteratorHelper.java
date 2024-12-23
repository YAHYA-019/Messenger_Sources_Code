package com.facebook.jni;

import java.util.Iterator;

/* loaded from: IteratorHelper.class */
public class IteratorHelper {
    public Object mElement;
    public final Iterator mIterator;

    public IteratorHelper(Iterable iterable) {
        this.mIterator = iterable.iterator();
    }

    public IteratorHelper(Iterator it) {
        this.mIterator = it;
    }

    public boolean hasNext() {
        if (this.mIterator.hasNext()) {
            this.mElement = this.mIterator.next();
            return true;
        }
        this.mElement = null;
        return false;
    }
}
