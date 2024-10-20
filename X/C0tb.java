package X;

import android.util.SparseArray;
import com.facebook.common.mindeputils.IVerboseDebuggable;

/* renamed from: X.0tb, reason: invalid class name */
/* loaded from: 0tb.class */
public enum C0tb implements IVerboseDebuggable {
    UNDEFINED("UNDEFINED", -1, null),
    PRE_ON_CREATE("PRE_ON_CREATE", 0, null),
    ON_CREATE("ON_CREATE", 1, null),
    ON_START("ON_START", 2, null),
    ON_RESUME("ON_RESUME", 3, "android.app.servertransaction.ResumeActivityItem"),
    ON_PAUSE("ON_PAUSE", 4, "android.app.servertransaction.PauseActivityItem"),
    ON_STOP("ON_STOP", 5, "android.app.servertransaction.StopActivityItem"),
    ON_DESTROY("ON_DESTROY", 6, "android.app.servertransaction.DestroyActivityItem"),
    ON_RESTART("ON_RESTART", 7, null);

    public static int A00 = 255;
    public static SparseArray A01;
    public static Class A02;
    public static boolean A03;
    public static C0tb[] A04;
    public static final 0KO A05 = new 0KO("AospActivityLifecycleItemInfo");
    public final String activityLifecycleClassName;
    public final String expectedFieldName;
    public final int expectedNum;
    public int mLifecycleNum;
    public boolean mTriedToFindLifecycleNum = false;

    C0tb(String str, int i, String str2) {
        this.expectedNum = i;
        this.expectedFieldName = str;
        this.activityLifecycleClassName = str2;
        this.mLifecycleNum = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0089, code lost:
    
        if (java.lang.Integer.valueOf(r309) != null) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A00(X.C0tb r301, X.C0cZ r302) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0tb.A00(X.0tb, X.0cZ):int");
    }

    @Override // java.lang.Enum
    public String toString() {
        return 0Pz.A0z("Lifecycle ", name(), "(", this.mTriedToFindLifecycleNum ? Integer.toString(this.mLifecycleNum) : "not yet inited", ")");
    }
}
