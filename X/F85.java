package X;

import com.facebook.stash.core.FileStash;

/* loaded from: F85.class */
public final class F85 {
    public FileStash A00;
    public final Lyf A04 = new Lyf();
    public final 1Br A01 = 7zM.A0Q();
    public final 1Br A02 = 1Bu.A00(68334);
    public final 1Br A03 = 1Bq.A00(16967);

    public static final FileStash A00(F85 f85) {
        FileStash fileStash;
        synchronized (f85) {
            fileStash = f85.A00;
            if (fileStash == null) {
                fileStash = ((2Jh) 1Br.A0B(f85.A03)).A04(2049138619);
                f85.A00 = fileStash;
            }
        }
        return fileStash;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r302.length() == 0) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0188 A[Catch: IOException -> 0x0190, TRY_ENTER, TRY_LEAVE, TryCatch #5 {IOException -> 0x0190, blocks: (B:90:0x017e, B:81:0x0188), top: B:89:0x017e }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x017e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.common.collect.ImmutableList A01(java.lang.String r302) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F85.A01(java.lang.String):com.google.common.collect.ImmutableList");
    }
}
