package X;

import android.content.Context;
import libraries.access.src.main.sharedstorage.common.ReplicatedStorageRequest;

/* loaded from: G68.class */
public final class G68 implements Runnable {
    public static final String __redex_internal_original_name = "FBSharedStorageManager$removeAccounts$1";
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FFq A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ FIm A04;
    public final /* synthetic */ ReplicatedStorageRequest A05;
    public final /* synthetic */ int[] A06;

    public G68(Context context, FFq fFq, String str, String str2, FIm fIm, ReplicatedStorageRequest replicatedStorageRequest, int[] iArr) {
        this.A01 = fFq;
        this.A00 = context;
        this.A05 = replicatedStorageRequest;
        this.A06 = iArr;
        this.A04 = fIm;
        this.A03 = str;
        this.A02 = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0345 A[Catch: Exception -> 0x04ec, SecurityException -> 0x04f6, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x04ec, blocks: (B:12:0x00a2, B:13:0x00a9, B:15:0x00bb, B:16:0x00c2, B:19:0x00cd, B:20:0x00d3, B:23:0x00e1, B:24:0x00ea, B:25:0x00f1, B:27:0x00f8, B:28:0x00ff, B:30:0x0111, B:43:0x0119, B:44:0x0120, B:46:0x0131, B:63:0x0176, B:64:0x017b, B:65:0x0184, B:68:0x0192, B:69:0x019b, B:70:0x01a2, B:72:0x01ab, B:197:0x01b8, B:198:0x01bf, B:200:0x01d1, B:201:0x01d8, B:204:0x01e4, B:205:0x01eb, B:208:0x01f9, B:209:0x0202, B:210:0x0209, B:212:0x0210, B:213:0x0217, B:215:0x0229, B:76:0x0231, B:77:0x0238, B:78:0x023f, B:79:0x0244, B:81:0x024b, B:82:0x0252, B:85:0x0260, B:86:0x0269, B:87:0x0270, B:88:0x0275, B:90:0x0284, B:92:0x028c, B:94:0x0299, B:96:0x02a3, B:98:0x02ae, B:99:0x02b6, B:101:0x02bf, B:106:0x02d3, B:108:0x02e9, B:114:0x02fc, B:115:0x0303, B:117:0x0315, B:119:0x0322, B:139:0x036f, B:140:0x0376, B:126:0x037b, B:128:0x038d, B:130:0x039c, B:124:0x0345, B:125:0x034c, B:134:0x0360, B:135:0x0367, B:143:0x03a5, B:153:0x03ce, B:154:0x03d5, B:156:0x03dc, B:157:0x03e1), top: B:11:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0360 A[Catch: Exception -> 0x04ec, SecurityException -> 0x04f6, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x04ec, blocks: (B:12:0x00a2, B:13:0x00a9, B:15:0x00bb, B:16:0x00c2, B:19:0x00cd, B:20:0x00d3, B:23:0x00e1, B:24:0x00ea, B:25:0x00f1, B:27:0x00f8, B:28:0x00ff, B:30:0x0111, B:43:0x0119, B:44:0x0120, B:46:0x0131, B:63:0x0176, B:64:0x017b, B:65:0x0184, B:68:0x0192, B:69:0x019b, B:70:0x01a2, B:72:0x01ab, B:197:0x01b8, B:198:0x01bf, B:200:0x01d1, B:201:0x01d8, B:204:0x01e4, B:205:0x01eb, B:208:0x01f9, B:209:0x0202, B:210:0x0209, B:212:0x0210, B:213:0x0217, B:215:0x0229, B:76:0x0231, B:77:0x0238, B:78:0x023f, B:79:0x0244, B:81:0x024b, B:82:0x0252, B:85:0x0260, B:86:0x0269, B:87:0x0270, B:88:0x0275, B:90:0x0284, B:92:0x028c, B:94:0x0299, B:96:0x02a3, B:98:0x02ae, B:99:0x02b6, B:101:0x02bf, B:106:0x02d3, B:108:0x02e9, B:114:0x02fc, B:115:0x0303, B:117:0x0315, B:119:0x0322, B:139:0x036f, B:140:0x0376, B:126:0x037b, B:128:0x038d, B:130:0x039c, B:124:0x0345, B:125:0x034c, B:134:0x0360, B:135:0x0367, B:143:0x03a5, B:153:0x03ce, B:154:0x03d5, B:156:0x03dc, B:157:0x03e1), top: B:11:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x036f A[Catch: Exception -> 0x04ec, SecurityException -> 0x04f6, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x04ec, blocks: (B:12:0x00a2, B:13:0x00a9, B:15:0x00bb, B:16:0x00c2, B:19:0x00cd, B:20:0x00d3, B:23:0x00e1, B:24:0x00ea, B:25:0x00f1, B:27:0x00f8, B:28:0x00ff, B:30:0x0111, B:43:0x0119, B:44:0x0120, B:46:0x0131, B:63:0x0176, B:64:0x017b, B:65:0x0184, B:68:0x0192, B:69:0x019b, B:70:0x01a2, B:72:0x01ab, B:197:0x01b8, B:198:0x01bf, B:200:0x01d1, B:201:0x01d8, B:204:0x01e4, B:205:0x01eb, B:208:0x01f9, B:209:0x0202, B:210:0x0209, B:212:0x0210, B:213:0x0217, B:215:0x0229, B:76:0x0231, B:77:0x0238, B:78:0x023f, B:79:0x0244, B:81:0x024b, B:82:0x0252, B:85:0x0260, B:86:0x0269, B:87:0x0270, B:88:0x0275, B:90:0x0284, B:92:0x028c, B:94:0x0299, B:96:0x02a3, B:98:0x02ae, B:99:0x02b6, B:101:0x02bf, B:106:0x02d3, B:108:0x02e9, B:114:0x02fc, B:115:0x0303, B:117:0x0315, B:119:0x0322, B:139:0x036f, B:140:0x0376, B:126:0x037b, B:128:0x038d, B:130:0x039c, B:124:0x0345, B:125:0x034c, B:134:0x0360, B:135:0x0367, B:143:0x03a5, B:153:0x03ce, B:154:0x03d5, B:156:0x03dc, B:157:0x03e1), top: B:11:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0568 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G68.run():void");
    }
}
