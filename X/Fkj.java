package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: Fkj.class */
public final class Fkj implements GKG {
    public Object A00;
    public final List A01 = AbF.A1F();

    public Fkj(Object obj) {
        if (obj instanceof java.util.Map) {
            this.A00 = DKC.A1C((java.util.Map) obj);
        } else {
            this.A00 = obj;
        }
    }

    public static ERT A00(String str, Locale locale, Object[] objArr) {
        return new Exception(String.format(locale, str, objArr));
    }

    public static Integer A01(Object obj, List list) {
        if (obj instanceof Integer) {
            Integer num = (Integer) obj;
            if (num.intValue() < list.size()) {
                return num;
            }
            return null;
        }
        if (!(obj instanceof String)) {
            throw AnonymousClass001.A0T(String.format(Locale.getDefault(), "Infra error: Found key in state's key path that is neither an integer nor a string, but %s. Please report to the Native Template Users group with the error stack trace.", obj == null ? "null" : obj.getClass().toString()));
        }
        String str = (String) obj;
        if (str.charAt(0) != ':') {
            throw A00("De-referencing a vec requires an integer key. Found: key \"%s\" while de-referencing vec:\n%s\nSee https://fburl.com/nt_state_debug for tips to resolve this bug.", Locale.getDefault(), DKG.A1b(list, obj));
        }
        String substring = str.substring(1);
        for (int i = 0; i < list.size(); i++) {
            Object obj2 = list.get(i);
            if (!(obj2 instanceof java.util.Map)) {
                throw A00("Elements in keyed vector needs to be shapes. Found:\n%s\nSee https://fburl.com/nt_state_debug for tips to resolve this bug.", Locale.getDefault(), new Object[]{obj2.toString()});
            }
            if (((java.util.Map) obj2).get("__key").equals(substring)) {
                return Integer.valueOf(i);
            }
        }
        return null;
    }

    private Object A02(F4M f4m, Object obj) {
        Object[] objArr = f4m.A00;
        int length = objArr.length;
        if (length == 0) {
            throw AnonymousClass001.A0L("The key path is empty. Cannot get non leaf keys.");
        }
        for (Object obj2 : Arrays.copyOfRange(objArr, 0, length - 1)) {
            obj = A03(obj2, obj);
        }
        return obj;
    }

    private Object A03(Object obj, Object obj2) {
        if (obj2 instanceof java.util.Map) {
            java.util.Map map = (java.util.Map) obj2;
            if (map.containsKey(obj)) {
                return map.get(obj);
            }
            throw A00("Cannot find key \"%s\" in dict:\n%s\nSee https://fburl.com/nt_state_debug for tips to resolve this bug.", Locale.getDefault(), DKG.A1b(map, obj));
        }
        if (!(obj2 instanceof List)) {
            Locale locale = Locale.getDefault();
            Object[] objArr = {obj.toString()};
            if (obj2 == null) {
                throw A00("Trying to traverse object with key %s but the object is null.\nSee https://fburl.com/nt_state_debug for tips to resolve this bug.", locale, objArr);
            }
            throw A00("Trying to traverse object with key %s but the object is neither a dict or a vec.\nSee https://fburl.com/nt_state_debug for tips to resolve this bug.", locale, objArr);
        }
        List list = (List) obj2;
        Integer A01 = A01(obj, list);
        if (A01 != null) {
            return list.get(A01.intValue());
        }
        if (obj instanceof Integer) {
            throw A00("Cannot find key %d in vec:\n%s\nSee https://fburl.com/nt_state_debug for tips to resolve this bug.", Locale.getDefault(), DKG.A1b(list, obj));
        }
        boolean z = obj instanceof String;
        Locale locale2 = Locale.getDefault();
        if (z) {
            throw A00("Cannot find key \"%s\" in keyed vec:\n%s\nSee https://fburl.com/nt_state_debug for tips to resolve this bug.", locale2, DKG.A1b(list, obj));
        }
        throw AnonymousClass001.A0T(String.format(locale2, "Infra error: Found key in state's key path that is neither an integer nor a string. Please report to the Native Template Users group with the error stack trace.", new Object[0]));
    }

    public void A6B(Fwl fwl, GFH gfh) {
        if (gfh.Bgg(this)) {
            this.A01.add(gfh);
        } else {
            0fH.A0B(Fkj.class, "Could not register state listener");
        }
    }

