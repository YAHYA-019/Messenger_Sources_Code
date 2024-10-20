package X;

import com.facebook.graphservice.interfaces.Summary;
import com.google.common.collect.RegularImmutableSet;
import com.google.common.collect.SingletonImmutableSet;
import java.util.Collection;

/* renamed from: X.4mh, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4mh.class */
public abstract class AbstractC08294mh {
    public final long A00;
    public final EnumC08284mf A01;
    public final Summary A02;
    public final Object A03;

    public AbstractC08294mh(EnumC08284mf enumC08284mf, Summary summary, Object obj, long j) {
        this.A03 = obj;
        this.A01 = enumC08284mf;
        this.A00 = j;
        this.A02 = summary;
    }

    public Object A00() {
        return this.A03;
    }

    public Collection A01() {
        Object obj = this.A03;
        return obj == null ? RegularImmutableSet.A05 : obj instanceof java.util.Map ? ((java.util.Map) obj).values() : obj instanceof Collection ? (Collection) obj : new SingletonImmutableSet(obj);
    }
}
