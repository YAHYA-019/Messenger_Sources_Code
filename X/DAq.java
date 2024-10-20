package X;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: DAq.class */
public final class DAq implements Comparator {
    public static final DAq A00 = new Object();

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        int i;
        int i2 = 0;
        if (obj != obj2) {
            if (obj != null) {
                if (obj2 == null) {
                    return 1;
                }
                if ((obj instanceof List) && (obj2 instanceof List)) {
                    return CQq.A02((List) obj, (List) obj2);
                }
                if ((obj instanceof Set) && (obj2 instanceof Set)) {
                    Set set = (Set) obj;
                    Set set2 = (Set) obj2;
                    if (set == null) {
                        return set2 == null ? 0 : -1;
                    }
                    if (set2 == null) {
                        return 1;
                    }
                    if (set != set2) {
                        int size = set.size();
                        int size2 = set2.size();
                        if (size < size2) {
                            return -1;
                        }
                        if (size2 < size) {
                            return 1;
                        }
                        DAq dAq = A00;
                        TreeSet treeSet = new TreeSet(dAq);
                        treeSet.addAll(set);
                        TreeSet treeSet2 = new TreeSet(dAq);
                        treeSet2.addAll(set2);
                        Iterator it = treeSet.iterator();
                        Iterator it2 = treeSet2.iterator();
                        while (it.hasNext() && it2.hasNext()) {
                            int compare = dAq.compare(it.next(), it2.next());
                            if (compare != 0) {
                                return compare;
                            }
                        }
                    }
                } else {
                    if ((obj instanceof java.util.Map) && (obj2 instanceof java.util.Map)) {
                        java.util.Map map = (java.util.Map) obj;
                        java.util.Map map2 = (java.util.Map) obj2;
                        int size3 = map.size();
                        int size4 = map2.size();
                        if (size3 < size4) {
                            i = -1;
                        } else {
                            if (size4 < size3) {
                                return 1;
                            }
                            i = 0;
                            if (map != map2) {
                                DAq dAq2 = A00;
                                TreeMap treeMap = new TreeMap(dAq2);
                                treeMap.putAll(map);
                                TreeMap treeMap2 = new TreeMap(dAq2);
                                treeMap2.putAll(map2);
                                Iterator A0x = AnonymousClass001.A0x(treeMap);
                                Iterator A0x2 = AnonymousClass001.A0x(treeMap2);
                                while (A0x.hasNext() && A0x2.hasNext()) {
                                    Map.Entry A0z = AnonymousClass001.A0z(A0x);
                                    Map.Entry A0z2 = AnonymousClass001.A0z(A0x2);
                                    i2 = dAq2.compare(A0z.getKey(), A0z2.getKey());
                                    if (i2 == 0) {
                                        int compare2 = dAq2.compare(A0z.getValue(), A0z2.getValue());
                                        if (compare2 != 0) {
                                            return compare2;
                                        }
                                    }
                                }
                            }
                        }
                        return i;
                    }
                    if (!(obj instanceof byte[])) {
                        if (obj.getClass() == obj2.getClass() && ((obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Double) || (obj instanceof C29M))) {
                            return ((Comparable) obj).compareTo(obj2);
                        }
                        StringBuilder A0k = AnonymousClass001.A0k();
                        A0k.append("cannot compare ");
                        A0k.append(obj);
                        throw AnonymousClass002.A0C(obj2, " and ", A0k);
                    }
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = (byte[]) obj2;
                    if (bArr == null) {
                        return bArr2 == null ? 0 : -1;
                    }
                    if (bArr2 == null) {
                        return 1;
                    }
                    if (bArr != bArr2) {
                        int length = bArr.length;
                        int length2 = bArr2.length;
                        if (length < length2) {
                            return -1;
                        }
                        if (length2 < length) {
                            return 1;
                        }
                        for (int i3 = 0; i3 < length; i3++) {
                            byte b = bArr[i3];
                            byte b2 = bArr2[i3];
                            if (b < b2) {
                                return -1;
                            }
                            if (b2 < b) {
                                return 1;
                            }
                        }
                    }
                }
            } else if (obj2 != null) {
                return -1;
            }
        }
        return i2;
    }
}
