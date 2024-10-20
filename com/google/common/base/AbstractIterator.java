package com.google.common.base;

import X.AnonymousClass001;
import com.google.common.base.Splitter;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: AbstractIterator.class */
public abstract class AbstractIterator implements Iterator {
    public Object next;
    public State state = State.NOT_READY;

    /* loaded from: AbstractIterator$State.class */
    public enum State {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int separatorEnd;
        State state = this.state;
        State state2 = State.FAILED;
        boolean z = false;
        boolean z2 = false;
        if (state != state2) {
            z2 = true;
        }
        Preconditions.checkState(z2);
        int ordinal = state.ordinal();
        if (ordinal != 2) {
            if (ordinal == 0) {
                return true;
            }
            this.state = state2;
            Splitter.SplittingIterator splittingIterator = (Splitter.SplittingIterator) this;
            int i = splittingIterator.offset;
            while (true) {
                int i2 = splittingIterator.offset;
                if (i2 == -1) {
                    splittingIterator.state = State.DONE;
                    str = null;
                    break;
                }
                int separatorStart = splittingIterator.separatorStart(i2);
                if (separatorStart == -1) {
                    separatorStart = splittingIterator.toSplit.length();
                    splittingIterator.offset = -1;
                    separatorEnd = -1;
                } else {
                    separatorEnd = splittingIterator.separatorEnd(separatorStart);
                    splittingIterator.offset = separatorEnd;
                }
                if (separatorEnd == i) {
                    int i3 = separatorEnd + 1;
                    splittingIterator.offset = i3;
                    if (i3 > splittingIterator.toSplit.length()) {
                        splittingIterator.offset = -1;
                    }
                } else {
                    while (i < separatorStart && splittingIterator.trimmer.matches(splittingIterator.toSplit.charAt(i))) {
                        i++;
                    }
                    while (separatorStart > i && splittingIterator.trimmer.matches(splittingIterator.toSplit.charAt(separatorStart - 1))) {
                        separatorStart--;
                    }
                    int i4 = splittingIterator.limit;
                    if (i4 == 1) {
                        separatorStart = splittingIterator.toSplit.length();
                        splittingIterator.offset = -1;
                        while (separatorStart > i) {
                            CharMatcher charMatcher = splittingIterator.trimmer;
                            CharSequence charSequence = splittingIterator.toSplit;
                            int i5 = separatorStart - 1;
                            if (!charMatcher.matches(charSequence.charAt(i5))) {
                                break;
                            }
                            separatorStart = i5;
                        }
                    } else {
                        splittingIterator.limit = i4 - 1;
                    }
                    str = splittingIterator.toSplit.subSequence(i, separatorStart).toString();
                }
            }
            this.next = str;
            if (this.state != State.DONE) {
                this.state = State.READY;
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.state = State.NOT_READY;
        Object obj = this.next;
        this.next = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw AnonymousClass001.A0p();
    }
}
