package com.meta.flytrap.attachment.model;

import X.0DV;
import X.0Q8;
import X.11T;
import X.1BL;
import X.4YV;
import X.5Yu;
import X.7mU;
import X.7zS;
import X.7zT;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.DKB;
import X.DKE;
import X.DKH;
import X.JQz;
import X.LGm;
import X.Lvu;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;

/* loaded from: BugReportAttachment.class */
public final class BugReportAttachment implements Parcelable {
    public final BugReportAttachmentMediaSource A00;
    public final BugReportAttachmentMediaType A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public static final Companion Companion = new Object();
    public static final Parcelable.Creator CREATOR = LGm.A00(90);
    public static final 5Yu[] A05 = {null, null, JQz.A0x(BugReportAttachmentMediaType.A00), JQz.A0x(BugReportAttachmentMediaSource.A00), null};

    /* loaded from: BugReportAttachment$Companion.class */
    public final class Companion {
        public static final BugReportAttachment A00(Uri uri, BugReportAttachmentMediaSource bugReportAttachmentMediaSource, BugReportAttachmentMediaType bugReportAttachmentMediaType, String str) {
            0DV r301;
            7zS.A16(0, uri, bugReportAttachmentMediaType, bugReportAttachmentMediaSource);
            try {
                r301 = DKE.A0n(uri.toString());
            } catch (Throwable th) {
                r301 = new 0DV(th);
            }
            BugReportAttachment bugReportAttachment = null;
            if (r301 instanceof 0DV) {
                r301 = null;
            }
            File file = (File) r301;
            if (file != null) {
                bugReportAttachment = new BugReportAttachment(bugReportAttachmentMediaSource, bugReportAttachmentMediaType, file, str);
            }
            return bugReportAttachment;
        }

        public final 5Yu serializer() {
            return Lvu.A00;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public BugReportAttachment(com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource r302, com.meta.flytrap.attachment.model.BugReportAttachmentMediaType r303, java.io.File r304, java.lang.String r305) {
        /*
            r301 = this;
            r0 = r305
            r1 = 2
            r2 = r302
            X.1BK.A1K(r0, r1, r2)
            r0 = r304
            java.lang.String r0 = r0.getPath()
            r306 = r0
            r0 = r306
            X.11T.A0A(r0)
            r0 = r301
            r1 = r302
            r2 = r303
            r3 = r306
            r4 = r305
            r5 = 1
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.flytrap.attachment.model.BugReportAttachment.<init>(com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource, com.meta.flytrap.attachment.model.BugReportAttachmentMediaType, java.io.File, java.lang.String):void");
    }

    public /* synthetic */ BugReportAttachment(BugReportAttachmentMediaSource bugReportAttachmentMediaSource, BugReportAttachmentMediaType bugReportAttachmentMediaType, String str, String str2, int i, boolean z) {
        if (15 != (i & 15)) {
            7mU.A00(Lvu.A01, i, 15);
            throw 0Q8.createAndThrow();
        }
        this.A03 = str;
        this.A02 = str2;
        this.A01 = bugReportAttachmentMediaType;
        this.A00 = bugReportAttachmentMediaSource;
        if ((i & 16) == 0) {
            this.A04 = true;
        } else {
            this.A04 = z;
        }
    }

    public BugReportAttachment(BugReportAttachmentMediaSource bugReportAttachmentMediaSource, BugReportAttachmentMediaType bugReportAttachmentMediaType, String str, String str2, boolean z) {
        7zT.A1W(str, str2, bugReportAttachmentMediaType, bugReportAttachmentMediaSource);
        this.A03 = str;
        this.A02 = str2;
        this.A01 = bugReportAttachmentMediaType;
        this.A00 = bugReportAttachmentMediaSource;
        this.A04 = z;
    }

    public final Uri A00() {
        Uri fromFile = Uri.fromFile(new File(this.A03));
        11T.A0A(fromFile);
        return fromFile;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof BugReportAttachment)) {
                return false;
            }
            BugReportAttachment bugReportAttachment = (BugReportAttachment) obj;
            if (!11T.A0O(this.A03, bugReportAttachment.A03) || !11T.A0O(this.A02, bugReportAttachment.A02) || this.A01 != bugReportAttachment.A01 || this.A00 != bugReportAttachment.A00 || this.A04 != bugReportAttachment.A04) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A05(this.A00, AnonymousClass002.A05(this.A01, AnonymousClass002.A07(this.A02, 4YV.A02(this.A03)))) + AnonymousClass002.A00(this.A04 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("BugReportAttachment(path=");
        A0k.append(this.A03);
        A0k.append(", generatorName=");
        A0k.append(this.A02);
        A0k.append(DKB.A00(62));
        A0k.append(this.A01);
        A0k.append(", mediaSource=");
        A0k.append(this.A00);
        A0k.append(", async=");
        return DKH.A0q(A0k, this.A04);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        1BL.A12(parcel, this.A01);
        this.A00.writeToParcel(parcel, i);
        parcel.writeInt(this.A04 ? 1 : 0);
    }
}