    public boolean ARR(Fwl fwl, F4M f4m) {
        RuntimeException A00;
        Boolean A0K;
        Object[] objArr = f4m.A00;
        int length = objArr.length;
        if (length == 0) {
            throw AnonymousClass001.A0L("It's invalid to check existence with empty keypath.");
        }
        try {
            Object obj = objArr[length - 1];
            Object A02 = A02(f4m, this.A00);
            if (!(A02 instanceof java.util.Map)) {
                if (A02 instanceof List) {
                    List list = (List) A02;
                    A0K = AnonymousClass001.A0K();
                    Integer A01 = A01(obj, list);
                    if (A01 != null) {
                        list.get(A01.intValue());
                    } else if ((obj instanceof Integer) || (obj instanceof String)) {
                        A0K = false;
                    } else {
                        A00 = AnonymousClass001.A0T(String.format(Locale.getDefault(), "Infra error: Found key in state's key path that is neither an integer nor a string. Please report to the Native Template Users group with the error stack trace.", new Object[0]));
                    }
                } else {
                    A00 = (A02 == JSONObject.NULL || A02 == null) ? A00("Trying to traverse object with key %s but the object is null.\nSee https://fburl.com/nt_state_debug for tips to resolve this bug.", Locale.getDefault(), new Object[]{obj.toString()}) : A00("Trying to traverse object with key %s but the object is neither a dict or a vec.\nSee https://fburl.com/nt_state_debug for tips to resolve this bug.", Locale.getDefault(), new Object[]{obj.toString()});
                }
                throw A00;
            }
            java.util.Map map = (java.util.Map) A02;
            A0K = AnonymousClass001.A0K();
            if (map.containsKey(obj)) {
                map.get(obj);
            } else {
                A0K = 1BK.A0d();
            }
            return A0K.booleanValue();
        } catch (ERT e) {
            FkZ.A00(fwl.A02.A01(), e, (String) null, true);
            return false;
        }
    }

    public Object AqD(Fwl fwl) {
        Object obj;
        synchronized (this) {
            obj = this.A00;
        }
        return obj;
    }

    public Object BIm(Fwl fwl, F4M f4m) {
        Object[] objArr = f4m.A00;
        int length = objArr.length;
        if (length == 0) {
            return this.A00;
        }
        try {
            return A03(objArr[length - 1], A02(f4m, this.A00));
        } catch (ERT e) {
            FkZ.A00(fwl.A02.A01(), e, (String) null, true);
            return null;
        }
    }

    public Object Cvz(Fwl fwl, F4M f4m, Object obj) {
        Object[] objArr = f4m.A00;
        int length = objArr.length;
        if (length == 0) {
            return obj;
        }
        Object obj2 = this.A00;
        if (obj2 instanceof java.util.Map) {
            obj2 = DKC.A1C((java.util.Map) obj2);
        } else if (obj2 instanceof List) {
            obj2 = 1BK.A17((Collection) obj2);
        }
        Object obj3 = objArr[length - 1];
        try {
            Object A02 = A02(f4m, obj2);
            if (A02 instanceof java.util.Map) {
                java.util.Map map = (java.util.Map) A02;
                if (map.containsKey(obj3)) {
                    map.put(obj3, obj);
                    return obj2;
                }
                FkZ.A00(fwl.A02.A01(), A00("Cannot find key %s in dict:\n%s\nSee https://fburl.com/nt_state_debug for tips to resolve this bug.", Locale.getDefault(), DKG.A1b(map, obj3)), (String) null, true);
                return obj2;
            }
            if (!(A02 instanceof List)) {
                throw AnonymousClass001.A0L(String.format(Locale.getDefault(), "Unable to update object of type %s (at key: %s)- expected list or map.", A02 == null ? "null" : AnonymousClass001.A0X(A02), obj3));
            }
            List list = (List) A02;
            Integer A01 = A01(obj3, list);
            if (A01 == null) {
                FkZ.A00(fwl.A02.A01(), A00("not a valid num or key", Locale.getDefault(), new Object[]{obj3}), (String) null, true);
                return obj2;
            }
            int intValue = A01.intValue();
            if (intValue < list.size()) {
                list.set(intValue, obj);
                return obj2;
            }
            FkZ.A00(fwl.A02.A01(), A00("Cannot find key %d in vec:\n%s\nSee https://fburl.com/nt_state_debug for tips to resolve this bug.", Locale.getDefault(), DKG.A1b(list, A01)), (String) null, true);
            return obj2;
        } catch (ERT e) {
            FkZ.A00(fwl.A02.A01(), e, (String) null, true);
            return obj2;
        }
    }

    public void D7o(Object obj) {
        synchronized (this) {
            if (obj instanceof java.util.Map) {
                HashMap A1C = DKC.A1C((java.util.Map) this.A00);
                A1C.putAll((java.util.Map) obj);
                obj = Collections.unmodifiableMap(A1C);
            }
            this.A00 = obj;
        }
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            if (!((GFH) it.next()).Bgg(this)) {
                it.remove();
            }
        }
    }
}
