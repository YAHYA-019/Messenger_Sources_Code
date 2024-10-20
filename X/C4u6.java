package X;

import com.google.common.collect.AbstractMapBasedMultimap;
import com.google.common.collect.ImmutableEntry;
import com.google.common.collect.Iterators$EmptyModifiableIterator;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.4u6, reason: invalid class name */
/* loaded from: 4u6.class */
public final class C4u6 extends AbstractC05554eE {
    public C4u6(final AbstractMapBasedMultimap abstractMapBasedMultimap) {
        new Iterator() { // from class: X.4eE
            public Object A00 = null;
            public Collection A01 = null;
            public Iterator A02 = Iterators$EmptyModifiableIterator.A01;
            public final Iterator A03;

            {
                this.A03 = AbstractMapBasedMultimap.this.A01.entrySet().iterator();
            }

            /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
            
                if (r301.A02.hasNext() != false) goto L6;
             */
            @Override // java.util.Iterator
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public boolean hasNext() {
                /*
                    r301 = this;
                    r0 = r301
                    java.util.Iterator r0 = r0.A03
                    r302 = r0
                    r0 = r302
                    boolean r0 = r0.hasNext()
                    r303 = r0
                    r0 = r303
                    if (r0 != 0) goto L22
                    r0 = r301
                    java.util.Iterator r0 = r0.A02
                    boolean r0 = r0.hasNext()
                    r304 = r0
                    r0 = 0
                    r303 = r0
                    r0 = 0
                    r302 = r0
                    r0 = r304
                    if (r0 == 0) goto L24
                L22:
                    r0 = 1
                    r303 = r0
                L24:
                    r0 = r303
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.AbstractC05554eE.hasNext():boolean");
            }

            @Override // java.util.Iterator
            public Object next() {
                if (!this.A02.hasNext()) {
                    Map.Entry entry = (Map.Entry) this.A03.next();
                    this.A00 = entry.getKey();
                    Collection collection = (Collection) entry.getValue();
                    this.A01 = collection;
                    this.A02 = collection.iterator();
                }
                Object obj = this.A00;
                Object next = this.A02.next();
                return this instanceof C4u6 ? new ImmutableEntry(obj, next) : next;
            }

            @Override // java.util.Iterator
            public void remove() {
                this.A02.remove();
                Collection collection = this.A01;
                collection.getClass();
                if (collection.isEmpty()) {
                    this.A03.remove();
                }
                AbstractMapBasedMultimap abstractMapBasedMultimap2 = AbstractMapBasedMultimap.this;
                abstractMapBasedMultimap2.A00--;
            }
        };
    }
}
