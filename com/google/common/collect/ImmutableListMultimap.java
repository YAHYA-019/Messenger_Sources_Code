package com.google.common.collect;

import X.0Pz;
import X.0Q8;
import X.1BK;
import X.1Mu;
import X.1Mv;
import X.AnonymousClass001;
import X.C5s3;
import X.KcE;
import X.L9Q;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: ImmutableListMultimap.class */
public class ImmutableListMultimap extends ImmutableMultimap implements 1Mv {
    public static final long serialVersionUID = 0;

    public ImmutableListMultimap(ImmutableMap immutableMap, int i) {
        super(immutableMap, i);
    }

    public static EmptyImmutableListMultimap A00() {
        return EmptyImmutableListMultimap.A00;
    }

    public static C5s3 A01() {
        return new C5s3();
    }

    public static ImmutableListMultimap A02(1Mu r301) {
        if (r301.isEmpty()) {
            return A00();
        }
        if (r301 instanceof ImmutableListMultimap) {
            ImmutableListMultimap immutableListMultimap = (ImmutableListMultimap) r301;
            if (!immutableListMultimap.A01.isPartialView()) {
                return immutableListMultimap;
            }
        }
        return A04(r301.AAK().entrySet());
    }

    public static ImmutableListMultimap A03(Object obj) {
        C5s3 A01 = A01();
        A01.A04("charset", obj);
        return A01.A03();
    }

    public static ImmutableListMultimap A04(Collection collection) {
        if (collection.isEmpty()) {
            return A00();
        }
        ImmutableMap.Builder builder = new ImmutableMap.Builder(collection.size());
        int i = 0;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            ImmutableList copyOf = ImmutableList.copyOf((Collection) entry.getValue());
            if (!copyOf.isEmpty()) {
                builder.put(key, copyOf);
                i += copyOf.size();
            }
        }
        return new ImmutableListMultimap(builder.buildOrThrow(), i);
    }

    public static final void A05() {
        throw AnonymousClass001.A0p();
    }

    public static final void A06() {
        throw AnonymousClass001.A0p();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException(0Pz.A0T("Invalid key count ", readInt));
        }
        ImmutableMap.Builder A0c = 1BK.A0c();
        int i = 0;
        for (int i2 = 0; i2 < readInt; i2++) {
            Object readObject = objectInputStream.readObject();
            readObject.getClass();
            int readInt2 = objectInputStream.readInt();
            if (readInt2 <= 0) {
                throw new InvalidObjectException(0Pz.A0T("Invalid value count ", readInt2));
            }
            ImmutableList.Builder builder = ImmutableList.builder();
            int i3 = 0;
            do {
                Object readObject2 = objectInputStream.readObject();
                readObject2.getClass();
                builder.m11011add(readObject2);
                i3++;
            } while (i3 < readInt2);
            A0c.put(readObject, builder.build());
            i += readInt2;
        }
        try {
            KcE.A00.A00(this, A0c.buildOrThrow());
            try {
                KcE.A01.A00.set(this, Integer.valueOf(i));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        } catch (IllegalArgumentException e2) {
            throw new InvalidObjectException(e2.getMessage()).initCause(e2);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        L9Q.A02(this, objectOutputStream);
    }

    @Override // com.google.common.collect.ImmutableMultimap
    /* renamed from: A0J, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ImmutableList AUg(Object obj) {
        ImmutableList immutableList = (ImmutableList) this.A01.get(obj);
        if (immutableList == null) {
            immutableList = ImmutableList.of();
        }
        return immutableList;
    }

    public /* bridge */ /* synthetic */ Collection Cdw(Object obj) {
        A05();
        throw 0Q8.createAndThrow();
    }

    public /* bridge */ /* synthetic */ List Cdx(Object obj) {
        throw 0Q8.createAndThrow();
    }

    public /* bridge */ /* synthetic */ Collection Cfv(Iterable iterable, Object obj) {
        A06();
        throw null;
    }
}
