package X;

import android.os.SystemClock;
import android.view.InputEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManagerGlobal;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0ck, reason: invalid class name */
/* loaded from: 0ck.class */
public final class C0ck {
    public static final C0ck A03 = new C0ck();
    public C0uw A00;
    public Class A01;
    public final boolean A02;

    public C0ck() {
        boolean z;
        WindowManagerGlobal windowManagerGlobal;
        Field declaredField;
        Class<?> cls;
        Field declaredField2;
        Object obj;
        try {
            windowManagerGlobal = WindowManagerGlobal.getInstance();
            declaredField = Field.class.getDeclaredField("accessFlags");
            declaredField.setAccessible(true);
            cls = windowManagerGlobal.getClass();
            declaredField2 = cls.getDeclaredField("mRoots");
            declaredField2.setAccessible(true);
            declaredField.setInt(declaredField2, declaredField2.getModifiers() & (-17));
            obj = declaredField2.get(windowManagerGlobal);
        } catch (Throwable unused) {
            z = false;
        }
        if (obj != null) {
            final ArrayList arrayList = (ArrayList) obj;
            declaredField2.set(windowManagerGlobal, new ArrayList(arrayList) { // from class: X.0ci
                @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
                public /* bridge */ /* synthetic */ boolean add(Object obj2) {
                    C0ck c0ck = C0ck.A03;
                    return super.add(obj2);
                }

                @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
                public /* bridge */ /* synthetic */ Object remove(int i) {
                    Object remove = super.remove(i);
                    C0ck c0ck = C0ck.A03;
                    return remove;
                }
            });
            Field declaredField3 = cls.getDeclaredField("mViews");
            declaredField3.setAccessible(true);
            declaredField.setInt(declaredField3, declaredField3.getModifiers() & (-17));
            Object obj2 = declaredField3.get(windowManagerGlobal);
            if (obj2 != null) {
                final ArrayList arrayList2 = (ArrayList) obj2;
                declaredField3.set(windowManagerGlobal, new ArrayList(arrayList2) { // from class: X.0ch
                    {
                        super(arrayList2);
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            C0ck.A00((View) it.next(), C0ck.this);
                        }
                    }

                    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
                    public /* bridge */ /* synthetic */ boolean add(Object obj3) {
                        View view = (View) obj3;
                        C0ck.A00(view, C0ck.this);
                        return super.add(view);
                    }

                    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
                    public /* bridge */ /* synthetic */ Object remove(int i) {
                        return super.remove(i);
                    }
                });
                z = true;
                this.A02 = z;
            }
        }
        z = false;
        this.A02 = z;
    }

    public static void A00(View view, final C0ck c0ck) {
        if (view != null) {
            if (c0ck.A01 == null) {
                Class<?> cls = view.getClass();
                if (cls.getName().contains("DecorView")) {
                    c0ck.A01 = cls;
                }
            }
            Class<?> cls2 = c0ck.A01;
            if (cls2 == null || view.getClass() == cls2) {
                try {
                    final Window window = (Window) AnonymousClass001.A0r(view.getClass(), "mWindow").get(view);
                    if (window != null) {
                        final Window.Callback callback = window.getCallback();
                        if (callback == null || Proxy.isProxyClass(callback.getClass())) {
                            return;
                        }
                        window.setCallback((Window.Callback) Proxy.newProxyInstance(C0ck.class.getClassLoader(), new Class[]{Window.Callback.class}, new InvocationHandler(callback, window, c0ck) { // from class: X.0cj
                            public final Window.Callback A00;
                            public final Window A01;
                            public final /* synthetic */ C0ck A02;

                            {
                                this.A02 = c0ck;
                                this.A01 = window;
                                this.A00 = callback;
                            }

                            @Override // java.lang.reflect.InvocationHandler
                            public Object invoke(Object obj, Method method, Object[] objArr) {
                                C0ck c0ck2 = this.A02;
                                C0ck c0ck3 = C0ck.A03;
                                if (c0ck2.A00 != null && objArr != null && objArr.length == 1) {
                                    Object obj2 = objArr[0];
                                    if (obj2 instanceof MotionEvent) {
                                        InputEvent inputEvent = (InputEvent) obj2;
                                        C14f c14f = C14f.A0F;
                                        if (c14f != null) {
                                            c14f.A02++;
                                            c14f.A04 = Math.max(c14f.A04, SystemClock.uptimeMillis() - inputEvent.getEventTime());
                                        }
                                    } else if (obj2 instanceof KeyEvent) {
                                        InputEvent inputEvent2 = (InputEvent) obj2;
                                        C14f c14f2 = C14f.A0F;
                                        if (c14f2 != null) {
                                            c14f2.A00++;
                                            c14f2.A03 = Math.max(c14f2.A03, SystemClock.uptimeMillis() - inputEvent2.getEventTime());
                                        }
                                    }
                                }
                                return method.invoke(this.A00, objArr);
                            }
                        }));
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }
}
