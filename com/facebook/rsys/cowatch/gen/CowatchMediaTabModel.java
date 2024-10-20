package com.facebook.rsys.cowatch.gen;

import X.1BL;
import X.2JQ;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: CowatchMediaTabModel.class */
public class CowatchMediaTabModel {
    public static 2JQ CONVERTER = N6e.A00(24);
    public static long sMcfTypeId;
    public final boolean hasNextPage;
    public final boolean hasPerformedFirstFetch;
    public final boolean isUpdating;
    public final String logInfo;
    public final boolean needsFetchingNextPage;
    public final String query;
    public final CowatchComponentCollectionModel secondaryComponent;
    public final int source;
    public final ArrayList tabSections;
    public final String title;

    public CowatchMediaTabModel(String str, ArrayList arrayList, CowatchComponentCollectionModel cowatchComponentCollectionModel, String str2, int i, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
        arrayList.getClass();
        str2.getClass();
        this.title = str;
        this.tabSections = arrayList;
        this.secondaryComponent = cowatchComponentCollectionModel;
        this.query = str2;
        this.source = i;
        this.logInfo = str3;
        this.hasPerformedFirstFetch = z;
        this.hasNextPage = z2;
        this.isUpdating = z3;
        this.needsFetchingNextPage = z4;
    }

    public static native CowatchMediaTabModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchMediaTabModel)) {
                return false;
            }
            CowatchMediaTabModel cowatchMediaTabModel = (CowatchMediaTabModel) obj;
            String str = this.title;
            String str2 = cowatchMediaTabModel.title;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (!this.tabSections.equals(cowatchMediaTabModel.tabSections)) {
                return false;
            }
            CowatchComponentCollectionModel cowatchComponentCollectionModel = this.secondaryComponent;
            CowatchComponentCollectionModel cowatchComponentCollectionModel2 = cowatchMediaTabModel.secondaryComponent;
            if (cowatchComponentCollectionModel == null) {
                if (cowatchComponentCollectionModel2 != null) {
                    return false;
                }
            } else if (!cowatchComponentCollectionModel.equals(cowatchComponentCollectionModel2)) {
                return false;
            }
            if (!this.query.equals(cowatchMediaTabModel.query) || this.source != cowatchMediaTabModel.source) {
                return false;
            }
            String str3 = this.logInfo;
            String str4 = cowatchMediaTabModel.logInfo;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            if (this.hasPerformedFirstFetch != cowatchMediaTabModel.hasPerformedFirstFetch || this.hasNextPage != cowatchMediaTabModel.hasNextPage || this.isUpdating != cowatchMediaTabModel.isUpdating || this.needsFetchingNextPage != cowatchMediaTabModel.needsFetchingNextPage) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A05 = (((((AnonymousClass002.A05(this.tabSections, AbstractC2326GOr.A03(1BL.A05(this.title))) + AnonymousClass001.A02(this.secondaryComponent)) * 31) + this.query.hashCode()) * 31) + this.source) * 31;
        String str = this.logInfo;
        if (str != null) {
            i = str.hashCode();
        }
        return ((((((((A05 + i) * 31) + (this.hasPerformedFirstFetch ? 1 : 0)) * 31) + (this.hasNextPage ? 1 : 0)) * 31) + (this.isUpdating ? 1 : 0)) * 31) + (this.needsFetchingNextPage ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CowatchMediaTabModel{title=");
        A0k.append(this.title);
        A0k.append(",tabSections=");
        A0k.append(this.tabSections);
        A0k.append(",secondaryComponent=");
        A0k.append(this.secondaryComponent);
        A0k.append(",query=");
        A0k.append(this.query);
        A0k.append(",source=");
        A0k.append(this.source);
        A0k.append(",logInfo=");
        A0k.append(this.logInfo);
        A0k.append(",hasPerformedFirstFetch=");
        A0k.append(this.hasPerformedFirstFetch);
        A0k.append(",hasNextPage=");
        A0k.append(this.hasNextPage);
        A0k.append(",isUpdating=");
        A0k.append(this.isUpdating);
        A0k.append(",needsFetchingNextPage=");
        return AbstractC2327GOs.A0X(A0k, this.needsFetchingNextPage);
    }
}
