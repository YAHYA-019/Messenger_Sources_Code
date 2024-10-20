package com.facebook.pando;

import X.1NS;
import X.AnonymousClass001;
import X.C0il;
import com.facebook.jni.HybridClassBase;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: TreeUpdaterJNI.class */
public class TreeUpdaterJNI extends HybridClassBase {
    public static final TreeUpdaterJNI $redex_init_class = null;

    static {
        C0il.A0B("pando-jni");
    }

    public TreeUpdaterJNI(String str, Map map) {
        initHybridForRawBuilder();
        constructTreeWithArgs(map);
    }

    public TreeUpdaterJNI(Map map, TreeJNI treeJNI) {
        initHybridForUpdateBuilder(treeJNI);
        constructTreeWithArgs(map);
    }

    private final native void build();

    private void constructTreeWithArgs(Map map) {
        String A0j;
        Double d;
        String A0j2;
        String str;
        long j;
        int A01;
        Iterator A0y = AnonymousClass001.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            Object value = A0z.getValue();
            if (value == null) {
                setNull(AnonymousClass001.A0j(A0z));
            } else if (value instanceof Integer) {
                setInt(AnonymousClass001.A0j(A0z), (Integer) value);
            } else if (value instanceof Long) {
                setLong(AnonymousClass001.A0j(A0z), (Long) value);
            } else {
                if (value instanceof Double) {
                    A0j = AnonymousClass001.A0j(A0z);
                    d = (Double) value;
                } else if (value instanceof Float) {
                    A0j = AnonymousClass001.A0j(A0z);
                    d = Double.valueOf(((Number) value).doubleValue());
                } else if (value instanceof Boolean) {
                    setBoolean(AnonymousClass001.A0j(A0z), (Boolean) value);
                } else {
                    if (value instanceof String) {
                        A0j2 = AnonymousClass001.A0j(A0z);
                        str = (String) value;
                    } else if (value instanceof Enum) {
                        A0j2 = AnonymousClass001.A0j(A0z);
                        str = value.toString();
                    } else if (value instanceof TreeUpdaterJNI) {
                        setTreeUpdater(AnonymousClass001.A0j(A0z), (TreeUpdaterJNI) value);
                    } else if (value instanceof Iterable) {
                        String A0j3 = AnonymousClass001.A0j(A0z);
                        Iterable iterable = (Iterable) value;
                        if (iterable instanceof Collection) {
                            A01 = ((Collection) iterable).size();
                        } else {
                            Iterator it = iterable.iterator();
                            long j2 = 0;
                            while (true) {
                                j = j2;
                                if (!it.hasNext()) {
                                    break;
                                }
                                it.next();
                                j2 = j + 1;
                            }
                            A01 = 1NS.A01(j);
                        }
                        if (A01 == 0) {
                            setEmptyList(A0j3);
                        } else {
                            Object next = iterable.iterator().next();
                            if (next instanceof Integer) {
                                setIntList(A0j3, iterable);
                            } else if (next instanceof Long) {
                                setLongList(A0j3, iterable);
                            } else if (next instanceof Double) {
                                setDoubleList(A0j3, iterable);
                            } else if (next instanceof Boolean) {
                                setBooleanList(A0j3, iterable);
                            } else if (next instanceof String) {
                                setStringList(A0j3, iterable);
                            } else if (next instanceof TreeUpdaterJNI) {
                                setTreeUpdaterList(A0j3, iterable);
                            }
                        }
                    }
                    setString(A0j2, str);
                }
                setDouble(A0j, d);
            }
        }
        build();
    }

    private native void initHybridForRawBuilder();

    private native void initHybridForUpdateBuilder(TreeJNI treeJNI);

    private final native void setBoolean(String str, Boolean bool);

    private final native void setBooleanList(String str, Iterable iterable);

    private final native void setDouble(String str, Double d);

    private final native void setDoubleList(String str, Iterable iterable);

    private final native void setEmptyList(String str);

    private final native void setInt(String str, Integer num);

    private final native void setIntList(String str, Iterable iterable);

    private final native void setLong(String str, Long l);

    private final native void setLongList(String str, Iterable iterable);

    private final native void setNull(String str);

    private final native void setString(String str, String str2);

    private final native void setStringList(String str, Iterable iterable);

    private final native void setTreeUpdater(String str, TreeUpdaterJNI treeUpdaterJNI);

    private final native void setTreeUpdaterList(String str, Iterable iterable);

    public final native TreeJNI applyToTree(TreeJNI treeJNI);

    public final native TreeJNI treeFromUpdater(Class cls);
}
