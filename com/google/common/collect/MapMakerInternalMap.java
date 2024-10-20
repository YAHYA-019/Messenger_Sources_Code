package com.google.common.collect;

import X.1BL;
import X.1NS;
import X.1pU;
import X.1pZ;
import X.1vG;
import X.3Cb;
import X.3Ci;
import X.AnonymousClass001;
import X.C1pc;
import X.C3mN;
import X.C45h;
import com.google.common.base.Equivalence;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.MapMakerInternalMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.ReferenceQueue;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: MapMakerInternalMap.class */
public class MapMakerInternalMap extends AbstractMap implements ConcurrentMap, Serializable {
    public static final C1pc A07 = new C1pc() { // from class: X.1pb
        @Override // X.C1pc
        public /* bridge */ /* synthetic */ C1pc AII(1vG r302, ReferenceQueue referenceQueue) {
            return this;
        }

        @Override // X.C1pc
        public /* bridge */ /* synthetic */ 1vG Ak7() {
            return null;
        }

        @Override // X.C1pc
        public void clear() {
        }

        @Override // X.C1pc
        public Object get() {
            return null;
        }
    };
    public static final long serialVersionUID = 5;
    public transient Collection A00;
    public transient Set A01;
    public transient Set A02;
    public final transient int A03;
    public final transient int A04;
    public final transient 1pZ A05;
    public final transient Segment[] A06;
    public final int concurrencyLevel;
    public final Equivalence keyEquivalence;

    /* loaded from: MapMakerInternalMap$AbstractSerializationProxy.class */
    public abstract class AbstractSerializationProxy extends 3Cb implements Serializable {
        public static final long serialVersionUID = 3;
        public transient ConcurrentMap A00;
        public final int concurrencyLevel;
        public final Equivalence keyEquivalence;
        public final Strength keyStrength;
        public final Equivalence valueEquivalence;
        public final Strength valueStrength;

        public AbstractSerializationProxy(Equivalence equivalence, Equivalence equivalence2, Strength strength, Strength strength2, ConcurrentMap concurrentMap, int i) {
            this.keyStrength = strength;
            this.valueStrength = strength2;
            this.keyEquivalence = equivalence;
            this.valueEquivalence = equivalence2;
            this.concurrencyLevel = i;
            this.A00 = concurrentMap;
        }

        public /* bridge */ /* synthetic */ Object A01() {
            return this.A00;
        }
    }

    /* loaded from: MapMakerInternalMap$Segment.class */
    public abstract class Segment extends ReentrantLock {
        public volatile int count;
        public final MapMakerInternalMap map;
        public int modCount;
        public final AtomicInteger readCount = new AtomicInteger();
        public volatile AtomicReferenceArray table;
        public int threshold;

        public Segment(MapMakerInternalMap mapMakerInternalMap, int i) {
            this.map = mapMakerInternalMap;
            AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(i);
            this.threshold = (atomicReferenceArray.length() * 3) / 4;
            this.table = atomicReferenceArray;
        }

        public static 1vG A00(1vG r301, 1vG r302, Segment segment) {
            int i = segment.count;
            1vG Az7 = r302.Az7();
            while (r301 != r302) {
                1vG AID = segment.map.A05.AID(r301, Az7, segment);
                if (AID != null) {
                    Az7 = AID;
                } else {
                    i--;
                }
                r301 = r301.Az7();
            }
            segment.count = i;
            return Az7;
        }

        public static void A01(Segment segment) {
            if (segment.tryLock()) {
                try {
                    segment.A06();
                    segment.readCount.set(0);
                } finally {
                    segment.unlock();
                }
            }
        }

        public static void A02(Segment segment) {
            if (segment.tryLock()) {
                try {
                    segment.A06();
                } finally {
                    segment.unlock();
                }
            }
        }

