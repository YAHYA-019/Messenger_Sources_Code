package com.google.android.exoplayer2.metadata.id3;

import X.6Yl;
import com.google.android.exoplayer2.metadata.Metadata;

/* loaded from: Id3Frame.class */
public abstract class Id3Frame implements Metadata.Entry {
    public final String A00;

    public Id3Frame(String str) {
        this.A00 = str;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ byte[] BL1() {
        return null;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ 6Yl BL2() {
        return null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0029. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0188 A[Catch: NumberFormatException | StringIndexOutOfBoundsException -> 0x00e4, NumberFormatException | StringIndexOutOfBoundsException -> 0x00e4, TRY_ENTER, TRY_LEAVE, TryCatch #0 {NumberFormatException | StringIndexOutOfBoundsException -> 0x00e4, blocks: (B:22:0x0188, B:22:0x0188, B:24:0x0190, B:24:0x0190, B:26:0x0198, B:26:0x0198, B:28:0x01a0, B:28:0x01a0, B:29:0x01a7, B:29:0x01a7, B:31:0x01ae, B:33:0x01b5, B:33:0x01b5, B:35:0x01bb, B:35:0x01bb, B:60:0x037f, B:61:0x0383, B:62:0x038a, B:66:0x0394, B:67:0x0399, B:68:0x039f, B:70:0x03a7, B:71:0x03ad, B:90:0x03cc, B:92:0x03d4, B:93:0x03da, B:95:0x03e2), top: B:4:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03cc A[Catch: NumberFormatException | StringIndexOutOfBoundsException -> 0x00e4, TRY_ENTER, TRY_LEAVE, TryCatch #0 {NumberFormatException | StringIndexOutOfBoundsException -> 0x00e4, blocks: (B:22:0x0188, B:22:0x0188, B:24:0x0190, B:24:0x0190, B:26:0x0198, B:26:0x0198, B:28:0x01a0, B:28:0x01a0, B:29:0x01a7, B:29:0x01a7, B:31:0x01ae, B:33:0x01b5, B:33:0x01b5, B:35:0x01bb, B:35:0x01bb, B:60:0x037f, B:61:0x0383, B:62:0x038a, B:66:0x0394, B:67:0x0399, B:68:0x039f, B:70:0x03a7, B:71:0x03ad, B:90:0x03cc, B:92:0x03d4, B:93:0x03da, B:95:0x03e2), top: B:4:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x013c  */
    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void CXq(X.6Y2 r302) {
        /*
            Method dump skipped, instructions count: 1042
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.Id3Frame.CXq(X.6Y2):void");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.A00;
    }
}
