package androidx.lifecycle;

import X.1BK;
import X.1BL;
import X.AnonymousClass001;
import X.AnonymousClass002;
import androidx.lifecycle.Lifecycle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: ClassesInfoCache.class */
public final class ClassesInfoCache {
    public static ClassesInfoCache sInstance = new ClassesInfoCache();
    public final Map mCallbackMap = new HashMap();
    public final Map mHasLifecycleMethods = new HashMap();

    /* loaded from: ClassesInfoCache$CallbackInfo.class */
    public class CallbackInfo {
        public final Map mEventToHandlers = new HashMap();
        public final Map mHandlerToEvent;

        public CallbackInfo(Map map) {
            this.mHandlerToEvent = map;
            for (Map.Entry entry : map.entrySet()) {
                Object value = entry.getValue();
                List list = (List) this.mEventToHandlers.get(value);
                if (list == null) {
                    list = new ArrayList();
                    this.mEventToHandlers.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Throwable] */
        /* JADX WARN: Type inference failed for: r0v16, types: [int] */
        /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ClassesInfoCache$MethodReference] */
        /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Throwable] */
        public static void invokeMethodsForEvent(List list, LifecycleOwner lifecycleOwner, Lifecycle.Event event, Object obj) {
            Method method;
            Object[] objArr;
            if (list == null) {
                return;
            }
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    return;
                }
                ?? r0 = (MethodReference) list.get(size);
                try {
                    r0 = r0.mCallType;
                    if (r0 == 0) {
                        method = r0.mMethod;
                        objArr = new Object[0];
                    } else if (r0 != 1) {
                        method = r0.mMethod;
                        objArr = new Object[]{lifecycleOwner, event};
                    } else {
                        method = r0.mMethod;
                        objArr = new Object[]{lifecycleOwner};
                    }
                    method.invoke(obj, objArr);
                } catch (IllegalAccessException unused) {
                    throw AnonymousClass001.A0U(r0);
                } catch (InvocationTargetException unused2) {
                    throw 1BK.A0s("Failed to call observer method", r0.getCause());
                }
            }
        }
    }

    /* loaded from: ClassesInfoCache$MethodReference.class */
    public final class MethodReference {
        public final int mCallType;
        public final Method mMethod;

        public MethodReference(int i, Method method) {
            this.mCallType = i;
            this.mMethod = method;
            method.setAccessible(true);
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this != obj) {
                if (!(obj instanceof MethodReference)) {
                    return false;
                }
                MethodReference methodReference = (MethodReference) obj;
                if (this.mCallType == methodReference.mCallType && this.mMethod.getName().equals(methodReference.mMethod.getName())) {
                    return true;
                }
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return (this.mCallType * 31) + this.mMethod.getName().hashCode();
        }
    }

    private CallbackInfo createInfo(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            hashMap.putAll(getInfo(superclass).mHandlerToEvent);
        }
        for (Class cls2 : cls.getInterfaces()) {
            Iterator it = getInfo(cls2).mHandlerToEvent.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(it);
                verifyAndPutHandler(hashMap, (MethodReference) A0z.getKey(), (Lifecycle.Event) A0z.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            OnLifecycleEvent onLifecycleEvent = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                int length = parameterTypes.length;
                if (length <= 0) {
                    i = 0;
                } else {
                    if (!LifecycleOwner.class.isAssignableFrom(parameterTypes[0])) {
                        throw AnonymousClass001.A0L("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                Lifecycle.Event value = onLifecycleEvent.value();
                if (length > 1) {
                    if (!Lifecycle.Event.class.isAssignableFrom(parameterTypes[1])) {
                        throw AnonymousClass001.A0L("invalid parameter type. second arg must be an event");
                    }
                    if (value != Lifecycle.Event.ON_ANY) {
                        throw AnonymousClass001.A0L("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                    if (length > 2) {
                        throw AnonymousClass001.A0L("cannot have more than 2 params");
                    }
                }
                verifyAndPutHandler(hashMap, new MethodReference(i, method), value, cls);
                z = true;
            }
        }
        CallbackInfo callbackInfo = new CallbackInfo(hashMap);
        this.mCallbackMap.put(cls, callbackInfo);
        this.mHasLifecycleMethods.put(cls, Boolean.valueOf(z));
        return callbackInfo;
    }

    private void verifyAndPutHandler(Map map, MethodReference methodReference, Lifecycle.Event event, Class cls) {
        Object obj = map.get(methodReference);
        if (obj == null) {
            map.put(methodReference, event);
            return;
        }
        if (event != obj) {
            Method method = methodReference.mMethod;
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("Method ");
            A0k.append(method.getName());
            1BL.A1C(cls, " in ", A0k);
            A0k.append(" already declared with different @OnLifecycleEvent value: previous value ");
            A0k.append(obj);
            throw AnonymousClass002.A0C(event, ", new value ", A0k);
        }
    }

    public CallbackInfo getInfo(Class cls) {
        CallbackInfo callbackInfo = (CallbackInfo) this.mCallbackMap.get(cls);
        if (callbackInfo == null) {
            callbackInfo = createInfo(cls, null);
        }
        return callbackInfo;
    }

    public boolean hasLifecycleMethods(Class cls) {
        Boolean bool = (Boolean) this.mHasLifecycleMethods.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Method[] declaredMethods = cls.getDeclaredMethods();
            for (Method method : declaredMethods) {
                if (method.getAnnotation(OnLifecycleEvent.class) != null) {
                    createInfo(cls, declaredMethods);
                    return true;
                }
            }
            this.mHasLifecycleMethods.put(cls, false);
            return false;
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }
}
