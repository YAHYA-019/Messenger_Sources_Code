package X;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;

/* loaded from: LgQ.class */
public final class LgQ implements 5xY {
    public final MDf A00;
    public final L2z A01;
    public final LgR A02;
    public final LgP A03;
    public final List A04;

    public LgQ(MDf mDf, L2z l2z, LgR lgR, LgP lgP, List list) {
        this.A01 = l2z;
        this.A00 = mDf;
        this.A02 = lgR;
        this.A03 = lgP;
        this.A04 = list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x015a, code lost:
    
        if (r0.isPrimitive() == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x017f, code lost:
    
        if (java.lang.reflect.Modifier.isFinal(r0) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01b1, code lost:
    
        if (r339 == null) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02c5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0204  */
    /* JADX WARN: Type inference failed for: r0v154, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.LinkedHashMap A00(com.google.gson.Gson r302, com.google.gson.reflect.TypeToken r303, java.lang.Class r304, boolean r305) {
        /*
            Method dump skipped, instructions count: 886
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LgQ.A00(com.google.gson.Gson, com.google.gson.reflect.TypeToken, java.lang.Class, boolean):java.util.LinkedHashMap");
    }

    private boolean A01(Field field, boolean z) {
        LgR lgR = this.A02;
        if (LgR.A00(field.getType())) {
            return false;
        }
        Iterator it = (z ? lgR.A01 : lgR.A00).iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass001.A0Q("shouldSkipClass");
        }
        if ((136 & field.getModifiers()) != 0 || field.isSynthetic() || LgR.A00(field.getType())) {
            return false;
        }
        List list = z ? lgR.A01 : lgR.A00;
        if (list.isEmpty()) {
            return true;
        }
        Iterator it2 = list.iterator();
        if (!it2.hasNext()) {
            return true;
        }
        it2.next();
        throw AnonymousClass001.A0Q("shouldSkipField");
    }

    public TypeAdapter create(Gson gson, TypeToken typeToken) {
        Class cls = typeToken.rawType;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        KYi.A00(this.A04);
        KDz kDz = LBs.A00;
        if (kDz instanceof KDz) {
            try {
                if (AnonymousClass001.A1V(AnonymousClass001.A0S(cls, kDz.A03))) {
                    java.util.Map map = KDu.A03;
                    return new KDu(cls, A00(gson, typeToken, cls, true));
                }
            } catch (ReflectiveOperationException e) {
                throw 1BK.A0s("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            }
        }
        return new KDt(this.A01.A01(typeToken), A00(gson, typeToken, cls, false));
    }
}
