package com.google.common.base;

import X.AnonymousClass001;
import com.google.common.base.CharMatcher;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: Splitter.class */
public final class Splitter {
    public final int limit;
    public final Strategy strategy;
    public final CharMatcher trimmer;

    /* renamed from: com.google.common.base.Splitter$5, reason: invalid class name */
    /* loaded from: Splitter$5.class */
    public class AnonymousClass5 implements Iterable {
        public final /* synthetic */ CharSequence val$sequence;

        public AnonymousClass5(CharSequence charSequence) {
            this.val$sequence = charSequence;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            Splitter splitter = Splitter.this;
            return splitter.strategy.iterator(splitter, this.val$sequence);
        }

        public String toString() {
            Joiner joiner = new Joiner(", ");
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append('[');
            joiner.appendTo(A0k, this);
            return AnonymousClass001.A0g(A0k, ']');
        }
    }

    /* loaded from: Splitter$SplittingIterator.class */
    public abstract class SplittingIterator extends AbstractIterator {
        public int limit;
        public int offset = 0;
        public final CharSequence toSplit;
        public final CharMatcher trimmer;

        public SplittingIterator(Splitter splitter, CharSequence charSequence) {
            this.trimmer = splitter.trimmer;
            this.limit = splitter.limit;
            this.toSplit = charSequence;
        }

        public abstract int separatorEnd(int i);

        public abstract int separatorStart(int i);
    }

    /* loaded from: Splitter$Strategy.class */
    public interface Strategy {
        Iterator iterator(Splitter splitter, CharSequence charSequence);
    }

    public Splitter(Strategy strategy, boolean z, CharMatcher charMatcher, int i) {
        this.strategy = strategy;
        this.trimmer = charMatcher;
        this.limit = i;
    }

    public static Splitter on(char c) {
        final CharMatcher.Is is = new CharMatcher.Is(c);
        return new Splitter(new Strategy() { // from class: com.google.common.base.Splitter.1
            @Override // com.google.common.base.Splitter.Strategy
            public /* bridge */ /* synthetic */ Iterator iterator(Splitter splitter, CharSequence charSequence) {
                return new SplittingIterator(splitter, charSequence) { // from class: com.google.common.base.Splitter.1.1
                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public int separatorEnd(int i) {
                        return i + 1;
                    }

                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public int separatorStart(int i) {
                        return CharMatcher.this.indexIn(this.toSplit, i);
                    }
                };
            }
        }, false, CharMatcher.None.INSTANCE, (-1) >>> 1);
    }

    public static Splitter on(final String str) {
        int length = str.length();
        boolean z = false;
        if (length != 0) {
            z = true;
        }
        Preconditions.checkArgument(z, "The separator may not be the empty string.");
        return length == 1 ? on(str.charAt(0)) : new Splitter(new Strategy() { // from class: com.google.common.base.Splitter.2
            @Override // com.google.common.base.Splitter.Strategy
            public /* bridge */ /* synthetic */ Iterator iterator(Splitter splitter, CharSequence charSequence) {
                return new SplittingIterator(splitter, charSequence) { // from class: com.google.common.base.Splitter.2.1
                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public int separatorEnd(int i) {
                        return i + str.length();
                    }

                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public int separatorStart(int i) {
                        int length2 = str.length();
                        int length3 = this.toSplit.length() - length2;
                        loop0: while (true) {
                            if (i > length3) {
                                i = -1;
                                break;
                            }
                            int i2 = 0;
                            while (true) {
                                int i3 = i2;
                                if (i3 >= length2) {
                                    break loop0;
                                }
                                if (this.toSplit.charAt(i3 + i) != str.charAt(i3)) {
                                    break;
                                }
                                i2 = i3 + 1;
                            }
                            i++;
                        }
                        return i;
                    }
                };
            }
        }, false, CharMatcher.None.INSTANCE, (-1) >>> 1);
    }

    public List splitToList(CharSequence charSequence) {
        charSequence.getClass();
        Iterator it = this.strategy.iterator(this, charSequence);
        ArrayList A0s = AnonymousClass001.A0s();
        while (it.hasNext()) {
            A0s.add(it.next());
        }
        return Collections.unmodifiableList(A0s);
    }
}
