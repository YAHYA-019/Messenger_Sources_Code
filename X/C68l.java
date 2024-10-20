package X;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.68l, reason: invalid class name */
/* loaded from: 68l.class */
public final class C68l implements Iterable, Serializable {
    public static final long serialVersionUID = 2;
    public final java.util.Map _aliasDefs;
    public final java.util.Map _aliasMapping;
    public final boolean _caseInsensitive;
    public Object[] _hashArea;
    public int _hashMask;
    public final Locale _locale;
    public final 68S[] _propsInOrder;
    public int _size;
    public int _spillCount;

    public C68l(68S r302, C68l c68l, int i, int i2) {
        this._caseInsensitive = c68l._caseInsensitive;
        this._locale = c68l._locale;
        this._hashMask = c68l._hashMask;
        this._size = c68l._size;
        this._spillCount = c68l._spillCount;
        this._aliasDefs = c68l._aliasDefs;
        this._aliasMapping = c68l._aliasMapping;
        Object[] objArr = c68l._hashArea;
        this._hashArea = Arrays.copyOf(objArr, objArr.length);
        68S[] r0 = c68l._propsInOrder;
        68S[] r02 = (68S[]) Arrays.copyOf(r0, r0.length);
        this._propsInOrder = r02;
        this._hashArea[i] = r302;
        r02[i2] = r302;
    }

    public C68l(68S r302, C68l c68l, String str, int i) {
        this._caseInsensitive = c68l._caseInsensitive;
        this._locale = c68l._locale;
        this._hashMask = c68l._hashMask;
        this._size = c68l._size;
        this._spillCount = c68l._spillCount;
        this._aliasDefs = c68l._aliasDefs;
        this._aliasMapping = c68l._aliasMapping;
        Object[] objArr = c68l._hashArea;
        this._hashArea = Arrays.copyOf(objArr, objArr.length);
        68S[] r0 = c68l._propsInOrder;
        int length = r0.length;
        68S[] r02 = (68S[]) Arrays.copyOf(r0, length + 1);
        this._propsInOrder = r02;
        r02[length] = r302;
        int i2 = this._hashMask + 1;
        int i3 = i << 1;
        Object[] objArr2 = this._hashArea;
        if (objArr2[i3] != null) {
            i3 = ((i >> 1) + i2) << 1;
            if (objArr2[i3] != null) {
                int i4 = (i2 + (i2 >> 1)) << 1;
                int i5 = this._spillCount;
                i3 = i4 + i5;
                this._spillCount = i5 + 2;
                int length2 = objArr2.length;
                if (i3 >= length2) {
                    objArr2 = Arrays.copyOf(objArr2, length2 + 4);
                    this._hashArea = objArr2;
                }
            }
        }
        objArr2[i3] = str;
        objArr2[i3 + 1] = r302;
    }

