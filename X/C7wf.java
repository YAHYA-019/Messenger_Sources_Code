package X;

import java.util.Comparator;
import java.util.Map;

/* renamed from: X.7wf, reason: invalid class name */
/* loaded from: 7wf.class */
public final class C7wf implements Comparator {
    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return (((C11884xs) ((Map.Entry) obj).getValue()).A07 > ((C11884xs) ((Map.Entry) obj2).getValue()).A07 ? 1 : (((C11884xs) ((Map.Entry) obj).getValue()).A07 == ((C11884xs) ((Map.Entry) obj2).getValue()).A07 ? 0 : -1));
    }
}
