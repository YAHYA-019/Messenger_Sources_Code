package X;

import android.net.Uri;
import com.facebook.msys.mci.TranscodeVideoCompletionCallback;
import com.facebook.msys.mci.transcoder.DefaultMediaTranscoder;

/* loaded from: H3m.class */
public final class H3m extends IjO {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ Uri A04;
    public final /* synthetic */ TranscodeVideoCompletionCallback A05;
    public final /* synthetic */ DefaultMediaTranscoder A06;

    public H3m(Uri uri, TranscodeVideoCompletionCallback transcodeVideoCompletionCallback, DefaultMediaTranscoder defaultMediaTranscoder, int i, int i2, int i3, int i4) {
        this.A06 = defaultMediaTranscoder;
        this.A04 = uri;
        this.A05 = transcodeVideoCompletionCallback;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = i3;
        this.A02 = i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0258, code lost:
    
        if (X.HBJ.A0B.value.equals(r0.A04.value) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0263, code lost:
    
        r335 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0281, code lost:
    
        if (X.HBJ.A08.value.equals(r0.A04.value) != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0284, code lost:
    
        r335 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0287, code lost:
    
        r327 = r0.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0292, code lost:
    
        if (r327 > 1) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0295, code lost:
    
        r327 = r0.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x029b, code lost:
    
        r328 = r0.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x02a6, code lost:
    
        if (r328 > 1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x02a9, code lost:
    
        r328 = r0.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02af, code lost:
    
        r329 = (int) r0.A0H;
        r330 = r0.A02;
        r331 = r0.A0C;
        r332 = r0.A0A;
        r304 = (int) r0.A0I;
        r0 = r0.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x02e4, code lost:
    
        if (r327 > 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x02e7, code lost:
    
        r327 = 815;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x02f0, code lost:
    
        if (r328 > 1) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02f3, code lost:
    
        r328 = 1112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x02fc, code lost:
    
        if (r329 > 1) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x02ff, code lost:
    
        r329 = 1300588;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0307, code lost:
    
        if (r330 > 1) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x030a, code lost:
    
        r330 = 30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0312, code lost:
    
        if (r331 > 1) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0315, code lost:
    
        r331 = 815;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x031e, code lost:
    
        if (r332 > 1) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0321, code lost:
    
        r332 = 1112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0329, code lost:
    
        if (r304 > 1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x032c, code lost:
    
        r304 = 1300588;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x032f, code lost:
    
        r309 = X.N3b.A01(r0.A00, r0, r329, r330, r328, r327, r304, r332, r331, false, r335, r338, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0260, code lost:
    
        if (r0 != null) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Bpy(java.util.List r302) {
        /*
            Method dump skipped, instructions count: 867
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H3m.Bpy(java.util.List):void");
    }

    public /* bridge */ /* synthetic */ void Bwt(I51 i51, Object obj) {
        Throwable th = (Throwable) obj;
        0fH.A0r("DefaultMediaTranscoder", "transcodeVideo onException - TranscodeUtil.transcode() failed", th);
        DefaultMediaTranscoder.A02(this.A05, this.A06, th, this.A01, this.A00);
    }
}
