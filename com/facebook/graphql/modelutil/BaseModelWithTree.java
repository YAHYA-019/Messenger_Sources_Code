package com.facebook.graphql.modelutil;

import X.0fH;
import X.1BK;
import X.2JZ;
import X.AbstractC08704np;
import X.AnonymousClass001;
import X.C7ka;
import X.MSr;
import X.MSt;
import X.MhO;
import android.util.SparseArray;
import com.facebook.graphql.enums.EnumHelper;
import com.facebook.graphql.model.GraphQLStory;
import com.facebook.graphql.model.GraphQLTextWithEntities;
import com.facebook.graphservice.tree.TreeJNI;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;

/* loaded from: BaseModelWithTree.class */
public abstract class BaseModelWithTree extends BaseModel {
    public Object A00;
    public final SparseArray A01;

    public BaseModelWithTree(int i, int[] iArr) {
        super(i, iArr);
        this.A01 = iArr == null ? new SparseArray(8) : null;
    }

    public static Object A00(BaseModelWithTree baseModelWithTree, Object obj, int i) {
        Object obj2;
        if (i == 571038893) {
            Object obj3 = baseModelWithTree.A00;
            if (obj3 instanceof Long) {
                return obj3;
            }
        }
        Object[] objArr = ((2JZ) baseModelWithTree).A00;
        if (objArr != null) {
            int A0G = baseModelWithTree.A0G(i);
            return A0G < 0 ? obj : objArr[A0G];
        }
        SparseArray sparseArray = baseModelWithTree.A01;
        sparseArray.getClass();
        synchronized (sparseArray) {
            obj2 = sparseArray.get(i);
        }
        return obj2;
    }

