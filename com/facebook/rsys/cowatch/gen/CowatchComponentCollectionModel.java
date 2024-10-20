package com.facebook.rsys.cowatch.gen;

import X.1BL;
import X.2JQ;
import X.7zP;
import X.AbstractC2326GOr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.GOq;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: CowatchComponentCollectionModel.class */
public class CowatchComponentCollectionModel {
    public static 2JQ CONVERTER = N6e.A00(21);
    public static long sMcfTypeId;
    public final ArrayList childrenComponentList;
    public final int componentCollectionType;
    public final String componentDescription;
    public final String componentId;
    public final String componentSubtitle;
    public final String componentTitle;
    public final boolean hasNextPage;
    public final boolean hasPerformedFirstFetch;
    public final boolean isUpdating;
    public final String logInfo;
    public final ArrayList mediaList;
    public final boolean needsFetchingNextPage;
    public final String parentComponentId;
    public final String renderingStyles;

    public CowatchComponentCollectionModel(String str, String str2, String str3, String str4, String str5, ArrayList arrayList, ArrayList arrayList2, int i, boolean z, boolean z2, boolean z3, String str6, boolean z4, String str7) {
        7zP.A1S(str, str2, arrayList);
        arrayList2.getClass();
        this.componentId = str;
        this.parentComponentId = str2;
        this.componentTitle = str3;
        this.componentSubtitle = str4;
        this.componentDescription = str5;
        this.mediaList = arrayList;
        this.childrenComponentList = arrayList2;
        this.componentCollectionType = i;
        this.hasPerformedFirstFetch = z;
        this.hasNextPage = z2;
        this.isUpdating = z3;
        this.logInfo = str6;
        this.needsFetchingNextPage = z4;
        this.renderingStyles = str7;
    }

    public static native CowatchComponentCollectionModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchComponentCollectionModel)) {
                return false;
            }
            CowatchComponentCollectionModel cowatchComponentCollectionModel = (CowatchComponentCollectionModel) obj;
            if (!this.componentId.equals(cowatchComponentCollectionModel.componentId) || !this.parentComponentId.equals(cowatchComponentCollectionModel.parentComponentId)) {
                return false;
            }
            String str = this.componentTitle;
            String str2 = cowatchComponentCollectionModel.componentTitle;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.componentSubtitle;
            String str4 = cowatchComponentCollectionModel.componentSubtitle;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            String str5 = this.componentDescription;
            String str6 = cowatchComponentCollectionModel.componentDescription;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            if (!this.mediaList.equals(cowatchComponentCollectionModel.mediaList) || !this.childrenComponentList.equals(cowatchComponentCollectionModel.childrenComponentList) || this.componentCollectionType != cowatchComponentCollectionModel.componentCollectionType || this.hasPerformedFirstFetch != cowatchComponentCollectionModel.hasPerformedFirstFetch || this.hasNextPage != cowatchComponentCollectionModel.hasNextPage || this.isUpdating != cowatchComponentCollectionModel.isUpdating) {
                return false;
            }
            String str7 = this.logInfo;
            String str8 = cowatchComponentCollectionModel.logInfo;
            if (str7 == null) {
                if (str8 != null) {
                    return false;
                }
            } else if (!str7.equals(str8)) {
                return false;
            }
            if (this.needsFetchingNextPage != cowatchComponentCollectionModel.needsFetchingNextPage) {
                return false;
            }
            String str9 = this.renderingStyles;
            String str10 = cowatchComponentCollectionModel.renderingStyles;
            if (str9 == null) {
                if (str10 != null) {
                    return false;
                }
            } else if (!str9.equals(str10)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A05 = (((((((((((AnonymousClass002.A05(this.childrenComponentList, AnonymousClass002.A05(this.mediaList, (((((((AbstractC2326GOr.A07(this.componentId) + this.parentComponentId.hashCode()) * 31) + 1BL.A05(this.componentTitle)) * 31) + 1BL.A05(this.componentSubtitle)) * 31) + 1BL.A05(this.componentDescription)) * 31)) + this.componentCollectionType) * 31) + (this.hasPerformedFirstFetch ? 1 : 0)) * 31) + (this.hasNextPage ? 1 : 0)) * 31) + (this.isUpdating ? 1 : 0)) * 31) + 1BL.A05(this.logInfo)) * 31) + (this.needsFetchingNextPage ? 1 : 0)) * 31;
        String str = this.renderingStyles;
        if (str != null) {
            i = str.hashCode();
        }
        return A05 + i;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CowatchComponentCollectionModel{componentId=");
        A0k.append(this.componentId);
        A0k.append(",parentComponentId=");
        A0k.append(this.parentComponentId);
        A0k.append(",componentTitle=");
        A0k.append(this.componentTitle);
        A0k.append(",componentSubtitle=");
        A0k.append(this.componentSubtitle);
        A0k.append(",componentDescription=");
        A0k.append(this.componentDescription);
        A0k.append(",mediaList=");
        A0k.append(this.mediaList);
        A0k.append(",childrenComponentList=");
        A0k.append(this.childrenComponentList);
        A0k.append(",componentCollectionType=");
        A0k.append(this.componentCollectionType);
        A0k.append(",hasPerformedFirstFetch=");
        A0k.append(this.hasPerformedFirstFetch);
        A0k.append(",hasNextPage=");
        A0k.append(this.hasNextPage);
        A0k.append(",isUpdating=");
        A0k.append(this.isUpdating);
        A0k.append(",logInfo=");
        A0k.append(this.logInfo);
        A0k.append(",needsFetchingNextPage=");
        A0k.append(this.needsFetchingNextPage);
        A0k.append(",renderingStyles=");
        return GOq.A12(this.renderingStyles, A0k);
    }
}
