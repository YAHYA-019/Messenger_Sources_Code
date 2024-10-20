package X;

import com.facebook.messaging.model.threads.ThreadParticipant;
import com.google.common.collect.ImmutableList;
import java.util.AbstractList;

/* renamed from: X.4Na, reason: invalid class name */
/* loaded from: 4Na.class */
public final class C4Na extends AbstractList {
    public final ImmutableList A00;
    public final ImmutableList A01;

    public C4Na(ImmutableList immutableList, ImmutableList immutableList2) {
        11T.A0F(immutableList, 1);
        11T.A0F(immutableList2, 2);
        this.A01 = immutableList;
        this.A00 = immutableList2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null || (obj instanceof ThreadParticipant)) {
            return super.contains(obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object get(int i) {
        ImmutableList immutableList = this.A01;
        Object obj = i < immutableList.size() ? immutableList.get(i) : this.A00.get(i - immutableList.size());
        11T.A0D(obj);
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null || (obj instanceof ThreadParticipant)) {
            return super.indexOf(obj);
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null || (obj instanceof ThreadParticipant)) {
            return super.lastIndexOf(obj);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null || (obj instanceof ThreadParticipant)) {
            return super.remove(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return this.A01.size() + this.A00.size();
    }
}