    public static final void A01(BaseModelWithTree baseModelWithTree, Object obj, int i) {
        if (i == 571038893 && (obj instanceof Long)) {
            baseModelWithTree.A00 = obj;
        }
        Object[] objArr = ((2JZ) baseModelWithTree).A00;
        if (objArr != null) {
            int A0G = baseModelWithTree.A0G(i);
            if (A0G >= 0) {
                if (obj == null) {
                    obj = BaseModel.A00;
                }
                objArr[A0G] = obj;
                return;
            }
            return;
        }
        SparseArray sparseArray = baseModelWithTree.A01;
        sparseArray.getClass();
        synchronized (sparseArray) {
            if (obj == null) {
                obj = BaseModel.A00;
            }
            sparseArray.put(i, obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final double A0H(int i) {
        double d = 0.0d;
        Object A00 = A00(this, Double.valueOf(0.0d), i);
        if (A00 != null) {
            Preconditions.checkState(1BK.A1V(A00, BaseModel.A00));
            return ((Number) A00).doubleValue();
        }
        if (isValid()) {
            d = getDoubleValue(i);
        }
        A01(this, Double.valueOf(d), i);
        return d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int A0I(int i) {
        int i2 = 0;
        Object A00 = A00(this, 0, i);
        if (A00 != null) {
            if (A00 != BaseModel.A00) {
                i2 = 1;
            }
            Preconditions.checkState(i2);
            return AnonymousClass001.A03(A00);
        }
        if (isValid()) {
            i2 = getIntValue(i);
        }
        A01(this, Integer.valueOf(i2), i);
        return i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long A0J(int i) {
        long j = 0;
        Object A00 = A00(this, 0L, i);
        if (A00 != null) {
            Preconditions.checkState(1BK.A1V(A00, BaseModel.A00));
            return AnonymousClass001.A05(A00);
        }
        if (isValid()) {
            j = getTimeValue(i);
        }
        A01(this, Long.valueOf(j), i);
        return j;
    }

    public abstract BaseModelWithTree A0K();

    public abstract BaseModelWithTree A0L();

    public final BaseModelWithTree A0M(int i) {
        return A0Q(GraphQLTextWithEntities.class, i, -618821372);
    }

    public final BaseModelWithTree A0N(int i) {
        return A0Q(GraphQLStory.class, i, -541423194);
    }

    public final BaseModelWithTree A0O(int i) {
        return A0Q(MSt.class, i, -1954025168);
    }

    public final BaseModelWithTree A0P(int i) {
        return A0Q(MSr.class, i, -1101815724);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final BaseModelWithTree A0Q(Class cls, int i, int i2) {
        Object obj = BaseModel.A00;
        Object A00 = A00(this, obj, i);
        BaseModelWithTree baseModelWithTree = null;
        if (A00 != obj) {
            if (A00 == null) {
                if (isValid()) {
                    Object obj2 = null;
                    try {
                        obj2 = getTree(i, cls, i2);
                    } catch (Exception e) {
                        0fH.A0Q(cls, "getTreeModel() failure", e, AnonymousClass001.A1Z());
                    }
                    baseModelWithTree = (BaseModelWithTree) obj2;
                }
                A01(this, baseModelWithTree, i);
                return baseModelWithTree;
            }
            baseModelWithTree = (BaseModelWithTree) A00;
        }
        return baseModelWithTree;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ImmutableList A0R(int i) {
        Object A00 = A00(this, ImmutableList.of(), i);
        if (A00 == BaseModel.A00) {
            return ImmutableList.of();
        }
        if (A00 != null) {
            return (ImmutableList) A00;
        }
        ImmutableList intList = isValid() ? getIntList(i) : ImmutableList.of();
        A01(this, intList, i);
        return intList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ImmutableList A0S(int i) {
        Object A00 = A00(this, ImmutableList.of(), i);
        if (A00 == BaseModel.A00) {
            return ImmutableList.of();
        }
        if (A00 != null) {
            return (ImmutableList) A00;
        }
        ImmutableList stringList = isValid() ? getStringList(i) : ImmutableList.of();
        A01(this, stringList, i);
        return stringList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ImmutableList A0T(int i, Class cls, int i2) {
        ImmutableList of;
        Object A00 = A00(this, ImmutableList.of(), i);
        if (A00 == BaseModel.A00) {
            return ImmutableList.of();
        }
        if (A00 != null) {
            return (ImmutableList) A00;
        }
        if (isValid()) {
            try {
                of = getTreeList(i, cls, i2);
                if (of == null) {
                    of = ImmutableList.of();
                }
            } catch (Exception e) {
                0fH.A0Q(cls, "getTreeModelList() failure", e, AnonymousClass001.A1Z());
                of = ImmutableList.of();
            }
        } else {
            of = ImmutableList.of();
        }
        A01(this, of, i);
        return of;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ImmutableList A0U(Enum r302, int i) {
        Object A00 = A00(this, ImmutableList.of(), i);
        if (A00 == BaseModel.A00) {
            return ImmutableList.of();
        }
        if (A00 != null) {
            return (ImmutableList) A00;
        }
        ImmutableList A002 = isValid() ? AbstractC08704np.A00(getStringList(i), r302) : ImmutableList.of();
        A01(this, A002, i);
        return A002;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Enum A0V(Enum r302, int i) {
        Object A00 = A00(this, r302, i);
        if (A00 == BaseModel.A00) {
            return r302;
        }
        if (A00 != null) {
            return (Enum) A00;
        }
        Enum A002 = isValid() ? EnumHelper.A00(r302, getString(i)) : r302;
        A01(this, A002, i);
        return A002;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object A0W(int i) {
        TreeJNI tree;
        int A00;
        Class A002;
        Object obj = BaseModel.A00;
        Object A003 = A00(this, obj, i);
        TreeJNI treeJNI = null;
        if (A003 != obj) {
            if (A003 != null) {
                return A003;
            }
            if (isValid() && (tree = getTree(i, TreeJNI.class, 0)) != null && (A002 = C7ka.A00((A00 = MhO.A00(tree.getTypeName())))) != null) {
                treeJNI = tree.reinterpret(A002, A00);
            }
            A01(this, treeJNI, i);
        }
        return treeJNI;
    }

    public final String A0X() {
        return A0a(3556653);
    }

    public final String A0Y() {
        return A0a(3373707);
    }

    public final String A0Z() {
        return A0a(3355);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String A0a(int i) {
        Object obj = BaseModel.A00;
        Object A00 = A00(this, obj, i);
        if (A00 == obj) {
            return null;
        }
        if (A00 != null) {
            return (String) A00;
        }
        String string = isValid() ? getString(i) : null;
        A01(this, string, i);
        return string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean A0b(int i) {
        Object A00 = A00(this, Boolean.FALSE, i);
        boolean z = false;
        if (A00 != null) {
            if (A00 != BaseModel.A00) {
                z = true;
            }
            Preconditions.checkState(z);
            return AnonymousClass001.A1V(A00);
        }
        if (isValid()) {
            z = getBooleanValue(i);
        }
        A01(this, Boolean.valueOf(z), i);
        return z;
    }
}
