package com.google.common.collect;

import X.1Ms;
import X.1Mu;
import X.1Mv;
import X.AnonymousClass001;
import X.C10614tz;
import X.C1Jp;
import X.C4u1;
import X.GOn;
import X.K9T;
import X.KAl;
import X.KAx;
import X.KSo;
import X.Lt6;
import X.LyK;
import X.LyL;
import X.LyM;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: LinkedListMultimap.class */
public class LinkedListMultimap extends 1Ms implements 1Mv, Serializable {
    public static final long serialVersionUID = 0;
    public transient int A00;
    public transient int A01;
    public transient K9T A02;
    public transient K9T A03;
    public transient Map A04;

    public LinkedListMultimap() {
        this.A04 = new CompactHashMap(12);
    }

    public LinkedListMultimap(1Mu r302) {
        this.A04 = new CompactHashMap(r302.keySet().size());
        Ca0(r302);
    }

    /* JADX WARN: Type inference failed for: r0v67, types: [java.lang.Object, X.KSo] */
    public static K9T A00(K9T k9t, LinkedListMultimap linkedListMultimap, Object obj, Object obj2) {
        K9T k9t2 = new K9T(obj, obj2);
        if (linkedListMultimap.A02 != null) {
            if (k9t == null) {
                K9T k9t3 = linkedListMultimap.A03;
                k9t3.getClass();
                k9t3.A00 = k9t2;
                k9t2.A02 = linkedListMultimap.A03;
                linkedListMultimap.A03 = k9t2;
                KSo kSo = (KSo) linkedListMultimap.A04.get(obj);
                if (kSo != null) {
                    kSo.A00++;
                    K9T k9t4 = kSo.A02;
                    k9t4.A01 = k9t2;
                    k9t2.A03 = k9t4;
                    kSo.A02 = k9t2;
                }
            } else {
                KSo kSo2 = (KSo) linkedListMultimap.A04.get(obj);
                kSo2.getClass();
                kSo2.A00++;
                k9t2.A02 = k9t.A02;
                k9t2.A03 = k9t.A03;
                k9t2.A00 = k9t;
                k9t2.A01 = k9t;
                K9T k9t5 = k9t.A03;
                if (k9t5 == null) {
                    kSo2.A01 = k9t2;
                } else {
                    k9t5.A01 = k9t2;
                }
                K9T k9t6 = k9t.A02;
                if (k9t6 == null) {
                    linkedListMultimap.A02 = k9t2;
                } else {
                    k9t6.A00 = k9t2;
                }
                k9t.A02 = k9t2;
                k9t.A03 = k9t2;
            }
            linkedListMultimap.A01++;
            return k9t2;
        }
        linkedListMultimap.A03 = k9t2;
        linkedListMultimap.A02 = k9t2;
        Map map = linkedListMultimap.A04;
        ?? obj3 = new Object();
        ((KSo) obj3).A01 = k9t2;
        ((KSo) obj3).A02 = k9t2;
        k9t2.A03 = null;
        k9t2.A01 = null;
        ((KSo) obj3).A00 = 1;
        map.put(obj, obj3);
        linkedListMultimap.A00++;
        linkedListMultimap.A01++;
        return k9t2;
    }

    public static void A01(K9T k9t, LinkedListMultimap linkedListMultimap) {
        K9T k9t2 = k9t.A02;
        K9T k9t3 = k9t.A00;
        if (k9t2 != null) {
            k9t2.A00 = k9t3;
        } else {
            linkedListMultimap.A02 = k9t3;
        }
        K9T k9t4 = k9t.A00;
        if (k9t4 != null) {
            k9t4.A02 = k9t2;
        } else {
            linkedListMultimap.A03 = k9t2;
        }
        if (k9t.A03 == null && k9t.A01 == null) {
            KSo kSo = (KSo) linkedListMultimap.A04.remove(k9t.A05);
            kSo.getClass();
            kSo.A00 = 0;
            linkedListMultimap.A00++;
        } else {
            KSo kSo2 = (KSo) linkedListMultimap.A04.get(k9t.A05);
            kSo2.getClass();
            kSo2.A00--;
            K9T k9t5 = k9t.A03;
            K9T k9t6 = k9t.A01;
            if (k9t5 == null) {
                k9t6.getClass();
                kSo2.A01 = k9t6;
            } else {
                k9t5.A01 = k9t6;
            }
            K9T k9t7 = k9t.A01;
            K9T k9t8 = k9t.A03;
            if (k9t7 == null) {
                k9t8.getClass();
                kSo2.A02 = k9t8;
            } else {
                k9t7.A03 = k9t8;
            }
        }
        linkedListMultimap.A01--;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.A04 = new CompactLinkedHashMap();
        int readInt = objectInputStream.readInt();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= readInt) {
                return;
            }
            CZw(objectInputStream.readObject(), objectInputStream.readObject());
            i = i2 + 1;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.A01);
        Iterator A1G = GOn.A1G(super.AQp());
        while (A1G.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A1G);
            objectOutputStream.writeObject(A0z.getKey());
            objectOutputStream.writeObject(A0z.getValue());
        }
    }

    public C4u1 A08() {
        return new C10614tz(this);
    }

    public /* bridge */ /* synthetic */ Collection A09() {
        return new LyK(this);
    }

    public /* bridge */ /* synthetic */ Collection A0A() {
        return new LyL(this);
    }

    public Iterator A0B() {
        throw AnonymousClass001.A0J("should never be called");
    }

    public Map A0D() {
        return new KAl(this);
    }

    public Set A0E() {
        return new KAx(this);
    }

    public /* bridge */ /* synthetic */ Collection AQp() {
        return super.AQp();
    }

    public /* bridge */ /* synthetic */ Collection AUe(Object obj) {
        return new LyM(this, obj);
    }

    public List AUg(Object obj) {
        return new LyM(this, obj);
    }

    public boolean CZw(Object obj, Object obj2) {
        A00(null, this, obj, obj2);
        return true;
    }

    /* renamed from: Cdx, reason: merged with bridge method [inline-methods] */
    public List Cdw(Object obj) {
        Lt6 lt6 = new Lt6(this, obj);
        ArrayList A0s = AnonymousClass001.A0s();
        C1Jp.A02(A0s, lt6);
        List unmodifiableList = Collections.unmodifiableList(A0s);
        Lt6 lt62 = new Lt6(this, obj);
        while (lt62.hasNext()) {
            lt62.next();
            lt62.remove();
        }
        return unmodifiableList;
    }

    public /* bridge */ /* synthetic */ Collection Cfv(Iterable iterable, Object obj) {
        Lt6 lt6 = new Lt6(this, obj);
        ArrayList A0s = AnonymousClass001.A0s();
        C1Jp.A02(A0s, lt6);
        List unmodifiableList = Collections.unmodifiableList(A0s);
        Lt6 lt62 = new Lt6(this, obj);
        Iterator it = iterable.iterator();
        while (lt62.hasNext() && it.hasNext()) {
            lt62.next();
            lt62.set(it.next());
        }
        while (lt62.hasNext()) {
            lt62.next();
            lt62.remove();
        }
        while (it.hasNext()) {
            lt62.add(it.next());
        }
        return unmodifiableList;
    }

    public void clear() {
        this.A02 = null;
        this.A03 = null;
        this.A04.clear();
        this.A01 = 0;
        this.A00++;
    }

    public boolean containsKey(Object obj) {
        return this.A04.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return ((List) super.values()).contains(obj);
    }

    public boolean isEmpty() {
        return AnonymousClass001.A1U(this.A02);
    }

    public int size() {
        return this.A01;
    }

    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }
}
