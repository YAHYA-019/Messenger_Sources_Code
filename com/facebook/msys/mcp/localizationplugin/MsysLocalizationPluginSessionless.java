package com.facebook.msys.mcp.localizationplugin;

import X.AnonymousClass001;
import com.facebook.msys.mci.Localization;
import java.util.List;

/* loaded from: MsysLocalizationPluginSessionless.class */
public class MsysLocalizationPluginSessionless extends Sessionless {
    @Override // com.facebook.msys.mcp.localizationplugin.Sessionless
    public String MsysLocalizationImpl_MsysLocalizationCopy(String str, String str2, List list) {
        return Localization.getLocalizedString(str, str2, list == null ? new String[0] : (String[]) list.toArray(new String[list.size()]));
    }

    @Override // com.facebook.msys.mcp.localizationplugin.Sessionless
    public String MsysLocalizationImpl_MsysLocalizationCopyV2(long j, List list) {
        return Localization.getLocalizedStringV2(j, list == null ? AnonymousClass001.A1Z() : list.toArray());
    }
}
