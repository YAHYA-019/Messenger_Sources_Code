package androidx.lifecycle;

import X.0CV;
import X.0Pz;
import X.11T;
import X.1BK;
import X.AnonymousClass001;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: Lifecycling.class */
public final class Lifecycling {
    public static final Lifecycling INSTANCE = new Object();
    public static final Map callbackCache = new HashMap();
    public static final Map classToAdapters = new HashMap();

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Throwable, androidx.lifecycle.GeneratedAdapter] */
    private final GeneratedAdapter createGeneratedAdapter(Constructor constructor, Object obj) {
        ?? r0;
        try {
            Object newInstance = constructor.newInstance(obj);
            11T.A0A(newInstance);
            r0 = (GeneratedAdapter) newInstance;
            return r0;
        } catch (IllegalAccessException unused) {
            throw AnonymousClass001.A0U(r0);
        } catch (InstantiationException unused2) {
            throw AnonymousClass001.A0U(r0);
        } catch (InvocationTargetException unused3) {
            throw AnonymousClass001.A0U(r0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v102, types: [java.lang.reflect.AccessibleObject] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v87, types: [java.lang.Class, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Throwable] */
    private final int getObserverConstructorType(Class cls) {
        int i;
        Map map = callbackCache;
        Number number = (Number) map.get(cls);
        if (number != null) {
            return number.intValue();
        }
        ?? canonicalName = cls.getCanonicalName();
        if (canonicalName != 0) {
            try {
                Package r0 = cls.getPackage();
                String canonicalName2 = cls.getCanonicalName();
                String name = r0 != null ? r0.getName() : "";
                11T.A0C(name);
                int length = name.length();
                if (length != 0) {
                    11T.A0A(canonicalName2);
                    canonicalName2 = canonicalName2.substring(length + 1);
                    11T.A0A(canonicalName2);
                }
                11T.A0C(canonicalName2);
                String A0W = 0Pz.A0W(0CV.A0W(canonicalName2, ".", "_"), "_LifecycleAdapter");
                if (length != 0) {
                    A0W = 0Pz.A0Y(name, A0W, '.');
                }
                ?? cls2 = Class.forName(A0W);
                11T.A0I((Object) cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
                Constructor declaredConstructor = cls2.getDeclaredConstructor(cls);
                if (!declaredConstructor.isAccessible()) {
                    canonicalName = declaredConstructor;
                    canonicalName.setAccessible(true);
                }
                classToAdapters.put(cls, 11T.A03(declaredConstructor));
            } catch (ClassNotFoundException unused) {
                if (!ClassesInfoCache.sInstance.hasLifecycleMethods(cls)) {
                    Class superclass = cls.getSuperclass();
                    ArrayList arrayList = null;
                    if (superclass != null && LifecycleObserver.class.isAssignableFrom(superclass)) {
                        if (getObserverConstructorType(superclass) != 1) {
                            Object obj = classToAdapters.get(superclass);
                            11T.A0D(obj);
                            arrayList = 1BK.A17((Collection) obj);
                        }
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    11T.A0A(interfaces);
                    int i2 = 0;
                    int length2 = interfaces.length;
                    while (true) {
                        if (i2 < length2) {
                            Class<?> cls3 = interfaces[i2];
                            if (cls3 != null && LifecycleObserver.class.isAssignableFrom(cls3)) {
                                if (getObserverConstructorType(cls3) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = AnonymousClass001.A0s();
                                }
                                Object obj2 = classToAdapters.get(cls3);
                                11T.A0D(obj2);
                                arrayList.addAll((Collection) obj2);
                            }
                            i2++;
                        } else if (arrayList != null) {
                            classToAdapters.put(cls, arrayList);
                        }
                    }
                }
            } catch (NoSuchMethodException unused2) {
                throw AnonymousClass001.A0U(canonicalName);
            }
            i = 2;
            map.put(cls, Integer.valueOf(i));
            return i;
        }
        i = 1;
        map.put(cls, Integer.valueOf(i));
        return i;
    }

    public static final LifecycleEventObserver lifecycleEventObserver(Object obj) {
        LifecycleEventObserver reflectiveGenericLifecycleObserver;
        DefaultLifecycleObserver defaultLifecycleObserver;
        LifecycleEventObserver lifecycleEventObserver;
        boolean z = obj instanceof DefaultLifecycleObserver;
        if (obj instanceof LifecycleEventObserver) {
            if (z) {
                defaultLifecycleObserver = (DefaultLifecycleObserver) obj;
                lifecycleEventObserver = (LifecycleEventObserver) obj;
                reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter(defaultLifecycleObserver, lifecycleEventObserver);
            }
            return (LifecycleEventObserver) obj;
        }
        if (z) {
            defaultLifecycleObserver = (DefaultLifecycleObserver) obj;
            lifecycleEventObserver = null;
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter(defaultLifecycleObserver, lifecycleEventObserver);
        } else {
            Class<?> cls = obj.getClass();
            Lifecycling lifecycling = INSTANCE;
            if (lifecycling.getObserverConstructorType(cls) == 2) {
                Object obj2 = classToAdapters.get(cls);
                11T.A0D(obj2);
                List list = (List) obj2;
                if (list.size() != 1) {
                    int size = list.size();
                    GeneratedAdapter[] generatedAdapterArr = new GeneratedAdapter[size];
                    for (int i = 0; i < size; i++) {
                        generatedAdapterArr[i] = lifecycling.createGeneratedAdapter((Constructor) list.get(i), obj);
                    }
                    obj = new CompositeGeneratedAdaptersObserver(generatedAdapterArr);
                    return (LifecycleEventObserver) obj;
                }
                reflectiveGenericLifecycleObserver = new SingleGeneratedAdapterObserver(lifecycling.createGeneratedAdapter((Constructor) list.get(0), obj));
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(obj);
            }
        }
        return reflectiveGenericLifecycleObserver;
    }
}