        public 1vG A03(Object obj, int i) {
            if (this.count == 0) {
                return null;
            }
            1vG r0 = (1vG) this.table.get((r0.length() - 1) & i);
            while (true) {
                1vG r306 = r0;
                if (r306 == null) {
                    return null;
                }
                if (r306.Aoj() == i) {
                    Object key = r306.getKey();
                    if (key == null) {
                        A02(this);
                    } else if (this.map.keyEquivalence.equivalent(obj, key)) {
                        return r306;
                    }
                }
                r0 = r306.Az7();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:119:0x02af, code lost:
        
            unlock();
         */
        /* JADX WARN: Code restructure failed: missing block: B:120:0x02b3, code lost:
        
            return null;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object A04(int r302, java.lang.Object r303, java.lang.Object r304, boolean r305) {
            /*
                Method dump skipped, instructions count: 701
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap.Segment.A04(int, java.lang.Object, java.lang.Object, boolean):java.lang.Object");
        }

        public void A05() {
            if (this instanceof WeakKeyStrongValueSegment) {
                do {
                } while (((WeakKeyStrongValueSegment) this).queueForKeys.poll() != null);
            }
        }

        public void A06() {
        }

        public void A07() {
            if ((this.readCount.incrementAndGet() & 63) == 0) {
                A01(this);
            }
        }

        public void A08(ReferenceQueue referenceQueue) {
            int i = 0;
            do {
                1vG poll = referenceQueue.poll();
                if (poll == null) {
                    return;
                }
                1vG r0 = poll;
                MapMakerInternalMap mapMakerInternalMap = this.map;
                int Aoj = r0.Aoj();
                Segment A01 = MapMakerInternalMap.A01(mapMakerInternalMap, Aoj);
                A01.lock();
                try {
                    AtomicReferenceArray atomicReferenceArray = A01.table;
                    int length = Aoj & (atomicReferenceArray.length() - 1);
                    1vG r02 = (1vG) atomicReferenceArray.get(length);
                    1vG r03 = r02;
                    while (true) {
                        1vG r312 = r03;
                        if (r312 == null) {
                            break;
                        }
                        if (r312 == r0) {
                            A01.modCount++;
                            1vG A00 = A00(r02, r312, A01);
                            int i2 = A01.count - 1;
                            atomicReferenceArray.set(length, A00);
                            A01.count = i2;
                            break;
                        }
                        r03 = r312.Az7();
                    }
                    A01.unlock();
                    i++;
                } catch (Throwable th) {
                    A01.unlock();
                    throw th;
                }
            } while (i != 16);
        }

        public void A09(ReferenceQueue referenceQueue) {
            int i = 0;
            do {
                Object poll = referenceQueue.poll();
                if (poll == null) {
                    return;
                }
                C1pc c1pc = (C1pc) poll;
                MapMakerInternalMap mapMakerInternalMap = this.map;
                1vG Ak7 = c1pc.Ak7();
                int Aoj = Ak7.Aoj();
                Segment A01 = MapMakerInternalMap.A01(mapMakerInternalMap, Aoj);
                Object key = Ak7.getKey();
                A01.lock();
                try {
                    AtomicReferenceArray atomicReferenceArray = A01.table;
                    int length = (atomicReferenceArray.length() - 1) & Aoj;
                    1vG r0 = (1vG) atomicReferenceArray.get(length);
                    1vG r02 = r0;
                    while (true) {
                        1vG r314 = r02;
                        if (r314 == null) {
                            break;
                        }
                        Object key2 = r314.getKey();
                        if (r314.Aoj() != Aoj || key2 == null || !A01.map.keyEquivalence.equivalent(key, key2)) {
                            r02 = r314.Az7();
                        } else if (((C3mN) r314).BIu() == c1pc) {
                            A01.modCount++;
                            1vG A00 = A00(r0, r314, A01);
                            int i2 = A01.count - 1;
                            atomicReferenceArray.set(length, A00);
                            A01.count = i2;
                        }
                    }
                    A01.unlock();
                    i++;
                } catch (Throwable th) {
                    A01.unlock();
                    throw th;
                }
            } while (i != 16);
        }
    }

    /* loaded from: MapMakerInternalMap$SerializationProxy.class */
    public final class SerializationProxy extends AbstractSerializationProxy {
        public static final long serialVersionUID = 3;

        private void readObject(ObjectInputStream objectInputStream) {
            objectInputStream.defaultReadObject();
            int readInt = objectInputStream.readInt();
            1pU r0 = new 1pU();
            int i = r0.A01;
            boolean z = true;
            Preconditions.checkState(AnonymousClass001.A1Q(i, -1), "initial capacity was already set to %s", i);
            if (readInt < 0) {
                z = false;
            }
            Preconditions.checkArgument(z);
            r0.A01 = readInt;
            r0.A02(this.keyStrength);
            r0.A03(this.valueStrength);
            Equivalence equivalence = this.keyEquivalence;
            Equivalence equivalence2 = r0.A02;
            Preconditions.checkState(AnonymousClass001.A1U(equivalence2), "key equivalence was already set to %s", equivalence2);
            equivalence.getClass();
            r0.A02 = equivalence;
            r0.A05 = true;
            r0.A01(this.concurrencyLevel);
            this.A00 = r0.A00();
            while (true) {
                Object readObject = objectInputStream.readObject();
                if (readObject == null) {
                    return;
                }
                this.A00.put(readObject, objectInputStream.readObject());
            }
        }

        private Object readResolve() {
            return this.A00;
        }

        private void writeObject(ObjectOutputStream objectOutputStream) {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeInt(this.A00.size());
            Iterator A0y = AnonymousClass001.A0y(this.A00);
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0y);
                objectOutputStream.writeObject(A0z.getKey());
                objectOutputStream.writeObject(A0z.getValue());
            }
            objectOutputStream.writeObject(null);
        }
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: MapMakerInternalMap$Strength.class */
    public abstract class Strength {
        public static final Strength A00 = new Strength() { // from class: com.google.common.collect.MapMakerInternalMap.Strength.1
        };
        public static final Strength A01 = new Strength() { // from class: com.google.common.collect.MapMakerInternalMap.Strength.2
            @Override // com.google.common.collect.MapMakerInternalMap.Strength
            public Equivalence A00() {
                return Equivalence.Identity.INSTANCE;
            }
        };

        public Strength(String str, int i) {
        }

        public Equivalence A00() {
            return Equivalence.Equals.INSTANCE;
        }
    }

    /* loaded from: MapMakerInternalMap$StrongKeyDummyValueSegment.class */
    public final class StrongKeyDummyValueSegment extends Segment {
    }

    /* loaded from: MapMakerInternalMap$StrongKeyStrongValueSegment.class */
    public final class StrongKeyStrongValueSegment extends Segment {
    }

    /* loaded from: MapMakerInternalMap$StrongKeyWeakValueSegment.class */
    public final class StrongKeyWeakValueSegment extends Segment {
        public final ReferenceQueue queueForValues;

        public StrongKeyWeakValueSegment(MapMakerInternalMap mapMakerInternalMap, int i) {
            super(mapMakerInternalMap, i);
            this.queueForValues = new ReferenceQueue();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void A05() {
            do {
            } while (this.queueForValues.poll() != null);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void A06() {
            A09(this.queueForValues);
        }
    }

    /* loaded from: MapMakerInternalMap$WeakKeyDummyValueSegment.class */
    public final class WeakKeyDummyValueSegment extends Segment {
        public final ReferenceQueue queueForKeys;

        public WeakKeyDummyValueSegment(MapMakerInternalMap mapMakerInternalMap, int i) {
            super(mapMakerInternalMap, i);
            this.queueForKeys = new ReferenceQueue();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void A05() {
            do {
            } while (this.queueForKeys.poll() != null);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void A06() {
            A08(this.queueForKeys);
        }
    }

    /* loaded from: MapMakerInternalMap$WeakKeyStrongValueSegment.class */
    public final class WeakKeyStrongValueSegment extends Segment {
        public final ReferenceQueue queueForKeys;

        public WeakKeyStrongValueSegment(MapMakerInternalMap mapMakerInternalMap, int i) {
            super(mapMakerInternalMap, i);
            this.queueForKeys = new ReferenceQueue();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void A06() {
            A08(this.queueForKeys);
        }
    }

    /* loaded from: MapMakerInternalMap$WeakKeyWeakValueSegment.class */
    public final class WeakKeyWeakValueSegment extends Segment {
        public final ReferenceQueue queueForKeys;
        public final ReferenceQueue queueForValues;

        public WeakKeyWeakValueSegment(MapMakerInternalMap mapMakerInternalMap, int i) {
            super(mapMakerInternalMap, i);
            this.queueForKeys = new ReferenceQueue();
            this.queueForValues = new ReferenceQueue();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void A05() {
            do {
            } while (this.queueForKeys.poll() != null);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void A06() {
            A08(this.queueForKeys);
            A09(this.queueForValues);
        }
    }

    public MapMakerInternalMap(1pU r302, 1pZ r303) {
        int i = r302.A00;
        int min = Math.min(i == -1 ? 4 : i, 65536);
        this.concurrencyLevel = min;
        Equivalence equivalence = r302.A02;
        Strength strength = r302.A03;
        this.keyEquivalence = (Equivalence) MoreObjects.firstNonNull(equivalence, (strength == null ? Strength.A00 : strength).A00());
        this.A05 = r303;
        int i2 = r302.A01;
        int min2 = Math.min(i2 == -1 ? 16 : i2, 1073741824);
        int i3 = 0;
        int i4 = 1;
        int i5 = 1;
        int i6 = 0;
        while (i5 < min) {
            i6++;
            i5 <<= 1;
        }
        this.A04 = 32 - i6;
        this.A03 = i5 - 1;
        this.A06 = new Segment[i5];
        int i7 = min2 / i5;
        while (i4 < (i5 * i7 < min2 ? i7 + 1 : i7)) {
            i4 <<= 1;
        }
        while (true) {
            Segment[] segmentArr = this.A06;
            if (i3 >= segmentArr.length) {
                return;
            }
            segmentArr[i3] = this.A05.BfI(this, i4);
            i3++;
        }
    }

    public static int A00(MapMakerInternalMap mapMakerInternalMap, Object obj) {
        int doHash = mapMakerInternalMap.keyEquivalence.doHash(obj);
        int i = doHash + ((doHash << 15) ^ (-12931));
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = i4 + (i4 << 2) + (i4 << 14);
        return i5 ^ (i5 >>> 16);
    }

    public static Segment A01(MapMakerInternalMap mapMakerInternalMap, int i) {
        return mapMakerInternalMap.A06[(i >>> mapMakerInternalMap.A04) & mapMakerInternalMap.A03];
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializationProxy");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Segment[] segmentArr = this.A06;
        int length = segmentArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            Segment segment = segmentArr[i2];
            if (segment.count != 0) {
                segment.lock();
                try {
                    AtomicReferenceArray atomicReferenceArray = segment.table;
                    int i3 = 0;
                    while (true) {
                        int i4 = i3;
                        if (i4 >= atomicReferenceArray.length()) {
                            break;
                        }
                        atomicReferenceArray.set(i4, null);
                        i3 = i4 + 1;
                    }
                    segment.A05();
                    segment.readCount.set(0);
                    segment.modCount++;
                    segment.count = 0;
                } finally {
                    segment.unlock();
                }
            }
            i = i2 + 1;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int A00 = A00(this, obj);
        Segment A01 = A01(this, A00);
        try {
            boolean z = false;
            if (A01.count != 0) {
                1vG A03 = A01.A03(obj, A00);
                if (A03 != null) {
                    if (A03.getValue() != null) {
                        z = true;
                    }
                }
            }
            A01.A07();
            return z;
        } catch (Throwable th) {
            A01.A07();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d7, code lost:
    
        if (r310 == r307) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00da, code lost:
    
        r309 = r309 + 1;
        r307 = r310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00eb, code lost:
    
        if (r309 >= 3) goto L32;
     */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean containsValue(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap.containsValue(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        3Ci r302 = this.A01;
        if (r302 == null) {
            r302 = new 3Ci(this);
            this.A01 = r302;
        }
        return r302;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            return null;
        }
        int A00 = A00(this, obj);
        Segment A01 = A01(this, A00);
        try {
            1vG A03 = A01.A03(obj, A00);
            if (A03 == null) {
                obj2 = null;
            } else {
                obj2 = A03.getValue();
                if (obj2 == null) {
                    Segment.A02(A01);
                }
            }
            A01.A07();
            return obj2;
        } catch (Throwable th) {
            A01.A07();
            throw th;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        Segment[] segmentArr = this.A06;
        boolean z = false;
        long j = 0;
        int i = 0;
        while (true) {
            int i2 = i;
            int length = segmentArr.length;
            if (i2 < length) {
                if (segmentArr[i2].count != 0) {
                    break;
                }
                j += segmentArr[i2].modCount;
                i = i2 + 1;
            } else {
                if (j == 0) {
                    return true;
                }
                int i3 = 0;
                while (true) {
                    int i4 = i3;
                    if (i4 < length) {
                        if (segmentArr[i4].count != 0) {
                            break;
                        }
                        j -= segmentArr[i4].modCount;
                        i3 = i4 + 1;
                    } else if (j == 0) {
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.A02;
        if (set == null) {
            set = new C45h() { // from class: X.45f
                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public void clear() {
                    MapMakerInternalMap.this.clear();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean contains(Object obj) {
                    return MapMakerInternalMap.this.containsKey(obj);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean isEmpty() {
                    return MapMakerInternalMap.this.isEmpty();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator iterator() {
                    return new C45l(MapMakerInternalMap.this);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean remove(Object obj) {
                    return AnonymousClass001.A1T(MapMakerInternalMap.this.remove(obj));
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public int size() {
                    return MapMakerInternalMap.this.size();
                }
            };
            this.A02 = set;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int A00 = A00(this, obj);
        return A01(this, A00).A04(A00, obj, obj2, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        Iterator A0y = AnonymousClass001.A0y(map);
        while (A0y.hasNext()) {
            1BL.A1O(this, AnonymousClass001.A0z(A0y));
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public Object putIfAbsent(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int A00 = A00(this, obj);
        return A01(this, A00).A04(A00, obj, obj2, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0081, code lost:
    
        r0 = r309.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008c, code lost:
    
        if (r0 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a1, code lost:
    
        if (X.AnonymousClass001.A1U(r309.getValue()) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ad, code lost:
    
        r0.modCount++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b6, code lost:
    
        r0 = com.google.common.collect.MapMakerInternalMap.Segment.A00(r0, r309, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c1, code lost:
    
        r0 = r0.count - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c8, code lost:
    
        r0.set(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ce, code lost:
    
        r0.count = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e8, code lost:
    
        return r0;
     */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object remove(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap.remove(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c2, code lost:
    
        if (r0.map.A05.D8v().A00().equivalent(r303, r310.getValue()) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e5, code lost:
    
        if (r310.getValue() != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f3, code lost:
    
        r0.modCount++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fc, code lost:
    
        r0 = com.google.common.collect.MapMakerInternalMap.Segment.A00(r0, r310, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x010a, code lost:
    
        r0 = r0.count - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0111, code lost:
    
        r0.set(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0118, code lost:
    
        r0.count = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d4, code lost:
    
        r311 = true;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean remove(java.lang.Object r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap.remove(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public Object replace(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int A00 = A00(this, obj);
        Segment A01 = A01(this, A00);
        A01.lock();
        try {
            Segment.A01(A01);
            AtomicReferenceArray atomicReferenceArray = A01.table;
            int length = (atomicReferenceArray.length() - 1) & A00;
            1vG r0 = (1vG) atomicReferenceArray.get(length);
            1vG r02 = r0;
            while (true) {
                1vG r310 = r02;
                if (r310 == null) {
                    break;
                }
                Object key = r310.getKey();
                if (r310.Aoj() == A00 && key != null && A01.map.keyEquivalence.equivalent(obj, key)) {
                    Object value = r310.getValue();
                    if (value != null) {
                        A01.modCount++;
                        A01.map.A05.Cw0(r310, A01, obj2);
                        return value;
                    }
                    if (AnonymousClass001.A1U(r310.getValue())) {
                        A01.modCount++;
                        1vG A002 = Segment.A00(r0, r310, A01);
                        int i = A01.count - 1;
                        atomicReferenceArray.set(length, A002);
                        A01.count = i;
                    }
                } else {
                    r02 = r310.Az7();
                }
            }
            A01.unlock();
            return null;
        } finally {
            A01.unlock();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(Object obj, Object obj2, Object obj3) {
        obj.getClass();
        obj3.getClass();
        if (obj2 == null) {
            return false;
        }
        int A00 = A00(this, obj);
        Segment A01 = A01(this, A00);
        A01.lock();
        try {
            Segment.A01(A01);
            AtomicReferenceArray atomicReferenceArray = A01.table;
            int length = (atomicReferenceArray.length() - 1) & A00;
            1vG r0 = (1vG) atomicReferenceArray.get(length);
            1vG r02 = r0;
            while (true) {
                1vG r311 = r02;
                if (r311 == null) {
                    break;
                }
                Object key = r311.getKey();
                if (r311.Aoj() == A00 && key != null && A01.map.keyEquivalence.equivalent(obj, key)) {
                    Object value = r311.getValue();
                    if (value == null) {
                        if (r311.getValue() == null) {
                            A01.modCount++;
                            1vG A002 = Segment.A00(r0, r311, A01);
                            int i = A01.count - 1;
                            atomicReferenceArray.set(length, A002);
                            A01.count = i;
                        }
                    } else if (A01.map.A05.D8v().A00().equivalent(obj2, value)) {
                        A01.modCount++;
                        A01.map.A05.Cw0(r311, A01, obj3);
                        A01.unlock();
                        return true;
                    }
                } else {
                    r02 = r311.Az7();
                }
            }
            return false;
        } finally {
            A01.unlock();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j = 0;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.A06.length) {
                return 1NS.A01(j);
            }
            j += r0[i2].count;
            i = i2 + 1;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        Collection collection = this.A00;
        if (collection == null) {
            collection = new AbstractCollection() { // from class: X.3jx
                @Override // java.util.AbstractCollection, java.util.Collection
                public void clear() {
                    MapMakerInternalMap.this.clear();
                }

                @Override // java.util.AbstractCollection, java.util.Collection
                public boolean contains(Object obj) {
                    return MapMakerInternalMap.this.containsValue(obj);
                }

                @Override // java.util.AbstractCollection, java.util.Collection
                public boolean isEmpty() {
                    return MapMakerInternalMap.this.isEmpty();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
                public Iterator iterator() {
                    return new C45l(MapMakerInternalMap.this);
                }

                @Override // java.util.AbstractCollection, java.util.Collection
                public int size() {
                    return MapMakerInternalMap.this.size();
                }

                @Override // java.util.AbstractCollection, java.util.Collection
                public Object[] toArray() {
                    ArrayList A10 = 1BL.A10(this);
                    C1Jp.A02(A10, iterator());
                    return A10.toArray();
                }

                @Override // java.util.AbstractCollection, java.util.Collection
                public Object[] toArray(Object[] objArr) {
                    ArrayList A10 = 1BL.A10(this);
                    C1Jp.A02(A10, iterator());
                    return A10.toArray(objArr);
                }
            };
            this.A00 = collection;
        }
        return collection;
    }

    public Object writeReplace() {
        1pZ r0 = this.A05;
        return new AbstractSerializationProxy(this.keyEquivalence, r0.D8v().A00(), r0.BXg(), r0.D8v(), this, this.concurrencyLevel);
    }
}
