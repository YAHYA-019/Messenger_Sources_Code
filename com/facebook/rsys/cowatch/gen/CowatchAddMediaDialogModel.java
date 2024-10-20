package com.facebook.rsys.cowatch.gen;

import X.1BK;
import X.1BL;
import X.2JQ;
import X.4YU;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: CowatchAddMediaDialogModel.class */
public class CowatchAddMediaDialogModel {
    public static 2JQ CONVERTER = IR0.A00(58);
    public static long sMcfTypeId;
    public final boolean amdLaunchedFromPromotion;
    public final int currentPageType;
    public final CowatchMediaTabModel fypTab;
    public final boolean hasEverBeenOpened;
    public final boolean isLoading;
    public final ArrayList logs;
    public final String requestedInitialTabId;
    public final CowatchMediaTabModel searchTab;
    public final long selectedTabIndex;
    public final ArrayList tabs;

    public CowatchAddMediaDialogModel(boolean z, boolean z2, String str, boolean z3, long j, CowatchMediaTabModel cowatchMediaTabModel, ArrayList arrayList, CowatchMediaTabModel cowatchMediaTabModel2, int i, ArrayList arrayList2) {
        arrayList.getClass();
        arrayList2.getClass();
        this.hasEverBeenOpened = z;
        this.isLoading = z2;
        this.requestedInitialTabId = str;
        this.amdLaunchedFromPromotion = z3;
        this.selectedTabIndex = j;
        this.searchTab = cowatchMediaTabModel;
        this.tabs = arrayList;
        this.fypTab = cowatchMediaTabModel2;
        this.currentPageType = i;
        this.logs = arrayList2;
    }

    public static native CowatchAddMediaDialogModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchAddMediaDialogModel)) {
                return false;
            }
            CowatchAddMediaDialogModel cowatchAddMediaDialogModel = (CowatchAddMediaDialogModel) obj;
            if (this.hasEverBeenOpened != cowatchAddMediaDialogModel.hasEverBeenOpened || this.isLoading != cowatchAddMediaDialogModel.isLoading) {
                return false;
            }
            String str = this.requestedInitialTabId;
            String str2 = cowatchAddMediaDialogModel.requestedInitialTabId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (this.amdLaunchedFromPromotion != cowatchAddMediaDialogModel.amdLaunchedFromPromotion || this.selectedTabIndex != cowatchAddMediaDialogModel.selectedTabIndex) {
                return false;
            }
            CowatchMediaTabModel cowatchMediaTabModel = this.searchTab;
            CowatchMediaTabModel cowatchMediaTabModel2 = cowatchAddMediaDialogModel.searchTab;
            if (cowatchMediaTabModel == null) {
                if (cowatchMediaTabModel2 != null) {
                    return false;
                }
            } else if (!cowatchMediaTabModel.equals(cowatchMediaTabModel2)) {
                return false;
            }
            if (!this.tabs.equals(cowatchAddMediaDialogModel.tabs)) {
                return false;
            }
            CowatchMediaTabModel cowatchMediaTabModel3 = this.fypTab;
            CowatchMediaTabModel cowatchMediaTabModel4 = cowatchAddMediaDialogModel.fypTab;
            if (cowatchMediaTabModel3 == null) {
                if (cowatchMediaTabModel4 != null) {
                    return false;
                }
            } else if (!cowatchMediaTabModel3.equals(cowatchMediaTabModel4)) {
                return false;
            }
            if (this.currentPageType != cowatchAddMediaDialogModel.currentPageType || !this.logs.equals(cowatchAddMediaDialogModel.logs)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.logs, (((AnonymousClass002.A05(this.tabs, (AnonymousClass002.A02(this.selectedTabIndex, (((((AbstractC2326GOr.A03(this.hasEverBeenOpened ? 1 : 0) + (this.isLoading ? 1 : 0)) * 31) + 1BL.A05(this.requestedInitialTabId)) * 31) + (this.amdLaunchedFromPromotion ? 1 : 0)) * 31) + AnonymousClass001.A02(this.searchTab)) * 31) + 4YU.A03(this.fypTab)) * 31) + this.currentPageType) * 31);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CowatchAddMediaDialogModel{hasEverBeenOpened=");
        A0k.append(this.hasEverBeenOpened);
        A0k.append(",isLoading=");
        A0k.append(this.isLoading);
        A0k.append(",requestedInitialTabId=");
        A0k.append(this.requestedInitialTabId);
        A0k.append(",amdLaunchedFromPromotion=");
        A0k.append(this.amdLaunchedFromPromotion);
        A0k.append(",selectedTabIndex=");
        A0k.append(this.selectedTabIndex);
        A0k.append(",searchTab=");
        A0k.append(this.searchTab);
        A0k.append(",tabs=");
        A0k.append(this.tabs);
        A0k.append(",fypTab=");
        A0k.append(this.fypTab);
        A0k.append(",currentPageType=");
        A0k.append(this.currentPageType);
        A0k.append(",logs=");
        return AbstractC2327GOs.A0U(this.logs, A0k);
    }
}
