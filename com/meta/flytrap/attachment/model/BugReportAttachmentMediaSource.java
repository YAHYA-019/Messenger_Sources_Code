package com.meta.flytrap.attachment.model;

import X.11T;
import X.1BL;
import X.5Yu;
import X.C00t;
import X.C01g;
import X.C01i;
import X.C03i;
import X.JQz;
import X.LGm;
import X.M32;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: BugReportAttachmentMediaSource.class */
public final class BugReportAttachmentMediaSource implements Parcelable {
    public static final C01i A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ BugReportAttachmentMediaSource[] A02;
    public static final BugReportAttachmentMediaSource A03;
    public static final BugReportAttachmentMediaSource A04;
    public static final BugReportAttachmentMediaSource A05;
    public static final BugReportAttachmentMediaSource A06;
    public static final BugReportAttachmentMediaSource A07;
    public static final BugReportAttachmentMediaSource A08;
    public static final Parcelable.Creator CREATOR;
    public static final Companion Companion;

    /* loaded from: BugReportAttachmentMediaSource$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return JQz.A0x(BugReportAttachmentMediaSource.A00);
        }
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource$Companion, java.lang.Object] */
    static {
        BugReportAttachmentMediaSource bugReportAttachmentMediaSource = new BugReportAttachmentMediaSource("BUG_REPORTER", 0);
        A04 = bugReportAttachmentMediaSource;
        BugReportAttachmentMediaSource bugReportAttachmentMediaSource2 = new BugReportAttachmentMediaSource("CAMERA_ROLL", 1);
        A07 = bugReportAttachmentMediaSource2;
        BugReportAttachmentMediaSource bugReportAttachmentMediaSource3 = new BugReportAttachmentMediaSource("BUILT_IN_SCREENSHOT_CAPTURE", 2);
        A06 = bugReportAttachmentMediaSource3;
        BugReportAttachmentMediaSource bugReportAttachmentMediaSource4 = new BugReportAttachmentMediaSource("BUILT_IN_SCREENCAST_CAPTURE", 3);
        A05 = bugReportAttachmentMediaSource4;
        BugReportAttachmentMediaSource bugReportAttachmentMediaSource5 = new BugReportAttachmentMediaSource("NON_MEDIA", 4);
        A08 = bugReportAttachmentMediaSource5;
        BugReportAttachmentMediaSource bugReportAttachmentMediaSource6 = new BugReportAttachmentMediaSource("ANNOTATION", 5);
        A03 = bugReportAttachmentMediaSource6;
        BugReportAttachmentMediaSource[] bugReportAttachmentMediaSourceArr = {bugReportAttachmentMediaSource, bugReportAttachmentMediaSource2, bugReportAttachmentMediaSource3, bugReportAttachmentMediaSource4, bugReportAttachmentMediaSource5, bugReportAttachmentMediaSource6};
        A02 = bugReportAttachmentMediaSourceArr;
        A01 = C00t.A00(bugReportAttachmentMediaSourceArr);
        Companion = new Object();
        CREATOR = LGm.A00(91);
        A00 = C01g.A00(C03i.A03, M32.A00);
    }

    public BugReportAttachmentMediaSource(String str, int i) {
    }

    public static BugReportAttachmentMediaSource valueOf(String str) {
        return (BugReportAttachmentMediaSource) Enum.valueOf(BugReportAttachmentMediaSource.class, str);
    }

    public static BugReportAttachmentMediaSource[] values() {
        return (BugReportAttachmentMediaSource[]) A02.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        1BL.A12(parcel, this);
    }
}
