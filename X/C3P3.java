package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.http.interfaces.RequestPriority;
import com.facebook.tigon.requestprioritization.FBHttpPriorityContext;
import java.util.HashMap;

/* renamed from: X.3P3, reason: invalid class name */
/* loaded from: 3P3.class */
public final class C3P3 {
    public static final FBHttpPriorityContext A00(AnonymousClass409 anonymousClass409) {
        java.util.Map map;
        11T.A0F(anonymousClass409, 0);
        HashMap A0u = AnonymousClass001.A0u();
        CallerContext callerContext = anonymousClass409.A06;
        if (callerContext != null && (map = callerContext.A06) != null) {
            A0u.putAll(new HashMap(map));
        }
        String str = (String) A0u.get("surface");
        if (str == null) {
            str = "";
        }
        C3P3 c3p3 = FBHttpPriorityContext.Companion;
        EnumC04093zx enumC04093zx = anonymousClass409.A09;
        RequestPriority requestPriority = anonymousClass409.A07.A01;
        11T.A0A(requestPriority);
        return new FBHttpPriorityContext(enumC04093zx, requestPriority, str);
    }
}
