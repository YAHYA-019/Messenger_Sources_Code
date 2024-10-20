package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;

/* renamed from: X.2dq, reason: invalid class name */
/* loaded from: 2dq.class */
public final class C2dq implements Iterator {
    public int A00;
    public int A01 = -1;
    public int A02 = -1;
    public Object A03;
    public List A04;
    public Queue A05;
    public boolean A06;
    public final /* synthetic */ 2PR A07;

    public C2dq(2PR r302) {
        this.A07 = r302;
        this.A00 = r302.A00;
    }

    private void A00(int i) {
        Iterator it;
        if (this.A02 < i) {
            if (this.A04 != null) {
                loop0: while (true) {
                    2PR r0 = this.A07;
                    if (i >= r0.size()) {
                        break;
                    }
                    List list = this.A04;
                    Object A01 = 2PR.A01(r0, i);
                    it = list.iterator();
                    while (it.hasNext()) {
                        if (it.next() == A01) {
                            break;
                        }
                    }
                    break loop0;
                    it.remove();
                    i++;
                }
            }
            this.A02 = i;
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        Queue queue;
        2PR r0 = this.A07;
        if (r0.A00 != this.A00) {
            throw new ConcurrentModificationException();
        }
        A00(this.A01 + 1);
        return this.A02 < r0.size() || !((queue = this.A05) == null || queue.isEmpty());
    }

    @Override // java.util.Iterator
    public Object next() {
        2PR r0 = this.A07;
        if (r0.A00 != this.A00) {
            throw new ConcurrentModificationException();
        }
        A00(this.A01 + 1);
        int i = this.A02;
        int size = r0.size();
        if (i < size) {
            this.A01 = i;
            this.A06 = true;
            Object obj = r0.A02[i];
            obj.getClass();
            return obj;
        }
        Queue queue = this.A05;
        if (queue != null) {
            this.A01 = size;
            Object poll = queue.poll();
            this.A03 = poll;
            if (poll != null) {
                this.A06 = true;
                return poll;
            }
        }
        throw new NoSuchElementException("iterator moved past last element in queue.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0063, code lost:
    
        if (r303 == null) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v101, types: [java.util.List] */
    @Override // java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void remove() {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2dq.remove():void");
    }
}
