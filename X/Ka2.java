package X;

import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: Ka2.class */
public abstract class Ka2 {
    public static final MJS A00;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Throwable, java.lang.reflect.InvocationHandler] */
    static {
        Object obj;
        ?? r0;
        try {
            r0 = (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, WebView.getWebViewClassLoader()).getDeclaredMethod("createWebViewProviderFactory", new Class[0]).invoke(null, new Object[0]);
            obj = new LRh((WebViewProviderFactoryBoundaryInterface) Kwo.A00(WebViewProviderFactoryBoundaryInterface.class, r0));
        } catch (ClassNotFoundException unused) {
            obj = new Object();
        } catch (IllegalAccessException unused2) {
            throw AnonymousClass001.A0U(r0);
        } catch (NoSuchMethodException unused3) {
            throw AnonymousClass001.A0U(r0);
        } catch (InvocationTargetException unused4) {
            throw AnonymousClass001.A0U(r0);
        }
        A00 = obj;
    }
}
