package X;

import com.facebook.common.dextricks.LogcatReader;

/* loaded from: Gtz.class */
public class Gtz extends HDP {
    public Gtz(String str, Throwable th) {
        super(str, th, th instanceof HDP ? ((HDP) th).mErrorCode : 10000);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.HDP, X.Gtz] */
    public static Gtz A00(String str) {
        return new HDP(LogcatReader.DEFAULT_WAIT_TIME, str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.HDP, X.Gtz] */
    public static Gtz A01(Throwable th) {
        return new HDP(LogcatReader.DEFAULT_WAIT_TIME, th);
    }
}
