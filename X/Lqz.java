package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Locale;

/* loaded from: Lqz.class */
public final /* synthetic */ class Lqz implements Runnable {
    public static final String __redex_internal_original_name = "WebPageLoader$$ExternalSyntheticLambda0";
    public final /* synthetic */ int A00;
    public final /* synthetic */ LED A01;
    public final /* synthetic */ QuickPerformanceLogger A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Locale A05;

    public /* synthetic */ Lqz(LED led, QuickPerformanceLogger quickPerformanceLogger, String str, String str2, Locale locale, int i) {
        this.A01 = led;
        this.A05 = locale;
        this.A03 = str;
        this.A02 = quickPerformanceLogger;
        this.A00 = i;
        this.A04 = str2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r311v6 ??, still in use, count: 8, list:
          (r311v6 ??) from 0x07a6: PHI (r311v7 ??) = (r311v6 ??), (r311v11 ??) binds: [B:412:0x0753, B:424:0x07a1] A[DONT_GENERATE, DONT_INLINE]
          (r311v6 ?? I:java.net.URL) from 0x0758: INVOKE (r0v254 ?? I:java.lang.String) = (r311v6 ?? I:java.net.URL) VIRTUAL call: java.net.URL.getProtocol():java.lang.String A[Catch: KLW -> 0x098f, IOException -> 0x09a0, URISyntaxException -> 0x09ac, MD:():java.lang.String (c)]
          (r311v6 ?? I:java.net.URL) from 0x075f: INVOKE (r0v256 ?? I:java.lang.String) = (r311v6 ?? I:java.net.URL) VIRTUAL call: java.net.URL.getUserInfo():java.lang.String A[Catch: KLW -> 0x098f, IOException -> 0x09a0, URISyntaxException -> 0x09ac, MD:():java.lang.String (c)]
          (r311v6 ?? I:java.net.URL) from 0x0766: INVOKE (r0v258 ?? I:java.lang.String) = (r311v6 ?? I:java.net.URL) VIRTUAL call: java.net.URL.getHost():java.lang.String A[Catch: KLW -> 0x098f, IOException -> 0x09a0, URISyntaxException -> 0x09ac, MD:():java.lang.String (c)]
          (r311v6 ?? I:java.net.URL) from 0x076d: INVOKE (r0v260 ?? I:int) = (r311v6 ?? I:java.net.URL) VIRTUAL call: java.net.URL.getPort():int A[Catch: KLW -> 0x098f, IOException -> 0x09a0, URISyntaxException -> 0x09ac, MD:():int (c)]
          (r311v6 ?? I:java.net.URL) from 0x0774: INVOKE (r0v262 ?? I:java.lang.String) = (r311v6 ?? I:java.net.URL) VIRTUAL call: java.net.URL.getPath():java.lang.String A[Catch: KLW -> 0x098f, IOException -> 0x09a0, URISyntaxException -> 0x09ac, MD:():java.lang.String (c)]
          (r311v6 ?? I:java.net.URL) from 0x077b: INVOKE (r0v264 ?? I:java.lang.String) = (r311v6 ?? I:java.net.URL) VIRTUAL call: java.net.URL.getQuery():java.lang.String A[Catch: KLW -> 0x098f, IOException -> 0x09a0, URISyntaxException -> 0x09ac, MD:():java.lang.String (c)]
          (r311v6 ?? I:java.net.URL) from 0x0782: INVOKE (r0v266 ?? I:java.lang.String) = (r311v6 ?? I:java.net.URL) VIRTUAL call: java.net.URL.getRef():java.lang.String A[Catch: KLW -> 0x098f, IOException -> 0x09a0, URISyntaxException -> 0x09ac, MD:():java.lang.String (c)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    @Override // java.lang.Runnable
    public final void run() {
        /*
            Method dump skipped, instructions count: 2611
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Lqz.run():void");
    }
}
