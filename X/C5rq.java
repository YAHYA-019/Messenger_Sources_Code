package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.threadview.theme.custom.model.CompositeThreadThemeInfo;
import com.facebook.xapp.messaging.threadview.theme.custom.model.ThreadThemeInfo;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.5rq, reason: invalid class name */
/* loaded from: 5rq.class */
public final class C5rq {
    public final 1Br A00 = 1Bu.A00(67809);
    public final 1Br A01 = 1Bq.A00(68381);

    /* JADX WARN: Type inference failed for: r0v8, types: [X.2qQ, java.lang.Object] */
    public final ThreadThemeInfo A00(MigColorScheme migColorScheme, CompositeThreadThemeInfo compositeThreadThemeInfo, java.util.Map map) {
        ThreadThemeInfo threadThemeInfo;
        ImmutableMap immutableMap = compositeThreadThemeInfo.A01;
        11T.A0A(immutableMap);
        if ((!immutableMap.isEmpty()) && 1Br.A07(((6N9) 1Br.A0B(this.A00)).A00).AZk(36318037297475581L)) {
            Object A0B = 1Br.A0B(this.A01);
            Iterator it = immutableMap.entrySet().iterator();
            while (it.hasNext()) {
                ThreadThemeInfo threadThemeInfo2 = (ThreadThemeInfo) AnonymousClass001.A0z(it).getValue();
                if (threadThemeInfo2 != null) {
                    ImmutableList immutableList = threadThemeInfo2.A0b;
                    11T.A0A(immutableList);
                    if (!immutableList.isEmpty()) {
                        try {
                            String A0t = 4YV.A0t("-", immutableList, new AV8(2, map, A0B, migColorScheme));
                            if (A0t.length() != 0 && (threadThemeInfo = (ThreadThemeInfo) immutableMap.get(A0t)) != null) {
                                return threadThemeInfo;
                            }
                        } catch (IllegalStateException e) {
                            0fH.A0r("ThemeVariantHashGenerator", "Failed to generate variant hash", e);
                        }
                    }
                }
            }
            throw new NoSuchElementException("No element of the map was transformed to a non-null value.");
        }
        if (migColorScheme == null) {
            ThreadThemeInfo A00 = compositeThreadThemeInfo.A00();
            11T.A0A(A00);
            return A00;
        }
        ?? obj = new Object();
        ThreadThemeInfo A002 = compositeThreadThemeInfo.A00();
        11T.A0A(A002);
        ((2qQ) obj).A01 = A002;
        ThreadThemeInfo threadThemeInfo3 = compositeThreadThemeInfo.A00;
        if (threadThemeInfo3 == null) {
            threadThemeInfo3 = A002;
        }
        ((2qQ) obj).A00 = threadThemeInfo3;
        Object Ci4 = migColorScheme.Ci4(obj.A00());
        11T.A0A(Ci4);
        return (ThreadThemeInfo) Ci4;
    }
}
