package com.meta.flytrap.attachment.model;

import X.5Yu;
import X.C00t;
import X.C01g;
import X.C01i;
import X.C03i;
import X.JQz;
import X.M33;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: BugReportAttachmentMediaType.class */
public final class BugReportAttachmentMediaType {
    public static final C01i A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ BugReportAttachmentMediaType[] A02;
    public static final BugReportAttachmentMediaType A03;
    public static final BugReportAttachmentMediaType A04;
    public static final BugReportAttachmentMediaType A05;
    public static final Companion Companion;

    /* loaded from: BugReportAttachmentMediaType$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return JQz.A0x(BugReportAttachmentMediaType.A00);
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [com.meta.flytrap.attachment.model.BugReportAttachmentMediaType$Companion, java.lang.Object] */
    static {
        BugReportAttachmentMediaType bugReportAttachmentMediaType = new BugReportAttachmentMediaType("NON_MEDIA", 0);
        A03 = bugReportAttachmentMediaType;
        BugReportAttachmentMediaType bugReportAttachmentMediaType2 = new BugReportAttachmentMediaType("SCREENSHOT", 1);
        A04 = bugReportAttachmentMediaType2;
        BugReportAttachmentMediaType bugReportAttachmentMediaType3 = new BugReportAttachmentMediaType("VIDEO", 2);
        A05 = bugReportAttachmentMediaType3;
        BugReportAttachmentMediaType[] bugReportAttachmentMediaTypeArr = {bugReportAttachmentMediaType, bugReportAttachmentMediaType2, bugReportAttachmentMediaType3};
        A02 = bugReportAttachmentMediaTypeArr;
        A01 = C00t.A00(bugReportAttachmentMediaTypeArr);
        Companion = new Object();
        A00 = C01g.A00(C03i.A03, M33.A00);
    }

    public BugReportAttachmentMediaType(String str, int i) {
    }

    public static BugReportAttachmentMediaType valueOf(String str) {
        return (BugReportAttachmentMediaType) Enum.valueOf(BugReportAttachmentMediaType.class, str);
    }

    public static BugReportAttachmentMediaType[] values() {
        return (BugReportAttachmentMediaType[]) A02.clone();
    }
}
