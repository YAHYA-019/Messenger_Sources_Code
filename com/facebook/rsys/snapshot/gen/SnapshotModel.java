package com.facebook.rsys.snapshot.gen;

import X.1BL;
import X.2JQ;
import X.7zN;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: SnapshotModel.class */
public class SnapshotModel {
    public static 2JQ CONVERTER = LVi.A00(59);
    public static long sMcfTypeId;
    public final String actorUserId;
    public final int captureEntryPoint;
    public final int captureExitPoint;
    public final ArrayList commands;
    public final String displayedSnapshotURI;
    public final int notificationType;
    public final String notificationUuid;
    public final SnapshotPendingSnapshot pendingSnapshot;
    public final int snapshotDeleteState;
    public final boolean snapshotPreviewIsExpanded;
    public final int snapshotSaveState;
    public final int snapshotSendState;
    public final int snapshotState;
    public final int snapshotViewState;

    public SnapshotModel(ArrayList arrayList, int i, String str, int i2, int i3, int i4, int i5, SnapshotPendingSnapshot snapshotPendingSnapshot, boolean z, String str2, String str3, int i6, int i7, int i8) {
        this.commands = arrayList;
        this.snapshotViewState = i;
        this.displayedSnapshotURI = str;
        this.snapshotState = i2;
        this.snapshotSaveState = i3;
        this.snapshotSendState = i4;
        this.snapshotDeleteState = i5;
        this.pendingSnapshot = snapshotPendingSnapshot;
        this.snapshotPreviewIsExpanded = z;
        this.actorUserId = str2;
        this.notificationUuid = str3;
        this.notificationType = i6;
        this.captureEntryPoint = i7;
        this.captureExitPoint = i8;
    }

    public static native SnapshotModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SnapshotModel)) {
                return false;
            }
            SnapshotModel snapshotModel = (SnapshotModel) obj;
            ArrayList arrayList = this.commands;
            ArrayList arrayList2 = snapshotModel.commands;
            if (arrayList == null) {
                if (arrayList2 != null) {
                    return false;
                }
            } else if (!arrayList.equals(arrayList2)) {
                return false;
            }
            if (this.snapshotViewState != snapshotModel.snapshotViewState) {
                return false;
            }
            String str = this.displayedSnapshotURI;
            String str2 = snapshotModel.displayedSnapshotURI;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (this.snapshotState != snapshotModel.snapshotState || this.snapshotSaveState != snapshotModel.snapshotSaveState || this.snapshotSendState != snapshotModel.snapshotSendState || this.snapshotDeleteState != snapshotModel.snapshotDeleteState) {
                return false;
            }
            SnapshotPendingSnapshot snapshotPendingSnapshot = this.pendingSnapshot;
            SnapshotPendingSnapshot snapshotPendingSnapshot2 = snapshotModel.pendingSnapshot;
            if (snapshotPendingSnapshot == null) {
                if (snapshotPendingSnapshot2 != null) {
                    return false;
                }
            } else if (!snapshotPendingSnapshot.equals(snapshotPendingSnapshot2)) {
                return false;
            }
            if (this.snapshotPreviewIsExpanded != snapshotModel.snapshotPreviewIsExpanded) {
                return false;
            }
            String str3 = this.actorUserId;
            String str4 = snapshotModel.actorUserId;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            String str5 = this.notificationUuid;
            String str6 = snapshotModel.notificationUuid;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            if (this.notificationType != snapshotModel.notificationType || this.captureEntryPoint != snapshotModel.captureEntryPoint || this.captureExitPoint != snapshotModel.captureExitPoint) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((AbstractC2326GOr.A03(AnonymousClass001.A02(this.commands)) + this.snapshotViewState) * 31) + 1BL.A05(this.displayedSnapshotURI)) * 31) + this.snapshotState) * 31) + this.snapshotSaveState) * 31) + this.snapshotSendState) * 31) + this.snapshotDeleteState) * 31) + AnonymousClass001.A02(this.pendingSnapshot)) * 31) + (this.snapshotPreviewIsExpanded ? 1 : 0)) * 31) + 1BL.A05(this.actorUserId)) * 31) + 7zN.A05(this.notificationUuid)) * 31) + this.notificationType) * 31) + this.captureEntryPoint) * 31) + this.captureExitPoint;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("SnapshotModel{commands=");
        A0k.append(this.commands);
        A0k.append(",snapshotViewState=");
        A0k.append(this.snapshotViewState);
        A0k.append(",displayedSnapshotURI=");
        A0k.append(this.displayedSnapshotURI);
        A0k.append(",snapshotState=");
        A0k.append(this.snapshotState);
        A0k.append(",snapshotSaveState=");
        A0k.append(this.snapshotSaveState);
        A0k.append(",snapshotSendState=");
        A0k.append(this.snapshotSendState);
        A0k.append(",snapshotDeleteState=");
        A0k.append(this.snapshotDeleteState);
        A0k.append(",pendingSnapshot=");
        A0k.append(this.pendingSnapshot);
        A0k.append(",snapshotPreviewIsExpanded=");
        A0k.append(this.snapshotPreviewIsExpanded);
        A0k.append(",actorUserId=");
        A0k.append(this.actorUserId);
        A0k.append(",notificationUuid=");
        A0k.append(this.notificationUuid);
        A0k.append(",notificationType=");
        A0k.append(this.notificationType);
        A0k.append(",captureEntryPoint=");
        A0k.append(this.captureEntryPoint);
        A0k.append(",captureExitPoint=");
        return AbstractC2327GOs.A0W(A0k, this.captureExitPoint);
    }
}
