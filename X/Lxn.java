package X;

import android.icu.text.DateFormat;

/* loaded from: Lxn.class */
public final class Lxn extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public /* bridge */ /* synthetic */ Object initialValue() {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("MMMd, yyyy");
        11T.A0A(instanceForSkeleton);
        return instanceForSkeleton;
    }
}
