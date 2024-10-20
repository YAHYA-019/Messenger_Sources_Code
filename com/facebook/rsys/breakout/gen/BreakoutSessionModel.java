package com.facebook.rsys.breakout.gen;

import X.2JQ;
import X.7zN;
import X.AbstractC2326GOr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.GOq;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: BreakoutSessionModel.class */
public class BreakoutSessionModel {
    public static 2JQ CONVERTER = IR0.A00(23);
    public static long sMcfTypeId;
    public final ArrayList childRooms;
    public final String creatorID;
    public final Long endTime;
    public final BreakoutRoomModel mainRoom;
    public final Long startTime;
    public final int status;

    public BreakoutSessionModel(int i, Long l, Long l2, ArrayList arrayList, BreakoutRoomModel breakoutRoomModel, String str) {
        arrayList.getClass();
        breakoutRoomModel.getClass();
        this.status = i;
        this.startTime = l;
        this.endTime = l2;
        this.childRooms = arrayList;
        this.mainRoom = breakoutRoomModel;
        this.creatorID = str;
    }

    public static native BreakoutSessionModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof BreakoutSessionModel)) {
                return false;
            }
            BreakoutSessionModel breakoutSessionModel = (BreakoutSessionModel) obj;
            if (this.status != breakoutSessionModel.status) {
                return false;
            }
            Long l = this.startTime;
            Long l2 = breakoutSessionModel.startTime;
            if (l == null) {
                if (l2 != null) {
                    return false;
                }
            } else if (!l.equals(l2)) {
                return false;
            }
            Long l3 = this.endTime;
            Long l4 = breakoutSessionModel.endTime;
            if (l3 == null) {
                if (l4 != null) {
                    return false;
                }
            } else if (!l3.equals(l4)) {
                return false;
            }
            if (!this.childRooms.equals(breakoutSessionModel.childRooms) || !this.mainRoom.equals(breakoutSessionModel.mainRoom)) {
                return false;
            }
            String str = this.creatorID;
            String str2 = breakoutSessionModel.creatorID;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A05(this.mainRoom, AnonymousClass002.A05(this.childRooms, (((AbstractC2326GOr.A03(this.status) + AnonymousClass001.A02(this.startTime)) * 31) + AnonymousClass001.A02(this.endTime)) * 31)) + 7zN.A05(this.creatorID);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("BreakoutSessionModel{status=");
        A0k.append(this.status);
        A0k.append(",startTime=");
        A0k.append(this.startTime);
        A0k.append(",endTime=");
        A0k.append(this.endTime);
        A0k.append(",childRooms=");
        A0k.append(this.childRooms);
        A0k.append(",mainRoom=");
        A0k.append(this.mainRoom);
        A0k.append(",creatorID=");
        return GOq.A12(this.creatorID, A0k);
    }
}