    public C68l(C68l c68l, boolean z) {
        this._caseInsensitive = z;
        this._locale = c68l._locale;
        this._aliasDefs = c68l._aliasDefs;
        this._aliasMapping = c68l._aliasMapping;
        68S[] r0 = c68l._propsInOrder;
        68S[] r02 = (68S[]) Arrays.copyOf(r0, r0.length);
        this._propsInOrder = r02;
        A01(this, Arrays.asList(r02));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r308v0 */
    /* JADX WARN: Type inference failed for: r308v1 */
    /* JADX WARN: Type inference failed for: r308v2, types: [java.util.AbstractMap] */
    public C68l(Collection collection, Locale locale, java.util.Map map, boolean z) {
        java.util.Map emptyMap;
        this._caseInsensitive = z;
        this._propsInOrder = (68S[]) collection.toArray(new 68S[collection.size()]);
        this._aliasDefs = map;
        this._locale = locale;
        if (map == null || map.isEmpty()) {
            emptyMap = Collections.emptyMap();
        } else {
            emptyMap = AnonymousClass001.A0u();
            Iterator A0y = AnonymousClass001.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0y);
                String A0j = AnonymousClass001.A0j(A0z);
                A0j = z ? A0j.toLowerCase(locale) : A0j;
                Iterator it = ((List) A0z.getValue()).iterator();
                while (it.hasNext()) {
                    String str = ((C26G) it.next())._simpleName;
                    if (z) {
                        str = str.toLowerCase(locale);
                    }
                    emptyMap.put(str, A0j);
                }
            }
        }
        this._aliasMapping = emptyMap;
        A01(this, collection);
    }

    public static final int A00(68S r301, C68l c68l) {
        68S[] r0 = c68l._propsInOrder;
        int length = r0.length;
        for (int i = 0; i < length; i++) {
            if (r0[i] == r301) {
                return i;
            }
        }
        throw AnonymousClass001.A0N(0Pz.A0j("Illegal state: property '", r301._propName._simpleName, "' missing from _propsInOrder"));
    }

    public static void A01(C68l c68l, Collection collection) {
        int i;
        int size = collection.size();
        c68l._size = size;
        if (size <= 5) {
            i = 8;
        } else {
            i = 16;
            if (size > 12) {
                int i2 = size + (size >> 2);
                int i3 = 32;
                while (true) {
                    i = i3;
                    if (i >= i2) {
                        break;
                    } else {
                        i3 = i + i;
                    }
                }
            }
        }
        c68l._hashMask = i - 1;
        int i4 = (i >> 1) + i;
        Object[] objArr = new Object[i4 * 2];
        Iterator it = collection.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            68S r0 = (68S) it.next();
            if (r0 != null) {
                boolean z = c68l._caseInsensitive;
                String str = r0._propName._simpleName;
                if (z) {
                    str = str.toLowerCase(c68l._locale);
                }
                int hashCode = str.hashCode() & c68l._hashMask;
                int i6 = hashCode << 1;
                if (objArr[i6] != null) {
                    i6 = ((hashCode >> 1) + i) << 1;
                    if (objArr[i6] != null) {
                        i6 = (i4 << 1) + i5;
                        i5 += 2;
                        if (i6 >= objArr.length) {
                            objArr = Arrays.copyOf(objArr, objArr.length + 4);
                        }
                    }
                }
                objArr[i6] = str;
                objArr[i6 + 1] = r0;
            }
        }
        c68l._hashArea = objArr;
        c68l._spillCount = i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object[]] */
    public 68S A02(String str) {
        68S r312;
        if (str == null) {
            throw AnonymousClass001.A0L("Cannot pass null property name");
        }
        if (this._caseInsensitive) {
            str = str.toLowerCase(this._locale);
        }
        int hashCode = str.hashCode();
        int i = this._hashMask;
        int i2 = hashCode & i;
        int i3 = i2 << 1;
        String[] strArr = this._hashArea;
        String str2 = strArr[i3];
        if (str2 != str && !str.equals(str2)) {
            if (str2 != null) {
                int i4 = i + 1;
                i3 = ((i2 >> 1) + i4) << 1;
                String str3 = strArr[i3];
                if (!str.equals(str3)) {
                    if (str3 != null) {
                        i3 = (i4 + (i4 >> 1)) << 1;
                        int i5 = this._spillCount + i3;
                        while (i3 < i5) {
                            String str4 = strArr[i3];
                            if (str4 == str || str.equals(str4)) {
                                break;
                            }
                            i3 += 2;
                        }
                    }
                }
            }
            String str5 = (String) this._aliasMapping.get(str);
            r312 = null;
            if (str5 != null) {
                int hashCode2 = str5.hashCode();
                int i6 = this._hashMask;
                int i7 = hashCode2 & i6;
                i3 = i7 << 1;
                strArr = this._hashArea;
                String str6 = strArr[i3];
                if (!str5.equals(str6)) {
                    if (str6 != null) {
                        int i8 = i6 + 1;
                        i3 = ((i7 >> 1) + i8) << 1;
                        String str7 = strArr[i3];
                        if (!str5.equals(str7)) {
                            if (str7 != null) {
                                i3 = (i8 + (i8 >> 1)) << 1;
                                int i9 = this._spillCount + i3;
                                while (i3 < i9) {
                                    String str8 = strArr[i3];
                                    if (str8 != str5 && !str5.equals(str8)) {
                                        i3 += 2;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return r312;
        }
        r312 = (68S) strArr[i3 + 1];
        return r312;
    }

    public C68l A03(68S r302) {
        boolean z = this._caseInsensitive;
        String str = r302._propName._simpleName;
        if (z) {
            str = str.toLowerCase(this._locale);
        }
        Object[] objArr = this._hashArea;
        int length = objArr.length;
        int i = 1;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return new C68l(r302, this, str, str.hashCode() & this._hashMask);
            }
            68S r0 = (68S) objArr[i2];
            if (r0 != null && r0._propName._simpleName.equals(str)) {
                return new C68l(r302, this, i2, A00(r0, this));
            }
            i = i2 + 2;
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        ArrayList arrayList = new ArrayList(this._size);
        Object[] objArr = this._hashArea;
        int length = objArr.length;
        int i = 1;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return arrayList.iterator();
            }
            Object obj = objArr[i2];
            if (obj != null) {
                arrayList.add(obj);
            }
            i = i2 + 2;
        }
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Properties=[");
        Iterator it = iterator();
        int i = 0;
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                break;
            }
            68S r0 = (68S) it.next();
            int i3 = i2 + 1;
            if (i2 > 0) {
                AnonymousClass001.A1H(A0k);
            }
            A0k.append(r0._propName._simpleName);
            A0k.append('(');
            A0k.append(r0._type);
            A0k.append(')');
            i = i3;
        }
        A0k.append(']');
        if (!this._aliasDefs.isEmpty()) {
            A0k.append("(aliases: ");
            A0k.append(this._aliasDefs);
            A0k.append(")");
        }
        return A0k.toString();
    }
}
